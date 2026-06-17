package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import java.io.IOException;
import okhttp3.A;
import okhttp3.v;

/* loaded from: classes.dex */
class b extends A {
    final /* synthetic */ v a;
    final /* synthetic */ com.bytedance.retrofit2.mime.i b;

    b(v vVar, com.bytedance.retrofit2.mime.i iVar) {
        this.a = vVar;
        this.b = iVar;
    }

    @Override // okhttp3.A
    public long a() {
        return this.b.length();
    }

    @Override // okhttp3.A
    public v b() {
        return this.a;
    }

    @Override // okhttp3.A
    public void e(f.f fVar) throws IOException {
        this.b.b(fVar.i0());
    }
}
