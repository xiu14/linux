package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ViewGroupKt {
    public static final boolean contains(ViewGroup viewGroup, View view) {
        l.f(viewGroup, "<this>");
        l.f(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(ViewGroup viewGroup, kotlin.s.b.l<? super View, o> lVar) {
        l.f(viewGroup, "<this>");
        l.f(lVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            l.e(childAt, "getChildAt(index)");
            lVar.invoke(childAt);
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, p<? super Integer, ? super View, o> pVar) {
        l.f(viewGroup, "<this>");
        l.f(pVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Integer valueOf = Integer.valueOf(i);
            View childAt = viewGroup.getChildAt(i);
            l.e(childAt, "getChildAt(index)");
            pVar.invoke(valueOf, childAt);
        }
    }

    public static final View get(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder N = e.a.a.a.a.N("Index: ", i, ", Size: ");
        N.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(N.toString());
    }

    public static final kotlin.x.e<View> getChildren(final ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        return new kotlin.x.e<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // kotlin.x.e
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    public static final kotlin.x.e<View> getDescendants(ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(viewGroup, null);
        l.f(viewGroupKt$descendants$1, "block");
        return new kotlin.x.i(viewGroupKt$descendants$1);
    }

    public static final kotlin.w.d getIndices(ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        return kotlin.w.h.i(0, viewGroup.getChildCount());
    }

    public static final int getSize(ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        l.f(viewGroup, "<this>");
        l.f(view, "view");
        viewGroup.removeView(view);
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        l.f(viewGroup, "<this>");
        l.f(view, "view");
        viewGroup.addView(view);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i) {
        l.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i, @Px int i2, @Px int i3, @Px int i4) {
        l.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        l.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    @RequiresApi(17)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i, @Px int i2, @Px int i3, @Px int i4) {
        l.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        l.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
