package androidx.core.view;

import android.view.ViewParent;
import kotlin.s.b.l;

/* loaded from: classes.dex */
/* synthetic */ class ViewKt$ancestors$1 extends kotlin.s.c.k implements l<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.s.b.l
    public final ViewParent invoke(ViewParent viewParent) {
        kotlin.s.c.l.f(viewParent, "p0");
        return viewParent.getParent();
    }
}
