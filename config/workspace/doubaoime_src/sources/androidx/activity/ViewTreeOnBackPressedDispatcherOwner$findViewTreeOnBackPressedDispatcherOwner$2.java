package androidx.activity;

import android.view.View;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 extends m implements l<View, OnBackPressedDispatcherOwner> {
    public static final ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 INSTANCE = new ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2();

    ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public final OnBackPressedDispatcherOwner invoke(View view) {
        kotlin.s.c.l.f(view, "it");
        Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof OnBackPressedDispatcherOwner) {
            return (OnBackPressedDispatcherOwner) tag;
        }
        return null;
    }
}
