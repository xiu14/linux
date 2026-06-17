package com.huawei.b.g.e;

import android.content.Context;
import android.util.Log;
import com.huawei.b.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends com.huawei.b.g.a {

    /* renamed from: c, reason: collision with root package name */
    private final Context f6959c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6960d;

    /* renamed from: e, reason: collision with root package name */
    private volatile com.huawei.b.g.c f6961e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f6962f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private com.huawei.b.b f6963g = com.huawei.b.b.b;
    private final Map<String, String> h = new HashMap();
    private volatile e i;

    public c(Context context, String str) {
        this.f6959c = context;
        this.f6960d = str;
    }

    private void e() {
        Log.d("AGC_ConfigImpl", "initConfigReader");
        if (this.f6961e == null) {
            synchronized (this.f6962f) {
                if (this.f6961e == null) {
                    this.f6961e = new l(this.f6959c, this.f6960d);
                    this.i = new e(this.f6961e);
                }
                if (this.f6963g == com.huawei.b.b.b) {
                    if (this.f6961e != null) {
                        this.f6963g = com.bytedance.feedbackerlib.a.K(this.f6961e.getString("/region", null), this.f6961e.getString("/agcgw/url", null));
                    } else {
                        Log.w("AGConnectServiceConfig", "get route fail , config not ready");
                    }
                }
            }
        }
    }

    @Override // com.huawei.b.d
    public String a(String str) {
        f.a aVar;
        if (this.f6961e == null) {
            e();
        }
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        String str2 = '/' + str.substring(i);
        String str3 = this.h.get(str2);
        if (str3 != null) {
            return str3;
        }
        Map<String, f.a> a = com.huawei.b.f.a();
        String a2 = (a.containsKey(str2) && (aVar = a.get(str2)) != null) ? aVar.a(this) : null;
        if (a2 != null) {
            return a2;
        }
        String string = this.f6961e.getString(str2, null);
        if (e.b(string)) {
            string = this.i.a(string, null);
        }
        return string;
    }

    @Override // com.huawei.b.d
    public String b() {
        return "DEFAULT_INSTANCE";
    }

    @Override // com.huawei.b.d
    public com.huawei.b.b c() {
        Log.d("AGC_ConfigImpl", "getRoutePolicy");
        if (this.f6963g == null) {
            this.f6963g = com.huawei.b.b.b;
        }
        com.huawei.b.b bVar = this.f6963g;
        com.huawei.b.b bVar2 = com.huawei.b.b.b;
        if (bVar == bVar2 && this.f6961e == null) {
            e();
        }
        com.huawei.b.b bVar3 = this.f6963g;
        return bVar3 == null ? bVar2 : bVar3;
    }

    @Override // com.huawei.b.d
    public Context getContext() {
        return this.f6959c;
    }
}
