package com.bytedance.crash.general;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/* loaded from: classes.dex */
public class c {
    private static i a;

    static class a extends i {
        private final String b;

        a() {
            super("gionee", "amigo");
            this.b = c.a("ro.gn.sv.version");
        }

        @Override // com.bytedance.crash.general.c.i
        @NonNull
        String a() {
            return Build.DISPLAY + BundleUtil.UNDERLINE_TAG + this.b;
        }

        boolean b() {
            String str = Build.DISPLAY;
            return !TextUtils.isEmpty(str) && str.toLowerCase(i.a).contains("amigo");
        }
    }

    static class b extends i {
        private final String b;

        b() {
            super("oppo", "coloros");
            this.b = c.a("ro.build.version.opporom");
        }

        @Override // com.bytedance.crash.general.c.i
        @NonNull
        String a() {
            StringBuilder M = e.a.a.a.a.M("coloros_");
            M.append(this.b);
            M.append(BundleUtil.UNDERLINE_TAG);
            M.append(Build.DISPLAY);
            return M.toString();
        }

        boolean b() {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) && str.toLowerCase(i.a).contains("oppo");
        }
    }

    /* renamed from: com.bytedance.crash.general.c$c, reason: collision with other inner class name */
    static class C0209c extends i {
        private final String b;

        C0209c() {
            super("huawei", "emotionui");
            this.b = c.a("ro.build.version.emui");
        }

        @Override // com.bytedance.crash.general.c.i
        @NonNull
        String a() {
            if (TextUtils.isEmpty(this.b) || !this.b.toLowerCase(i.a).contains("emotionui")) {
                String str = Build.DISPLAY;
                return str == null ? "unknown" : str;
            }
            return this.b + BundleUtil.UNDERLINE_TAG + Build.DISPLAY;
        }

        boolean b() {
            if (!TextUtils.isEmpty(this.b)) {
                String lowerCase = this.b.toLowerCase(i.a);
                if (lowerCase.startsWith("emotionui") || lowerCase.startsWith("magicui")) {
                    return true;
                }
            }
            try {
                String str = Build.BRAND;
                if (!TextUtils.isEmpty(str)) {
                    if (str.toLowerCase(i.a).startsWith("huawei")) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            try {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                return str2.toLowerCase(i.a).startsWith("huawei");
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    static class d extends i {
        private final String b;

        d() {
            super("letv", "eui");
            this.b = c.a("ro.letv.release.version");
        }

        @Override // com.bytedance.crash.general.c.i
        @NonNull
        String a() {
            StringBuilder M = e.a.a.a.a.M("eui_");
            M.append(this.b);
            M.append(BundleUtil.UNDERLINE_TAG);
            M.append(Build.DISPLAY);
            return M.toString();
        }

        boolean b() {
            return !TextUtils.isEmpty(this.b);
        }
    }

    static class e extends i {
        e() {
            super("meizu", "flyme");
        }

        boolean b() {
            String str = Build.DISPLAY;
            if (TextUtils.isEmpty(str) || !str.toLowerCase(i.a).contains("flyme")) {
                return !TextUtils.isEmpty(Build.USER) && Build.USER.equals("flyme");
            }
            return true;
        }
    }

    static class f extends i {
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4624c;

        f() {
            super("vivo", "funtouch");
            this.b = c.a("ro.vivo.os.build.display.id");
            this.f4624c = c.a("ro.vivo.product.version");
        }

        @Override // com.bytedance.crash.general.c.i
        @NonNull
        String a() {
            return this.b + BundleUtil.UNDERLINE_TAG + this.f4624c;
        }

        boolean b() {
            return !TextUtils.isEmpty(this.b) && this.b.toLowerCase(i.a).contains("funtouch");
        }
    }

    static class g extends i {
        private final String b;

        g() {
            super("xiaomi", "miui");
            this.b = c.a("ro.miui.ui.version.name");
        }

        @Override // com.bytedance.crash.general.c.i
        @NonNull
        String a() {
            StringBuilder M = e.a.a.a.a.M("miui_");
            M.append(this.b);
            M.append(BundleUtil.UNDERLINE_TAG);
            M.append(Build.VERSION.INCREMENTAL);
            return M.toString();
        }

        boolean b() {
            try {
                Class.forName("miui.os.Build");
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    static class h extends i {
        private final String b;

        h() {
            super("qiku", "360");
            this.b = c.a("ro.build.uiversion");
        }

        @Override // com.bytedance.crash.general.c.i
        @NonNull
        String a() {
            return this.b + BundleUtil.UNDERLINE_TAG + Build.DISPLAY;
        }

        boolean b() {
            String str = Build.MANUFACTURER + Build.BRAND;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String lowerCase = str.toLowerCase(i.a);
            return lowerCase.contains("360") || lowerCase.contains("qiku");
        }
    }

    static abstract class i {

        @SuppressLint({"ConstantLocale"})
        protected static final Locale a = Locale.getDefault();

        i(String str, String str2) {
        }

        @NonNull
        String a() {
            String str = Build.DISPLAY;
            return str == null ? "unknown" : str;
        }
    }

    static class j extends i {
        j() {
            super("sony", "sony");
        }

        boolean b() {
            String str = Build.BRAND + Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) && str.toLowerCase(i.a).contains("sony");
        }
    }

    static class k extends i {
        k() {
            super("unknown", "unknown");
        }
    }

    static String a(String str) {
        BufferedReader bufferedReader;
        Process exec;
        String str2 = "";
        try {
            try {
                exec = Runtime.getRuntime().exec("getprop " + str);
                bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            } catch (Throwable unused) {
                bufferedReader = null;
            }
            try {
                str2 = bufferedReader.readLine();
                exec.destroy();
                bufferedReader.close();
            } catch (Throwable unused2) {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                return str2;
            }
        } catch (Throwable unused3) {
        }
        return str2;
    }

    private static i b() {
        C0209c c0209c = new C0209c();
        if (c0209c.b()) {
            return c0209c;
        }
        g gVar = new g();
        if (gVar.b()) {
            return gVar;
        }
        f fVar = new f();
        if (fVar.b()) {
            return fVar;
        }
        b bVar = new b();
        if (bVar.b()) {
            return bVar;
        }
        e eVar = new e();
        if (eVar.b()) {
            return eVar;
        }
        d dVar = new d();
        if (dVar.b()) {
            return dVar;
        }
        j jVar = new j();
        if (jVar.b()) {
            return jVar;
        }
        a aVar = new a();
        if (aVar.b()) {
            return aVar;
        }
        h hVar = new h();
        return hVar.b() ? hVar : new k();
    }

    @NonNull
    static String c() {
        if (a == null) {
            synchronized (i.class) {
                if (a == null) {
                    a = b();
                }
            }
        }
        return a.a();
    }
}
