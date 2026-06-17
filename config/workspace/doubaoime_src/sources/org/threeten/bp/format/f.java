package org.threeten.bp.format;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f10835e = new f('0', '+', '-', '.');
    private final char a;
    private final char b;

    /* renamed from: c, reason: collision with root package name */
    private final char f10836c;

    /* renamed from: d, reason: collision with root package name */
    private final char f10837d;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private f(char c2, char c3, char c4, char c5) {
        this.a = c2;
        this.b = c3;
        this.f10836c = c4;
        this.f10837d = c5;
    }

    String a(String str) {
        char c2 = this.a;
        if (c2 == '0') {
            return str;
        }
        int i = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    public char b() {
        return this.f10837d;
    }

    public char c() {
        return this.f10836c;
    }

    public char d() {
        return this.b;
    }

    public char e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.f10836c == fVar.f10836c && this.f10837d == fVar.f10837d;
    }

    public int hashCode() {
        return this.a + this.b + this.f10836c + this.f10837d;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DecimalStyle[");
        M.append(this.a);
        M.append(this.b);
        M.append(this.f10836c);
        M.append(this.f10837d);
        M.append("]");
        return M.toString();
    }
}
