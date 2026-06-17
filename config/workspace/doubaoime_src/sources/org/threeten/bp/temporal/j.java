package org.threeten.bp.temporal;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class j implements Serializable {
    private final long a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10864c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10865d;

    private j(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.f10864c = j3;
        this.f10865d = j4;
    }

    public static j g(long j, long j2) {
        if (j <= j2) {
            return new j(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static j h(long j, long j2, long j3) {
        return i(j, j, j2, j3);
    }

    public static j i(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 <= j4) {
            return new j(j, j2, j3, j4);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public int a(long j, e eVar) {
        if (((this.a > (-2147483648L) ? 1 : (this.a == (-2147483648L) ? 0 : -1)) >= 0 && (this.f10865d > 2147483647L ? 1 : (this.f10865d == 2147483647L ? 0 : -1)) <= 0) && f(j)) {
            return (int) j;
        }
        throw new org.threeten.bp.b("Invalid int value for " + eVar + ": " + j);
    }

    public long b(long j, e eVar) {
        if (f(j)) {
            return j;
        }
        if (eVar == null) {
            throw new org.threeten.bp.b("Invalid value (valid values " + this + "): " + j);
        }
        throw new org.threeten.bp.b("Invalid value for " + eVar + " (valid values " + this + "): " + j);
    }

    public long c() {
        return this.f10865d;
    }

    public long d() {
        return this.a;
    }

    public boolean e() {
        return this.a == this.b && this.f10864c == this.f10865d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.f10864c == jVar.f10864c && this.f10865d == jVar.f10865d;
    }

    public boolean f(long j) {
        return j >= this.a && j <= this.f10865d;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = (j + j2) << ((int) (j2 + 16));
        long j4 = this.f10864c;
        long j5 = (j3 >> ((int) (j4 + 48))) << ((int) (j4 + 32));
        long j6 = this.f10865d;
        long j7 = ((j5 >> ((int) (32 + j6))) << ((int) (j6 + 48))) >> 16;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.a != this.b) {
            sb.append('/');
            sb.append(this.b);
        }
        sb.append(" - ");
        sb.append(this.f10864c);
        if (this.f10864c != this.f10865d) {
            sb.append('/');
            sb.append(this.f10865d);
        }
        return sb.toString();
    }
}
