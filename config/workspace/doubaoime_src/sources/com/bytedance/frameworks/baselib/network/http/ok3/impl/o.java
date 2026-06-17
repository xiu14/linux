package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.retrofit2.client.Request;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Locale;
import okhttp3.x;

/* loaded from: classes.dex */
public class o extends com.bytedance.frameworks.baselib.network.http.a {
    private static volatile o a = null;
    private static volatile int b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static volatile String f5192c = "";

    /* renamed from: d, reason: collision with root package name */
    private static volatile Proxy f5193d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f5194e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static int f5195f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static volatile String f5196g = "";
    private static String h = "tt-ok/3.10.0.2";
    private static volatile com.bytedance.ttnet.k.a i;
    private static Context j;
    private static f k;
    private static d l;
    public static final /* synthetic */ int m = 0;

    class a implements com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.e {
        a(o oVar) {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.e
        public String[] a() {
            if (o.i != null) {
                o.i.d();
            }
            return null;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.e
        public String[] b() {
            if (o.i != null) {
                o.i.e();
            }
            return null;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.e
        public String c() {
            if (o.i != null) {
                return o.i.c();
            }
            return null;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.e
        public String getAppId() {
            if (o.i != null) {
                return String.valueOf(o.i.b());
            }
            return null;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.e
        public Context getContext() {
            return o.j;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    private o(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            java.lang.String r0 = "okhttp/3.12.13.20"
            goto L23
        L7:
            java.lang.String r1 = "okhttp3.F.c"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "userAgent"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1f
            r0 = r1
            goto L23
        L1f:
            r1 = move-exception
            r1.printStackTrace()
        L23:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "okhttp/"
            boolean r2 = r0.startsWith(r1)
            java.lang.String r3 = "tt-ok/"
            if (r2 == 0) goto L38
            java.lang.String r0 = r0.replaceFirst(r1, r3)
            goto L3c
        L38:
            java.lang.String r0 = e.a.a.a.a.s(r3, r0)
        L3c:
            com.bytedance.frameworks.baselib.network.http.ok3.impl.o.h = r0
        L3e:
            android.content.Context r5 = r5.getApplicationContext()
            com.bytedance.frameworks.baselib.network.http.ok3.impl.o.j = r5
            com.bytedance.frameworks.baselib.network.http.ok3.impl.f r5 = new com.bytedance.frameworks.baselib.network.http.ok3.impl.f
            r5.<init>()
            com.bytedance.frameworks.baselib.network.http.ok3.impl.o.k = r5
            com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j r5 = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k()
            android.content.Context r0 = com.bytedance.frameworks.baselib.network.http.ok3.impl.o.j
            r5.m(r0)
            com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c r5 = com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c.n()
            com.bytedance.frameworks.baselib.network.http.ok3.impl.o$a r0 = new com.bytedance.frameworks.baselib.network.http.ok3.impl.o$a
            r0.<init>(r4)
            r5.u(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.o.<init>(android.content.Context):void");
    }

    public static x d() {
        return k.a(false);
    }

    public static Context e() {
        return j;
    }

    public static String f() {
        int i2;
        if (TextUtils.isEmpty(f5196g)) {
            StringBuilder sb = new StringBuilder();
            sb.append(j.getPackageName());
            sb.append('/');
            Context context = j;
            synchronized (f5194e) {
                if (f5195f == 0) {
                    try {
                        f5195f = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                i2 = f5195f;
            }
            sb.append(i2);
            sb.append(" (Linux; U; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("; ");
            sb.append(Locale.getDefault().toString());
            String str = Build.MODEL;
            if (str.length() > 0) {
                sb.append("; ");
                sb.append(str);
            }
            String str2 = Build.ID;
            if (str2.length() > 0) {
                sb.append("; Build/");
                sb.append(str2);
            }
            sb.append(";");
            f5196g = e.a.a.a.a.G(sb, h, ')');
        }
        return f5196g;
    }

    public static String g() {
        return f5192c;
    }

    public static int h() {
        return b;
    }

    public static String i(Request request) {
        if (request.getMetrics() == null) {
            return "null-metrics";
        }
        StringBuilder M = e.a.a.a.a.M("fallback_reason=");
        M.append(b);
        M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        M.append("fallback-message=");
        M.append(Base64.encodeToString(f5192c.getBytes(), 2));
        M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        M.append("request-fallback-reason=");
        M.append(request.getMetrics().i);
        M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        M.append("request-fallback-message=");
        M.append(Base64.encodeToString(request.getMetrics().j.getBytes(), 2));
        return M.toString();
    }

    public static d j() {
        return l;
    }

    public static com.bytedance.ttnet.k.a k() {
        return i;
    }

    public static String l() {
        return h;
    }

    public static Proxy m() {
        return f5193d;
    }

    public static void n(com.bytedance.ttnet.k.a aVar) {
        i = aVar;
    }

    public static o o(Context context) {
        if (a == null) {
            synchronized (o.class) {
                if (a == null) {
                    a = new o(context);
                }
            }
        }
        return a;
    }

    public static void p(String str) {
        f5192c = str;
    }

    public static void q(int i2) {
        b = i2;
    }

    public static void s(String str) throws IllegalArgumentException {
        if (str == null) {
            f5193d = null;
            return;
        }
        String[] split = str.split(";");
        if (split.length <= 0) {
            throw new IllegalArgumentException(e.a.a.a.a.s("Invalid proxy rule:", str));
        }
        String[] split2 = split[0].trim().split(ContainerUtils.KEY_VALUE_DELIMITER);
        if (split2.length != 2) {
            throw new IllegalArgumentException(e.a.a.a.a.s("Invalid proxy rule:", str));
        }
        String lowerCase = split2[0].trim().toLowerCase();
        String[] split3 = split2[1].trim().split(Constants.COLON_SEPARATOR);
        if (split3.length != 2) {
            throw new IllegalArgumentException(e.a.a.a.a.s("Invalid proxy rule:", str));
        }
        InetSocketAddress inetSocketAddress = new InetSocketAddress(split3[0], Integer.parseInt(split3[1]));
        if (lowerCase.equals("http") || lowerCase.equals("https")) {
            f5193d = new Proxy(Proxy.Type.HTTP, inetSocketAddress);
        } else if (lowerCase.equals("socks") || lowerCase.equals("socks4") || lowerCase.equals("socks5")) {
            f5193d = new Proxy(Proxy.Type.SOCKS, inetSocketAddress);
        }
    }

    @Override // com.bytedance.retrofit2.client.a
    public com.bytedance.retrofit2.client.d a(Request request) throws IOException {
        try {
            Request b2 = com.bytedance.frameworks.baselib.network.http.o.b.j().b(request);
            if (b2 != null) {
                request = b2;
            }
        } catch (Throwable unused) {
        }
        Request d2 = com.bytedance.frameworks.baselib.network.e.d.e().d(request);
        if (d2 != null) {
            request = d2;
        }
        return new c(request);
    }

    public void r(d dVar) {
        l = dVar;
    }
}
