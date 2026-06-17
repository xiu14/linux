package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.r.d;
import kotlin.s.c.l;

@RequiresApi(31)
/* loaded from: classes.dex */
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(d<? super R> dVar) {
        l.f(dVar, "<this>");
        return new ContinuationOutcomeReceiver(dVar);
    }
}
