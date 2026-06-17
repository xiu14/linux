package com.bytedance.android.input.ttnet.g;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c implements com.bytedance.retrofit2.S.a {
    @Override // com.bytedance.retrofit2.S.a
    public N<?> a(a.InterfaceC0308a interfaceC0308a) {
        Request d2 = interfaceC0308a != null ? ((com.bytedance.retrofit2.S.b) interfaceC0308a).d() : null;
        if (d2 == null) {
            return null;
        }
        d2.isAddCommonParam();
        ArrayList arrayList = new ArrayList();
        if (IAppGlobals.a.h()) {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            arrayList.add(new com.bytedance.retrofit2.client.b("did", aVar.getDeviceId()));
            arrayList.add(new com.bytedance.retrofit2.client.b("ak", "ime-0.0.1.beta"));
        }
        Request.a newBuilder = d2.newBuilder();
        List<com.bytedance.retrofit2.client.b> headers = d2.getHeaders();
        l.e(headers, "request.headers");
        List<com.bytedance.retrofit2.client.b> k0 = g.k0(headers);
        ((ArrayList) k0).addAll(arrayList);
        newBuilder.b(k0);
        return ((com.bytedance.retrofit2.S.b) interfaceC0308a).b(newBuilder.a());
    }
}
