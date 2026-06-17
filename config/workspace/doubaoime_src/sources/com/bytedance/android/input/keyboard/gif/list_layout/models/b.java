package com.bytedance.android.input.keyboard.gif.list_layout.models;

import com.google.gson.annotations.SerializedName;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {

    @SerializedName("url")
    private final String a;

    @SerializedName("width")
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("height")
    private final int f2744c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("storage_size")
    private final long f2745d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("score")
    private final double f2746e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("frames")
    private final int f2747f;

    /* renamed from: g, reason: collision with root package name */
    private final transient boolean f2748g;
    private transient ImeImageState h;

    public b(String str, int i, int i2, long j, double d2, int i3, boolean z, ImeImageState imeImageState, int i4) {
        i = (i4 & 2) != 0 ? 0 : i;
        i2 = (i4 & 4) != 0 ? 0 : i2;
        j = (i4 & 8) != 0 ? 0L : j;
        d2 = (i4 & 16) != 0 ? 0.0d : d2;
        i3 = (i4 & 32) != 0 ? 0 : i3;
        z = (i4 & 64) != 0 ? false : z;
        ImeImageState imeImageState2 = (i4 & 128) != 0 ? ImeImageState.LOADING : null;
        l.f(str, "url");
        this.a = str;
        this.b = i;
        this.f2744c = i2;
        this.f2745d = j;
        this.f2746e = d2;
        this.f2747f = i3;
        this.f2748g = z;
        this.h = imeImageState2;
    }

    public final ImeImageState a() {
        return this.h;
    }

    public final ImeMimeType b() {
        return this.f2747f == 0 ? ImeMimeType.IMAGE : ImeMimeType.GIF;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.f2748g;
    }

    public final void e(ImeImageState imeImageState) {
        this.h = imeImageState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.a, bVar.a) && this.b == bVar.b && this.f2744c == bVar.f2744c && this.f2745d == bVar.f2745d && Double.compare(this.f2746e, bVar.f2746e) == 0 && this.f2747f == bVar.f2747f && this.f2748g == bVar.f2748g && this.h == bVar.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int I = e.a.a.a.a.I(this.f2747f, (Double.hashCode(this.f2746e) + ((Long.hashCode(this.f2745d) + e.a.a.a.a.I(this.f2744c, e.a.a.a.a.I(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31, 31);
        boolean z = this.f2748g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (I + i) * 31;
        ImeImageState imeImageState = this.h;
        return i2 + (imeImageState == null ? 0 : imeImageState.hashCode());
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("EmoticonsItemData(url=");
        M.append(this.a);
        M.append(", width=");
        M.append(this.b);
        M.append(", height=");
        M.append(this.f2744c);
        M.append(", storageSize=");
        M.append(this.f2745d);
        M.append(", score=");
        M.append(this.f2746e);
        M.append(", frames=");
        M.append(this.f2747f);
        M.append(", isEmptyItem=");
        M.append(this.f2748g);
        M.append(", imageState=");
        M.append(this.h);
        M.append(')');
        return M.toString();
    }
}
