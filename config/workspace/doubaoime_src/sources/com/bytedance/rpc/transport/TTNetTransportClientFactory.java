package com.bytedance.rpc.transport;

import androidx.annotation.NonNull;
import e.b.l.f;

/* loaded from: classes2.dex */
public class TTNetTransportClientFactory implements d {

    class a implements f.c {
        a(TTNetTransportClientFactory tTNetTransportClientFactory) {
        }

        @Override // e.b.l.f.c
        public void a(Throwable th, f.b bVar) {
            if (th instanceof com.bytedance.frameworks.baselib.network.http.l.c) {
                com.bytedance.frameworks.baselib.network.http.l.c cVar = (com.bytedance.frameworks.baselib.network.http.l.c) th;
                bVar.d(true);
                bVar.e(cVar.c(), cVar.getMessage());
            }
        }
    }

    public TTNetTransportClientFactory() {
        e.b.l.f.n(new a(this));
    }

    @Override // com.bytedance.rpc.transport.d
    public c a(@NonNull e.b.l.d dVar, boolean z) {
        return new com.bytedance.rpc.transport.ttnet.a();
    }
}
