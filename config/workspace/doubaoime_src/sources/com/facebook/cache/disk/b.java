package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import e.c.c.d.k;
import java.io.File;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b {
    private final int a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.c.d.j<File> f6287c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6288d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6289e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6290f;

    /* renamed from: g, reason: collision with root package name */
    private final h f6291g;
    private final CacheErrorLogger h;
    private final CacheEventListener i;
    private final e.c.c.a.b j;
    private final Context k;
    private String l;
    private e.c.c.d.j<File> m;

    class a implements e.c.c.d.j<File> {
        a() {
        }

        @Override // e.c.c.d.j
        public File get() {
            return b.this.k.getApplicationContext().getCacheDir();
        }
    }

    /* renamed from: com.facebook.cache.disk.b$b, reason: collision with other inner class name */
    public static class C0322b {
        private e.c.c.d.j<File> b;

        /* renamed from: e, reason: collision with root package name */
        private e.c.c.a.b f6294e;

        /* renamed from: f, reason: collision with root package name */
        private e.c.c.d.j<File> f6295f;

        /* renamed from: g, reason: collision with root package name */
        private final Context f6296g;
        private String a = "image_cache";

        /* renamed from: c, reason: collision with root package name */
        private long f6292c = 41943040;

        /* renamed from: d, reason: collision with root package name */
        private h f6293d = new com.facebook.cache.disk.a();

        /* renamed from: com.facebook.cache.disk.b$b$a */
        class a implements e.c.c.d.j<File> {
            a() {
            }

            @Override // e.c.c.d.j
            public File get() {
                return C0322b.this.f6296g.getApplicationContext().getCacheDir();
            }
        }

        C0322b(Context context, a aVar) {
            this.f6296g = context;
        }

        static /* synthetic */ String e(C0322b c0322b) {
            return "image_config";
        }

        static /* synthetic */ int g(C0322b c0322b) {
            Objects.requireNonNull(c0322b);
            return 1;
        }

        static /* synthetic */ long j(C0322b c0322b) {
            Objects.requireNonNull(c0322b);
            return 10485760L;
        }

        static /* synthetic */ long k(C0322b c0322b) {
            Objects.requireNonNull(c0322b);
            return 2097152L;
        }

        public b m() {
            e.c.c.d.h.g((this.b == null && this.f6296g == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.b == null && this.f6296g != null) {
                this.b = new a();
            }
            if (this.f6295f == null && this.f6296g != null) {
                this.f6295f = this.b;
            }
            return new b(this);
        }

        public C0322b n(String str) {
            this.a = str;
            return this;
        }

        public C0322b o(File file) {
            this.b = k.a(null);
            return this;
        }

        public C0322b p(e.c.c.a.b bVar) {
            this.f6294e = bVar;
            return this;
        }
    }

    protected b(C0322b c0322b) {
        Context context = c0322b.f6296g;
        this.k = context;
        e.c.c.d.h.g((c0322b.b == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (c0322b.b == null && context != null) {
            c0322b.b = new a();
        }
        this.a = C0322b.g(c0322b);
        String str = c0322b.a;
        Objects.requireNonNull(str);
        this.b = str;
        e.c.c.d.j<File> jVar = c0322b.b;
        Objects.requireNonNull(jVar);
        this.f6287c = jVar;
        this.f6288d = c0322b.f6292c;
        this.f6289e = C0322b.j(c0322b);
        this.f6290f = C0322b.k(c0322b);
        h hVar = c0322b.f6293d;
        Objects.requireNonNull(hVar);
        this.f6291g = hVar;
        this.h = com.facebook.cache.common.f.a();
        this.i = com.facebook.cache.common.g.i();
        this.j = c0322b.f6294e == null ? e.c.c.a.c.a() : c0322b.f6294e;
        this.l = C0322b.e(c0322b);
        this.m = c0322b.f6295f;
    }

    public static C0322b n(Context context) {
        return new C0322b(context, null);
    }

    public String b() {
        return this.b;
    }

    public e.c.c.d.j<File> c() {
        return this.f6287c;
    }

    public CacheErrorLogger d() {
        return this.h;
    }

    public CacheEventListener e() {
        return this.i;
    }

    public String f() {
        return this.l;
    }

    public e.c.c.d.j<File> g() {
        return this.m;
    }

    public long h() {
        return this.f6288d;
    }

    public e.c.c.a.b i() {
        return this.j;
    }

    public h j() {
        return this.f6291g;
    }

    public long k() {
        return this.f6289e;
    }

    public long l() {
        return this.f6290f;
    }

    public int m() {
        return this.a;
    }
}
