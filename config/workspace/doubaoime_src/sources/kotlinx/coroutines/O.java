package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class O extends RuntimeException {
    private final kotlin.r.f a;

    public O(kotlin.r.f fVar) {
        this.a = fVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.a.toString();
    }
}
