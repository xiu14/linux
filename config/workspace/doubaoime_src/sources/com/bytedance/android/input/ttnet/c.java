package com.bytedance.android.input.ttnet;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.article.common.network.ICommonApi;
import com.bytedance.common.utility.e;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class c extends com.bytedance.common.utility.e {
    private static List<com.bytedance.retrofit2.client.b> f(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static Pair<String, String> g(String str) throws Exception {
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        String scheme = parse.getScheme();
        String host = parse.getHost();
        int port = parse.getPort();
        if (host != null) {
            if (scheme != null) {
                sb.append(scheme);
                sb.append("://");
            }
            sb.append(host);
            if (port > 0) {
                sb.append(':');
                sb.append(port);
            }
        }
        String sb2 = sb.toString();
        String path = parse.getPath();
        String query = parse.getQuery();
        if (query != null) {
            path = e.a.a.a.a.t(path, "?", query);
        }
        return new Pair<>(sb2, path);
    }

    @Override // com.bytedance.common.utility.e
    public String a(String str, Map<String, String> map, e.a aVar) throws Exception {
        Pair<String, String> g2 = g(str);
        String str2 = (String) g2.first;
        return ((ICommonApi) RetrofitUtils.e(str2, ICommonApi.class)).get(-1, (String) g2.second, f(map), aVar != null ? aVar.a : false).execute().a();
    }

    @Override // com.bytedance.common.utility.e
    public String c(String str, List<Pair<String, String>> list, Map<String, String> map, e.a aVar) throws com.bytedance.common.utility.a {
        try {
            Pair<String, String> g2 = g(str);
            String str2 = (String) g2.first;
            String str3 = (String) g2.second;
            ICommonApi iCommonApi = (ICommonApi) RetrofitUtils.e(str2, ICommonApi.class);
            List<com.bytedance.retrofit2.client.b> f2 = f(map);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list != null) {
                for (Pair<String, String> pair : list) {
                    linkedHashMap.put((String) pair.first, (String) pair.second);
                }
            }
            return iCommonApi.postForm(-1, str3, linkedHashMap, f2, aVar != null ? aVar.a : false).execute().a();
        } catch (Exception e2) {
            if (e2 instanceof com.bytedance.frameworks.baselib.network.http.l.c) {
                throw new com.bytedance.common.utility.a(((com.bytedance.frameworks.baselib.network.http.l.c) e2).c(), e2.getMessage());
            }
            if (e2 instanceof com.bytedance.frameworks.baselib.network.http.cronet.impl.e) {
                throw new com.bytedance.common.utility.a(((com.bytedance.frameworks.baselib.network.http.cronet.impl.e) e2).d(), e2.getMessage());
            }
            throw new com.bytedance.common.utility.a(0, e2.getMessage());
        }
    }

    @Override // com.bytedance.common.utility.e
    public String d(String str, byte[] bArr, Map<String, String> map, e.a aVar) throws com.bytedance.common.utility.a {
        try {
            Pair<String, String> g2 = g(str);
            String str2 = (String) g2.first;
            String str3 = (String) g2.second;
            ICommonApi iCommonApi = (ICommonApi) RetrofitUtils.e(str2, ICommonApi.class);
            String str4 = null;
            if (map != null) {
                String str5 = map.get(DownloadHelper.CONTENT_TYPE);
                map.remove(DownloadHelper.CONTENT_TYPE);
                str4 = str5;
            }
            return iCommonApi.postData(-1, str3, new com.bytedance.retrofit2.mime.f(str4, bArr, new String[0]), f(map), aVar != null ? aVar.a : false).execute().a();
        } catch (Exception e2) {
            if (e2 instanceof com.bytedance.frameworks.baselib.network.http.l.c) {
                throw new b(((com.bytedance.frameworks.baselib.network.http.l.c) e2).c(), 0, e2.getMessage());
            }
            if (!(e2 instanceof com.bytedance.frameworks.baselib.network.http.cronet.impl.e)) {
                throw new b(0, 0, e2.getMessage());
            }
            com.bytedance.frameworks.baselib.network.http.cronet.impl.e eVar = (com.bytedance.frameworks.baselib.network.http.cronet.impl.e) e2;
            throw new b(eVar.d(), eVar.c(), e2.getMessage());
        }
    }
}
