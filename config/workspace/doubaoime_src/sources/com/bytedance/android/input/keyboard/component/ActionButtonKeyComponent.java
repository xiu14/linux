package com.bytedance.android.input.keyboard.component;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.component.base.BaseTextKeyComponent;
import com.bytedance.android.input.keyboard.component.style.ImeKeyStyle;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ActionButtonKeyComponent extends BaseTextKeyComponent {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonKeyComponent(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    @Override // com.bytedance.android.input.keyboard.component.base.BaseKeyComponent
    public ImeKeyStyle a() {
        return IAppGlobals.a.K() ? ImeKeyStyle.TRANSPARENT_WITH_BORDER : ImeKeyStyle.GRAY_CLICKABLE;
    }

    @Override // com.bytedance.android.input.keyboard.component.base.BaseKeyComponent
    public boolean i() {
        IAppGlobals.a aVar = IAppGlobals.a;
        return aVar.b() && !aVar.K();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionButtonKeyComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonKeyComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        setText("换行");
        h(a());
        setTextColor(IAppGlobals.a.K() ? C0838R.color.ime_color_white : C0838R.color.ime_key_text_clickable_color);
    }
}
