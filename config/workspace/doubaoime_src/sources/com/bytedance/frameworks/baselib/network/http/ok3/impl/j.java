package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import com.vivo.push.PushClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.u;

/* loaded from: classes.dex */
public class j implements u {
    @Override // okhttp3.u
    public B a(u.a aVar) throws IOException {
        okhttp3.F.f.f fVar = (okhttp3.F.f.f) aVar;
        Request i = fVar.i();
        boolean equals = (i == null || i.headers() == null || i.headers().d(com.bytedance.retrofit2.client.Request.KEY_BYPASS_TTNET_FEATURES) == null) ? false : PushClient.DEFAULT_REQUEST_ID.equals(i.headers().d(com.bytedance.retrofit2.client.Request.KEY_BYPASS_TTNET_FEATURES));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((TreeMap) i.headers().j()).entrySet().iterator();
        while (it2.hasNext()) {
            String str = (String) ((Map.Entry) it2.next()).getKey();
            if ((str.equals(com.bytedance.retrofit2.client.Request.KEY_BYPASS_DISPATCH) && equals) || str.startsWith("x-metasec")) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() > 0) {
            Request.a newBuilder = i.newBuilder();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                newBuilder.h((String) it3.next());
            }
            i = newBuilder.b();
        }
        return fVar.f(i);
    }
}
