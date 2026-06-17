package bytekn.foundation.encryption.f;

import kotlin.l;

/* loaded from: classes.dex */
public final class a {
    private static final String a;
    public static final a b = new a();

    static {
        if ("0123456789ABCDEF" == 0) {
            throw new l("null cannot be cast to non-null type java.lang.String");
        }
        kotlin.s.c.l.b("0123456789ABCDEF".toUpperCase(), "(this as java.lang.String).toUpperCase()");
        if ("0123456789ABCDEF" == 0) {
            throw new l("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = "0123456789ABCDEF".toLowerCase();
        kotlin.s.c.l.b(lowerCase, "(this as java.lang.String).toLowerCase()");
        a = lowerCase;
    }

    private a() {
    }

    public final String a(byte[] bArr) {
        kotlin.s.c.l.g(bArr, "src");
        String str = a;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append(str.charAt((i >>> 4) & 15));
            sb.append(str.charAt((i >>> 0) & 15));
        }
        String sb2 = sb.toString();
        kotlin.s.c.l.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
