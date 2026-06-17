package com.bytedance.android.input.basic.network;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.network.api.TTNetContextService;
import com.bytedance.android.input.basic.network.c.d;
import com.bytedance.rpc.log.LogLevel;
import com.bytedance.rpc.log.b;
import com.bytedance.rpc.serialize.JsonSerializeFactory;
import com.bytedance.rpc.transport.h;
import com.bytedance.rpc.transport.k;
import e.b.l.c;
import e.b.l.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.s.c.A;

/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    static {
        String str;
        HashMap<String, Object> commonHeaders;
        LogLevel logLevel = LogLevel.NONE;
        int i = o.f9647d;
        b.g(logLevel);
        c.b e2 = o.e();
        TTNetContextService tTNetContextService = (TTNetContextService) com.bytedance.feedbackerlib.a.S(A.b(TTNetContextService.class));
        if (tTNetContextService == null || (str = tTNetContextService.getApiUrl()) == null) {
            str = "";
        }
        e2.j(str);
        NetHostParamService netHostParamService = (NetHostParamService) com.bytedance.feedbackerlib.a.S(A.b(NetHostParamService.class));
        if (netHostParamService != null && (commonHeaders = netHostParamService.getCommonHeaders()) != null) {
            for (Map.Entry<String, Object> entry : commonHeaders.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                e2.h(key, value != null ? value.toString() : null);
            }
        }
        o.i(IAppGlobals.a.getApplication(), e2.i(new c[0]));
        JsonSerializeFactory.a aVar = new JsonSerializeFactory.a();
        aVar.b(new com.bytedance.android.input.basic.network.gson.a());
        o.j(aVar.a());
        o.d(new com.bytedance.android.input.basic.network.c.b());
        o.b(new d());
        NetInterceptorService netInterceptorService = (NetInterceptorService) com.bytedance.feedbackerlib.a.S(A.b(NetInterceptorService.class));
        if (netInterceptorService != null) {
            List<e.b.l.p.c> rpcInvokeInterceptors = netInterceptorService.getRpcInvokeInterceptors();
            if (rpcInvokeInterceptors != null) {
                Iterator<T> it2 = rpcInvokeInterceptors.iterator();
                while (it2.hasNext()) {
                    o.b((e.b.l.p.c) it2.next());
                }
            }
            List<e.b.l.p.b> rpcInterceptors = netInterceptorService.getRpcInterceptors();
            if (rpcInterceptors != null) {
                Iterator<T> it3 = rpcInterceptors.iterator();
                while (it3.hasNext()) {
                    o.a((e.b.l.p.b) it3.next(), new Class[0]);
                }
            }
            List<h> transportReqInterceptors = netInterceptorService.getTransportReqInterceptors();
            if (transportReqInterceptors != null) {
                Iterator<T> it4 = transportReqInterceptors.iterator();
                while (it4.hasNext()) {
                    o.c((h) it4.next());
                }
            }
            List<k> transportResultInterceptors = netInterceptorService.getTransportResultInterceptors();
            if (transportResultInterceptors != null) {
                Iterator<T> it5 = transportResultInterceptors.iterator();
                while (it5.hasNext()) {
                    o.d((k) it5.next());
                }
            }
        }
    }

    private a() {
    }
}
