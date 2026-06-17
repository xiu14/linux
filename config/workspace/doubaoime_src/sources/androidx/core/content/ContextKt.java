package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;

/* loaded from: classes.dex */
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        kotlin.s.c.l.f(context, "<this>");
        kotlin.s.c.l.i();
        throw null;
    }

    public static final void withStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, @AttrRes int i, @StyleRes int i2, kotlin.s.b.l<? super TypedArray, kotlin.o> lVar) {
        kotlin.s.c.l.f(context, "<this>");
        kotlin.s.c.l.f(iArr, "attrs");
        kotlin.s.c.l.f(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        kotlin.s.c.l.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, kotlin.s.b.l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        kotlin.s.c.l.f(context, "<this>");
        kotlin.s.c.l.f(iArr, "attrs");
        kotlin.s.c.l.f(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        kotlin.s.c.l.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(Context context, @StyleRes int i, int[] iArr, kotlin.s.b.l<? super TypedArray, kotlin.o> lVar) {
        kotlin.s.c.l.f(context, "<this>");
        kotlin.s.c.l.f(iArr, "attrs");
        kotlin.s.c.l.f(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        kotlin.s.c.l.e(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
