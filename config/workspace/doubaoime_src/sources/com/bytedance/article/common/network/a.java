package com.bytedance.article.common.network;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.common.utility.e;
import com.bytedance.frameworks.baselib.network.http.l.c;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.f;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends e {
    private static List<b> f(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new b(entry.getKey(), entry.getValue()));
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
            List<b> f2 = f(map);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list != null) {
                for (Pair<String, String> pair : list) {
                    linkedHashMap.put(pair.first, pair.second);
                }
            }
            return iCommonApi.postForm(-1, str3, linkedHashMap, f2, aVar != null ? aVar.a : false).execute().a();
        } catch (Exception e2) {
            if (e2 instanceof c) {
                throw new com.bytedance.common.utility.a(((c) e2).c(), e2.getMessage());
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
            return iCommonApi.postData(-1, str3, new f(str4, bArr, new String[0]), f(map), aVar != null ? aVar.a : false).execute().a();
        } catch (Exception e2) {
            if (e2 instanceof c) {
                throw new com.bytedance.common.utility.a(((c) e2).c(), e2.getMessage());
            }
            throw new com.bytedance.common.utility.a(0, e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] h(java.lang.String r9, byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11, com.bytedance.common.utility.e.a r12) throws com.bytedance.common.utility.a {
        /*
            r8 = this;
            r12 = 0
            r0 = 0
            android.util.Pair r9 = g(r9)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.lang.Object r1 = r9.first     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.lang.Object r9 = r9.second     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.lang.Class<com.bytedance.article.common.network.ICommonApi> r9 = com.bytedance.article.common.network.ICommonApi.class
            java.lang.Object r9 = com.bytedance.ttnet.utils.RetrofitUtils.e(r1, r9)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r2 = r9
            com.bytedance.article.common.network.ICommonApi r2 = (com.bytedance.article.common.network.ICommonApi) r2     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            if (r11 == 0) goto L26
            java.lang.String r9 = "Content-Type"
            java.lang.Object r1 = r11.get(r9)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r11.remove(r9)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            goto L27
        L26:
            r1 = r12
        L27:
            java.util.List r6 = f(r11)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r7 = 0
            com.bytedance.retrofit2.mime.f r5 = new com.bytedance.retrofit2.mime.f     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r5.<init>(r1, r10, r9)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r3 = -1
            com.bytedance.retrofit2.e r9 = r2.postDataStream(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            com.bytedance.retrofit2.N r9 = r9.execute()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.lang.Object r9 = r9.a()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            com.bytedance.retrofit2.mime.h r9 = (com.bytedance.retrofit2.mime.h) r9     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.io.InputStream r9 = r9.d()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            r10.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L78
            r11 = 1024(0x400, float:1.435E-42)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
        L4f:
            int r12 = r9.read(r11)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r1 = -1
            if (r12 == r1) goto L5a
            r10.write(r11, r0, r12)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            goto L4f
        L5a:
            byte[] r11 = r10.toByteArray()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r9.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r9 = move-exception
            r9.printStackTrace()
        L66:
            r10.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r9 = move-exception
            r9.printStackTrace()
        L6e:
            return r11
        L6f:
            r11 = move-exception
            goto L76
        L71:
            r11 = move-exception
            goto L7b
        L73:
            r10 = move-exception
            r11 = r10
            r10 = r12
        L76:
            r12 = r9
            goto La5
        L78:
            r10 = move-exception
            r11 = r10
            r10 = r12
        L7b:
            r12 = r9
            goto L84
        L7d:
            r9 = move-exception
            r11 = r9
            r10 = r12
            goto La5
        L81:
            r9 = move-exception
            r11 = r9
            r10 = r12
        L84:
            boolean r9 = r11 instanceof com.bytedance.frameworks.baselib.network.http.l.c     // Catch: java.lang.Throwable -> La3
            if (r9 == 0) goto L99
            com.bytedance.common.utility.a r9 = new com.bytedance.common.utility.a     // Catch: java.lang.Throwable -> La3
            r0 = r11
            com.bytedance.frameworks.baselib.network.http.l.c r0 = (com.bytedance.frameworks.baselib.network.http.l.c) r0     // Catch: java.lang.Throwable -> La3
            int r0 = r0.c()     // Catch: java.lang.Throwable -> La3
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> La3
            r9.<init>(r0, r11)     // Catch: java.lang.Throwable -> La3
            throw r9     // Catch: java.lang.Throwable -> La3
        L99:
            com.bytedance.common.utility.a r9 = new com.bytedance.common.utility.a     // Catch: java.lang.Throwable -> La3
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> La3
            r9.<init>(r0, r11)     // Catch: java.lang.Throwable -> La3
            throw r9     // Catch: java.lang.Throwable -> La3
        La3:
            r9 = move-exception
            r11 = r9
        La5:
            if (r12 == 0) goto Laf
            r12.close()     // Catch: java.io.IOException -> Lab
            goto Laf
        Lab:
            r9 = move-exception
            r9.printStackTrace()
        Laf:
            if (r10 == 0) goto Lb9
            r10.close()     // Catch: java.io.IOException -> Lb5
            goto Lb9
        Lb5:
            r9 = move-exception
            r9.printStackTrace()
        Lb9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.article.common.network.a.h(java.lang.String, byte[], java.util.Map, com.bytedance.common.utility.e$a):byte[]");
    }
}
