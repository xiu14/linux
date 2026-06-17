package kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.text.CharCategory;
import kotlin.x.o;

/* loaded from: classes2.dex */
public final class a extends b {
    public static final boolean A(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!h(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String B(String str, CharSequence charSequence) {
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(charSequence, "prefix");
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(charSequence, "prefix");
        if (!(charSequence instanceof String ? K(str, (String) charSequence, false, 2, null) : A(str, 0, charSequence, 0, charSequence.length(), false))) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        kotlin.s.c.l.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static String C(String str, CharSequence charSequence) {
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(charSequence, "suffix");
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(charSequence, "suffix");
        if (!g(str, (String) charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String D(String str, char c2, char c3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        kotlin.s.c.l.f(str, "<this>");
        if (!z) {
            String replace = str.replace(c2, c3);
            kotlin.s.c.l.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (h(charAt, c2, z)) {
                charAt = c3;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.s.c.l.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static String E(String str, String str2, String str3, boolean z, int i, Object obj) {
        int i2 = 0;
        if ((i & 4) != 0) {
            z = false;
        }
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str2, "oldValue");
        kotlin.s.c.l.f(str3, "newValue");
        int m = m(str, str2, 0, z);
        if (m < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i2, m);
            sb.append(str3);
            i2 = m + length;
            if (m >= str.length()) {
                break;
            }
            m = m(str, str2, m + i3, z);
        } while (m > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        kotlin.s.c.l.e(sb2, "stringBuilder.append(this, i, length).toString()");
        return sb2;
    }

    public static CharSequence F(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            kotlin.s.c.l.e(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            kotlin.s.c.l.e(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static final void G(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.j("Limit must be non-negative, but was ", i).toString());
        }
    }

    private static final List<String> H(CharSequence charSequence, String str, boolean z, int i) {
        G(i);
        int i2 = 0;
        int m = m(charSequence, str, 0, z);
        if (m != -1) {
            if (i != 1) {
                boolean z2 = i > 0;
                int i3 = 10;
                if (z2 && i <= 10) {
                    i3 = i;
                }
                ArrayList arrayList = new ArrayList(i3);
                do {
                    arrayList.add(charSequence.subSequence(i2, m).toString());
                    i2 = str.length() + m;
                    if (z2 && arrayList.size() == i - 1) {
                        break;
                    }
                    m = m(charSequence, str, i2, z);
                } while (m != -1);
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                return arrayList;
            }
        }
        return kotlin.collections.g.F(charSequence.toString());
    }

    public static List I(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return H(charSequence, String.valueOf(cArr[0]), z, i);
        }
        G(i);
        d dVar = new d(charSequence, 0, i, new k(cArr, z));
        kotlin.s.c.l.f(dVar, "<this>");
        o oVar = new o(dVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.g.e(oVar, 10));
        Iterator it2 = oVar.iterator();
        while (it2.hasNext()) {
            arrayList.add(L(charSequence, (kotlin.w.d) it2.next()));
        }
        return arrayList;
    }

    public static List J(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return H(charSequence, str, z2, i3);
            }
        }
        kotlin.x.e y = y(charSequence, strArr, 0, z2, i3, 2);
        kotlin.s.c.l.f(y, "<this>");
        o oVar = new o(y);
        ArrayList arrayList = new ArrayList(kotlin.collections.g.e(oVar, 10));
        Iterator it2 = oVar.iterator();
        while (it2.hasNext()) {
            arrayList.add(L(charSequence, (kotlin.w.d) it2.next()));
        }
        return arrayList;
    }

    public static boolean K(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str2, "prefix");
        return !z2 ? str.startsWith(str2) : z(str, 0, str2, 0, str2.length(), z2);
    }

    public static final String L(CharSequence charSequence, kotlin.w.d dVar) {
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(dVar, "range");
        return charSequence.subSequence(dVar.getStart().intValue(), dVar.getEndInclusive().intValue() + 1).toString();
    }

    public static String M(String str, String str2, String str3, int i, Object obj) {
        String str4 = (i & 2) != 0 ? str : null;
        e.a.a.a.a.u0(str, "<this>", str2, "delimiter", str4, "missingDelimiterValue");
        int q = q(str, str2, 0, false, 6, null);
        if (q == -1) {
            return str4;
        }
        String substring = str.substring(str2.length() + q, str.length());
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String N(String str, char c2, String str2) {
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str2, "missingDelimiterValue");
        int v = v(str, c2, 0, false, 6, null);
        if (v == -1) {
            return str2;
        }
        String substring = str.substring(v + 1, str.length());
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String O(String str, String str2, String str3, int i, Object obj) {
        String str4 = (i & 2) != 0 ? str : null;
        e.a.a.a.a.u0(str, "<this>", str2, "delimiter", str4, "missingDelimiterValue");
        int w = w(str, str2, 0, false, 6, null);
        if (w == -1) {
            return str4;
        }
        String substring = str.substring(str2.length() + w, str.length());
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String P(String str, char c2, String str2, int i, Object obj) {
        String str3 = (i & 2) != 0 ? str : null;
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str3, "missingDelimiterValue");
        int p = p(str, c2, 0, false, 6, null);
        if (p == -1) {
            return str3;
        }
        String substring = str.substring(0, p);
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String Q(String str, String str2, String str3, int i, Object obj) {
        String str4 = (i & 2) != 0 ? str : null;
        e.a.a.a.a.u0(str, "<this>", str2, "delimiter", str4, "missingDelimiterValue");
        int w = w(str, str2, 0, false, 6, null);
        if (w == -1) {
            return str4;
        }
        String substring = str.substring(0, w);
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean R(String str) {
        kotlin.s.c.l.f(str, "<this>");
        if (kotlin.s.c.l.a(str, "true")) {
            return true;
        }
        if (kotlin.s.c.l.a(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException(e.a.a.a.a.s("The string doesn't represent a boolean value: ", str));
    }

    public static Integer S(String str) {
        boolean z;
        int i;
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str, "<this>");
        b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = 1;
        int i4 = -2147483647;
        if ((charAt < '0' ? (char) 65535 : charAt == '0' ? (char) 0 : (char) 1) >= 0) {
            z = false;
            i3 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z = false;
            }
        }
        int i5 = -59652323;
        while (i3 < length) {
            int digit = Character.digit((int) str.charAt(i3), 10);
            if (digit < 0) {
                return null;
            }
            if ((i2 < i5 && (i5 != -59652323 || i2 < (i5 = i4 / 10))) || (i = i2 * 10) < i4 + digit) {
                return null;
            }
            i2 = i - digit;
            i3++;
        }
        return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
    }

    public static Long T(String str) {
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str, "<this>");
        b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        boolean z = true;
        long j = -9223372036854775807L;
        if ((charAt < '0' ? (char) 65535 : charAt == '0' ? (char) 0 : (char) 1) >= 0) {
            z = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z = false;
                i = 1;
            }
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        long j4 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j2 < j4) {
                if (j4 != j3) {
                    return null;
                }
                j4 = j / 10;
                if (j2 < j4) {
                    return null;
                }
            }
            long j5 = j2 * 10;
            long j6 = digit;
            if (j5 < j + j6) {
                return null;
            }
            j2 = j5 - j6;
            i++;
            j3 = -256204778801521550L;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static CharSequence U(CharSequence charSequence) {
        kotlin.s.c.l.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean t = t(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!t) {
                    break;
                }
                length--;
            } else if (t) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence V(CharSequence charSequence) {
        kotlin.s.c.l.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!t(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static String W(String str) {
        Comparable comparable;
        String str2;
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f("", "newIndent");
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str, "<this>");
        String[] strArr = {"\r\n", "\n", "\r"};
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(strArr, "delimiters");
        List h = kotlin.x.h.h(kotlin.x.h.f(y(str, strArr, 0, false, 0, 2), new m(str)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : h) {
            if (true ^ s((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g.e(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            int length = str3.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!t(str3.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str3.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        kotlin.s.c.l.f(arrayList2, "<this>");
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            comparable = (Comparable) it3.next();
            while (it3.hasNext()) {
                Comparable comparable2 = (Comparable) it3.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int size = (h.size() * 0) + str.length();
        j jVar = j.a;
        int w = kotlin.collections.g.w(h);
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj2 : h) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            String str4 = (String) obj2;
            if ((i2 == 0 || i2 == w) && s(str4)) {
                str2 = null;
            } else {
                kotlin.s.c.l.f(str4, "<this>");
                if (!(intValue >= 0)) {
                    throw new IllegalArgumentException(e.a.a.a.a.k("Requested character count ", intValue, " is less than zero.").toString());
                }
                int length2 = str4.length();
                if (intValue <= length2) {
                    length2 = intValue;
                }
                String substring = str4.substring(length2);
                kotlin.s.c.l.e(substring, "this as java.lang.String).substring(startIndex)");
                str2 = (String) jVar.invoke(substring);
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(size);
        kotlin.collections.g.B(arrayList3, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        kotlin.s.c.l.e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(Appendable appendable, T t, kotlin.s.b.l<? super T, ? extends CharSequence> lVar) {
        kotlin.s.c.l.f(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    public static final int b(int i) {
        if (new kotlin.w.d(2, 36).f(i)) {
            return i;
        }
        StringBuilder N = e.a.a.a.a.N("radix ", i, " was not in valid range ");
        N.append(new kotlin.w.d(2, 36));
        throw new IllegalArgumentException(N.toString());
    }

    public static boolean c(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (q(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (o(charSequence, charSequence2, 0, charSequence.length(), z, false, 16) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean d(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c(charSequence, charSequence2, z);
    }

    public static String e(String str, int i) {
        kotlin.s.c.l.f(str, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.k("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        kotlin.s.c.l.f(str, "<this>");
        if (!(length >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.k("Requested character count ", length, " is less than zero.").toString());
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        String substring = str.substring(0, length);
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean f(String str, String str2, boolean z) {
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str2, "suffix");
        return !z ? str.endsWith(str2) : z(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean g(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return f(str, str2, z);
    }

    public static final boolean h(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean i(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean j(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return i(str, str2, z);
    }

    public static CharCategory k(char c2) {
        CharCategory.a aVar = CharCategory.Companion;
        int type = Character.getType(c2);
        Objects.requireNonNull(aVar);
        if (new kotlin.w.d(0, 16).f(type)) {
            return CharCategory.values()[type];
        }
        if (new kotlin.w.d(18, 30).f(type)) {
            return CharCategory.values()[type - 1];
        }
        throw new IllegalArgumentException(e.a.a.a.a.k("Category #", type, " is not defined."));
    }

    public static final int l(CharSequence charSequence) {
        kotlin.s.c.l.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int m(CharSequence charSequence, String str, int i, boolean z) {
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(str, TypedValues.Custom.S_STRING);
        return (z || !(charSequence instanceof String)) ? o(charSequence, str, i, charSequence.length(), z, false, 16) : ((String) charSequence).indexOf(str, i);
    }

    private static final int n(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.w.b bVar;
        if (z2) {
            int l = l(charSequence);
            if (i > l) {
                i = l;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            bVar = new kotlin.w.b(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            bVar = new kotlin.w.d(i, i2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int a = bVar.a();
            int b = bVar.b();
            int c2 = bVar.c();
            if ((c2 > 0 && a <= b) || (c2 < 0 && b <= a)) {
                while (!z((String) charSequence2, 0, (String) charSequence, a, charSequence2.length(), z)) {
                    if (a != b) {
                        a += c2;
                    }
                }
                return a;
            }
        } else {
            int a2 = bVar.a();
            int b2 = bVar.b();
            int c3 = bVar.c();
            if ((c3 > 0 && a2 <= b2) || (c3 < 0 && b2 <= a2)) {
                while (!A(charSequence2, 0, charSequence, a2, charSequence2.length(), z)) {
                    if (a2 != b2) {
                        a2 += c3;
                    }
                }
                return a2;
            }
        }
        return -1;
    }

    static /* synthetic */ int o(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return n(charSequence, charSequence2, i, i2, z, z2);
    }

    public static int p(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        kotlin.s.c.l.f(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? r(charSequence, new char[]{c2}, i, z) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int q(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m(charSequence, str, i, z);
    }

    public static final int r(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.g.W(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        kotlin.collections.o it2 = new kotlin.w.d(i, l(charSequence)).iterator();
        while (((kotlin.w.c) it2).hasNext()) {
            int nextInt = it2.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                }
                if (h(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return nextInt;
            }
        }
        return -1;
    }

    public static boolean s(CharSequence charSequence) {
        boolean z;
        kotlin.s.c.l.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            kotlin.s.c.l.f(charSequence, "<this>");
            Iterable dVar = new kotlin.w.d(0, charSequence.length() - 1);
            if (!(dVar instanceof Collection) || !((Collection) dVar).isEmpty()) {
                Iterator<Integer> it2 = dVar.iterator();
                while (((kotlin.w.c) it2).hasNext()) {
                    if (!t(charSequence.charAt(((kotlin.collections.o) it2).nextInt()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static char u(CharSequence charSequence) {
        kotlin.s.c.l.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(l(charSequence));
    }

    public static int v(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = l(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        kotlin.s.c.l.f(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        char[] cArr = {c2};
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(cArr, "chars");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.g.W(cArr), i);
        }
        int l = l(charSequence);
        if (i > l) {
            i = l;
        }
        while (-1 < i) {
            char charAt = charSequence.charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    z2 = false;
                    break;
                }
                if (h(cArr[i3], charAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int w(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = l(charSequence);
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        kotlin.s.c.l.f(charSequence, "<this>");
        kotlin.s.c.l.f(str, TypedValues.Custom.S_STRING);
        return (z2 || !(charSequence instanceof String)) ? n(charSequence, str, i3, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    public static Character x(CharSequence charSequence) {
        kotlin.s.c.l.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    static kotlin.x.e y(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        G(i2);
        return new d(charSequence, i, i2, new l(kotlin.collections.g.d(strArr), z));
    }

    public static final boolean z(String str, int i, String str2, int i2, int i3, boolean z) {
        kotlin.s.c.l.f(str, "<this>");
        kotlin.s.c.l.f(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }
}
