package com.obric.oui.paneltitlebar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.common.util.b;
import com.obric.oui.text.OTextView;
import e.a.a.a.a;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OPanelTitleBar extends ConstraintLayout {
    private int a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7911c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7912d;

    /* renamed from: e, reason: collision with root package name */
    private String f7913e;

    /* renamed from: f, reason: collision with root package name */
    private String f7914f;

    /* renamed from: g, reason: collision with root package name */
    private OTextView f7915g;
    private OTextView h;
    private ImageView i;
    private ImageView j;
    private FrameLayout k;
    private View l;

    public OPanelTitleBar(Context context) {
        this(context, null, 0);
    }

    private final void g(int i) {
        int i2 = C0838R.layout.o_panel_title_bar_regular;
        if (i == 0) {
            float f2 = 12;
            int e0 = a.e0("Resources.getSystem()", 1, f2);
            int e02 = a.e0("Resources.getSystem()", 1, 14);
            int e03 = a.e0("Resources.getSystem()", 1, f2);
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            setPadding(e0, e02, e03, kotlin.t.a.a(TypedValue.applyDimension(1, 8, system.getDisplayMetrics())));
            i2 = C0838R.layout.o_panel_title_bar_display;
        } else if (i != 1) {
            float f3 = 12;
            int e04 = a.e0("Resources.getSystem()", 1, f3);
            int e05 = a.e0("Resources.getSystem()", 1, f3);
            int e06 = a.e0("Resources.getSystem()", 1, f3);
            Resources system2 = Resources.getSystem();
            l.e(system2, "Resources.getSystem()");
            setPadding(e04, e05, e06, kotlin.t.a.a(TypedValue.applyDimension(1, f3, system2.getDisplayMetrics())));
        } else {
            float f4 = 12;
            int e07 = a.e0("Resources.getSystem()", 1, f4);
            int e08 = a.e0("Resources.getSystem()", 1, f4);
            int e09 = a.e0("Resources.getSystem()", 1, f4);
            Resources system3 = Resources.getSystem();
            l.e(system3, "Resources.getSystem()");
            setPadding(e07, e08, e09, kotlin.t.a.a(TypedValue.applyDimension(1, f4, system3.getDisplayMetrics())));
        }
        removeAllViews();
        View inflate = LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) this, true);
        this.f7915g = (OTextView) inflate.findViewById(C0838R.id.panel_title);
        this.h = (OTextView) inflate.findViewById(C0838R.id.panel_info);
        this.i = (ImageView) inflate.findViewById(C0838R.id.panel_expand_icon);
        this.j = (ImageView) inflate.findViewById(C0838R.id.panel_info_icon);
        this.k = (FrameLayout) inflate.findViewById(C0838R.id.panel_action_container);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setActionView(View view) {
        FrameLayout frameLayout;
        this.l = view;
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        if (view == null || (frameLayout = this.k) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 21;
        frameLayout.addView(view, layoutParams);
    }

    public final void setInfo(String str) {
        this.f7914f = str;
        OTextView oTextView = this.h;
        if (oTextView != null) {
            oTextView.setText(str);
        }
    }

    public final void setTitle(String str) {
        this.f7913e = str;
        OTextView oTextView = this.f7915g;
        if (oTextView != null) {
            oTextView.setText(str);
        }
    }

    public final void setType(int i) {
        if ((i == 0 || i == 1) && i != this.a) {
            this.a = i;
            g(i);
            setTitle(this.f7913e);
            setInfo(this.f7914f);
            boolean z = this.b;
            this.b = z;
            OTextView oTextView = this.h;
            if (oTextView != null) {
                b.i(oTextView, z);
            }
            boolean z2 = this.f7912d;
            this.f7912d = z2;
            ImageView imageView = this.i;
            if (imageView != null) {
                b.i(imageView, z2);
            }
            boolean z3 = this.f7911c;
            this.f7911c = z3;
            ImageView imageView2 = this.j;
            if (imageView2 != null) {
                b.i(imageView2, z3);
            }
            View view = this.l;
            if (view != null) {
                setActionView(view);
            }
        }
    }

    public OPanelTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0062, code lost:
    
        if ((r4 == null || r4.length() == 0) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OPanelTitleBar(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.s.c.l.f(r4, r0)
            r3.<init>(r4, r5, r6)
            r0 = 1
            r3.a = r0
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r1 = e.i.a.b.b.z
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r2)
            r5 = 5
            int r5 = r4.getInt(r5, r0)
            r3.a = r5
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r0)
            r3.b = r5
            r5 = 3
            boolean r5 = r4.getBoolean(r5, r2)
            r3.f7911c = r5
            boolean r5 = r4.getBoolean(r0, r2)
            r3.f7912d = r5
            r5 = 4
            java.lang.String r5 = r4.getString(r5)
            r3.f7913e = r5
            java.lang.String r5 = r4.getString(r2)
            r3.f7914f = r5
            r4.recycle()
            int r4 = r3.a
            r3.g(r4)
            java.lang.String r4 = r3.f7913e
            r3.setTitle(r4)
            java.lang.String r4 = r3.f7914f
            r3.setInfo(r4)
            boolean r4 = r3.b
            if (r4 == 0) goto L65
            java.lang.String r4 = r3.f7914f
            if (r4 == 0) goto L61
            int r4 = r4.length()
            if (r4 != 0) goto L5f
            goto L61
        L5f:
            r4 = r2
            goto L62
        L61:
            r4 = r0
        L62:
            if (r4 != 0) goto L65
            goto L66
        L65:
            r0 = r2
        L66:
            r3.b = r0
            com.obric.oui.text.OTextView r4 = r3.h
            if (r4 == 0) goto L6f
            com.obric.oui.common.util.b.i(r4, r0)
        L6f:
            boolean r4 = r3.f7912d
            r3.f7912d = r4
            android.widget.ImageView r5 = r3.i
            if (r5 == 0) goto L7a
            com.obric.oui.common.util.b.i(r5, r4)
        L7a:
            boolean r4 = r3.f7911c
            r3.f7911c = r4
            android.widget.ImageView r5 = r3.j
            if (r5 == 0) goto L85
            com.obric.oui.common.util.b.i(r5, r4)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.paneltitlebar.OPanelTitleBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
