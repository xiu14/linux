package g.a.c.c;

/* loaded from: classes2.dex */
public class g {
    public static void a(e eVar, byte b, int i) throws g.a.c.b {
        if (i <= 0) {
            throw new g.a.c.b("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                ((a) eVar).b();
                return;
            case 3:
                eVar.b();
                return;
            case 4:
                eVar.c();
                return;
            case 5:
            case 7:
            case 9:
            default:
                throw new f(1, e.a.a.a.a.j("Unrecognized type ", b));
            case 6:
                eVar.e();
                return;
            case 8:
                eVar.f();
                return;
            case 10:
                eVar.g();
                return;
            case 11:
                eVar.a();
                return;
            case 12:
                eVar.l();
                while (true) {
                    byte b2 = eVar.d().b;
                    if (b2 == 0) {
                        return;
                    } else {
                        a(eVar, b2, i - 1);
                    }
                }
            case 13:
                d i3 = eVar.i();
                while (i2 < i3.f10077c) {
                    int i4 = i - 1;
                    a(eVar, i3.a, i4);
                    a(eVar, i3.b, i4);
                    i2++;
                }
                return;
            case 14:
                h j = eVar.j();
                while (i2 < j.b) {
                    a(eVar, j.a, i - 1);
                    i2++;
                }
                return;
            case 15:
                c h = eVar.h();
                while (i2 < h.b) {
                    a(eVar, h.a, i - 1);
                    i2++;
                }
                return;
        }
    }
}
