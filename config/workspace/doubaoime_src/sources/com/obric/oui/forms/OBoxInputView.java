package com.obric.oui.forms;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OBoxInputView extends AbsOForm {
    private static final int s = e.a.a.a.a.e0("Resources.getSystem()", 1, 144);
    public static final /* synthetic */ int t = 0;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f7746e;

    /* renamed from: f, reason: collision with root package name */
    private final AppCompatEditText f7747f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f7748g;
    private final ImageView h;
    private final ViewGroup i;
    private final ViewGroup j;
    private ViewGroup k;
    private String l;
    private a m;
    private boolean n;
    private int o;
    private TextWatcher p;
    private final int q;
    private int r;

    public static final class a {
        private boolean a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7749c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f7750d;

        /* renamed from: e, reason: collision with root package name */
        private String f7751e;

        /* renamed from: f, reason: collision with root package name */
        private View f7752f;

        /* renamed from: g, reason: collision with root package name */
        private TextWatcher f7753g;
        private int h;
        private int i;
        private boolean j;
        private Drawable k;

        /* renamed from: com.obric.oui.forms.OBoxInputView$a$a, reason: collision with other inner class name */
        public static final class C0359a {
            private boolean a;
            private String b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f7754c;

            /* renamed from: d, reason: collision with root package name */
            private Integer f7755d;

            /* renamed from: e, reason: collision with root package name */
            private String f7756e;

            /* renamed from: f, reason: collision with root package name */
            private View f7757f;

            /* renamed from: g, reason: collision with root package name */
            private TextWatcher f7758g;
            private int h;
            private int i;
            private boolean j;
            private Drawable k;

            public C0359a() {
                this(false, null, false, null, null, null, null, 0, 0, false, null, 2047);
            }

            public C0359a(boolean z, String str, boolean z2, Integer num, String str2, View view, TextWatcher textWatcher, int i, int i2, boolean z3, Drawable drawable, int i3) {
                z = (i3 & 1) != 0 ? false : z;
                int i4 = i3 & 2;
                z2 = (i3 & 4) != 0 ? false : z2;
                int i5 = i3 & 8;
                int i6 = i3 & 16;
                int i7 = i3 & 32;
                int i8 = i3 & 64;
                i = (i3 & 128) != 0 ? OBoxInputView.s : i;
                i2 = (i3 & 256) != 0 ? Integer.MAX_VALUE : i2;
                z3 = (i3 & 512) != 0 ? false : z3;
                int i9 = i3 & 1024;
                this.a = z;
                this.b = null;
                this.f7754c = z2;
                this.f7755d = null;
                this.f7756e = null;
                this.f7757f = null;
                this.f7758g = null;
                this.h = i;
                this.i = i2;
                this.j = z3;
                this.k = null;
            }

            public final a a() {
                boolean z = this.a;
                String str = this.b;
                boolean z2 = this.f7754c;
                String str2 = this.f7756e;
                return new a(z, str, z2, this.f7755d, str2, this.f7757f, this.f7758g, this.h, this.i, this.j, this.k, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0359a)) {
                    return false;
                }
                C0359a c0359a = (C0359a) obj;
                return this.a == c0359a.a && l.a(this.b, c0359a.b) && this.f7754c == c0359a.f7754c && l.a(this.f7755d, c0359a.f7755d) && l.a(this.f7756e, c0359a.f7756e) && l.a(this.f7757f, c0359a.f7757f) && l.a(this.f7758g, c0359a.f7758g) && this.h == c0359a.h && this.i == c0359a.i && this.j == c0359a.j && l.a(this.k, c0359a.k);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v20 */
            /* JADX WARN: Type inference failed for: r0v21 */
            /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
            public int hashCode() {
                boolean z = this.a;
                ?? r0 = z;
                if (z) {
                    r0 = 1;
                }
                int i = r0 * 31;
                String str = this.b;
                int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
                ?? r2 = this.f7754c;
                int i2 = r2;
                if (r2 != 0) {
                    i2 = 1;
                }
                int i3 = (hashCode + i2) * 31;
                Integer num = this.f7755d;
                int hashCode2 = (i3 + (num != null ? num.hashCode() : 0)) * 31;
                String str2 = this.f7756e;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
                View view = this.f7757f;
                int hashCode4 = (hashCode3 + (view != null ? view.hashCode() : 0)) * 31;
                TextWatcher textWatcher = this.f7758g;
                int I = e.a.a.a.a.I(this.i, e.a.a.a.a.I(this.h, (hashCode4 + (textWatcher != null ? textWatcher.hashCode() : 0)) * 31, 31), 31);
                boolean z2 = this.j;
                int i4 = (I + (z2 ? 1 : z2 ? 1 : 0)) * 31;
                Drawable drawable = this.k;
                return i4 + (drawable != null ? drawable.hashCode() : 0);
            }

            public String toString() {
                StringBuilder M = e.a.a.a.a.M("Builder(showTitle=");
                M.append(this.a);
                M.append(", title=");
                M.append(this.b);
                M.append(", showCounter=");
                M.append(this.f7754c);
                M.append(", lengthLimit=");
                M.append(this.f7755d);
                M.append(", hintText=");
                M.append(this.f7756e);
                M.append(", prefixView=");
                M.append(this.f7757f);
                M.append(", textWatcher=");
                M.append(this.f7758g);
                M.append(", inputBoxHeight=");
                M.append(this.h);
                M.append(", inputBoxMaxHeight=");
                M.append(this.i);
                M.append(", autoAdjustHeight=");
                M.append(this.j);
                M.append(", ivTitleIcon=");
                M.append(this.k);
                M.append(")");
                return M.toString();
            }
        }

        public a(boolean z, String str, boolean z2, Integer num, String str2, View view, TextWatcher textWatcher, int i, int i2, boolean z3, Drawable drawable, kotlin.s.c.g gVar) {
            this.a = z;
            this.b = str;
            this.f7749c = z2;
            this.f7750d = num;
            this.f7751e = str2;
            this.f7752f = view;
            this.f7753g = textWatcher;
            this.h = i;
            this.i = i2;
            this.j = z3;
            this.k = drawable;
        }

        public final boolean a() {
            return this.j;
        }

        public final String b() {
            return this.f7751e;
        }

        public final int c() {
            return this.h;
        }

        public final int d() {
            return this.i;
        }

        public final Drawable e() {
            return this.k;
        }

        public final Integer f() {
            return this.f7750d;
        }

        public final View g() {
            return this.f7752f;
        }

        public final boolean h() {
            return this.f7749c;
        }

        public final boolean i() {
            return this.a;
        }

        public final TextWatcher j() {
            return this.f7753g;
        }

        public final String k() {
            return this.b;
        }

        public final void l(boolean z) {
            this.j = z;
        }

        public final void m(String str) {
            this.f7751e = str;
        }

        public final void n(int i) {
            this.h = i;
        }

        public final void o(int i) {
            this.i = i;
        }

        public final void p(Integer num) {
            this.f7750d = num;
        }

        public final void q(boolean z) {
            this.f7749c = z;
        }

        public final void r(boolean z) {
            this.a = z;
        }

        public final void s(String str) {
            this.b = str;
        }
    }

    public OBoxInputView(Context context) {
        this(context, null, 0, 0, 14);
    }

    public OBoxInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12);
    }

    public OBoxInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a3 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:12:0x005b, B:14:0x007b, B:15:0x0084, B:17:0x008c, B:22:0x0098, B:23:0x00aa, B:100:0x00a3), top: B:11:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:12:0x005b, B:14:0x007b, B:15:0x0084, B:17:0x008c, B:22:0x0098, B:23:0x00aa, B:100:0x00a3), top: B:11:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OBoxInputView(android.content.Context r23, android.util.AttributeSet r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.forms.OBoxInputView.<init>(android.content.Context, android.util.AttributeSet, int, int, int):void");
    }

    public static final void i(OBoxInputView oBoxInputView) {
        int lineCount = oBoxInputView.f7747f.getLineCount();
        int lineHeight = oBoxInputView.f7747f.getLineHeight();
        int height = oBoxInputView.f7747f.getHeight();
        int height2 = oBoxInputView.i.getHeight();
        int i = ((lineCount * lineHeight) + height2) - height;
        if (i >= oBoxInputView.m.c() && i < oBoxInputView.m.d()) {
            height2 = i;
        }
        ViewGroup.LayoutParams layoutParams = oBoxInputView.i.getLayoutParams();
        l.e(layoutParams, "inputContainer.getLayoutParams()");
        layoutParams.height = height2;
        oBoxInputView.i.setLayoutParams(layoutParams);
    }

    @Override // com.obric.oui.forms.AbsOForm
    public EditText g() {
        return this.f7747f;
    }

    public final AppCompatEditText k() {
        return this.f7747f;
    }

    public final TextView l() {
        return this.f7748g;
    }

    public final void setArrangeDirection(int i) {
        this.r = i;
    }

    public final void setText(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f7747f.setText(str);
        TextWatcher textWatcher = this.p;
        if (textWatcher != null) {
            l.c(str);
            textWatcher.onTextChanged(str, 0, 0, str.length());
        }
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        l.f(textWatcher, "textWatcher");
        Iterator<WeakReference<TextWatcher>> it2 = h().iterator();
        while (it2.hasNext()) {
            this.f7747f.removeTextChangedListener(it2.next().get());
        }
        h().add(new WeakReference<>(textWatcher));
        this.f7747f.addTextChangedListener(textWatcher);
    }

    public final void setTitleContainer(ViewGroup viewGroup) {
        l.f(viewGroup, "<set-?>");
        this.k = viewGroup;
    }
}
