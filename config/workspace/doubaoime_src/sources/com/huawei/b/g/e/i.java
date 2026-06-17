package com.huawei.b.g.e;

import android.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i implements com.huawei.b.g.c {
    private final JSONObject a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[Catch: JSONException -> 0x00ae, TRY_ENTER, TryCatch #3 {JSONException -> 0x00ae, blocks: (B:6:0x0022, B:7:0x0029, B:10:0x0031, B:19:0x0047, B:21:0x0056, B:22:0x0064, B:24:0x0071, B:26:0x0081, B:28:0x008e, B:29:0x0092, B:31:0x0098, B:34:0x00a4, B:42:0x005f, B:12:0x0040), top: B:5:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: JSONException -> 0x00ae, TRY_LEAVE, TryCatch #3 {JSONException -> 0x00ae, blocks: (B:6:0x0022, B:7:0x0029, B:10:0x0031, B:19:0x0047, B:21:0x0056, B:22:0x0064, B:24:0x0071, B:26:0x0081, B:28:0x008e, B:29:0x0092, B:31:0x0098, B:34:0x00a4, B:42:0x005f, B:12:0x0040), top: B:5:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    i(java.io.InputStream r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.<init>()
            java.lang.String r0 = "InputStreamReader"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L11 java.io.IOException -> L14
            java.lang.String r2 = "UTF-8"
            java.lang.String r8 = com.bytedance.feedbackerlib.a.N0(r8, r2)     // Catch: org.json.JSONException -> L11 java.io.IOException -> L14
            r1.<init>(r8)     // Catch: org.json.JSONException -> L11 java.io.IOException -> L14
            goto L1e
        L11:
            java.lang.String r8 = "JSONException when reading the 'Config' from InputStream."
            goto L16
        L14:
            java.lang.String r8 = "IOException when reading the 'Config' from InputStream."
        L16:
            android.util.Log.e(r0, r8)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L1e:
            r7.a = r1
            java.lang.String r8 = "app_id"
            java.lang.String r2 = "appInfos"
            org.json.JSONArray r1 = r1.getJSONArray(r2)     // Catch: org.json.JSONException -> Lae
            r2 = 0
        L29:
            int r3 = r1.length()     // Catch: org.json.JSONException -> Lae
            java.lang.String r4 = "package_name"
            if (r2 >= r3) goto L43
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> Lae
            java.lang.String r5 = r3.getString(r4)     // Catch: org.json.JSONException -> Lae
            boolean r5 = r5.equals(r9)     // Catch: org.json.JSONException -> Lae
            if (r5 == 0) goto L40
            goto L44
        L40:
            int r2 = r2 + 1
            goto L29
        L43:
            r3 = 0
        L44:
            if (r3 != 0) goto L47
            goto Lb3
        L47:
            java.lang.String r9 = "/configuration_version"
            java.lang.String r1 = ""
            java.lang.String r9 = r7.getString(r9, r1)     // Catch: org.json.JSONException -> Lae
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch: org.json.JSONException -> Lae
            java.lang.String r2 = "0.0"
            r1.<init>(r2)     // Catch: org.json.JSONException -> Lae
            double r5 = java.lang.Double.parseDouble(r9)     // Catch: java.lang.NumberFormatException -> L5f org.json.JSONException -> Lae
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r5)     // Catch: java.lang.NumberFormatException -> L5f org.json.JSONException -> Lae
            goto L64
        L5f:
            java.lang.String r9 = "configuration_version to double error"
            android.util.Log.d(r0, r9)     // Catch: org.json.JSONException -> Lae
        L64:
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch: org.json.JSONException -> Lae
            java.lang.String r2 = "2.0"
            r9.<init>(r2)     // Catch: org.json.JSONException -> Lae
            int r9 = r1.compareTo(r9)     // Catch: org.json.JSONException -> Lae
            if (r9 != 0) goto L81
            org.json.JSONObject r9 = r7.a     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = "client"
            org.json.JSONObject r9 = r9.getJSONObject(r1)     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = r3.getString(r8)     // Catch: org.json.JSONException -> Lae
            r9.put(r8, r1)     // Catch: org.json.JSONException -> Lae
            goto Lb3
        L81:
            java.math.BigDecimal r8 = new java.math.BigDecimal     // Catch: org.json.JSONException -> Lae
            java.lang.String r9 = "3.0"
            r8.<init>(r9)     // Catch: org.json.JSONException -> Lae
            int r8 = r1.compareTo(r8)     // Catch: org.json.JSONException -> Lae
            if (r8 < 0) goto Lb3
            java.util.Iterator r8 = r3.keys()     // Catch: org.json.JSONException -> Lae
        L92:
            boolean r9 = r8.hasNext()     // Catch: org.json.JSONException -> Lae
            if (r9 == 0) goto Lb3
            java.lang.Object r9 = r8.next()     // Catch: org.json.JSONException -> Lae
            java.lang.String r9 = (java.lang.String) r9     // Catch: org.json.JSONException -> Lae
            boolean r1 = r4.equals(r9)     // Catch: org.json.JSONException -> Lae
            if (r1 != 0) goto L92
            java.lang.Object r1 = r3.get(r9)     // Catch: org.json.JSONException -> Lae
            org.json.JSONObject r2 = r7.a     // Catch: org.json.JSONException -> Lae
            r7.a(r9, r1, r2)     // Catch: org.json.JSONException -> Lae
            goto L92
        Lae:
            java.lang.String r8 = "JSONException when reading the 'appInfos' from InputStream."
            android.util.Log.d(r0, r8)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.b.g.e.i.<init>(java.io.InputStream, java.lang.String):void");
    }

    private void a(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str == null || obj == null || jSONObject == null) {
            return;
        }
        if (!(obj instanceof JSONObject)) {
            jSONObject.put(str, obj);
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }

    @Override // com.huawei.b.g.c
    public String getString(String str, String str2) {
        if (str.endsWith("/")) {
            return str2;
        }
        String[] split = str.split("/");
        try {
            JSONObject jSONObject = this.a;
            for (int i = 1; i < split.length; i++) {
                if (i == split.length - 1) {
                    str = jSONObject.get(split[i]).toString();
                    return str;
                }
                jSONObject = jSONObject.getJSONObject(split[i]);
            }
        } catch (JSONException unused) {
            Log.w("InputStreamReader", "JSONException when reading 'path': " + str);
        }
        return str2;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("InputStreamReader{config=");
        M.append(this.a.toString().hashCode());
        M.append('}');
        return M.toString();
    }
}
