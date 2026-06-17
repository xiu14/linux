package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import com.bytedance.common.wschannel.WsConstants;
import com.prolificinteractive.materialcalendarview.r;
import e.a.a.a.a;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.r.d;
import kotlin.s.c.l;

@RequiresApi(31)
/* loaded from: classes.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final d<R> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(d<? super R> dVar) {
        super(false);
        l.f(dVar, "continuation");
        this.continuation = dVar;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e2) {
        l.f(e2, WsConstants.KEY_CONNECTION_ERROR);
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(r.J(e2));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(r);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        StringBuilder M = a.M("ContinuationOutcomeReceiver(outcomeReceived = ");
        M.append(get());
        M.append(')');
        return M.toString();
    }
}
