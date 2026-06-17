package com.bytedance.apm.impl;

import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.mime.h;
import com.bytedance.retrofit2.mime.i;
import com.bytedance.retrofit2.mime.j;
import com.bytedance.services.apm.api.g;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements g {
    private String a;
    private Map<String, String> b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, i> f3440c = new HashMap();

    public c(String str, String str2, boolean z, Map<String, String> map) {
        this.a = str;
        this.b = map;
    }

    @Override // com.bytedance.services.apm.api.g
    public void a(String str, String str2, String str3, Map<String, String> map) throws IOException {
        this.f3440c.put(str, new a(str, str2, map));
    }

    @Override // com.bytedance.services.apm.api.g
    public com.bytedance.services.apm.api.c b() throws IOException {
        byte[] bytes;
        int i;
        String str = this.a;
        Map<String, i> map = this.f3440c;
        Map<String, String> map2 = this.b;
        RetrofitMonitorService retrofitMonitorService = (RetrofitMonitorService) RetrofitUtils.e(str, RetrofitMonitorService.class);
        HashMap hashMap = new HashMap();
        try {
            N<h> execute = retrofitMonitorService.uploadFiles(str, map, DefaultTTNetImpl.convertHeaderMap(map2)).execute();
            bytes = DefaultTTNetImpl.toByteArray(execute.a().d());
            List<com.bytedance.retrofit2.client.b> e2 = execute.e();
            if (!com.bytedance.android.input.k.b.a.a0(e2)) {
                for (com.bytedance.retrofit2.client.b bVar : e2) {
                    hashMap.put(bVar.a(), bVar.b());
                }
            }
            i = execute.b();
        } catch (Throwable th) {
            th.printStackTrace();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", th.getMessage() + com.bytedance.android.input.k.b.a.Q(th, 30));
                jSONObject.put("exception_object", th.toString());
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            bytes = jSONObject.toString().getBytes();
            i = 100001;
        }
        return new com.bytedance.services.apm.api.c(i, hashMap, bytes);
    }

    @Override // com.bytedance.services.apm.api.g
    public void c(String str, String str2) {
        this.f3440c.put(str, new j(str2));
    }

    @Override // com.bytedance.services.apm.api.g
    public void d(String str, File file, String str2, Map<String, String> map) throws IOException {
        this.f3440c.put(str, new b(map, new com.bytedance.retrofit2.mime.g(null, file)));
    }
}
