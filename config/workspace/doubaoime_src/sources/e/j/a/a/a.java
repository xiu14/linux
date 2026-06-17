package e.j.a.a;

import android.util.Log;

/* loaded from: classes2.dex */
public class a {
    private static boolean a = false;
    private static boolean b = false;

    public static boolean a() {
        synchronized (a.class) {
            boolean z = true;
            if (a) {
                return true;
            }
            try {
                System.loadLibrary("vcn");
            } catch (UnsatisfiedLinkError e2) {
                Log.e("vcn", "Can't load avmdl library: " + e2);
                z = false;
            }
            a = z;
            return z;
        }
    }

    public static boolean b() {
        synchronized (a.class) {
            boolean z = true;
            if (b) {
                return true;
            }
            try {
                System.loadLibrary("vcnverify");
            } catch (UnsatisfiedLinkError e2) {
                Log.e("vcn", "Can't load avmdl library: " + e2);
                z = false;
            }
            b = z;
            return z;
        }
    }
}
