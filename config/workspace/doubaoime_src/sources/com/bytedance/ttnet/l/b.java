package com.bytedance.ttnet.l;

import com.bytedance.frameworks.baselib.network.http.c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.d;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b implements com.bytedance.retrofit2.client.a {
    @Override // com.bytedance.retrofit2.client.a
    public d a(Request request) throws IOException {
        if (request.getExtraInfo() instanceof c) {
            Objects.requireNonNull((c) request.getExtraInfo());
        }
        request.getUrl();
        com.bytedance.frameworks.baselib.network.http.d b = com.bytedance.ttnet.c.b(false);
        if (b != null) {
            return b.a(request);
        }
        return null;
    }
}
