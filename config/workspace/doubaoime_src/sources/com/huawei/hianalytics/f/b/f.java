package com.huawei.hianalytics.f.b;

import com.huawei.hianalytics.f.g.j;

/* loaded from: classes2.dex */
public class f implements d {
    private c a;

    public f(c cVar) {
        this.a = cVar;
    }

    @Override // com.huawei.hianalytics.f.b.d
    public a a() {
        a aVar = new a();
        aVar.d(this.a.f());
        aVar.f(this.a.h());
        aVar.c(this.a.e());
        aVar.e(this.a.g());
        aVar.g(this.a.j());
        aVar.b(this.a.d());
        aVar.a(this.a.c());
        return aVar;
    }

    @Override // com.huawei.hianalytics.f.b.d
    public boolean a(long j, long j2) {
        return j.a(this.a.e(), j, j2);
    }
}
