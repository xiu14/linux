package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class i implements Serializable {
    private final Pattern a;

    public i(String str) {
        kotlin.s.c.l.f(str, "pattern");
        Pattern compile = Pattern.compile(str);
        kotlin.s.c.l.e(compile, "compile(pattern)");
        kotlin.s.c.l.f(compile, "nativePattern");
        this.a = compile;
    }

    public static kotlin.x.e c(i iVar, CharSequence charSequence, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        kotlin.s.c.l.f(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return kotlin.x.h.e(new g(iVar, charSequence, i), h.a);
        }
        StringBuilder N = e.a.a.a.a.N("Start index out of bounds: ", i, ", input length: ");
        N.append(charSequence.length());
        throw new IndexOutOfBoundsException(N.toString());
    }

    public final boolean a(CharSequence charSequence) {
        kotlin.s.c.l.f(charSequence, "input");
        return this.a.matcher(charSequence).find();
    }

    public final e b(CharSequence charSequence, int i) {
        kotlin.s.c.l.f(charSequence, "input");
        Matcher matcher = this.a.matcher(charSequence);
        kotlin.s.c.l.e(matcher, "nativePattern.matcher(input)");
        if (matcher.find(i)) {
            return new f(matcher, charSequence);
        }
        return null;
    }

    public final boolean d(CharSequence charSequence) {
        kotlin.s.c.l.f(charSequence, "input");
        return this.a.matcher(charSequence).matches();
    }

    public final String e(CharSequence charSequence, String str) {
        kotlin.s.c.l.f(charSequence, "input");
        kotlin.s.c.l.f(str, "replacement");
        String replaceAll = this.a.matcher(charSequence).replaceAll(str);
        kotlin.s.c.l.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> f(CharSequence charSequence, int i) {
        kotlin.s.c.l.f(charSequence, "input");
        a.G(i);
        Matcher matcher = this.a.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return kotlin.collections.g.F(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if (i4 >= 0 && arrayList.size() == i4) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.a.toString();
        kotlin.s.c.l.e(pattern, "nativePattern.toString()");
        return pattern;
    }
}
