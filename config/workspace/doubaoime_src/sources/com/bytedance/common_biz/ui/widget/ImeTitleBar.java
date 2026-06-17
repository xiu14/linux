package com.bytedance.common_biz.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.bytedance.android.input.common_biz.ui.databinding.ImeTitleBarBinding;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class ImeTitleBar extends FrameLayout {
    private final ImeTitleBarBinding a;
    private kotlin.s.b.a<o> b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f4373c;

    static final class a extends m implements l<View, o> {
        final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(1);
            this.b = context;
        }

        @Override // kotlin.s.b.l
        public o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            if (ImeTitleBar.this.b != null) {
                kotlin.s.b.a aVar = ImeTitleBar.this.b;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else {
                Context context = this.b;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
            return o.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTitleBar(Context context) {
        this(context, null, 0);
        kotlin.s.c.l.f(context, "context");
    }

    public final void b(boolean z) {
        this.a.b.setVisibility(z ? 0 : 8);
    }

    public final void c(boolean z) {
        this.a.i.setVisibility(z ? 0 : 8);
    }

    public final boolean d() {
        return this.a.f2278c.getVisibility() == 0;
    }

    public final ImeTitleBar e(String str) {
        kotlin.s.c.l.f(str, "text");
        TextView textView = this.f4373c;
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    public final ImeTitleBar f(int i) {
        TextView textView = this.f4373c;
        if (textView != null) {
            textView.setTextColor(i);
        }
        return this;
    }

    public final ImeTitleBar g(View.OnClickListener onClickListener) {
        kotlin.s.c.l.f(onClickListener, "rightTextOnClickListener");
        TextView textView = this.f4373c;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        return this;
    }

    public final ImeTitleBar h(boolean z) {
        if (z) {
            TextView textView = this.f4373c;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f4373c;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        return this;
    }

    public final void i(boolean z) {
        if (z) {
            ImageView imageView = this.a.f2278c;
            kotlin.s.c.l.e(imageView, "binding.ivBack");
            e.b.d.a.a.e.h(imageView);
        } else {
            ImageView imageView2 = this.a.f2278c;
            kotlin.s.c.l.e(imageView2, "binding.ivBack");
            e.b.d.a.a.e.e(imageView2);
        }
    }

    public final void setBackArrowIcon(@DrawableRes int i) {
        this.a.f2278c.setImageResource(i);
        if (i != 0) {
            ImageView imageView = this.a.f2278c;
            kotlin.s.c.l.e(imageView, "binding.ivBack");
            e.b.d.a.a.e.h(imageView);
        } else {
            ImageView imageView2 = this.a.f2278c;
            kotlin.s.c.l.e(imageView2, "binding.ivBack");
            e.b.d.a.a.e.e(imageView2);
        }
    }

    public final void setIvRightOnClickListener(View.OnClickListener onClickListener) {
        kotlin.s.c.l.f(onClickListener, "listener");
        this.a.f2279d.setOnClickListener(onClickListener);
    }

    public final void setOnBackClickListener(kotlin.s.b.a<o> aVar) {
        kotlin.s.c.l.f(aVar, "listener");
        this.b = aVar;
    }

    public final void setTextFont(Typeface typeface) {
        this.a.h.setTypeface(typeface);
    }

    public final void setTextStyle(int i) {
        this.a.h.setTextAppearance(i);
    }

    public final void setTitle(String str) {
        kotlin.s.c.l.f(str, "text");
        this.a.h.setText(str);
    }

    public final void setTitleIcon(int i) {
        if (i == 0) {
            ImageView imageView = this.a.f2280e;
            kotlin.s.c.l.e(imageView, "binding.ivTitleIcon");
            e.b.d.a.a.e.e(imageView);
        } else {
            this.a.f2280e.setBackgroundResource(i);
            ImageView imageView2 = this.a.f2280e;
            kotlin.s.c.l.e(imageView2, "binding.ivTitleIcon");
            e.b.d.a.a.e.h(imageView2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImeTitleBar(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common_biz.ui.widget.ImeTitleBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
