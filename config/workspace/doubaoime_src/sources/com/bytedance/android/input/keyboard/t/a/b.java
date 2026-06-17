package com.bytedance.android.input.keyboard.t.a;

import android.view.View;
import com.bytedance.android.input.constants.ImeScreenOrientation;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;

/* loaded from: classes.dex */
public interface b {
    View a();

    ToolbarType b();

    void c(ImeScreenOrientation imeScreenOrientation);

    void d(com.bytedance.android.input.keyboard.toolbar.entity.a aVar);

    void dismiss();
}
