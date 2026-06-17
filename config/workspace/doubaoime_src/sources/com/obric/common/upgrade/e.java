package com.obric.common.upgrade;

import com.google.gson.annotations.SerializedName;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.vivo.push.PushClientConstants;

/* loaded from: classes2.dex */
public final class e {

    @SerializedName("file_url")
    private final String a;

    @SerializedName("file_md5")
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("file_size")
    private final long f7563c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("file_kind")
    private final int f7564d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName(MonitorConstants.PKG_NAME)
    private final String f7565e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("version_code")
    private final long f7566f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("version_name")
    private final String f7567g;

    @SerializedName("apk_identity")
    private final String h;

    @SerializedName("app_id")
    private final String i;

    @SerializedName("app_name")
    private final String j;

    @SerializedName("app_tag")
    private final f k;

    @SerializedName("patch_info")
    private final k l;

    @SerializedName("task_id")
    private final long m;

    @SerializedName("update_model")
    private final int n;

    @SerializedName("update_info")
    private final String o;

    @SerializedName("is_depended")
    private final boolean p;

    public e() {
        kotlin.s.c.l.f("", "fileUrl");
        kotlin.s.c.l.f("", "fileMd5");
        kotlin.s.c.l.f("", PushClientConstants.TAG_PKG_NAME);
        kotlin.s.c.l.f("", "versionName");
        kotlin.s.c.l.f("", "apkIdentity");
        kotlin.s.c.l.f("", "appId");
        kotlin.s.c.l.f("", "appName");
        kotlin.s.c.l.f("", "updateInfo");
        this.a = "";
        this.b = "";
        this.f7563c = 0L;
        this.f7564d = 0;
        this.f7565e = "";
        this.f7566f = 0L;
        this.f7567g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = null;
        this.l = null;
        this.m = 0L;
        this.n = 0;
        this.o = "";
        this.p = false;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.m;
    }

    public final String d() {
        return this.o;
    }

    public final int e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.s.c.l.a(this.a, eVar.a) && kotlin.s.c.l.a(this.b, eVar.b) && this.f7563c == eVar.f7563c && this.f7564d == eVar.f7564d && kotlin.s.c.l.a(this.f7565e, eVar.f7565e) && this.f7566f == eVar.f7566f && kotlin.s.c.l.a(this.f7567g, eVar.f7567g) && kotlin.s.c.l.a(this.h, eVar.h) && kotlin.s.c.l.a(this.i, eVar.i) && kotlin.s.c.l.a(this.j, eVar.j) && kotlin.s.c.l.a(this.k, eVar.k) && kotlin.s.c.l.a(this.l, eVar.l) && this.m == eVar.m && this.n == eVar.n && kotlin.s.c.l.a(this.o, eVar.o) && this.p == eVar.p;
    }

    public final long f() {
        return this.f7566f;
    }

    public final String g() {
        return this.f7567g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int p0 = e.a.a.a.a.p0(this.j, e.a.a.a.a.p0(this.i, e.a.a.a.a.p0(this.h, e.a.a.a.a.p0(this.f7567g, (Long.hashCode(this.f7566f) + e.a.a.a.a.p0(this.f7565e, e.a.a.a.a.I(this.f7564d, (Long.hashCode(this.f7563c) + e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31)) * 31, 31), 31), 31), 31);
        f fVar = this.k;
        int hashCode = (p0 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        k kVar = this.l;
        int p02 = e.a.a.a.a.p0(this.o, e.a.a.a.a.I(this.n, (Long.hashCode(this.m) + ((hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31)) * 31, 31), 31);
        boolean z = this.p;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return p02 + i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AppInfo(fileUrl=");
        M.append(this.a);
        M.append(", fileMd5=");
        M.append(this.b);
        M.append(", fileSize=");
        M.append(this.f7563c);
        M.append(", fileKind=");
        M.append(this.f7564d);
        M.append(", pkgName=");
        M.append(this.f7565e);
        M.append(", versionCode=");
        M.append(this.f7566f);
        M.append(", versionName=");
        M.append(this.f7567g);
        M.append(", apkIdentity=");
        M.append(this.h);
        M.append(", appId=");
        M.append(this.i);
        M.append(", appName=");
        M.append(this.j);
        M.append(", appTag=");
        M.append(this.k);
        M.append(", patchInfo=");
        M.append(this.l);
        M.append(", taskId=");
        M.append(this.m);
        M.append(", updateModel=");
        M.append(this.n);
        M.append(", updateInfo=");
        M.append(this.o);
        M.append(", isDepended=");
        return e.a.a.a.a.L(M, this.p, ')');
    }
}
