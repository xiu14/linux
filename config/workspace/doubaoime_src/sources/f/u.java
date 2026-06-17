package f;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;

/* loaded from: classes2.dex */
public final class u {
    public final byte[] a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f10061c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10062d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10063e;

    /* renamed from: f, reason: collision with root package name */
    public u f10064f;

    /* renamed from: g, reason: collision with root package name */
    public u f10065g;

    public u() {
        this.a = new byte[8192];
        this.f10063e = true;
        this.f10062d = false;
    }

    public final u a() {
        u uVar = this.f10064f;
        u uVar2 = uVar != this ? uVar : null;
        u uVar3 = this.f10065g;
        if (uVar3 == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        uVar3.f10064f = uVar;
        u uVar4 = this.f10064f;
        if (uVar4 == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        uVar4.f10065g = uVar3;
        this.f10064f = null;
        this.f10065g = null;
        return uVar2;
    }

    public final u b(u uVar) {
        kotlin.s.c.l.g(uVar, MonitorConstants.SEGMENT);
        uVar.f10065g = this;
        uVar.f10064f = this.f10064f;
        u uVar2 = this.f10064f;
        if (uVar2 == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        uVar2.f10065g = uVar;
        this.f10064f = uVar;
        return uVar;
    }

    public final u c() {
        this.f10062d = true;
        return new u(this.a, this.b, this.f10061c, true, false);
    }

    public final void d(u uVar, int i) {
        kotlin.s.c.l.g(uVar, "sink");
        if (!uVar.f10063e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = uVar.f10061c;
        if (i2 + i > 8192) {
            if (uVar.f10062d) {
                throw new IllegalArgumentException();
            }
            int i3 = uVar.b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = uVar.a;
            com.prolificinteractive.materialcalendarview.r.w(bArr, i3, bArr, 0, i2 - i3);
            uVar.f10061c -= uVar.b;
            uVar.b = 0;
        }
        com.prolificinteractive.materialcalendarview.r.w(this.a, this.b, uVar.a, uVar.f10061c, i);
        uVar.f10061c += i;
        this.b += i;
    }

    public u(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        kotlin.s.c.l.g(bArr, RemoteMessageConst.DATA);
        this.a = bArr;
        this.b = i;
        this.f10061c = i2;
        this.f10062d = z;
        this.f10063e = z2;
    }
}
