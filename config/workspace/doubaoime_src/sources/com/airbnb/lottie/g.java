package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<Layer>> f1260c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, j> f1261d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, com.airbnb.lottie.model.b> f1262e;

    /* renamed from: f, reason: collision with root package name */
    private List<com.airbnb.lottie.model.g> f1263f;

    /* renamed from: g, reason: collision with root package name */
    private SparseArrayCompat<com.airbnb.lottie.model.c> f1264g;
    private LongSparseArray<Layer> h;
    private List<Layer> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private final r a = new r();
    private final HashSet<String> b = new HashSet<>();
    private int o = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(String str) {
        com.airbnb.lottie.y.d.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.j;
    }

    public SparseArrayCompat<com.airbnb.lottie.model.c> c() {
        return this.f1264g;
    }

    public float d() {
        return (long) ((e() / this.m) * 1000.0f);
    }

    public float e() {
        return this.l - this.k;
    }

    public float f() {
        return this.l;
    }

    public Map<String, com.airbnb.lottie.model.b> g() {
        return this.f1262e;
    }

    public float h(float f2) {
        return com.airbnb.lottie.y.g.f(this.k, this.l, f2);
    }

    public float i() {
        return this.m;
    }

    public Map<String, j> j() {
        return this.f1261d;
    }

    public List<Layer> k() {
        return this.i;
    }

    @Nullable
    public com.airbnb.lottie.model.g l(String str) {
        int size = this.f1263f.size();
        for (int i = 0; i < size; i++) {
            com.airbnb.lottie.model.g gVar = this.f1263f.get(i);
            if (gVar.a(str)) {
                return gVar;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int m() {
        return this.o;
    }

    public r n() {
        return this.a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> o(String str) {
        return this.f1260c.get(str);
    }

    public float p() {
        return this.k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean q() {
        return this.n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void r(int i) {
        this.o += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void s(Rect rect, float f2, float f3, float f4, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, j> map2, SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat, Map<String, com.airbnb.lottie.model.b> map3, List<com.airbnb.lottie.model.g> list2) {
        this.j = rect;
        this.k = f2;
        this.l = f3;
        this.m = f4;
        this.i = list;
        this.h = longSparseArray;
        this.f1260c = map;
        this.f1261d = map2;
        this.f1264g = sparseArrayCompat;
        this.f1262e = map3;
        this.f1263f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer t(long j) {
        return this.h.get(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it2 = this.i.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().w("\t"));
        }
        return sb.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void u(boolean z) {
        this.n = z;
    }

    public void v(boolean z) {
        this.a.b(z);
    }
}
