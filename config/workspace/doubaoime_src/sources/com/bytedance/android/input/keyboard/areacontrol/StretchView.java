package com.bytedance.android.input.keyboard.areacontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.common_biz.ui.widget.ImeIconTextView;

/* loaded from: classes.dex */
public final class StretchView extends FrameLayout implements View.OnTouchListener, View.OnClickListener {
    private final String a;
    private LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f2640c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2641d;

    /* renamed from: e, reason: collision with root package name */
    private float f2642e;

    /* renamed from: f, reason: collision with root package name */
    private float f2643f;

    /* renamed from: g, reason: collision with root package name */
    private int f2644g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private float l;
    private float m;
    private ImeIconTextView n;
    private ImeIconTextView o;
    private ImeIconTextView p;
    private boolean q;
    private RelativeLayout r;
    private RelativeLayout s;
    private boolean t;
    private int u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StretchView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    private final void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = marginLayoutParams.bottomMargin;
        k kVar = k.a;
        if (i == k.w() && marginLayoutParams.height == k.q() && marginLayoutParams.leftMargin == 0 && marginLayoutParams.rightMargin == 0) {
            com.bytedance.android.input.r.j.i(this.a, "checkIsSetDefaultStyle setDefaultStyle");
            i();
        } else {
            com.bytedance.android.input.r.j.i(this.a, "checkIsSetDefaultStyle setAdjusted");
            h();
        }
    }

    private final void b() {
        LinearLayout linearLayout = this.b;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mKeyboardWhole");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("checkStyleState it.bottomMargin: ");
            M.append(marginLayoutParams.bottomMargin);
            M.append(" InputViewModel.mCurrentPlaceholderMargin=");
            k kVar = k.a;
            M.append(k.w());
            M.append(" lp.height: ");
            M.append(marginLayoutParams.height);
            M.append(" InputViewModel.getKeyboardWholeHeightDefault=");
            M.append(k.q());
            M.append(" leftMargin: ");
            M.append(marginLayoutParams.leftMargin);
            M.append(" rightMargin: ");
            e.a.a.a.a.B0(M, marginLayoutParams.rightMargin, str);
            if (marginLayoutParams.bottomMargin == k.w() && marginLayoutParams.height == k.q() && marginLayoutParams.leftMargin == 0 && marginLayoutParams.rightMargin == 0) {
                i();
            } else {
                h();
            }
        }
    }

    private final int c() {
        k kVar = k.a;
        int w = k.w() + k.j();
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("getMaxHeight:InputViewModel.mCurrentPlaceholderMargin=");
        M.append(k.w());
        M.append(" InputViewModel.getKeyboardPortMaxHeight=");
        M.append(k.j());
        M.append(" getMaxHeight=");
        M.append(w);
        com.bytedance.android.input.r.j.i(str, M.toString());
        return w;
    }

    private final void e(MotionEvent motionEvent, boolean z) {
        int i;
        boolean z2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2641d = true;
            this.f2642e = motionEvent.getRawY();
            this.f2644g = getTop();
            this.h = getBottom();
            this.u = 0;
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (this.f2641d) {
                    float rawY = motionEvent.getRawY() - this.f2642e;
                    if (Math.abs(rawY) >= 1.0d) {
                        this.j = false;
                        if (z) {
                            h();
                            int i2 = (int) rawY;
                            LinearLayout linearLayout = this.b;
                            if (linearLayout == null) {
                                kotlin.s.c.l.l("mKeyboardWhole");
                                throw null;
                            }
                            int height = linearLayout.getHeight() - i2;
                            RelativeLayout relativeLayout = this.f2640c;
                            if (relativeLayout == null) {
                                kotlin.s.c.l.l("mKeyboardKeyArea");
                                throw null;
                            }
                            int height2 = relativeLayout.getHeight() - i2;
                            LinearLayout linearLayout2 = this.b;
                            if (linearLayout2 == null) {
                                kotlin.s.c.l.l("mKeyboardWhole");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            if (marginLayoutParams != null) {
                                int c2 = c() - marginLayoutParams.bottomMargin;
                                RelativeLayout relativeLayout2 = this.f2640c;
                                if (relativeLayout2 == null) {
                                    kotlin.s.c.l.l("mKeyboardKeyArea");
                                    throw null;
                                }
                                relativeLayout2.getHeight();
                                String str = this.a;
                                StringBuilder O = e.a.a.a.a.O("doStretchUp:dy=", i2, " newHeight=", height, " maxReachValue=");
                                e.a.a.a.a.F0(O, c2, " newHeightKeyArea=", height2, " MinHeight=");
                                k kVar = k.a;
                                O.append(k.k());
                                O.append(" mKeyboardKeyArea.height=");
                                RelativeLayout relativeLayout3 = this.f2640c;
                                if (relativeLayout3 == null) {
                                    kotlin.s.c.l.l("mKeyboardKeyArea");
                                    throw null;
                                }
                                O.append(relativeLayout3.getHeight());
                                O.append(" lp.bottomMargin=");
                                e.a.a.a.a.B0(O, marginLayoutParams.bottomMargin, str);
                                if (height >= c2) {
                                    String str2 = this.a;
                                    StringBuilder M = e.a.a.a.a.M("doStretchUp1: mKeyboardWhole.height=");
                                    LinearLayout linearLayout3 = this.b;
                                    if (linearLayout3 == null) {
                                        kotlin.s.c.l.l("mKeyboardWhole");
                                        throw null;
                                    }
                                    M.append(linearLayout3.getHeight());
                                    M.append(" top = ");
                                    LinearLayout linearLayout4 = this.b;
                                    if (linearLayout4 == null) {
                                        kotlin.s.c.l.l("mKeyboardWhole");
                                        throw null;
                                    }
                                    M.append(linearLayout4.getTop());
                                    M.append(", oriTop = ");
                                    M.append(this.f2644g);
                                    M.append(", oriBottom = ");
                                    e.a.a.a.a.B0(M, this.h, str2);
                                    LinearLayout linearLayout5 = this.b;
                                    if (linearLayout5 == null) {
                                        kotlin.s.c.l.l("mKeyboardWhole");
                                        throw null;
                                    }
                                    if (linearLayout5.getHeight() < c2) {
                                        LinearLayout linearLayout6 = this.b;
                                        if (linearLayout6 == null) {
                                            kotlin.s.c.l.l("mKeyboardWhole");
                                            throw null;
                                        }
                                        i2 = linearLayout6.getHeight() - c2;
                                        e.a.a.a.a.j0("doStretchUp1: dyModify = ", i2, this.a);
                                        r3 = 1;
                                    } else {
                                        com.bytedance.android.input.r.j.i(this.a, "[flag]doStretchUp 向上滑动到底&极限...");
                                        j();
                                    }
                                } else if (height2 < k.k()) {
                                    String str3 = this.a;
                                    StringBuilder M2 = e.a.a.a.a.M("doStretchUp2: mKeyboardKeyArea.height=");
                                    RelativeLayout relativeLayout4 = this.f2640c;
                                    if (relativeLayout4 == null) {
                                        kotlin.s.c.l.l("mKeyboardKeyArea");
                                        throw null;
                                    }
                                    M2.append(relativeLayout4.getHeight());
                                    M2.append(" top = ");
                                    LinearLayout linearLayout7 = this.b;
                                    if (linearLayout7 == null) {
                                        kotlin.s.c.l.l("mKeyboardWhole");
                                        throw null;
                                    }
                                    M2.append(linearLayout7.getTop());
                                    M2.append(", oriTop = ");
                                    M2.append(this.f2644g);
                                    M2.append(", oriBottom = ");
                                    e.a.a.a.a.B0(M2, this.h, str3);
                                    RelativeLayout relativeLayout5 = this.f2640c;
                                    if (relativeLayout5 == null) {
                                        kotlin.s.c.l.l("mKeyboardKeyArea");
                                        throw null;
                                    }
                                    if (relativeLayout5.getHeight() > k.k()) {
                                        RelativeLayout relativeLayout6 = this.f2640c;
                                        if (relativeLayout6 == null) {
                                            kotlin.s.c.l.l("mKeyboardKeyArea");
                                            throw null;
                                        }
                                        i2 = relativeLayout6.getHeight() - k.k();
                                        e.a.a.a.a.j0("doStretchUp2: dyModify = ", i2, this.a);
                                        r3 = 1;
                                    } else {
                                        com.bytedance.android.input.r.j.i(this.a, "[flag]doStretchUp 向下滑动到底&极限...");
                                        j();
                                    }
                                }
                                String str4 = this.a;
                                StringBuilder M3 = e.a.a.a.a.M("doStretchUp:mOriTop=");
                                e.a.a.a.a.F0(M3, this.f2644g, " dyModify=", i2, " mKeyboardWhole.height=");
                                LinearLayout linearLayout8 = this.b;
                                if (linearLayout8 == null) {
                                    kotlin.s.c.l.l("mKeyboardWhole");
                                    throw null;
                                }
                                M3.append(linearLayout8.getHeight());
                                M3.append(" mOriBottom=");
                                e.a.a.a.a.B0(M3, this.h, str4);
                                int i3 = this.f2644g + i2;
                                this.f2644g = i3;
                                int i4 = this.h - i3;
                                LinearLayout linearLayout9 = this.b;
                                if (linearLayout9 == null) {
                                    kotlin.s.c.l.l("mKeyboardWhole");
                                    throw null;
                                }
                                linearLayout9.getLayoutParams().height = i4;
                                getLayoutParams().height = i4;
                                RelativeLayout relativeLayout7 = this.f2640c;
                                if (relativeLayout7 == null) {
                                    kotlin.s.c.l.l("mKeyboardKeyArea");
                                    throw null;
                                }
                                relativeLayout7.getLayoutParams().height = i4;
                                linearLayout9.requestLayout();
                                requestLayout();
                                String str5 = this.a;
                                StringBuilder M4 = e.a.a.a.a.M("doStretchUp:mOriTop=");
                                M4.append(this.f2644g);
                                M4.append(" mOriBottom - mOriTop=");
                                M4.append(this.h - this.f2644g);
                                com.bytedance.android.input.r.j.i(str5, M4.toString());
                                if (r3 != 0) {
                                    com.bytedance.android.input.r.j.i(this.a, "[flag]doStretchUp 滑动到底&极限...");
                                    j();
                                }
                            }
                        } else {
                            int i5 = (int) rawY;
                            LinearLayout linearLayout10 = this.b;
                            if (linearLayout10 == null) {
                                kotlin.s.c.l.l("mKeyboardWhole");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams2 = linearLayout10.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (marginLayoutParams2 != null) {
                                RelativeLayout relativeLayout8 = this.f2640c;
                                if (relativeLayout8 == null) {
                                    kotlin.s.c.l.l("mKeyboardKeyArea");
                                    throw null;
                                }
                                int height3 = relativeLayout8.getHeight() + i5;
                                k kVar2 = k.a;
                                if (height3 < k.k()) {
                                    String str6 = this.a;
                                    StringBuilder N = e.a.a.a.a.N("doStretchDown1: newHeight = ", height3, ", minHeight = ");
                                    N.append(k.k());
                                    N.append(" , dy = ");
                                    N.append(i5);
                                    com.bytedance.android.input.r.j.i(str6, N.toString());
                                    RelativeLayout relativeLayout9 = this.f2640c;
                                    if (relativeLayout9 == null) {
                                        kotlin.s.c.l.l("mKeyboardKeyArea");
                                        throw null;
                                    }
                                    if (relativeLayout9.getHeight() > k.k()) {
                                        int k = k.k();
                                        RelativeLayout relativeLayout10 = this.f2640c;
                                        if (relativeLayout10 == null) {
                                            kotlin.s.c.l.l("mKeyboardKeyArea");
                                            throw null;
                                        }
                                        i = k - relativeLayout10.getHeight();
                                        e.a.a.a.a.j0("doStretchDown1: dyModify = ", i, this.a);
                                        z2 = true;
                                    } else {
                                        LinearLayout linearLayout11 = this.b;
                                        if (linearLayout11 == null) {
                                            kotlin.s.c.l.l("mKeyboardWhole");
                                            throw null;
                                        }
                                        linearLayout11.getHeight();
                                        c();
                                        com.bytedance.android.input.r.j.i(this.a, "[flag]doStretchDown 向下滑动到底&极限...");
                                        j();
                                    }
                                } else {
                                    i = i5;
                                    z2 = false;
                                }
                                String str7 = this.a;
                                StringBuilder N2 = e.a.a.a.a.N("dy=", i5, " mOriBottom = ");
                                N2.append(this.h);
                                N2.append(", mOriTop= ");
                                N2.append(this.f2644g);
                                N2.append(" lp.bottomMargin=");
                                N2.append(marginLayoutParams2.bottomMargin);
                                N2.append("   mKeyboardKeyArea.height= ");
                                RelativeLayout relativeLayout11 = this.f2640c;
                                if (relativeLayout11 == null) {
                                    kotlin.s.c.l.l("mKeyboardKeyArea");
                                    throw null;
                                }
                                N2.append(relativeLayout11.getHeight());
                                N2.append(" mKeyboardWhole.height= ");
                                LinearLayout linearLayout12 = this.b;
                                if (linearLayout12 == null) {
                                    kotlin.s.c.l.l("mKeyboardWhole");
                                    throw null;
                                }
                                N2.append(linearLayout12.getHeight());
                                com.bytedance.android.input.r.j.i(str7, N2.toString());
                                if (this.h + i5 > c()) {
                                    String str8 = this.a;
                                    StringBuilder M5 = e.a.a.a.a.M("doStretchDown2: new bottom = ");
                                    M5.append(this.h + i5);
                                    M5.append(", bottomLimit = ");
                                    LinearLayout linearLayout13 = this.b;
                                    if (linearLayout13 == null) {
                                        kotlin.s.c.l.l("mKeyboardWhole");
                                        throw null;
                                    }
                                    M5.append(linearLayout13.getHeight());
                                    M5.append(", dy = ");
                                    M5.append(i5);
                                    com.bytedance.android.input.r.j.i(str8, M5.toString());
                                    if (this.h < c()) {
                                        i = c() - this.h;
                                        e.a.a.a.a.j0("doStretchDown2: dyModify = ", i, this.a);
                                        z2 = true;
                                    } else {
                                        com.bytedance.android.input.r.j.i(this.a, "[flag]doStretchDown 向下滑动到底&极限...");
                                        j();
                                    }
                                }
                                if (i5 > 0) {
                                    e.a.a.a.a.j0("doStretchDown 向下 dyModify = ", i, this.a);
                                    int i6 = marginLayoutParams2.bottomMargin;
                                    if (i6 == 0) {
                                        j();
                                    } else {
                                        int i7 = i6 - i;
                                        e.a.a.a.a.j0("doStretchDown currentBottom=", i7, this.a);
                                        r3 = i7 >= 0 ? i7 : 0;
                                        if (r3 == 0) {
                                            this.h += marginLayoutParams2.bottomMargin;
                                        } else {
                                            this.h += i;
                                        }
                                        marginLayoutParams2.bottomMargin = r3;
                                        int i8 = this.h - this.f2644g;
                                        String str9 = this.a;
                                        StringBuilder M6 = e.a.a.a.a.M("doStretchDown mOriBottom=");
                                        M6.append(this.h);
                                        M6.append(" currentHeight=");
                                        M6.append(i8);
                                        com.bytedance.android.input.r.j.i(str9, M6.toString());
                                        LinearLayout linearLayout14 = this.b;
                                        if (linearLayout14 == null) {
                                            kotlin.s.c.l.l("mKeyboardWhole");
                                            throw null;
                                        }
                                        linearLayout14.getLayoutParams().height = i8;
                                        linearLayout14.setLayoutParams(marginLayoutParams2);
                                        getLayoutParams().height = i8;
                                        RelativeLayout relativeLayout12 = this.f2640c;
                                        if (relativeLayout12 == null) {
                                            kotlin.s.c.l.l("mKeyboardKeyArea");
                                            throw null;
                                        }
                                        relativeLayout12.getLayoutParams().height = i8;
                                        linearLayout14.requestLayout();
                                    }
                                } else {
                                    e.a.a.a.a.j0("doStretchDown 向上 dyModify = ", i, this.a);
                                    int i9 = marginLayoutParams2.bottomMargin - i;
                                    marginLayoutParams2.bottomMargin = i9;
                                    int i10 = this.h + i;
                                    this.h = i10;
                                    int i11 = i10 - this.f2644g;
                                    String str10 = this.a;
                                    StringBuilder N3 = e.a.a.a.a.N("doStretchDown currentBottom=", i9, " mOriBottom=");
                                    N3.append(this.h);
                                    N3.append(" currentHeight=");
                                    N3.append(i11);
                                    com.bytedance.android.input.r.j.i(str10, N3.toString());
                                    LinearLayout linearLayout15 = this.b;
                                    if (linearLayout15 == null) {
                                        kotlin.s.c.l.l("mKeyboardWhole");
                                        throw null;
                                    }
                                    linearLayout15.getLayoutParams().height = i11;
                                    linearLayout15.setLayoutParams(marginLayoutParams2);
                                    getLayoutParams().height = i11;
                                    RelativeLayout relativeLayout13 = this.f2640c;
                                    if (relativeLayout13 == null) {
                                        kotlin.s.c.l.l("mKeyboardKeyArea");
                                        throw null;
                                    }
                                    relativeLayout13.getLayoutParams().height = i11;
                                    linearLayout15.requestLayout();
                                }
                                requestLayout();
                                if (z2) {
                                    com.bytedance.android.input.r.j.i(this.a, "[flag]doStretchDown 滑动到底&极限...");
                                    j();
                                }
                                a(marginLayoutParams2);
                            }
                        }
                        this.f2642e = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.f2641d = false;
        com.bytedance.android.input.r.j.i(this.a, "doStopStretch");
    }

    private final void f(MotionEvent motionEvent, boolean z) {
        e.a.a.a.a.y0("[hand_write] onBtnHorizontalEvent isLeft = ", z, this.a);
        LinearLayout linearLayout = this.b;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mKeyboardWhole");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int action = motionEvent.getAction();
        int i = 0;
        if (action == 0) {
            this.f2641d = true;
            this.f2643f = motionEvent.getRawX();
            this.u = 0;
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (this.f2641d) {
                    float rawX = motionEvent.getRawX() - this.f2643f;
                    if (Math.abs(rawX) < 1.0d || Math.abs(rawX) > this.i + 20) {
                        return;
                    }
                    this.j = false;
                    h();
                    int i2 = (int) rawX;
                    int i3 = marginLayoutParams.leftMargin;
                    int i4 = marginLayoutParams.rightMargin;
                    if (z) {
                        i3 += i2;
                    } else {
                        i4 -= i2;
                    }
                    if (i3 < 0) {
                        j();
                        i3 = 0;
                    }
                    if (i4 < 0) {
                        j();
                    } else {
                        i = i4;
                    }
                    int i5 = i3 + i;
                    int i6 = this.i;
                    if (i5 > i6) {
                        int i7 = i5 - i6;
                        if (z) {
                            i3 -= i7;
                        } else {
                            i -= i7;
                        }
                        j();
                    }
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i;
                    LinearLayout linearLayout2 = this.b;
                    if (linearLayout2 == null) {
                        kotlin.s.c.l.l("mKeyboardWhole");
                        throw null;
                    }
                    linearLayout2.setLayoutParams(marginLayoutParams);
                    LinearLayout linearLayout3 = this.b;
                    if (linearLayout3 == null) {
                        kotlin.s.c.l.l("mKeyboardWhole");
                        throw null;
                    }
                    linearLayout3.requestLayout();
                    if (i3 == 0 && i == 0) {
                        a(marginLayoutParams);
                    }
                    this.f2643f = motionEvent.getRawX();
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.f2641d = false;
        com.bytedance.android.input.r.j.i(this.a, "doStopStretch");
    }

    private final void h() {
        if (this.t) {
            return;
        }
        this.t = true;
        ImeIconTextView imeIconTextView = this.o;
        if (imeIconTextView != null) {
            imeIconTextView.setIcon(C0838R.drawable.ic_keyboard_adjust_reset_change);
            imeIconTextView.setTextColor(ContextCompat.getColor(getContext(), C0838R.color.ime_color_white));
        }
    }

    private final void i() {
        if (this.t) {
            this.t = false;
            ImeIconTextView imeIconTextView = this.o;
            if (imeIconTextView != null) {
                imeIconTextView.setIcon(C0838R.drawable.ic_keyboard_adjust_reset);
                imeIconTextView.setTextColor(ContextCompat.getColor(getContext(), C0838R.color.ime_color_a5a5a5));
            }
        }
    }

    private final void j() {
        if (this.u < 2) {
            UserInteractiveManagerNext.a.b();
            this.u++;
        }
    }

    @Override // android.view.View
    public void bringToFront() {
        super.bringToFront();
        com.bytedance.android.input.r.j.i(this.a, "[hand_write] handleStartLogic");
        k kVar = k.a;
        k.e0(false);
        if (k.Q()) {
            this.q = false;
            RelativeLayout relativeLayout = this.r;
            if (relativeLayout != null) {
                e.b.d.a.a.e.e(relativeLayout);
            }
            RelativeLayout relativeLayout2 = this.s;
            if (relativeLayout2 != null) {
                e.b.d.a.a.e.e(relativeLayout2);
            }
            LinearLayout linearLayout = this.b;
            if (linearLayout == null) {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            e.a.a.a.a.B0(e.a.a.a.a.M("handleStartLogic isHandWriteMode  maxHorizontalMarginSum="), this.i, this.a);
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
            LinearLayout linearLayout2 = this.b;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutParams(marginLayoutParams);
                return;
            } else {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
        }
        this.q = true;
        RelativeLayout relativeLayout3 = this.r;
        if (relativeLayout3 != null) {
            e.b.d.a.a.e.h(relativeLayout3);
        }
        RelativeLayout relativeLayout4 = this.s;
        if (relativeLayout4 != null) {
            e.b.d.a.a.e.h(relativeLayout4);
        }
        if (k.U()) {
            LinearLayout linearLayout3 = this.b;
            if (linearLayout3 == null) {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = linearLayout3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 == null) {
                return;
            }
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("handleStartLogic isRightHandMode=");
            M.append(k.W());
            M.append("  maxHorizontalMarginSum=");
            M.append(this.i);
            com.bytedance.android.input.r.j.i(str, M.toString());
            if (k.W()) {
                marginLayoutParams2.leftMargin = this.i;
                marginLayoutParams2.rightMargin = 0;
            } else {
                marginLayoutParams2.leftMargin = 0;
                marginLayoutParams2.rightMargin = this.i;
            }
            LinearLayout linearLayout4 = this.b;
            if (linearLayout4 != null) {
                linearLayout4.setLayoutParams(marginLayoutParams2);
            } else {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
        }
    }

    public final void d(LinearLayout linearLayout, RelativeLayout relativeLayout) {
        kotlin.s.c.l.f(linearLayout, "keyboardWhole");
        kotlin.s.c.l.f(relativeLayout, "keyboardKeyArea");
        com.bytedance.android.input.r.j.i(this.a, "initPage");
        this.b = linearLayout;
        this.f2640c = relativeLayout;
        k kVar = k.a;
        this.i = k.A();
        View findViewById = findViewById(C0838R.id.stretch_up);
        if (findViewById != null) {
            findViewById.setOnTouchListener(this);
        }
        View findViewById2 = findViewById(C0838R.id.stretch_down);
        if (findViewById2 != null) {
            findViewById2.setOnTouchListener(this);
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(C0838R.id.stretch_left);
        this.r = relativeLayout2;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnTouchListener(this);
        }
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(C0838R.id.stretch_right);
        this.s = relativeLayout3;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnTouchListener(this);
        }
        ImeIconTextView imeIconTextView = (ImeIconTextView) findViewById(C0838R.id.btn_stretch_move);
        this.n = imeIconTextView;
        if (imeIconTextView != null) {
            imeIconTextView.setOnTouchListener(this);
        }
        this.o = (ImeIconTextView) findViewById(C0838R.id.btn_stretch_reset);
        this.p = (ImeIconTextView) findViewById(C0838R.id.btn_stretch_complete);
        ImeIconTextView imeIconTextView2 = this.o;
        if (imeIconTextView2 != null) {
            imeIconTextView2.setOnClickListener(this);
        }
        ImeIconTextView imeIconTextView3 = this.p;
        if (imeIconTextView3 != null) {
            imeIconTextView3.setOnClickListener(this);
        }
        b();
    }

    public final void g() {
        com.bytedance.android.input.r.j.i(this.a, "resetToConfigHeight");
        if (getVisibility() == 0) {
            setVisibility(8);
            LinearLayout linearLayout = this.b;
            if (linearLayout == null) {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            k kVar = k.a;
            layoutParams.height = k.p();
            RelativeLayout relativeLayout = this.f2640c;
            if (relativeLayout == null) {
                kotlin.s.c.l.l("mKeyboardKeyArea");
                throw null;
            }
            relativeLayout.getLayoutParams().height = k.f();
            LinearLayout linearLayout2 = this.b;
            if (linearLayout2 == null) {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = k.b();
                marginLayoutParams.leftMargin = k.h();
                marginLayoutParams.rightMargin = k.l();
                LinearLayout linearLayout3 = this.b;
                if (linearLayout3 == null) {
                    kotlin.s.c.l.l("mKeyboardWhole");
                    throw null;
                }
                linearLayout3.setLayoutParams(marginLayoutParams);
            }
            LinearLayout linearLayout4 = this.b;
            if (linearLayout4 == null) {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
            linearLayout4.requestLayout();
            KeyboardJni.quitStretchMode();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null) {
            int id = view.getId();
            if (id == C0838R.id.btn_stretch_complete) {
                k kVar = k.a;
                boolean Q = k.Q();
                setVisibility(8);
                LinearLayout linearLayout = this.b;
                if (linearLayout == null) {
                    kotlin.s.c.l.l("mKeyboardWhole");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = 0;
                }
                LinearLayout linearLayout2 = this.b;
                if (linearLayout2 == null) {
                    kotlin.s.c.l.l("mKeyboardWhole");
                    throw null;
                }
                int height = linearLayout2.getHeight();
                e.a.a.a.a.j0("doComplete whole height=", height, this.a);
                RelativeLayout relativeLayout = this.f2640c;
                if (relativeLayout == null) {
                    kotlin.s.c.l.l("mKeyboardKeyArea");
                    throw null;
                }
                int height2 = relativeLayout.getHeight();
                e.a.a.a.a.j0("doComplete area height=", height2, this.a);
                k.a(height, height2, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0, marginLayoutParams != null ? marginLayoutParams.leftMargin : 0, marginLayoutParams != null ? marginLayoutParams.rightMargin : 0, this.j, Q);
                if (!k.Q()) {
                    KeyboardJni.onlySetOneHandInputMode(false);
                }
                KeyboardJni.quitStretchMode();
                return;
            }
            if (id != C0838R.id.btn_stretch_reset) {
                return;
            }
            this.j = true;
            i();
            k kVar2 = k.a;
            boolean Q2 = k.Q();
            String str = this.a;
            StringBuilder X = e.a.a.a.a.X("doReset isHandWriteMode=", Q2, " mKeyboardBottomMargin=");
            X.append(k.g());
            X.append(" InputViewModel.mCurrentPlaceholderMargin=");
            X.append(k.w());
            com.bytedance.android.input.r.j.i(str, X.toString());
            LinearLayout linearLayout3 = this.b;
            if (linearLayout3 == null) {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
            linearLayout3.getLayoutParams().height = k.q();
            RelativeLayout relativeLayout2 = this.f2640c;
            if (relativeLayout2 == null) {
                kotlin.s.c.l.l("mKeyboardKeyArea");
                throw null;
            }
            relativeLayout2.getLayoutParams().height = k.q();
            getLayoutParams().height = k.q();
            LinearLayout linearLayout4 = this.b;
            if (linearLayout4 == null) {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = linearLayout4.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = k.w();
                marginLayoutParams2.topMargin = 0;
                marginLayoutParams2.leftMargin = 0;
                marginLayoutParams2.rightMargin = 0;
                LinearLayout linearLayout5 = this.b;
                if (linearLayout5 == null) {
                    kotlin.s.c.l.l("mKeyboardWhole");
                    throw null;
                }
                linearLayout5.setLayoutParams(marginLayoutParams2);
            }
            LinearLayout linearLayout6 = this.b;
            if (linearLayout6 != null) {
                linearLayout6.requestLayout();
            } else {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r11 != 3) goto L123;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.areacontrol.StretchView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        e.a.a.a.a.N0(e.a.a.a.a.M("onVisibilityChanged is not visibility: "), i != 0, this.a);
        if (i != 0) {
            LinearLayout linearLayout = this.b;
            if (linearLayout == null) {
                kotlin.s.c.l.l("mKeyboardWhole");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
            }
        }
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StretchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "[StretchView]";
        this.q = true;
        FrameLayout.inflate(context, C0838R.layout.layout_keyboard_stretch, this);
    }
}
