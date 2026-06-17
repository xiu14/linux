package com.bytedance.android.input.basic.settings.api.c;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class d {

    @SerializedName("is_throttle_llm")
    private boolean a;

    @SerializedName("is_support_req_opt")
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("req_opt_second_timeout")
    private int f2090c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("speed_mode")
    private m f2091d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("quality_mode")
    private m f2092e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("association_first_refresh")
    private int f2093f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("association_second_refresh")
    private int f2094g;

    @SerializedName("is_support_association_opt")
    private boolean h;

    public d() {
        this(false, false, 0, null, null, 0, 0, false, 255);
    }

    public d(boolean z, boolean z2, int i, m mVar, m mVar2, int i2, int i3, boolean z3, int i4) {
        z = (i4 & 1) != 0 ? true : z;
        z2 = (i4 & 2) != 0 ? true : z2;
        i = (i4 & 4) != 0 ? ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION : i;
        m mVar3 = (i4 & 8) != 0 ? new m(50, 200, 500) : null;
        m mVar4 = (i4 & 16) != 0 ? new m(100, 200, 500) : null;
        i2 = (i4 & 32) != 0 ? 200 : i2;
        i3 = (i4 & 64) != 0 ? 500 : i3;
        z3 = (i4 & 128) != 0 ? false : z3;
        kotlin.s.c.l.f(mVar3, "speedMode");
        kotlin.s.c.l.f(mVar4, "qualityMode");
        this.a = z;
        this.b = z2;
        this.f2090c = i;
        this.f2091d = mVar3;
        this.f2092e = mVar4;
        this.f2093f = i2;
        this.f2094g = i3;
        this.h = z3;
    }

    public final int a() {
        return this.f2093f;
    }

    public final int b() {
        return this.f2094g;
    }

    public final m c() {
        return this.f2092e;
    }

    public final int d() {
        return this.f2090c;
    }

    public final boolean e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.f2090c == dVar.f2090c && kotlin.s.c.l.a(this.f2091d, dVar.f2091d) && kotlin.s.c.l.a(this.f2092e, dVar.f2092e) && this.f2093f == dVar.f2093f && this.f2094g == dVar.f2094g && this.h == dVar.h;
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int I = e.a.a.a.a.I(this.f2094g, e.a.a.a.a.I(this.f2093f, (this.f2092e.hashCode() + ((this.f2091d.hashCode() + e.a.a.a.a.I(this.f2090c, (i + i2) * 31, 31)) * 31)) * 31, 31), 31);
        boolean z2 = this.h;
        return I + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CandidateConfig(isThrottleLlm=");
        M.append(this.a);
        M.append(", isSupportReqOpt=");
        M.append(this.b);
        M.append(", reqOptSecondTimeout=");
        M.append(this.f2090c);
        M.append(", speedMode=");
        M.append(this.f2091d);
        M.append(", qualityMode=");
        M.append(this.f2092e);
        M.append(", associationFirstRefresh=");
        M.append(this.f2093f);
        M.append(", associationSecondRefresh=");
        M.append(this.f2094g);
        M.append(", isSupportAssociationOpt=");
        return e.a.a.a.a.L(M, this.h, ')');
    }
}
