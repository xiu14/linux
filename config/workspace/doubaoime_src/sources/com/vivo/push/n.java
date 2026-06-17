package com.vivo.push;

import com.vivo.push.m;

/* loaded from: classes2.dex */
final class n implements IPushActionListener {
    final /* synthetic */ m.a a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f8855c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f8856d;

    n(m mVar, m.a aVar, String str, String str2) {
        this.f8856d = mVar;
        this.a = aVar;
        this.b = str;
        this.f8855c = str2;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i != 0) {
            com.vivo.push.restructure.a.a().h().a("");
            return;
        }
        Object[] b = this.a.b();
        if (b == null || b.length == 0) {
            com.vivo.push.util.t.a("PushClientManager", "bind app result is null");
        } else {
            com.vivo.push.restructure.a.a().h().a((String) this.a.b()[0], this.b, this.f8855c);
        }
    }
}
