package androidx.core.util;

import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(kotlin.r.d<? super o> dVar) {
        l.f(dVar, "<this>");
        return new ContinuationRunnable(dVar);
    }
}
