package com.bytedance.crash.resource.i;

import com.bytedance.crash.N.f;
import java.io.File;

/* loaded from: classes.dex */
public class b {
    private static final b i = new b();
    private File h = f.b();
    private File a = new File(this.h, "xasanReport");
    private File b = new File(this.h, "NativeHeapReport");

    /* renamed from: c, reason: collision with root package name */
    private File f4678c = new File(this.h, "VmMonitor");

    /* renamed from: d, reason: collision with root package name */
    private File f4679d = new File(this.h, "FdTrack");

    /* renamed from: e, reason: collision with root package name */
    private File f4680e = new File(this.h, "RefMonitor");

    /* renamed from: f, reason: collision with root package name */
    private File f4681f = new File(this.h, "TLSMonitor");

    /* renamed from: g, reason: collision with root package name */
    private File f4682g = new File(this.h, "PriorityMonitor");

    private b() {
    }

    public static File a() {
        return i.f4679d;
    }

    public static File b() {
        return i.a;
    }

    public static File c() {
        return i.b;
    }

    public static File d() {
        return i.f4682g;
    }

    public static File e() {
        return i.f4680e;
    }

    public static File f() {
        return i.f4681f;
    }

    public static File g() {
        return i.f4678c;
    }
}
