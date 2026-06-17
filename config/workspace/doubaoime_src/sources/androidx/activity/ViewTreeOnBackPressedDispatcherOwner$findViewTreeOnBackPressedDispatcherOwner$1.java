package androidx.activity;

import android.view.View;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1 extends m implements l<View, View> {
    public static final ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1 INSTANCE = new ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1();

    ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public final View invoke(View view) {
        kotlin.s.c.l.f(view, "it");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
