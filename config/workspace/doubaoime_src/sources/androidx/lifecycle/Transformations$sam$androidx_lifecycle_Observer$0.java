package androidx.lifecycle;

import kotlin.s.b.l;
import kotlin.s.c.h;

/* loaded from: classes.dex */
final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, h {
    private final /* synthetic */ l function;

    Transformations$sam$androidx_lifecycle_Observer$0(l lVar) {
        kotlin.s.c.l.f(lVar, "function");
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof h)) {
            return kotlin.s.c.l.a(getFunctionDelegate(), ((h) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.s.c.h
    public final kotlin.b<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
