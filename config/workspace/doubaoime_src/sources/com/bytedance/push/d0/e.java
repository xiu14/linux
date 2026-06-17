package com.bytedance.push.d0;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.push.C;
import com.bytedance.push.D;
import com.bytedance.push.E;
import com.bytedance.push.I;
import com.bytedance.push.interfaze.s;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class e {
    private final s a;
    private volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private volatile AtomicBoolean f5653c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private volatile AtomicBoolean f5654d = new AtomicBoolean(false);

    public e(s sVar) {
        this.a = sVar;
    }

    private void a(Context context, int i, int i2, String str, String str2, Map<String, String> map, boolean z) {
        if (!this.f5654d.get() && com.ss.android.pushmanager.setting.c.c().g().O().f5812c) {
            if (this.f5654d.compareAndSet(false, true)) {
                I.f().g(this);
                I.f().h(new D(map, z));
                return;
            }
            return;
        }
        this.b = true;
        C.y().c(i, i2, str, str2);
        com.bytedance.push.g0.f.e("Start", "request UPDATE_SENDER_URL failed: " + str2);
        com.bytedance.common.model.c c2 = com.bytedance.common.g.a.c().e().c();
        if (i == 301) {
            if (c2.k && c2.o.enableExceptionInDebugModeWhenFatalError()) {
                StringBuilder M = e.a.a.a.a.M("error when request /cloudpush/update_sender/ , please check whether to configure TLB, url is ");
                M.append(com.ss.android.g.d.b());
                throw new RuntimeException(M.toString());
            }
            StringBuilder M2 = e.a.a.a.a.M("error when request /cloudpush/update_sender/ , please check whether to configure TLB, url is ");
            M2.append(com.ss.android.g.d.b());
            com.bytedance.push.g0.f.e("UpdateSenderTask", M2.toString());
        }
        e(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(java.lang.String r12, android.app.Application r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.String> r20, boolean r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.d0.e.b(java.lang.String, android.app.Application, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean):boolean");
    }

    private void d(Context context, String str, boolean z) {
        com.bytedance.push.monitor.m.a aVar = (com.bytedance.push.monitor.m.a) com.ss.android.ug.bus.b.a(com.bytedance.push.monitor.m.a.class);
        if (aVar != null) {
            aVar.k(str, z);
        }
        boolean n = com.bytedance.push.third.g.o(context).n(str);
        com.bytedance.push.g0.f.g("Start", "tryRegisterServerPush " + str + " hasSupport = " + n);
        boolean z2 = false;
        if (z && !n) {
            str = com.ss.android.pushmanager.setting.c.c().f();
            if (!com.bytedance.push.third.g.o(context).n(str)) {
                C.y().b(false, str);
                if (aVar != null) {
                    aVar.f(str, false);
                    return;
                }
                return;
            }
        }
        com.bytedance.push.g0.f.g("Start", "tryRegisterAllSelectedPush: the senders = " + str);
        if (z && n) {
            z2 = true;
        }
        com.bytedance.push.third.a.g(str, z2);
        if (aVar != null) {
            aVar.f(str, true);
        }
        C.y().b(((E) this.a).d(context), str);
    }

    private void e(Context context) {
        if (!this.f5653c.compareAndSet(false, true) || TextUtils.isEmpty(com.ss.android.pushmanager.setting.c.c().f())) {
            return;
        }
        d(context, com.ss.android.pushmanager.setting.c.c().f(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x039b A[Catch: all -> 0x03b2, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0032, B:9:0x004d, B:10:0x005c, B:12:0x0102, B:13:0x012b, B:15:0x0158, B:17:0x015e, B:19:0x0164, B:21:0x016a, B:23:0x0170, B:32:0x018e, B:34:0x0194, B:36:0x019e, B:74:0x0330, B:76:0x0334, B:77:0x033b, B:116:0x0371, B:118:0x039b, B:120:0x03a1, B:124:0x03ac, B:129:0x0176), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ac A[Catch: all -> 0x03b2, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0032, B:9:0x004d, B:10:0x005c, B:12:0x0102, B:13:0x012b, B:15:0x0158, B:17:0x015e, B:19:0x0164, B:21:0x016a, B:23:0x0170, B:32:0x018e, B:34:0x0194, B:36:0x019e, B:74:0x0330, B:76:0x0334, B:77:0x033b, B:116:0x0371, B:118:0x039b, B:120:0x03a1, B:124:0x03ac, B:129:0x0176), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018e A[Catch: all -> 0x03b2, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0032, B:9:0x004d, B:10:0x005c, B:12:0x0102, B:13:0x012b, B:15:0x0158, B:17:0x015e, B:19:0x0164, B:21:0x016a, B:23:0x0170, B:32:0x018e, B:34:0x0194, B:36:0x019e, B:74:0x0330, B:76:0x0334, B:77:0x033b, B:116:0x0371, B:118:0x039b, B:120:0x03a1, B:124:0x03ac, B:129:0x0176), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0334 A[Catch: all -> 0x03b2, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x0032, B:9:0x004d, B:10:0x005c, B:12:0x0102, B:13:0x012b, B:15:0x0158, B:17:0x015e, B:19:0x0164, B:21:0x016a, B:23:0x0170, B:32:0x018e, B:34:0x0194, B:36:0x019e, B:74:0x0330, B:76:0x0334, B:77:0x033b, B:116:0x0371, B:118:0x039b, B:120:0x03a1, B:124:0x03ac, B:129:0x0176), top: B:3:0x0007 }] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean c(java.util.Map<java.lang.String, java.lang.String> r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.d0.e.c(java.util.Map, boolean, boolean):boolean");
    }
}
