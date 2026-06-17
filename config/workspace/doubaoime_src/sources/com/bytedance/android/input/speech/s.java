package com.bytedance.android.input.speech;

import com.bytedance.android.input.common.asr.api.IAsr;
import com.ss.android.socialbase.downloader.constants.DBDefinition;

/* loaded from: classes.dex */
public final class s {
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f3142c;

    /* renamed from: d, reason: collision with root package name */
    private int f3143d;

    /* renamed from: e, reason: collision with root package name */
    private IAsr.ErrorType f3144e;

    /* renamed from: f, reason: collision with root package name */
    private v f3145f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3146g;
    private long h;
    private boolean i;
    private boolean j;

    public s(int i, String str, String str2, int i2, IAsr.ErrorType errorType, v vVar, boolean z, long j, boolean z2, boolean z3, int i3) {
        str = (i3 & 2) != 0 ? "" : str;
        str2 = (i3 & 4) != 0 ? "" : str2;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        errorType = (i3 & 16) != 0 ? IAsr.ErrorType.NET_ERROR : errorType;
        v vVar2 = (i3 & 32) != 0 ? new v("", null) : null;
        z = (i3 & 64) != 0 ? false : z;
        j = (i3 & 128) != 0 ? 0L : j;
        z2 = (i3 & 256) != 0 ? true : z2;
        z3 = (i3 & 512) != 0 ? false : z3;
        kotlin.s.c.l.f(str, "text");
        kotlin.s.c.l.f(str2, DBDefinition.TASK_ID);
        kotlin.s.c.l.f(errorType, "errType");
        kotlin.s.c.l.f(vVar2, "endInfo");
        this.a = i;
        this.b = str;
        this.f3142c = str2;
        this.f3143d = i2;
        this.f3144e = errorType;
        this.f3145f = vVar2;
        this.f3146g = z;
        this.h = j;
        this.i = z2;
        this.j = z3;
    }

    public final int a() {
        return this.f3143d;
    }

    public final IAsr.ErrorType b() {
        return this.f3144e;
    }

    public final long c() {
        return this.h;
    }

    public final String d() {
        return this.f3142c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && kotlin.s.c.l.a(this.b, sVar.b) && kotlin.s.c.l.a(this.f3142c, sVar.f3142c) && this.f3143d == sVar.f3143d && this.f3144e == sVar.f3144e && kotlin.s.c.l.a(this.f3145f, sVar.f3145f) && this.f3146g == sVar.f3146g && this.h == sVar.h && this.i == sVar.i && this.j == sVar.j;
    }

    public final int f() {
        return this.a;
    }

    public final boolean g() {
        return this.j;
    }

    public final boolean h() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.f3145f.hashCode() + ((this.f3144e.hashCode() + e.a.a.a.a.I(this.f3143d, e.a.a.a.a.p0(this.f3142c, e.a.a.a.a.p0(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31)) * 31)) * 31;
        boolean z = this.f3146g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (Long.hashCode(this.h) + ((hashCode + i) * 31)) * 31;
        boolean z2 = this.i;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.j;
        return i3 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final boolean i() {
        return this.f3146g;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AsrCallBackInfo(type=");
        M.append(this.a);
        M.append(", text=");
        M.append(this.b);
        M.append(", taskId=");
        M.append(this.f3142c);
        M.append(", errCode=");
        M.append(this.f3143d);
        M.append(", errType=");
        M.append(this.f3144e);
        M.append(", endInfo=");
        M.append(this.f3145f);
        M.append(", isStreamFinish=");
        M.append(this.f3146g);
        M.append(", startTime=");
        M.append(this.h);
        M.append(", isOffline=");
        M.append(this.i);
        M.append(", isFinish=");
        return e.a.a.a.a.L(M, this.j, ')');
    }
}
