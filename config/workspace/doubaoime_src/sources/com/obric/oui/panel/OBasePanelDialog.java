package com.obric.oui.panel;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.dialog.alert.view.RadiusLayout;
import java.util.Objects;
import kotlin.s.b.l;

/* loaded from: classes2.dex */
public class OBasePanelDialog extends BottomSheetDialog {

    @ColorInt
    private Integer A;
    private kotlin.s.b.a<Boolean> B;
    private boolean C;
    private ConstraintLayout D;
    private RadiusLayout E;

    /* renamed from: J, reason: collision with root package name */
    private RadiusLayout f7890J;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private com.obric.oui.panel.header.c p;
    private boolean q;
    private l<? super MotionEvent, Boolean> r;
    private boolean s;
    private boolean t;
    private View.OnClickListener u;
    private boolean v;
    private boolean w;
    private Integer x;
    private Integer y;
    private boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OBasePanelDialog(android.content.Context r1, int r2, int r3) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 2131886446(0x7f12016e, float:1.9407471E38)
        L7:
            java.lang.String r3 = "context"
            kotlin.s.c.l.f(r1, r3)
            r0.<init>(r1, r2)
            r1 = -1
            r0.j = r1
            r1 = 1
            r0.n = r1
            r0.z = r1
            r0.C = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.panel.OBasePanelDialog.<init>(android.content.Context, int, int):void");
    }

    private final View A(int i, View view, ViewGroup.LayoutParams layoutParams) {
        Window window;
        View d2;
        View d3;
        RadiusLayout radiusLayout;
        if (this.D == null || this.E == null || this.f7890J == null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) View.inflate(getContext(), C0838R.layout.o_basic_panel, null);
            this.D = constraintLayout;
            this.E = constraintLayout != null ? (RadiusLayout) constraintLayout.findViewById(C0838R.id.header_container) : null;
            ConstraintLayout constraintLayout2 = this.D;
            this.f7890J = constraintLayout2 != null ? (RadiusLayout) constraintLayout2.findViewById(C0838R.id.content_container) : null;
        }
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) this.f7890J, false);
        }
        RadiusLayout radiusLayout2 = this.f7890J;
        if (radiusLayout2 != null) {
            radiusLayout2.removeAllViews();
        }
        if (layoutParams == null) {
            RadiusLayout radiusLayout3 = this.f7890J;
            if (radiusLayout3 != null) {
                radiusLayout3.addView(view);
            }
        } else {
            RadiusLayout radiusLayout4 = this.f7890J;
            if (radiusLayout4 != null) {
                radiusLayout4.addView(view, layoutParams);
            }
        }
        if (this.p == null) {
            Context context = getContext();
            kotlin.s.c.l.e(context, "context");
            this.p = new com.obric.oui.panel.header.b(context, null, null, 6);
        }
        float m = this.C ? e.a.a.a.a.m("Resources.getSystem()", 1, 20) : 0.0f;
        RadiusLayout radiusLayout5 = this.E;
        if (radiusLayout5 != null) {
            radiusLayout5.setRadius(m, m, 0.0f, 0.0f);
        }
        if (this.m && (radiusLayout = this.f7890J) != null) {
            radiusLayout.setRadius(m, m, 0.0f, 0.0f);
        }
        com.obric.oui.panel.header.c cVar = this.p;
        if (((cVar == null || (d3 = cVar.d()) == null) ? null : d3.getParent()) instanceof ViewGroup) {
            com.obric.oui.panel.header.c cVar2 = this.p;
            ViewParent parent = (cVar2 == null || (d2 = cVar2.d()) == null) ? null : d2.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                com.obric.oui.panel.header.c cVar3 = this.p;
                viewGroup.removeView(cVar3 != null ? cVar3.d() : null);
            }
        }
        RadiusLayout radiusLayout6 = this.E;
        if (radiusLayout6 != null) {
            com.obric.oui.panel.header.c cVar4 = this.p;
            View d4 = cVar4 != null ? cVar4.d() : null;
            kotlin.s.c.l.f(radiusLayout6, "$this$removeFromParentAndAdd");
            if ((d4 != null ? d4.getParent() : null) != null && (d4.getParent() instanceof ViewGroup)) {
                kotlin.s.c.l.f(d4, "$this$removeFromParent");
                if (d4.getParent() != null && (d4.getParent() instanceof ViewGroup)) {
                    ViewParent parent2 = d4.getParent();
                    Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent2).removeView(d4);
                }
            }
            radiusLayout6.addView(d4);
        }
        if (this.m && this.f7890J != null) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this.D);
            RadiusLayout radiusLayout7 = this.f7890J;
            kotlin.s.c.l.c(radiusLayout7);
            constraintSet.clear(radiusLayout7.getId(), 3);
            RadiusLayout radiusLayout8 = this.f7890J;
            kotlin.s.c.l.c(radiusLayout8);
            constraintSet.connect(radiusLayout8.getId(), 3, 0, 3);
            constraintSet.applyTo(this.D);
            RadiusLayout radiusLayout9 = this.E;
            if (radiusLayout9 != null) {
                radiusLayout9.setBackground(null);
            }
            RadiusLayout radiusLayout10 = this.E;
            if (radiusLayout10 != null) {
                radiusLayout10.bringToFront();
            }
        }
        if (!this.n && (window = getWindow()) != null) {
            window.setDimAmount(0.0f);
        }
        if (this.o) {
            Integer num = this.A;
            if (num != null) {
                int intValue = num.intValue();
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setNavigationBarColor(intValue);
                }
            } else {
                int i2 = this.q ? this.k ? C0838R.color.BGPanelTone : C0838R.color.BGPanelTint : this.k ? C0838R.color.ConstBGPanelReverse : C0838R.color.ConstTextInverse;
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setNavigationBarColor(ContextCompat.getColor(getContext(), i2));
                }
            }
        }
        ConstraintLayout constraintLayout3 = this.D;
        kotlin.s.c.l.c(constraintLayout3);
        return constraintLayout3;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kotlin.s.c.l.f(motionEvent, "ev");
        l<? super MotionEvent, Boolean> lVar = this.r;
        if (lVar == null || !lVar.invoke(motionEvent).booleanValue()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void f() {
        RadiusLayout radiusLayout = this.E;
        if (radiusLayout != null) {
            com.obric.oui.common.util.b.f(radiusLayout);
        }
    }

    public final void g(boolean z) {
        this.o = z;
    }

    public final void h(boolean z) {
        this.v = z;
    }

    public final void i(boolean z) {
        this.q = z;
    }

    public final void j(boolean z) {
        this.n = z;
    }

    public final void k(boolean z) {
        this.C = z;
    }

    public final void l(Integer num) {
        this.x = null;
    }

    public final void m(boolean z) {
        this.w = z;
    }

    public final void n(l<? super MotionEvent, Boolean> lVar) {
        this.r = null;
    }

    public final void o(boolean z) {
        this.l = z;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        kotlin.s.b.a<Boolean> aVar = this.B;
        if (aVar == null || !aVar.invoke().booleanValue()) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if ((r4 != null ? r4.getBoolean(r0.intValue()) : false) != false) goto L21;
     */
    @Override // com.obric.oui.panel.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            com.obric.oui.panel.BottomSheetBehavior r8 = r7.c()
            java.lang.String r0 = "behavior"
            kotlin.s.c.l.e(r8, r0)
            r1 = 1
            r8.l = r1
            com.obric.oui.panel.BottomSheetBehavior r8 = r7.c()
            boolean r2 = r7.z
            r8.E = r2
            com.obric.oui.panel.BottomSheetBehavior r8 = r7.c()
            boolean r2 = r7.w
            r2 = r2 ^ r1
            r8.f(r2)
            boolean r8 = r7.l
            r2 = 0
            if (r8 == 0) goto La9
            r7.e(r1)
            com.obric.oui.panel.BottomSheetBehavior r8 = r7.c()
            kotlin.s.c.l.e(r8, r0)
            java.lang.Integer r0 = r7.x
            if (r0 == 0) goto L3c
            kotlin.s.c.l.c(r0)
            int r0 = r0.intValue()
            goto La5
        L3c:
            android.content.Context r0 = r7.getContext()
            java.lang.String r3 = "context"
            kotlin.s.c.l.e(r0, r3)
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L5a
            java.lang.String r4 = "config_showNavigationBar"
            java.lang.String r5 = "bool"
            java.lang.String r6 = "android"
            int r0 = r0.getIdentifier(r4, r5, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L5b
        L5a:
            r0 = 0
        L5b:
            if (r0 == 0) goto L7d
            int r4 = r0.intValue()
            if (r4 <= 0) goto L7d
            android.content.Context r4 = r7.getContext()
            kotlin.s.c.l.e(r4, r3)
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L79
            int r0 = r0.intValue()
            boolean r0 = r4.getBoolean(r0)
            goto L7a
        L79:
            r0 = r2
        L7a:
            if (r0 == 0) goto L7d
            goto L7e
        L7d:
            r1 = r2
        L7e:
            if (r1 == 0) goto L92
            android.content.Context r0 = r7.getContext()
            kotlin.s.c.l.e(r0, r3)
            int r0 = e.i.a.b.a.e(r0)
            double r0 = (double) r0
            r2 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            goto La3
        L92:
            android.content.Context r0 = r7.getContext()
            kotlin.s.c.l.e(r0, r3)
            int r0 = e.i.a.b.a.e(r0)
            double r0 = (double) r0
            r2 = 4603579539098121011(0x3fe3333333333333, double:0.6)
        La3:
            double r0 = r0 * r2
            int r0 = (int) r0
        La5:
            r8.setPeekHeight(r0)
            goto Le0
        La9:
            com.obric.oui.panel.BottomSheetBehavior r8 = r7.c()
            com.obric.oui.panel.header.c r0 = r7.p
            if (r0 == 0) goto Lb8
            boolean r0 = r0.b()
            if (r0 != r1) goto Lb8
            goto Lb9
        Lb8:
            r1 = r2
        Lb9:
            r8.setDraggable(r1)
            int r8 = r7.j
            if (r8 <= 0) goto Le0
            com.obric.oui.panel.BottomSheetBehavior r8 = r7.c()
            int r0 = r7.j
            r8.i(r0)
            boolean r8 = r7.t
            if (r8 == 0) goto Le0
            int r8 = r7.j
            r0 = 2131362325(0x7f0a0215, float:1.8344427E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 == 0) goto Le0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r8
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.panel.OBasePanelDialog.onCreate(android.os.Bundle):void");
    }

    @Override // com.obric.oui.panel.BottomSheetDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onStart() {
        View findViewById;
        int e2;
        FrameLayout frameLayout;
        super.onStart();
        if (this.s && (frameLayout = (FrameLayout) findViewById(C0838R.id.design_bottom_sheet)) != null) {
            frameLayout.setMinimumHeight(0);
        }
        float m = this.C ? e.a.a.a.a.m("Resources.getSystem()", 1, 20) : 0.0f;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{m, m, m, m, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(ContextCompat.getColor(getContext(), this.q ? this.k ? C0838R.color.BGPanelTone : C0838R.color.BGPanelTint : this.k ? C0838R.color.ConstBGPanelReverse : C0838R.color.ConstTextInverse));
        FrameLayout d2 = d();
        if (d2 != null) {
            d2.setBackground(gradientDrawable);
        }
        if (this.l) {
            Integer num = this.y;
            if (num != null) {
                kotlin.s.c.l.c(num);
                e2 = num.intValue();
            } else {
                kotlin.s.c.l.e(getContext(), "context");
                e2 = (int) (e.i.a.b.a.e(r0) * 0.9d);
            }
            FrameLayout frameLayout2 = (FrameLayout) findViewById(C0838R.id.design_bottom_sheet);
            if (frameLayout2 != null) {
                frameLayout2.getLayoutParams().height = e2;
            }
        }
        boolean z = this.z;
        FrameLayout frameLayout3 = (FrameLayout) findViewById(C0838R.id.container);
        if (frameLayout3 != null) {
            frameLayout3.setFitsSystemWindows(z);
        }
        c().h(this.l);
        if (this.u != null && (findViewById = findViewById(C0838R.id.touch_outside)) != null) {
            findViewById.setOnClickListener(this.u);
        }
        c().e(this.v);
    }

    public final void p(Integer num) {
        this.y = null;
    }

    public final void q(boolean z) {
        this.z = z;
    }

    public final void r(boolean z) {
        this.t = z;
    }

    public final void s(boolean z) {
        this.m = z;
    }

    @Override // com.obric.oui.panel.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        kotlin.s.c.l.f(view, "view");
        super.setContentView(A(0, view, null));
    }

    public final void t(int i) {
        this.j = i;
    }

    public final void u(Integer num) {
        this.A = null;
    }

    public final void v(kotlin.s.b.a<Boolean> aVar) {
        this.B = null;
    }

    public final void w(View.OnClickListener onClickListener) {
        this.u = null;
    }

    public final void x(com.obric.oui.panel.header.c cVar) {
        this.p = null;
    }

    public final void y(boolean z) {
        this.s = z;
    }

    public final void z(boolean z) {
        this.k = z;
    }

    @Override // com.obric.oui.panel.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(A(i, null, null));
    }

    @Override // com.obric.oui.panel.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.s.c.l.f(view, "view");
        super.setContentView(A(0, view, layoutParams));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBasePanelDialog(Context context, int i) {
        super(context, i);
        kotlin.s.c.l.f(context, "context");
        this.j = -1;
        this.n = true;
        this.z = true;
        this.C = true;
    }
}
