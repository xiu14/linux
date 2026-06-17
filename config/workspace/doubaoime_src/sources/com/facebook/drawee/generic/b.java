package com.facebook.drawee.generic;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.appcompat.content.res.AppCompatResources;
import com.facebook.drawee.drawable.q;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b {
    public static final q q = q.f6391f;
    public static final q r = q.f6392g;
    private static int s = -1;
    private Resources a;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private float f6404c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f6405d;

    /* renamed from: e, reason: collision with root package name */
    private q f6406e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f6407f;

    /* renamed from: g, reason: collision with root package name */
    private q f6408g;
    private Drawable h;
    private q i;
    private Drawable j;
    private q k;
    private q l;
    private Drawable m;
    private List<Drawable> n;
    private Drawable o;
    private RoundingParams p;

    public b(Context context) {
        this.b = context;
        s();
    }

    private void s() {
        if (s < 0) {
            s = 300;
        }
        this.f6404c = 0.0f;
        this.f6405d = null;
        q qVar = q;
        this.f6406e = qVar;
        this.f6407f = null;
        this.f6408g = qVar;
        this.h = null;
        this.i = qVar;
        this.j = null;
        this.k = qVar;
        this.l = r;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public b A(Drawable drawable) {
        if (drawable == null) {
            this.n = null;
        } else {
            this.n = Arrays.asList(drawable);
        }
        return this;
    }

    public b B(int i) {
        Context context = this.b;
        if (context != null) {
            this.f6405d = AppCompatResources.getDrawable(context, i);
        } else {
            this.f6405d = this.a.getDrawable(i);
        }
        return this;
    }

    public b C(Drawable drawable) {
        this.f6405d = drawable;
        return this;
    }

    public b D(q qVar) {
        this.f6406e = qVar;
        return this;
    }

    public b E(Drawable drawable) {
        if (drawable == null) {
            this.o = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
            this.o = stateListDrawable;
        }
        return this;
    }

    public b F(Drawable drawable) {
        this.j = drawable;
        return this;
    }

    public b G(q qVar) {
        this.k = qVar;
        return this;
    }

    public b H(Drawable drawable) {
        this.f6407f = drawable;
        return this;
    }

    public b I(q qVar) {
        this.f6408g = qVar;
        return this;
    }

    public b J(RoundingParams roundingParams) {
        this.p = roundingParams;
        return this;
    }

    public a a() {
        List<Drawable> list = this.n;
        if (list != null) {
            Iterator<Drawable> it2 = list.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
            }
        }
        return new a(this);
    }

    public q b() {
        return this.l;
    }

    public Drawable c() {
        return this.m;
    }

    public Context d() {
        return this.b;
    }

    public float e() {
        return this.f6404c;
    }

    public int f() {
        return s;
    }

    public Drawable g() {
        return this.h;
    }

    public q h() {
        return this.i;
    }

    public List<Drawable> i() {
        return this.n;
    }

    public Drawable j() {
        return this.f6405d;
    }

    public q k() {
        return this.f6406e;
    }

    public Drawable l() {
        return this.o;
    }

    public Drawable m() {
        return this.j;
    }

    public q n() {
        return this.k;
    }

    public Resources o() {
        return this.a;
    }

    public Drawable p() {
        return this.f6407f;
    }

    public q q() {
        return this.f6408g;
    }

    public RoundingParams r() {
        return this.p;
    }

    public b t(q qVar) {
        this.l = qVar;
        return this;
    }

    public b u(Drawable drawable) {
        this.m = drawable;
        return this;
    }

    public b v(float f2) {
        this.f6404c = f2;
        return this;
    }

    public b w(int i) {
        s = i;
        return this;
    }

    public b x(int i) {
        Context context = this.b;
        if (context != null) {
            this.h = AppCompatResources.getDrawable(context, i);
        } else {
            this.h = this.a.getDrawable(i);
        }
        return this;
    }

    public b y(Drawable drawable) {
        this.h = drawable;
        return this;
    }

    public b z(q qVar) {
        this.i = qVar;
        return this;
    }

    public b(Resources resources) {
        this.a = resources;
        s();
    }
}
