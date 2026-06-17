package e.j.b;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class c {
    private static int a = 3;
    private static int b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static int f10032c = 3;

    public static boolean a() {
        int i = a;
        if (i != 3) {
            return i == 1;
        }
        String str = Build.BRAND;
        int i2 = (TextUtils.isEmpty(str) || !str.toLowerCase().contains("oppo")) ? 2 : 1;
        a = i2;
        return i2 == 1;
    }

    public static boolean b() {
        int i = f10032c;
        if (i != 3) {
            return i == 1;
        }
        String str = Build.BRAND;
        int i2 = (TextUtils.isEmpty(str) || !str.toLowerCase().contains("samsung")) ? 2 : 1;
        f10032c = i2;
        return i2 == 1;
    }

    public static boolean c() {
        int i = b;
        if (i != 3) {
            return i == 1;
        }
        String str = Build.HARDWARE;
        int i2 = (TextUtils.isEmpty(str) || !(str.toLowerCase().contains("hi") || str.toLowerCase().contains("kirin"))) ? 2 : 1;
        b = i2;
        return i2 == 1;
    }
}
