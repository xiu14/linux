package com.huawei.b.g.e;

import android.content.Context;
import android.util.Log;
import com.huawei.b.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements com.huawei.b.d {
    private final String a;
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6954c;

    /* renamed from: d, reason: collision with root package name */
    private final com.huawei.b.b f6955d;

    /* renamed from: e, reason: collision with root package name */
    private final com.huawei.b.g.c f6956e;

    /* renamed from: f, reason: collision with root package name */
    private final e f6957f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, String> f6958g;
    private final List<com.huawei.agconnect.core.a> h;
    private final Map<String, String> i = new HashMap();

    public b(Context context, String str, com.huawei.b.b bVar, InputStream inputStream, Map<String, String> map, List<com.huawei.agconnect.core.a> list, String str2) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = context;
        String packageName = context.getPackageName();
        this.f6954c = packageName;
        if (inputStream != null) {
            this.f6956e = new i(inputStream, packageName);
            try {
                inputStream.close();
            } catch (IOException unused) {
                Log.e("Utils", "Exception when closing the 'Closeable'.");
            }
        } else {
            this.f6956e = new l(context, packageName);
        }
        com.huawei.b.g.c cVar = this.f6956e;
        this.f6957f = new e(cVar);
        com.huawei.b.b bVar2 = com.huawei.b.b.b;
        if (bVar != bVar2 && "1.0".equals(cVar.getString("/configuration_version", null))) {
            throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
        }
        this.f6955d = bVar == bVar2 ? com.bytedance.feedbackerlib.a.K(this.f6956e.getString("/region", null), this.f6956e.getString("/agcgw/url", null)) : bVar;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashMap.put(com.bytedance.feedbackerlib.a.u(entry.getKey()), entry.getValue());
        }
        this.f6958g = hashMap;
        this.h = list;
        StringBuilder M = e.a.a.a.a.M("{packageName='");
        e.a.a.a.a.G0(M, this.f6954c, '\'', ", routePolicy=");
        M.append(this.f6955d);
        M.append(", reader=");
        M.append(this.f6956e.toString().hashCode());
        M.append(", customConfigMap=");
        M.append(new JSONObject(hashMap).toString().hashCode());
        M.append('}');
        this.a = String.valueOf(M.toString().hashCode());
    }

    private String d(String str) {
        Map<String, f.a> a = com.huawei.b.f.a();
        if (!a.containsKey(str)) {
            return null;
        }
        if (this.i.containsKey(str)) {
            return this.i.get(str);
        }
        f.a aVar = a.get(str);
        if (aVar == null) {
            return null;
        }
        String a2 = aVar.a(this);
        this.i.put(str, a2);
        return a2;
    }

    @Override // com.huawei.b.d
    public String a(String str) {
        if (str == null) {
            return null;
        }
        String u = com.bytedance.feedbackerlib.a.u(str);
        String str2 = this.f6958g.get(u);
        if (str2 != null || (str2 = d(u)) != null) {
            return str2;
        }
        String string = this.f6956e.getString(u, null);
        if (e.b(string)) {
            string = this.f6957f.a(string, null);
        }
        return string;
    }

    @Override // com.huawei.b.d
    public String b() {
        return this.a;
    }

    @Override // com.huawei.b.d
    public com.huawei.b.b c() {
        com.huawei.b.b bVar = this.f6955d;
        return bVar == null ? com.huawei.b.b.b : bVar;
    }

    public List<com.huawei.agconnect.core.a> e() {
        return this.h;
    }

    @Override // com.huawei.b.d
    public Context getContext() {
        return this.b;
    }
}
