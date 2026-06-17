package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i, int i2) {
        l.f(spanned, "<this>");
        l.i();
        throw null;
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i, int i2, int i3, Object obj) {
        int i4 = i3 & 1;
        if ((i3 & 2) != 0) {
            spanned.length();
        }
        l.f(spanned, "<this>");
        l.i();
        throw null;
    }

    public static final Spanned toSpanned(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        l.e(valueOf, "valueOf(this)");
        return valueOf;
    }
}
