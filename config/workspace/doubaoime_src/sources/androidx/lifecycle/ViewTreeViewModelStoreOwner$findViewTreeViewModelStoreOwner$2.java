package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends m implements l<View, ViewModelStoreOwner> {
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 INSTANCE = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2();

    ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public final ViewModelStoreOwner invoke(View view) {
        kotlin.s.c.l.f(view, "view");
        Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
        if (tag instanceof ViewModelStoreOwner) {
            return (ViewModelStoreOwner) tag;
        }
        return null;
    }
}
