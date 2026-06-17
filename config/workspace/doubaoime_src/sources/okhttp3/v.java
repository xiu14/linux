package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f10720e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f10721f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private final String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10722c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10723d;

    private v(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.f10722c = str3;
        this.f10723d = str4;
    }

    public static v c(String str) {
        Matcher matcher = f10720e.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        String str2 = null;
        Matcher matcher2 = f10721f.matcher(str);
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder M = e.a.a.a.a.M("Parameter is not formatted correctly: \"");
                M.append(str.substring(end));
                M.append("\" for: \"");
                M.append(str);
                M.append('\"');
                throw new IllegalArgumentException(M.toString());
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException(e.a.a.a.a.G(e.a.a.a.a.W("Multiple charsets defined: \"", str2, "\" and: \"", group3, "\" for: \""), str, '\"'));
                }
                str2 = group3;
            }
        }
        return new v(str, lowerCase, lowerCase2, str2);
    }

    public static v d(String str) {
        try {
            return c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public Charset a() {
        try {
            String str = this.f10723d;
            if (str != null) {
                return Charset.forName(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public Charset b(Charset charset) {
        try {
            String str = this.f10723d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public String e() {
        return this.f10722c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && ((v) obj).a.equals(this.a);
    }

    public String f() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
