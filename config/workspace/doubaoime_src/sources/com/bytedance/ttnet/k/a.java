package com.bytedance.ttnet.k;

import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.b;
import com.bytedance.ttnet.d;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f6227c;
    private ICronetAppProvider a;
    private d b;

    private a() {
    }

    public static a f() {
        if (f6227c == null) {
            synchronized (a.class) {
                if (f6227c == null) {
                    f6227c = new a();
                }
            }
        }
        return f6227c;
    }

    public List<String> a() {
        ICronetAppProvider iCronetAppProvider = this.a;
        if (iCronetAppProvider != null) {
            return iCronetAppProvider.getAbSdkVersion();
        }
        return null;
    }

    public int b() {
        d dVar = this.b;
        if (dVar == null) {
            return 0;
        }
        ((com.bytedance.android.input.ttnet.d) dVar).a();
        return 401734;
    }

    public String c() {
        d dVar = this.b;
        if (dVar != null) {
            return (String) ((HashMap) ((com.bytedance.android.input.ttnet.d) dVar).d()).get(TTNetInit.DOMAIN_HTTPDNS_KEY);
        }
        return null;
    }

    public String[] d() {
        Object obj = this.b;
        if (obj instanceof b) {
            Objects.requireNonNull((b) obj);
        }
        return null;
    }

    public String[] e() {
        Object obj = this.b;
        if (obj instanceof b) {
            Objects.requireNonNull((b) obj);
        }
        return null;
    }

    public void g(String str, String str2) {
        ICronetAppProvider iCronetAppProvider = this.a;
        if (iCronetAppProvider != null) {
            iCronetAppProvider.sendAppMonitorEvent(str, str2);
        }
    }

    public void h(ICronetAppProvider iCronetAppProvider) {
        this.a = iCronetAppProvider;
    }

    public void i(d dVar) {
        this.b = dVar;
    }
}
