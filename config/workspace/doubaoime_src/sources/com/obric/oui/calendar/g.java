package com.obric.oui.calendar;

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
import com.obric.oui.calendar.i;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
class g extends AppCompatCheckedTextView {
    private CalendarDay a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f7677c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f7678d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f7679e;

    /* renamed from: f, reason: collision with root package name */
    private com.obric.oui.calendar.w.e f7680f;

    /* renamed from: g, reason: collision with root package name */
    private com.obric.oui.calendar.w.e f7681g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private final Rect l;
    private final Rect m;

    public g(Context context, CalendarDay calendarDay) {
        super(context);
        this.b = -7829368;
        this.f7677c = null;
        com.obric.oui.calendar.w.e eVar = com.obric.oui.calendar.w.e.a;
        this.f7680f = eVar;
        this.f7681g = eVar;
        this.h = true;
        this.i = true;
        this.j = false;
        this.k = 4;
        this.l = new Rect();
        this.m = new Rect();
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
        Drawable drawable = this.f7678d;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
            return;
        }
        int i = this.b;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(50);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, b(i));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new RippleDrawable(ColorStateList.valueOf(i), null, b(-1)));
        stateListDrawable.addState(new int[0], b(0));
        this.f7679e = stateListDrawable;
        setBackgroundDrawable(stateListDrawable);
    }

    private void h() {
        boolean z = this.i && this.h && !this.j;
        setEnabled(this.h && !this.j);
        int i = this.k;
        int i2 = MaterialCalendarView.D;
        boolean z2 = (i & 1) != 0;
        boolean z3 = ((i & 2) != 0) || z2;
        boolean z4 = (i & 4) != 0;
        boolean z5 = this.i;
        if (!z5 && z2) {
            z = true;
        }
        boolean z6 = this.h;
        if (!z6 && z3) {
            z |= z5;
        }
        if (this.j && z4) {
            z |= z5 && z6;
        }
        if (!z5 && z) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        setVisibility(z ? 0 : 4);
    }

    void a(i iVar) {
        this.j = iVar.b();
        h();
        Drawable c2 = iVar.c();
        if (c2 == null) {
            this.f7677c = null;
        } else {
            this.f7677c = c2.getConstantState().newDrawable(getResources());
        }
        invalidate();
        Drawable d2 = iVar.d();
        if (d2 == null) {
            this.f7678d = null;
        } else {
            this.f7678d = d2.getConstantState().newDrawable(getResources());
        }
        e();
        List<i.a> e2 = iVar.e();
        if (e2.isEmpty()) {
            setText(d());
            return;
        }
        String d3 = d();
        SpannableString spannableString = new SpannableString(d());
        Iterator<i.a> it2 = e2.iterator();
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
        return ((com.obric.oui.calendar.w.c) this.f7680f).a(this.a);
    }

    public void f(com.obric.oui.calendar.w.e eVar) {
        com.obric.oui.calendar.w.e eVar2 = this.f7681g;
        if (eVar2 == this.f7680f) {
            eVar2 = eVar;
        }
        this.f7681g = eVar2;
        if (eVar == null) {
            eVar = com.obric.oui.calendar.w.e.a;
        }
        this.f7680f = eVar;
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

    public void g(com.obric.oui.calendar.w.e eVar) {
        String a;
        if (eVar == null) {
            eVar = this.f7680f;
        }
        this.f7681g = eVar;
        if (eVar == null) {
            a = ((com.obric.oui.calendar.w.c) this.f7680f).a(this.a);
        } else {
            a = ((com.obric.oui.calendar.w.c) eVar).a(this.a);
        }
        setContentDescription(a);
    }

    public void i(int i) {
        this.b = i;
        e();
    }

    protected void j(int i, boolean z, boolean z2) {
        this.k = i;
        this.i = z2;
        this.h = z;
        h();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        Drawable drawable = this.f7677c;
        if (drawable != null) {
            drawable.setBounds(this.l);
            this.f7677c.setState(getDrawableState());
            this.f7677c.draw(canvas);
        }
        this.f7679e.setBounds(this.m);
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
            this.l.set(abs, 0, i7, i6);
            this.m.set(abs, 0, i7, i6);
        } else {
            int i8 = min + abs;
            this.l.set(0, abs, i5, i8);
            this.m.set(0, abs, i5, i8);
        }
        e();
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        e.i.b.d.a.a(getContext(), 1);
        return performClick;
    }
}
