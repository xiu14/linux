package e.b.b.n;

import android.os.Handler;
import android.os.Looper;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class d {
    private static Handler a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        a.post(runnable);
    }

    public static byte[] b(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        return null;
    }
}
