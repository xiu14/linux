package ms.bd.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class j0 extends Handler {
    public final /* synthetic */ m0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, Looper looper) {
        super(looper);
        this.a = m0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        l0 l0Var;
        int ordinal = ((k0[]) k0.f10401e.clone())[message.what].ordinal();
        if ((ordinal == 1 || ordinal == 2) && (l0Var = this.a.b) != null) {
            try {
                ((t0) l0Var).b((String) message.obj, message.what);
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }
}
