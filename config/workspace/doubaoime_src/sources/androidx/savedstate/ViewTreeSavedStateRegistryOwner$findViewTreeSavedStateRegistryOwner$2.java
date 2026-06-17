package androidx.savedstate;

import android.view.View;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 extends m implements l<View, SavedStateRegistryOwner> {
    public static final ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 INSTANCE = new ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2();

    ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public final SavedStateRegistryOwner invoke(View view) {
        kotlin.s.c.l.f(view, "view");
        Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof SavedStateRegistryOwner) {
            return (SavedStateRegistryOwner) tag;
        }
        return null;
    }
}
