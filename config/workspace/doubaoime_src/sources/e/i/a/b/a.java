package e.i.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.MarginLayoutParamsCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.i.b.b.a.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    public static final void a(String str) {
        if (str == null) {
            str = "null";
        }
        l.f("debugging", "tag");
        l.f(str, "msg");
        Log.d("debugging", str);
    }

    public static final float b(float f2) {
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        return f2 * system.getDisplayMetrics().density;
    }

    public static final int c(int i) {
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        return (int) ((i * system.getDisplayMetrics().density) + 0.5f);
    }

    public static final List<EditText> d(View view) {
        l.f(view, "view");
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                l.e(childAt, "child");
                arrayList.addAll(d(childAt));
            }
        } else if (view instanceof EditText) {
            arrayList.add(view);
        }
        return arrayList;
    }

    public static final int e(Context context) {
        l.f(context, "$this$getScreenHeight");
        Resources resources = context.getResources();
        l.e(resources, "resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    public static final int f(Context context) {
        l.f(context, "$this$getScreenWidth");
        Resources resources = context.getResources();
        l.e(resources, "resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    public static final void g(String str) {
        if (str != null) {
            l.f("OUILogger", "tag");
            l.f(str, "msg");
            Log.i("OUILogger", str);
        }
    }

    public static final void h(View view, int i) {
        l.f(view, "$this$setMarginBottom");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            int marginStart = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams2) : 0;
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? layoutParams3 : null);
            int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            marginLayoutParams.setMargins(marginStart, i2, layoutParams4 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams4) : 0, i);
            view.requestLayout();
        }
    }

    public static final void i(View view, int i) {
        l.f(view, "$this$setWidth");
        view.getLayoutParams().width = i;
        view.requestLayout();
    }

    public static final <T extends View> c<T> j(T t) {
        l.f(t, "$this$spring");
        Object tag = t.getTag(C0838R.id.view_property_spring_animator_key);
        if (!(tag instanceof c)) {
            tag = null;
        }
        c<T> cVar = (c) tag;
        if (cVar != null) {
            return cVar;
        }
        c<T> cVar2 = new c<>(t);
        t.setTag(C0838R.id.view_property_spring_animator_key, cVar2);
        return cVar2;
    }
}
