package com.ttnet.org.chromium.net.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.net.u;
import java.util.Date;

@VisibleForTesting
/* renamed from: com.ttnet.org.chromium.net.impl.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0766f extends u.b {
    private boolean A;
    private boolean B;
    private int C;
    private String D;
    private long E = 0;
    private long F = -1;
    private long G = -1;
    private long H = -1;
    private long I = -1;
    private final long a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8735c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8736d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8737e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8738f;

    /* renamed from: g, reason: collision with root package name */
    private final long f8739g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final boolean n;

    @Nullable
    private final Long o;

    @Nullable
    private final Long p;

    @Nullable
    private final Long q;

    @Nullable
    private final Long r;

    @Nullable
    private final String s;

    @Nullable
    private final Long t;

    @Nullable
    private final Long u;

    @Nullable
    private final String v;

    @Nullable
    private final String w;
    private Long x;
    private Long y;
    private Integer z;

    public C0766f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16, long j17, String str2, String str3, long j18, long j19, int i, boolean z2, boolean z3, int i2) {
        this.a = j;
        this.b = j2;
        this.f8735c = j3;
        this.f8736d = j4;
        this.f8737e = j5;
        this.f8738f = j6;
        this.f8739g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = z;
        this.q = Long.valueOf(j14);
        this.r = Long.valueOf(j15);
        this.x = Long.valueOf(j18);
        this.y = Long.valueOf(j19);
        this.z = Integer.valueOf(i);
        this.A = z2;
        this.B = z3;
        this.C = i2;
        this.s = str;
        this.t = Long.valueOf(j16);
        this.u = Long.valueOf(j17);
        if (j12 == -1 || j9 == -1) {
            this.o = null;
        } else {
            this.o = Long.valueOf(j12 - j9);
        }
        if (j == -1 || j13 == -1) {
            this.p = null;
        } else {
            this.p = Long.valueOf(j13 - j);
        }
        this.v = str2;
        this.w = str3;
    }

    @Nullable
    private static Date K(long j) {
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date A() {
        return K(this.i);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date B() {
        return K(this.h);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Long C() {
        return this.q;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    public boolean D() {
        return this.n;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date E() {
        return K(this.f8739g);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date F() {
        return K(this.f8738f);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Long G() {
        return this.p;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Long H() {
        return this.o;
    }

    public void I(long j, long j2, long j3, long j4, long j5) {
        this.E = j;
        this.F = j2;
        this.G = j3;
        this.H = j4;
        this.I = j5;
    }

    public void J(String str) {
        this.D = str;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Long a() {
        return this.x;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    public long b() {
        return this.I;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    public boolean c() {
        return this.B;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date d() {
        return K(this.f8737e);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date e() {
        return K(this.f8736d);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date f() {
        return K(this.f8735c);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date g() {
        return K(this.b);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    public long h() {
        return this.F;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    public long i() {
        return this.G;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public String j() {
        return this.s;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Long k() {
        return this.t;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    public boolean l() {
        return this.A;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date m() {
        return K(this.k);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date n() {
        return K(this.j);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    public long o() {
        return this.H;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Long p() {
        return this.r;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Integer q() {
        return this.z;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date r() {
        return K(this.m);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public String s() {
        return this.v;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    public String t() {
        return this.D;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date u() {
        return K(this.a);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    public long v() {
        return this.E;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public String w() {
        return this.w;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Date x() {
        return K(this.l);
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Long y() {
        return this.u;
    }

    @Override // com.ttnet.org.chromium.net.u.b
    @Nullable
    public Long z() {
        return this.y;
    }
}
