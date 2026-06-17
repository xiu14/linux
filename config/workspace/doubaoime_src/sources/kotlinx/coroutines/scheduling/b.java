package kotlinx.coroutines.scheduling;

/* loaded from: classes2.dex */
public final class b extends e {

    /* renamed from: f, reason: collision with root package name */
    public static final b f10323f = new b();

    private b() {
        super(k.b, k.f10328c, k.f10329d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.D
    public String toString() {
        return "Dispatchers.Default";
    }
}
