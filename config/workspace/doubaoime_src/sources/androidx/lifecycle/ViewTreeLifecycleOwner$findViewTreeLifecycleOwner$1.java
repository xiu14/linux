package androidx.lifecycle;

import android.view.View;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 extends m implements l<View, View> {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1();

    ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public final View invoke(View view) {
        kotlin.s.c.l.f(view, "currentView");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
