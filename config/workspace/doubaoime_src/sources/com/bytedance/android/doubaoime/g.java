package com.bytedance.android.doubaoime;

import com.bytedance.android.input.popup.WindowId;
import com.bytedance.android.input.popup.o;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements o.b {
    public final /* synthetic */ WindowId a;

    public /* synthetic */ g(WindowId windowId) {
        this.a = windowId;
    }

    public final void a() {
        KeyboardJni.d(this.a);
    }
}
