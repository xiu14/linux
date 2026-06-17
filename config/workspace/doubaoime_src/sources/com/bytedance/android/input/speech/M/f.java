package com.bytedance.android.input.speech.M;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class f implements d.a.c.a {
    @Override // d.a.c.a
    public void a(String str, String str2, Throwable th) {
        l.f(str, "tag");
        l.f(str2, "message");
        l.f(th, "exception");
        com.bytedance.android.input.r.j.k("Effect-PlatformLogger", str + "- " + str2, th);
    }

    @Override // d.a.c.a
    public void b(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "message");
        com.bytedance.android.input.r.j.j("Effect-PlatformLogger", str + "- " + str2);
    }

    @Override // d.a.c.a
    public boolean c() {
        return false;
    }

    @Override // d.a.c.a
    public void d(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "message");
        com.bytedance.android.input.r.j.r("Effect-PlatformLogger", str + "- " + str2);
    }

    @Override // d.a.c.a
    public void e(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "message");
        com.bytedance.android.input.r.j.i("Effect-PlatformLogger", str + "- " + str2);
    }
}
