package com.bytedance.crash.monitor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.J;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends h {
    private static final ArrayList<f> o = new ArrayList<>();
    protected final CacheManager m;
    private c n;

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4635c;

        a(String str, long j, String str2) {
            this.a = str;
            this.b = j;
            this.f4635c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.m.q(this.a);
            f.this.m.u(this.b, 0L, 0L, this.f4635c);
        }
    }

    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4637c;

        b(String str, long j, String str2) {
            this.a = str;
            this.b = j;
            this.f4637c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.m.q(this.a);
            f.this.m.u(this.b, 0L, 0L, this.f4637c);
        }
    }

    f(@NonNull J j) {
        super(j);
        o.add(this);
        this.m = new CacheManager(C0652g.k());
    }

    @NonNull
    static ArrayList<f> u() {
        return o;
    }

    @Override // com.bytedance.crash.monitor.h
    public String b() {
        return this.f4642d != null ? this.f4642d : this.m.d();
    }

    @Override // com.bytedance.crash.monitor.h
    public String d() {
        return this.f4645g != null ? this.f4645g : this.m.h();
    }

    @Override // com.bytedance.crash.monitor.h
    public String f(String str) {
        if (!TextUtils.isEmpty(this.f4644f)) {
            return this.f4644f;
        }
        String k = this.m.k();
        return TextUtils.isEmpty(k) ? str : k;
    }

    @Override // com.bytedance.crash.monitor.h
    public long i() {
        return l().b();
    }

    @Override // com.bytedance.crash.monitor.h
    public long k() {
        return this.f4643e != 0 ? this.f4643e : this.m.m(0L);
    }

    @Override // com.bytedance.crash.monitor.h
    @NonNull
    public c l() {
        c cVar = this.n;
        if (cVar != null) {
            return cVar;
        }
        if (this.h == null || this.i == 0) {
            this.n = this.m.n();
        } else {
            this.n = new c(this.i, this.k, this.j, this.h);
        }
        return this.n;
    }

    @Override // com.bytedance.crash.monitor.h
    public long m() {
        return l().c();
    }

    @Override // com.bytedance.crash.monitor.h
    public String n() {
        return l().d();
    }

    @Override // com.bytedance.crash.monitor.h
    public void q(@NonNull String str) {
        this.f4645g = str;
        this.m.r(str);
    }

    @Override // com.bytedance.crash.monitor.h
    public void r(@NonNull String str) {
        this.f4644f = str;
        this.m.s(str);
    }

    public String s(long j) {
        return this.m.e(j);
    }

    public String t(long j) {
        return this.m.i(j);
    }

    public String v(long j) {
        String l = this.m.l(j);
        return TextUtils.isEmpty(l) ? "0" : l;
    }

    public long w() {
        return l().a();
    }

    public long x(long j) {
        return this.m.m(j);
    }

    public c y(long j) {
        return this.m.o(j);
    }

    public void z(long j) {
        this.f4643e = j;
        this.m.t(j);
    }

    f(@NonNull J j, @NonNull String str, @NonNull String str2, long j2) {
        super(j, str, str2, j2, 0L, 0L);
        o.add(this);
        CacheManager cacheManager = new CacheManager(C0652g.k(), str);
        this.m = cacheManager;
        if (com.bytedance.crash.runtime.b.c()) {
            cacheManager.q(str);
            cacheManager.u(j2, 0L, 0L, str2);
        } else {
            com.bytedance.crash.runtime.b.d(new a(str, j2, str2));
        }
    }

    f(@NonNull String str, @NonNull String str2, long j) {
        super(str, str2, j, 0L, 0L);
        o.add(this);
        CacheManager cacheManager = new CacheManager(C0652g.k(), str);
        this.m = cacheManager;
        if (com.bytedance.crash.runtime.b.c()) {
            cacheManager.q(str);
            cacheManager.u(j, 0L, 0L, str2);
        } else {
            com.bytedance.crash.runtime.b.d(new b(str, j, str2));
        }
    }
}
