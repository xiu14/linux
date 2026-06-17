package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.i.j;
import com.airbnb.lottie.model.i.k;
import com.airbnb.lottie.model.i.l;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class Layer {
    private final List<com.airbnb.lottie.model.content.b> a;
    private final com.airbnb.lottie.g b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1347c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1348d;

    /* renamed from: e, reason: collision with root package name */
    private final LayerType f1349e;

    /* renamed from: f, reason: collision with root package name */
    private final long f1350f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f1351g;
    private final List<Mask> h;
    private final l i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;

    @Nullable
    private final j q;

    @Nullable
    private final k r;

    @Nullable
    private final com.airbnb.lottie.model.i.b s;
    private final List<com.airbnb.lottie.z.a<Float>> t;
    private final MatteType u;
    private final boolean v;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<com.airbnb.lottie.model.content.b> list, com.airbnb.lottie.g gVar, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, l lVar, int i, int i2, int i3, float f2, float f3, int i4, int i5, @Nullable j jVar, @Nullable k kVar, List<com.airbnb.lottie.z.a<Float>> list3, MatteType matteType, @Nullable com.airbnb.lottie.model.i.b bVar, boolean z) {
        this.a = list;
        this.b = gVar;
        this.f1347c = str;
        this.f1348d = j;
        this.f1349e = layerType;
        this.f1350f = j2;
        this.f1351g = str2;
        this.h = list2;
        this.i = lVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f2;
        this.n = f3;
        this.o = i4;
        this.p = i5;
        this.q = jVar;
        this.r = kVar;
        this.t = list3;
        this.u = matteType;
        this.s = bVar;
        this.v = z;
    }

    com.airbnb.lottie.g a() {
        return this.b;
    }

    public long b() {
        return this.f1348d;
    }

    List<com.airbnb.lottie.z.a<Float>> c() {
        return this.t;
    }

    public LayerType d() {
        return this.f1349e;
    }

    List<Mask> e() {
        return this.h;
    }

    MatteType f() {
        return this.u;
    }

    String g() {
        return this.f1347c;
    }

    long h() {
        return this.f1350f;
    }

    int i() {
        return this.p;
    }

    int j() {
        return this.o;
    }

    @Nullable
    String k() {
        return this.f1351g;
    }

    List<com.airbnb.lottie.model.content.b> l() {
        return this.a;
    }

    int m() {
        return this.l;
    }

    int n() {
        return this.k;
    }

    int o() {
        return this.j;
    }

    float p() {
        return this.n / this.b.e();
    }

    @Nullable
    j q() {
        return this.q;
    }

    @Nullable
    k r() {
        return this.r;
    }

    @Nullable
    com.airbnb.lottie.model.i.b s() {
        return this.s;
    }

    float t() {
        return this.m;
    }

    public String toString() {
        return w("");
    }

    l u() {
        return this.i;
    }

    public boolean v() {
        return this.v;
    }

    public String w(String str) {
        StringBuilder M = e.a.a.a.a.M(str);
        M.append(this.f1347c);
        M.append("\n");
        Layer t = this.b.t(this.f1350f);
        if (t != null) {
            M.append("\t\tParents: ");
            M.append(t.f1347c);
            Layer t2 = this.b.t(t.f1350f);
            while (t2 != null) {
                M.append("->");
                M.append(t2.f1347c);
                t2 = this.b.t(t2.f1350f);
            }
            M.append(str);
            M.append("\n");
        }
        if (!this.h.isEmpty()) {
            M.append(str);
            M.append("\tMasks: ");
            M.append(this.h.size());
            M.append("\n");
        }
        if (this.j != 0 && this.k != 0) {
            M.append(str);
            M.append("\tBackground: ");
            M.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)));
        }
        if (!this.a.isEmpty()) {
            M.append(str);
            M.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.b bVar : this.a) {
                M.append(str);
                M.append("\t\t");
                M.append(bVar);
                M.append("\n");
            }
        }
        return M.toString();
    }
}
