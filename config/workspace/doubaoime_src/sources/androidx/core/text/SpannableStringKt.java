package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import kotlin.s.c.l;
import kotlin.w.d;

/* loaded from: classes.dex */
public final class SpannableStringKt {
    @SuppressLint({"SyntheticAccessor"})
    public static final void clearSpans(Spannable spannable) {
        l.f(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        l.e(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        l.f(spannable, "<this>");
        l.f(obj, "span");
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        l.e(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final void set(Spannable spannable, d dVar, Object obj) {
        l.f(spannable, "<this>");
        l.f(dVar, "range");
        l.f(obj, "span");
        spannable.setSpan(obj, dVar.getStart().intValue(), dVar.getEndInclusive().intValue(), 17);
    }
}
