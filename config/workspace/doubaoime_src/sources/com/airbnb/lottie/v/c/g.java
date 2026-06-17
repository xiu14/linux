package com.airbnb.lottie.v.c;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g {
    private final List<a<com.airbnb.lottie.model.content.h, Path>> a;
    private final List<a<Integer, Integer>> b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Mask> f1430c;

    public g(List<Mask> list) {
        this.f1430c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<a<com.airbnb.lottie.model.content.h, Path>> a() {
        return this.a;
    }

    public List<Mask> b() {
        return this.f1430c;
    }

    public List<a<Integer, Integer>> c() {
        return this.b;
    }
}
