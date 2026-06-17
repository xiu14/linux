package com.bytedance.dataplatform.u;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a<T> {
    private String a;
    private double b;

    /* renamed from: c, reason: collision with root package name */
    private b<T>[] f4755c;

    /* renamed from: d, reason: collision with root package name */
    private String f4756d;

    /* renamed from: e, reason: collision with root package name */
    private String[] f4757e;

    /* renamed from: f, reason: collision with root package name */
    private List<Pair<String, Float>> f4758f = new ArrayList();

    public a(String str, double d2, String str2, String[] strArr, b<T>... bVarArr) {
        this.a = str;
        this.b = d2;
        this.f4756d = str2;
        this.f4757e = strArr;
        this.f4755c = bVarArr;
        for (b<T> bVar : bVarArr) {
            this.f4758f.add(new Pair<>(bVar.c(), Double.valueOf(bVar.a())));
        }
    }

    public b<T>[] a() {
        return this.f4755c;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.f4756d;
    }

    public String[] d() {
        return this.f4757e;
    }

    public double e() {
        return this.b;
    }
}
