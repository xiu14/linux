package com.bytedance.monitor.collector;

import android.os.Message;

/* loaded from: classes.dex */
class f extends a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f5447d;

    f(e eVar) {
        this.f5447d = eVar;
    }

    @Override // com.bytedance.monitor.collector.a
    public void a(String str, Message message) {
        String str2;
        this.a = false;
        e.j(this.f5447d);
        e.i(this.f5447d, false, a.b);
        e eVar = this.f5447d;
        str2 = eVar.q;
        eVar.p = str2;
        this.f5447d.q = "no message running";
        this.f5447d.v = false;
    }

    @Override // com.bytedance.monitor.collector.a
    public void b(String str) {
        this.f5447d.v = true;
        this.f5447d.q = str;
        this.a = true;
        e.i(this.f5447d, true, a.b);
    }

    @Override // com.bytedance.monitor.collector.a
    public boolean c() {
        return true;
    }
}
