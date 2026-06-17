package com.facebook.imagepipeline.common;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f6464c = new f(-1, false);

    /* renamed from: d, reason: collision with root package name */
    private static final f f6465d = new f(-2, false);

    /* renamed from: e, reason: collision with root package name */
    private static final f f6466e = new f(-1, true);
    private final int a;
    private final boolean b;

    private f(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static f a() {
        return f6464c;
    }

    public static f b() {
        return f6466e;
    }

    public static f d() {
        return f6465d;
    }

    public boolean c() {
        return this.b;
    }

    public int e() {
        if (g()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b;
    }

    public boolean f() {
        return this.a != -2;
    }

    public boolean g() {
        return this.a == -1;
    }

    public int hashCode() {
        Integer valueOf = Integer.valueOf(this.a);
        Boolean valueOf2 = Boolean.valueOf(this.b);
        return com.bytedance.feedbackerlib.a.P(valueOf == null ? 0 : valueOf.hashCode(), valueOf2 != null ? valueOf2.hashCode() : 0);
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
