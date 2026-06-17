package androidx.core.os;

import kotlin.s.b.a;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, a<? extends T> aVar) {
        l.f(str, "sectionName");
        l.f(aVar, "block");
        TraceCompat.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            TraceCompat.endSection();
        }
    }
}
