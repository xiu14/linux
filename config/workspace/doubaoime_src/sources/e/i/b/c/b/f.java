package e.i.b.c.b;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;

/* loaded from: classes2.dex */
public interface f {
    boolean a();

    void c(int i, int i2, int i3, int i4);

    void d(int i);

    boolean e();

    void f(float f2);

    int getShadowColor();

    void setBorderColor(@ColorInt int i);

    void setBorderWidth(int i);

    void setBottomDividerAlpha(int i);

    void setLeftDividerAlpha(int i);

    void setOuterNormalColor(int i);

    void setOutlineExcludePadding(boolean z);

    void setOutlineInset(int i, int i2, int i3, int i4);

    void setRadius(int i);

    void setRadius(int i, int i2, int i3, int i4);

    void setRadiusAndShadow(int i, int i2, float f2);

    void setRadiusAndShadow(int i, int i2, int i3, float f2);

    void setRightDividerAlpha(int i);

    void setShadow(@Nullable o oVar, @Nullable o oVar2);

    void setShadowAlpha(float f2);

    void setShadowColor(int i);

    void setShadowCornerRadius(int i);

    void setShadowElevation(int i);

    void setShadowInsets(int i, int i2);

    void setShadowStyle(@StyleRes int i);

    void setShowBorderOnlyBeforeL(boolean z);

    void setTopDividerAlpha(int i);

    void setUseThemeGeneralShadowElevation();
}
