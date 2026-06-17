package androidx.savedstate;

import android.view.View;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 extends m implements l<View, View> {
    public static final ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 INSTANCE = new ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1();

    ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public final View invoke(View view) {
        kotlin.s.c.l.f(view, "view");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
