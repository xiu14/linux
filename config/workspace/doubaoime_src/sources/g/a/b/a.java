package g.a.b;

import java.io.Serializable;
import java.util.Locale;
import org.apache.http.conn.ssl.d;

/* loaded from: classes2.dex */
public final class a implements Cloneable, Serializable {
    protected final String a;
    protected final String b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f10073c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f10074d;

    public a(String str, int i, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Host name may not be null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Host name may not be empty");
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                break;
            }
            if (Character.isWhitespace(str.charAt(i2))) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalArgumentException("Host name may not contain blanks");
        }
        this.a = str;
        Locale locale = Locale.ROOT;
        this.b = str.toLowerCase(locale);
        if (str2 != null) {
            this.f10074d = str2.toLowerCase(locale);
        } else {
            this.f10074d = "http";
        }
        this.f10073c = i;
    }

    public String a() {
        return this.a;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b.equals(aVar.b) && this.f10073c == aVar.f10073c && this.f10074d.equals(aVar.f10074d);
    }

    public int hashCode() {
        return d.i((d.i(17, this.b) * 37) + this.f10073c, this.f10074d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10074d);
        sb.append("://");
        sb.append(this.a);
        if (this.f10073c != -1) {
            sb.append(':');
            sb.append(Integer.toString(this.f10073c));
        }
        return sb.toString();
    }
}
