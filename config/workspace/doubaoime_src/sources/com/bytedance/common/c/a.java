package com.bytedance.common.c;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.e;
import com.huawei.hms.framework.common.ContainerUtils;
import com.vivo.push.PushClient;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends com.bytedance.common.utility.e {

    /* renamed from: com.bytedance.common.c.a$a, reason: collision with other inner class name */
    static class C0169a implements j {
        final /* synthetic */ HttpURLConnection a;

        C0169a(String str, HttpURLConnection httpURLConnection) {
            this.a = httpURLConnection;
        }

        @Override // com.bytedance.common.c.j
        public void a() {
            try {
                HttpURLConnection httpURLConnection = this.a;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static Map<String, String> f(Map<String, String> map) {
        com.bytedance.push.g0.f.c("DefaultNetWorkClient", "[addHeaderForDebug]headerInfo:" + map);
        String str = com.bytedance.common.g.a.c().e().c().h;
        if (!TextUtils.isEmpty(str) && (str.contains("update") || str.contains("test"))) {
            String a = com.bytedance.push.g0.i.b().a("log.tag.push.X-TT-ENV");
            com.bytedance.push.g0.f.c("DefaultNetWorkClient", "[addHeaderForDebug]ppeEnv:" + a);
            if (!TextUtils.isEmpty(a)) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("X-TT-ENV", a);
                map.put("X-USE-PPE", PushClient.DEFAULT_REQUEST_ID);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106 A[Catch: all -> 0x0124, TryCatch #2 {all -> 0x0124, blocks: (B:5:0x0016, B:7:0x002c, B:9:0x0032, B:10:0x003a, B:12:0x0040, B:15:0x0052, B:18:0x005e, B:26:0x0072, B:28:0x007b, B:30:0x007e, B:31:0x0090, B:33:0x0098, B:37:0x00d4, B:39:0x00d8, B:41:0x00e0, B:44:0x00ea, B:46:0x00fa, B:48:0x00fe, B:52:0x0106, B:53:0x010b, B:70:0x00cd, B:73:0x00c9, B:77:0x011a, B:78:0x0123, B:79:0x0076), top: B:4:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g(java.lang.String r6, byte[] r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9, boolean r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.c.a.g(java.lang.String, byte[], java.util.Map, java.lang.String, boolean):java.lang.String");
    }

    @Override // com.bytedance.common.utility.e
    public String a(String str, Map<String, String> map, e.a aVar) throws com.bytedance.common.utility.a {
        try {
            if (TextUtils.isDigitsOnly(str)) {
                return null;
            }
            return g(str, null, map, "GET", false);
        } catch (Throwable th) {
            if (th instanceof b) {
                throw new com.bytedance.common.utility.a(th.a, th.getMessage());
            }
            throw new com.bytedance.common.utility.a(0, th.getMessage());
        }
    }

    @Override // com.bytedance.common.utility.e
    public String c(String str, List<Pair<String, String>> list, Map<String, String> map, e.a aVar) throws com.bytedance.common.utility.a {
        try {
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < list.size(); i++) {
                Pair<String, String> pair = list.get(i);
                sb.append(((String) pair.first) + ContainerUtils.KEY_VALUE_DELIMITER + URLEncoder.encode((String) pair.second, "UTF-8"));
                if (i < list.size() - 1) {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
            }
            byte[] bytes = sb.toString().getBytes("UTF-8");
            HashMap hashMap = new HashMap();
            aVar.a = true;
            return d(str, bytes, hashMap, aVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new com.bytedance.common.utility.a(0, e2.getMessage());
        }
    }

    @Override // com.bytedance.common.utility.e
    public String d(String str, byte[] bArr, Map<String, String> map, e.a aVar) throws com.bytedance.common.utility.a {
        try {
            return g(str, bArr, map, "POST", true);
        } catch (Throwable th) {
            if (th instanceof b) {
                throw new com.bytedance.common.utility.a(th.a, th.getMessage());
            }
            throw new com.bytedance.common.utility.a(0, th.getMessage());
        }
    }
}
