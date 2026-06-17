package com.bytedance.android.input.j;

import com.ss.android.message.log.PushLog;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d {
    private final String a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2448c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2449d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2450e;

    public static final class a {
        private String a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2451c;

        /* renamed from: d, reason: collision with root package name */
        private String f2452d;

        /* renamed from: e, reason: collision with root package name */
        private int f2453e;

        public a(d dVar) {
            l.f(dVar, "response");
            this.a = dVar.a();
            this.b = dVar.e();
            this.f2451c = dVar.c();
            this.f2452d = dVar.d();
            this.f2453e = dVar.b();
        }

        public final d a() {
            return new d(this.a, this.b, this.f2451c, this.f2452d, this.f2453e);
        }

        public final a b(int i) {
            this.f2453e = i;
            return this;
        }

        public final a c(boolean z) {
            this.f2451c = z;
            return this;
        }

        public final a d(String str) {
            l.f(str, PushLog.KEY_VALUE);
            this.f2452d = str;
            return this;
        }
    }

    public d(String str, int i, boolean z, String str2, int i2) {
        l.f(str, "commitStr");
        l.f(str2, "trailingText");
        this.a = str;
        this.b = i;
        this.f2448c = z;
        this.f2449d = str2;
        this.f2450e = i2;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.f2450e;
    }

    public final boolean c() {
        return this.f2448c;
    }

    public final String d() {
        return this.f2449d;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.a, dVar.a) && this.b == dVar.b && this.f2448c == dVar.f2448c && l.a(this.f2449d, dVar.f2449d) && this.f2450e == dVar.f2450e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int I = e.a.a.a.a.I(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.f2448c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.f2450e) + e.a.a.a.a.p0(this.f2449d, (I + i) * 31, 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ImeCommitResponse(commitStr=");
        M.append(this.a);
        M.append(", type=");
        M.append(this.b);
        M.append(", intercepted=");
        M.append(this.f2448c);
        M.append(", trailingText=");
        M.append(this.f2449d);
        M.append(", deleteBeforeLength=");
        return e.a.a.a.a.C(M, this.f2450e, ')');
    }
}
