package ms.bd.c;

/* loaded from: classes2.dex */
public abstract class n4 {
    public static final /* synthetic */ int a = 0;

    static {
    }

    public static String a(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace('\'', ' ').replace('\"', ' ').replace('\r', ' ').replace('\n', ' ');
    }
}
