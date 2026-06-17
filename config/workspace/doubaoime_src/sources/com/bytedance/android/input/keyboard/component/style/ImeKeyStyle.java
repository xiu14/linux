package com.bytedance.android.input.keyboard.component.style;

import androidx.annotation.ColorRes;
import com.bytedance.android.doubaoime.C0838R;
import e.a.a.a.a;
import kotlin.s.c.g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BASIC' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class ImeKeyStyle {
    private static final /* synthetic */ ImeKeyStyle[] $VALUES;
    public static final ImeKeyStyle BASIC;
    public static final ImeKeyStyle BLUE_CLICKABLE;
    public static final ImeKeyStyle GRAY_CLICKABLE;
    public static final ImeKeyStyle GRAY_UN_CLICKABLE;
    public static final ImeKeyStyle TRANSPARENT_WITH_BORDER;
    private final Integer borderColor;
    private final Integer borderWidth;
    private final int normalBackgroundColor;
    private final int pressBackgroundColor;
    private final float radius;
    private final int shadowColor;
    private final int shadowHeight;

    private static final /* synthetic */ ImeKeyStyle[] $values() {
        return new ImeKeyStyle[]{BASIC, GRAY_CLICKABLE, GRAY_UN_CLICKABLE, BLUE_CLICKABLE, TRANSPARENT_WITH_BORDER};
    }

    static {
        float f2 = 1;
        float f3 = 6;
        BASIC = new ImeKeyStyle("BASIC", 0, (int) a.m("Resources.getSystem()", 1, f2), a.m("Resources.getSystem()", 1, f3), C0838R.color.ime_key_shadow_color, C0838R.color.ime_key_normal_bg_color, C0838R.color.ime_key_normal_press_bg_color, null, null, 96, null);
        int m = (int) a.m("Resources.getSystem()", 1, f2);
        float m2 = a.m("Resources.getSystem()", 1, f3);
        Integer valueOf = Integer.valueOf(C0838R.color.ime_key_border_color);
        GRAY_CLICKABLE = new ImeKeyStyle("GRAY_CLICKABLE", 1, m, m2, C0838R.color.ime_key_shadow_color, C0838R.color.ime_key_gray_clickable_bg_color, C0838R.color.ime_key_gray_clickable_press_bg_color, 2, valueOf);
        GRAY_UN_CLICKABLE = new ImeKeyStyle("GRAY_UN_CLICKABLE", 2, (int) a.m("Resources.getSystem()", 1, f2), a.m("Resources.getSystem()", 1, f3), C0838R.color.ime_key_shadow_color, C0838R.color.ime_key_gray_un_clickable_bg_color, C0838R.color.ime_key_gray_un_clickable_press_bg_color, 2, valueOf);
        BLUE_CLICKABLE = new ImeKeyStyle("BLUE_CLICKABLE", 3, (int) a.m("Resources.getSystem()", 1, f2), a.m("Resources.getSystem()", 1, f3), C0838R.color.ime_key_shadow_color, C0838R.color.ime_key_blue_clickable_bg_color, C0838R.color.ime_key_blue_clickable_press_bg_color, 2, valueOf);
        TRANSPARENT_WITH_BORDER = new ImeKeyStyle("TRANSPARENT_WITH_BORDER", 4, 0, a.m("Resources.getSystem()", 1, f3), C0838R.color.transparent, C0838R.color.transparent_button_bk, C0838R.color.transparent_button_pushed_bk, null, null, 96, null);
        $VALUES = $values();
    }

    private ImeKeyStyle(String str, int i, @ColorRes int i2, @ColorRes float f2, @ColorRes int i3, @ColorRes int i4, @ColorRes int i5, Integer num, Integer num2) {
        this.shadowHeight = i2;
        this.radius = f2;
        this.shadowColor = i3;
        this.normalBackgroundColor = i4;
        this.pressBackgroundColor = i5;
        this.borderWidth = num;
        this.borderColor = num2;
    }

    public static ImeKeyStyle valueOf(String str) {
        return (ImeKeyStyle) Enum.valueOf(ImeKeyStyle.class, str);
    }

    public static ImeKeyStyle[] values() {
        return (ImeKeyStyle[]) $VALUES.clone();
    }

    public final Integer getBorderColor() {
        return this.borderColor;
    }

    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    public final int getNormalBackgroundColor() {
        return this.normalBackgroundColor;
    }

    public final int getPressBackgroundColor() {
        return this.pressBackgroundColor;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final int getShadowColor() {
        return this.shadowColor;
    }

    public final int getShadowHeight() {
        return this.shadowHeight;
    }

    /* synthetic */ ImeKeyStyle(String str, int i, int i2, float f2, int i3, int i4, int i5, Integer num, Integer num2, int i6, g gVar) {
        this(str, i, i2, f2, i3, i4, i5, (i6 & 32) != 0 ? null : num, (i6 & 64) != 0 ? null : num2);
    }
}
