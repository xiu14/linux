package com.facebook.imagepipeline.common;

import e.c.c.d.h;

/* loaded from: classes2.dex */
public class e {
    public final int a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6462c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6463d;

    public e(int i, int i2) {
        h.a(i > 0);
        h.a(i2 > 0);
        this.a = i;
        this.b = i2;
        this.f6462c = 2048.0f;
        this.f6463d = 0.6666667f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public int hashCode() {
        return com.bytedance.feedbackerlib.a.P(this.a, this.b);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
