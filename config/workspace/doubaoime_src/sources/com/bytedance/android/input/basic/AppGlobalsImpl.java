package com.bytedance.android.input.basic;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeApplication;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.keyboard.areacontrol.k;
import com.bytedance.android.input.r.j;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.e;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;

@ServiceImpl
/* loaded from: classes.dex */
public final class AppGlobalsImpl implements IAppGlobals {
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private final Application f2033c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2034d;

    /* renamed from: e, reason: collision with root package name */
    private final e f2035e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2036f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2037g;
    private final AtomicBoolean h;
    private boolean i;
    private boolean j;
    private String k;

    private static final class a {
        public static final a a = null;
        private static int b;

        /* renamed from: c, reason: collision with root package name */
        private static int f2038c;

        /* renamed from: g, reason: collision with root package name */
        private static boolean f2042g;
        private static SharedPreferences h;

        /* renamed from: d, reason: collision with root package name */
        private static Configuration f2039d = new Configuration();

        /* renamed from: e, reason: collision with root package name */
        private static String f2040e = "";

        /* renamed from: f, reason: collision with root package name */
        private static double f2041f = 1.0d;
        private static final e i = kotlin.a.c(C0050a.a);

        /* renamed from: com.bytedance.android.input.basic.AppGlobalsImpl$a$a, reason: collision with other inner class name */
        static final class C0050a extends m implements kotlin.s.b.a<String> {
            public static final C0050a a = new C0050a();

