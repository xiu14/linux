package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.B;
import com.ttnet.org.chromium.net.F;
import com.ttnet.org.chromium.net.u;
import com.ttnet.org.chromium.net.z;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class JavaCronetEngine extends AbstractC0763c {
    @Override // com.ttnet.org.chromium.net.impl.AbstractC0763c
    protected com.ttnet.org.chromium.net.z U(z.b bVar, Executor executor, int i, List<String> list, int i2, int i3, int i4) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC0763c
    public H V(String str, F.b bVar, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, u.a aVar, int i4, long j) {
        if (j == -1) {
            return new C0772l(this, bVar, null, executor, str, null, z3, z4, i2, z5, i3);
        }
        throw new UnsupportedOperationException("The multi-network API is not supported by the Java implementation of Cronet Engine");
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC0763c
    public com.ttnet.org.chromium.net.B W(B.b bVar, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC0763c
    public com.ttnet.org.chromium.net.B X(B.b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC0759g
    public com.ttnet.org.chromium.net.y a() {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.k, com.ttnet.org.chromium.net.AbstractC0759g
    public F.a c(String str, F.b bVar, Executor executor) {
        return new I(str, bVar, executor, this);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC0759g
    public URLConnection e(URL url, Proxy proxy, boolean z) throws IOException {
        return url.openConnection(proxy);
    }

    @Override // com.ttnet.org.chromium.net.k
    public int n() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int o() {
        return 0;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int t() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int w() {
        return -1;
    }
}
