package org.chromium;

import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;

/* loaded from: classes2.dex */
public class e implements ICronetDepend {
    private static volatile e b;
    private ICronetDepend a;

    private e() {
    }

    public static e a() {
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public String getSsCookieKey() {
        ICronetDepend iCronetDepend = this.a;
        return iCronetDepend != null ? iCronetDepend.getSsCookieKey() : "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void loggerD(String str, String str2) {
        ICronetDepend iCronetDepend = this.a;
        if (iCronetDepend != null) {
            iCronetDepend.loggerD(str, str2);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        ICronetDepend iCronetDepend = this.a;
        if (iCronetDepend != null) {
            return iCronetDepend.loggerDebug();
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void setAdapter(ICronetDepend iCronetDepend) {
        this.a = iCronetDepend;
    }
}
