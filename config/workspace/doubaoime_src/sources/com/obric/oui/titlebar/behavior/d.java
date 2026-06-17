package com.obric.oui.titlebar.behavior;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
class d {
    private final View a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f8150c;

    /* renamed from: d, reason: collision with root package name */
    private int f8151d;

    /* renamed from: e, reason: collision with root package name */
    private int f8152e;

    public d(View view) {
        this.a = view;
    }

    void a() {
        View view = this.a;
        ViewCompat.offsetTopAndBottom(view, this.f8151d - (view.getTop() - this.b));
        View view2 = this.a;
        ViewCompat.offsetLeftAndRight(view2, this.f8152e - (view2.getLeft() - this.f8150c));
    }

    public int b() {
        return this.f8151d;
    }

    void c() {
        this.b = this.a.getTop();
        this.f8150c = this.a.getLeft();
    }

    public boolean d(int i) {
        if (this.f8151d == i) {
            return false;
        }
        this.f8151d = i;
        a();
        return true;
    }
}
