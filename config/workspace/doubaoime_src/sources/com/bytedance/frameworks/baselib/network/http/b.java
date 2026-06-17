package com.bytedance.frameworks.baselib.network.http;

import com.bytedance.frameworks.baselib.network.http.c;
import com.bytedance.retrofit2.I;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.z;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b<T extends c> implements z {
    private static volatile InterfaceC0254b S = new a();
    public String D;
    public String E;
    public boolean H;
    public boolean I;
    public String M;
    public i O;
    public long P;

    /* renamed from: c, reason: collision with root package name */
    public T f5082c;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public long f5084e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public long f5085f;

    @Deprecated
    public long h;

    @Deprecated
    public long i;

    @Deprecated
    public long j;

    @Deprecated
    public long k;

    @Deprecated
    public long l;

    @Deprecated
    public long m;

    @Deprecated
    public long n;

    @Deprecated
    public long o;

    @Deprecated
    public long p;

    @Deprecated
    public long q;
    public URL r;

    @Deprecated
    public String s;

    @Deprecated
    public long t;

    @Deprecated
    public long u;

    @Deprecated
    public boolean w;
    public boolean a = false;
    public int b = -1;

    /* renamed from: d, reason: collision with root package name */
    public RetrofitMetrics f5083d = new RetrofitMetrics(this);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public long f5086g = System.currentTimeMillis();

    @Deprecated
    public int v = -1;
    public int x = -1;
    public int y = -1;
    public String z = "";

    @Deprecated
    public String A = "";
    public JSONObject B = new JSONObject();

    @Deprecated
    public boolean C = false;
    public String F = "";
    public String G = "";

    /* renamed from: J, reason: collision with root package name */
    public boolean f5081J = false;
    public boolean K = false;

    @Deprecated
    public long L = -1;

    @Deprecated
    public long N = -1;

    @Deprecated
    public boolean Q = false;

    @Deprecated
    public final AtomicBoolean R = new AtomicBoolean(false);

    class a implements InterfaceC0254b {
        a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.b.InterfaceC0254b
        public b a() {
            return new b();
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.b$b, reason: collision with other inner class name */
    public interface InterfaceC0254b {
        b a();
    }

    public static b o() {
        return S.a();
    }

    public static void p(InterfaceC0254b interfaceC0254b) {
        S = interfaceC0254b;
    }

    @Override // com.bytedance.retrofit2.z
    public void a(long j) {
        this.m = j;
    }

    @Override // com.bytedance.retrofit2.z
    public void b(long j) {
        this.q = j;
    }

    @Override // com.bytedance.retrofit2.z
    public void c(long j) {
    }

    @Override // com.bytedance.retrofit2.z
    public void d(long j) {
        this.j = j;
    }

    @Override // com.bytedance.retrofit2.z
    public void e(String str) {
        this.A = str;
    }

    @Override // com.bytedance.retrofit2.z
    public void f(long j) {
        this.n = j;
    }

    @Override // com.bytedance.retrofit2.z
    public void g(long j) {
        this.o = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.retrofit2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(org.json.JSONObject r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.b.h(org.json.JSONObject):void");
    }

    @Override // com.bytedance.retrofit2.z
    public void i(long j) {
        this.p = j;
    }

    @Override // com.bytedance.retrofit2.z
    public void j(long j) {
        this.k = j;
    }

    @Override // com.bytedance.retrofit2.z
    public void k(long j) {
        this.L = j;
    }

    @Override // com.bytedance.retrofit2.z
    public void l(long j) {
    }

    @Override // com.bytedance.retrofit2.z
    public void m(long j) {
        this.l = j;
    }

    public void n(RetrofitMetrics retrofitMetrics) {
        retrofitMetrics.f5990c = new WeakReference<>(this);
        this.f5083d = retrofitMetrics;
        I.b bVar = retrofitMetrics.E0.a;
        long j = bVar.l;
        this.f5086g = j;
        this.f5084e = j;
        this.f5085f = retrofitMetrics.a(bVar.n);
        long j2 = retrofitMetrics.E0.f5964e.f5983f;
    }
}
