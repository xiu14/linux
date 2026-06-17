package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class HtmlKt {
    public static final Spanned parseAsHtml(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        l.f(str, "<this>");
        Spanned fromHtml = HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
        l.e(fromHtml, "fromHtml(this, flags, imageGetter, tagHandler)");
        return fromHtml;
    }

    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        l.f(str, "<this>");
        Spanned fromHtml = HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
        l.e(fromHtml, "fromHtml(this, flags, imageGetter, tagHandler)");
        return fromHtml;
    }

    public static final String toHtml(Spanned spanned, int i) {
        l.f(spanned, "<this>");
        String html = HtmlCompat.toHtml(spanned, i);
        l.e(html, "toHtml(this, option)");
        return html;
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        l.f(spanned, "<this>");
        String html = HtmlCompat.toHtml(spanned, i);
        l.e(html, "toHtml(this, option)");
        return html;
    }
}
