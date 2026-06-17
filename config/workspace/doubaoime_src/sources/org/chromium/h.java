package org.chromium;

import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;
import com.bytedance.retrofit2.A;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.z;
import com.ttnet.org.chromium.net.u;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h extends u.a {
    private com.bytedance.frameworks.baselib.network.http.b b;

    public h(com.bytedance.frameworks.baselib.network.http.b bVar) {
        super(new Executor() { // from class: org.chromium.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.b = bVar;
    }

    private static long c(long j, long j2) {
        if (j2 == -1 || j == -1 || j2 > j) {
            return -1L;
        }
        return j - j2;
    }

    private static long d(Date date) {
        if (date == null) {
            return -1L;
        }
        return date.getTime();
    }

    private static long e(Long l) {
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // com.ttnet.org.chromium.net.u.a
    public void b(u uVar) {
        u.b a;
        JSONObject jSONObject;
        if (this.b == null || uVar == null || (a = uVar.a()) == null) {
            return;
        }
        com.bytedance.frameworks.baselib.network.http.b bVar = this.b;
        d(a.u());
        Objects.requireNonNull(bVar);
        this.b.f5083d.a0(c(d(a.f()), d(a.g())));
        this.b.f5083d.d0(c(d(a.d()), d(a.e())));
        this.b.f5083d.f0(c(d(a.E()), d(a.F())));
        this.b.f5083d.c0(c(d(a.A()), d(a.B())));
        RetrofitMetrics retrofitMetrics = this.b.f5083d;
        long c2 = c(d(a.m()), d(a.n()));
        retrofitMetrics.F0.f5888d.f5908e = c2;
        WeakReference<z> weakReference = retrofitMetrics.f5990c;
        if (weakReference != null) {
            weakReference.get().c(c2);
        }
        this.b.f5083d.e0(e(a.H()));
        this.b.f5083d.b0(c(d(a.r()), d(a.x())));
        this.b.f5083d.g0(e(a.G()));
        RetrofitMetrics retrofitMetrics2 = this.b.f5083d;
        long e2 = e(a.a());
        retrofitMetrics2.F0.f5888d.i = e2;
        retrofitMetrics2.w0 = e2;
        RetrofitMetrics retrofitMetrics3 = this.b.f5083d;
        long e3 = e(a.z());
        retrofitMetrics3.F0.f5888d.j = e3;
        retrofitMetrics3.x0 = e3;
        RetrofitMetrics retrofitMetrics4 = this.b.f5083d;
        Integer q = a.q();
        int intValue = q == null ? -1 : q.intValue();
        retrofitMetrics4.F0.f5889e.b = intValue;
        retrofitMetrics4.y0 = intValue;
        RetrofitMetrics retrofitMetrics5 = this.b.f5083d;
        long v = a.v();
        long h = a.h();
        long i = a.i();
        long o = a.o();
        long b = a.b();
        A a2 = retrofitMetrics5.F0;
        A.b bVar2 = a2.a;
        bVar2.f5900g = h;
        bVar2.h = i;
        A.e eVar = a2.f5889e;
        eVar.f5912d = v;
        if (!eVar.f5913e) {
            A.a aVar = a2.b;
            if (aVar.i == -1) {
                long j = retrofitMetrics5.E0.a.t;
                if (j != -1 && h > j) {
                    aVar.i = h - j;
                }
            }
            aVar.j = b;
            a2.f5887c.j = o;
        }
        this.b.f5083d.i0(a.t());
        com.bytedance.frameworks.baselib.network.http.cronet.impl.f fVar = new com.bytedance.frameworks.baselib.network.http.cronet.impl.f();
        com.bytedance.frameworks.baselib.network.http.b bVar3 = this.b;
        bVar3.f5083d.F0.f5889e.f5914f = fVar;
        bVar3.s = a.j() + Constants.COLON_SEPARATOR + a.k();
        this.b.w = a.D();
        this.b.t = e(a.C());
        this.b.u = e(a.p());
        com.bytedance.frameworks.baselib.network.http.b bVar4 = this.b;
        e(a.y());
        Objects.requireNonNull(bVar4);
        this.b.D = a.s();
        this.b.E = a.w();
        this.b.H = a.l();
        this.b.I = a.c();
        if (TextUtils.isEmpty(this.b.A) && (jSONObject = this.b.B) != null) {
            JSONObject n = k.j() != null ? ((com.bytedance.ttnet.config.b) k.j()).n() : null;
            if (n != null) {
                try {
                    jSONObject.put("ab_test", n);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
        }
        try {
            com.bytedance.frameworks.baselib.network.http.b bVar5 = this.b;
            bVar5.f5083d.e0.put("sentByteCount", Long.valueOf(bVar5.t));
            com.bytedance.frameworks.baselib.network.http.b bVar6 = this.b;
            bVar6.f5083d.e0.put("receivedByteCount", Long.valueOf(bVar6.u));
            com.bytedance.frameworks.baselib.network.http.b bVar7 = this.b;
            bVar7.B.put("retrofit", bVar7.f5083d.C());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.b.f5083d.G();
    }
}
