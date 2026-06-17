package com.bytedance.apm.impl;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.e;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.mime.f;
import com.bytedance.retrofit2.mime.h;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.g;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DefaultTTNetImpl implements IHttpService {
    protected static List<com.bytedance.retrofit2.client.b> convertHeaderMap(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        if (inputStream == null) {
            return new byte[0];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public g buildMultipartUpload(String str, String str2, boolean z) throws Exception {
        return new c(str, str2, z, null);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public com.bytedance.services.apm.api.c doGet(String str, Map<String, String> map) throws Exception {
        N<h> execute = ((RetrofitMonitorService) RetrofitUtils.e(str, RetrofitMonitorService.class)).fetch(str, map, false).execute();
        return new com.bytedance.services.apm.api.c(execute.b(), toByteArray(execute.a().d()));
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public com.bytedance.services.apm.api.c doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        int i;
        InterfaceC0701e<h> report = ((RetrofitMonitorService) RetrofitUtils.e(str, RetrofitMonitorService.class)).report(str, new f("application/json; charset=utf-8", bArr, new String[0]), convertHeaderMap(map), false);
        HashMap hashMap = new HashMap();
        byte[] bArr2 = null;
        try {
            N<h> execute = report.execute();
            bArr2 = toByteArray(execute.a().d());
            List<com.bytedance.retrofit2.client.b> e2 = execute.e();
            if (!com.bytedance.android.input.k.b.a.a0(e2)) {
                for (com.bytedance.retrofit2.client.b bVar : e2) {
                    hashMap.put(bVar.a(), bVar.b());
                }
            }
            i = execute.b();
        } catch (Throwable th) {
            try {
                r2 = th instanceof com.bytedance.frameworks.baselib.network.http.l.c ? ((com.bytedance.frameworks.baselib.network.http.l.c) th).c() : 0;
                if (th instanceof e) {
                    i = ((e) th).d();
                }
            } catch (Exception unused) {
            }
            i = r2;
        }
        return new com.bytedance.services.apm.api.c(i, hashMap, bArr2);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public com.bytedance.services.apm.api.c uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception {
        return com.bytedance.android.input.k.b.a.N0(str, list, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public g buildMultipartUpload(String str, String str2, boolean z, Map<String, String> map) throws Exception {
        return new c(str, str2, z, map);
    }
}
