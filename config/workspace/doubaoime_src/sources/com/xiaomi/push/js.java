package com.xiaomi.push;

/* loaded from: classes2.dex */
public class js {
    private static int a = Integer.MAX_VALUE;

    public static void a(jp jpVar, byte b) {
        a(jpVar, b, a);
    }

    public static void a(jp jpVar, byte b, int i) {
        if (i <= 0) {
            throw new jj("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                jpVar.mo649a();
                return;
            case 3:
                jpVar.a();
                return;
            case 4:
                jpVar.mo636a();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                jpVar.mo646a();
                return;
            case 8:
                jpVar.mo637a();
                return;
            case 10:
                jpVar.mo638a();
                return;
            case 11:
                jpVar.mo645a();
                return;
            case 12:
                jpVar.mo643a();
                while (true) {
                    byte b2 = jpVar.mo639a().a;
                    if (b2 == 0) {
                        jpVar.f();
                        return;
                    } else {
                        a(jpVar, b2, i - 1);
                        jpVar.g();
                    }
                }
            case 13:
                jo mo641a = jpVar.mo641a();
                while (i2 < mo641a.f918a) {
                    int i3 = i - 1;
                    a(jpVar, mo641a.a, i3);
                    a(jpVar, mo641a.b, i3);
                    i2++;
                }
                jpVar.h();
                return;
            case 14:
                jt mo642a = jpVar.mo642a();
                while (i2 < mo642a.f919a) {
                    a(jpVar, mo642a.a, i - 1);
                    i2++;
                }
                jpVar.j();
                return;
            case 15:
                jn mo640a = jpVar.mo640a();
                while (i2 < mo640a.f917a) {
                    a(jpVar, mo640a.a, i - 1);
                    i2++;
                }
                jpVar.i();
                return;
        }
    }
}
