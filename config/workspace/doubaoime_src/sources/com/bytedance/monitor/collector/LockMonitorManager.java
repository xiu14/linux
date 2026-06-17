package com.bytedance.monitor.collector;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class LockMonitorManager {
    private static final int DEFAULT_SIZE = 100;
    private static final String DELIMITER = "&#&";
    private static final String KEY_IS_ALL_THREAD = "is_all_thread";
    private static final String KEY_IS_LOCK = "is_lock";
    private static final String KEY_RAW_DUMP_INFO = "raw_dump_info";
    private static final String LOCK_THREAD_NAME = "lock_handler_time";
    private static final String STACK_THREAD_NAME = "lock_stack_fetch";
    private static final String TAG = "LockMonitorManager";
    private static final int bufferSize = 100;
    private static boolean isAllThread = false;
    private static volatile String lastJavaStack = null;
    private static volatile String lastOwnerJavaStack = null;
    private static volatile boolean openFetchStack = false;
    private static int position;
    private static i[] lockInfoQueue = new i[100];
    private static final BlockingQueue<String> sStackBlockingQueue = new LinkedBlockingQueue();
    private static final BlockingQueue<String> sOwnerStackBlockingQueue = new LinkedBlockingQueue();

    @SuppressLint({"CI_NotAllowInvokeExecutorsMethods"})
    private static ExecutorService sLockHandler = Executors.newSingleThreadExecutor(new a());

    @SuppressLint({"CI_NotAllowInvokeExecutorsMethods"})
    private static ExecutorService sStackFetcher = Executors.newSingleThreadExecutor(new b());
    private static volatile boolean isLockMonitoring = false;

    static class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(LockMonitorManager.LOCK_THREAD_NAME);
            return thread;
        }
    }

    static class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            Process.setThreadPriority(-20);
            thread.setName(LockMonitorManager.STACK_THREAD_NAME);
            return thread;
        }
    }

    static class c implements j {
        final /* synthetic */ JSONObject a;

        c(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        public void a(@Nullable List<i> list) {
            if (list == null) {
                return;
            }
            if (com.bytedance.apm.g.B()) {
                StringBuilder M = e.a.a.a.a.M("dumpLockInfo size -> ");
                M.append(list.size());
                Log.d(LockMonitorManager.TAG, M.toString());
            }
            for (i iVar : list) {
                try {
                    JSONObject packJsonData = LockMonitorManager.packJsonData(iVar, this.a);
                    if (packJsonData != null) {
                        if (com.bytedance.apm.g.B()) {
                            Log.d(LockMonitorManager.TAG, "lock report LockInfo: " + iVar);
                        }
                        com.bytedance.apm.v.d.c cVar = new com.bytedance.apm.v.d.c("block_monitor", packJsonData, iVar.a);
                        cVar.g();
                        com.bytedance.apm.data.pipeline.a.k().d(cVar);
                    }
                } catch (Throwable th) {
                    StringBuilder M2 = e.a.a.a.a.M("onData: parse lock info failed: ");
                    M2.append(th.getLocalizedMessage());
                    Log.e(LockMonitorManager.TAG, M2.toString());
                }
            }
        }
    }

    static class d implements Runnable {
        final /* synthetic */ j a;

        d(j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVar = this.a;
                if (jVar != null) {
                    ((c) jVar).a(LockMonitorManager.dumpLockInfo());
                } else {
                    ((c) jVar).a(null);
                }
            } catch (Throwable unused) {
                ((c) this.a).a(null);
            }
        }
    }

    static class e implements Runnable {
        final /* synthetic */ String a;

        class a implements Runnable {
            final /* synthetic */ i a;

            a(e eVar, i iVar) {
                this.a = iVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                LockMonitorManager.enqueue(this.a);
            }
        }

        e(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                i c2 = i.c(this.a);
                if (c2 != null) {
                    com.bytedance.apm.F.b.e().h(new a(this, c2));
                }
            } catch (Throwable unused) {
            }
        }
    }

    static class f implements Runnable {
        final /* synthetic */ Thread a;

        f(Thread thread) {
            this.a = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String b = m.b(this.a.getStackTrace());
                synchronized (LockMonitorManager.sOwnerStackBlockingQueue) {
                    if (LockMonitorManager.sOwnerStackBlockingQueue.size() != 0) {
                        LockMonitorManager.sOwnerStackBlockingQueue.clear();
                    }
                    LockMonitorManager.sOwnerStackBlockingQueue.put(b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    static class g implements Runnable {
        final /* synthetic */ Thread a;

        g(Thread thread) {
            this.a = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String b = m.b(this.a.getStackTrace());
                synchronized (LockMonitorManager.sStackBlockingQueue) {
                    if (LockMonitorManager.sStackBlockingQueue.size() != 0) {
                        LockMonitorManager.sStackBlockingQueue.clear();
                    }
                    LockMonitorManager.sStackBlockingQueue.put(b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    static class h implements Runnable {
        final /* synthetic */ String a;

        h(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (LockMonitorManager.isAllThread) {
                    LockMonitorManager.getThreadStack(this.a);
                    return;
                }
                String b = m.b(Looper.getMainLooper().getThread().getStackTrace());
                synchronized (LockMonitorManager.sStackBlockingQueue) {
                    if (LockMonitorManager.sStackBlockingQueue.size() != 0) {
                        LockMonitorManager.sStackBlockingQueue.clear();
                    }
                    LockMonitorManager.sStackBlockingQueue.put(b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static class i {
        public final long a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5417c;

        /* renamed from: d, reason: collision with root package name */
        private String f5418d;

        /* renamed from: e, reason: collision with root package name */
        private String f5419e;

        /* renamed from: f, reason: collision with root package name */
        private String f5420f;

        /* renamed from: g, reason: collision with root package name */
        private String f5421g;
        private String h;
        private String i;

        private i(long j, long j2, String str, String str2) {
            this.f5418d = "unknown";
            this.a = j;
            this.b = j2;
            this.f5417c = str;
            this.i = str2;
            String substring = str.substring(str.indexOf("monitor contention with owner"));
            this.h = substring.substring(30, substring.indexOf("(") - 1);
            int indexOf = substring.indexOf(" at ");
            if (indexOf != -1) {
                String substring2 = substring.substring(indexOf + 5, substring.indexOf("waiters=", indexOf));
                String substring3 = substring2.substring(substring2.indexOf(" "));
                this.f5421g = substring3.substring(1, substring3.indexOf("(")) + substring3.substring(substring3.indexOf(")") + 1, substring3.lastIndexOf(")") + 1);
            }
            String substring4 = substring.substring(substring.indexOf("blocking from") + 14);
            String substring5 = substring4.substring(substring4.indexOf(" ") + 1);
            this.f5419e = substring5.substring(0, substring5.indexOf("(")) + substring5.substring(substring5.indexOf(")") + 1, substring5.lastIndexOf(")") + 1);
            e.b.b.m.g.a aVar = (e.b.b.m.g.a) e.b.b.m.c.a(e.b.b.m.g.a.class);
            if (aVar != null) {
                String c2 = aVar.c();
                if (TextUtils.isEmpty(c2)) {
                    return;
                }
                this.f5418d = c2;
            }
        }

        @Nullable
        @WorkerThread
        static i c(String str) {
            String str2;
            int indexOf;
            int indexOf2;
            String str3;
            String str4 = null;
            if (str == null || str.isEmpty()) {
                return null;
            }
            Log.d("lockDetect", "" + str);
            String[] split = str.split(LockMonitorManager.DELIMITER);
            if (split.length != 4) {
                Log.d("lockDetect", "spiltData != 4" + str);
                return null;
            }
            long parseLong = Long.parseLong(split[0]);
            long parseLong2 = Long.parseLong(split[1]);
            String str5 = split[2];
            i iVar = new i(parseLong, parseLong2, str5, split[3]);
            if (LockMonitorManager.openFetchStack) {
                synchronized (LockMonitorManager.sStackBlockingQueue) {
                    try {
                        str3 = (String) LockMonitorManager.sStackBlockingQueue.poll(200L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                        str3 = null;
                    }
                    if (str3 != null || LockMonitorManager.lastJavaStack == null) {
                        String unused = LockMonitorManager.lastJavaStack = str3;
                    } else {
                        str3 = LockMonitorManager.lastJavaStack;
                    }
                    if (!LockMonitorManager.sStackBlockingQueue.isEmpty()) {
                        LockMonitorManager.sStackBlockingQueue.clear();
                    }
                }
                synchronized (LockMonitorManager.sOwnerStackBlockingQueue) {
                    try {
                        str4 = (String) LockMonitorManager.sOwnerStackBlockingQueue.poll(200L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                    if (str4 != null || LockMonitorManager.lastOwnerJavaStack == null) {
                        String unused2 = LockMonitorManager.lastOwnerJavaStack = str3;
                    } else {
                        str4 = LockMonitorManager.lastOwnerJavaStack;
                    }
                    if (!LockMonitorManager.sOwnerStackBlockingQueue.isEmpty()) {
                        LockMonitorManager.sOwnerStackBlockingQueue.clear();
                    }
                }
                str2 = str4;
                str4 = str3;
            } else {
                str2 = null;
            }
            if (str4 != null) {
                if (str5.contains((TextUtils.isEmpty(str4) || (indexOf = str4.indexOf("at ") + 3) >= (indexOf2 = str4.indexOf(40))) ? "unknownMethodName" : str4.substring(indexOf, indexOf2))) {
                    iVar.f5420f = str4;
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                iVar.f5421g = str2;
            }
            return iVar;
        }

        public String d() {
            return this.f5419e;
        }

        public String e() {
            return this.i;
        }

        public String f() {
            return this.f5421g;
        }

        public String g() {
            return this.h;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("LockInfo{timestamp=");
            M.append(this.a);
            M.append(", duration=");
            M.append(this.b);
            M.append(", rawAtrace='");
            e.a.a.a.a.G0(M, this.f5417c, '\'', ", topActivityName='");
            e.a.a.a.a.G0(M, this.f5418d, '\'', ", blockStackInfo='");
            e.a.a.a.a.G0(M, this.f5419e, '\'', ", completeBlockStackInfo='");
            e.a.a.a.a.G0(M, this.f5420f, '\'', ", ownerStackInfo='");
            e.a.a.a.a.G0(M, this.f5421g, '\'', ", lockThreadName='");
            e.a.a.a.a.G0(M, this.i, '\'', ", ownerThreadName='");
            return e.a.a.a.a.H(M, this.h, '\'', '}');
        }
    }

    public interface j {
    }

    public static void dumpLockInfo(j jVar) {
        com.bytedance.apm.F.b.e().h(new d(jVar));
    }

    public static void endLockDetect(@NonNull JSONObject jSONObject) {
        if (isLockMonitoring) {
            isLockMonitoring = false;
            try {
                jSONObject.put(KEY_IS_LOCK, true);
                jSONObject.put(KEY_IS_ALL_THREAD, isAllThread);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (com.bytedance.apm.g.G()) {
                reportLockInfo(jSONObject);
                synchronized (com.bytedance.monitor.collector.j.h()) {
                    setOpenFetchStack(false);
                    if (com.bytedance.monitor.collector.j.l) {
                        try {
                            MonitorJni.disableLock();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public static void enqueue(i iVar) {
        if (iVar == null) {
            return;
        }
        i[] iVarArr = lockInfoQueue;
        int i2 = position;
        iVarArr[i2] = iVar;
        position = (i2 + 1) % 100;
    }

    private static void getOwnerStack(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int activeCount = threadGroup.activeCount();
        int i2 = (activeCount / 2) + activeCount;
        Thread[] threadArr = new Thread[i2];
        threadGroup.enumerate(threadArr);
        for (int i3 = 0; i3 < i2; i3++) {
            Thread thread = threadArr[i3];
            if (thread == null) {
                return;
            }
            if (thread != Thread.currentThread() && thread.getName().contains(str) && openFetchStack) {
                sStackFetcher.execute(new f(thread));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getThreadStack(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int activeCount = threadGroup.activeCount();
        int i2 = (activeCount / 2) + activeCount;
        Thread[] threadArr = new Thread[i2];
        threadGroup.enumerate(threadArr);
        for (int i3 = 0; i3 < i2; i3++) {
            Thread thread = threadArr[i3];
            if (thread == null) {
                return;
            }
            if (thread.getName().contains(str) && openFetchStack) {
                sStackFetcher.execute(new g(thread));
            }
        }
    }

    @Keep
    @WorkerThread
    private static void nativeGetJavaStack(String str, String str2) {
        int indexOf;
        if (openFetchStack) {
            sStackFetcher.execute(new h(str2));
            if (str == null || str.isEmpty() || (indexOf = str.indexOf("monitor contention with owner")) <= 0 || indexOf >= str.length()) {
                return;
            }
            String substring = str.substring(indexOf);
            int indexOf2 = substring.indexOf("(") - 1;
            if (indexOf2 <= 0 || 30 >= substring.length() || indexOf2 >= substring.length() || 30 >= indexOf2) {
                return;
            }
            getOwnerStack(substring.substring(30, indexOf2));
        }
    }

    @Keep
    @WorkerThread
    private static void nativePut(String str) {
        sLockHandler.execute(new e(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject packJsonData(i iVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("timestamp", iVar.a);
            jSONObject2.put("crash_time", iVar.a);
            jSONObject2.put("is_main_process", com.bytedance.apm.g.F());
            jSONObject2.put("process_name", com.bytedance.apm.g.i());
            jSONObject2.put("block_duration", iVar.b);
            jSONObject2.put(KEY_RAW_DUMP_INFO, iVar.f5417c);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(iVar.f5420f)) {
                sb.append(iVar.f5420f.replace("\t", ""));
                sb.append("\n");
            }
            sb.append("-OwnerThread: ");
            sb.append(iVar.g());
            sb.append("\n");
            sb.append("-OwnerStack: ");
            sb.append(iVar.f());
            sb.append("\n");
            sb.append("-WaiterStack: ");
            sb.append(iVar.d());
            sb.append("\n");
            sb.append("-RawAtrace: ");
            sb.append(iVar.f5417c);
            sb.append("\n");
            sb.append("-LockThread: ");
            sb.append(iVar.e());
            sb.append("\n");
            if (iVar.f5418d != null) {
                sb.append("-Activity: ");
                sb.append(iVar.f5418d);
                sb.append("\n");
            }
            JSONObject b2 = e.b.b.l.a.a.a().b();
            b2.put("block_stack_type", "stack");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b2.put(next, jSONObject.get(next));
            }
            jSONObject2.put("filters", b2);
            jSONObject2.put("stack", sb.toString());
            jSONObject2.put("event_type", "lag");
            return jSONObject2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void reportLockInfo(JSONObject jSONObject) {
        dumpLockInfo(new c(jSONObject));
    }

    public static void setOpenFetchStack(boolean z) {
        openFetchStack = z;
        if (z) {
            return;
        }
        lastJavaStack = null;
        lastOwnerJavaStack = null;
    }

    public static void startLockDetect() {
        startLockDetect(30L);
    }

    @WorkerThread
    public static List<i> dumpLockInfo() {
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < 100; i2++) {
            int i3 = (((position + 100) - i2) - 1) % 100;
            i[] iVarArr = lockInfoQueue;
            i iVar = iVarArr[i3];
            iVarArr[i3] = null;
            if (iVar != null) {
                linkedList.add(iVar);
            }
        }
        return linkedList;
    }

    public static void startLockDetect(long j2) {
        if (isLockMonitoring) {
            return;
        }
        isLockMonitoring = true;
        if (com.bytedance.apm.g.G()) {
            com.bytedance.monitor.collector.j.h().s(j2, false);
        }
    }

    public static void startLockDetect(long j2, boolean z) {
        if (isLockMonitoring) {
            return;
        }
        isLockMonitoring = true;
        isAllThread = z;
        if (com.bytedance.apm.g.G()) {
            com.bytedance.monitor.collector.j.h().s(j2, z);
        }
    }

    public static String dumpLockInfo(long j2, long j3) {
        i[] iVarArr = new i[100];
        System.arraycopy(lockInfoQueue, 0, iVarArr, 0, 100);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 100; i2++) {
            i iVar = iVarArr[((position + i2) + 1) % 100];
            if (iVar != null) {
                long j4 = iVar.a;
                if (j4 < j3 || j4 + iVar.b > j2) {
                    arrayList.add(iVar);
                }
                if (iVar.a + iVar.b < j2) {
                    break;
                }
            }
        }
        return arrayList.toString();
    }
}
