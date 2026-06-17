package com.obric.common.upgrade;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class f {

    @SerializedName("is_system_halt")
    private final boolean a = false;

    @SerializedName("is_system_reboot")
    private final boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("is_system_component")
    private final boolean f7568c = false;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("is_black_list")
    private final boolean f7569d = false;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.f7568c == fVar.f7568c && this.f7569d == fVar.f7569d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
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
        int i3 = (i + i2) * 31;
        ?? r22 = this.f7568c;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.f7569d;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AppTag(isSystemHalt=");
        M.append(this.a);
        M.append(", isSystemReboot=");
        M.append(this.b);
        M.append(", isSystemComponent=");
        M.append(this.f7568c);
        M.append(", isBlackList=");
        return e.a.a.a.a.L(M, this.f7569d, ')');
    }
}
