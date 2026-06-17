package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.impl.C0772l;

/* loaded from: classes2.dex */
class r implements y {
    final /* synthetic */ com.ttnet.org.chromium.net.G a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0772l.f f8752c;

    r(C0772l.f fVar, com.ttnet.org.chromium.net.G g2, String str) {
        this.f8752c = fVar;
        this.a = g2;
        this.b = str;
    }

    @Override // com.ttnet.org.chromium.net.impl.y
    public void run() throws Exception {
        C0772l.f fVar = this.f8752c;
        fVar.a.d(fVar.f8751d, this.a, this.b, "");
    }
}
