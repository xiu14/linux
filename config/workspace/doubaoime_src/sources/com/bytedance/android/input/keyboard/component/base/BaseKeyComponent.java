package com.bytedance.android.input.keyboard.component.base;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.component.style.ImeKeyStyle;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public abstract class BaseKeyComponent extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseKeyComponent(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    private final LayerDrawable b(int i, float f2, @ColorRes int i2, @ColorRes int i3, @ColorRes Integer num, @ColorRes Integer num2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f2);
        gradientDrawable.setColor(ContextCompat.getColor(getContext(), i2));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(f2);
        gradientDrawable2.setColor(ContextCompat.getColor(getContext(), i3));
        if (i() && num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                gradientDrawable2.setStroke(intValue, ContextCompat.getColor(getContext(), num2.intValue()));
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
        layerDrawable.setLayerInset(1, 0, 0, 0, i);
        return layerDrawable;
    }

    public static void c(BaseKeyComponent baseKeyComponent, ImeKeyStyle imeKeyStyle) {
        l.f(baseKeyComponent, "this$0");
        l.f(imeKeyStyle, "$style");
        baseKeyComponent.setBackground(baseKeyComponent.b(imeKeyStyle.getShadowHeight(), imeKeyStyle.getRadius(), imeKeyStyle.getShadowColor(), imeKeyStyle.getNormalBackgroundColor(), imeKeyStyle.getBorderWidth(), imeKeyStyle.getBorderColor()));
    }

    public static void d(BaseKeyComponent baseKeyComponent, ImeKeyStyle imeKeyStyle) {
        l.f(baseKeyComponent, "this$0");
        l.f(imeKeyStyle, "$style");
        baseKeyComponent.setBackground(baseKeyComponent.b(imeKeyStyle.getShadowHeight(), imeKeyStyle.getRadius(), imeKeyStyle.getShadowColor(), imeKeyStyle.getPressBackgroundColor(), imeKeyStyle.getBorderWidth(), imeKeyStyle.getBorderColor()));
    }

    public ImeKeyStyle a() {
        e("BaseKeyComponent getKeyStyle");
        return ImeKeyStyle.BASIC;
    }

    public final void e(String str) {
        l.f(str, "msg");
        IAppGlobals.a.j("KeyComponent", str);
    }

    public final void f(final ImeKeyStyle imeKeyStyle) {
        l.f(imeKeyStyle, "style");
        post(new Runnable() { // from class: com.bytedance.android.input.keyboard.component.base.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseKeyComponent.c(BaseKeyComponent.this, imeKeyStyle);
            }
        });
    }

    public final void g(final ImeKeyStyle imeKeyStyle) {
        l.f(imeKeyStyle, "style");
        post(new Runnable() { // from class: com.bytedance.android.input.keyboard.component.base.b
            @Override // java.lang.Runnable
            public final void run() {
                BaseKeyComponent.d(BaseKeyComponent.this, imeKeyStyle);
            }
        });
    }

    public final void h(ImeKeyStyle imeKeyStyle) {
        l.f(imeKeyStyle, "keyStyle");
        e("keyStyle = " + imeKeyStyle.name() + " ---from = " + getClass().getName());
        f(imeKeyStyle);
    }

    public boolean i() {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                g(a());
                UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.FUNCTION, UserInteractiveManagerNext.KeyVibrate.FUNCTION, VibrationController.VibrationType.KEY_FUNCTION, false);
            } else if (action == 1 || action == 3) {
                f(a());
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseKeyComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKeyComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        setClickable(true);
        h(a());
    }
}
