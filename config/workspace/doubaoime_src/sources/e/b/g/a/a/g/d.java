package e.b.g.a.a.g;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {
    private static final ConcurrentHashMap<String, c> a = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, b> b = new ConcurrentHashMap<>();

    public static c a(String str) {
        return a.get(str);
    }

    public static b b(String str) {
        return b.get(str);
    }

    public static boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        b bVar = b.get(str);
        if (bVar.b()) {
            return false;
        }
        return bVar.a(str2);
    }

    public static void d(String str, c cVar) {
        a.put(str, cVar);
    }

    public static void e(String str, b bVar) {
        b.put(str, bVar);
    }
}
