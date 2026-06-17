package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.B;
import okhttp3.E;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.u;
import okhttp3.x;

/* loaded from: classes.dex */
public class f {
    private static int b;
    private x a;

    class a implements u {
        a(f fVar) {
        }

        @Override // okhttp3.u
        public B a(u.a aVar) throws IOException {
            okhttp3.F.f.f fVar = (okhttp3.F.f.f) aVar;
            Request i = fVar.i();
            try {
                okhttp3.h c2 = fVar.c();
                E n = c2 != null ? ((okhttp3.F.e.c) c2).n() : null;
                r1 = n != null ? n.e() : null;
                if (Logger.debug()) {
                    Logger.d("OkHttp3Builder", "-call- get res -  req: " + i.hashCode() + " conn: " + c2 + " route: " + n + " addr: " + r1);
                }
            } catch (Throwable unused) {
            }
            try {
                B f2 = fVar.f(i);
                if (r1 == null) {
                    return f2;
                }
                try {
                    B.a G = f2.G();
                    G.a("x-net-info.remoteaddr", r1.getAddress().getHostAddress());
                    return G.c();
                } catch (Throwable unused2) {
                    return f2;
                }
            } catch (IOException e2) {
                if (r1 != null) {
                    try {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append(r1.getAddress().getHostAddress());
                        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        if (message == null) {
                            message = "null";
                        }
                        sb.append(message);
                        Reflect.on(e2).set("detailMessage", sb.toString());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                throw e2;
            }
        }
    }

    public static void b(int i) {
        if (i <= 0 || b != 0) {
            return;
        }
        b = i;
    }

    private static void c(x.b bVar) {
        ArrayList arrayList = new ArrayList();
        int i = b;
        if (i == 1) {
            arrayList.add(Protocol.HTTP_2);
        } else if (i == 2) {
            arrayList.add(Protocol.SPDY_3);
        } else if (i != 3) {
            arrayList.add(Protocol.HTTP_2);
            arrayList.add(Protocol.SPDY_3);
        }
        b = 4;
        arrayList.add(Protocol.HTTP_1_1);
        bVar.m(Collections.unmodifiableList(arrayList));
    }

    public x a(boolean z) {
        if (z) {
            com.bytedance.frameworks.baselib.network.http.f.R();
        }
        synchronized (com.bytedance.frameworks.baselib.network.http.f.class) {
            x xVar = this.a;
            if (xVar != null) {
                int i = b;
                if (i > 0 && i < 4 && xVar != null) {
                    x.b l = xVar.l();
                    c(l);
                    l.c();
                }
                return this.a;
            }
            x.b bVar = new x.b();
            int i2 = b;
            if (i2 > 0 && i2 < 4) {
                c(bVar);
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bVar.e(new okhttp3.i(15, 180000L, timeUnit));
            int i3 = com.bytedance.frameworks.baselib.network.http.f.v;
            long j = 15000;
            bVar.d(j, timeUnit);
            bVar.o(j, timeUnit);
            bVar.s(j, timeUnit);
            bVar.b(new a(this));
            bVar.r(h.a());
            bVar.g(okhttp3.l.a);
            bVar.b(new g());
            bVar.a(new l());
            bVar.a(new m());
            bVar.b(new j());
            bVar.l(true);
            x c2 = bVar.c();
            this.a = c2;
            return c2;
        }
    }
}
