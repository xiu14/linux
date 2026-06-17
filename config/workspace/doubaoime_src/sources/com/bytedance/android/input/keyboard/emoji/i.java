package com.bytedance.android.input.keyboard.emoji;

/* loaded from: classes.dex */
public final class i {
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f2719c;

    public i(int i, String str, int i2, int i3) {
        i2 = (i3 & 4) != 0 ? i : i2;
        kotlin.s.c.l.f(str, "text");
        this.a = i;
        this.b = str;
        this.f2719c = i2;
    }

    public static i a(i iVar, int i, String str, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = iVar.a;
        }
        String str2 = (i3 & 2) != 0 ? iVar.b : null;
        if ((i3 & 4) != 0) {
            i2 = iVar.f2719c;
        }
        kotlin.s.c.l.f(str2, "text");
        return new i(i, str2, i2);
    }

    public final int b() {
        return this.f2719c;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final void e(int i) {
        this.f2719c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && kotlin.s.c.l.a(this.b, iVar.b) && this.f2719c == iVar.f2719c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f2719c) + e.a.a.a.a.p0(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("EmojiItem(span=");
        M.append(this.a);
        M.append(", text=");
        M.append(this.b);
        M.append(", fixedSpan=");
        return e.a.a.a.a.C(M, this.f2719c, ')');
    }

    public i(int i, String str, int i2) {
        kotlin.s.c.l.f(str, "text");
        this.a = i;
        this.b = str;
        this.f2719c = i2;
    }
}
