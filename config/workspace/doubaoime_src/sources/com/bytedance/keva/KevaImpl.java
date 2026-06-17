package com.bytedance.keva;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.util.Log;
import com.bytedance.keva.Keva;
import e.a.a.a.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class KevaImpl extends Keva implements Keva.ClearMemory {
    static final Executor sExecutor;
    static final KevaMonitor sMonitor;
    private static final ConcurrentHashMap<String, HashMap<String, Keva>> sPathRepoMap;
    private static final String sPortedSpRepoName;
    private static final HashMap<String, Keva> sRepoMap;
    private static final File sSharedPrefsDir;
    volatile long mHandle;
    private final boolean mIsMultiProcess;
    private final int mMode;
    private final String mName;
    private String mSpecifiedPath;
    volatile HashMap<String, KevaValueWrapper> mValueMap = new HashMap<>();
    private final List<Keva.OnChangeListener> mChangeListeners = new ArrayList();
    private List<KevaValueWrapper> mDuplicatedOldWrappers = new ArrayList();
    protected int mBigValueAccessIndex = 0;
    private int mLastClearAccessIndex = -1;

    static class KevaValueWrapper {
        int accessIndex;
        volatile boolean loaded;
        volatile long offset;
        volatile int type;
        volatile Object value;

        KevaValueWrapper() {
        }
    }

    private static class PortedSpRepoHolder {
        private static final KevaImpl sInstance;
        private static final Map<String, ?> sPortedSpMap;

        static {
            KevaMultiProcessImpl kevaMultiProcessImpl = new KevaMultiProcessImpl(KevaImpl.sPortedSpRepoName, null, 1);
            sInstance = kevaMultiProcessImpl;
            kevaMultiProcessImpl.init(true);
            sPortedSpMap = kevaMultiProcessImpl.buildNewMap(new HashMap());
        }

        private PortedSpRepoHolder() {
        }
    }

    protected interface PrivateConstants {
        public static final int BLOCK_TYPE_BYTES = 0;
        public static final int BLOCK_TYPE_OBJECT = 4;
        public static final int BLOCK_TYPE_STRING_ARRAY = 3;
        public static final int BLOCK_TYPE_STRING_UTF16 = 2;
        public static final int BLOCK_TYPE_STRING_UTF8 = 1;
        public static final String EMPTY_STRING = "";
        public static final int EXT_TYPE_BYTES = 7;
        public static final int EXT_TYPE_OBJECT = 71;
        public static final int EXT_TYPE_STRING_ARRAY = 55;
        public static final int EXT_TYPE_STRING_UTF16 = 39;
        public static final int EXT_TYPE_STRING_UTF8 = 23;
        public static final String FILES_DIR_NAME = "files";
        public static final String KEVA = "keva";
        public static final String LIB_NAME = "keva";
        public static final String PORTED_SP = "keva_porting_sp";
        public static final int REPORT_VALUE_SIZE_THRESHOLD = 10000;
        public static final String SP_DIR_NAME = "shared_prefs";
        public static final int TYPE_BOOL = 2;
        public static final int TYPE_BYTES = 7;
        public static final int TYPE_DOUBLE = 5;
        public static final int TYPE_FLOAT = 4;
        public static final int TYPE_INT = 1;
        public static final int TYPE_INVALID = 0;
        public static final int TYPE_LONG = 3;
        public static final int TYPE_STRING = 6;
    }

    static {
        KevaBuilder kevaBuilder = KevaBuilder.getInstance();
        KevaBuilder.clearInstance();
        sRepoMap = new HashMap<>();
        sPathRepoMap = new ConcurrentHashMap<>();
        Executor executor = kevaBuilder.mExecutor;
        if (executor != null) {
            sExecutor = executor;
        } else {
            int max = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            sExecutor = threadPoolExecutor;
        }
        String str = kevaBuilder.mPortedRepoName;
        if (str == null) {
            str = PrivateConstants.PORTED_SP;
        }
        sPortedSpRepoName = str;
        Context context = kevaBuilder.mContext;
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(context.getApplicationInfo().dataDir, PrivateConstants.FILES_DIR_NAME);
        }
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        File file = kevaBuilder.mWorkDir;
        if (file == null) {
            file = new File(filesDir, "keva");
        }
        sSharedPrefsDir = new File(filesDir.getParent(), PrivateConstants.SP_DIR_NAME);
        KevaMonitor kevaMonitor = kevaBuilder.mMonitor;
        if (kevaMonitor == null) {
            kevaMonitor = new KevaMonitor();
        }
        sMonitor = kevaMonitor;
        kevaMonitor.logDebug("Keva version: 1.6.11.SHARED.CXXAPI");
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder M = a.M("fail to create work dir ");
            M.append(file.getPath());
            kevaMonitor.reportThrowable(1, null, null, null, new IllegalStateException(M.toString()));
        }
        try {
            kevaMonitor.loadLibrary("keva");
            initialize(file.getAbsolutePath());
        } catch (Throwable th) {
            th.printStackTrace();
            KevaMonitor kevaMonitor2 = sMonitor;
            kevaMonitor2.logDebug("fail to load so and init");
            kevaMonitor2.reportThrowable(1, null, null, null, th);
        }
    }

    KevaImpl(String str, String str2, int i) {
        this.mName = str;
        this.mMode = i;
        this.mSpecifiedPath = str2;
        this.mIsMultiProcess = (i & 1) != 0;
    }

    private void addMapObjectWhenLoading(String str, Object obj, long j, int i) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.value = obj;
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        if (!this.mIsMultiProcess) {
            kevaValueWrapper.loaded = true;
        }
        KevaValueWrapper put = this.mValueMap.put(str, kevaValueWrapper);
        if (put == null || (list = this.mDuplicatedOldWrappers) == null) {
            return;
        }
        list.add(put);
    }

    static native void checkReportException(long j);

    private void cleanUpAfterLoadRepo() {
        if (this.mHandle == 0) {
            KevaMonitor kevaMonitor = sMonitor;
            String str = this.mName;
            StringBuilder M = a.M("free space is ");
            M.append(Environment.getDataDirectory().getFreeSpace());
            kevaMonitor.reportWarning(1, str, null, null, M.toString());
            return;
        }
        try {
            Iterator<KevaValueWrapper> it2 = this.mDuplicatedOldWrappers.iterator();
            while (it2.hasNext()) {
                eraseUnusedChunk(this.mHandle, it2.next().offset);
            }
            this.mDuplicatedOldWrappers = null;
            checkReportException(this.mHandle);
        } catch (Throwable th) {
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    private static native void clear(long j);

    public static void clearOnLowMemory(int i) {
        ArrayList arrayList = new ArrayList();
        HashMap<String, Keva> hashMap = sRepoMap;
        synchronized (hashMap) {
            arrayList.addAll(hashMap.values());
        }
        for (HashMap<String, Keva> hashMap2 : sPathRepoMap.values()) {
            synchronized (hashMap2) {
                arrayList.addAll(hashMap2.values());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object obj = (Keva) it2.next();
            if (obj instanceof Keva.ClearMemory) {
                ((Keva.ClearMemory) obj).clearMemory(i);
            }
        }
    }

    private static native boolean delete(String str);

    private void doLoadRepo(boolean z) {
        try {
            String str = this.mSpecifiedPath;
            if (str == null) {
                this.mHandle = loadRepo(this.mName, this.mMode, z);
            } else {
                this.mHandle = loadRepoWithPath(this.mName, str, this.mMode);
            }
            cleanUpAfterLoadRepo();
            if (z) {
                return;
            }
            sMonitor.onLoadRepo(this.mName, this.mMode);
        } catch (Throwable th) {
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doPortingFromSp(Context context) {
        synchronized (this) {
            if (this.mHandle != 0) {
                return;
            }
            boolean z = this instanceof KevaMultiProcessImpl;
            int i = -1;
            if (z) {
                i = protectPortingInterProcess(this.mName, true, -1);
                if (isRepoPorted(this.mName)) {
                    doLoadRepo(false);
                    protectPortingInterProcess(this.mName, false, i);
                    return;
                }
            }
            int i2 = i;
            boolean z2 = !z && delete(this.mName);
            KevaMonitor kevaMonitor = sMonitor;
            kevaMonitor.logDebug("poring load empty repo >> " + this.mName);
            doLoadRepo(false);
            if (this.mHandle == 0) {
                return;
            }
            if (!z2) {
                clear();
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(this.mName, 0);
            kevaMonitor.logDebug("poring get sp >> " + this.mName);
            Map<String, ?> all = sharedPreferences.getAll();
            kevaMonitor.logDebug("poring get all value >> " + this.mName);
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if ("".equals(key)) {
                        key = null;
                    }
                    String str = key;
                    KevaMonitor kevaMonitor2 = sMonitor;
                    kevaMonitor2.logDebug("poring process key: " + str + ", value: " + value + " >> " + this.mName);
                    KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
                    this.mValueMap.put(str, kevaValueWrapper);
                    try {
                        if (value instanceof Boolean) {
                            kevaValueWrapper.offset = storeBoolean(this.mHandle, str, kevaValueWrapper.offset, ((Boolean) value).booleanValue());
                            kevaValueWrapper.value = value;
                        } else if (value instanceof Integer) {
                            kevaValueWrapper.offset = storeInt(this.mHandle, str, kevaValueWrapper.offset, ((Integer) value).intValue());
                            kevaValueWrapper.value = value;
                        } else if (value instanceof Long) {
                            kevaValueWrapper.offset = storeLong(this.mHandle, str, kevaValueWrapper.offset, ((Long) value).longValue());
                            kevaValueWrapper.value = value;
                        } else if (value instanceof Float) {
                            kevaValueWrapper.offset = storeFloat(this.mHandle, str, kevaValueWrapper.offset, ((Float) value).floatValue());
                            kevaValueWrapper.value = value;
                        } else if (value instanceof String) {
                            kevaValueWrapper.offset = storeString(this.mHandle, str, kevaValueWrapper.offset, (String) value);
                            kevaValueWrapper.value = value;
                        } else if (value instanceof Set) {
                            Set set = (Set) value;
                            String[] strArr = new String[set.size()];
                            set.toArray(strArr);
                            kevaValueWrapper.offset = storeStringArray(this.mHandle, str, kevaValueWrapper.offset, strArr, 3);
                            kevaValueWrapper.value = strArr;
                        } else {
                            kevaMonitor2.reportThrowable(1, this.mName, str, value, new IllegalStateException("do not support type: " + value.getClass()));
                        }
                        if (!this.mIsMultiProcess) {
                            kevaValueWrapper.loaded = true;
                        }
                    } catch (Throwable th) {
                        sMonitor.reportThrowable(3, this.mName, str, value, th);
                    }
                }
            }
            getPortedSpRepo().storeBoolean(this.mName, true);
            if (z) {
                protectPortingInterProcess(this.mName, false, i2);
            }
            KevaMonitor kevaMonitor3 = sMonitor;
            StringBuilder M = a.M("poring set ported repo >> ");
            M.append(this.mName);
            kevaMonitor3.logDebug(M.toString());
        }
    }

    private native void dump(long j);

    private native void erase(long j, String str, long j2);

    private native void eraseUnusedChunk(long j, long j2);

    private static boolean existSharedPrefs(String str) {
        return new File(sSharedPrefsDir, a.s(str, ".xml")).exists();
    }

    private Set<String> fetchStringSet(String str, Set<String> set, boolean z) {
        String[] fetchStringArray = fetchStringArray(str, set != null ? (String[]) set.toArray(new String[0]) : null, z);
        if (fetchStringArray != null) {
            return new HashSet(Arrays.asList(fetchStringArray));
        }
        return null;
    }

    static void forceInitImpl() {
        Log.println(4, KevaConstants.TAG, "force initializing Keva");
    }

    static KevaImpl getEmptyRepoImpl(String str, String str2, int i) {
        if (i < 0 || i >= 2) {
            sMonitor.reportThrowable(1, str, null, null, new IllegalArgumentException(a.j("mode is not valid: ", i)));
        }
        return (i & 1) == 0 ? new KevaPrivateImpl(str, str2, i) : new KevaMultiProcessImpl(str, str2, i);
    }

    private static Keva getPortedSpRepo() {
        return PortedSpRepoHolder.sInstance;
    }

    public static Keva getRepo(String str, int i) {
        return getRepoImpl(str, null, i, false);
    }

    public static Keva getRepoFromSp(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, false);
    }

    private static Keva getRepoFromSpImpl(final Context context, final String str, final int i, boolean z) {
        Keva keva;
        if (isRepoPorted(str)) {
            return getRepo(str, i);
        }
        boolean z2 = true;
        if (!existSharedPrefs(str)) {
            getPortedSpRepo().storeBoolean(str, true);
            return getRepo(str, i);
        }
        sMonitor.logDebug(a.s("do poring from sp: ", str));
        HashMap<String, Keva> hashMap = sRepoMap;
        synchronized (hashMap) {
            keva = hashMap.get(str);
            if (keva != null) {
                z2 = false;
            }
            if (z2) {
                keva = z ? getEmptyRepoImpl(str, null, i) : new KevaFuture(str, i, new Callable<KevaImpl>() { // from class: com.bytedance.keva.KevaImpl.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public KevaImpl call() {
                        KevaImpl emptyRepoImpl = KevaImpl.getEmptyRepoImpl(str, null, i);
                        emptyRepoImpl.doPortingFromSp(context);
                        return emptyRepoImpl;
                    }
                });
                hashMap.put(str, keva);
            }
        }
        if (z2) {
            if (keva instanceof KevaImpl) {
                try {
                    ((KevaImpl) keva).doPortingFromSp(context);
                } catch (UnsatisfiedLinkError e2) {
                    sMonitor.reportThrowable(1, str, null, null, e2);
                }
            }
        } else if (keva instanceof KevaImpl) {
            ((KevaImpl) keva).checkMode(i);
        } else {
            ((KevaFuture) keva).checkMode(i);
        }
        return keva;
    }

    public static Keva getRepoFromSpSync(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, true);
    }

    private static Keva getRepoImpl(final String str, final String str2, final int i, boolean z) {
        HashMap<String, Keva> hashMap;
        Keva keva;
        boolean z2;
        if (str2 == null) {
            hashMap = sRepoMap;
        } else {
            ConcurrentHashMap<String, HashMap<String, Keva>> concurrentHashMap = sPathRepoMap;
            concurrentHashMap.putIfAbsent(str2, new HashMap<>());
            hashMap = concurrentHashMap.get(str2);
        }
        synchronized (hashMap) {
            keva = hashMap.get(str);
            z2 = keva == null;
            if (z2) {
                keva = z ? getEmptyRepoImpl(str, str2, i) : new KevaFuture(str, i, new Callable<KevaImpl>() { // from class: com.bytedance.keva.KevaImpl.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public KevaImpl call() {
                        KevaImpl emptyRepoImpl = KevaImpl.getEmptyRepoImpl(str, str2, i);
                        emptyRepoImpl.init(false);
                        return emptyRepoImpl;
                    }
                });
                hashMap.put(str, keva);
            }
        }
        if (z2) {
            if (!(keva instanceof KevaFuture)) {
                ((KevaImpl) keva).init(false);
            }
        } else if (keva instanceof KevaFuture) {
            ((KevaFuture) keva).checkMode(i);
        } else {
            ((KevaImpl) keva).checkMode(i);
        }
        return keva;
    }

    public static Keva getRepoSync(String str, int i) {
        return getRepoImpl(str, null, i, true);
    }

    public static Keva getRepoSyncWithPath(String str, String str2, int i) {
        if (str2 == null || "".equals(str2) || str2.startsWith("/") || !str2.endsWith("/")) {
            throw new IllegalArgumentException(a.s("path is wrong: ", str2));
        }
        return getRepoImpl(str, str2, i, true);
    }

    private static native void initialize(String str);

    public static boolean isRepoPorted(String str) {
        if (PortedSpRepoHolder.sPortedSpMap.get(str) != null) {
            return true;
        }
        return getPortedSpRepo().getBoolean(str, false);
    }

    private native long loadRepo(String str, int i, boolean z);

    private native long loadRepoWithPath(String str, String str2, int i);

    private void notifyChangeListeners(Keva keva, String str) {
        if (this.mChangeListeners.size() == 0) {
            return;
        }
        Iterator<Keva.OnChangeListener> it2 = this.mChangeListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onChanged(keva, str);
        }
    }

    private KevaValueWrapper obtainWrapperLocked(String str) {
        KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        if (kevaValueWrapper != null) {
            return kevaValueWrapper;
        }
        KevaValueWrapper kevaValueWrapper2 = new KevaValueWrapper();
        this.mValueMap.put(str, kevaValueWrapper2);
        return kevaValueWrapper2;
    }

    static void passWarning(int i, String str, String str2, Object obj, String str3) {
        sMonitor.reportWarning(i, str, str2, obj, str3);
    }

    private native int protectPortingInterProcess(String str, boolean z, int i);

    private void reportBigValue(final String str, final Object obj, final int i) {
        if (i > 10000) {
            sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str2 = KevaImpl.this.mName;
                    String str3 = str;
                    Object obj2 = obj;
                    StringBuilder M = a.M("value too big, size=");
                    M.append(i);
                    kevaMonitor.reportWarning(3, str2, str3, obj2, M.toString());
                }
            });
        }
    }

    private native long storeBoolean(long j, String str, long j2, boolean z);

    private native long storeBytes(long j, String str, long j2, byte[] bArr, int i);

    private void storeBytes(final String str, byte[] bArr, int i, boolean z) {
        final int length;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            try {
                obtainWrapperLocked.offset = storeBytes(this.mHandle, str, obtainWrapperLocked.offset, bArr, i);
                obtainWrapperLocked.type = (i << 4) | 7;
                if (z) {
                    obtainWrapperLocked.value = null;
                    obtainWrapperLocked.loaded = false;
                } else {
                    obtainWrapperLocked.value = bArr;
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                }
                notifyChangeListeners(this, str);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str, bArr, th);
            }
        }
        if (bArr == null || (length = bArr.length) <= 10000) {
            return;
        }
        sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.5
            @Override // java.lang.Runnable
            public void run() {
                KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                String str2 = KevaImpl.this.mName;
                String str3 = str;
                StringBuilder M = a.M("value too big, size=");
                M.append(length);
                kevaMonitor.reportWarning(3, str2, str3, null, M.toString());
            }
        });
    }

    private native long storeDouble(long j, String str, long j2, double d2);

    private native long storeFloat(long j, String str, long j2, float f2);

    private native long storeInt(long j, String str, long j2, int i);

    private native long storeLong(long j, String str, long j2, long j3);

    private native long storeString(long j, String str, long j2, String str2);

    private void storeString(final String str, final String str2, boolean z) {
        final int length;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(str2)) {
                try {
                    obtainWrapperLocked.offset = storeString(this.mHandle, str, obtainWrapperLocked.offset, str2);
                    obtainWrapperLocked.type = 6;
                    if (z) {
                        obtainWrapperLocked.value = null;
                        obtainWrapperLocked.loaded = false;
                    } else {
                        obtainWrapperLocked.value = str2;
                        if (!this.mIsMultiProcess) {
                            obtainWrapperLocked.loaded = true;
                        }
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, str2, th);
                }
                if (str2 == null || (length = str2.length()) <= 10000) {
                    return;
                }
                sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.4
                    @Override // java.lang.Runnable
                    public void run() {
                        KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                        String str3 = KevaImpl.this.mName;
                        String str4 = str;
                        String str5 = str2;
                        StringBuilder M = a.M("value too big, size=");
                        M.append(length);
                        kevaMonitor.reportWarning(3, str3, str4, str5, M.toString());
                    }
                });
            }
        }
    }

    private native long storeStringArray(long j, String str, long j2, String[] strArr, int i);

    private void storeStringArray(final String str, String[] strArr, boolean z) {
        final String arrays;
        final int length;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            try {
                obtainWrapperLocked.offset = storeStringArray(this.mHandle, str, obtainWrapperLocked.offset, strArr, 3);
                obtainWrapperLocked.type = 55;
                if (z) {
                    obtainWrapperLocked.value = null;
                    obtainWrapperLocked.loaded = false;
                } else {
                    obtainWrapperLocked.value = strArr;
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                }
                notifyChangeListeners(this, str);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str, null, th);
            }
        }
        if (strArr == null || (length = (arrays = Arrays.toString(strArr)).length()) <= 10000) {
            return;
        }
        sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.6
            @Override // java.lang.Runnable
            public void run() {
                KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                String str2 = KevaImpl.this.mName;
                String str3 = str;
                String str4 = arrays;
                StringBuilder M = a.M("value too big, size=");
                M.append(length);
                kevaMonitor.reportWarning(3, str2, str3, str4, M.toString());
            }
        });
    }

    private void storeStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = new String[set.size()];
            set.toArray(strArr);
        } else {
            strArr = null;
        }
        storeStringArray(str, strArr, z);
    }

    void addMapBoolWhenLoading(String str, boolean z, long j) {
        addMapObjectWhenLoading(str, Boolean.valueOf(z), j, 2);
    }

    void addMapDoubleWhenLoading(String str, double d2, long j) {
        addMapObjectWhenLoading(str, Double.valueOf(d2), j, 5);
    }

    void addMapFloatWhenLoading(String str, float f2, long j) {
        addMapObjectWhenLoading(str, Float.valueOf(f2), j, 4);
    }

    void addMapIntWhenLoading(String str, int i, long j) {
        addMapObjectWhenLoading(str, Integer.valueOf(i), j, 1);
    }

    void addMapLongWhenLoading(String str, long j, long j2) {
        addMapObjectWhenLoading(str, Long.valueOf(j), j2, 3);
    }

    void addMapOffsetWhenLoading(String str, long j, int i) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        KevaValueWrapper put = this.mValueMap.put(str, kevaValueWrapper);
        if (put == null || (list = this.mDuplicatedOldWrappers) == null) {
            return;
        }
        list.add(put);
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        HashMap hashMap;
        if (map == KevaConstants.FLAG_CURRENT_KEY_MAP) {
            synchronized (this) {
                hashMap = (HashMap) this.mValueMap.clone();
            }
            return hashMap;
        }
        synchronized (this) {
            for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
                KevaValueWrapper value = entry.getValue();
                if (value.offset != 0) {
                    String key = entry.getKey();
                    try {
                        if (!value.loaded) {
                            int i = value.type;
                            if (i == 6) {
                                value.value = fetchString(this.mHandle, key, value.offset, null);
                            } else if (i == 7) {
                                value.value = fetchBytes(this.mHandle, key, value.offset, null, 0);
                            } else {
                                if (i == 23 || i == 39) {
                                    throw new UnsupportedOperationException("keva has not implemented type " + value.type);
                                }
                                if (i == 55) {
                                    value.value = fetchStringArray(this.mHandle, key, value.offset, null, 3);
                                } else if (!this.mIsMultiProcess || value.type > 5) {
                                    throw new UnsupportedOperationException("keva has not implemented type " + value.type);
                                }
                            }
                            if (!this.mIsMultiProcess) {
                                value.loaded = true;
                            }
                        }
                        if (!this.mIsMultiProcess && (value.type == 6 || (value.type & 7) != 0)) {
                            int i2 = this.mBigValueAccessIndex + 1;
                            this.mBigValueAccessIndex = i2;
                            value.accessIndex = i2;
                        }
                        map.put(key, value.value);
                    } catch (Throwable th) {
                        sMonitor.reportThrowable(2, this.mName, key, Long.valueOf(value.offset), th);
                    }
                }
            }
        }
        return map;
    }

    void checkMode(int i) {
        if (this.mHandle == 0 || this.mMode == i) {
            return;
        }
        KevaMonitor kevaMonitor = sMonitor;
        String str = this.mName;
        StringBuilder M = a.M("mode is different: ");
        M.append(this.mMode);
        M.append(" != ");
        M.append(i);
        kevaMonitor.reportThrowable(1, str, null, null, new IllegalStateException(M.toString()));
    }

    @Override // com.bytedance.keva.Keva
    public void clear() {
        synchronized (this) {
            try {
                this.mValueMap.clear();
                clear(this.mHandle);
            } finally {
            }
        }
    }

    @Override // com.bytedance.keva.Keva.ClearMemory
    public void clearMemory(int i) {
        if (this.mIsMultiProcess) {
            return;
        }
        synchronized (this) {
            int i2 = i == 0 ? Integer.MAX_VALUE : this.mLastClearAccessIndex;
            for (KevaValueWrapper kevaValueWrapper : this.mValueMap.values()) {
                if (kevaValueWrapper != null && kevaValueWrapper.loaded && kevaValueWrapper.accessIndex <= i2 && (kevaValueWrapper.type == 6 || (kevaValueWrapper.type & 7) == 7)) {
                    kevaValueWrapper.value = null;
                    kevaValueWrapper.loaded = false;
                }
            }
            this.mLastClearAccessIndex = this.mBigValueAccessIndex;
        }
    }

    native boolean contains(long j, String str, long j2);

    @Override // com.bytedance.keva.Keva
    public void dump() {
        synchronized (this) {
            sMonitor.logDebug("start dumping keva " + this.mName + ", size=" + this.mValueMap.size());
            for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
                KevaValueWrapper value = entry.getValue();
                String key = entry.getKey();
                sMonitor.logDebug("key: " + key + ", value: " + value.value + ", offset: " + value.offset + ", loaded: " + value.loaded);
            }
            sMonitor.logDebug("finish dumping keva " + this.mName + ", size=" + this.mValueMap.size());
        }
    }

    public void dumpNative() {
        synchronized (this) {
            dump(this.mHandle);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void erase(String str) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
                erase(this.mHandle, str, obtainWrapperLocked.offset);
                obtainWrapperLocked.value = null;
                obtainWrapperLocked.offset = 0L;
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
            } finally {
            }
        }
    }

    native boolean fetchBoolean(long j, String str, long j2, boolean z);

    protected abstract boolean fetchBoolean(String str, boolean z);

    native byte[] fetchBytes(long j, String str, long j2, byte[] bArr, int i);

    protected abstract byte[] fetchBytes(String str, byte[] bArr, int i, boolean z);

    native double fetchDouble(long j, String str, long j2, double d2);

    protected abstract double fetchDouble(String str, double d2);

    native float fetchFloat(long j, String str, long j2, float f2);

    protected abstract float fetchFloat(String str, float f2);

    native int fetchInt(long j, String str, long j2, int i);

    protected abstract int fetchInt(String str, int i);

    native long fetchLong(long j, String str, long j2, long j3);

    protected abstract long fetchLong(String str, long j);

    native String fetchString(long j, String str, long j2, String str2);

    protected abstract String fetchString(String str, String str2, boolean z);

    native String[] fetchStringArray(long j, String str, long j2, String[] strArr, int i);

    protected abstract String[] fetchStringArray(String str, String[] strArr, boolean z);

    @Override // com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        boolean fetchBoolean;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchBoolean = fetchBoolean(str2, z);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, null, th);
                    return z;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchBoolean;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        byte[] fetchBytes;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchBytes = fetchBytes(str2, bArr, 0, false);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, bArr, th);
                    return bArr;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        byte[] fetchBytes;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchBytes = fetchBytes(str2, bArr, 0, true);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, bArr, th);
                    return bArr;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public double getDouble(String str, double d2) {
        double fetchDouble;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchDouble = fetchDouble(str2, d2);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, Double.valueOf(d2), th);
                    return d2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchDouble;
    }

    @Override // com.bytedance.keva.Keva
    public float getFloat(String str, float f2) {
        float fetchFloat;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchFloat = fetchFloat(str2, f2);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, Float.valueOf(f2), th);
                    return f2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchFloat;
    }

    @Override // com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        int fetchInt;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchInt = fetchInt(str2, i);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, Integer.valueOf(i), th);
                    return i;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchInt;
    }

    @Override // com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        long fetchLong;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchLong = fetchLong(str2, j);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, Long.valueOf(j), th);
                    return j;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchLong;
    }

    @Override // com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        String fetchString;
        if ("".equals(str)) {
            str = null;
        }
        String str3 = str;
        synchronized (this) {
            try {
                try {
                    fetchString = fetchString(str3, str2, false);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str3, str2, th);
                    return str2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchString;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        String[] fetchStringArray;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchStringArray = fetchStringArray(str2, strArr, false);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, strArr, th);
                    return strArr;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        String[] fetchStringArray;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchStringArray = fetchStringArray(str2, strArr, true);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, strArr, th);
                    return strArr;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        String fetchString;
        if ("".equals(str)) {
            str = null;
        }
        String str3 = str;
        synchronized (this) {
            try {
                try {
                    fetchString = fetchString(str3, str2, true);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str3, str2, th);
                    return str2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchString;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> fetchStringSet;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchStringSet = fetchStringSet(str2, set, false);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, set, th);
                    return set;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchStringSet;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        Set<String> fetchStringSet;
        if ("".equals(str)) {
            str = null;
        }
        String str2 = str;
        synchronized (this) {
            try {
                try {
                    fetchStringSet = fetchStringSet(str2, set, true);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, str2, set, th);
                    return set;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fetchStringSet;
    }

    void init(boolean z) {
        synchronized (this) {
            if (this.mHandle != 0) {
                return;
            }
            doLoadRepo(z);
        }
    }

    @Override // com.bytedance.keva.Keva
    public String name() {
        return this.mName;
    }

    native void rebuildValueMap(long j);

    @Override // com.bytedance.keva.Keva
    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            if (!this.mChangeListeners.contains(onChangeListener)) {
                this.mChangeListeners.add(onChangeListener);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Boolean.valueOf(z))) {
                try {
                    obtainWrapperLocked.offset = storeBoolean(this.mHandle, str, obtainWrapperLocked.offset, z);
                    obtainWrapperLocked.value = Boolean.valueOf(z);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Boolean.valueOf(z), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeDouble(String str, double d2) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Double.valueOf(d2))) {
                try {
                    obtainWrapperLocked.offset = storeDouble(this.mHandle, str, obtainWrapperLocked.offset, d2);
                    obtainWrapperLocked.value = Double.valueOf(d2);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Double.valueOf(d2), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeFloat(String str, float f2) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Float.valueOf(f2))) {
                try {
                    obtainWrapperLocked.offset = storeFloat(this.mHandle, str, obtainWrapperLocked.offset, f2);
                    obtainWrapperLocked.value = Float.valueOf(f2);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Float.valueOf(f2), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Integer.valueOf(i))) {
                try {
                    obtainWrapperLocked.offset = storeInt(this.mHandle, str, obtainWrapperLocked.offset, i);
                    obtainWrapperLocked.value = Integer.valueOf(i);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Integer.valueOf(i), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Long.valueOf(j))) {
                try {
                    obtainWrapperLocked.offset = storeLong(this.mHandle, str, obtainWrapperLocked.offset, j);
                    obtainWrapperLocked.value = Long.valueOf(j);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Long.valueOf(j), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        storeStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        storeString(str, str2, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        storeStringSet(str, set, true);
    }

    @Override // com.bytedance.keva.Keva
    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            this.mChangeListeners.remove(onChangeListener);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        storeStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        storeStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        storeString(str, str2, false);
    }
}
