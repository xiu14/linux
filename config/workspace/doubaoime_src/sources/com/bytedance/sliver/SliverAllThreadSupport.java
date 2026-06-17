package com.bytedance.sliver;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.Keep;
import com.bytedance.sliver.Sliver;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
final class SliverAllThreadSupport {
    static final int SLIVER_GROUP_CACHE_SIZE = 50000;
    private static final int SUPPORT_API_MAX = 31;
    private static final int SUPPORT_API_MIN = 21;
    private static final List<b> threadGroups = new LinkedList();
    private static final Thread mainThread = Looper.getMainLooper().getThread();
    private static volatile boolean isStart = false;
    private static volatile boolean isRunning = false;
    private static int samplingRateMs = 10;
    private static Sliver.h filter = null;
    private static Handler threadHandler = null;
    private static ThreadGroup systemThreadGroup = null;

    static class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SliverAllThreadSupport.dumpHeader(this.a)) {
                Iterator it2 = SliverAllThreadSupport.threadGroups.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).d(this.a);
                }
                Iterator it3 = SliverAllThreadSupport.threadGroups.iterator();
                while (it3.hasNext()) {
                    ((b) it3.next()).c(this.a);
                }
            }
        }
    }

    private static class b {
        private final int a;
        private final int b;

        /* renamed from: e, reason: collision with root package name */
        private final int f6095e;

        /* renamed from: f, reason: collision with root package name */
        private final Sliver.Mode f6096f;

        /* renamed from: d, reason: collision with root package name */
        private volatile long f6094d = 0;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f6097g = false;

        /* renamed from: c, reason: collision with root package name */
        private final HashSet<Thread> f6093c = new HashSet<>();

        b(int i, int i2, int i3, Sliver.Mode mode) {
            this.a = i;
            this.b = i2;
            this.f6095e = i3;
            this.f6096f = mode;
        }

        synchronized void a(Thread thread) {
            this.f6093c.add(thread);
            this.f6097g = true;
        }

        synchronized void b() {
            SliverAllThreadSupport.nClearSliverGroup(this.f6094d);
        }

        synchronized void c(String str) {
            SliverAllThreadSupport.nDumpSliverGroup(this.f6094d, str);
        }

        synchronized void d(String str) {
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(str, true));
                    try {
                        Iterator<Thread> it2 = this.f6093c.iterator();
                        while (it2.hasNext()) {
                            Thread next = it2.next();
                            long threadPeer = Sliver.getThreadPeer(next);
                            if (threadPeer != 0) {
                                bufferedWriter2.write("# thread_info:" + SliverAllThreadSupport.nGetThreadId(threadPeer) + Constants.COLON_SEPARATOR + next.getName() + "\n");
                            }
                        }
                        bufferedWriter2.flush();
                        bufferedWriter2.close();
                    } catch (Throwable unused) {
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                    }
                } catch (Throwable unused2) {
                }
            } catch (IOException unused3) {
            }
        }

        synchronized void e() {
            synchronized (this) {
                if (this.f6094d == 0) {
                    this.f6094d = SliverAllThreadSupport.nStartSliverGroup(this.b, this.f6095e, Sliver.mode2Int(this.f6096f), this.a);
                }
            }
            if (this.f6094d == 0) {
                return;
            }
            if (this.f6097g) {
                ArrayList arrayList = new ArrayList(this.f6093c.size());
                ArrayList arrayList2 = new ArrayList(this.f6093c.size());
                Iterator<Thread> it2 = this.f6093c.iterator();
                while (it2.hasNext()) {
                    Thread next = it2.next();
                    long threadPeer = Sliver.getThreadPeer(next);
                    if (threadPeer != 0) {
                        arrayList.add(Long.valueOf(threadPeer));
                        arrayList2.add(next);
                    }
                }
                long[] jArr = new long[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    jArr[i] = ((Long) arrayList.get(i)).longValue();
                }
                SliverAllThreadSupport.nNotifySliverGroup(this.f6094d, (Thread[]) arrayList2.toArray(new Thread[0]), jArr);
                this.f6097g = false;
            }
        }

        synchronized void f() {
            SliverAllThreadSupport.nPauseSliverGroup(this.f6094d);
        }

        synchronized boolean g(Thread thread) {
            if (this.f6093c.isEmpty()) {
                return false;
            }
            if (!this.f6093c.remove(thread)) {
                return false;
            }
            this.f6097g = true;
            return true;
        }

        synchronized void h() {
            SliverAllThreadSupport.nResumeSliverGroup(this.f6094d);
        }

        synchronized void i() {
            if (this.f6094d == 0) {
                return;
            }
            SliverAllThreadSupport.nStopSliverGroup(this.f6094d);
        }
    }

    private static class c implements Runnable {
        private final int a;
        private List<Thread> b;

        public c(int i) {
            this.a = i;
        }

        private void a(List<Thread> list) {
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = 1;
                while (i < size) {
                    if (SliverAllThreadSupport.filter == null || SliverAllThreadSupport.filter.a(list.get(i))) {
                        ((b) SliverAllThreadSupport.threadGroups.get(i2)).a(list.get(i));
                        i++;
                        i2++;
                        if (i2 >= SliverAllThreadSupport.threadGroups.size()) {
                            break;
                        }
                    } else {
                        i++;
                    }
                }
                return;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Thread> allThread = SliverAllThreadSupport.getAllThread();
            if (this.b == null) {
                a(allThread);
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Thread thread : allThread) {
                    if (!this.b.contains(thread)) {
                        arrayList.add(thread);
                    }
                }
                for (Thread thread2 : this.b) {
                    if (!allThread.contains(thread2)) {
                        arrayList2.add(thread2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Thread thread3 = (Thread) it2.next();
                    for (int i = 1; i < SliverAllThreadSupport.threadGroups.size() && !((b) SliverAllThreadSupport.threadGroups.get(i)).g(thread3); i++) {
                    }
                }
                a(arrayList);
            }
            this.b = allThread;
            Iterator it3 = SliverAllThreadSupport.threadGroups.iterator();
            while (it3.hasNext()) {
                ((b) it3.next()).e();
            }
            SliverAllThreadSupport.newThreadHandler().postDelayed(this, this.a);
        }
    }

    SliverAllThreadSupport() {
    }

    static boolean clearAll() {
        if (!isStart) {
            return false;
        }
        Iterator<b> it2 = threadGroups.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
        return true;
    }

    private static synchronized void deleteThreadHandler() {
        synchronized (SliverAllThreadSupport.class) {
            Handler handler = threadHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                threadHandler.getLooper().quitSafely();
                threadHandler = null;
            }
        }
    }

    static boolean dumpAll(String str, boolean z) {
        if (!isStart) {
            return false;
        }
        a aVar = new a(str);
        if (z) {
            aVar.run();
            return true;
        }
        newThreadHandler().post(aVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean dumpHeader(String str) {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(str));
            try {
                bufferedWriter2.write("# sliver\n");
                bufferedWriter2.write("# pid:" + Process.myPid() + "\n");
                bufferedWriter2.flush();
                try {
                    bufferedWriter2.close();
                } catch (IOException unused) {
                }
                return true;
            } catch (Throwable unused2) {
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Thread> getAllThread() {
        int activeCount = systemThreadGroup.activeCount();
        Thread[] threadArr = new Thread[(activeCount / 2) + activeCount];
        int enumerate = systemThreadGroup.enumerate(threadArr);
        ArrayList arrayList = new ArrayList(enumerate);
        for (int i = 0; i < enumerate; i++) {
            if (threadArr[i] != mainThread && !threadArr[i].getName().contains("sliver")) {
                arrayList.add(threadArr[i]);
            }
        }
        return arrayList;
    }

    private static boolean initSystemThreadGroup() {
        try {
            if (systemThreadGroup == null) {
                Field declaredField = ThreadGroup.class.getDeclaredField("systemThreadGroup");
                declaredField.setAccessible(true);
                systemThreadGroup = (ThreadGroup) declaredField.get(null);
            }
        } catch (Throwable unused) {
        }
        return systemThreadGroup != null;
    }

    static boolean isStart() {
        return isStart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nClearSliverGroup(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDumpSliverGroup(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nGetThreadId(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nNotifySliverGroup(long j, Thread[] threadArr, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nPauseSliverGroup(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nResumeSliverGroup(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nStartSliverGroup(int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nStopSliverGroup(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized Handler newThreadHandler() {
        Handler handler;
        synchronized (SliverAllThreadSupport.class) {
            if (threadHandler == null) {
                HandlerThread handlerThread = new HandlerThread("sliver_check_thread");
                handlerThread.start();
                threadHandler = new Handler(handlerThread.getLooper());
            }
            handler = threadHandler;
        }
        return handler;
    }

    static boolean pauseAll() {
        if (!isStart || !isRunning) {
            return false;
        }
        Iterator<b> it2 = threadGroups.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        deleteThreadHandler();
        isRunning = false;
        return true;
    }

    static boolean resumeAll() {
        if (!isStart || isRunning) {
            return false;
        }
        Iterator<b> it2 = threadGroups.iterator();
        while (it2.hasNext()) {
            it2.next().h();
        }
        newThreadHandler().post(new c(samplingRateMs));
        isRunning = true;
        return true;
    }

    static boolean startAll(int i, int i2, int i3, Sliver.Mode mode, Sliver.h hVar) {
        if (Build.VERSION.SDK_INT > 31 || isStart || !initSystemThreadGroup()) {
            return false;
        }
        samplingRateMs = i2;
        filter = hVar;
        List<b> list = threadGroups;
        list.clear();
        int max = Math.max(i, 2);
        b bVar = new b(0, i2, i3, mode);
        bVar.a(mainThread);
        bVar.e();
        list.add(bVar);
        for (int i4 = 1; i4 < max; i4++) {
            threadGroups.add(new b(i4, i2, i3, mode));
        }
        newThreadHandler().post(new c(i2 * 5));
        isStart = true;
        isRunning = true;
        return true;
    }

    static boolean stopAll() {
        if (!isStart) {
            return false;
        }
        Iterator<b> it2 = threadGroups.iterator();
        while (it2.hasNext()) {
            it2.next().i();
        }
        threadGroups.clear();
        deleteThreadHandler();
        isStart = false;
        isRunning = false;
        return true;
    }
}
