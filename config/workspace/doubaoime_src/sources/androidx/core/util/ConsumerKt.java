package androidx.core.util;

import androidx.annotation.RequiresApi;
import kotlin.s.c.l;

@RequiresApi(24)
/* loaded from: classes.dex */
public final class ConsumerKt {
    @RequiresApi(24)
    public static final <T> java.util.function.Consumer<T> asConsumer(kotlin.r.d<? super T> dVar) {
        l.f(dVar, "<this>");
        return new ContinuationConsumer(dVar);
    }
}
