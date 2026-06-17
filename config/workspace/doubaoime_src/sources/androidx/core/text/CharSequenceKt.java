package androidx.core.text;

import android.text.TextUtils;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class CharSequenceKt {
    public static final boolean isDigitsOnly(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
