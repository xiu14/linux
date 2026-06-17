package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    int f6759e;

    /* renamed from: f, reason: collision with root package name */
    int f6760f;

    /* renamed from: g, reason: collision with root package name */
    int f6761g;
    int h;
    int i;
    float j;
    float k;
    int l;
    int m;
    int o;
    int p;
    boolean q;
    boolean r;
    int a = Integer.MAX_VALUE;
    int b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    int f6757c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    int f6758d = Integer.MIN_VALUE;
    List<Integer> n = new ArrayList();

    b() {
    }

    public int a() {
        return this.h - this.i;
    }

    void b(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - flexItem.I()) - i);
        this.b = Math.min(this.b, (view.getTop() - flexItem.M()) - i2);
        this.f6757c = Math.max(this.f6757c, view.getRight() + flexItem.Y() + i3);
        this.f6758d = Math.max(this.f6758d, view.getBottom() + flexItem.H() + i4);
    }
}
