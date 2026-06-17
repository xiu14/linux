package okhttp3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t {
    private static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10710c;

    /* renamed from: d, reason: collision with root package name */
    final String f10711d;

    /* renamed from: e, reason: collision with root package name */
    final int f10712e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f10713f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10714g;
    private final String h;

    public static final class a {
        String a;

        /* renamed from: d, reason: collision with root package name */
        String f10716d;

        /* renamed from: f, reason: collision with root package name */
        final List<String> f10718f;

        /* renamed from: g, reason: collision with root package name */
        List<String> f10719g;
        String h;
        String b = "";

        /* renamed from: c, reason: collision with root package name */
        String f10715c = "";

        /* renamed from: e, reason: collision with root package name */
        int f10717e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f10718f = arrayList;
            arrayList.add("");
        }

        public a a(String str, String str2) {
            if (this.f10719g == null) {
                this.f10719g = new ArrayList();
            }
            this.f10719g.add(t.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.f10719g.add(str2 != null ? t.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        public t b() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f10716d != null) {
                return new t(this);
            }
            throw new IllegalStateException("host == null");
        }

        public a c(String str) {
            this.f10719g = str != null ? t.v(t.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:182:0x0231, code lost:
        
            if (r1 <= 65535) goto L130;
         */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02c2  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        okhttp3.t.a d(okhttp3.t r23, java.lang.String r24) {
            /*
                Method dump skipped, instructions count: 996
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.t.a.d(okhttp3.t, java.lang.String):okhttp3.t$a");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.b.isEmpty() || !this.f10715c.isEmpty()) {
                sb.append(this.b);
                if (!this.f10715c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f10715c);
                }
                sb.append('@');
            }
            String str2 = this.f10716d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f10716d);
                    sb.append(']');
                } else {
                    sb.append(this.f10716d);
                }
            }
            int i = this.f10717e;
            if (i != -1 || this.a != null) {
                if (i == -1) {
                    i = t.d(this.a);
                }
                String str3 = this.a;
                if (str3 == null || i != t.d(str3)) {
                    sb.append(':');
                    sb.append(i);
                }
            }
            List<String> list = this.f10718f;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
            if (this.f10719g != null) {
                sb.append('?');
                t.m(sb, this.f10719g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    t(a aVar) {
        this.a = aVar.a;
        this.b = q(aVar.b, false);
        this.f10710c = q(aVar.f10715c, false);
        this.f10711d = aVar.f10716d;
        int i2 = aVar.f10717e;
        this.f10712e = i2 == -1 ? d(aVar.a) : i2;
        r(aVar.f10718f, false);
        List<String> list = aVar.f10719g;
        this.f10713f = list != null ? r(list, true) : null;
        String str = aVar.h;
        this.f10714g = str != null ? p(str, 0, str.length(), false) : null;
        this.h = aVar.toString();
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            int i5 = -1;
            int i6 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !s(str, i4, i3)))) || (codePointAt == 43 && z3)))) {
                f.e eVar = new f.e();
                eVar.l0(str, i2, i4);
                f.e eVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            eVar.j0(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i6 && z4) || str2.indexOf(codePointAt2) != i5 || (codePointAt2 == 37 && (!z || (z2 && !s(str, i4, i3)))))) {
                            if (eVar2 == null) {
                                eVar2 = new f.e();
                            }
                            if (charset == null || charset.equals(okhttp3.F.c.i)) {
                                eVar2.n0(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i4;
                                kotlin.s.c.l.g(str, TypedValues.Custom.S_STRING);
                                kotlin.s.c.l.g(charset, "charset");
                                if (!(i4 >= 0)) {
                                    throw new IllegalArgumentException(e.a.a.a.a.j("beginIndex < 0: ", i4).toString());
                                }
                                if (!(charCount >= i4)) {
                                    throw new IllegalArgumentException(e.a.a.a.a.l("endIndex < beginIndex: ", charCount, " < ", i4).toString());
                                }
                                if (!(charCount <= str.length())) {
                                    StringBuilder N = e.a.a.a.a.N("endIndex > string.length: ", charCount, " > ");
                                    N.append(str.length());
                                    throw new IllegalArgumentException(N.toString().toString());
                                }
                                if (kotlin.s.c.l.a(charset, kotlin.text.c.a)) {
                                    eVar2.l0(str, i4, charCount);
                                } else {
                                    String substring = str.substring(i4, charCount);
                                    kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    byte[] bytes = substring.getBytes(charset);
                                    kotlin.s.c.l.b(bytes, "(this as java.lang.String).getBytes(charset)");
                                    eVar2.Q(bytes, 0, bytes.length);
                                }
                            }
                            while (!eVar2.v()) {
                                int readByte = eVar2.readByte() & 255;
                                eVar.U(37);
                                char[] cArr = i;
                                eVar.U(cArr[(readByte >> 4) & 15]);
                                eVar.U(cArr[readByte & 15]);
                            }
                        } else {
                            eVar.n0(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = -1;
                    i6 = 128;
                }
                return eVar.A();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str.substring(i2, i3);
    }

    static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    static String c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static t j(String str) {
        a aVar = new a();
        aVar.d(null, str);
        return aVar.b();
    }

    static void m(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static t o(String str) {
        try {
            return j(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static String p(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                f.e eVar = new f.e();
                eVar.l0(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            eVar.U(32);
                        }
                        eVar.n0(codePointAt);
                    } else {
                        int i6 = okhttp3.F.c.i(str.charAt(i5 + 1));
                        int i7 = okhttp3.F.c.i(str.charAt(i4));
                        if (i6 != -1 && i7 != -1) {
                            eVar.U((i6 << 4) + i7);
                            i5 = i4;
                        }
                        eVar.n0(codePointAt);
                    }
                    i5 += Character.charCount(codePointAt);
                }
                return eVar.A();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    static String q(String str, boolean z) {
        return p(str, 0, str.length(), z);
    }

    private List<String> r(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? p(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static boolean s(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && okhttp3.F.c.i(str.charAt(i2 + 1)) != -1 && okhttp3.F.c.i(str.charAt(i4)) != -1;
    }

    static List<String> v(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public URL A() {
        try {
            return new URL(this.h);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String e() {
        if (this.f10710c.isEmpty()) {
            return "";
        }
        return this.h.substring(this.h.indexOf(58, this.a.length() + 3) + 1, this.h.indexOf(64));
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && ((t) obj).h.equals(this.h);
    }

    public String f() {
        int indexOf = this.h.indexOf(47, this.a.length() + 3);
        String str = this.h;
        return this.h.substring(indexOf, okhttp3.F.c.l(str, indexOf, str.length(), "?#"));
    }

    public List<String> g() {
        int indexOf = this.h.indexOf(47, this.a.length() + 3);
        String str = this.h;
        int l = okhttp3.F.c.l(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < l) {
            int i2 = indexOf + 1;
            int k = okhttp3.F.c.k(this.h, i2, l, '/');
            arrayList.add(this.h.substring(i2, k));
            indexOf = k;
        }
        return arrayList;
    }

    public String h() {
        if (this.f10713f == null) {
            return null;
        }
        int indexOf = this.h.indexOf(63) + 1;
        String str = this.h;
        return this.h.substring(indexOf, okhttp3.F.c.k(str, indexOf, str.length(), '#'));
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    public String i() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return this.h.substring(length, okhttp3.F.c.l(str, length, str.length(), ":@"));
    }

    public String k() {
        return this.f10711d;
    }

    public boolean l() {
        return this.a.equals("https");
    }

    public a n() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = i();
        aVar.f10715c = e();
        aVar.f10716d = this.f10711d;
        aVar.f10717e = this.f10712e != d(this.a) ? this.f10712e : -1;
        aVar.f10718f.clear();
        aVar.f10718f.addAll(g());
        aVar.c(h());
        aVar.h = this.f10714g == null ? null : this.h.substring(this.h.indexOf(35) + 1);
        return aVar;
    }

    public int t() {
        return this.f10712e;
    }

    public String toString() {
        return this.h;
    }

    public String u() {
        if (this.f10713f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m(sb, this.f10713f);
        return sb.toString();
    }

    public String w() {
        a aVar;
        try {
            aVar = new a();
            aVar.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        Objects.requireNonNull(aVar);
        aVar.b = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        aVar.f10715c = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return aVar.b().h;
    }

    public t x(String str) {
        a aVar;
        try {
            aVar = new a();
            aVar.d(this, str);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public String y() {
        return this.a;
    }

    public URI z() {
        a n = n();
        int size = n.f10718f.size();
        for (int i2 = 0; i2 < size; i2++) {
            n.f10718f.set(i2, b(n.f10718f.get(i2), "[]", true, true, false, true));
        }
        List<String> list = n.f10719g;
        if (list != null) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = n.f10719g.get(i3);
                if (str != null) {
                    n.f10719g.set(i3, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = n.h;
        if (str2 != null) {
            n.h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar = n.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }
}
