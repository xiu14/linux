package ms.bd.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class w1 extends Handler {
    public com.bytedance.mobsec.metasec.ml.c a;
    public final /* synthetic */ y1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y1 y1Var, Looper looper) {
        super(looper);
        this.b = y1Var;
    }

    public final void a() {
        if (this.a == null) {
            this.a = com.bytedance.mobsec.metasec.ml.a.a(this.b.f10473c);
        }
        this.a.a((String) y2.a(16777217, 0, 0L, "9c1a98", new byte[]{36, 104, 84, 16, 57, 59, 63, 81}), "");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        super.handleMessage(message);
        int i2 = message.what;
        if (i2 == 0) {
            this.b.f10476f.post(new u1(this));
            this.b.a.c();
            long j = this.b.b.f10369d;
            Message message2 = new Message();
            message2.what = 1;
            sendMessageDelayed(message2, j);
            return;
        }
        if (i2 == 1) {
            this.b.f10476f.post(new v1(this));
            e2 e2Var = this.b.b;
            if (e2Var.f10371f && (i = e2Var.b) == e2Var.a) {
                Message message3 = new Message();
                message3.what = 2;
                sendMessageDelayed(message3, i);
                return;
            } else {
                long j2 = e2Var.b;
                Message message4 = new Message();
                message4.what = 0;
                sendMessageDelayed(message4, j2);
                return;
            }
        }
        if (i2 == 2) {
            this.b.a.c();
            long j3 = this.b.b.b;
            Message message5 = new Message();
            message5.what = 2;
            sendMessageDelayed(message5, j3);
            return;
        }
        if (i2 == 3) {
            a();
            long j4 = this.b.b.f10368c;
            Message message6 = new Message();
            message6.what = 3;
            sendMessageDelayed(message6, j4);
            return;
        }
        if (i2 != 4) {
            return;
        }
        a();
        this.b.a.a(true);
        this.b.f10475e.removeCallbacks(null);
        this.b.h.countDown();
    }
}
