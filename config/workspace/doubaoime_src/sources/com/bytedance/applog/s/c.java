package com.bytedance.applog.s;

import java.util.Objects;

/* loaded from: classes.dex */
class c implements com.bytedance.applog.z.b {
    final /* synthetic */ d a;

    c(d dVar) {
        this.a = dVar;
    }

    @Override // com.bytedance.applog.z.b
    public String a() {
        com.bytedance.applog.q.c cVar;
        cVar = this.a.b;
        Objects.requireNonNull(cVar.h());
        return null;
    }

    @Override // com.bytedance.applog.z.b
    public String b() {
        com.bytedance.applog.q.c cVar;
        cVar = this.a.b;
        return cVar.h().r();
    }

    @Override // com.bytedance.applog.z.b
    public String c() {
        com.bytedance.applog.q.c cVar;
        com.bytedance.applog.q.c cVar2;
        com.bytedance.applog.q.c cVar3;
        cVar = this.a.b;
        Objects.requireNonNull(cVar.h());
        cVar2 = this.a.b;
        if (cVar2.q().h() <= 0) {
            return null;
        }
        cVar3 = this.a.b;
        return String.valueOf(cVar3.q().h());
    }

    @Override // com.bytedance.applog.z.b
    public String d() {
        com.bytedance.applog.q.c cVar;
        cVar = this.a.b;
        return cVar.h().k();
    }
}
