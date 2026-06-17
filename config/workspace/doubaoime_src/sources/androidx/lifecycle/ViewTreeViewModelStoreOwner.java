package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import kotlin.s.c.l;
import kotlin.x.h;

/* loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        l.f(view, "<this>");
        return (ViewModelStoreOwner) h.c(h.g(h.d(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        l.f(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
