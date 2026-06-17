package com.bytedance.bdinstall;

import android.app.Application;

/* renamed from: com.bytedance.bdinstall.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629i {
    private static final com.bytedance.bdinstall.f0.a a = new com.bytedance.bdinstall.f0.a();
    private static InterfaceC0645z b = new C0632l();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4007c = 0;

    public static void a(boolean z, E e2) {
        ((C0632l) b).a(z, e2);
    }

    public static com.bytedance.bdinstall.j0.a b() {
        return ((C0632l) b).e();
    }

    public static com.bytedance.bdinstall.f0.a c() {
        return a;
    }

    public static C0630j d() {
        return ((C0632l) b).g();
    }

    public static InterfaceC0645z e() {
        return b;
    }

    public static boolean f(InterfaceC0645z interfaceC0645z) {
        return interfaceC0645z == b;
    }

    static void g(Application application) {
        application.registerActivityLifecycleCallbacks(a);
    }

    public static void h(E e2) {
        ((C0632l) b).j.d(e2);
    }
}
