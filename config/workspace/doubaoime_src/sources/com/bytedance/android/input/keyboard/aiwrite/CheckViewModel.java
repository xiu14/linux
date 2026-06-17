package com.bytedance.android.input.keyboard.aiwrite;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.SpellCheck.CorrectWord;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.aiwrite.C0601v;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CheckViewModel {

    /* renamed from: g, reason: collision with root package name */
    private static String[] f2562g;
    private static int[] h;
    private static int[] i;
    private static boolean j;
    public static final CheckViewModel a = new CheckViewModel();
    private static MutableLiveData<Integer> b = new MutableLiveData<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static MutableLiveData<Integer> f2558c = new MutableLiveData<>(0);

    /* renamed from: d, reason: collision with root package name */
    private static MutableLiveData<a> f2559d = new MutableLiveData<>(new a(0, 0, 3));

    /* renamed from: e, reason: collision with root package name */
    private static MutableLiveData<SpannableString> f2560e = new MutableLiveData<>(new SpannableString(""));

    /* renamed from: f, reason: collision with root package name */
    private static MutableLiveData<Integer> f2561f = new MutableLiveData<>(0);
    private static final Handler k = new Handler(Looper.getMainLooper());

    private static final class ColorUnderlineSpan extends UnderlineSpan {
        private final int a;

        public ColorUnderlineSpan(int i) {
            this.a = i;
        }

        @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            kotlin.s.c.l.f(textPaint, "tp");
            textPaint.setUnderlineText(true);
            textPaint.underlineColor = this.a;
            textPaint.underlineThickness = 3.0f;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            Integer num2 = num;
            CheckViewModel checkViewModel = CheckViewModel.a;
            if (checkViewModel.o()) {
                if (num2 != null && num2.intValue() == 2) {
                    CheckViewModel.i(checkViewModel);
                } else {
                    kotlin.o oVar = null;
                    if (num2 != null && num2.intValue() == 1) {
                        checkViewModel.w(2);
                        V.k(null, null, null);
                    } else if (num2 != null && num2.intValue() == 0) {
                        CheckViewModel.f2562g = CorrectWord.g().f();
                        CheckViewModel.h = CorrectWord.g().d();
                        CheckViewModel.i = CorrectWord.g().e();
                        String[] strArr = CheckViewModel.f2562g;
                        if (strArr != null) {
                            CheckViewModel.e(checkViewModel, new a(strArr.length, 0));
                            checkViewModel.z(false);
                            C0601v c0601v = C0601v.a;
                            if (kotlin.s.c.l.a(c0601v.i().getValue(), Boolean.TRUE)) {
                                checkViewModel.w(0);
                            } else {
                                String k = c0601v.k(C0838R.id.ai_btn_check);
                                String[] strArr2 = CheckViewModel.f2562g;
                                int[] iArr = CheckViewModel.h;
                                int[] iArr2 = CheckViewModel.i;
                                if (strArr2 != null && iArr != null && iArr2 != null) {
                                    int length = strArr2.length;
                                    for (int i = 0; i < length; i++) {
                                        k = kotlin.text.a.F(k, iArr[i], iArr2[i], strArr2[i]).toString();
                                    }
                                }
                                SpannableString valueOf = SpannableString.valueOf(k);
                                if (strArr2 != null && iArr != null && iArr2 != null) {
                                    int length2 = strArr2.length;
                                    for (int i2 = 0; i2 < length2; i2++) {
                                        valueOf.setSpan(new ColorUnderlineSpan(-1724886542), iArr[i2], iArr2[i2], 33);
                                    }
                                }
                                kotlin.s.c.l.e(valueOf, "spanText");
                                checkViewModel.x(valueOf);
                                CheckViewModel checkViewModel2 = CheckViewModel.a;
                                checkViewModel2.w(4);
                                CheckViewModel.d(checkViewModel2);
                            }
                            IAppLog.a aVar = IAppLog.a;
                            Objects.requireNonNull(aVar);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("tabname", "check");
                            oVar = kotlin.o.a;
                            aVar.t("AI_tabcontentshow", jSONObject);
                        }
                        if (oVar == null) {
                            CheckViewModel.i(CheckViewModel.a);
                        }
                    }
                }
            }
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<C0601v.a, kotlin.o> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(C0601v.a aVar) {
            C0601v.a aVar2 = aVar;
            if (CheckViewModel.a.o()) {
                CheckViewModel checkViewModel = CheckViewModel.a;
                StringBuilder M = e.a.a.a.a.M("request ");
                M.append(aVar2.d());
                com.bytedance.android.input.r.j.i("AIWriting-CheckViewModel", M.toString());
                CorrectWord.g().h(aVar2.d());
            }
            return kotlin.o.a;
        }
    }

    static final class d implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        d(kotlin.s.b.l lVar) {
            kotlin.s.c.l.f(lVar, "function");
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.s.c.h)) {
                return kotlin.s.c.l.a(this.a, ((kotlin.s.c.h) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.s.c.h
        public final kotlin.b<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    private CheckViewModel() {
    }

    public static final void d(CheckViewModel checkViewModel) {
        MutableLiveData<Integer> mutableLiveData = f2561f;
        Integer value = mutableLiveData.getValue();
        if (value == null) {
            value = 0;
        }
        mutableLiveData.setValue(Integer.valueOf(value.intValue() + 1));
    }

    public static final void e(CheckViewModel checkViewModel, a aVar) {
        f2559d.setValue(aVar);
    }

    public static final void i(CheckViewModel checkViewModel) {
        f2562g = new String[0];
        h = new int[0];
        i = new int[0];
        checkViewModel.w(3);
        V.k(h, i, f2562g);
    }

    public static void j(CheckViewModel checkViewModel, int i2, int i3) {
        a value = f2559d.getValue();
        if (value != null && value.a() - 1 > 0) {
            value.c(value.a() - 1);
            V.e(value.a() - 1);
        }
        f2559d.setValue(value);
    }

    public static void p(CheckViewModel checkViewModel, int i2, int i3) {
        a value = f2559d.getValue();
        if (value != null && value.a() + 1 <= value.b()) {
            value.c(value.a() + 1);
            V.e(value.a() - 1);
        }
        f2559d.setValue(value);
    }

    public static void r(int i2) {
        a value = f2559d.getValue();
        if (value != null) {
            if (i2 < 0 || i2 >= value.b()) {
                com.bytedance.android.input.r.j.j("AIWriting-CheckViewModel", "onHighlighted order = " + i2 + " is error");
            } else {
                value.c(i2 + 1);
                com.bytedance.android.input.r.j.j("AIWriting-CheckViewModel", "onHighlighted it.current = " + value.a());
            }
        }
        f2559d.setValue(value);
    }

    public static void s(int i2) {
        String[] strArr = f2562g;
        if (strArr != null) {
            kotlin.s.c.l.f(strArr, "<this>");
            kotlin.w.d dVar = new kotlin.w.d(0, kotlin.collections.g.y(strArr));
            if (i2 <= dVar.b() && dVar.a() <= i2) {
                String[] strArr2 = f2562g;
                kotlin.s.c.l.c(strArr2);
                kotlin.s.c.l.f(strArr2, "<this>");
                kotlin.collections.g.m(i2, strArr2.length);
                Object[] copyOfRange = Arrays.copyOfRange(strArr2, 0, i2);
                kotlin.s.c.l.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
                String[] strArr3 = f2562g;
                kotlin.s.c.l.c(strArr3);
                String[] strArr4 = f2562g;
                kotlin.s.c.l.c(strArr4);
                int length = strArr4.length;
                kotlin.s.c.l.f(strArr3, "<this>");
                kotlin.collections.g.m(length, strArr3.length);
                Object[] copyOfRange2 = Arrays.copyOfRange(strArr3, i2 + 1, length);
                kotlin.s.c.l.e(copyOfRange2, "copyOfRange(this, fromIndex, toIndex)");
                f2562g = (String[]) kotlin.collections.g.P(copyOfRange, copyOfRange2);
            }
        }
        int[] iArr = i;
        if (iArr != null) {
            kotlin.s.c.l.f(iArr, "<this>");
            kotlin.s.c.l.f(iArr, "<this>");
            kotlin.w.d dVar2 = new kotlin.w.d(0, iArr.length - 1);
            if (i2 <= dVar2.b() && dVar2.a() <= i2) {
                int[] iArr2 = i;
                kotlin.s.c.l.c(iArr2);
                int[] l = kotlin.collections.g.l(iArr2, 0, i2);
                int[] iArr3 = i;
                kotlin.s.c.l.c(iArr3);
                int[] iArr4 = i;
                kotlin.s.c.l.c(iArr4);
                i = kotlin.collections.g.O(l, kotlin.collections.g.l(iArr3, i2 + 1, iArr4.length));
            }
        }
        int[] iArr5 = h;
        if (iArr5 != null) {
            kotlin.s.c.l.f(iArr5, "<this>");
            kotlin.s.c.l.f(iArr5, "<this>");
            kotlin.w.d dVar3 = new kotlin.w.d(0, iArr5.length - 1);
            if (i2 <= dVar3.b() && dVar3.a() <= i2) {
                int[] iArr6 = h;
                kotlin.s.c.l.c(iArr6);
                int[] l2 = kotlin.collections.g.l(iArr6, 0, i2);
                int[] iArr7 = h;
                kotlin.s.c.l.c(iArr7);
                int[] iArr8 = h;
                kotlin.s.c.l.c(iArr8);
                h = kotlin.collections.g.O(l2, kotlin.collections.g.l(iArr7, i2 + 1, iArr8.length));
            }
        }
        a value = f2559d.getValue();
        if (value != null && value.b() > 0) {
            value.d(value.b() - 1);
            if (value.a() > value.b()) {
                value.c(value.b());
            }
            if (value.b() <= 0) {
                b.setValue(3);
            }
            StringBuilder M = e.a.a.a.a.M("deleteResults it.current = ");
            M.append(value.a());
            M.append(", it.total=");
            M.append(value.b());
            com.bytedance.android.input.r.j.j("AIWriting-CheckViewModel", M.toString());
        }
        f2559d.setValue(value);
    }

    public final LiveData<a> k() {
        return f2559d;
    }

    public final LiveData<Integer> l() {
        return b;
    }

    public final LiveData<Integer> m() {
        return f2561f;
    }

    public final LiveData<SpannableString> n() {
        return f2560e;
    }

    public final boolean o() {
        return j;
    }

    public final void q() {
        f2558c.observeForever(new d(b.a));
        C0601v.a.l().observeForever(new d(c.a));
    }

    public final void t(final int i2) {
        k.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.m
            @Override // java.lang.Runnable
            public final void run() {
                CheckViewModel.s(i2);
            }
        });
    }

    public final void u(final int i2) {
        k.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.l
            @Override // java.lang.Runnable
            public final void run() {
                CheckViewModel.r(i2);
            }
        });
    }

    public final void v(int i2) {
        f2558c.setValue(Integer.valueOf(i2));
    }

    public final void w(int i2) {
        b.setValue(Integer.valueOf(i2));
    }

    public final void x(SpannableString spannableString) {
        kotlin.s.c.l.f(spannableString, "text");
        f2560e.setValue(spannableString);
    }

    public final void y(boolean z) {
        j = z;
    }

    public final void z(boolean z) {
        if (!z) {
            V.k(h, i, f2562g);
            C0601v.a.v(false);
            return;
        }
        C0601v.a.s(false);
        a value = f2559d.getValue();
        if (value != null) {
            value.c(0);
            com.bytedance.android.input.r.j.m("AIWriting-CheckViewModel", "showOriginText false");
        }
        f2559d.setValue(value);
    }

    public static final class a {
        private int a;
        private int b;

        public a() {
            this(0, 0, 3);
        }

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final void c(int i) {
            this.b = i;
        }

        public final void d(int i) {
            this.a = i;
        }

        public a(int i, int i2, int i3) {
            i = (i3 & 1) != 0 ? 0 : i;
            i2 = (i3 & 2) != 0 ? 0 : i2;
            this.a = i;
            this.b = i2;
        }
    }
}
