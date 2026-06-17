package com.xiaomi.push;

/* loaded from: classes2.dex */
public enum ii {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);


    /* renamed from: a, reason: collision with other field name */
    private final int f657a;

    ii(int i) {
        this.f657a = i;
    }

    public int a() {
        return this.f657a;
    }

    public static ii a(int i) {
        if (i == 0) {
            return RegIdExpired;
        }
        if (i == 1) {
            return PackageUnregistered;
        }
        if (i != 2) {
            return null;
        }
        return Init;
    }
}
