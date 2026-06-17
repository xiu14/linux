package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    @SerializedName("package")
    private String a;

    @SerializedName("dids")
    private List<String> b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("deadline")
    private long f2118c;

    public l() {
        this(null, null, 0L, 7);
    }

    public l(String str, List list, long j, int i) {
        String str2 = (i & 1) != 0 ? "com.obric.android.input" : null;
        int i2 = i & 2;
        j = (i & 4) != 0 ? 1761926399000L : j;
        kotlin.s.c.l.f(str2, DBDefinition.PACKAGE_NAME);
        this.a = str2;
        this.b = null;
        this.f2118c = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.s.c.l.a(this.a, lVar.a) && kotlin.s.c.l.a(this.b, lVar.b) && this.f2118c == lVar.f2118c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<String> list = this.b;
        return Long.hashCode(this.f2118c) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ThirdConfig(packageName=");
        M.append(this.a);
        M.append(", dids=");
        M.append(this.b);
        M.append(", deadline=");
        return e.a.a.a.a.E(M, this.f2118c, ')');
    }
}
