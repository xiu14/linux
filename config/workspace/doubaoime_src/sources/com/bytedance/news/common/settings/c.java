package com.bytedance.news.common.settings;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.news.common.settings.api.annotation.ILocalSettings;
import com.bytedance.news.common.settings.api.annotation.ISettings;
import com.bytedance.news.common.settings.api.model.SettingsByteSyncModel;
import com.bytedance.news.common.settings.internal.e;
import com.bytedance.news.common.settings.internal.f;
import com.bytedance.news.common.settings.internal.h;
import com.service.middleware.applog.ApplogService;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static volatile boolean a;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile com.bytedance.news.common.settings.a f5503f;
    public static long h;
    public static long i;
    public static final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<d, Boolean> f5500c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static final h f5501d = new h();

    /* renamed from: e, reason: collision with root package name */
    private static final f f5502e = new f();

    /* renamed from: g, reason: collision with root package name */
    private static SettingsByteSyncModel f5504g = null;
    private static volatile boolean j = true;
    private static long k = 0;
    private static long l = 0;
    private static volatile boolean m = false;

    static class a implements Runnable {
        final /* synthetic */ boolean a;

        a(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.a(this.a);
        }
    }

    static class b implements Runnable {
        final /* synthetic */ Map.Entry a;
        final /* synthetic */ com.bytedance.news.common.settings.e.d b;

        b(Map.Entry entry, com.bytedance.news.common.settings.e.d dVar) {
            this.a = entry;
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((d) this.a.getKey()).a(this.b);
        }
    }

    /* renamed from: com.bytedance.news.common.settings.c$c, reason: collision with other inner class name */
    static class C0282c implements com.service.middleware.applog.a {
        final /* synthetic */ SettingsConfigProvider a;

        C0282c(SettingsConfigProvider settingsConfigProvider) {
            this.a = settingsConfigProvider;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.bytedance.news.common.settings.e.c a(boolean r11) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.news.common.settings.c.a(boolean):com.bytedance.news.common.settings.e.c");
    }

    private static void b() {
        if (!a) {
            synchronized (c.class) {
                if (!a) {
                    SettingsConfigProvider settingsConfigProvider = (SettingsConfigProvider) com.bytedance.news.common.service.manager.c.a(SettingsConfigProvider.class);
                    com.bytedance.news.common.settings.a config = settingsConfigProvider != null ? settingsConfigProvider.getConfig() : null;
                    if (config == null) {
                        config = null;
                    }
                    if (config != null) {
                        config.s("");
                        com.bytedance.news.common.settings.internal.a.b(config.a());
                        config.b();
                        if (com.bytedance.news.common.settings.e.j.a.n == null) {
                            com.bytedance.news.common.settings.e.j.a.n = null;
                        }
                        f5503f = config;
                        com.bytedance.news.common.settings.e.j.a.f(config);
                        config.r();
                        com.bytedance.news.common.settings.e.j.a.h(false);
                        config.b();
                        if (com.bytedance.news.common.settings.e.j.a.n == null) {
                            com.bytedance.news.common.settings.e.j.a.n = null;
                        }
                        com.bytedance.news.common.settings.e.j.a.g(System.currentTimeMillis());
                        ApplogService applogService = (ApplogService) com.bytedance.news.common.service.manager.c.a(ApplogService.class);
                        if (applogService != null) {
                            applogService.registerHeaderCustomCallback(new C0282c(settingsConfigProvider));
                        }
                        a = true;
                        h = System.currentTimeMillis();
                    }
                }
            }
        }
        if (f5503f == null) {
            throw new IllegalStateException("SettingsManager尚未被配置");
        }
    }

    public static boolean c(@NonNull SettingsByteSyncModel settingsByteSyncModel) {
        if (settingsByteSyncModel.timeStamp >= Math.max(h, i)) {
            return true;
        }
        StringBuilder M = e.a.a.a.a.M("settingsByteSyncModel.timeStamp = ");
        M.append(settingsByteSyncModel.timeStamp);
        M.append(" initTime = ");
        M.append(h);
        M.append(" requestTime = ");
        M.append(i);
        Log.e("SettingsManager", M.toString());
        return false;
    }

    @NonNull
    public static <T> T d(Class<T> cls) {
        b();
        if (ISettings.class.isAssignableFrom(cls)) {
            return (T) f5501d.c(cls, f5503f, "");
        }
        if (ILocalSettings.class.isAssignableFrom(cls)) {
            return (T) f5502e.b(cls, f5503f, "");
        }
        throw new IllegalArgumentException("tClass必须是ISettings或ILocalSettings的子类");
    }

    private static void e(com.bytedance.news.common.settings.e.d dVar) {
        for (Map.Entry<d, Boolean> entry : f5500c.entrySet()) {
            if (entry != null) {
                if (entry.getValue().booleanValue()) {
                    b.post(new b(entry, dVar));
                } else {
                    entry.getKey().a(dVar);
                }
            }
        }
    }

    public static void f(d dVar, boolean z) {
        f5500c.put(dVar, Boolean.valueOf(z));
    }

    public static void g(@NonNull SettingsByteSyncModel settingsByteSyncModel) {
        f5504g = settingsByteSyncModel;
    }

    public static void h(@NonNull JSONObject jSONObject) {
        com.bytedance.news.common.settings.e.d d2 = e.c(com.bytedance.news.common.settings.internal.a.a()).d(f5503f.d());
        if (d2 != null) {
            JSONObject a2 = d2.a();
            if (a2 != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (a2.has(next)) {
                        try {
                            a2.put(next, jSONObject.opt(next));
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            f5501d.d(d2, f5503f, false);
            e(d2);
        }
    }

    public static void i(boolean z) {
        b();
        if (m) {
            return;
        }
        f5503f.c().execute(new a(z));
    }
}
