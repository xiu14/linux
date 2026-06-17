package com.bytedance.push;

import android.text.TextUtils;
import com.bytedance.push.helper.NetWorkStatusMonitorHelper;

/* loaded from: classes2.dex */
public class I implements NetWorkStatusMonitorHelper.a {

    /* renamed from: e, reason: collision with root package name */
    private static final I f5554e = new I();
    private D a;
    private com.bytedance.push.d0.e b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5555c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5556d = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (I.this.a == null) {
                return;
            }
            if (I.this.b.c(I.this.a.a(), I.this.a.b(), false)) {
                com.bytedance.push.g0.f.c("UpdateSenderRetryScheduler", "retry update sender success");
            } else {
                com.bytedance.push.g0.f.c("UpdateSenderRetryScheduler", "retry update sender fail");
            }
            I.this.f5555c = false;
            I.this.e();
        }
    }

    private I() {
    }

    public static I f() {
        return f5554e;
    }

    private void i(boolean z) {
        if (this.f5555c || this.a == null) {
            return;
        }
        this.f5555c = true;
        com.ss.android.message.e.e().f(new a(), z ? 0L : com.heytap.mcssdk.constant.a.q);
    }

    @Override // com.bytedance.push.helper.NetWorkStatusMonitorHelper.a
    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(NetWorkStatusMonitorHelper.b().c())) {
            this.f5555c = false;
            i(true);
        }
    }

    public void e() {
        if (this.f5556d) {
            return;
        }
        NetWorkStatusMonitorHelper.b().e(this);
        this.f5556d = true;
    }

    public void g(com.bytedance.push.d0.e eVar) {
        this.b = eVar;
        NetWorkStatusMonitorHelper.b().a(this);
    }

    public void h(D d2) {
        this.a = d2;
        i(false);
    }
}
