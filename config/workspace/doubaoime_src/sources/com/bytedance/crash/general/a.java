package com.bytedance.crash.general;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import java.io.File;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static a f4620f;
    private final File a;
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private AppInfo f4621c;

    /* renamed from: d, reason: collision with root package name */
    private RomInfo f4622d;

    /* renamed from: e, reason: collision with root package name */
    private HardwareInfo f4623e;

    private a(@NonNull Context context, @NonNull File file) {
        this.a = com.bytedance.android.input.k.b.a.n(file, "general");
        this.b = context;
    }

    private static a a() {
        if (f4620f == null) {
            synchronized (a.class) {
                if (f4620f == null) {
                    Context g2 = C0652g.g();
                    File k = C0652g.k();
                    if (g2 != null && k != null) {
                        f4620f = new a(g2, k);
                    }
                }
            }
        }
        return f4620f;
    }

    @NonNull
    private AppInfo b() {
        if (this.f4621c == null) {
            synchronized (this) {
                if (this.f4621c == null) {
                    this.f4621c = AppInfo.get(this.b, this.a);
                }
            }
        }
        return this.f4621c;
    }

    @NonNull
    private HardwareInfo c() {
        if (this.f4623e == null) {
            synchronized (this) {
                if (this.f4623e == null) {
                    this.f4623e = HardwareInfo.get(this.b, this.a);
                }
            }
        }
        return this.f4623e;
    }

    public static long d() {
        a a = a();
        if (a != null) {
            return a.c().getJiffy();
        }
        return -1L;
    }

    public static long e(long j) {
        a a = a();
        if (a != null) {
            if (j == 0) {
                return a.b().mLastUpdateTime;
            }
            AppInfo findAppInfo = AppInfo.findAppInfo(a.a, j);
            if (findAppInfo != null) {
                return findAppInfo.mLastUpdateTime;
            }
        }
        return 0L;
    }

    public static String f() {
        String uuid;
        a a = a();
        if (a != null) {
            return a.g().getRandomDeviceId();
        }
        try {
            uuid = UUID.randomUUID().toString();
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(uuid) ? uuid : "0000-1111-2222-3333-4444";
    }

    @NonNull
    private RomInfo g() {
        if (this.f4622d == null) {
            synchronized (this) {
                if (this.f4622d == null) {
                    this.f4622d = RomInfo.get(this.a);
                }
            }
        }
        return this.f4622d;
    }

    public static void h() {
        a a = a();
        if (a != null) {
            a.b();
        }
    }

    public static boolean i() {
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i = 0; i < 11; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public static void j(JSONObject jSONObject, long j) {
        AppInfo findAppInfo;
        a a = a();
        if (a != null) {
            AppInfo b = a.b();
            if (j > 0 && j < b.mLastUpdateTime && (findAppInfo = AppInfo.findAppInfo(a.a, j)) != null) {
                b = findAppInfo;
            }
            b.putTo(jSONObject);
        }
    }

    public static void k(JSONObject jSONObject) {
        a a = a();
        if (a != null) {
            a.c().putTo(jSONObject);
        }
    }

    public static void l(JSONObject jSONObject) {
        a a = a();
        if (a != null) {
            a.g().putTo(jSONObject);
        }
    }
}
