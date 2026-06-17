package ms.bd.c;

/* loaded from: classes2.dex */
public abstract class y2 {
    public static native Object a(int i, int i2, long j, String str, Object obj);

    public static Object b(int i, int i2, long j, String str, Object obj) {
        try {
            return u2.a(i, i2, j, str, obj);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
