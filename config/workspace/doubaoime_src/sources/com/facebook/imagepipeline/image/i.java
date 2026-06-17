package com.facebook.imagepipeline.image;

/* loaded from: classes2.dex */
public class i implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f6481d = new i(Integer.MAX_VALUE, true, true);
    int a;
    boolean b;

    /* renamed from: c, reason: collision with root package name */
    boolean f6482c;

    private i(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.f6482c = z2;
    }

    public static k d(int i, boolean z, boolean z2) {
        return new i(i, z, z2);
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.f6482c;
    }

    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b && this.f6482c == iVar.f6482c;
    }

    public int hashCode() {
        return (this.a ^ (this.b ? 4194304 : 0)) ^ (this.f6482c ? 8388608 : 0);
    }
}
