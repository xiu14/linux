package org.threeten.bp;

import java.math.BigInteger;
import java.util.regex.Pattern;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* loaded from: classes2.dex */
public final class c implements Object, Comparable<c> {

    /* renamed from: c, reason: collision with root package name */
    public static final c f10773c = new c(0, 0);
    private final long a;
    private final int b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private c(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static c a(long j, int i) {
        return (((long) i) | j) == 0 ? f10773c : new c(j, i);
    }

    public static c c(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return a(j2, i);
    }

    public static c d(long j) {
        return a(j, 0);
    }

    public static c e(long j, long j2) {
        return a(org.apache.http.conn.ssl.d.m(j, org.apache.http.conn.ssl.d.d(j2, 1000000000L)), org.apache.http.conn.ssl.d.f(j2, 1000000000));
    }

    public long b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public int compareTo(c cVar) {
        c cVar2 = cVar;
        int b = org.apache.http.conn.ssl.d.b(this.a, cVar2.a);
        return b != 0 ? b : this.b - cVar2.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        if (this == f10773c) {
            return "PT0S";
        }
        long j = this.a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.b <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.b > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.b);
            } else {
                sb.append(this.b + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
