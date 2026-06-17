package androidx.core.util;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(kotlin.r.d<? super T> dVar) {
        l.f(dVar, "<this>");
        return new AndroidXContinuationConsumer(dVar);
    }
}
