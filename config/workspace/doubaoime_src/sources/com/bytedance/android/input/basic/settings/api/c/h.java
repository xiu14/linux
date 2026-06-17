package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class h {

    @SerializedName("lang_switch_position")
    private final int a;

    @SerializedName("digital_symbol_split")
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("comma_period_split")
    private final boolean f2102c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("swipe_to_commit_symbols")
    private final boolean f2103d;

    public h() {
        this(0, false, false, false, 15);
    }

    public h(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.f2102c = z2;
        this.f2103d = z3;
    }

    public final boolean a() {
        return this.f2102c;
    }

    public final boolean b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.f2103d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.f2102c == hVar.f2102c && this.f2103d == hVar.f2103d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f2102c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f2103d;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("KeyboardDefaultLayoutAndroidConfig(langSwitchPosition=");
        M.append(this.a);
        M.append(", digitalSymbolSplit=");
        M.append(this.b);
        M.append(", commaPeriodSplit=");
        M.append(this.f2102c);
        M.append(", swipeToCommitSymbols=");
        return e.a.a.a.a.L(M, this.f2103d, ')');
    }

    public h(int i, boolean z, boolean z2, boolean z3, int i2) {
        i = (i2 & 1) != 0 ? 2 : i;
        z = (i2 & 2) != 0 ? false : z;
        z2 = (i2 & 4) != 0 ? false : z2;
        z3 = (i2 & 8) != 0 ? false : z3;
        this.a = i;
        this.b = z;
        this.f2102c = z2;
        this.f2103d = z3;
    }
}
