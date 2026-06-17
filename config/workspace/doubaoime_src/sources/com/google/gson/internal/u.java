package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class u extends Number {
    private final String a;

    public u(String str) {
        this.a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        String str = this.a;
        String str2 = ((u) obj).a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.a).longValue();
        }
    }

    public String toString() {
        return this.a;
    }
}
