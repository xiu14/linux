package com.bytedance.push.a0.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.push.B;
import com.bytedance.push.C;
import com.bytedance.push.PushBody;
import com.bytedance.push.R.f;
import com.bytedance.push.helper.c;
import com.bytedance.push.interfaze.g;
import com.bytedance.push.notification.n;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import com.ss.android.message.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class a implements g, Handler.Callback {
    private Handler b;

    /* renamed from: c, reason: collision with root package name */
    private Context f5611c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5612d;

    /* renamed from: e, reason: collision with root package name */
    private LocalSettings f5613e;
    private final f a = new f();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f5614f = new AtomicBoolean(false);

    private long a(B b) {
        long j = 0;
        if (b.o().f5568J >= 0) {
            long J2 = ((b.o().f5568J * 1000) + this.f5613e.J()) - System.currentTimeMillis();
            if (J2 > 0) {
                j = J2;
            }
        }
        long b2 = b(b);
        StringBuilder Q = e.a.a.a.a.Q("[getMessageShowTimeInterval] messageShowTimeIntervalFromLastMsgShow:", j, " messageShowTimeIntervalFromLastForeground:");
        Q.append(b2);
        com.bytedance.push.g0.f.c("MessageSpreadOutServiceImpl", Q.toString());
        return Math.max(j, b2);
    }

    private long b(B b) {
        if (b.o().K < 0) {
            return 0L;
        }
        long e2 = ((b.o().K * 1000) + com.bytedance.push.K.a.d().e()) - System.currentTimeMillis();
        if (e2 <= 0) {
            return 0L;
        }
        return e2;
    }

    private synchronized void d() {
        if (this.f5611c == null) {
            this.f5611c = com.ss.android.message.a.a();
            this.b = e.e().c(this);
            this.f5613e = (LocalSettings) h.b(this.f5611c, LocalSettings.class);
            this.f5612d = ((PushOnlineSettings) h.b(this.f5611c, PushOnlineSettings.class)).y();
        }
    }

    private synchronized void f() {
        B b = this.a.b();
        if (b == null) {
            com.bytedance.push.g0.f.c("MessageSpreadOutServiceImpl", "[startInMessageLopper] earliestMessage is null");
        } else if (this.f5614f.compareAndSet(false, true)) {
            long a = a(b);
            com.bytedance.push.g0.f.c("MessageSpreadOutServiceImpl", "[startInMessageLopper] show message after " + a + " mill");
            this.b.sendMessageDelayed(this.b.obtainMessage(2081615, b), a);
        } else {
            com.bytedance.push.g0.f.c("MessageSpreadOutServiceImpl", "[startInMessageLopper] earliestMessage is not null but mHandler has MSG_WHAT_CHECK_CLIENT_STATUS");
        }
    }

    public void c() {
        d();
        List<B> e2 = c.f(this.f5611c).e();
        StringBuilder M = e.a.a.a.a.M("[onPushStart] allMessageNotShown size is ");
        ArrayList arrayList = (ArrayList) e2;
        M.append(arrayList.size());
        com.bytedance.push.g0.f.c("MessageSpreadOutServiceImpl", M.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            B b = (B) it2.next();
            if (!e(b)) {
                ((n) ((C) C.a()).o()).f(b);
            }
        }
    }

    public boolean e(B b) {
        StringBuilder M = e.a.a.a.a.M("[spreadOut] minDisplayInterval：");
        M.append(b.o().f5568J);
        com.bytedance.push.g0.f.c("MessageSpreadOutServiceImpl", M.toString());
        if (b.o().f5568J <= 0 && b.o().K <= 0) {
            return false;
        }
        d();
        if (!this.f5612d) {
            com.bytedance.push.g0.f.c("MessageSpreadOutServiceImpl", "[spreadOut] not spread out message because settings of mAllowSpreadOutMessage is false");
            return false;
        }
        this.a.a(b);
        f();
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        boolean z;
        if (message.what != 2081615) {
            return false;
        }
        this.f5614f.compareAndSet(true, false);
        B b = (B) message.obj;
        if (b != null) {
            StringBuilder M = e.a.a.a.a.M("[handleMessage of MSG_WHAT_CHECK_CLIENT_STATUS] show message ");
            M.append(b.f5543c);
            com.bytedance.push.g0.f.c("MessageSpreadOutServiceImpl", M.toString());
            if (b(b) <= 0) {
                PushBody o = b.o();
                if (o.C < System.currentTimeMillis()) {
                    com.bytedance.push.g0.f.c("MessageSpreadOutServiceImpl", "[showMessageNow] message expired , not show !");
                    z = true;
                } else {
                    this.f5613e.n0(System.currentTimeMillis());
                    z = false;
                }
                this.a.c(b);
                ((n) ((C) C.a()).o()).m(b.a, o, b.f5545e, true, z, null, b.f5543c);
            }
            f();
        } else {
            com.bytedance.push.g0.f.e("MessageSpreadOutServiceImpl", "[handleMessage of MSG_WHAT_CHECK_CLIENT_STATUS] message is null");
        }
        return true;
    }
}
