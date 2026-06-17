package com.bytedance.android.input.keyboard.component;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.component.base.BaseTextKeyComponent;
import com.bytedance.android.input.keyboard.component.style.ImeKeyStyle;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class NumberButtonKeyComponent extends BaseTextKeyComponent {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberButtonKeyComponent(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    @Override // com.bytedance.android.input.keyboard.component.base.BaseKeyComponent
    public ImeKeyStyle a() {
        return IAppGlobals.a.K() ? ImeKeyStyle.TRANSPARENT_WITH_BORDER : ImeKeyStyle.BASIC;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberButtonKeyComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberButtonKeyComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        String string = context.getString(C0838R.string.key_number);
        l.e(string, "context.getString(R.string.key_number)");
        setText(string);
        if (IAppGlobals.a.K()) {
            setTextColor(C0838R.color.ime_color_white);
        }
    }
}
