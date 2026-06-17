package com.obric.oui.infopanel;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.common.util.b;
import com.obric.oui.text.OTextView;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OInfoPanelView extends ConstraintLayout {
    private final ViewGroup a;
    private final ViewGroup b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f7842c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f7843d;

    /* renamed from: e, reason: collision with root package name */
    private final OTextView f7844e;

    /* renamed from: f, reason: collision with root package name */
    private final OTextView f7845f;

    /* renamed from: g, reason: collision with root package name */
    private NestedScrollView f7846g;
    private View h;
    private final a i;

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ Context b;

        a(Context context) {
            this.b = context;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (OInfoPanelView.this.h == null) {
                return;
            }
            int[] iArr = new int[2];
            View view = OInfoPanelView.this.h;
            if (view != null) {
                view.getLocationInWindow(iArr);
            }
            View view2 = OInfoPanelView.this.h;
            l.c(view2);
            int height = view2.getHeight() + iArr[1];
            int e2 = e.i.a.b.a.e(this.b);
            Log.e("jiangyunkai", "height: " + e2);
            Log.e("jiangyunkai", "bottom:" + height);
            if (height > e2) {
                if (TextUtils.isEmpty(OInfoPanelView.this.f7845f.getText().toString())) {
                    Objects.requireNonNull(OInfoPanelView.this);
                    return;
                }
                Resources system = Resources.getSystem();
                l.e(system, "Resources.getSystem()");
                int height2 = OInfoPanelView.this.f7846g.getHeight() - ((height - e2) - kotlin.t.a.a(TypedValue.applyDimension(1, 12, system.getDisplayMetrics())));
                if (height2 < e.a.a.a.a.e0("Resources.getSystem()", 1, 15)) {
                    Objects.requireNonNull(OInfoPanelView.this);
                } else {
                    NestedScrollView nestedScrollView = OInfoPanelView.this.f7846g;
                    ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new kotlin.l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = height2;
                    nestedScrollView.setLayoutParams(layoutParams);
                }
                OInfoPanelView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    public OInfoPanelView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void setBottomActionView$default(OInfoPanelView oInfoPanelView, com.obric.oui.infopanel.action.a aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        oInfoPanelView.setBottomActionView(aVar, z);
    }

    public static /* synthetic */ void setCustomContent$default(OInfoPanelView oInfoPanelView, View view, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 2) != 0) {
            layoutParams = null;
        }
        oInfoPanelView.setCustomContent(view, layoutParams);
    }

    public final void setBottomActionView(com.obric.oui.infopanel.action.a aVar, boolean z) {
        l.f(aVar, "view");
        View a2 = aVar.a();
        this.h = a2;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.topToBottom = this.b.getId();
        layoutParams.verticalBias = 1.0f;
        if (z) {
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            layoutParams.setMargins(0, kotlin.t.a.a(TypedValue.applyDimension(1, 12, system.getDisplayMetrics())), 0, 0);
        }
        addView(a2, layoutParams);
    }

    public final void setCustomContent(View view, ViewGroup.LayoutParams layoutParams) {
        l.f(view, "view");
        if (layoutParams != null) {
            this.f7842c.addView(view, layoutParams);
        } else {
            this.f7842c.addView(view);
        }
    }

    public final void setDesc(CharSequence charSequence) {
        if (charSequence != null) {
            this.f7845f.setText(charSequence);
            b.g(this.f7845f);
        } else {
            b.f(this.f7845f);
            ViewGroup.LayoutParams layoutParams = this.f7845f.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        }
    }

    public final void setImgSize(int i, int i2) {
        ImageView imageView = this.f7843d;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new kotlin.l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        imageView.setLayoutParams(layoutParams);
    }

    public final void setInsetTopImg(int i) {
        this.a.setPadding(0, 0, 0, 0);
        if (this.b.getLayoutParams() != null) {
            ViewGroup viewGroup = this.b;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, e.a.a.a.a.e0("Resources.getSystem()", 1, 24), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            viewGroup.setLayoutParams(marginLayoutParams);
        }
        this.f7843d.setImageResource(i);
    }

    public final void setScrollableDesc(CharSequence charSequence) {
        setDesc(charSequence);
        getViewTreeObserver().addOnGlobalLayoutListener(this.i);
    }

    public final void setTitle(CharSequence charSequence) {
        l.f(charSequence, "title");
        this.f7844e.setText(charSequence);
    }

    public final void setUnInsetImg(int i) {
        ViewGroup viewGroup = this.a;
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        viewGroup.setPadding(0, kotlin.t.a.a(TypedValue.applyDimension(1, 32, system.getDisplayMetrics())), 0, 0);
        if (this.b.getLayoutParams() != null) {
            ViewGroup viewGroup2 = this.b;
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, e.a.a.a.a.e0("Resources.getSystem()", 1, 16), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            viewGroup2.setLayoutParams(marginLayoutParams);
        }
        this.f7843d.setImageResource(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OInfoPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        float f2 = 290;
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        setMinimumHeight(kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
        ViewGroup.inflate(context, C0838R.layout.o_info_panel_frame, this);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        Resources system2 = Resources.getSystem();
        l.e(system2, "Resources.getSystem()");
        setMinHeight(kotlin.t.a.a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics())));
        setLayoutParams(layoutParams);
        View findViewById = findViewById(C0838R.id.header_container);
        l.e(findViewById, "findViewById(R.id.header_container)");
        this.a = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0838R.id.content_container);
        l.e(findViewById2, "findViewById(R.id.content_container)");
        this.b = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(C0838R.id.desc_container);
        l.e(findViewById3, "findViewById(R.id.desc_container)");
        this.f7846g = (NestedScrollView) findViewById3;
        View findViewById4 = findViewById(C0838R.id.custom_container);
        l.e(findViewById4, "findViewById(R.id.custom_container)");
        this.f7842c = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(C0838R.id.iv_illustration);
        l.e(findViewById5, "findViewById(R.id.iv_illustration)");
        this.f7843d = (ImageView) findViewById5;
        View findViewById6 = findViewById(C0838R.id.tv_title);
        l.e(findViewById6, "findViewById(R.id.tv_title)");
        this.f7844e = (OTextView) findViewById6;
        View findViewById7 = findViewById(C0838R.id.tv_desc);
        OTextView oTextView = (OTextView) findViewById7;
        double textSize = oTextView.getTextSize() * 1.4d;
        if (Double.isNaN(textSize)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        oTextView.setLineHeight(textSize > 2.147483647E9d ? Integer.MAX_VALUE : textSize < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(textSize));
        l.e(findViewById7, "findViewById<OTextView>(…4).roundToInt()\n        }");
        this.f7845f = (OTextView) findViewById7;
        this.i = new a(context);
    }

    public final void setBottomActionView(com.obric.oui.infopanel.action.a aVar, ConstraintLayout.LayoutParams layoutParams) {
        l.f(aVar, "view");
        l.f(layoutParams, com.heytap.mcssdk.constant.b.D);
        View a2 = aVar.a();
        this.h = a2;
        addView(a2, layoutParams);
    }
}
