package ms.bd.c;

/* loaded from: classes2.dex */
public final class s4 extends r2 {
    public long a;

    public final void a(long j) {
        this.a = j;
        r4 r4Var = new r4(this);
        synchronized (this) {
            com.bytedance.frameworks.baselib.network.http.f.u(r4Var);
        }
    }

    public final void finalize() {
        y2.a(50331650, 0, this.a, null, null);
        y2.a(100663298, 0, this.a, null, null);
        this.a = -1L;
        super.finalize();
    }
}
