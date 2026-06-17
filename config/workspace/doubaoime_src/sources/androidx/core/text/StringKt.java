package androidx.core.text;

import android.text.TextUtils;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class StringKt {
    public static final String htmlEncode(String str) {
        l.f(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        l.e(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
