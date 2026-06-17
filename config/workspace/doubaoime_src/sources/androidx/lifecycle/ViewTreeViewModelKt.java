package androidx.lifecycle;

import android.view.View;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ViewTreeViewModelKt {
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        l.f(view, "view");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
