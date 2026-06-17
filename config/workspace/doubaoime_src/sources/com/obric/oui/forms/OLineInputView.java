package com.obric.oui.forms;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.divider.ODivider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OLineInputView extends AbsOForm {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;

    /* renamed from: J, reason: collision with root package name */
    private boolean f7772J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private final int O;
    private String P;
    private String Q;
    private int R;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f7773e;

    /* renamed from: f, reason: collision with root package name */
    private final OFormEditText f7774f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f7775g;
    private final TextView h;
    private final TextView i;
    private final ImageView j;
    private final LinearLayout k;
    private final ImageView l;
    private final ODivider m;
    private final RelativeLayout n;
    private final RelativeLayout o;
    private final ImageView p;
    private final TextView q;
    private final ViewGroup r;
    private final ViewGroup s;
    private final ViewGroup t;
    private ConstraintLayout u;
    private String v;
    private b w;
    private TextWatcher x;
    private boolean y;
    private int z;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnFocusChangeListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            int i = this.a;
            if (i == 0) {
                if (z) {
                    OLineInputView.l((OLineInputView) this.b);
                    return;
                } else {
                    OLineInputView.j((OLineInputView) this.b);
                    return;
                }
            }
            if (i != 1) {
                throw null;
            }
            if (!z) {
                if (((OLineInputView) this.b).w.i() || TextUtils.isEmpty(((OLineInputView) this.b).p())) {
                    ((OLineInputView) this.b).r();
                }
                OLineInputView.j((OLineInputView) this.b);
                return;
            }
            if (((OLineInputView) this.b).w.g() && TextUtils.isEmpty(((OLineInputView) this.b).p())) {
                ((OLineInputView) this.b).r();
            } else {
                ((OLineInputView) this.b).w();
            }
            OLineInputView.l((OLineInputView) this.b);
        }
    }

    public static final class b {
        private String a;
        private boolean b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7776c;

        /* renamed from: d, reason: collision with root package name */
        private String f7777d;

        /* renamed from: e, reason: collision with root package name */
        private View f7778e;

        /* renamed from: f, reason: collision with root package name */
        private View f7779f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f7780g;
        private boolean h;
        private String i;
        private TextWatcher j;
        private View.OnFocusChangeListener k;
        private boolean l;
        private Drawable m;
        private View.OnClickListener n;
        private View.OnClickListener o;
        private String p;
        private Integer q;
        private Integer r;
        private Drawable s;
        private boolean t;
        private boolean u;
        private boolean v;
        private int w;
        private boolean x;
        private d y;
        private c z;

        public static final class a {
            private String a;
            private String b;

            /* renamed from: c, reason: collision with root package name */
            private Drawable f7781c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f7782d;

            /* renamed from: e, reason: collision with root package name */
            private Integer f7783e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f7784f;

            /* renamed from: g, reason: collision with root package name */
            private String f7785g;
            private View h;
            private View i;
            private boolean j;
            private String k;
            private Integer l;
            private boolean m;
            private View.OnClickListener n;
            private Drawable o;
            private View.OnClickListener p;
            private TextWatcher q;
            private View.OnFocusChangeListener r;
            private Integer s;
            private boolean t;
            private boolean u;
            private boolean v;
            private int w;
            private boolean x;
            private d y;
            private c z;

            public a() {
                this(null, null, null, false, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, false, false, false, 0, false, null, null, 67108863);
            }

            public a(String str, String str2, Drawable drawable, boolean z, Integer num, boolean z2, String str3, View view, View view2, boolean z3, String str4, Integer num2, boolean z4, View.OnClickListener onClickListener, Drawable drawable2, View.OnClickListener onClickListener2, TextWatcher textWatcher, View.OnFocusChangeListener onFocusChangeListener, Integer num3, boolean z5, boolean z6, boolean z7, int i, boolean z8, d dVar, c cVar, int i2) {
                String str5 = (i2 & 1) != 0 ? "标题" : null;
                int i3 = i2 & 2;
                int i4 = i2 & 4;
                boolean z9 = (i2 & 8) != 0 ? false : z;
                int i5 = i2 & 16;
                boolean z10 = (i2 & 32) != 0 ? false : z2;
                int i6 = i2 & 64;
                int i7 = i2 & 128;
                int i8 = i2 & 256;
                boolean z11 = (i2 & 512) != 0 ? true : z3;
                int i9 = i2 & 1024;
                int i10 = i2 & 2048;
                boolean z12 = (i2 & 4096) != 0 ? false : z4;
                int i11 = i2 & 8192;
                int i12 = i2 & 16384;
                int i13 = 32768 & i2;
                int i14 = 65536 & i2;
                int i15 = 131072 & i2;
                int i16 = 262144 & i2;
                boolean z13 = (524288 & i2) != 0 ? false : z5;
                boolean z14 = (1048576 & i2) != 0 ? false : z6;
                boolean z15 = (2097152 & i2) == 0 ? z7 : false;
                int i17 = (4194304 & i2) != 0 ? 2 : i;
                boolean z16 = (8388608 & i2) == 0 ? z8 : true;
                int i18 = 16777216 & i2;
                int i19 = i2 & 33554432;
                l.f(str5, "title");
                this.a = str5;
                this.b = null;
                this.f7781c = null;
                this.f7782d = z9;
                this.f7783e = null;
                this.f7784f = z10;
                this.f7785g = null;
                this.h = null;
                this.i = null;
                this.j = z11;
                this.k = null;
                this.l = null;
                this.m = z12;
                this.n = null;
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.s = null;
                this.t = z13;
                this.u = z14;
                this.v = z15;
                this.w = i17;
                this.x = z16;
                this.y = null;
                this.z = null;
            }

            public final b a() {
                String str = this.a;
                String str2 = this.b;
                Drawable drawable = this.f7781c;
                boolean z = this.f7782d;
                boolean z2 = this.f7784f;
                String str3 = this.f7785g;
                Integer num = this.f7783e;
                boolean z3 = this.j;
                String str4 = this.k;
                TextWatcher textWatcher = this.q;
                View view = this.h;
                View view2 = this.i;
                boolean z4 = this.m;
                View.OnClickListener onClickListener = this.n;
                return new b(str, z, z2, str3, view, view2, num, z3, str4, textWatcher, this.r, z4, this.o, onClickListener, this.p, str2, this.l, this.s, drawable, this.t, this.u, this.v, this.w, this.x, this.y, this.z, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return l.a(this.a, aVar.a) && l.a(this.b, aVar.b) && l.a(this.f7781c, aVar.f7781c) && this.f7782d == aVar.f7782d && l.a(this.f7783e, aVar.f7783e) && this.f7784f == aVar.f7784f && l.a(this.f7785g, aVar.f7785g) && l.a(this.h, aVar.h) && l.a(this.i, aVar.i) && this.j == aVar.j && l.a(this.k, aVar.k) && l.a(this.l, aVar.l) && this.m == aVar.m && l.a(this.n, aVar.n) && l.a(this.o, aVar.o) && l.a(this.p, aVar.p) && l.a(this.q, aVar.q) && l.a(this.r, aVar.r) && l.a(this.s, aVar.s) && this.t == aVar.t && this.u == aVar.u && this.v == aVar.v && this.w == aVar.w && this.x == aVar.x && l.a(this.y, aVar.y) && l.a(this.z, aVar.z);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                String str = this.a;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                Drawable drawable = this.f7781c;
                int hashCode3 = (hashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31;
                boolean z = this.f7782d;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                int i2 = (hashCode3 + i) * 31;
                Integer num = this.f7783e;
                int hashCode4 = (i2 + (num != null ? num.hashCode() : 0)) * 31;
                boolean z2 = this.f7784f;
                int i3 = z2;
                if (z2 != 0) {
                    i3 = 1;
                }
                int i4 = (hashCode4 + i3) * 31;
                String str3 = this.f7785g;
                int hashCode5 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 31;
                View view = this.h;
                int hashCode6 = (hashCode5 + (view != null ? view.hashCode() : 0)) * 31;
                View view2 = this.i;
                int hashCode7 = (hashCode6 + (view2 != null ? view2.hashCode() : 0)) * 31;
                boolean z3 = this.j;
                int i5 = z3;
                if (z3 != 0) {
                    i5 = 1;
                }
                int i6 = (hashCode7 + i5) * 31;
                String str4 = this.k;
                int hashCode8 = (i6 + (str4 != null ? str4.hashCode() : 0)) * 31;
                Integer num2 = this.l;
                int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
                boolean z4 = this.m;
                int i7 = z4;
                if (z4 != 0) {
                    i7 = 1;
                }
                int i8 = (hashCode9 + i7) * 31;
                View.OnClickListener onClickListener = this.n;
                int hashCode10 = (i8 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
                Drawable drawable2 = this.o;
                int hashCode11 = (hashCode10 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
                View.OnClickListener onClickListener2 = this.p;
                int hashCode12 = (hashCode11 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
                TextWatcher textWatcher = this.q;
                int hashCode13 = (hashCode12 + (textWatcher != null ? textWatcher.hashCode() : 0)) * 31;
                View.OnFocusChangeListener onFocusChangeListener = this.r;
                int hashCode14 = (hashCode13 + (onFocusChangeListener != null ? onFocusChangeListener.hashCode() : 0)) * 31;
                Integer num3 = this.s;
                int hashCode15 = (hashCode14 + (num3 != null ? num3.hashCode() : 0)) * 31;
                boolean z5 = this.t;
                int i9 = z5;
                if (z5 != 0) {
                    i9 = 1;
                }
                int i10 = (hashCode15 + i9) * 31;
                boolean z6 = this.u;
                int i11 = z6;
                if (z6 != 0) {
                    i11 = 1;
                }
                int i12 = (i10 + i11) * 31;
                boolean z7 = this.v;
                int i13 = z7;
                if (z7 != 0) {
                    i13 = 1;
                }
                int I = e.a.a.a.a.I(this.w, (i12 + i13) * 31, 31);
                boolean z8 = this.x;
                int i14 = (I + (z8 ? 1 : z8 ? 1 : 0)) * 31;
                d dVar = this.y;
                int hashCode16 = (i14 + (dVar != null ? dVar.hashCode() : 0)) * 31;
                c cVar = this.z;
                return hashCode16 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                StringBuilder M = e.a.a.a.a.M("Builder(title=");
                M.append(this.a);
                M.append(", inputTips=");
                M.append(this.b);
                M.append(", titleIcon=");
                M.append(this.f7781c);
                M.append(", showCounter=");
                M.append(this.f7782d);
                M.append(", lengthLimit=");
                M.append(this.f7783e);
                M.append(", showClear=");
                M.append(this.f7784f);
                M.append(", hintText=");
                M.append(this.f7785g);
                M.append(", prefixView=");
                M.append(this.h);
                M.append(", suffixView=");
                M.append(this.i);
                M.append(", showDivider=");
                M.append(this.j);
                M.append(", actionText=");
                M.append(this.k);
                M.append(", actionTextColor=");
                M.append(this.l);
                M.append(", actionTextClickable=");
                M.append(this.m);
                M.append(", actionTextListener=");
                M.append(this.n);
                M.append(", actionImageDrawable=");
                M.append(this.o);
                M.append(", actionImageDrawableListener=");
                M.append(this.p);
                M.append(", textWatcher=");
                M.append(this.q);
                M.append(", editTextOnFocusChangeListener=");
                M.append(this.r);
                M.append(", inputBoxHeight=");
                M.append(this.s);
                M.append(", isInSearchBar=");
                M.append(this.t);
                M.append(", autoHideClearWhenTextEmpty=");
                M.append(this.u);
                M.append(", multiLine=");
                M.append(this.v);
                M.append(", mode=");
                M.append(this.w);
                M.append(", hideClearWhenNoFocus=");
                M.append(this.x);
                M.append(", textExceedLengthListener=");
                M.append(this.y);
                M.append(", textClearedListener=");
                M.append(this.z);
                M.append(")");
                return M.toString();
            }
        }

        public b(String str, boolean z, boolean z2, String str2, View view, View view2, Integer num, boolean z3, String str3, TextWatcher textWatcher, View.OnFocusChangeListener onFocusChangeListener, boolean z4, Drawable drawable, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str4, Integer num2, Integer num3, Drawable drawable2, boolean z5, boolean z6, boolean z7, int i, boolean z8, d dVar, c cVar, kotlin.s.c.g gVar) {
            this.a = str;
            this.b = z;
            this.f7776c = z2;
            this.f7777d = str2;
            this.f7778e = view;
            this.f7779f = view2;
            this.f7780g = num;
            this.h = z3;
            this.i = str3;
            this.j = textWatcher;
            this.k = onFocusChangeListener;
            this.l = z4;
            this.m = drawable;
            this.n = onClickListener;
            this.o = onClickListener2;
            this.p = str4;
            this.q = num2;
            this.r = num3;
            this.s = drawable2;
            this.t = z5;
            this.u = z6;
            this.v = z7;
            this.w = i;
            this.x = z8;
            this.y = dVar;
            this.z = cVar;
        }

        public final void A(boolean z) {
            this.u = z;
        }

        public final void B(String str) {
            this.f7777d = str;
        }

        public final void C(Integer num) {
            this.r = num;
        }

        public final void D(String str) {
            this.p = str;
        }

        public final void E(Integer num) {
            this.f7780g = num;
        }

        public final void F(boolean z) {
            this.v = z;
        }

        public final void G(boolean z) {
            this.f7776c = z;
        }

        public final void H(boolean z) {
            this.b = z;
        }

        public final void I(boolean z) {
            this.h = z;
        }

        public final void J(c cVar) {
            this.z = cVar;
        }

        public final void K(d dVar) {
            this.y = dVar;
        }

        public final void L(TextWatcher textWatcher) {
            this.j = textWatcher;
        }

        public final void M(String str) {
            l.f(str, "<set-?>");
            this.a = str;
        }

        public final Drawable a() {
            return this.m;
        }

        public final View.OnClickListener b() {
            return this.o;
        }

        public final String c() {
            return this.i;
        }

        public final boolean d() {
            return this.l;
        }

        public final Integer e() {
            return this.q;
        }

        public final View.OnClickListener f() {
            return this.n;
        }

        public final boolean g() {
            return this.u;
        }

        public final View.OnFocusChangeListener h() {
            return this.k;
        }

        public final boolean i() {
            return this.x;
        }

        public final String j() {
            return this.f7777d;
        }

        public final Integer k() {
            return this.r;
        }

        public final String l() {
            return this.p;
        }

        public final Drawable m() {
            return this.s;
        }

        public final Integer n() {
            return this.f7780g;
        }

        public final int o() {
            return this.w;
        }

        public final boolean p() {
            return this.v;
        }

        public final View q() {
            return this.f7778e;
        }

        public final boolean r() {
            return this.f7776c;
        }

        public final boolean s() {
            return this.b;
        }

        public final boolean t() {
            return this.h;
        }

        public final View u() {
            return this.f7779f;
        }

        public final c v() {
            return this.z;
        }

        public final d w() {
            return this.y;
        }

        public final TextWatcher x() {
            return this.j;
        }

        public final String y() {
            return this.a;
        }

        public final boolean z() {
            return this.t;
        }
    }

    public interface c {
        void a();

        void b();
    }

    public interface d {
        void a(String str);
    }

    public static final class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            d w;
            if (OLineInputView.this.w.n() != null) {
                int length = editable != null ? editable.length() : 0;
                Integer n = OLineInputView.this.w.n();
                if (length <= (n != null ? n.intValue() : 0) || (w = OLineInputView.this.w.w()) == null) {
                    return;
                }
                w.a(String.valueOf(editable));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String valueOf;
            if (OLineInputView.this.w.n() != null) {
                Resources resources = OLineInputView.this.getResources();
                Object[] objArr = new Object[2];
                objArr[0] = charSequence != null ? String.valueOf(charSequence.length()) : null;
                objArr[1] = String.valueOf(OLineInputView.this.w.n());
                String string = resources.getString(C0838R.string.oui_form_counter, objArr);
                l.e(string, "resources.getString(\n   …                        )");
                SpannableString spannableString = new SpannableString(string);
                int length = charSequence != null ? charSequence.length() : 0;
                Integer n = OLineInputView.this.w.n();
                if (length > (n != null ? n.intValue() : 0)) {
                    spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(OLineInputView.this.getContext(), C0838R.color.Primary)), 0, (charSequence == null || (valueOf = String.valueOf(charSequence.length())) == null) ? 0 : valueOf.length(), 18);
                    OLineInputView.this.n().setBackgroundColor(ContextCompat.getColor(OLineInputView.this.getContext(), C0838R.color.Primary));
                } else {
                    OLineInputView.this.n().setStyle(0);
                }
                OLineInputView.this.q().setText(spannableString, TextView.BufferType.SPANNABLE);
            }
        }
    }

    static final class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c v = OLineInputView.this.w.v();
            if (v != null) {
                v.b();
            }
            OLineInputView.this.setText("");
            c v2 = OLineInputView.this.w.v();
            if (v2 != null) {
                v2.a();
            }
        }
    }

    static final class g implements View.OnTouchListener {
        g() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (OLineInputView.this.N) {
                    ConstraintLayout m = OLineInputView.this.m();
                    if (m == null) {
                        return false;
                    }
                    m.setBackgroundResource(C0838R.drawable.o_line_box_input_error_pressed_border);
                    return false;
                }
                if (OLineInputView.this.o().hasFocus()) {
                    ConstraintLayout m2 = OLineInputView.this.m();
                    if (m2 == null) {
                        return false;
                    }
                    m2.setBackgroundResource(C0838R.drawable.o_line_box_input_focused_pressed_border);
                    return false;
                }
                ConstraintLayout m3 = OLineInputView.this.m();
                if (m3 == null) {
                    return false;
                }
                m3.setBackgroundResource(C0838R.drawable.o_line_box_input_normal_pressed_border);
                return false;
            }
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            if (OLineInputView.this.N) {
                ConstraintLayout m4 = OLineInputView.this.m();
                if (m4 == null) {
                    return false;
                }
                m4.setBackgroundResource(C0838R.drawable.o_line_box_input_error_default_border);
                return false;
            }
            if (OLineInputView.this.o().hasFocus()) {
                ConstraintLayout m5 = OLineInputView.this.m();
                if (m5 == null) {
                    return false;
                }
                m5.setBackgroundResource(C0838R.drawable.o_line_box_input_focused_default_border);
                return false;
            }
            ConstraintLayout m6 = OLineInputView.this.m();
            if (m6 == null) {
                return false;
            }
            m6.setBackgroundResource(C0838R.drawable.o_line_box_input_normal_default_border);
            return false;
        }
    }

    public static final class h implements TextWatcher {
        h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() == 0) {
                OLineInputView.this.r();
            } else {
                OLineInputView.this.w();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public OLineInputView(Context context) {
        this(context, null, 0, 0, 14);
    }

    public OLineInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12);
    }

    public OLineInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OLineInputView(android.content.Context r38, android.util.AttributeSet r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.forms.OLineInputView.<init>(android.content.Context, android.util.AttributeSet, int, int, int):void");
    }

    public static final void j(OLineInputView oLineInputView) {
        Object systemService = oLineInputView.getContext().getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(oLineInputView.getWindowToken(), 0);
    }

    public static final void l(OLineInputView oLineInputView) {
        Object systemService = oLineInputView.getContext().getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(oLineInputView, 0);
    }

    public static /* synthetic */ void setAutoHideClearWhenTextEmpty$default(OLineInputView oLineInputView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        oLineInputView.setAutoHideClearWhenTextEmpty(z);
    }

    public static /* synthetic */ void setMode$default(OLineInputView oLineInputView, int i, View.OnClickListener onClickListener, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            onClickListener = null;
        }
        oLineInputView.setMode(i, onClickListener);
    }

    private final void u() {
        String y = this.w.y();
        if (y == null || kotlin.text.a.s(y)) {
            this.B = false;
        } else {
            this.f7773e.setText(this.w.y());
        }
        if (this.B) {
            y();
        } else {
            t();
        }
        if (this.w.m() != null) {
            this.p.setImageDrawable(this.w.m());
            this.M = true;
        }
        if (this.M) {
            z();
        } else {
            com.obric.oui.common.util.b.f(this.p);
            if (!(this.f7773e.getVisibility() == 0) || TextUtils.isEmpty(this.f7773e.getText())) {
                com.obric.oui.common.util.b.f(this.r);
            }
            this.M = false;
        }
        int i = this.z;
        if (i == 0) {
            setSmallTitleIcon();
        } else if (i != 1) {
            setSmallTitleIcon();
        } else {
            setMiddleTitleIcon();
        }
        if (this.w.g()) {
            h hVar = new h();
            h().add(new WeakReference<>(hVar));
            this.f7774f.addTextChangedListener(hVar);
        }
        if (this.w.s() && this.w.n() != null) {
            this.x = new e();
            ArrayList<WeakReference<TextWatcher>> h2 = h();
            TextWatcher textWatcher = this.x;
            l.c(textWatcher);
            h2.add(new WeakReference<>(textWatcher));
            this.f7774f.addTextChangedListener(this.x);
            com.obric.oui.common.util.b.g(this.h);
        }
        if (this.w.r()) {
            this.j.setOnClickListener(new f());
            if (TextUtils.isEmpty(this.f7774f.getText())) {
                com.obric.oui.common.util.b.f(this.j);
                com.obric.oui.common.util.b.f(this.k);
            }
            this.f7774f.setOnFocusChangeListener(new a(1, this));
            this.f7774f.setOnTouchListener(new g());
        } else {
            r();
            this.f7774f.setOnFocusChangeListener(new a(0, this));
        }
        String j = this.w.j();
        if (!(j == null || j.length() == 0)) {
            this.f7774f.setHint(this.w.j());
        }
        if (this.w.q() != null) {
            this.n.removeAllViews();
            this.n.addView(this.w.q(), new ConstraintLayout.LayoutParams(-2, -2));
            com.obric.oui.common.util.b.g(this.n);
            this.E = true;
        }
        if (this.w.u() != null) {
            this.o.removeAllViews();
            this.o.addView(this.w.u(), new ConstraintLayout.LayoutParams(-2, -2));
            com.obric.oui.common.util.b.g(this.o);
            this.f7772J = true;
        }
        if (this.w.z()) {
            this.w.I(false);
        }
        if (this.w.t()) {
            com.obric.oui.common.util.b.g(this.m);
            this.w.I(true);
        } else {
            com.obric.oui.common.util.b.f(this.m);
            this.w.I(false);
        }
        String c2 = this.w.c();
        if (!(c2 == null || c2.length() == 0)) {
            this.i.setText(this.w.c());
            if (this.w.e() != null) {
                TextView textView = this.i;
                Integer e2 = this.w.e();
                l.c(e2);
                textView.setTextColor(e2.intValue());
            } else {
                this.i.setTextColor(ContextCompat.getColor(getContext(), C0838R.color.TextPrimary));
            }
            if (this.w.d() && this.w.f() != null) {
                this.i.setOnClickListener(this.w.f());
            }
            com.obric.oui.common.util.b.g(this.i);
            this.K = true;
        }
        if (this.w.x() != null) {
            ArrayList<WeakReference<TextWatcher>> h3 = h();
            TextWatcher x = this.w.x();
            l.c(x);
            h3.add(new WeakReference<>(x));
            this.f7774f.addTextChangedListener(this.w.x());
        }
        if (this.w.a() != null) {
            this.l.setImageDrawable(this.w.a());
            if (this.w.b() != null) {
                this.l.setOnClickListener(this.w.b());
            }
            v();
        }
        if (!TextUtils.isEmpty(this.w.l())) {
            String l = this.w.l();
            l.c(l);
            x(l);
        }
        if (this.w.k() != null) {
            ViewGroup viewGroup = this.s;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            Integer k = this.w.k();
            l.c(k);
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = k.intValue();
            viewGroup.setLayoutParams(layoutParams2);
        } else {
            ViewGroup viewGroup2 = this.s;
            ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            int i2 = this.R;
            ((ViewGroup.MarginLayoutParams) layoutParams4).height = i2 != 1 ? i2 != 2 ? e.a.a.a.a.e0("Resources.getSystem()", 1, 40) : e.a.a.a.a.e0("Resources.getSystem()", 1, 40) : this.w.z() ? e.a.a.a.a.e0("Resources.getSystem()", 1, 36) : e.a.a.a.a.e0("Resources.getSystem()", 1, 52);
            viewGroup2.setLayoutParams(layoutParams4);
        }
        if (this.w.p()) {
            OFormEditText oFormEditText = this.f7774f;
            oFormEditText.setSingleLine(false);
            oFormEditText.setLines(this.O);
        } else {
            this.f7774f.setSingleLine(true);
        }
        String str = this.v;
        if (!(str == null || str.length() == 0)) {
            setText(this.v);
        }
        if (this.y && this.w.m() == null) {
            z();
        }
        this.f7774f.setGravity(this.A);
        if (this.w.h() != null) {
            View.OnFocusChangeListener h4 = this.w.h();
            l.c(h4);
            setEditTextOnFocusChangeListener(h4);
        }
        if (this.B) {
            y();
        } else {
            t();
        }
        if (this.C) {
            String str2 = this.P;
            l.c(str2);
            com.obric.oui.common.util.b.g(this.f7775g);
            this.f7775g.setText(str2);
            this.m.setBackgroundColor(ContextCompat.getColor(getContext(), C0838R.color.Primary));
            if (com.obric.oui.common.util.b.e(this.q)) {
                com.obric.oui.common.util.b.f(this.q);
                this.D = false;
            }
            this.C = true;
            this.P = str2;
        } else {
            s();
        }
        if (this.D) {
            String str3 = this.Q;
            l.c(str3);
            x(str3);
        } else {
            com.obric.oui.common.util.b.f(this.q);
            this.D = false;
        }
        if (this.E) {
            com.obric.oui.common.util.b.g(this.n);
            this.E = true;
        } else {
            com.obric.oui.common.util.b.f(this.n);
            this.E = false;
        }
        if (this.f7772J) {
            com.obric.oui.common.util.b.g(this.o);
            this.f7772J = true;
        } else {
            com.obric.oui.common.util.b.f(this.o);
            this.f7772J = false;
        }
        if (this.K) {
            com.obric.oui.common.util.b.g(this.i);
            this.K = true;
        } else {
            com.obric.oui.common.util.b.f(this.i);
            this.K = false;
        }
        if (this.L) {
            v();
        } else {
            if (this.l.getVisibility() == 0) {
                com.obric.oui.common.util.b.f(this.l);
            }
            this.L = false;
        }
        setMode$default(this, this.w.o(), null, 2, null);
    }

    public final void A(b bVar) {
        l.f(bVar, "newConfig");
        this.w = bVar;
        Iterator<WeakReference<TextWatcher>> it2 = h().iterator();
        while (it2.hasNext()) {
            this.f7774f.removeTextChangedListener(it2.next().get());
        }
        u();
    }

    @Override // com.obric.oui.forms.AbsOForm
    public EditText g() {
        return this.f7774f;
    }

    public final ConstraintLayout m() {
        return this.u;
    }

    public final ODivider n() {
        return this.m;
    }

    public final OFormEditText o() {
        return this.f7774f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        float f2 = 44;
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        ViewGroup viewGroup = this.t;
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        com.obric.oui.common.util.b.a(viewGroup, kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
        com.obric.oui.common.util.b.d(this.t, e0, e0, this.i, this.l);
    }

    public final String p() {
        return String.valueOf(this.f7774f.getText());
    }

    public final TextView q() {
        return this.h;
    }

    public final void r() {
        com.obric.oui.common.util.b.f(this.k);
        com.obric.oui.common.util.b.f(this.j);
        this.w.G(false);
    }

    public final void s() {
        com.obric.oui.common.util.b.f(this.f7775g);
        this.m.setStyle(0);
        CharSequence text = this.q.getText();
        l.e(text, "tvInputTips.text");
        if (text.length() > 0) {
            x(this.q.getText().toString());
        }
        this.C = false;
    }

    public final void setActiveBorderView(ConstraintLayout constraintLayout) {
        this.u = constraintLayout;
    }

    public final void setArrangeDirection(int i) {
        this.R = i;
    }

    public final void setAutoHideClearWhenTextEmpty(boolean z) {
        b bVar = this.w;
        bVar.A(z);
        A(bVar);
    }

    public final void setEditTextOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        l.f(onFocusChangeListener, "listener");
        this.f7774f.setOnFocusChangeListener(onFocusChangeListener);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.f7774f.setEnabled(z);
        super.setEnabled(z);
    }

    public final void setInputContainerBackground(Drawable drawable) {
        l.f(drawable, "drawable");
        this.s.setBackground(drawable);
    }

    public final void setInputContainerPadding(int i, int i2, int i3, int i4) {
        this.s.setPadding(i, i2, i3, i4);
    }

    public final void setInputViewActived() {
        this.N = false;
        Drawable drawable = ContextCompat.getDrawable(getContext(), C0838R.drawable.o_line_box_input_focused_border_selector);
        ConstraintLayout constraintLayout = this.u;
        if (constraintLayout != null) {
            constraintLayout.setBackground(drawable);
        }
    }

    public final void setInputViewError() {
        this.N = true;
        Drawable drawable = ContextCompat.getDrawable(getContext(), C0838R.drawable.o_line_box_input_error_border_selector);
        ConstraintLayout constraintLayout = this.u;
        if (constraintLayout != null) {
            constraintLayout.setBackground(drawable);
        }
    }

    public final void setInputViewNormal() {
        this.N = false;
        Drawable drawable = ContextCompat.getDrawable(getContext(), C0838R.drawable.o_line_box_input_normal_border_selector);
        ConstraintLayout constraintLayout = this.u;
        if (constraintLayout != null) {
            constraintLayout.setBackground(drawable);
        }
    }

    public final void setLeftContainer(ConstraintLayout constraintLayout) {
    }

    public final void setMiddleTitleIcon() {
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        l.e(layoutParams, "ivTitleIcon.getLayoutParams()");
        float f2 = 16;
        layoutParams.width = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        layoutParams.height = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        this.p.setLayoutParams(layoutParams);
    }

    public final void setMode(int i, View.OnClickListener onClickListener) {
        if (i == 2) {
            this.f7774f.setFocusable(true);
            this.f7774f.setFocusableInTouchMode(true);
            this.f7774f.setOnClickListener(null);
            setOnClickListener(null);
            return;
        }
        if (i != 3) {
            return;
        }
        this.f7774f.setFocusable(false);
        this.f7774f.setFocusableInTouchMode(false);
        if (onClickListener == null) {
            this.f7774f.setOnClickListener(this.w.b());
            setOnClickListener(this.w.b());
        } else {
            this.f7774f.setOnClickListener(onClickListener);
            setOnClickListener(onClickListener);
        }
    }

    public final void setSmallTitleIcon() {
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        l.e(layoutParams, "ivTitleIcon.getLayoutParams()");
        float f2 = 10;
        layoutParams.width = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        layoutParams.height = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        this.p.setLayoutParams(layoutParams);
    }

    public final void setText(String str) {
        if (str != null) {
            this.f7774f.setText(str);
            TextWatcher textWatcher = this.x;
            if (textWatcher != null) {
                textWatcher.onTextChanged(str, 0, 0, str.length());
            }
        }
    }

    public final void setTextClearedListener(c cVar) {
        l.f(cVar, "textClearedListener");
        this.w.J(cVar);
    }

    public final void setTextExceedLengthListener(d dVar) {
        l.f(dVar, "textExceedLengthListener");
        this.w.K(dVar);
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        this.w.L(textWatcher);
        u();
    }

    public final void t() {
        com.obric.oui.common.util.b.f(this.f7773e);
        if (!(this.p.getVisibility() == 0)) {
            com.obric.oui.common.util.b.f(this.r);
        }
        this.B = false;
    }

    public final void v() {
        if (!(this.l.getVisibility() == 0)) {
            com.obric.oui.common.util.b.g(this.l);
        }
        this.L = true;
    }

    public final void w() {
        com.obric.oui.common.util.b.g(this.k);
        com.obric.oui.common.util.b.g(this.j);
        this.w.G(false);
    }

    public final void x(String str) {
        if (str == null) {
            return;
        }
        this.q.setText(str);
        com.obric.oui.common.util.b.g(this.q);
        if (this.f7775g.getVisibility() == 0) {
            s();
        }
        this.D = true;
        this.Q = str;
    }

    public final void y() {
        com.obric.oui.common.util.b.g(this.f7773e);
        if (!(this.r.getVisibility() == 0)) {
            com.obric.oui.common.util.b.g(this.r);
        }
        this.B = true;
    }

    public final void z() {
        if (!(this.r.getVisibility() == 0)) {
            com.obric.oui.common.util.b.g(this.r);
        }
        com.obric.oui.common.util.b.g(this.p);
        this.M = true;
    }
}
