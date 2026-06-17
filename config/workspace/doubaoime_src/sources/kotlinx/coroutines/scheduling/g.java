package kotlinx.coroutines.scheduling;

/* loaded from: classes2.dex */
public abstract class g implements Runnable {
    public long a;
    public h b;

    public g(long j, h hVar) {
        this.a = j;
        this.b = hVar;
    }

    public g() {
        h hVar = k.f10331f;
        this.a = 0L;
        this.b = hVar;
    }
}
