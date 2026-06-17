package com.bytedance.bdinstall;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdinstall.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0624d {
    private static final String[] a = {WsConstants.KEY_APP_ID, "app_version", "tt_data", "device_id", "bd_did"};

    /* renamed from: com.bytedance.bdinstall.d$a */
    static class a extends com.ss.android.ugc.quota.a {
        final /* synthetic */ boolean a;

        a(boolean z) {
            this.a = z;
        }

        @Override // com.ss.android.ugc.quota.c
        public boolean a() {
            return !this.a;
        }

        @Override // com.ss.android.ugc.quota.c
        public int b() {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean a(com.bytedance.bdinstall.G r1, com.bytedance.bdinstall.H r2, java.lang.String r3, boolean r4, com.bytedance.bdinstall.C r5, boolean r6) {
        /*
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.util.HashMap r6 = c(r6)
            r0 = 0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = d(r2, r4, r5)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = r1.d(r2, r6)     // Catch: java.lang.Exception -> L32
            com.bytedance.bdinstall.l0.a r2 = new com.bytedance.bdinstall.l0.a     // Catch: java.lang.Exception -> L32
            r4 = 200(0xc8, float:2.8E-43)
            r2.<init>(r3, r4, r0, r1)     // Catch: java.lang.Exception -> L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r1.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "network client is ready. response is "
            r1.append(r3)     // Catch: java.lang.Exception -> L30
            r1.append(r2)     // Catch: java.lang.Exception -> L30
            r1.toString()     // Catch: java.lang.Exception -> L30
            int r1 = com.bytedance.bdinstall.C0640u.a     // Catch: java.lang.Exception -> L30
            goto L39
        L30:
            r1 = move-exception
            goto L34
        L32:
            r1 = move-exception
            r2 = r0
        L34:
            int r3 = com.bytedance.bdinstall.C0640u.a
            r1.printStackTrace()
        L39:
            if (r2 == 0) goto L75
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L59
            java.lang.String r3 = r2.a()     // Catch: org.json.JSONException -> L59
            r1.<init>(r3)     // Catch: org.json.JSONException -> L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L56
            r3.<init>()     // Catch: org.json.JSONException -> L56
            java.lang.String r4 = "active response body "
            r3.append(r4)     // Catch: org.json.JSONException -> L56
            r3.append(r1)     // Catch: org.json.JSONException -> L56
            r3.toString()     // Catch: org.json.JSONException -> L56
            r0 = r1
            goto L75
        L56:
            r3 = move-exception
            r0 = r1
            goto L5b
        L59:
            r1 = move-exception
            r3 = r1
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "active parse json error "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.toString()
            int r1 = com.bytedance.bdinstall.C0640u.a
            r3.printStackTrace()
        L75:
            if (r0 == 0) goto L89
            java.lang.String r1 = "message"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.optString(r1, r2)
            java.lang.String r2 = "success"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L89
            r1 = 1
            goto L8a
        L89:
            r1 = 0
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.C0624d.a(com.bytedance.bdinstall.G, com.bytedance.bdinstall.H, java.lang.String, boolean, com.bytedance.bdinstall.C, boolean):boolean");
    }

    static void b(StringBuilder sb, String str, String str2) {
        if (sb == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        sb.append(str);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(Uri.encode(str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static HashMap<String, String> c(boolean z) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            Pair<String, String> e2 = com.ss.android.ugc.quota.b.g().e(new a(z));
            if (e2 != null) {
                hashMap.put(e2.first, e2.second);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    private static String d(String str, boolean z, C c2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String query = parse.getQuery();
        ArrayList arrayList = new ArrayList();
        for (String str2 : a) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                arrayList.add(new Pair(str2, queryParameter));
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        buildUpon.appendQueryParameter("tt_info", new String(Base64.encode(f(query, z, c2), 8)));
        return buildUpon.build().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static com.bytedance.bdinstall.l0.a e(G g2, H h, String str, JSONObject jSONObject, boolean z, C c2, boolean z2, List<Pair<String, String>> list) {
        HashMap<String, String> c3 = c(z2);
        if (z) {
            c3.put(DownloadHelper.CONTENT_TYPE, "application/octet-stream;tt-data=a");
        } else {
            c3.put(DownloadHelper.CONTENT_TYPE, "application/json; charset=utf-8");
        }
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Pair<String, String> pair = list.get(i);
                c3.put(pair.first, pair.second);
            }
        }
        com.bytedance.bdinstall.l0.a aVar = null;
        try {
            byte[] f2 = f(jSONObject.toString(), z, c2);
            if (f2 != null && z) {
                str = str + "&tt_data=a";
            }
            com.bytedance.bdinstall.l0.a aVar2 = new com.bytedance.bdinstall.l0.a(str, 200, null, g2.a(str, f2, c3));
            try {
                String str2 = "network client is ready. response is " + aVar2;
                int i2 = C0640u.a;
                return aVar2;
            } catch (Exception e2) {
                e = e2;
                aVar = aVar2;
                int i3 = C0640u.a;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private static byte[] f(String str, boolean z, C c2) {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = null;
        try {
            if (z) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(str.getBytes("UTF-8"));
                    gZIPOutputStream = gZIPOutputStream2;
                } catch (Throwable unused) {
                    gZIPOutputStream = gZIPOutputStream2;
                    try {
                        int i = C0640u.a;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                        return !z ? byteArray : byteArray;
                    } catch (Throwable th) {
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException unused3) {
                                int i2 = C0640u.a;
                            }
                        }
                        throw th;
                    }
                }
            } else {
                byteArrayOutputStream.write(str.getBytes("UTF-8"));
            }
            if (gZIPOutputStream != null) {
                try {
                    gZIPOutputStream.close();
                } catch (IOException unused4) {
                    int i3 = C0640u.a;
                }
            }
        } catch (Throwable unused5) {
        }
        byteArray = byteArrayOutputStream.toByteArray();
        if (!z && c2 != null) {
            return c2.a(byteArray, byteArray.length);
        }
    }
}
