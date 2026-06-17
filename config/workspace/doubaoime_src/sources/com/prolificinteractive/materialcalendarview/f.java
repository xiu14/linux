package com.prolificinteractive.materialcalendarview;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import com.prolificinteractive.materialcalendarview.h;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
class f extends AppCompatCheckedTextView {
    private CalendarDay a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8216c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f8217d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f8218e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f8219f;

    /* renamed from: g, reason: collision with root package name */
    private com.prolificinteractive.materialcalendarview.w.e f8220g;
    private com.prolificinteractive.materialcalendarview.w.e h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private final Rect m;
    private final Rect n;

    public f(Context context, CalendarDay calendarDay) {
        super(context);
        this.b = -7829368;
        this.f8217d = null;
        com.prolificinteractive.materialcalendarview.w.e eVar = com.prolificinteractive.materialcalendarview.w.e.a;
        this.f8220g = eVar;
        this.h = eVar;
        this.i = true;
        this.j = true;
        this.k = false;
        this.l = 4;
        this.m = new Rect();
        this.n = new Rect();
        this.f8216c = getResources().getInteger(R.integer.config_shortAnimTime);
        this.b = this.b;
        e();
        setGravity(17);
        setTextAlignment(4);
        this.a = calendarDay;
        setText(d());
    }

    private static Drawable b(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    private void e() {
        Drawable drawable = this.f8218e;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
            return;
        }
        int i = this.b;
        int i2 = this.f8216c;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(i2);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, b(i));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new RippleDrawable(ColorStateList.valueOf(i), null, b(-1)));
        stateListDrawable.addState(new int[0], b(0));
        this.f8219f = stateListDrawable;
        setBackgroundDrawable(stateListDrawable);
    }

    private void h() {
        boolean z = this.j && this.i && !this.k;
        setEnabled(this.i && !this.k);
        int i = this.l;
        int i2 = MaterialCalendarView.B;
        boolean z2 = (i & 1) != 0;
        boolean z3 = ((i & 2) != 0) || z2;
        boolean z4 = (i & 4) != 0;
        boolean z5 = this.j;
        if (!z5 && z2) {
            z = true;
        }
        boolean z6 = this.i;
        if (!z6 && z3) {
            z |= z5;
        }
        if (this.k && z4) {
            z |= z5 && z6;
        }
        if (!z5 && z) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        setVisibility(z ? 0 : 4);
    }

    void a(h hVar) {
        this.k = hVar.b();
        h();
        Drawable c2 = hVar.c();
        if (c2 == null) {
            this.f8217d = null;
        } else {
            this.f8217d = c2.getConstantState().newDrawable(getResources());
        }
        invalidate();
        Drawable d2 = hVar.d();
        if (d2 == null) {
            this.f8218e = null;
        } else {
            this.f8218e = d2.getConstantState().newDrawable(getResources());
        }
        e();
        List<h.a> e2 = hVar.e();
        if (e2.isEmpty()) {
            setText(d());
            return;
        }
        String d3 = d();
        SpannableString spannableString = new SpannableString(d());
        Iterator<h.a> it2 = e2.iterator();
        while (it2.hasNext()) {
            Objects.requireNonNull(it2.next());
            spannableString.setSpan(null, 0, d3.length(), 33);
        }
        setText(spannableString);
    }

    public CalendarDay c() {
        return this.a;
    }

    @NonNull
    public String d() {
        return ((com.prolificinteractive.materialcalendarview.w.c) this.f8220g).a(this.a);
    }

    public void f(com.prolificinteractive.materialcalendarview.w.e eVar) {
        com.prolificinteractive.materialcalendarview.w.e eVar2 = this.h;
        if (eVar2 == this.f8220g) {
            eVar2 = eVar;
        }
        this.h = eVar2;
        if (eVar == null) {
            eVar = com.prolificinteractive.materialcalendarview.w.e.a;
        }
        this.f8220g = eVar;
        CharSequence text = getText();
        Object[] spans = text instanceof Spanned ? ((Spanned) text).getSpans(0, text.length(), Object.class) : null;
        SpannableString spannableString = new SpannableString(d());
        if (spans != null) {
            for (Object obj : spans) {
                spannableString.setSpan(obj, 0, spannableString.length(), 33);
            }
        }
        setText(spannableString);
    }

    public void g(com.prolificinteractive.materialcalendarview.w.e eVar) {
        String a;
        if (eVar == null) {
            eVar = this.f8220g;
        }
        this.h = eVar;
        if (eVar == null) {
            a = ((com.prolificinteractive.materialcalendarview.w.c) this.f8220g).a(this.a);
        } else {
            a = ((com.prolificinteractive.materialcalendarview.w.c) eVar).a(this.a);
        }
        setContentDescription(a);
    }

    public void i(int i) {
        this.b = i;
        e();
    }

    protected void j(int i, boolean z, boolean z2) {
        this.l = i;
        this.j = z2;
        this.i = z;
        h();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        Drawable drawable = this.f8217d;
        if (drawable != null) {
            drawable.setBounds(this.m);
            this.f8217d.setState(getDrawableState());
            this.f8217d.draw(canvas);
        }
        this.f8219f.setBounds(this.n);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int min = Math.min(i6, i5);
        int abs = Math.abs(i6 - i5) / 2;
        if (i5 >= i6) {
            int i7 = min + abs;
            this.m.set(abs, 0, i7, i6);
            this.n.set(abs, 0, i7, i6);
        } else {
            int i8 = min + abs;
            this.m.set(0, abs, i5, i8);
            this.n.set(0, abs, i5, i8);
        }
        e();
    }
}
