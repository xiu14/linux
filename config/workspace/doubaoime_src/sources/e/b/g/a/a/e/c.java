package e.b.g.a.a.e;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static b a = new a();
    private static ConcurrentHashMap<String, b> b;

    static {
        ConcurrentHashMap<String, b> concurrentHashMap = new ConcurrentHashMap<>();
        b = concurrentHashMap;
        concurrentHashMap.put(DownloadSettingKeys.BugFix.DEFAULT, a);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str) || b.get(str) == null) {
            return false;
        }
        return b.get(str).a();
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str) || b.get(str) == null) {
            return 100;
        }
        return b.get(str).g();
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str) || b.get(str) == null) {
            return 15000;
        }
        return b.get(str).h() * 1000;
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str) || b.get(str) == null) {
            return 4;
        }
        return b.get(str).i();
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str) || b.get(str) == null) {
            return 120;
        }
        return b.get(str).b();
    }

    public static JSONObject f(String str) {
        if (TextUtils.isEmpty(str) || b.get(str) == null) {
            return null;
        }
        return b.get(str).f();
    }

    public static List<String> g(String str, String str2) {
        if (TextUtils.isEmpty(str) || b.get(str) == null) {
            return null;
        }
        return b.get(str).e(str2);
    }

    public static long h(String str) {
        if (TextUtils.isEmpty(str) || b.get(str) == null) {
            return 600000L;
        }
        return b.get(str).c();
    }

    public static void i(String str, b bVar) {
        b.put(str, bVar);
    }
}
