package androidx.savedstate;

import android.view.View;
import kotlin.s.c.l;
import kotlin.x.h;

/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        l.f(view, "<this>");
        return (SavedStateRegistryOwner) h.c(h.g(h.d(view, ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1.INSTANCE), ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2.INSTANCE));
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        l.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
