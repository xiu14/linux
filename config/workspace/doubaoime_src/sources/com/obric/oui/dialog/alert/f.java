package com.obric.oui.dialog.alert;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes2.dex */
public final class f implements g {
    private final l<FrameLayout, o> a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(l<? super FrameLayout, o> lVar) {
        kotlin.s.c.l.f(lVar, "body");
        this.a = lVar;
    }

    @Override // com.obric.oui.dialog.alert.g
    public void a(Context context, FrameLayout frameLayout) {
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(frameLayout, "parent");
        this.a.invoke(frameLayout);
    }

    @Override // com.obric.oui.dialog.alert.g
    public void b(b bVar) {
        kotlin.s.c.l.f(bVar, "dialog");
    }
}
