package com.huawei.b;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b {
    public static final b b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f6949c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f6950d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f6951e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f6952f = new b(4);
    private final int a;

    private b(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b.class == obj.getClass() && this.a == ((b) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }
}
