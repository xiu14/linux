package com.obric.oui.dialog.base;

import android.content.Context;
import android.view.View;
import com.obric.oui.dialog.base.AbstractDialog;
import kotlin.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class b<D extends AbstractDialog> {
    private View.OnClickListener a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7725c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractDialog.CloseIconStyle f7726d;

    /* renamed from: e, reason: collision with root package name */
    private g<Integer, Integer> f7727e;

    public b(Context context) {
        l.f(context, "context");
        this.b = true;
        this.f7726d = AbstractDialog.CloseIconStyle.DARK;
        this.f7727e = new g<>(null, null);
    }

    public static b e(b bVar, boolean z, View.OnClickListener onClickListener, int i, Object obj) {
        int i2 = i & 2;
        bVar.f7725c = z;
        bVar.a = null;
        return bVar;
    }

    public final D a() {
        D c2 = c();
        c2.j(this.f7725c, this.a);
        c2.setCancelable(this.b);
        c2.e(this.f7726d, this.f7727e.c(), this.f7727e.d());
        return c2;
    }

    public b<D> b(boolean z) {
        this.b = z;
        return this;
    }

    public abstract D c();

    public final boolean d() {
        return this.f7725c;
    }
}
