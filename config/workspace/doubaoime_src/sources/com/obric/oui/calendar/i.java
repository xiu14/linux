package com.obric.oui.calendar;

import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class i {
    private Drawable b = null;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f7682c = null;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedList<a> f7683d = new LinkedList<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f7684e = false;
    private boolean a = false;

    static class a {
    }

    i() {
    }

    void a(i iVar) {
        Drawable drawable = this.f7682c;
        if (drawable != null) {
            iVar.f7682c = drawable;
            iVar.a = true;
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            iVar.b = drawable2;
            iVar.a = true;
        }
        iVar.f7683d.addAll(this.f7683d);
        iVar.a |= this.a;
        iVar.f7684e = this.f7684e;
    }

    public boolean b() {
        return this.f7684e;
    }

    Drawable c() {
        return this.b;
    }

    Drawable d() {
        return this.f7682c;
    }

    List<a> e() {
        return Collections.unmodifiableList(this.f7683d);
    }

    boolean f() {
        return this.a;
    }

    void g() {
        this.b = null;
        this.f7682c = null;
        this.f7683d.clear();
        this.a = false;
        this.f7684e = false;
    }
}
