package com.obric.oui.tips;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.e;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class OTips extends ConstraintLayout {
    private final e a;
    private final e b;

    /* renamed from: c, reason: collision with root package name */
    private final e f8099c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f8100d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f8101e;

    /* compiled from: kotlin-style lambda group */
    static final class a extends m implements kotlin.s.b.a<ImageView> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(0);
            this.a = i;
            this.b = obj;
        }

        @Override // kotlin.s.b.a
        public final ImageView invoke() {
            int i = this.a;
            if (i == 0) {
                return (ImageView) ((OTips) this.b).findViewById(C0838R.id.iv_left);
            }
            if (i == 1) {
                return (ImageView) ((OTips) this.b).findViewById(C0838R.id.iv_right);
            }
            throw null;
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ kotlin.s.b.a a;

        b(kotlin.s.b.a aVar) {
            this.a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ kotlin.s.b.a a;

        c(kotlin.s.b.a aVar) {
            this.a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    static final class d extends m implements kotlin.s.b.a<TextView> {
        d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public TextView invoke() {
            return (TextView) OTips.this.findViewById(C0838R.id.tv_left);
        }
    }

    public OTips(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ void setLeftIconRes$default(OTips oTips, int i, ColorStateList colorStateList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            colorStateList = null;
        }
        oTips.setLeftIconRes(i, colorStateList);
    }

    public static /* synthetic */ void setRightIconRes$default(OTips oTips, int i, ColorStateList colorStateList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            colorStateList = null;
        }
        oTips.setRightIconRes(i, colorStateList);
    }

    public final ImageView g() {
        return (ImageView) this.a.getValue();
    }

    public final ImageView h() {
        return (ImageView) this.f8099c.getValue();
    }

    public final TextView i() {
        return (TextView) this.b.getValue();
    }

    public final void setLeftIconOnClickListener(kotlin.s.b.a<o> aVar) {
        l.f(aVar, "clickAction");
        ImageView g2 = g();
        if (g2 != null) {
            g2.setOnClickListener(new b(aVar));
        }
    }

    public final void setLeftIconRes(int i, ColorStateList colorStateList) {
        Drawable drawable;
        ImageView g2 = g();
        if (g2 != null) {
            g2.setImageResource(i);
            if (colorStateList != null) {
                Drawable drawable2 = g2.getDrawable();
                if (drawable2 != null) {
                    drawable2.setTintList(colorStateList);
                }
            } else if (this.f8101e != null && (drawable = g2.getDrawable()) != null) {
                drawable.setTintList(this.f8101e);
            }
            com.obric.oui.common.util.b.g(g2);
            g2.invalidate();
        }
    }

    public final void setRightIconOnClickListener(kotlin.s.b.a<o> aVar) {
        l.f(aVar, "clickAction");
        ImageView h = h();
        if (h != null) {
            h.setOnClickListener(new c(aVar));
        }
    }

    public final void setRightIconRes(int i, ColorStateList colorStateList) {
        Drawable drawable;
        ImageView h = h();
        if (h != null) {
            h.setImageResource(i);
            if (colorStateList != null) {
                Drawable drawable2 = h.getDrawable();
                if (drawable2 != null) {
                    drawable2.setTintList(colorStateList);
                }
            } else if (this.f8100d != null && (drawable = h.getDrawable()) != null) {
                drawable.setTintList(this.f8100d);
            }
            com.obric.oui.common.util.b.g(h);
            h.invalidate();
        }
    }

    public final void setTextRolling(boolean z) {
        TextView i = i();
        l.e(i, "tipsTv");
        i.setSelected(z);
        if (z) {
            TextView i2 = i();
            l.e(i2, "tipsTv");
            i2.setMovementMethod(null);
            TextView i3 = i();
            l.e(i3, "tipsTv");
            CharSequence text = i3.getText();
            String obj = text != null ? text.toString() : null;
            TextView i4 = i();
            l.e(i4, "tipsTv");
            i4.setText((CharSequence) null);
            TextView i5 = i();
            l.e(i5, "tipsTv");
            i5.setText(obj);
            setTipsLine(1);
            TextView i6 = i();
            l.e(i6, "tipsTv");
            i6.setMarqueeRepeatLimit(-1);
            TextView i7 = i();
            l.e(i7, "tipsTv");
            i7.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        } else {
            TextView i8 = i();
            l.e(i8, "tipsTv");
            i8.setEllipsize(TextUtils.TruncateAt.END);
        }
        invalidate();
    }

    public final void setTipsLine(int i) {
        TextView i2 = i();
        l.e(i2, "tipsTv");
        i2.setMaxLines(i);
        TextView i3 = i();
        l.e(i3, "tipsTv");
        i3.setSingleLine(i == 1);
        invalidate();
    }

    public final void setTipsText(String str) {
        TextView i = i();
        l.e(i, "tipsTv");
        i.setText(str);
        invalidate();
    }

    public OTips(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTips(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        Drawable drawable2;
        l.f(context, "context");
        this.a = kotlin.a.c(new a(0, this));
        this.b = kotlin.a.c(new d());
        this.f8099c = kotlin.a.c(new a(1, this));
        LayoutInflater.from(context).inflate(C0838R.layout.o_tips, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.Q);
            l.e(obtainStyledAttributes, "context.obtainStyledAttr…attrs, R.styleable.OTips)");
            Drawable drawable3 = obtainStyledAttributes.getDrawable(1);
            if (drawable3 != null) {
                g().setImageDrawable(drawable3);
                ImageView g2 = g();
                l.e(g2, "leftIcon");
                com.obric.oui.common.util.b.g(g2);
                invalidate();
            }
            Drawable drawable4 = obtainStyledAttributes.getDrawable(0);
            if (drawable4 != null) {
                h().setImageDrawable(drawable4);
                ImageView h = h();
                l.e(h, "rightIcon");
                com.obric.oui.common.util.b.g(h);
                invalidate();
            }
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
            if (colorStateList != null) {
                this.f8101e = colorStateList;
                ImageView g3 = g();
                if (g3 != null && (drawable2 = g3.getDrawable()) != null) {
                    drawable2.setTintList(colorStateList);
                }
            }
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList2 != null) {
                this.f8100d = colorStateList2;
                ImageView h2 = h();
                if (h2 != null && (drawable = h2.getDrawable()) != null) {
                    drawable.setTintList(colorStateList2);
                }
            }
            Integer valueOf = Integer.valueOf(obtainStyledAttributes.getColor(8, -1));
            valueOf = valueOf.intValue() != -1 ? valueOf : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                TextView i2 = i();
                if (i2 != null) {
                    i2.setTextColor(intValue);
                }
            }
            setTipsText(obtainStyledAttributes.getString(7));
            setTipsLine(obtainStyledAttributes.getInteger(6, 1));
            setTextRolling(obtainStyledAttributes.getBoolean(5, false));
            obtainStyledAttributes.getString(4);
            obtainStyledAttributes.recycle();
        }
    }
}
