package com.bytedance.android.input.popup;

import android.content.Context;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
public class r extends o {
    public r(Context context, WindowId windowId, int i) {
        super(context, windowId, i);
        setBackgroundDrawable(null);
    }

    @Override // com.bytedance.android.input.popup.o, android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.o().edit().putBoolean("speech_command_window_is_not_show", false).apply();
    }
}
