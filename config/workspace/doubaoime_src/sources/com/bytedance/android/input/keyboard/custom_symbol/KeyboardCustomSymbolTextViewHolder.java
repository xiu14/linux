package com.bytedance.android.input.keyboard.custom_symbol;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.databinding.LayoutKeyboardCustomSymbolItemTextBinding;
import com.bytedance.android.input.keyboard.areacontrol.k;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class KeyboardCustomSymbolTextViewHolder extends RecyclerView.ViewHolder {
    private final AppCompatTextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardCustomSymbolTextViewHolder(LayoutKeyboardCustomSymbolItemTextBinding layoutKeyboardCustomSymbolItemTextBinding) {
        super(layoutKeyboardCustomSymbolItemTextBinding.a());
        l.f(layoutKeyboardCustomSymbolItemTextBinding, "binding");
        AppCompatTextView appCompatTextView = layoutKeyboardCustomSymbolItemTextBinding.b;
        l.e(appCompatTextView, "binding.keyboardCustomSymbolItemText");
        this.a = appCompatTextView;
        k kVar = k.a;
        if (k.V()) {
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, layoutKeyboardCustomSymbolItemTextBinding.a(), null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 46)), null, null, null, null, 122);
        } else if (k.P()) {
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, layoutKeyboardCustomSymbolItemTextBinding.a(), null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 37)), null, null, null, null, 122);
        } else if (k.R()) {
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, layoutKeyboardCustomSymbolItemTextBinding.a(), null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 36)), null, null, null, null, 122);
        }
    }

    public final AppCompatTextView a() {
        return this.a;
    }
}
