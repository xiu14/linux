package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import kotlin.s.c.l;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class LocaleKt {
    @RequiresApi(17)
    public static final int getLayoutDirection(Locale locale) {
        l.f(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
