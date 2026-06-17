package com.bytedance.crash.dumper.j;

import com.bytedance.crash.jni.NativeBridge;

/* loaded from: classes.dex */
abstract class a {
    d a;

    a() {
    }

    abstract void a(char c2);

    abstract void b(int i);

    abstract void c(long j);

    abstract void d(String str);

    abstract void e(char[] cArr);

    d f(String str, int i) {
        long Z = NativeBridge.Z(str, i);
        g gVar = Z != 0 ? new g(Z) : null;
        return gVar != null ? gVar : e.e(str);
    }

    abstract void g();
}