            C0050a() {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.CharSequence, java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
            @Override // kotlin.s.b.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.String invoke() {
                /*
                    r7 = this;
                    java.lang.String r0 = ""
                    android.app.Application r1 = com.bytedance.android.doubaoime.ImeApplication.f1883e     // Catch: java.lang.Throwable -> L81
                    java.lang.String r1 = d.a.b.a.e()     // Catch: java.lang.Throwable -> L81
                    java.lang.String r2 = "getProcessName(ImeApplication.sApplication)"
                    kotlin.s.c.l.e(r1, r2)     // Catch: java.lang.Throwable -> L81
                    boolean r2 = kotlin.text.a.s(r1)     // Catch: java.lang.Throwable -> L81
                    r3 = 1
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L17
                    goto L86
                L17:
                    java.lang.String r1 = "android.app.ActivityThread"
                    java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L81
                    com.bytedance.android.input.basic.c.a r1 = com.bytedance.android.input.basic.c.a.e(r1)     // Catch: java.lang.Throwable -> L81
                    java.lang.String r2 = "currentProcessName"
                    com.bytedance.android.input.basic.c.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L81
                    java.lang.Object r1 = r1.c()     // Catch: java.lang.Throwable -> L81
                    java.lang.String r2 = "on(clazz).call(\"currentProcessName\").get()"
                    kotlin.s.c.l.e(r1, r2)     // Catch: java.lang.Throwable -> L81
                    java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L81
                    boolean r2 = kotlin.text.a.s(r1)     // Catch: java.lang.Throwable -> L81
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L3a
                    goto L86
                L3a:
                    int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L81
                    android.app.Application r2 = com.bytedance.android.doubaoime.ImeApplication.f1883e     // Catch: java.lang.Throwable -> L81
                    java.lang.String r4 = "activity"
                    java.lang.Object r2 = r2.getSystemService(r4)     // Catch: java.lang.Throwable -> L81
                    java.lang.String r4 = "null cannot be cast to non-null type android.app.ActivityManager"
                    kotlin.s.c.l.d(r2, r4)     // Catch: java.lang.Throwable -> L81
                    android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Throwable -> L81
                    java.util.List r2 = r2.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L81
                    r4 = 0
                    if (r2 == 0) goto L7c
                    java.lang.String r5 = "runningAppList"
                    kotlin.s.c.l.e(r2, r5)     // Catch: java.lang.Throwable -> L81
                    java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L81
                L5d:
                    boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L81
                    if (r5 == 0) goto L74
                    java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L81
                    r6 = r5
                    android.app.ActivityManager$RunningAppProcessInfo r6 = (android.app.ActivityManager.RunningAppProcessInfo) r6     // Catch: java.lang.Throwable -> L81
                    int r6 = r6.pid     // Catch: java.lang.Throwable -> L81
                    if (r6 != r1) goto L70
                    r6 = r3
                    goto L71
                L70:
                    r6 = 0
                L71:
                    if (r6 == 0) goto L5d
                    goto L75
                L74:
                    r5 = r4
                L75:
                    android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5     // Catch: java.lang.Throwable -> L81
                    if (r5 == 0) goto L7c
                    java.lang.String r1 = r5.processName     // Catch: java.lang.Throwable -> L81
                    goto L7d
                L7c:
                    r1 = r4
                L7d:
                    if (r1 != 0) goto L86
                    r1 = r0
                    goto L86
                L81:
                    r1 = move-exception
                    java.lang.Object r1 = com.prolificinteractive.materialcalendarview.r.J(r1)
                L86:
                    boolean r2 = r1 instanceof kotlin.h.a
                    if (r2 == 0) goto L8b
                    goto L8c
                L8b:
                    r0 = r1
                L8c:
                    java.lang.String r0 = (java.lang.String) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.basic.AppGlobalsImpl.a.C0050a.invoke():java.lang.Object");
            }
        }

        public static final Configuration a() {
            return f2039d;
        }

        public static final String b() {
            return (String) i.getValue();
        }

        public static final SharedPreferences c() {
            return h;
        }

        public static final double d() {
            return f2041f;
        }

        public static final int e() {
            return f2038c;
        }

        public static final int f() {
            return b;
        }

        public static final SharedPreferences g() {
            StringBuilder M = e.a.a.a.a.M("ime_globals_data_");
            M.append(kotlin.text.a.M((String) i.getValue(), Constants.COLON_SEPARATOR, null, 2, null));
            SharedPreferences sharedPreferences = ImeApplication.f1883e.getSharedPreferences(M.toString(), 0);
            l.e(sharedPreferences, "sApplication.getSharedPr…ODE_PRIVATE\n            )");
            return sharedPreferences;
        }

        public static final String h() {
            return f2040e;
        }

        public static final void i() {
            Object J2;
            j.i("IAppGlobals", "initAppGlobalsInternal");
            try {
                if (h == null) {
                    j.i("IAppGlobals", "initAppGlobalsInternal go init");
                    Configuration configuration = ImeApplication.f1883e.getResources().getConfiguration();
                    l.e(configuration, "resources.configuration");
                    f2039d = configuration;
                    h = g();
                    l();
                    int min = Math.min(b, f2038c);
                    int max = Math.max(b, f2038c);
                    double d2 = min;
                    double d3 = d2 / 360;
                    f2041f = d3;
                    if (d3 > 4.0d) {
                        j.m("IAppGlobals", "keyboardScale > 4.0, shortSide = " + min);
                        f2041f = (double) ImeApplication.f1883e.getResources().getDisplayMetrics().density;
                    }
                    double d4 = f2041f;
                    f2040e = d4 >= 3.5d ? "3.5x" : d4 >= 3.0d ? "3x" : d4 >= 2.0d ? "2x" : "";
                    f2042g = d2 / ((double) max) > 0.7d;
                    j.m("IAppGlobals", "keyboardScale = " + f2041f + ", " + f2040e + " = " + f2040e + ", isFoldableScreen=" + f2042g);
                }
                J2 = o.a;
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            Throwable b2 = h.b(J2);
            if (b2 != null) {
                j.k("IAppGlobals", "initAppGlobalsInternal failed", b2);
            }
        }

        public static final void j(Configuration configuration) {
            l.f(configuration, "<set-?>");
            f2039d = configuration;
        }

        public static final void k(SharedPreferences sharedPreferences) {
            h = sharedPreferences;
        }

        public static final void l() {
            Object systemService = ImeApplication.f1883e.getSystemService("window");
            l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
            b = displayMetrics.widthPixels;
            f2038c = displayMetrics.heightPixels;
            StringBuilder M = e.a.a.a.a.M("AppGlobalsImpl onConfigurationChanged = ");
            M.append(f2039d.orientation);
            M.append(",w = ");
            M.append(b);
            M.append(", h = ");
            e.a.a.a.a.C0(M, f2038c, "AppGlobalsImpl");
        }
    }

    static final class b extends m implements kotlin.s.b.a<String> {
        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            return AppGlobalsImpl.this.getApplication().getApplicationInfo().loadLabel(AppGlobalsImpl.this.getApplication().getPackageManager()).toString();
        }
    }

    public AppGlobalsImpl() {
        Application application = ImeApplication.f1883e;
        l.e(application, "sApplication");
        this.f2033c = application;
        a aVar = a.a;
        this.f2034d = a.b();
        this.f2035e = kotlin.a.c(new b());
        this.f2036f = a.a().densityDpi;
        this.f2037g = a.h();
        this.h = new AtomicBoolean(false);
        this.k = "";
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public int A() {
        return this.f2036f;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public boolean B() {
        return this.h.getAndSet(false);
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public boolean C() {
        return ((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // com.bytedance.android.input.basic.IAppGlobals
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public Drawable D(Context context, int i) {
        l.f(context, "context");
        try {
            context = b() ? g(32).getDrawable(i) : g(16).getDrawable(i);
            return context;
        } catch (Exception e2) {
            j.k("IAppGlobals", "getDrawableForDarkTheme failed, fallback to context.getDrawable", e2);
            return context.getDrawable(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.bytedance.android.input.basic.IAppGlobals
    public View E(Context context, int i) {
        l.f(context, "context");
        try {
            context = b() ? LayoutInflater.from(g(32)).inflate(i, (ViewGroup) null) : LayoutInflater.from(g(16)).inflate(i, (ViewGroup) null);
            return context;
        } catch (Exception e2) {
            j.k("IAppGlobals", "getViewForDarkTheme failed, fallback to context", e2);
            return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        }
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    @SuppressLint({"PrivateApi"})
    public boolean F() {
        Object J2;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            boolean z = false;
            Method method = cls.getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class);
            Object invoke = method.invoke(cls, "ro.os.base.version", "unknown");
            l.d(invoke, "null cannot be cast to non-null type kotlin.String");
            String str = (String) invoke;
            Object invoke2 = method.invoke(cls, "ro.os.ota.version", "unknown");
            l.d(invoke2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) invoke2;
            if ((!l.a(str, "unknown") && !TextUtils.isEmpty(str)) || (!l.a(str2, "unknown") && !TextUtils.isEmpty(str2))) {
                z = true;
            }
            J2 = Boolean.valueOf(z);
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Object obj = Boolean.FALSE;
        if (J2 instanceof h.a) {
            J2 = obj;
        }
        return ((Boolean) J2).booleanValue();
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public void G(String str) {
        l.f(str, "name");
        l.f(str, "<set-?>");
        this.k = str;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public String H() {
        return this.k;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public boolean I() {
        if (this.b == 0) {
            a aVar = a.a;
            SharedPreferences c2 = a.c();
            if (c2 != null) {
                int i = c2.getInt("ime_version_code", 1);
                this.b = i;
                IAppGlobals.a aVar2 = IAppGlobals.a;
                Objects.requireNonNull(aVar2);
                if (i != 100309006) {
                    SharedPreferences.Editor edit = c2.edit();
                    Objects.requireNonNull(aVar2);
                    edit.putInt("ime_version_code", 100309006).apply();
                }
            }
        }
        int i2 = this.b;
        if (i2 == 0) {
            return false;
        }
        Objects.requireNonNull(IAppGlobals.a);
        return i2 != 100309006;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public void J(String str, Throwable th) {
        l.f(str, "tag");
        l.f(th, "throwable");
        j.l(str, th);
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public boolean K() {
        return this.i;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public void L(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        j.r(str, str2);
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public int a() {
        a aVar = a.a;
        return a.e();
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public boolean b() {
        if (this.i) {
            return true;
        }
        Resources resources = IAppGlobals.a.getApplication().getResources();
        String string = resources.getString(C0838R.string.color_scheme);
        l.e(string, "resources.getString(R.string.color_scheme)");
        Object f2 = SettingsConfigNext.f(string);
        l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f2).intValue();
        if (intValue != resources.getInteger(C0838R.integer.color_scheme_followsystem)) {
            if (intValue == resources.getInteger(C0838R.integer.color_scheme_dark)) {
                j.i("AppGlobalsImpl", "isDarkMode 2");
                return true;
            }
            j.i("AppGlobalsImpl", "isDarkMode 3");
            return false;
        }
        boolean z = (getContext().getResources().getConfiguration().uiMode & 48) == 32;
        if (z && !this.h.get()) {
            this.h.set(true);
        }
        e.a.a.a.a.y0("isDarkMode 1 value=", z, "AppGlobalsImpl");
        return z;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public int c() {
        a aVar = a.a;
        return (int) (a.d() * 45);
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public String d() {
        return this.i ? "transparent" : b() ? "dark" : "";
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public void e(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        j.j(str, str2);
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public String f() {
        return this.f2034d;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public Context g(int i) {
        try {
            Resources resources = getContext().getResources();
            if (resources == null) {
                j.j("IAppGlobals", "getCustomContextByUiMode: context.resources is null");
                return getContext();
            }
            Configuration configuration = new Configuration(resources.getConfiguration());
            configuration.uiMode = i | (configuration.uiMode & (-49));
            Context createConfigurationContext = getContext().createConfigurationContext(configuration);
            l.e(createConfigurationContext, "context.createConfigurationContext(newConfig)");
            return createConfigurationContext;
        } catch (Exception e2) {
            j.k("IAppGlobals", "getCustomContextByUiMode error", e2);
            return getContext();
        }
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public Application getApplication() {
        return this.f2033c;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public Context getContext() {
        if (this.f2033c.getApplicationContext() == null) {
            Application application = ImeApplication.f1883e;
            l.e(application, "{\n                ImeApp…Application\n            }");
            return application;
        }
        Context applicationContext = this.f2033c.getApplicationContext();
        l.e(applicationContext, "{\n                applic…tionContext\n            }");
        return applicationContext;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public boolean h() {
        Objects.requireNonNull(IAppGlobals.a);
        return !r0.getContext().getPackageName().equals("com.bytedance.android.doubaoime");
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public void i() {
        a aVar = a.a;
        a.i();
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public void j(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        j.i(str, str2);
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public boolean k(boolean z) {
        this.i = z;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // com.bytedance.android.input.basic.IAppGlobals
    public int l(Context context, int i) {
        l.f(context, "context");
        try {
            context = b() ? g(32).getColor(i) : g(16).getColor(i);
            return context;
        } catch (Exception e2) {
            j.k("IAppGlobals", "getColorForDarkTheme failed, fallback to context.getColor", e2);
            return context.getColor(i);
        }
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public boolean m(boolean z) {
        this.j = z;
        return z;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public boolean n() {
        return this.j;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public SharedPreferences o() {
        a aVar = a.a;
        SharedPreferences c2 = a.c();
        if (c2 != null) {
            return c2;
        }
        SharedPreferences g2 = a.g();
        a.k(g2);
        return g2;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public void p() {
        KeyboardJni.getKeyboardJni().malloptPurge();
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public int q() {
        return this.b;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public String r() {
        return (String) this.f2035e.getValue();
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public String s() {
        return this.f2037g;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public String t() {
        k kVar = k.a;
        int m = k.m();
        return m != 1 ? m != 2 ? "" : "floating" : "land";
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public SharedPreferences u() {
        return SettingsConfigNext.a.c();
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public int v() {
        a aVar = a.a;
        return a.f();
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public int w() {
        a aVar = a.a;
        return a.a().orientation;
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public void x(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        j.m(str, str2);
    }

    @Override // com.bytedance.android.input.basic.IAppGlobals
    public void y(Configuration configuration) {
        l.f(configuration, "configuration");
        a aVar = a.a;
        a.j(configuration);
        a.l();
        StringBuilder M = e.a.a.a.a.M("AppGlobalsImpl onConfigurationChanged = ");
        M.append(w());
        M.append(", isDarkMode = ");
        M.append(b());
        j.m("AppGlobalsImpl", M.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.bytedance.android.input.basic.IAppGlobals
    public View z(Context context, int i, ViewGroup viewGroup, boolean z) {
        l.f(context, "context");
        l.f(viewGroup, "root");
        try {
            context = b() ? LayoutInflater.from(g(32)).inflate(i, viewGroup, z) : LayoutInflater.from(g(16)).inflate(i, viewGroup, z);
            return context;
        } catch (Exception e2) {
            j.k("IAppGlobals", "getViewForDarkTheme failed, fallback to context", e2);
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
    }
}
