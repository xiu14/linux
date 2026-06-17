package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import kotlin.s.c.l;
import kotlin.x.h;

/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        l.f(view, "<this>");
        return (LifecycleOwner) h.c(h.g(h.d(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        l.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
