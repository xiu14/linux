package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class H0<U, T extends U> extends kotlinx.coroutines.N0.v<T> implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f10150d;

    public H0(long j, kotlin.r.d<? super U> dVar) {
        super(((kotlin.r.h.a.c) dVar).getContext(), dVar);
        this.f10150d = j;
    }

    @Override // kotlinx.coroutines.AbstractC0789a, kotlinx.coroutines.r0
    public String d0() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.d0());
        sb.append("(timeMillis=");
        return e.a.a.a.a.E(sb, this.f10150d, ')');
    }

    @Override // java.lang.Runnable
    public void run() {
        B(new G0("Timed out waiting for " + this.f10150d + " ms", this));
    }
}
