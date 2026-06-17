package com.obric.oui.dropdown;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.layout.OUILinearLayout;
import com.obric.oui.text.OBaseTextView;
import java.lang.ref.WeakReference;
import kotlin.reflect.i;
import kotlin.s.c.A;
import kotlin.s.c.l;
import kotlin.s.c.o;

/* loaded from: classes2.dex */
public class ODropdownTrigger extends OUILinearLayout {
    static final /* synthetic */ i[] o;

    /* renamed from: g, reason: collision with root package name */
    private final int f7729g;
    private final int h;
    private final int i;
    private final int j;
    private final TextView k;
    private final ImageView l;
    private final kotlin.u.b m;
    private WeakReference<Activity> n;

    public static final class a extends kotlin.u.a<Boolean> {
        final /* synthetic */ ODropdownTrigger b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, ODropdownTrigger oDropdownTrigger) {
            super(obj);
            this.b = oDropdownTrigger;
        }

        @Override // kotlin.u.a
        protected void b(i<?> iVar, Boolean bool, Boolean bool2) {
            l.f(iVar, "property");
            boolean booleanValue = bool2.booleanValue();
            if (bool.booleanValue() == booleanValue) {
                return;
            }
            if (booleanValue) {
                this.b.j();
            } else {
                this.b.i();
            }
        }
    }

    static final class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ODropdownTrigger.this.h();
        }
    }

    static {
        o oVar = new o(ODropdownTrigger.class, "active", "getActive()Z", 0);
        A.e(oVar);
        o = new i[]{oVar};
    }

    public ODropdownTrigger(Context context) {
        this(context, null, 0);
    }

    public void h() {
        WeakReference<Activity> weakReference = this.n;
        if (weakReference == null) {
            l.l("reference");
            throw null;
        }
        if (weakReference.get() == null) {
            l.f("ODropdownTrigger", "tag");
            l.f("no activity for popup showing", "msg");
            Log.e("ODropdownTrigger", "no activity for popup showing", null);
            return;
        }
        WeakReference<Activity> weakReference2 = this.n;
        if (weakReference2 == null) {
            l.l("reference");
            throw null;
        }
        if (weakReference2.get() != null) {
            setActive(true);
        }
    }

    public void i() {
        this.l.setImageResource(this.i);
        setBackgroundColor(this.f7729g);
    }

    public void j() {
        this.l.setImageResource(this.j);
        setBackgroundColor(this.h);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.obric.oui.layout.OUILinearLayout, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setActive(boolean z) {
        this.m.a(this, o[0], Boolean.valueOf(z));
    }

    public final void setDropdownActivity(Activity activity) {
        this.n = new WeakReference<>(activity);
    }

    public ODropdownTrigger(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ODropdownTrigger(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null, 8);
        l.f(context, "context");
        this.m = new a(Boolean.FALSE, this);
        if (context instanceof Activity) {
            setDropdownActivity((Activity) context);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.i.a.b.b.s, 0, 0);
        l.e(obtainStyledAttributes, "context.theme.obtainStyl…           0, 0\n        )");
        int color = obtainStyledAttributes.getColor(0, getResources().getColor(C0838R.color.oui_fill_element_2, context.getTheme()));
        this.f7729g = color;
        this.h = obtainStyledAttributes.getColor(1, getResources().getColor(C0838R.color.oui_fill_active, context.getTheme()));
        int resourceId = obtainStyledAttributes.getResourceId(2, C0838R.drawable.dropdown_default_off);
        this.i = resourceId;
        this.j = obtainStyledAttributes.getResourceId(3, C0838R.drawable.dropdown_default_on);
        OBaseTextView oBaseTextView = new OBaseTextView(new ContextThemeWrapper(context, obtainStyledAttributes.getResourceId(6, C0838R.style.ODropdownTriggerText)), null, 0, 6);
        this.k = oBaseTextView;
        addView(oBaseTextView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(oBaseTextView.getLayoutParams());
        layoutParams.weight = 1.0f;
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        layoutParams.rightMargin = obtainStyledAttributes.getDimensionPixelOffset(5, kotlin.t.a.a(TypedValue.applyDimension(1, 0, system.getDisplayMetrics())));
        oBaseTextView.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(new ContextThemeWrapper(context, obtainStyledAttributes.getResourceId(4, C0838R.style.ODropdownTriggerIcon)));
        this.l = imageView;
        addView(imageView);
        imageView.setImageResource(resourceId);
        setBackgroundColor(color);
        setOnClickListener(new b());
    }
}
