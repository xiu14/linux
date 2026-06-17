package com.obric.common.upgrade;

import com.ss.android.socialbase.downloader.constants.DBDefinition;

/* loaded from: classes2.dex */
public final class l {
    private String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7579c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7580d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7581e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7582f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7583g;
    private final String h;
    private final String i;
    private final String j;
    private int k;
    private int l;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private boolean f7586e;
        private String a = "";
        private String b = "";

        /* renamed from: c, reason: collision with root package name */
        private long f7584c = 1;

        /* renamed from: d, reason: collision with root package name */
        private String f7585d = "";

        /* renamed from: f, reason: collision with root package name */
        private String f7587f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f7588g = "";
        private String h = "";
        private String i = "";
        private String j = "";
        private int k = 60;
        private int l = 60;

        public final l a() {
            return new l(this.a, this.b, this.f7584c, this.j, this.f7585d, this.f7586e, this.f7587f, this.f7588g, this.h, this.i, this.k, this.l);
        }

        public final a b(String str) {
            kotlin.s.c.l.f(str, "accesskey");
            this.h = str;
            return this;
        }

        public final a c(String str) {
            kotlin.s.c.l.f(str, "appId");
            this.f7588g = str;
            return this;
        }

        public final a d(int i) {
            this.k = i;
            return this;
        }

        public final a e(String str) {
            kotlin.s.c.l.f(str, "deviceModel");
            this.b = str;
            return this;
        }

        public final a f(String str) {
            kotlin.s.c.l.f(str, "did");
            this.a = str;
            return this;
        }

        public final a g(boolean z) {
            this.f7586e = z;
            return this;
        }

        public final a h(String str) {
            kotlin.s.c.l.f(str, "osVersion");
            this.f7587f = str;
            return this;
        }

        public final a i(String str) {
            kotlin.s.c.l.f(str, DBDefinition.PACKAGE_NAME);
            this.f7585d = str;
            return this;
        }

        public final a j(String str) {
            kotlin.s.c.l.f(str, "secretKey");
            this.i = str;
            return this;
        }

        public final a k(int i) {
            this.l = i;
            return this;
        }

        public final a l(long j) {
            this.f7584c = j;
            return this;
        }

        public final a m(String str) {
            kotlin.s.c.l.f(str, "versionName");
            this.j = str;
            return this;
        }
    }

    public l(String str, String str2, long j, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, int i, int i2) {
        kotlin.s.c.l.f(str, "did");
        kotlin.s.c.l.f(str2, "deviceModel");
        kotlin.s.c.l.f(str3, "versionName");
        kotlin.s.c.l.f(str4, DBDefinition.PACKAGE_NAME);
        kotlin.s.c.l.f(str5, "osVersion");
        kotlin.s.c.l.f(str6, "appId");
        kotlin.s.c.l.f(str7, "accesskey");
        kotlin.s.c.l.f(str8, "secretKey");
        this.a = str;
        this.b = str2;
        this.f7579c = j;
        this.f7580d = str3;
        this.f7581e = str4;
        this.f7582f = z;
        this.f7583g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i;
        this.l = i2;
    }

    public final String a() {
        return this.i;
    }

    public final String b() {
        return this.h;
    }

    public final int c() {
        return this.k;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public final String f() {
        return this.f7583g;
    }

    public final String g() {
        return this.f7581e;
    }

    public final String h() {
        return this.j;
    }

    public final int i() {
        return this.l;
    }

    public final long j() {
        return this.f7579c;
    }

    public final String k() {
        return this.f7580d;
    }

    public final boolean l() {
        return this.f7582f;
    }

    public final void m(int i) {
        this.k = i;
    }

    public final void n(int i) {
        this.l = i;
    }
}
