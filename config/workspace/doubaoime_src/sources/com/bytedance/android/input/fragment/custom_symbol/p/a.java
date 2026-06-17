package com.bytedance.android.input.fragment.custom_symbol.p;

import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.android.input.basic.IAppGlobals;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.h;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a implements InputFilter {
    private final int a;

    public a(int i) {
        this.a = i;
    }

    private final void a(String str) {
        String str2 = "CodePointLengthFilter-" + str;
        l.f(str2, "msg");
        IAppGlobals.a.j("[custom_symbol]", str2);
    }

    private final void b(String str) {
        String str2 = "CodePointLengthFilter-" + str;
        l.f(str2, "msg");
        IAppGlobals.a.x("[custom_symbol]", str2);
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Object J2;
        CharSequence U;
        int i5;
        int codePointCount;
        int i6;
        int i7;
        String obj;
        String obj2;
        String obj3;
        try {
            a("originSource = " + ((Object) charSequence) + ", start= " + i + ", end = " + i2 + ", dest = " + ((Object) spanned) + ", dStart = " + i3 + ", dEnd = " + i4);
            U = charSequence != null ? kotlin.text.a.U(charSequence) : null;
            i5 = 0;
            int codePointCount2 = (spanned == null || (obj3 = spanned.toString()) == null) ? 0 : obj3.codePointCount(0, spanned.toString().length());
            int codePointCount3 = (U == null || (obj2 = U.toString()) == null) ? 0 : obj2.codePointCount(i, i2);
            codePointCount = codePointCount2 - ((spanned == null || (obj = spanned.toString()) == null) ? 0 : obj.codePointCount(i3, i4));
            i6 = codePointCount3 + codePointCount;
            i7 = this.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        if (i6 <= i7) {
            b("total <= maxCodePointLength");
            return null;
        }
        int i8 = i7 - codePointCount;
        if (i8 <= 0) {
            b("allowCodePointCount <= 0");
            return "";
        }
        if (U == null) {
            J2 = null;
            Throwable b = h.b(J2);
            if (b != null) {
                String str = "CodePointLengthFilter-" + e.a.a.a.a.w("filter error = ", b);
                l.f(str, "msg");
                IAppGlobals.a.e("[custom_symbol]", str);
            }
            b("filter end content is null");
            return null;
        }
        int i9 = i;
        while (i9 < i2) {
            int codePointAt = Character.codePointAt(U, i9);
            i5++;
            if (i5 > i8) {
                break;
            }
            i9 += Character.charCount(codePointAt);
        }
        CharSequence subSequence = U.subSequence(i, i9);
        a("result = " + ((Object) subSequence));
        return subSequence;
    }
}
