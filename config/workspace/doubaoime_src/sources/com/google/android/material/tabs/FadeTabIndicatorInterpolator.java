package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: classes2.dex */
class FadeTabIndicatorInterpolator extends TabIndicatorInterpolator {
    private static final float FADE_THRESHOLD = 0.5f;

    FadeTabIndicatorInterpolator() {
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f2, @NonNull Drawable drawable) {
        if (f2 >= 0.5f) {
            view = view2;
        }
        RectF calculateIndicatorWidthForTab = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view);
        float lerp = f2 < 0.5f ? AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f2) : AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f2);
        drawable.setBounds((int) calculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) calculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (lerp * 255.0f));
    }
}
