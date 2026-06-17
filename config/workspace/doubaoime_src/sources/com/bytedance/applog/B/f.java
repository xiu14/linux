package com.bytedance.applog.B;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class f extends e {
    public f(String str, String str2) {
        super(str, str2);
    }

    public static a F(e eVar) {
        f fVar = new f(eVar.m, eVar.y);
        fVar.z = eVar.z;
        fVar.w = eVar.w;
        fVar.u(eVar.b);
        fVar.h = eVar.h;
        fVar.f3731c = eVar.f3731c;
        fVar.n = eVar.n;
        fVar.i = eVar.i;
        fVar.f3732d = eVar.f3732d;
        fVar.f3734f = eVar.f3734f;
        fVar.f3733e = eVar.f3733e;
        fVar.f3735g = eVar.f3735g;
        fVar.l = eVar.l;
        fVar.k = eVar.k;
        fVar.j = eVar.j;
        fVar.x = eVar.x;
        fVar.p = 1;
        fVar.r = eVar.r;
        fVar.s = eVar.s;
        return fVar;
    }

    @Override // com.bytedance.applog.B.e
    public void E(com.bytedance.applog.y.a aVar) {
    }

    @Override // com.bytedance.applog.B.e, com.bytedance.applog.B.a
    @NonNull
    String n() {
        return "forward_eventv3";
    }

    public f() {
        super(null, null);
    }
}
