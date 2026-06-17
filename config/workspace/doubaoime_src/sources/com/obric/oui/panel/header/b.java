package com.obric.oui.panel.header;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: f, reason: collision with root package name */
    private final AppCompatImageView f7906f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f7907g;
    private final ImageView h;
    private final View i;
    private final View j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, View.OnClickListener onClickListener, CharSequence charSequence, int i) {
        super(context, false, 0, 4);
        float dimension;
        l.f(context, "context");
        l.f(context, "context");
        View inflate = View.inflate(c.a(this, context, false, 2, null), C0838R.layout.o_basic_panel_normal_header, null);
        l.e(inflate, "View.inflate(generateThe…anel_normal_header, null)");
        this.j = inflate;
        Context c2 = c();
        l.f(c2, "context");
        l.f(c2, "context");
        TypedValue typedValue = new TypedValue();
        typedValue = c2.getTheme().resolveAttribute(C0838R.attr.oui_PanelDefaultHeaderHeight, typedValue, true) ? typedValue : null;
        if (typedValue == null || typedValue.type != 5) {
            dimension = c2.getResources().getDimension(C0838R.dimen.oui_panel_default_header_height);
        } else {
            Resources resources = c2.getResources();
            l.e(resources, "context.resources");
            dimension = typedValue.getDimension(resources.getDisplayMetrics());
        }
        int i2 = (int) dimension;
        inflate.setBackgroundColor(0);
        View findViewById = inflate.findViewById(C0838R.id.iv_close);
        l.e(findViewById, "rootView.findViewById(R.id.iv_close)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById;
        this.f7906f = appCompatImageView;
        View findViewById2 = inflate.findViewById(C0838R.id.tv_title);
        l.e(findViewById2, "rootView.findViewById(R.id.tv_title)");
        TextView textView = (TextView) findViewById2;
        this.f7907g = textView;
        View findViewById3 = inflate.findViewById(C0838R.id.iv_back);
        l.e(findViewById3, "rootView.findViewById(R.id.iv_back)");
        ImageView imageView = (ImageView) findViewById3;
        this.h = imageView;
        View findViewById4 = inflate.findViewById(C0838R.id.divider);
        l.e(findViewById4, "rootView.findViewById(R.id.divider)");
        l.e(inflate.findViewById(C0838R.id.grabber), "rootView.findViewById(R.id.grabber)");
        View findViewById5 = inflate.findViewById(C0838R.id.main_view);
        l.e(findViewById5, "rootView.findViewById(R.id.main_view)");
        this.i = findViewById5;
        ViewGroup.LayoutParams layoutParams = findViewById5.getLayoutParams();
        if (layoutParams == null) {
            throw new kotlin.l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i2;
        findViewById5.setLayoutParams(layoutParams);
        if (!TextUtils.isEmpty(null)) {
            l.c(null);
            Boolean bool = Boolean.FALSE;
            l.f(null, "charSequence");
            textView.setText((CharSequence) null);
            textView.setCompoundDrawables(null, null, null, null);
            if (l.a(bool, Boolean.TRUE)) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
        }
        if (!ViewCompat.isAttachedToWindow(inflate)) {
            inflate.addOnAttachStateChangeListener(new a(inflate, this));
        } else {
            int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 44);
            com.obric.oui.common.util.b.d(inflate, e0, e0, imageView, appCompatImageView);
        }
    }

    @Override // com.obric.oui.panel.header.c
    public View d() {
        return this.j;
    }
}
