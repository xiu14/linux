package ms.bd.c;

/* loaded from: classes2.dex */
public final class m4 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile m4 f10406c;
    public int a = 0;
    public Throwable b = null;

    public static m4 a() {
        if (f10406c == null) {
            synchronized (m4.class) {
                if (f10406c == null) {
                    f10406c = new m4();
                }
            }
        }
        return f10406c;
    }
}
