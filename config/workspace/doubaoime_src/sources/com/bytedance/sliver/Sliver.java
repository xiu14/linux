package com.bytedance.sliver;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.mammon.audiosdk.SAMICoreCode;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@Keep
/* loaded from: classes2.dex */
public final class Sliver {
    private static final int SUPPORT_API_MAX = 31;
    private static final int SUPPORT_API_MIN = 19;
    private static final String TAG = "SLIVER";
    private static final boolean isArt;
    private static volatile boolean isInit = false;
    private static final f sDefaultExecutor;
    private static final g sDefaultLogger;
    private static f sExecutor;
    private static g sLogger;
    private static boolean sLoggerEnable;
    private static final Field threadPeerField;
    private static final Field threadPeerFieldDalvik;
    private static final Map<Thread, e> cache = new ConcurrentHashMap(16);
    private static final Map<String, Long> mark = new ConcurrentHashMap(16);

    public enum Mode {
        RING,
        NORMAL
    }

    static class a implements g {
        a() {
        }
    }

    static class b implements f {
        b() {
        }
    }

    static class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ e b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6090c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Thread f6091d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6092e;

        c(String str, e eVar, String str2, Thread thread, boolean z) {
            this.a = str;
            this.b = eVar;
            this.f6090c = str2;
            this.f6091d = thread;
            this.f6092e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Long l;
            Sliver.nDump(this.b.a, this.f6090c, (TextUtils.isEmpty(this.a) || (l = (Long) Sliver.mark.get(this.a)) == null) ? -1L : l.longValue());
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6091d);
            sb.append(" dump ");
            Sliver.onStep(e.a.a.a.a.J(sb, this.f6092e ? "sync" : "async", " success"));
        }
    }

    static class d implements Runnable {
        final /* synthetic */ e a;
        final /* synthetic */ Thread b;

        d(e eVar, Thread thread) {
            this.a = eVar;
            this.b = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sliver.nClear(this.a.a);
            Sliver.onStep(this.b + " clear success");
        }
    }

    private static class e {
        long a;
        boolean b;

        private e() {
        }

        e(a aVar) {
        }
    }

    public interface f {
    }

    public interface g {
    }

    public interface h {
        boolean a(Thread thread);
    }

    static {
        Field field;
        Field declaredField;
        a aVar = new a();
        sDefaultLogger = aVar;
        sLogger = aVar;
        sLoggerEnable = false;
        b bVar = new b();
        sDefaultExecutor = bVar;
        sExecutor = bVar;
        isArt = isArt();
        Field field2 = null;
        try {
            if (isArt()) {
                declaredField = Thread.class.getDeclaredField("nativePeer");
            } else {
                declaredField = Thread.class.getDeclaredField("vmThread");
                try {
                    field2 = Class.forName("java.lang.VMThread").getDeclaredField("vmData");
                    field2.setAccessible(true);
                } catch (Throwable unused) {
                    field = field2;
                    field2 = declaredField;
                }
            }
            Field field3 = declaredField;
            field = field2;
            field2 = field3;
            try {
                field2.setAccessible(true);
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            field = null;
        }
        threadPeerField = field2;
        threadPeerFieldDalvik = field;
    }

    public static boolean clear() {
        return clear(Thread.currentThread());
    }

    public static synchronized boolean clearAll() {
        boolean clearAll;
        synchronized (Sliver.class) {
            clearAll = SliverAllThreadSupport.clearAll();
        }
        return clearAll;
    }

    public static boolean dump(String str) {
        return dump(Thread.currentThread(), str);
    }

    public static synchronized boolean dumpAll(String str) {
        boolean dumpAll;
        synchronized (Sliver.class) {
            dumpAll = dumpAll(str, false);
        }
        return dumpAll;
    }

    public static void enableLog() {
        sLoggerEnable = true;
    }

    public static synchronized long[] getMethodStackTrace(Thread thread) {
        synchronized (Sliver.class) {
            if (!init(false)) {
                return new long[0];
            }
            long threadPeer = getThreadPeer(thread);
            if (threadPeer == 0) {
                return new long[0];
            }
            return nGetMethodStackTrace(thread, threadPeer);
        }
    }

    public static synchronized String getStackTrace(long[] jArr) {
        synchronized (Sliver.class) {
            if (jArr != null) {
                if (jArr.length != 0) {
                    return nGetStackTrace(jArr);
                }
            }
            return "";
        }
    }

    static long getThreadPeer(Thread thread) {
        Field field;
        Object obj;
        Object obj2;
        try {
            if (isArt()) {
                Field field2 = threadPeerField;
                if (field2 != null && (obj2 = field2.get(thread)) != null) {
                    return ((Long) obj2).longValue();
                }
                return 0L;
            }
            Field field3 = threadPeerField;
            if (field3 != null && (field = threadPeerFieldDalvik) != null && (obj = field.get(field3.get(thread))) != null) {
                return ((Integer) obj).intValue();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static synchronized boolean init(boolean z) {
        synchronized (Sliver.class) {
            int i = Build.VERSION.SDK_INT;
            if (i > 31) {
                onError("not support api : " + i + ", sliver support 19" + Constants.ACCEPT_TIME_SEPARATOR_SERVER + 31, new Throwable());
                return false;
            }
            if (isInit) {
                onStep("sliver already init");
                return true;
            }
            if (!loadLibrary()) {
                return false;
            }
            Method method = null;
            try {
                method = Looper.class.getMethod("loop", new Class[0]);
            } catch (Throwable unused) {
            }
            if (!nInit(i, method, z, isArt)) {
                onError("sliver init failed, because native init error", new Throwable());
                return false;
            }
            isInit = true;
            onStep("sliver init success, protect is " + z);
            return true;
        }
    }

    private static boolean isArt() {
        return true;
    }

    private static boolean loadLibrary() {
        try {
            System.loadLibrary("sliver");
            return true;
        } catch (Throwable th) {
            onError("sliver so load failed", th);
            return false;
        }
    }

    public static void mark(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mark.put(str, Long.valueOf(System.nanoTime()));
    }

    static int mode2Int(Mode mode) {
        return (mode != Mode.RING && mode == Mode.NORMAL) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nClear(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDump(long j, String str, long j2);

    private static native long[] nGetMethodStackTrace(Thread thread, long j);

    private static native String nGetStackTrace(Thread thread, long j);

    private static native String nGetStackTrace(long[] jArr);

    private static native boolean nInit(int i, Method method, boolean z, boolean z2);

    private static native void nPause(long j);

    private static native void nResetSamplingMs(long j, int i);

    private static native void nResume(long j);

    private static native long nStart(Thread thread, long j, int i, int i2, int i3);

    private static native void nStop(long j);

    static void onError(String str, Throwable th) {
        if (sLoggerEnable) {
            Objects.requireNonNull((a) sLogger);
            Log.e(TAG, str, th);
        }
    }

    static void onStep(String str) {
        if (sLoggerEnable) {
            Objects.requireNonNull((a) sLogger);
            Log.i(TAG, str);
        }
    }

    public static boolean pause() {
        return pause(Thread.currentThread());
    }

    public static synchronized boolean pauseAll() {
        boolean pauseAll;
        synchronized (Sliver.class) {
            pauseAll = SliverAllThreadSupport.pauseAll();
        }
        return pauseAll;
    }

    public static synchronized boolean resetSamplingMs(int i) {
        boolean resetSamplingMs;
        synchronized (Sliver.class) {
            resetSamplingMs = resetSamplingMs(Thread.currentThread(), i);
        }
        return resetSamplingMs;
    }

    public static boolean resume() {
        return resume(Thread.currentThread());
    }

    public static synchronized boolean resumeAll() {
        boolean resumeAll;
        synchronized (Sliver.class) {
            resumeAll = SliverAllThreadSupport.resumeAll();
        }
        return resumeAll;
    }

    public static void setExecutor(f fVar) {
        if (fVar != null) {
            sExecutor = fVar;
        }
    }

    public static void setLogger(g gVar) {
        if (gVar != null) {
            enableLog();
            sLogger = gVar;
        }
    }

    public static boolean start(int i) {
        return start(Thread.currentThread(), i, SAMICoreCode.SAMI_BASE, Mode.RING);
    }

    public static boolean startAll(int i, int i2) {
        return startAll(i, i2, 50000, Mode.RING, null);
    }

    public static boolean stop() {
        return stop(Thread.currentThread());
    }

    public static synchronized boolean stopAll() {
        boolean stopAll;
        synchronized (Sliver.class) {
            stopAll = SliverAllThreadSupport.stopAll();
        }
        return stopAll;
    }

    public static synchronized boolean clear(Thread thread) {
        synchronized (Sliver.class) {
            if (!isInit) {
                onError(thread + " clear failed, because sliver is not init", new Throwable());
                return false;
            }
            e eVar = cache.get(thread);
            if (eVar == null) {
                onError(thread + " clear failed, because thread is not sampling", new Throwable());
                return false;
            }
            f fVar = sExecutor;
            d dVar = new d(eVar, thread);
            Objects.requireNonNull((b) fVar);
            AsyncTask.execute(dVar);
            return true;
        }
    }

    public static boolean dump(String str, String str2) {
        return dump(Thread.currentThread(), str, str2);
    }

    public static synchronized boolean dumpAll(String str, boolean z) {
        boolean dumpAll;
        synchronized (Sliver.class) {
            dumpAll = SliverAllThreadSupport.dumpAll(str, z);
        }
        return dumpAll;
    }

    public static synchronized boolean pause(Thread thread) {
        synchronized (Sliver.class) {
            e eVar = cache.get(thread);
            if (eVar == null) {
                onError(thread + " pause failed, because thread is not sampling", new Throwable());
                return false;
            }
            if (!eVar.b) {
                onStep(thread + " already pause");
                return true;
            }
            nPause(eVar.a);
            eVar.b = false;
            onStep(thread + " pause success");
            return true;
        }
    }

    public static synchronized boolean resetSamplingMs(Thread thread, int i) {
        synchronized (Sliver.class) {
            if (!isInit) {
                onError(thread + " reset sampling ms  failed, because sliver is not init", new Throwable());
                return false;
            }
            e eVar = cache.get(thread);
            if (eVar == null) {
                onError(thread + " reset sampling ms  failed, because thread is not sampling", new Throwable());
                return false;
            }
            nResetSamplingMs(eVar.a, i);
            onStep(thread + " reset sampling ms success");
            return true;
        }
    }

    public static synchronized boolean resume(Thread thread) {
        synchronized (Sliver.class) {
            e eVar = cache.get(thread);
            if (eVar == null) {
                onError(thread + " resume failed, because thread is not sampling", new Throwable());
                return false;
            }
            if (eVar.b) {
                onStep(thread + " already resume");
                return true;
            }
            nResume(eVar.a);
            eVar.b = true;
            onStep(thread + " resume success");
            return true;
        }
    }

    public static synchronized boolean start(Thread thread, int i, int i2, Mode mode) {
        synchronized (Sliver.class) {
            if (SliverAllThreadSupport.isStart()) {
                onError("sliver start failed , because sliver all thread was started", new Throwable());
                return false;
            }
            if (!init(false)) {
                onError("sliver start failed , because sliver init failed", new Throwable());
                return false;
            }
            Map<Thread, e> map = cache;
            if (map.containsKey(thread)) {
                onStep(thread + " already sampling by sliver");
                return true;
            }
            long threadPeer = getThreadPeer(thread);
            if (threadPeer == 0) {
                onError("sliver start failed , because can't get thread peer", new Throwable());
                return false;
            }
            long nStart = nStart(thread, threadPeer, i, i2, mode2Int(mode));
            if (nStart == 0) {
                onError("sliver start failed , because can't get native peer", new Throwable());
                return false;
            }
            e eVar = new e(null);
            eVar.a = nStart;
            eVar.b = true;
            map.put(thread, eVar);
            onStep(thread + " sampling by sliver success");
            return true;
        }
    }

    public static synchronized boolean startAll(int i, int i2, int i3, Mode mode, h hVar) {
        synchronized (Sliver.class) {
            if (!cache.isEmpty()) {
                return false;
            }
            if (!init(false)) {
                return false;
            }
            return SliverAllThreadSupport.startAll(i, i2, i3, mode, hVar);
        }
    }

    public static synchronized boolean stop(Thread thread) {
        synchronized (Sliver.class) {
            if (!isInit) {
                onError(thread + " stop failed, because sliver is not init", new Throwable());
                return false;
            }
            e remove = cache.remove(thread);
            if (remove == null) {
                onError(thread + " stop failed, because thread is not sampling", new Throwable());
                return true;
            }
            nStop(remove.a);
            onStep(thread + " stop success");
            return true;
        }
    }

    public static boolean dump(Thread thread, String str) {
        return dump(thread, str, false);
    }

    public static boolean dump(Thread thread, String str, String str2) {
        return dump(thread, str, false, str2);
    }

    public static synchronized String getStackTrace(Thread thread) {
        synchronized (Sliver.class) {
            if (!init(false)) {
                return "";
            }
            long threadPeer = getThreadPeer(thread);
            if (threadPeer == 0) {
                return "";
            }
            return nGetStackTrace(thread, threadPeer);
        }
    }

    public static synchronized boolean dump(Thread thread, String str, boolean z) {
        boolean dump;
        synchronized (Sliver.class) {
            dump = dump(thread, str, z, null);
        }
        return dump;
    }

    public static synchronized boolean dump(Thread thread, String str, boolean z, String str2) {
        synchronized (Sliver.class) {
            if (!isInit) {
                onError(thread + " dump failed, because sliver is not init", new Throwable());
                return false;
            }
            e eVar = cache.get(thread);
            if (eVar == null) {
                onError(thread + " stop failed, because thread is not sampling", new Throwable());
                return false;
            }
            c cVar = new c(str2, eVar, str, thread, z);
            StringBuilder sb = new StringBuilder();
            sb.append(thread);
            sb.append(" dump ");
            sb.append(z ? "sync" : "async");
            sb.append(" start");
            onStep(sb.toString());
            if (z) {
                cVar.run();
            } else {
                Objects.requireNonNull((b) sExecutor);
                AsyncTask.execute(cVar);
            }
            return true;
        }
    }
}
