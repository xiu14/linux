package com.bytedance.dataplatform;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.android.input.fragment.settings.Z;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class m {
    private static r a;
    private static volatile j b;

    /* renamed from: d, reason: collision with root package name */
    private static volatile Future f4744d;
    private static Z h;
    public static final /* synthetic */ int m = 0;

    /* renamed from: c, reason: collision with root package name */
    static final Map<String, Object> f4743c = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f4745e = false;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f4746f = false;

    /* renamed from: g, reason: collision with root package name */
    private static Object f4747g = new Object();
    private static Map<String, String> i = new ConcurrentHashMap();
    private static Set<String> j = new ConcurrentSkipListSet();
    private static boolean k = false;
    private static final Map<String, String> l = new ConcurrentHashMap();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.h();
            m.b.f(m.i);
        }
    }

    public static void g(Map<String, String> map) {
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.equals(i.get(key), value)) {
                i.put(key, value);
                z = true;
            }
        }
        if (z && f4745e) {
            s.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        boolean z = f4745e | f4746f;
        if (f4744d == null) {
            throw new RuntimeException("ExperimentManager has not been init");
        }
        try {
            f4744d.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Z i() {
        return h;
    }

    public static <T> T j(String str, Type type, @Nullable T t, boolean z, boolean z2, boolean z3, boolean z4, @Nullable com.bytedance.dataplatform.u.a<T> aVar) {
        T t2;
        T t3;
        T t4;
        h();
        if (z2) {
            Map<String, Object> map = f4743c;
            if (map.containsKey(str) && map.get(str).getClass() == type) {
                if (z3) {
                    try {
                        b.c(str);
                    } catch (Exception unused) {
                    }
                }
                T t5 = (T) map.get(str);
                n(str, t5, z2, "sticky", aVar);
                return t5;
            }
        }
        if (!z) {
            n(str, t, z2, "enable", aVar);
            return t;
        }
        T t6 = (T) n.c(str, type);
        if (t6 != null) {
            n(str, t6, z2, "panel", aVar);
            return t6;
        }
        if (k && (t4 = (T) b.e(str, type, null, z3, z4)) != null) {
            n(str, t4, z2, "libra", aVar);
            return t4;
        }
        r rVar = a;
        if (rVar != null && (t3 = (T) rVar.a(str, type, null)) != null) {
            n(str, t3, z2, "setting", aVar);
            return t3;
        }
        if (!k && (t2 = (T) b.e(str, type, null, z3, z4)) != null) {
            n(str, t2, z2, "libra", aVar);
            return t2;
        }
        T t7 = (T) b.d(str, aVar, z3);
        if (t7 != null) {
            n(str, t7, z2, "client", aVar);
            return t7;
        }
        n(str, t, z2, DownloadSettingKeys.BugFix.DEFAULT, aVar);
        return t;
    }

    public static void k(Application application, String str, boolean z, r rVar, q qVar, p pVar, com.bytedance.common.a.b bVar) {
        h.f4728f.c(application);
        if (f4745e) {
            a = rVar;
            n.d(application, rVar, qVar, b);
            return;
        }
        synchronized (f4747g) {
            if (!f4745e) {
                f4744d = s.a(new l(application, str, z, qVar, pVar, bVar, rVar));
                f4745e = true;
                f4746f = true;
            }
            f4747g.notifyAll();
        }
    }

    public static void l(boolean z) {
        k = z;
    }

    public static void m() {
        h();
        b.f(null);
    }

    static <T> T n(String str, T t, boolean z, String str2, com.bytedance.dataplatform.u.a<T> aVar) {
        if (z && t != null) {
            f4743c.put(str, t);
        }
        l.put(str, str2);
        return t;
    }

    public static void o(Z z) {
        h = z;
    }
}
