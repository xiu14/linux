package com.bytedance.common.a.e;

/* loaded from: classes.dex */
public final class g {
    private final boolean a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4125c;

    public g(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.f4125c = z3;
    }

    public final boolean a() {
        return this.f4125c;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.f4125c == gVar.f4125c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
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
        int i3 = (i + i2) * 31;
        boolean z2 = this.f4125c;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("KbdDefaultLayoutParams(langSwitchOnLeftSide=");
        M.append(this.a);
        M.append(", swipeToCommitSymbols=");
        M.append(this.b);
        M.append(", commaPeriodSplit=");
        return e.a.a.a.a.L(M, this.f4125c, ')');
    }
}
