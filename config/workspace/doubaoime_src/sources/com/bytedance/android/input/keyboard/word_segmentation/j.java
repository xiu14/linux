package com.bytedance.android.input.keyboard.word_segmentation;

/* loaded from: classes.dex */
public final class j {
    private final WordSegmentationItemType a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2830c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2831d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2832e;

    public j(WordSegmentationItemType wordSegmentationItemType, String str, int i, boolean z, boolean z2) {
        kotlin.s.c.l.f(wordSegmentationItemType, "itemType");
        kotlin.s.c.l.f(str, "text");
        this.a = wordSegmentationItemType;
        this.b = str;
        this.f2830c = i;
        this.f2831d = z;
        this.f2832e = z2;
    }

    public final WordSegmentationItemType a() {
        return this.a;
    }

    public final int b() {
        return this.f2830c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.f2832e;
    }

    public final boolean e() {
        return this.f2831d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && kotlin.s.c.l.a(this.b, jVar.b) && this.f2830c == jVar.f2830c && this.f2831d == jVar.f2831d && this.f2832e == jVar.f2832e;
    }

    public final void f(boolean z) {
        this.f2831d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int I = e.a.a.a.a.I(this.f2830c, e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.f2831d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (I + i) * 31;
        boolean z2 = this.f2832e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("WordSegmentationItemData(itemType=");
        M.append(this.a);
        M.append(", text=");
        M.append(this.b);
        M.append(", originIndex=");
        M.append(this.f2830c);
        M.append(", isSelected=");
        M.append(this.f2831d);
        M.append(", wrapBefore=");
        return e.a.a.a.a.L(M, this.f2832e, ')');
    }
}
