package kotlinx.coroutines;

import java.util.Objects;

/* renamed from: kotlinx.coroutines.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0819o extends o0 {

    /* renamed from: e, reason: collision with root package name */
    public final C0814l<?> f10300e;

    public C0819o(C0814l<?> c0814l) {
        this.f10300e = c0814l;
    }

    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ kotlin.o invoke(Throwable th) {
        y(th);
        return kotlin.o.a;
    }

    @Override // kotlinx.coroutines.AbstractC0826w
    public void y(Throwable th) {
        C0814l<?> c0814l = this.f10300e;
        r0 z = z();
        Objects.requireNonNull(c0814l);
        c0814l.B(z.r());
    }
}
