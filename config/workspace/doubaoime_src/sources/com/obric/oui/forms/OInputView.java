package com.obric.oui.forms;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.forms.OEditText;
import com.obric.oui.layout.OUIConstraintLayout;
import com.obric.oui.text.OTextView;
import java.util.Iterator;
import java.util.Objects;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.r;
import kotlin.s.c.m;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class OInputView extends ConstraintLayout {
    public static final /* synthetic */ int h0 = 0;
    private CharSequence A;
    private int B;
    private final OUIConstraintLayout C;
    private final LinearLayout D;
    private final OTextView E;

    /* renamed from: J, reason: collision with root package name */
    private final ImageView f7766J;
    private final OEditText K;
    private final FrameLayout L;
    private final FrameLayout M;
    private final View N;
    private final View O;
    private final View P;
    private final ImageView Q;
    private final View R;
    private final OTextView S;
    private final OTextView T;
    private final OTextView U;
    private TextView V;
    private f W;
    private boolean a;
    private g a0;
    private int b;
    private View.OnClickListener b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7767c;
    private boolean c0;

    /* renamed from: d, reason: collision with root package name */
    private int f7768d;
    private int d0;

    /* renamed from: e, reason: collision with root package name */
    private int f7769e;
    private boolean e0;

    /* renamed from: f, reason: collision with root package name */
    private int f7770f;
    private ValueAnimator f0;

    /* renamed from: g, reason: collision with root package name */
    private float f7771g;
    private ValueAnimator g0;
    private float h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private String q;
    private boolean r;
    private boolean s;
    private Integer t;
    private String u;
    private int v;
    private String w;
    private String x;
    private String y;
    private boolean z;

    public enum LabelUIState {
        REAL_LABEL_SHOW,
        FAKE_LABEL_SHOW,
        LABEL_NONE
    }

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                f fVar = ((OInputView) this.b).W;
                if (fVar != null) {
                    Editable text = ((OInputView) this.b).C().getText();
                    fVar.b(text != null ? text.toString() : null);
                }
                ((OInputView) this.b).setText("");
                f fVar2 = ((OInputView) this.b).W;
                if (fVar2 != null) {
                    fVar2.a();
                }
                ((OInputView) this.b).I();
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    throw null;
                }
                ((OInputView) this.b).C().requestFocus();
                if (((OInputView) this.b).C().hasFocus() && !((OInputView) this.b).C().isCursorVisible()) {
                    ((OInputView) this.b).C().setCursorVisible(true);
                }
                OInputView.p((OInputView) this.b);
                return;
            }
            if (((OInputView) this.b).v == ((OInputView) this.b).C().getInputType()) {
                ((OInputView) this.b).Q.setImageResource(C0838R.drawable.o_input_view_eyes_open);
                ((OInputView) this.b).C().setInputType(((OInputView) this.b).C().getInputType() | 144);
            } else {
                ((OInputView) this.b).Q.setImageResource(C0838R.drawable.o_input_view_eyes_close);
                ((OInputView) this.b).C().setInputType(((OInputView) this.b).v);
            }
            if (((OInputView) this.b).C().hasFocus()) {
                OEditText C = ((OInputView) this.b).C();
                Editable text2 = ((OInputView) this.b).C().getText();
                C.setSelection(text2 != null ? text2.length() : 0);
            }
        }
    }

    static final class b extends m implements l<Boolean, o> {
        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                OInputView.p(OInputView.this);
            } else if (OInputView.this.y()) {
                OInputView.m(OInputView.this);
            }
            OInputView.this.I();
            OInputView.this.J();
            OInputView.this.H(booleanValue);
            OInputView.this.G(false);
            OInputView.o(OInputView.this, booleanValue);
            return o.a;
        }
    }

    static final class c extends m implements l<MotionEvent, o> {
        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            Integer valueOf = motionEvent2 != null ? Integer.valueOf(motionEvent2.getActionMasked()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                OInputView.this.G(true);
            } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 1)) {
                OInputView.this.G(false);
            }
            return o.a;
        }
    }

    static final class d extends m implements r<CharSequence, Integer, Integer, Integer, o> {
        d() {
            super(4);
        }

        @Override // kotlin.s.b.r
        public o invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            CharSequence charSequence2 = charSequence;
            num.intValue();
            num2.intValue();
            num3.intValue();
            if (OInputView.this.m > 0) {
                boolean z = false;
                int length = charSequence2 != null ? charSequence2.length() : 0;
                OInputView oInputView = OInputView.this;
                oInputView.setErrorState(length > oInputView.m);
                OInputView.this.L(charSequence2 != null ? charSequence2.toString() : null);
                OInputView oInputView2 = OInputView.this;
                oInputView2.F(oInputView2.r);
                OInputView oInputView3 = OInputView.this;
                if (oInputView3.z && !OInputView.this.r) {
                    z = true;
                }
                oInputView3.E(z);
            }
            return o.a;
        }
    }

    static final class e extends m implements l<Editable, o> {
        e() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(Editable editable) {
            g gVar;
            Editable editable2 = editable;
            if (OInputView.this.m > 0) {
                boolean z = false;
                int length = editable2 != null ? editable2.length() : 0;
                OInputView oInputView = OInputView.this;
                oInputView.setErrorState(length > oInputView.m);
                OInputView oInputView2 = OInputView.this;
                oInputView2.F(oInputView2.r);
                OInputView oInputView3 = OInputView.this;
                if (oInputView3.z && !OInputView.this.r) {
                    z = true;
                }
                oInputView3.E(z);
                if (length > OInputView.this.m && (gVar = OInputView.this.a0) != null) {
                    gVar.a(String.valueOf(editable2));
                }
            }
            OInputView.this.I();
            OInputView.this.J();
            return o.a;
        }
    }

    public interface f {
        void a();

        void b(String str);
    }

    public interface g {
        void a(String str);
    }

    public OInputView(Context context) {
        this(context, null, 0, 6);
    }

    public OInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public /* synthetic */ OInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final float A(TextView textView) {
        float f2;
        float f3 = 0;
        if (this.E.getTextSize() <= f3 || textView.getTextSize() <= f3) {
            StringBuilder M = e.a.a.a.a.M("getScaleRatio, use default scale, vTitle.textSize: ");
            M.append(this.E.getTextSize());
            M.append(", vFakeInput.textSize: ");
            M.append(textView.getTextSize());
            e.i.b.f.e.b.f("OInputView", M.toString());
            f2 = 0.857143f;
        } else {
            f2 = this.E.getTextSize() / textView.getTextSize();
        }
        e.i.b.f.e.b.a("OInputView", "getScaleRatio, scale: " + f2);
        return f2;
    }

    private final boolean D() {
        int i = this.v & 4095;
        return (i == 129) || (i == 225) || (i == 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean z) {
        int i = this.d0;
        if (i != 0) {
            this.C.setBackgroundResource(i);
            return;
        }
        boolean z2 = this.s;
        int i2 = C0838R.drawable.o_input_view_pressed_background;
        if (z2 && !z) {
            i2 = this.K.hasFocus() ? C0838R.drawable.o_input_view_focused_background : C0838R.drawable.o_input_view_normal_background;
        }
        this.C.setBackgroundResource(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.s
            r1 = 0
            java.lang.String r2 = "Resources.getSystem()"
            r3 = 1
            if (r0 != 0) goto L9
            goto L19
        L9:
            if (r7 == 0) goto Le
            r0 = 2
            float r0 = (float) r0
            goto L1a
        Le:
            boolean r0 = r6.r
            if (r0 == 0) goto L19
            r4 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            float r0 = (float) r4
            goto L1a
        L19:
            float r0 = (float) r1
        L1a:
            int r0 = e.a.a.a.a.e0(r2, r3, r0)
            com.obric.oui.layout.OUIConstraintLayout r4 = r6.C
            r4.setBorderWidth(r0)
            boolean r0 = r6.s
            if (r0 != 0) goto L2d
            float r7 = (float) r1
            int r1 = e.a.a.a.a.e0(r2, r3, r7)
            goto L3a
        L2d:
            boolean r0 = r6.r
            if (r0 == 0) goto L35
            r1 = 2131101588(0x7f060794, float:1.781559E38)
            goto L3a
        L35:
            if (r7 == 0) goto L3a
            r1 = 2131101018(0x7f06055a, float:1.7814434E38)
        L3a:
            if (r1 == 0) goto L49
            com.obric.oui.layout.OUIConstraintLayout r7 = r6.C
            android.content.Context r0 = r6.getContext()
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r7.setBorderColor(r0)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.forms.OInputView.H(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            r4 = this;
            boolean r0 = r4.j
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r4.D()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L33
            int r0 = r4.b
            if (r0 != 0) goto L33
            boolean r0 = r4.s
            if (r0 == 0) goto L33
            com.obric.oui.forms.OEditText r0 = r4.K
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L33
            com.obric.oui.forms.OEditText r0 = r4.K
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L2e
            int r0 = r0.length()
            if (r0 != 0) goto L2c
            goto L2e
        L2c:
            r0 = r2
            goto L2f
        L2e:
            r0 = r1
        L2f:
            if (r0 != 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            android.view.View r3 = r4.O
            com.obric.oui.common.util.b.i(r3, r0)
            if (r0 == 0) goto L40
            android.widget.ImageView r0 = r4.Q
            com.obric.oui.common.util.b.i(r0, r2)
        L40:
            android.view.View r0 = r4.N
            android.view.View r3 = r4.O
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L4c
            r3 = r1
            goto L4d
        L4c:
            r3 = r2
        L4d:
            if (r3 != 0) goto L6b
            android.widget.ImageView r3 = r4.Q
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L59
            r3 = r1
            goto L5a
        L59:
            r3 = r2
        L5a:
            if (r3 != 0) goto L6b
            android.view.View r3 = r4.P
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L66
            r3 = r1
            goto L67
        L66:
            r3 = r2
        L67:
            if (r3 == 0) goto L6a
            goto L6b
        L6a:
            r1 = r2
        L6b:
            com.obric.oui.common.util.b.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.forms.OInputView.I():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            r4 = this;
            boolean r0 = r4.D()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L26
            boolean r0 = r4.s
            if (r0 == 0) goto L26
            com.obric.oui.forms.OEditText r0 = r4.K
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L1d
            int r0 = r0.length()
            if (r0 != 0) goto L1b
            goto L1d
        L1b:
            r0 = r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != 0) goto L26
            boolean r0 = r4.e0
            if (r0 != 0) goto L26
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            android.widget.ImageView r3 = r4.Q
            com.obric.oui.common.util.b.i(r3, r0)
            if (r0 == 0) goto L33
            android.view.View r0 = r4.O
            com.obric.oui.common.util.b.i(r0, r2)
        L33:
            android.view.View r0 = r4.N
            android.view.View r3 = r4.O
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L3f
            r3 = r1
            goto L40
        L3f:
            r3 = r2
        L40:
            if (r3 != 0) goto L5e
            android.widget.ImageView r3 = r4.Q
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L4c
            r3 = r1
            goto L4d
        L4c:
            r3 = r2
        L4d:
            if (r3 != 0) goto L5e
            android.view.View r3 = r4.P
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L59
            r3 = r1
            goto L5a
        L59:
            r3 = r2
        L5a:
            if (r3 == 0) goto L5d
            goto L5e
        L5d:
            r1 = r2
        L5e:
            com.obric.oui.common.util.b.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.forms.OInputView.J():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(LabelUIState labelUIState, TextView textView, String str) {
        e.i.b.f.e.b.a("OInputView", "updateLabelUIState, state: " + labelUIState + ", scene: [" + str + ']');
        int ordinal = labelUIState.ordinal();
        if (ordinal == 0) {
            this.D.setVisibility(0);
            textView.setVisibility(8);
            this.K.setAlpha(1.0f);
        } else if (ordinal == 1) {
            this.D.setVisibility(4);
            textView.setVisibility(0);
            this.K.setAlpha(0.0f);
        } else {
            if (ordinal != 2) {
                return;
            }
            this.D.setVisibility(8);
            textView.setVisibility(8);
            this.K.setAlpha(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String str) {
        com.obric.oui.common.util.b.i(this.U, this.l && this.m > 0);
        if (!this.l || this.m <= 0) {
            return;
        }
        int length = str != null ? str.length() : 0;
        String string = getResources().getString(C0838R.string.oui_form_counter, String.valueOf(length), String.valueOf(this.m));
        kotlin.s.c.l.e(string, "resources.getString(\n   ….toString()\n            )");
        SpannableString spannableString = new SpannableString(string);
        if (length > this.m) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), C0838R.color.oui_functional_red_7)), 0, String.valueOf(length).length(), 18);
        }
        this.U.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    public static final void m(OInputView oInputView) {
        Object systemService = oInputView.getContext().getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager)) {
            systemService = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(oInputView.K.getWindowToken(), 0);
        }
    }

    public static final void o(OInputView oInputView, boolean z) {
        if (oInputView.o && oInputView.n && oInputView.f7767c && oInputView.V != null) {
            Editable text = oInputView.K.getText();
            if (!(text == null || text.length() == 0)) {
                LabelUIState labelUIState = LabelUIState.REAL_LABEL_SHOW;
                TextView textView = oInputView.V;
                kotlin.s.c.l.c(textView);
                oInputView.K(labelUIState, textView, "playLabelAnim, hasFocus: " + z);
                return;
            }
            ValueAnimator valueAnimator = null;
            if (z) {
                ValueAnimator valueAnimator2 = oInputView.g0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = oInputView.g0;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator4 = oInputView.g0;
                if (valueAnimator4 != null) {
                    valueAnimator4.removeAllListeners();
                }
                ValueAnimator valueAnimator5 = oInputView.f0;
                if (valueAnimator5 != null && valueAnimator5.isRunning()) {
                    e.i.b.f.e.b.f("OInputView", "label show anim is running, do nothing");
                    return;
                }
                int color = ContextCompat.getColor(oInputView.getContext(), C0838R.color.oui_text_3);
                int color2 = ContextCompat.getColor(oInputView.getContext(), C0838R.color.oui_text_4);
                TextView textView2 = oInputView.V;
                if (textView2 != null) {
                    float z2 = oInputView.z();
                    float A = oInputView.A(textView2);
                    textView2.setPivotX(0.0f);
                    textView2.setPivotY(-z2);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    kotlin.s.c.l.e(ofFloat, "animator");
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(new DecelerateInterpolator());
                    ofFloat.addUpdateListener(new com.obric.oui.forms.f(oInputView, z2, color2, color, A, textView2));
                    ofFloat.addListener(new com.obric.oui.forms.g(oInputView, textView2));
                    valueAnimator = ofFloat;
                }
                oInputView.f0 = valueAnimator;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                e.i.b.f.e.b.a("OInputView", "start label show anim");
                return;
            }
            ValueAnimator valueAnimator6 = oInputView.f0;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
            }
            ValueAnimator valueAnimator7 = oInputView.f0;
            if (valueAnimator7 != null) {
                valueAnimator7.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator8 = oInputView.f0;
            if (valueAnimator8 != null) {
                valueAnimator8.removeAllListeners();
            }
            ValueAnimator valueAnimator9 = oInputView.g0;
            if (valueAnimator9 != null && valueAnimator9.isRunning()) {
                e.i.b.f.e.b.f("OInputView", "label hide anim is running, do nothing");
                return;
            }
            int color3 = ContextCompat.getColor(oInputView.getContext(), C0838R.color.oui_text_3);
            int color4 = ContextCompat.getColor(oInputView.getContext(), C0838R.color.oui_text_4);
            TextView textView3 = oInputView.V;
            if (textView3 != null) {
                float z3 = oInputView.z();
                float A2 = oInputView.A(textView3);
                textView3.setPivotX(0.0f);
                textView3.setPivotY(-z3);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                kotlin.s.c.l.e(ofFloat2, "animator");
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new DecelerateInterpolator());
                ofFloat2.addUpdateListener(new com.obric.oui.forms.d(oInputView, z3, color3, color4, A2, textView3));
                ofFloat2.addListener(new com.obric.oui.forms.e(oInputView, textView3));
                valueAnimator = ofFloat2;
            }
            oInputView.g0 = valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
            e.i.b.f.e.b.a("OInputView", "start label hide anim");
        }
    }

    public static final void p(OInputView oInputView) {
        Object systemService = oInputView.getContext().getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager)) {
            systemService = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(oInputView.K, 0);
        }
    }

    private final void x(String str) {
        TextView textView;
        if (this.o && (textView = this.V) != null) {
            if (!this.n) {
                this.K.setHint(this.u);
                K(LabelUIState.LABEL_NONE, textView, e.a.a.a.a.t("adjustInputViewAndLabel, ", str, ", no label"));
                return;
            }
            if (!this.f7767c) {
                this.K.setHint(this.u);
                K(LabelUIState.REAL_LABEL_SHOW, textView, e.a.a.a.a.t("adjustInputViewAndLabel, ", str, ", can not show label anim"));
                return;
            }
            this.K.setHint("");
            textView.setText(this.q);
            Editable text = this.K.getText();
            if (!(text == null || text.length() == 0)) {
                K(LabelUIState.REAL_LABEL_SHOW, textView, e.a.a.a.a.t("adjustInputViewAndLabel, ", str, ", can show label anim, vInput.text not empty"));
            } else if (this.K.hasFocus()) {
                K(LabelUIState.REAL_LABEL_SHOW, textView, e.a.a.a.a.t("adjustInputViewAndLabel, ", str, ", can show label anim, vInput.text empty, focused"));
            } else {
                K(LabelUIState.FAKE_LABEL_SHOW, textView, e.a.a.a.a.t("adjustInputViewAndLabel, ", str, ", can show label anim, vInput.text empty, not focused"));
            }
        }
    }

    private final float z() {
        float applyDimension;
        if (this.D.getHeight() <= 0 || getHeight() <= 0) {
            StringBuilder M = e.a.a.a.a.M("getFakeInputOffsetY, use default offset, vTitleContainer.height: ");
            M.append(this.D.getHeight());
            M.append(", height: ");
            M.append(getHeight());
            e.i.b.f.e.b.f("OInputView", M.toString());
            Resources system = Resources.getSystem();
            kotlin.s.c.l.e(system, "Resources.getSystem()");
            applyDimension = TypedValue.applyDimension(1, -11.0f, system.getDisplayMetrics());
        } else {
            applyDimension = ((this.D.getHeight() / 2.0f) + this.D.getY()) - (getHeight() / 2.0f);
        }
        e.i.b.f.e.b.a("OInputView", "getFakeInputOffsetY, offsetY: " + applyDimension);
        return applyDimension;
    }

    public final String B() {
        Editable text = this.K.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final OEditText C() {
        return this.K;
    }

    public final void E(boolean z) {
        com.obric.oui.common.util.b.i(this.T, z);
    }

    public final void F(boolean z) {
        com.obric.oui.common.util.b.i(this.S, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && this.i) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f7771g = x;
                this.f7771g = y;
            } else if (action == 1) {
                requestDisallowInterceptTouchEvent(false);
            } else if (action == 2) {
                if ((x > this.h && this.K.canScrollHorizontally(-1)) || ((x < this.h && this.K.canScrollHorizontally(1)) || ((y < this.f7771g && this.K.canScrollVertically(1)) || (y > this.f7771g && this.K.canScrollVertically(-1))))) {
                    requestDisallowInterceptTouchEvent(true);
                }
                this.h = x;
                this.f7771g = y;
            } else if (action == 3) {
                requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.K.getOnFocusChangeListener();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setActionView(l<? super FrameLayout, o> lVar) {
        kotlin.s.c.l.f(lVar, "creator");
        this.M.removeAllViews();
        lVar.invoke(this.M);
        FrameLayout frameLayout = this.M;
        com.obric.oui.common.util.b.i(frameLayout, frameLayout.getChildCount() > 0);
    }

    public final void setAlwaysHideEye(boolean z) {
        this.e0 = z;
        if (z) {
            com.obric.oui.common.util.b.i(this.Q, false);
        }
    }

    public final void setAutoHideSoftInputWhenLoseFocus(boolean z) {
        this.c0 = z;
    }

    public final void setBgResId(int i) {
        this.d0 = i;
        G(true);
    }

    public final void setComboInputEnabled(boolean z) {
        this.a = z;
        this.K.setFocusable(z);
        this.K.setFocusableInTouchMode(z);
        View.OnClickListener onClickListener = this.b0;
        if (onClickListener != null) {
            this.K.setOnClickListener(onClickListener);
        }
    }

    public final void setCommitCompletionListener(OEditText.a aVar) {
        kotlin.s.c.l.f(aVar, "commitCompletionListener");
        this.K.setCommitCompletionListener(aVar);
    }

    public final void setCommonTip(String str) {
        this.y = str;
        this.T.setText(str);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.s = z;
        super.setEnabled(z);
        Iterator<View> it2 = ViewGroupKt.getChildren(this).iterator();
        while (it2.hasNext()) {
            it2.next().setEnabled(z);
        }
        this.K.setEnabled(z);
        H(this.K.hasFocus());
        G(false);
    }

    public final void setErrorState(boolean z) {
        this.r = z;
        H(this.K.hasFocus());
        G(false);
    }

    public final void setErrorTip(String str) {
        this.x = str;
        this.S.setText(str);
    }

    public final void setHint(String str) {
        this.u = str;
        this.K.setHint(str);
        x("setHint");
    }

    public final void setInputHeight(int i) {
        this.t = Integer.valueOf(i);
        OEditText oEditText = this.K;
        ViewGroup.LayoutParams layoutParams = oEditText.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i;
        oEditText.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if ((r3.P.getVisibility() == 0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if ((r3.P.getVisibility() == 0) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setInputMode(int r4) {
        /*
            r3 = this;
            r3.b = r4
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L45
            if (r4 == r1) goto La
            goto L81
        La:
            r3.setSingleLine(r1)
            android.view.View r4 = r3.P
            com.obric.oui.common.util.b.i(r4, r1)
            android.view.View r4 = r3.N
            android.view.View r2 = r3.O
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L1e
            r2 = r1
            goto L1f
        L1e:
            r2 = r0
        L1f:
            if (r2 != 0) goto L3b
            android.widget.ImageView r2 = r3.Q
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L2b
            r2 = r1
            goto L2c
        L2b:
            r2 = r0
        L2c:
            if (r2 != 0) goto L3b
            android.view.View r2 = r3.P
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L38
            r2 = r1
            goto L39
        L38:
            r2 = r0
        L39:
            if (r2 == 0) goto L3c
        L3b:
            r0 = r1
        L3c:
            com.obric.oui.common.util.b.i(r4, r0)
            boolean r4 = r3.a
            r3.setComboInputEnabled(r4)
            goto L81
        L45:
            android.view.View r4 = r3.P
            com.obric.oui.common.util.b.i(r4, r0)
            android.view.View r4 = r3.N
            android.view.View r2 = r3.O
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L56
            r2 = r1
            goto L57
        L56:
            r2 = r0
        L57:
            if (r2 != 0) goto L73
            android.widget.ImageView r2 = r3.Q
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L63
            r2 = r1
            goto L64
        L63:
            r2 = r0
        L64:
            if (r2 != 0) goto L73
            android.view.View r2 = r3.P
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L70
            r2 = r1
            goto L71
        L70:
            r2 = r0
        L71:
            if (r2 == 0) goto L74
        L73:
            r0 = r1
        L74:
            com.obric.oui.common.util.b.i(r4, r0)
            com.obric.oui.forms.OEditText r4 = r3.K
            r4.setFocusable(r1)
            com.obric.oui.forms.OEditText r4 = r3.K
            r4.setFocusableInTouchMode(r1)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.forms.OInputView.setInputMode(int):void");
    }

    public final void setInputType(int i) {
        if ((i & 1) == 0 && (i & 2) == 0 && (i & 3) == 0 && (i & 4) == 0) {
            i |= 1;
        }
        this.v = i;
        if (i == this.K.getInputType()) {
            return;
        }
        this.K.setInputType(this.v);
        J();
    }

    public final void setIsInScrollableView(boolean z) {
        this.i = z;
    }

    public final void setKeyListener(KeyListener keyListener) {
        this.K.setKeyListener(keyListener);
    }

    public final void setLabel(String str) {
        this.q = str;
        this.E.setText(str);
    }

    public final void setLeftView(l<? super FrameLayout, o> lVar) {
        kotlin.s.c.l.f(lVar, "creator");
        this.L.removeAllViews();
        lVar.invoke(this.L);
        FrameLayout frameLayout = this.L;
        com.obric.oui.common.util.b.i(frameLayout, frameLayout.getChildCount() > 0);
    }

    public final void setLimitCount(int i) {
        this.m = i;
        Editable text = this.K.getText();
        L(text != null ? text.toString() : null);
    }

    public final void setMaxLines(int i) {
        if (i < 1) {
            i = Integer.MAX_VALUE;
        }
        this.f7768d = i;
        this.K.setMaxLines(this.f7767c ? 1 : i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (this.b == 1 && !this.a) {
            this.P.setOnClickListener(onClickListener);
            this.K.setOnClickListener(onClickListener);
        }
        super.setOnClickListener(onClickListener);
    }

    public final void setOnComboArrowClickListener(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2;
        this.b0 = onClickListener;
        this.P.setOnClickListener(onClickListener);
        if (this.a || (onClickListener2 = this.b0) == null) {
            return;
        }
        this.K.setOnClickListener(onClickListener2);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K.setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void setOnTextClearedListener(f fVar) {
        kotlin.s.c.l.f(fVar, "listener");
        this.W = fVar;
    }

    public final void setOnTextExceedLengthListener(g gVar) {
        this.a0 = gVar;
    }

    public final void setRadius(int i) {
        if (i == this.B) {
            return;
        }
        this.B = i;
        this.C.setRadius(i);
    }

    public final void setShowLabel(boolean z) {
        this.n = z;
        com.obric.oui.common.util.b.i(this.D, z);
        OEditText oEditText = this.K;
        ViewGroup.LayoutParams layoutParams = oEditText.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, this.n ? 16 : 12);
        layoutParams2.goneLeftMargin = e0;
        layoutParams2.goneStartMargin = e0;
        oEditText.setLayoutParams(layoutParams2);
        x("setShowLabel");
    }

    public final void setShowLabelAnim(boolean z) {
        this.o = z;
        x("setShowLabelAnim");
    }

    public final void setShowLabelIcon(boolean z) {
        this.p = z;
        com.obric.oui.common.util.b.i(this.f7766J, z);
    }

    public final void setShowLimitIndicator(boolean z) {
        this.l = z;
        Editable text = this.K.getText();
        L(text != null ? text.toString() : null);
    }

    public final void setSingleLine(boolean z) {
        this.f7767c = z;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0838R.dimen.o_input_view_space_top_bottom);
        if (z) {
            com.obric.oui.common.util.b.i(this.R, false);
            this.K.setMaxLines(1);
            this.K.setSingleLine(true);
            OEditText oEditText = this.K;
            ViewGroup.LayoutParams layoutParams = oEditText.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? layoutParams4 : null);
            layoutParams2.setMargins(i, 0, marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0, dimensionPixelSize);
            layoutParams2.goneTopMargin = dimensionPixelSize;
            int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, this.n ? 16 : 12);
            layoutParams2.goneLeftMargin = e0;
            layoutParams2.goneStartMargin = e0;
            oEditText.setLayoutParams(layoutParams2);
            View view = this.N;
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.topToTop = 0;
            layoutParams6.bottomToBottom = 0;
            view.setLayoutParams(layoutParams6);
            FrameLayout frameLayout = this.M;
            ViewGroup.LayoutParams layoutParams7 = frameLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            layoutParams8.topToTop = 0;
            layoutParams8.bottomToBottom = 0;
            frameLayout.setLayoutParams(layoutParams8);
            FrameLayout frameLayout2 = this.L;
            ViewGroup.LayoutParams layoutParams9 = frameLayout2.getLayoutParams();
            Objects.requireNonNull(layoutParams9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
            float f2 = 4;
            int e02 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
            int e03 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
            Resources system = Resources.getSystem();
            kotlin.s.c.l.e(system, "Resources.getSystem()");
            layoutParams10.setMargins(e02, e03, 0, kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
            layoutParams10.topToTop = 0;
            layoutParams10.bottomToBottom = 0;
            frameLayout2.setLayoutParams(layoutParams10);
        } else {
            com.obric.oui.common.util.b.i(this.R, this.k);
            this.K.setMaxLines(this.f7768d);
            this.K.setSingleLine(false);
            this.K.setPadding(getPaddingLeft(), e.a.a.a.a.e0("Resources.getSystem()", 1, 2), getPaddingRight(), getPaddingBottom());
            this.K.setGravity(48);
            OEditText oEditText2 = this.K;
            ViewGroup.LayoutParams layoutParams11 = oEditText2.getLayoutParams();
            Objects.requireNonNull(layoutParams11, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
            ViewGroup.LayoutParams layoutParams13 = getLayoutParams();
            if (!(layoutParams13 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams13 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams13;
            int i2 = marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams14 = getLayoutParams();
            if (!(layoutParams14 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams14 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams14;
            int i3 = marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0;
            float f3 = 8;
            Resources system2 = Resources.getSystem();
            kotlin.s.c.l.e(system2, "Resources.getSystem()");
            layoutParams12.setMargins(i2, 0, i3, kotlin.t.a.a(TypedValue.applyDimension(1, f3, system2.getDisplayMetrics())));
            Resources system3 = Resources.getSystem();
            kotlin.s.c.l.e(system3, "Resources.getSystem()");
            layoutParams12.goneTopMargin = kotlin.t.a.a(TypedValue.applyDimension(1, f3, system3.getDisplayMetrics()));
            int e04 = e.a.a.a.a.e0("Resources.getSystem()", 1, this.n ? 16 : 12);
            layoutParams12.goneLeftMargin = e04;
            layoutParams12.goneStartMargin = e04;
            oEditText2.setLayoutParams(layoutParams12);
            View view2 = this.N;
            ViewGroup.LayoutParams layoutParams15 = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams15, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams15;
            layoutParams16.topToTop = 0;
            ViewGroup.LayoutParams layoutParams17 = getLayoutParams();
            if (!(layoutParams17 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams17 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams17;
            int i4 = marginLayoutParams5 != null ? marginLayoutParams5.leftMargin : 0;
            float f4 = 4;
            int e05 = e.a.a.a.a.e0("Resources.getSystem()", 1, f4);
            ViewGroup.LayoutParams layoutParams18 = getLayoutParams();
            if (!(layoutParams18 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams18 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams18;
            int i5 = marginLayoutParams6 != null ? marginLayoutParams6.rightMargin : 0;
            ViewGroup.LayoutParams layoutParams19 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) (layoutParams19 instanceof ViewGroup.MarginLayoutParams ? layoutParams19 : null);
            layoutParams16.setMargins(i4, e05, i5, marginLayoutParams7 != null ? marginLayoutParams7.bottomMargin : 0);
            layoutParams16.bottomToBottom = -1;
            view2.setLayoutParams(layoutParams16);
            FrameLayout frameLayout3 = this.M;
            ViewGroup.LayoutParams layoutParams20 = frameLayout3.getLayoutParams();
            Objects.requireNonNull(layoutParams20, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams21 = (ConstraintLayout.LayoutParams) layoutParams20;
            layoutParams21.topToTop = 0;
            layoutParams21.bottomToBottom = 0;
            frameLayout3.setLayoutParams(layoutParams21);
            FrameLayout frameLayout4 = this.L;
            ViewGroup.LayoutParams layoutParams22 = frameLayout4.getLayoutParams();
            Objects.requireNonNull(layoutParams22, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams23 = (ConstraintLayout.LayoutParams) layoutParams22;
            int e06 = e.a.a.a.a.e0("Resources.getSystem()", 1, f4);
            Resources system4 = Resources.getSystem();
            kotlin.s.c.l.e(system4, "Resources.getSystem()");
            layoutParams23.setMargins(e06, kotlin.t.a.a(TypedValue.applyDimension(1, f4, system4.getDisplayMetrics())), 0, 0);
            layoutParams23.topToTop = 0;
            layoutParams23.bottomToBottom = -1;
            frameLayout4.setLayoutParams(layoutParams23);
        }
        x("setSingleLine");
    }

    public final void setText(String str) {
        this.K.setText(str);
        x("setText");
    }

    public final void w(TextWatcher textWatcher) {
        this.K.addTextChangedListener(textWatcher);
    }

    public final boolean y() {
        return this.c0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        this.a = true;
        this.f7767c = true;
        this.f7768d = Integer.MAX_VALUE;
        this.f7770f = 16;
        this.j = true;
        this.k = true;
        this.m = -1;
        this.n = true;
        this.p = true;
        this.s = true;
        this.B = e.a.a.a.a.e0("Resources.getSystem()", 1, 10);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.i.a.b.b.u, i, 0);
        this.i = obtainStyledAttributes.getBoolean(14, false);
        this.j = obtainStyledAttributes.getBoolean(8, true);
        this.k = obtainStyledAttributes.getBoolean(24, true);
        this.n = obtainStyledAttributes.getBoolean(20, true);
        this.o = obtainStyledAttributes.getBoolean(21, false);
        this.p = obtainStyledAttributes.getBoolean(22, true);
        this.q = obtainStyledAttributes.getString(15);
        this.x = obtainStyledAttributes.getString(11);
        this.y = obtainStyledAttributes.getString(10);
        this.z = obtainStyledAttributes.getBoolean(19, false);
        this.B = obtainStyledAttributes.getDimensionPixelSize(12, this.B);
        this.a = obtainStyledAttributes.getBoolean(9, true);
        this.b = obtainStyledAttributes.getInt(16, 0);
        this.f7767c = obtainStyledAttributes.getBoolean(17, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        if (dimensionPixelSize > 0) {
            this.t = Integer.valueOf(dimensionPixelSize);
        }
        this.m = obtainStyledAttributes.getInt(18, -1);
        this.l = obtainStyledAttributes.getBoolean(23, false);
        this.A = obtainStyledAttributes.getText(6);
        this.u = obtainStyledAttributes.getString(4);
        this.v = obtainStyledAttributes.getInt(7, 0);
        this.w = obtainStyledAttributes.getString(3);
        this.s = obtainStyledAttributes.getBoolean(0, true);
        this.f7768d = obtainStyledAttributes.getInt(5, Integer.MAX_VALUE);
        this.f7769e = obtainStyledAttributes.getInt(2, 0);
        this.f7770f = obtainStyledAttributes.getInt(1, 16);
        obtainStyledAttributes.recycle();
        int i2 = this.f7769e;
        if (i2 == 0) {
            LayoutInflater.from(context).inflate(C0838R.layout.o_input_view_layout_vertical, this);
        } else if (i2 == 1) {
            LayoutInflater.from(context).inflate(C0838R.layout.o_input_view_layout_horizontal, this);
        }
        View findViewById = findViewById(C0838R.id.o_input_border_container);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.o_input_border_container)");
        OUIConstraintLayout oUIConstraintLayout = (OUIConstraintLayout) findViewById;
        this.C = oUIConstraintLayout;
        oUIConstraintLayout.setRadius(this.B);
        View findViewById2 = findViewById(C0838R.id.o_input_title_container);
        kotlin.s.c.l.e(findViewById2, "findViewById(R.id.o_input_title_container)");
        this.D = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(C0838R.id.o_input_title);
        kotlin.s.c.l.e(findViewById3, "findViewById(R.id.o_input_title)");
        this.E = (OTextView) findViewById3;
        View findViewById4 = findViewById(C0838R.id.o_input_title_icon);
        kotlin.s.c.l.e(findViewById4, "findViewById(R.id.o_input_title_icon)");
        this.f7766J = (ImageView) findViewById4;
        View findViewById5 = findViewById(C0838R.id.o_input);
        kotlin.s.c.l.e(findViewById5, "findViewById(R.id.o_input)");
        OEditText oEditText = (OEditText) findViewById5;
        this.K = oEditText;
        oEditText.setVerticalScrollBarEnabled(false);
        View findViewById6 = findViewById(C0838R.id.o_input_left_view_container);
        kotlin.s.c.l.e(findViewById6, "findViewById(R.id.o_input_left_view_container)");
        this.L = (FrameLayout) findViewById6;
        View findViewById7 = findViewById(C0838R.id.o_input_custom_action_container);
        kotlin.s.c.l.e(findViewById7, "findViewById(R.id.o_input_custom_action_container)");
        this.M = (FrameLayout) findViewById7;
        View findViewById8 = findViewById(C0838R.id.o_input_action_container);
        kotlin.s.c.l.e(findViewById8, "findViewById(R.id.o_input_action_container)");
        this.N = findViewById8;
        View findViewById9 = findViewById(C0838R.id.o_input_clear);
        kotlin.s.c.l.e(findViewById9, "findViewById(R.id.o_input_clear)");
        this.O = findViewById9;
        View findViewById10 = findViewById(C0838R.id.o_input_combo_arrow);
        kotlin.s.c.l.e(findViewById10, "findViewById(R.id.o_input_combo_arrow)");
        this.P = findViewById10;
        View findViewById11 = findViewById(C0838R.id.o_input_eyes_slash);
        kotlin.s.c.l.e(findViewById11, "findViewById(R.id.o_input_eyes_slash)");
        ImageView imageView = (ImageView) findViewById11;
        this.Q = imageView;
        View findViewById12 = findViewById(C0838R.id.o_input_resizer);
        kotlin.s.c.l.e(findViewById12, "findViewById(R.id.o_input_resizer)");
        this.R = findViewById12;
        View findViewById13 = findViewById(C0838R.id.o_input_error_tip);
        kotlin.s.c.l.e(findViewById13, "findViewById(R.id.o_input_error_tip)");
        OTextView oTextView = (OTextView) findViewById13;
        this.S = oTextView;
        View findViewById14 = findViewById(C0838R.id.o_input_common_tip);
        kotlin.s.c.l.e(findViewById14, "findViewById(R.id.o_input_common_tip)");
        OTextView oTextView2 = (OTextView) findViewById14;
        this.T = oTextView2;
        View findViewById15 = findViewById(C0838R.id.o_input_limit_indicator);
        kotlin.s.c.l.e(findViewById15, "findViewById(R.id.o_input_limit_indicator)");
        this.U = (OTextView) findViewById15;
        this.V = (TextView) findViewById(C0838R.id.o_input_view_fake_label);
        setFocusableInTouchMode(true);
        setFocusable(true);
        setDescendantFocusability(262144);
        CharSequence charSequence = this.A;
        if (charSequence != null) {
            oEditText.setKeyListener(DigitsKeyListener.getInstance(String.valueOf(charSequence)));
            int i3 = this.v;
            this.v = i3 == 0 ? 1 : i3;
        }
        oEditText.setGravity(this.f7770f);
        Integer num = this.t;
        if (num != null) {
            setInputHeight(num.intValue());
        }
        oEditText.b(new b());
        oEditText.c(new c());
        oEditText.d(new d());
        oEditText.a(new e());
        findViewById9.setOnClickListener(new a(0, this));
        setCommonTip(this.y);
        com.obric.oui.common.util.b.i(oTextView2, this.z);
        setErrorTip(this.x);
        com.obric.oui.common.util.b.i(oTextView, false);
        setComboInputEnabled(this.a);
        setLabel(this.q);
        setShowLabel(this.n);
        setShowLabelIcon(this.p);
        setLimitCount(this.m);
        setShowLimitIndicator(this.l);
        setSingleLine(this.f7767c);
        setMaxLines(this.f7768d);
        setHint(this.u);
        setText(this.w);
        setInputMode(this.b);
        setEnabled(this.s);
        I();
        H(oEditText.hasFocus());
        int i4 = this.v;
        if (i4 != 0) {
            setInputType(i4);
        }
        J();
        imageView.setOnClickListener(new a(1, this));
        oUIConstraintLayout.setOnClickListener(new a(2, this));
        x("init");
    }
}
