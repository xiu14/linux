package com.facebook.imagepipeline.common;

/* loaded from: classes2.dex */
public class a {
    public final int a;
    public final int b;

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public int hashCode() {
        return com.bytedance.feedbackerlib.a.P(this.a, this.b);
    }

    public String toString() {
        Object[] objArr = new Object[2];
        int i = this.a;
        objArr[0] = i == Integer.MAX_VALUE ? "" : Integer.toString(i);
        int i2 = this.b;
        objArr[1] = i2 != Integer.MAX_VALUE ? Integer.toString(i2) : "";
        return String.format(null, "%s-%s", objArr);
    }
}
