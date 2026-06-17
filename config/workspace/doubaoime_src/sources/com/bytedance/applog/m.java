package com.bytedance.applog;

import com.bytedance.bdinstall.C0641v;

/* loaded from: classes.dex */
public class m {
    private final String[] a;
    private final String[] b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3798c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3799d;

    /* renamed from: e, reason: collision with root package name */
    private final C0641v f3800e;

    public static class b {
        private String[] a;
        private String[] b;

        /* renamed from: c, reason: collision with root package name */
        private String f3801c;

        /* renamed from: d, reason: collision with root package name */
        private String f3802d;

        /* renamed from: e, reason: collision with root package name */
        private C0641v f3803e;

        public m f() {
            return new m(this, null);
        }

        public b g(C0641v c0641v) {
            this.f3803e = c0641v;
            return this;
        }

        public b h(String str) {
            this.f3802d = str;
            return this;
        }

        public b i(String[] strArr) {
            this.b = strArr;
            return this;
        }

        public b j(String[] strArr) {
            this.a = strArr;
            return this;
        }

        public b k(String str) {
            this.f3801c = str;
            return this;
        }
    }

    m(b bVar, a aVar) {
        this.f3800e = bVar.f3803e;
        this.a = bVar.a;
        this.b = bVar.b;
        this.f3798c = bVar.f3801c;
        this.f3799d = bVar.f3802d;
    }

    public C0641v a() {
        return this.f3800e;
    }

    public String b() {
        return this.f3799d;
    }

    public String[] c() {
        return this.b;
    }

    public String[] d() {
        return this.a;
    }

    public String e() {
        return this.f3798c;
    }
}
