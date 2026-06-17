package kotlinx.coroutines.scheduling;

/* loaded from: classes2.dex */
public final class d extends f {
    public static final d a = new d();

    private d() {
    }

    @Override // kotlinx.coroutines.scheduling.f
    public long a() {
        return System.nanoTime();
    }
}
