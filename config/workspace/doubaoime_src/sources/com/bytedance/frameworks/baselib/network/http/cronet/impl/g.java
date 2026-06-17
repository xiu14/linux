package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
class g extends c {
    private HttpURLConnection l;

    public g(Request request) {
        super(request);
        this.l = null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.c
    HttpURLConnection L() {
        return this.l;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.c
    void S(HttpURLConnection httpURLConnection) {
        this.l = httpURLConnection;
    }

    @Override // com.bytedance.retrofit2.client.d
    public void cancel() {
        J(this.l);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected IOException d(Exception exc) {
        int h = "com.ttnet.org.chromium.net.urlconnection.i".equals(exc.getClass().getName()) ? k.h(this.l) : 0;
        if ("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl".equals(exc.getClass().getName()) || "com.ttnet.org.chromium.net.impl.D".equals(exc.getClass().getName())) {
            h = k.h(this.l);
        }
        return new e(exc, this.b, h);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected int i(IOException iOException) {
        if ("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl".equals(iOException.getClass().getName()) || "com.ttnet.org.chromium.net.impl.D".equals(iOException.getClass().getName())) {
            return k.h(this.l);
        }
        return -1;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.c, com.bytedance.retrofit2.client.d
    public boolean setThrottleNetSpeed(long j) {
        super.setThrottleNetSpeed(j);
        if (this.l != null) {
            try {
                if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                    com.bytedance.frameworks.baselib.network.i.a.b(this.l).a("configureConnection", new Class[]{String.class, Object[].class}, "setThrottleNetSpeed", new Object[]{Long.valueOf(j)});
                } else {
                    com.bytedance.frameworks.baselib.network.i.a.b(this.l).a("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
