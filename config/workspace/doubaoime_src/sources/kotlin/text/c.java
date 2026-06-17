package kotlin.text;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class c {
    public static final Charset a;
    public static final Charset b;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.s.c.l.e(forName, "forName(\"UTF-8\")");
        a = forName;
        kotlin.s.c.l.e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        kotlin.s.c.l.e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        kotlin.s.c.l.e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Charset forName2 = Charset.forName("US-ASCII");
        kotlin.s.c.l.e(forName2, "forName(\"US-ASCII\")");
        b = forName2;
        kotlin.s.c.l.e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
