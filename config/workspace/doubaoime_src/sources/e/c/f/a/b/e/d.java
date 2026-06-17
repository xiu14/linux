package e.c.f.a.b.e;

/* loaded from: classes2.dex */
public class d implements a {
    private final int a;

    public d() {
        this.a = 3;
    }

    public void a(b bVar, e.c.f.a.b.b bVar2, e.c.f.a.a.a aVar, int i) {
        for (int i2 = 1; i2 <= this.a; i2++) {
            int a = (i + i2) % ((e.c.f.a.b.a) aVar).a();
            if (e.c.c.e.a.m(2)) {
                e.c.c.e.a.o(d.class, "Preparing frame %d, last drawn: %d", Integer.valueOf(a), Integer.valueOf(i));
            }
            ((c) bVar).e(bVar2, aVar, a);
        }
    }

    public d(int i) {
        this.a = i;
    }
}
