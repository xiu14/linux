package com.obric.common.upgrade;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class k {

    @SerializedName("patch_url")
    private final String a;

    @SerializedName("patch_md5")
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("patch_size")
    private final long f7574c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("base_version_code")
    private final int f7575d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("base_version_name")
    private final String f7576e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("base_apk_identity")
    private final String f7577f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("base_md5")
    private final String f7578g;

    @SerializedName("base_size")
    private final long h;

    public k() {
        kotlin.s.c.l.f("", "patchUrl");
        kotlin.s.c.l.f("", "patchMd5");
        kotlin.s.c.l.f("", "baseVersionName");
        kotlin.s.c.l.f("", "baseApkIdentity");
        kotlin.s.c.l.f("", "baseMd5");
        this.a = "";
        this.b = "";
        this.f7574c = 0L;
        this.f7575d = 0;
        this.f7576e = "";
        this.f7577f = "";
        this.f7578g = "";
        this.h = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.s.c.l.a(this.a, kVar.a) && kotlin.s.c.l.a(this.b, kVar.b) && this.f7574c == kVar.f7574c && this.f7575d == kVar.f7575d && kotlin.s.c.l.a(this.f7576e, kVar.f7576e) && kotlin.s.c.l.a(this.f7577f, kVar.f7577f) && kotlin.s.c.l.a(this.f7578g, kVar.f7578g) && this.h == kVar.h;
    }

    public int hashCode() {
        return Long.hashCode(this.h) + e.a.a.a.a.p0(this.f7578g, e.a.a.a.a.p0(this.f7577f, e.a.a.a.a.p0(this.f7576e, e.a.a.a.a.I(this.f7575d, (Long.hashCode(this.f7574c) + e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("PatchInfo(patchUrl=");
        M.append(this.a);
        M.append(", patchMd5=");
        M.append(this.b);
        M.append(", patchSize=");
        M.append(this.f7574c);
        M.append(", baseVersionCode=");
        M.append(this.f7575d);
        M.append(", baseVersionName=");
        M.append(this.f7576e);
        M.append(", baseApkIdentity=");
        M.append(this.f7577f);
        M.append(", baseMd5=");
        M.append(this.f7578g);
        M.append(", baseSize=");
        return e.a.a.a.a.E(M, this.h, ')');
    }
}
