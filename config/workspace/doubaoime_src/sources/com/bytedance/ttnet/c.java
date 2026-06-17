package com.bytedance.ttnet;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.TTNetInitMetrics;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.o;
import com.bytedance.frameworks.baselib.network.http.p.i;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.tnc.TNCManager;
import java.io.IOException;
import java.net.MalformedURLException;

/* loaded from: classes2.dex */
public class c {
    private static volatile InterfaceC0317c a = null;
    static final d b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    static final b f6108c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    static boolean f6109d = false;

    /* renamed from: e, reason: collision with root package name */
    static volatile boolean f6110e = false;

    /* renamed from: f, reason: collision with root package name */
    static String f6111f;

    private static class b extends d {
        b(a aVar) {
            super(null);
        }
    }

    /* renamed from: com.bytedance.ttnet.c$c, reason: collision with other inner class name */
    public interface InterfaceC0317c {
        boolean f();
    }

    private static class d {
        d(a aVar) {
        }
    }

    private static class e implements com.bytedance.frameworks.baselib.network.http.d {

        /* renamed from: c, reason: collision with root package name */
        private static volatile e f6112c;
        private k a;
        private volatile int b;

        private e(k kVar) {
            this.a = kVar;
        }

        public static e b(k kVar) {
            if (f6112c == null) {
                synchronized (e.class) {
                    if (f6112c == null) {
                        f6112c = new e(kVar);
                    }
                }
            }
            return f6112c;
        }

        @Override // com.bytedance.retrofit2.client.a
        public com.bytedance.retrofit2.client.d a(Request request) throws IOException {
            try {
                return this.a.a(request);
            } catch (Throwable th) {
                if (!(th instanceof MalformedURLException) && (th.getMessage() == null || !th.getMessage().contains("MalformedURLException"))) {
                    if (Logger.debug()) {
                        StringBuilder M = e.a.a.a.a.M("init mode is ");
                        TTNetInitMetrics.CronetInitMode cronetInitMode = TTNetInitMetrics.j().a;
                        M.append(cronetInitMode == TTNetInitMetrics.CronetInitMode.PRE_INIT || cronetInitMode == TTNetInitMetrics.CronetInitMode.FORCE_INIT);
                        Logger.d("HttpClient", M.toString());
                        StringBuilder sb = new StringBuilder();
                        sb.append("exception times is ");
                        e.a.a.a.a.D0(sb, this.b, "HttpClient");
                    }
                    TTNetInitMetrics.CronetInitMode cronetInitMode2 = TTNetInitMetrics.j().a;
                    if (cronetInitMode2 == TTNetInitMetrics.CronetInitMode.PRE_INIT || cronetInitMode2 == TTNetInitMetrics.CronetInitMode.FORCE_INIT) {
                        int i = this.b + 1;
                        this.b = i;
                        if (i > 3) {
                            if (!com.bytedance.ttnet.config.d.a()) {
                                if (Logger.debug()) {
                                    Logger.d("HttpClient", "set sIsCronetException true");
                                }
                                c.f6109d = true;
                            }
                            String b = com.bytedance.ttnet.utils.d.b(th);
                            c.f6111f = b;
                            if (b.length() > 256) {
                                c.f6111f = c.f6111f.substring(0, 256);
                            }
                        }
                    }
                }
                TTNetInit.notifyColdStartFinish();
                if (request.getMetrics() != null) {
                    String b2 = com.bytedance.ttnet.utils.d.b(th);
                    if (b2.length() > 1024) {
                        b2 = b2.substring(0, 1024);
                    }
                    request.getMetrics().j = b2;
                    request.getMetrics().i = 10;
                    if (Logger.debug()) {
                        StringBuilder M2 = e.a.a.a.a.M("new CronetSscall failed ");
                        M2.append(this.b);
                        M2.append(" for ");
                        M2.append(request.getPath());
                        Logger.d("HttpClient", M2.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("new CronetSscall failed message ");
                        e.a.a.a.a.I0(sb2, b2, "HttpClient");
                    }
                }
                Context c2 = ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
                o o = o.o(c2);
                if (i.c(c2)) {
                    o.r(TNCManager.e());
                }
                return o.a(request);
            }
        }
    }

    public static String a() {
        return f6111f;
    }

    public static com.bytedance.frameworks.baselib.network.http.d b(boolean z) {
        if (c() && !z) {
            return e.b(k.r(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c()));
        }
        Context c2 = ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
        o o = o.o(c2);
        if (i.c(c2)) {
            o.r(TNCManager.e());
        }
        return o;
    }

    public static boolean c() {
        if (a != null && o.h() == 9) {
            if (Logger.debug()) {
                Logger.d("HttpClient", "reset null config fallback");
            }
            o.q(-1);
        }
        if (a == null && !com.bytedance.ttnet.config.d.b()) {
            if (Logger.debug()) {
                Logger.d("HttpClient", "check null config and fallback");
            }
            TNCManager.e().i();
            o.q(9);
            return false;
        }
        if (a != null && !a.f()) {
            return false;
        }
        if (!f6109d || f6110e) {
            return true;
        }
        o.q(7);
        o.p(f6111f);
        return false;
    }

    public static void d(boolean z) {
        f6110e = z;
    }

    public static void e(InterfaceC0317c interfaceC0317c) {
        a = interfaceC0317c;
    }
}
