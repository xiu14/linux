package com.bytedance.rpc.transport;

import e.b.l.l;

/* loaded from: classes2.dex */
public class f {
    private final Object a = new Byte[0];
    private e.b.l.d b;

    /* renamed from: c, reason: collision with root package name */
    private d f6058c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f6059d;

    public f(e.b.l.d dVar) {
        this.b = dVar;
        Object e2 = e.b.l.q.e.e("com.bytedance.rpc.transport.TTNetTransportClientFactory");
        this.f6058c = e2 instanceof d ? (d) e2 : null;
    }

    public c a(l lVar) {
        d dVar;
        if (this.f6059d == null) {
            synchronized (this.a) {
                if (this.f6059d == null && (dVar = this.f6058c) != null) {
                    this.f6059d = dVar.a(this.b, false);
                }
            }
        }
        c cVar = this.f6059d;
        if (cVar != null) {
            return cVar;
        }
        throw new RuntimeException("transport client should not null , check your TransportFactory again.");
    }
}
