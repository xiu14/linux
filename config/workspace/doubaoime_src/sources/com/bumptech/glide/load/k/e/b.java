package com.bumptech.glide.load.k.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* loaded from: classes.dex */
public final class b {
    private static volatile boolean a = true;

    public static Drawable a(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return c(context, context, i, theme);
    }

    public static Drawable b(Context context, Context context2, @DrawableRes int i) {
        return c(context, context2, i, null);
    }

    private static Drawable c(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (a) {
                return d(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return ContextCompat.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i, theme);
    }

    private static Drawable d(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i);
    }
}
