package kotlin.r.h.a;

/* loaded from: classes2.dex */
public final class b implements kotlin.r.d<Object> {
    public static final b a = new b();

    private b() {
    }

    @Override // kotlin.r.d
    public kotlin.r.f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.r.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
