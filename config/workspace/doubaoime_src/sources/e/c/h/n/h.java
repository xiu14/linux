package e.c.h.n;

/* loaded from: classes2.dex */
public class h implements d {
    private final int a;

    public h(int i) {
        this.a = i;
    }

    @Override // e.c.h.n.d
    public c createImageTranscoder(e.c.g.d dVar, boolean z) {
        return new g(z, this.a);
    }
}
