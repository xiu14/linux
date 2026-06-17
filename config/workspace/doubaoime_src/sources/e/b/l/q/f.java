package e.b.l.q;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class f extends Handler {
    WeakReference<a> a;

    public interface a {
        void handleMsg(Message message);
    }

    public f(Looper looper, a aVar) {
        super(looper);
        this.a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.a.get();
        if (aVar == null || message == null) {
            return;
        }
        aVar.handleMsg(message);
    }
}
