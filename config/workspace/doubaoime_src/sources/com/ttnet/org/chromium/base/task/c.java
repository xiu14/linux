package com.ttnet.org.chromium.base.task;

import android.os.Process;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
class c extends ThreadPoolExecutor {
    private static final int a;
    private static final int b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8585c;

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadFactory f8586d;

    /* renamed from: e, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f8587e;

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Runnable runnable2 = new Runnable() { // from class: com.ttnet.org.chromium.base.task.a
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable3 = runnable;
                    Process.setThreadPriority(10);
                    runnable3.run();
                }
            };
            StringBuilder M = e.a.a.a.a.M("CrAsyncTask #");
            M.append(this.a.getAndIncrement());
            return new Thread(runnable2, M.toString());
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        b = Math.max(2, Math.min(availableProcessors - 1, 4));
        f8585c = (availableProcessors * 2) + 1;
        f8586d = new a();
        f8587e = new ArrayBlockingQueue(128);
    }

    c() {
        super(b, f8585c, 30L, TimeUnit.SECONDS, f8587e, f8586d);
        allowCoreThreadTimeOut(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r11) {
        /*
            r10 = this;
            super.execute(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L4
            return
        L4:
            r11 = move-exception
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.concurrent.BlockingQueue r1 = r10.getQueue()
            r2 = 0
            java.lang.Runnable[] r3 = new java.lang.Runnable[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.Runnable[] r1 = (java.lang.Runnable[]) r1
            int r3 = r1.length
            r4 = r2
        L19:
            if (r4 >= r3) goto L65
            r5 = r1[r4]
            java.lang.Class r6 = r5.getClass()
            r7 = 1
            java.lang.Class<com.ttnet.org.chromium.base.task.b$a> r8 = com.ttnet.org.chromium.base.task.b.a.class
            if (r6 == r8) goto L40
            java.lang.Class r8 = r6.getEnclosingClass()     // Catch: java.lang.Throwable -> L44
            java.lang.Class<android.os.AsyncTask> r9 = android.os.AsyncTask.class
            if (r8 != r9) goto L44
            java.lang.String r8 = "this$0"
            java.lang.reflect.Field r8 = r6.getDeclaredField(r8)     // Catch: java.lang.Throwable -> L44
            r8.setAccessible(r7)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r8.get(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L44
            goto L44
        L40:
            com.ttnet.org.chromium.base.task.b$a r5 = (com.ttnet.org.chromium.base.task.b.a) r5     // Catch: java.lang.Throwable -> L44
            r5 = 0
            throw r5     // Catch: java.lang.Throwable -> L44
        L44:
            java.lang.String r5 = r6.getName()
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L59
            java.lang.Object r6 = r0.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L5a
        L59:
            r6 = r2
        L5a:
            int r6 = r6 + r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r5, r6)
            int r4 = r4 + 1
            goto L19
        L65:
            java.util.concurrent.RejectedExecutionException r1 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r2 = "Prominent classes in AsyncTask: "
            java.lang.StringBuilder r2 = e.a.a.a.a.M(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 32
            if (r5 <= r6) goto L7a
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            r3.append(r6)
            goto L7a
        La1:
            int r0 = r3.length()
            if (r0 != 0) goto Laa
            java.lang.String r0 = "NO CLASSES FOUND"
            goto Lae
        Laa:
            java.lang.String r0 = r3.toString()
        Lae:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.c.execute(java.lang.Runnable):void");
    }
}
