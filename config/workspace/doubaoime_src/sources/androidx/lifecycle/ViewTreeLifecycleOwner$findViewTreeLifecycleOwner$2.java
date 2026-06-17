package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 extends m implements l<View, LifecycleOwner> {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2();

    ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public final LifecycleOwner invoke(View view) {
        kotlin.s.c.l.f(view, "viewParent");
        Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
        if (tag instanceof LifecycleOwner) {
            return (LifecycleOwner) tag;
        }
        return null;
    }
}
