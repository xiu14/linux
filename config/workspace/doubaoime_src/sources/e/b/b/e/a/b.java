package e.b.b.e.a;

import android.app.Application;
import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.List;
import java.util.Properties;

/* loaded from: classes.dex */
public class b {
    private static File a;
    private static File b;

    /* renamed from: c, reason: collision with root package name */
    private static File f9369c;

    /* renamed from: d, reason: collision with root package name */
    private static File f9370d;

    /* renamed from: e, reason: collision with root package name */
    private static Properties f9371e;

    public static synchronized File a() {
        File file;
        synchronized (b.class) {
            if (b == null) {
                File file2 = new File(e(), "flush");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                b = file2;
                if (e.b.b.n.a.b()) {
                    List<String> list = a.a;
                    e.b.b.n.g.b.a("APM-Slardar", "prepare FlushDirectory success. name=" + b);
                }
            }
            file = b;
        }
        return file;
    }

    public static synchronized File b() {
        File file;
        synchronized (b.class) {
            if (f9369c == null) {
                File file2 = e.b.b.h.c.a.y() ? new File(e(), "persistent") : new File(e(), "child_process_persistent");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                f9369c = file2;
                if (e.b.b.n.a.b()) {
                    List<String> list = a.a;
                    e.b.b.n.g.b.a("APM-Slardar", "prepare PersistentDirectory success. name=" + f9369c);
                }
            }
            file = f9369c;
        }
        return file;
    }

    public static synchronized File c() {
        File file;
        synchronized (b.class) {
            if (a == null) {
                try {
                    String str = e.b.b.h.c.a.k().replace(".", BundleUtil.UNDERLINE_TAG).replace(Constants.COLON_SEPARATOR, Constants.ACCEPT_TIME_SEPARATOR_SERVER) + ".bin";
                    if (!e.b.b.h.c.a.y()) {
                        str = e.b.b.h.c.a.m() + BundleUtil.UNDERLINE_TAG + str;
                    }
                    File file2 = new File(b(), str);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    a = file2;
                    if (e.b.b.n.a.b()) {
                        List<String> list = a.a;
                        e.b.b.n.g.b.a("APM-Slardar", "prepare PersistentFile success. fileName=" + a);
                    }
                } catch (Exception e2) {
                    List<String> list2 = a.a;
                    e.b.b.n.g.b.c("APM-Slardar", "prepare PersistentFile fail.", e2);
                }
            }
            file = a;
        }
        return file;
    }

    public static String d() {
        Application a2 = e.b.b.n.a.a();
        if (f9371e == null) {
            Properties properties = new Properties();
            f9371e = properties;
            try {
                properties.load(a2.getApplicationContext().getAssets().open("slardar.properties"));
            } catch (Throwable unused) {
            }
        }
        Object obj = null;
        try {
            if (f9371e.containsKey("release_build")) {
                obj = f9371e.get("release_build");
            }
        } catch (Exception unused2) {
        }
        return String.valueOf(obj);
    }

    public static synchronized File e() {
        File file;
        synchronized (b.class) {
            if (f9370d == null) {
                File file2 = new File(e.b.b.n.a.a().getFilesDir(), "apm6");
                f9370d = file2;
                if (!file2.exists()) {
                    f9370d.mkdirs();
                }
            }
            file = f9370d;
        }
        return file;
    }
}
