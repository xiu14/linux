package com.bytedance.android.input;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.android.doubaoime.ImeApplication;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.r.j;
import com.bytedance.android.input.r.k;
import com.bytedance.bdinstall.C0629i;
import com.bytedance.bdinstall.E;
import com.bytedance.bdinstall.P;
import com.bytedance.crash.Npth;
import java.util.Objects;

/* loaded from: classes.dex */
public class g {
    private static volatile boolean a = false;
    private static volatile boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2439c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static long f2440d;

    class a implements E {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // com.bytedance.bdinstall.E
        public void a(@NonNull P p) {
            if (p != null) {
                Handler handler = new Handler(Looper.getMainLooper());
                final Context context = this.a;
                handler.post(new Runnable() { // from class: com.bytedance.android.input.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.android.input.upgrade.f.a(context, null);
                    }
                });
            }
        }
    }

    public static void a() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.h()) {
            j.m("LateInitializer", "External package, don't deinitialize");
            return;
        }
        j.m("LateInitializer", "deinitialize");
        if (!a) {
            j.m("LateInitializer", "LateInitializer already deinitialized");
            return;
        }
        synchronized (f2439c) {
            if (!a) {
                j.m("LateInitializer", "LateInitializer already deinitialized");
                return;
            }
            IAppLog.a aVar2 = IAppLog.a;
            Objects.requireNonNull(aVar2);
            aVar2.stop();
            Npth.pause();
            b = true;
            j.m("LateInitializer", "LateInitializer stop");
        }
    }

    private static void b(final Context context) {
        IAppLog.a aVar = IAppLog.a;
        Objects.requireNonNull(aVar);
        aVar.initialize();
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        aVar.k(!d.a.b.a.c(aVar2).equals("auto_test"));
        StringBuilder sb = new StringBuilder();
        sb.append("channel is ");
        Objects.requireNonNull(aVar2);
        sb.append(d.a.b.a.c(aVar2));
        j.m("LateInitializer", sb.toString());
        aVar.p(new com.bytedance.android.input.basic.applog.api.b() { // from class: com.bytedance.android.input.c
            /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|3|(7:5|7|8|(3:10|11|12)|15|11|12)|17|7|8|(0)|15|11|12) */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
            
                com.bytedance.android.input.r.j.j("LateInitializer", "Invalid iid format, did: " + r10 + " iid: " + r11);
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[Catch: NumberFormatException -> 0x0039, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0039, blocks: (B:8:0x002e, B:10:0x0034), top: B:7:0x002e }] */
            @Override // com.bytedance.android.input.basic.applog.api.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(final java.lang.String r10, java.lang.String r11, java.lang.String r12) {
                /*
                    r9 = this;
                    android.content.Context r5 = r1
                    java.lang.String r12 = " iid: "
                    java.lang.String r0 = "LateInitializer"
                    r1 = 0
                    boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.NumberFormatException -> L13
                    if (r3 != 0) goto L2d
                    long r3 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L13
                    goto L2e
                L13:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "Invalid did format, did: "
                    r3.append(r4)
                    r3.append(r10)
                    r3.append(r12)
                    r3.append(r11)
                    java.lang.String r3 = r3.toString()
                    com.bytedance.android.input.r.j.j(r0, r3)
                L2d:
                    r3 = r1
                L2e:
                    boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.NumberFormatException -> L39
                    if (r6 != 0) goto L53
                    long r11 = java.lang.Long.parseLong(r11)     // Catch: java.lang.NumberFormatException -> L39
                    goto L54
                L39:
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "Invalid iid format, did: "
                    r6.append(r7)
                    r6.append(r10)
                    r6.append(r12)
                    r6.append(r11)
                    java.lang.String r11 = r6.toString()
                    com.bytedance.android.input.r.j.j(r0, r11)
                L53:
                    r11 = r1
                L54:
                    android.os.Handler r7 = new android.os.Handler
                    android.os.Looper r0 = android.os.Looper.getMainLooper()
                    r7.<init>(r0)
                    com.bytedance.android.input.b r8 = new com.bytedance.android.input.b
                    r0 = r8
                    r1 = r3
                    r3 = r11
                    r6 = r10
                    r0.<init>()
                    r7.post(r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.c.a(java.lang.String, java.lang.String, java.lang.String):void");
            }
        });
        if (context.getPackageName().equals(d.a.b.a.e())) {
            return;
        }
        j.m("LateInitializer", "子进程 ，BDInstall.addInstallListener");
        C0629i.a(true, new a(context));
    }

    public static void c(Context context) {
        Log.i("LateInitializer", "[initialize] Start, processName = " + d.a.b.a.e());
        if (a && !b) {
            j.m("LateInitializer", "[initialize] LateInitializer already initialized and is running");
            try {
                IInputSettings.a aVar = IInputSettings.a;
                Objects.requireNonNull(aVar);
                if (aVar.a().k()) {
                    j.i("LateInitializer", "[initialize] immediately pull");
                    Objects.requireNonNull(aVar);
                    aVar.e();
                } else {
                    Objects.requireNonNull(aVar);
                    if (aVar.a().r()) {
                        j.i("LateInitializer", "[initialize] timely update");
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - f2440d > 600000) {
                            f2440d = currentTimeMillis;
                            j.i("LateInitializer", "[initialize] update");
                            Objects.requireNonNull(aVar);
                            aVar.e();
                        }
                    }
                }
                return;
            } catch (Exception e2) {
                e.a.a.a.a.f0(e2, e.a.a.a.a.M("[initialize] error"), "LateInitializer");
                return;
            }
        }
        synchronized (f2439c) {
            if (a) {
                j.m("LateInitializer", "LateInitializer already initialized");
                if (b) {
                    context.getApplicationContext();
                    j.m("LateInitializer", "LateInitializer resuming from stopped state");
                    IAppLog.a aVar2 = IAppLog.a;
                    Objects.requireNonNull(aVar2);
                    aVar2.start();
                    Npth.resume();
                    b = false;
                }
                return;
            }
            Context applicationContext = context.getApplicationContext();
            j.m("LateInitializer", "LateInitializer start");
            j.m("LateInitializer", "start initTTNet");
            com.bytedance.android.input.ttnet.e.b(context, (ImeApplication) context.getApplicationContext(), 0);
            j.m("LateInitializer", "end initTTNet");
            b(applicationContext);
            j.m("LateInitializer", "start init npth");
            k.a(applicationContext);
            j.m("LateInitializer", "end init npth");
            a = true;
            b = false;
            j.m("LateInitializer", "LateInitializer end");
        }
    }
}
