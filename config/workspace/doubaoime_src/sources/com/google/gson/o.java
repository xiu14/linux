package com.google.gson;

import com.google.gson.internal.u;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o extends i {
    private final Object a;

    public o(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    private static boolean j(o oVar) {
        Object obj = oVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.i
    public String c() {
        Object obj = this.a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return h().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        StringBuilder M = e.a.a.a.a.M("Unexpected value type: ");
        M.append(this.a.getClass());
        throw new AssertionError(M.toString());
    }

    public boolean d() {
        Object obj = this.a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(c());
    }

    public double e() {
        return this.a instanceof Number ? h().doubleValue() : Double.parseDouble(c());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.a == null) {
            return oVar.a == null;
        }
        if (j(this) && j(oVar)) {
            return h().longValue() == oVar.h().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(oVar.a instanceof Number)) {
            return obj2.equals(oVar.a);
        }
        double doubleValue = h().doubleValue();
        double doubleValue2 = oVar.h().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int f() {
        return this.a instanceof Number ? h().intValue() : Integer.parseInt(c());
    }

    public long g() {
        return this.a instanceof Number ? h().longValue() : Long.parseLong(c());
    }

    public Number h() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new u((String) this.a);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (j(this)) {
            doubleToLongBits = h().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(h().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean i() {
        return this.a instanceof Boolean;
    }

    public boolean k() {
        return this.a instanceof Number;
    }

    public boolean l() {
        return this.a instanceof String;
    }

    public o(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public o(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
