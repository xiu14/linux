package androidx.activity;

import android.view.View;
import kotlin.s.c.l;
import kotlin.x.h;

/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner get(View view) {
        l.f(view, "<this>");
        return (OnBackPressedDispatcherOwner) h.c(h.g(h.d(view, ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1.INSTANCE), ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2.INSTANCE));
    }

    public static final void set(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        l.f(view, "<this>");
        l.f(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
