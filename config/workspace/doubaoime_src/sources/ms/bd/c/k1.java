package ms.bd.c;

import android.content.Context;

/* loaded from: classes2.dex */
public final class k1 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile k1 f10402d;
    public String a = null;
    public String b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f10403c = h4.b.a;

    public k1(Context context) {
        try {
            new Thread(new d0(new f0(new j1(this)), context)).start();
        } catch (Throwable unused) {
        }
    }

    public static k1 a(Context context) {
        if (f10402d == null) {
            synchronized (k1.class) {
                if (f10402d == null) {
                    f10402d = new k1(context);
                }
            }
        }
        return f10402d;
    }

    public static boolean b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
