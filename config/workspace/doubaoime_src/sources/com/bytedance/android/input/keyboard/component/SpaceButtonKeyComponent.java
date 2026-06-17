package com.bytedance.android.input.keyboard.component;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.component.base.BaseImageKeyComponent;
import com.bytedance.android.input.keyboard.component.style.ImeKeyStyle;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SpaceButtonKeyComponent extends BaseImageKeyComponent {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpaceButtonKeyComponent(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    @Override // com.bytedance.android.input.keyboard.component.base.BaseKeyComponent
    public ImeKeyStyle a() {
        return IAppGlobals.a.K() ? ImeKeyStyle.TRANSPARENT_WITH_BORDER : super.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpaceButtonKeyComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceButtonKeyComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        AppCompatImageView j = j();
        if (j != null) {
            j.setImageResource(C0838R.drawable.key_space);
            setImageSize((int) e.a.a.a.a.m("Resources.getSystem()", 1, 36), (int) e.a.a.a.a.m("Resources.getSystem()", 1, 20));
        }
        String string = getContext().getString(C0838R.string.key_space_asr_stop_text);
        l.e(string, "context.getString(R.stri….key_space_asr_stop_text)");
        setText(string);
        if (IAppGlobals.a.K()) {
            setTextColor(C0838R.color.ime_color_white);
        } else {
            setTextColor(C0838R.color.ime_space_button_text_color);
        }
    }
}
