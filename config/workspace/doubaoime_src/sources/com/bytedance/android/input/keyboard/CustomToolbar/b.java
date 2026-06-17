package com.bytedance.android.input.keyboard.CustomToolbar;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.android.input.popup.k;
import com.bytedance.android.input.popup.q;
import com.bytedance.android.input.r.j;

/* loaded from: classes.dex */
public final class b {
    private static k a;

    public static final void a() {
        k kVar;
        k kVar2 = a;
        if ((kVar2 != null && kVar2.isShowing()) && (kVar = a) != null) {
            kVar.dismiss();
        }
        a = null;
    }

    public static void b() {
        a = new k(IAppGlobals.a.getApplication(), WindowId.CUSTOM_TOOLBAR_UI, 2, C0838R.layout.layout_custom_toolbar);
        int toolbarHeight = KeyboardJni.getKeyboardJni().getToolbarHeight();
        j.i("CustomToolbar-Manager", "showCustomToolbarView toolbarHeight = " + toolbarHeight);
        q.f().o();
        q.f().m(a, toolbarHeight);
    }

    public static final void c() {
        k kVar;
        k kVar2 = a;
        if (!(kVar2 != null && kVar2.isShowing()) || (kVar = a) == null) {
            return;
        }
        kVar.dismiss();
    }
}
