package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class B0 implements Runnable {
    private final D a;
    private final InterfaceC0812k<kotlin.o> b;

    /* JADX WARN: Multi-variable type inference failed */
    public B0(D d2, InterfaceC0812k<? super kotlin.o> interfaceC0812k) {
        this.a = d2;
        this.b = interfaceC0812k;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.j(this.a, kotlin.o.a);
    }
}
