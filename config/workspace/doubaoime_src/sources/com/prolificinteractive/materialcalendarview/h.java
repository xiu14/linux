package com.prolificinteractive.materialcalendarview;

import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class h {
    private Drawable b = null;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f8221c = null;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedList<a> f8222d = new LinkedList<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f8223e = false;
    private boolean a = false;

    static class a {
    }

    h() {
    }

    void a(h hVar) {
        Drawable drawable = this.f8221c;
        if (drawable != null) {
            hVar.f8221c = drawable;
            hVar.a = true;
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            hVar.b = drawable2;
            hVar.a = true;
        }
        hVar.f8222d.addAll(this.f8222d);
        hVar.a |= this.a;
        hVar.f8223e = this.f8223e;
    }

    public boolean b() {
        return this.f8223e;
    }

    Drawable c() {
        return this.b;
    }

    Drawable d() {
        return this.f8221c;
    }

    List<a> e() {
        return Collections.unmodifiableList(this.f8222d);
    }

    boolean f() {
        return this.a;
    }

    void g() {
        this.b = null;
        this.f8221c = null;
        this.f8222d.clear();
        this.a = false;
        this.f8223e = false;
    }
}
