package com.obric.common.upgrade;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* loaded from: classes2.dex */
public final class i {

    @SerializedName("code")
    private final int a;

    @SerializedName("msg")
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName(RemoteMessageConst.DATA)
    private final g f7573c;

    public i() {
        g gVar = new g(null, 1);
        kotlin.s.c.l.f("", "msg");
        kotlin.s.c.l.f(gVar, RemoteMessageConst.DATA);
        this.a = 0;
        this.b = "";
        this.f7573c = gVar;
    }

    public final int a() {
        return this.a;
    }

    public final g b() {
        return this.f7573c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && kotlin.s.c.l.a(this.b, iVar.b) && kotlin.s.c.l.a(this.f7573c, iVar.f7573c);
    }

    public int hashCode() {
        return this.f7573c.hashCode() + e.a.a.a.a.p0(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AppUpgradeResponse(code=");
        M.append(this.a);
        M.append(", msg=");
        M.append(this.b);
        M.append(", data=");
        M.append(this.f7573c);
        M.append(')');
        return M.toString();
    }
}
