package com.bytedance.apm.B.l;

import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class g implements d {
    private File a;
    private List<String> b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private long f3279c = -1;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f3280d = 0;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f3281e = 0;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f3282f = 0;

    /* renamed from: g, reason: collision with root package name */
    private volatile long f3283g = 0;
    private volatile long h = 0;
    private volatile long i = 0;
    private volatile long j = 0;
    private volatile long k = 0;

    /* JADX WARN: Can't wrap try/catch for region: R(14:58|59|(6:61|62|63|65|66|(11:68|69|70|71|72|(9:74|75|76|78|79|(1:81)(5:85|86|87|(1:89)|90)|82|83|84)|97|90|82|83|84)(6:101|102|103|105|106|(1:108)))(1:117)|109|69|70|71|72|(0)|97|90|82|83|84) */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.B.l.g.k():void");
    }

    @Override // com.bytedance.apm.B.l.d
    public long a() {
        k();
        long j = this.f3281e;
        k();
        return j + this.f3280d;
    }

    @Override // com.bytedance.apm.B.l.d
    public long b() {
        k();
        return this.f3281e;
    }

    @Override // com.bytedance.apm.B.l.d
    public long c() {
        k();
        long j = this.f3281e;
        k();
        long j2 = j + this.f3283g;
        k();
        long j3 = this.f3280d;
        k();
        return j2 + j3 + this.f3282f;
    }

    @Override // com.bytedance.apm.B.l.d
    public void d(boolean z) {
    }

    @Override // com.bytedance.apm.B.l.d
    public long e() {
        k();
        return this.i + this.h;
    }

    @Override // com.bytedance.apm.B.l.d
    public long f() {
        k();
        return this.f3282f;
    }

    @Override // com.bytedance.apm.B.l.d
    public long g() {
        k();
        return this.f3283g;
    }

    @Override // com.bytedance.apm.B.l.d
    public long h() {
        k();
        long j = this.f3283g;
        k();
        return j + this.f3282f;
    }

    @Override // com.bytedance.apm.B.l.d
    public long i() {
        k();
        return this.f3280d;
    }

    @Override // com.bytedance.apm.B.l.d
    public void init() {
        this.a = new File("/proc/net/xt_qtaguid/stats");
    }

    @Override // com.bytedance.apm.B.l.d
    public long j() {
        k();
        return this.k + this.j;
    }
}
