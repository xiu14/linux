package com.bytedance.android.input.keyboard.custom_symbol;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.databinding.LayoutKeyboardCustomSymbolItemAddBinding;
import com.bytedance.android.input.keyboard.areacontrol.k;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class KeyboardCustomSymbolAddViewHolder extends RecyclerView.ViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardCustomSymbolAddViewHolder(LayoutKeyboardCustomSymbolItemAddBinding layoutKeyboardCustomSymbolItemAddBinding) {
        super(layoutKeyboardCustomSymbolItemAddBinding.a());
        l.f(layoutKeyboardCustomSymbolItemAddBinding, "binding");
        k kVar = k.a;
        if (k.V()) {
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, layoutKeyboardCustomSymbolItemAddBinding.a(), null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 46)), null, null, null, null, 122);
        } else if (k.P()) {
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, layoutKeyboardCustomSymbolItemAddBinding.a(), null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 37)), null, null, null, null, 122);
        } else if (k.R()) {
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, layoutKeyboardCustomSymbolItemAddBinding.a(), null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 36)), null, null, null, null, 122);
        }
    }
}
