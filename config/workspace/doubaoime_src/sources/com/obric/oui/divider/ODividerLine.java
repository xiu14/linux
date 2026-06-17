package com.obric.oui.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.i.a.b.a;
import e.i.a.b.b;

/* loaded from: classes2.dex */
public class ODividerLine extends LinearLayout {
    private View a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private View f7728c;

    public ODividerLine(Context context) {
        this(context, null);
    }

    public ODividerLine(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ODividerLine(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = View.inflate(context, C0838R.layout.o_view_divider_line, this);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(C0838R.id.tv_left_text);
        this.f7728c = this.a.findViewById(C0838R.id.underline);
        this.a.setBackgroundColor(ContextCompat.getColor(context, C0838R.color.BGPrimary));
        Log.d("SETTING", "getBaseStyle() called with: context = [" + context + "], attrs = [" + attributeSet + "]");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.q);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f7728c.setVisibility(8);
        }
        this.f7728c.setBackgroundColor(ContextCompat.getColor(context, C0838R.color.LinePrimary));
        this.a.setBackgroundColor(ContextCompat.getColor(context, C0838R.color.BGPrimary));
        String string = obtainStyledAttributes.getString(2);
        if (!TextUtils.isEmpty(string)) {
            this.b.setText(string);
        } else {
            this.b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.f7728c.getLayoutParams()).bottomMargin = a.c(4);
        }
        this.b.setTextColor(ContextCompat.getColor(context, C0838R.color.TextTertiary));
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.b.setAllCaps(true);
        }
        obtainStyledAttributes.recycle();
    }
}
