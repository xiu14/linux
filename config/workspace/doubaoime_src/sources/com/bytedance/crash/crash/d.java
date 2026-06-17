package com.bytedance.crash.crash;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f4574d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f4575e;

    /* renamed from: f, reason: collision with root package name */
    private static final ArrayList<com.bytedance.crash.T.a> f4576f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private static boolean f4577g;
    public static final /* synthetic */ int h = 0;

    /* renamed from: c, reason: collision with root package name */
    private final a f4578c;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

    d(a aVar) {
        this.f4578c = aVar;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x017a A[Catch: all -> 0x0198, TRY_LEAVE, TryCatch #6 {all -> 0x0198, blocks: (B:47:0x0173, B:119:0x017a), top: B:46:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.lang.Thread r19, java.lang.Throwable r20) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.crash.d.a(java.lang.Thread, java.lang.Throwable):boolean");
    }

    private static int b(Throwable th, Thread thread) {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList<com.bytedance.crash.T.a> arrayList = f4576f;
            if (i >= arrayList.size()) {
                break;
            }
            try {
                try {
                    i2 |= arrayList.get(i).b(th, thread);
                } catch (Throwable unused) {
                }
                i++;
            } catch (Throwable unused2) {
            }
        }
        return i2;
    }

    public static void c(boolean z) {
        f4577g = z;
    }

    public static void d(boolean z) {
        f4575e = z;
    }

    public static void e(boolean z) {
        f4574d = z;
    }

    public static void f(com.bytedance.crash.T.a aVar) {
        f4576f.add(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[Catch: all -> 0x0033, LOOP:0: B:13:0x001d->B:22:0x002e, LOOP_START, PHI: r0
      0x001d: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:7:0x0015, B:22:0x002e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {, blocks: (B:8:0x0017, B:9:0x0031, B:13:0x001d, B:29:0x0011, B:4:0x0002, B:6:0x000b), top: B:3:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[Catch: all -> 0x0033, TryCatch #2 {, blocks: (B:8:0x0017, B:9:0x0031, B:13:0x001d, B:29:0x0011, B:4:0x0002, B:6:0x000b), top: B:3:0x0002, inners: #0 }] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.b     // Catch: java.lang.Throwable -> L10
            r2 = 1
            boolean r1 = r1.compareAndSet(r0, r2)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L14
            boolean r1 = r3.a(r4, r5)     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r1 = move-exception
            com.bytedance.android.input.k.b.a.W(r1)     // Catch: java.lang.Throwable -> L33
        L14:
            r1 = r0
        L15:
            if (r1 != 0) goto L1d
            java.lang.Thread$UncaughtExceptionHandler r0 = r3.a     // Catch: java.lang.Throwable -> L33
            r0.uncaughtException(r4, r5)     // Catch: java.lang.Throwable -> L33
            goto L31
        L1d:
            java.util.ArrayList<com.bytedance.crash.T.a> r1 = com.bytedance.crash.crash.d.f4576f     // Catch: java.lang.Throwable -> L33
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L33
            if (r0 >= r2) goto L31
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L31
            com.bytedance.crash.T.a r1 = (com.bytedance.crash.T.a) r1     // Catch: java.lang.Throwable -> L31
            r1.a(r5, r4)     // Catch: java.lang.Throwable -> L2e
        L2e:
            int r0 = r0 + 1
            goto L1d
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.crash.d.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
