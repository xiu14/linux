package com.bytedance.apm.util;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes.dex */
public class n {
    private static Properties a;

    public static String a(String str, Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                str = e.a.a.a.a.s(str, "?");
            }
            if (str.endsWith("?")) {
                StringBuilder M = e.a.a.a.a.M(str);
                M.append(b("sdk_version", "UTF-8"));
                M.append(ContainerUtils.KEY_VALUE_DELIMITER);
                M.append(b(String.valueOf(400), "UTF-8"));
                str = M.toString();
            } else {
                StringBuilder S = e.a.a.a.a.S(str, ContainerUtils.FIELD_DELIMITER);
                S.append(b("sdk_version", "UTF-8"));
                S.append(ContainerUtils.KEY_VALUE_DELIMITER);
                S.append(b(String.valueOf(400), "UTF-8"));
                str = S.toString();
            }
            if (map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        if (str.endsWith("?")) {
                            StringBuilder M2 = e.a.a.a.a.M(str);
                            M2.append(b(entry.getKey().toString(), "UTF-8"));
                            M2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            M2.append(b(map.get(entry.getKey()).toString(), "UTF-8"));
                            str = M2.toString();
                        } else {
                            StringBuilder S2 = e.a.a.a.a.S(str, ContainerUtils.FIELD_DELIMITER);
                            S2.append(b(entry.getKey().toString(), "UTF-8"));
                            S2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            S2.append(b(map.get(entry.getKey()).toString(), "UTF-8"));
                            str = S2.toString();
                        }
                    }
                }
            }
        }
        return str;
    }

    private static String b(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c() {
        /*
            java.lang.String r0 = "release_build"
            android.content.Context r1 = com.bytedance.apm.g.h()
            java.util.Properties r2 = com.bytedance.apm.util.n.a
            r3 = 0
            if (r2 != 0) goto L2e
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            com.bytedance.apm.util.n.a = r2
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L28
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "slardar.properties"
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.lang.Throwable -> L28
            java.util.Properties r2 = com.bytedance.apm.util.n.a     // Catch: java.lang.Throwable -> L29
            r2.load(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2e
            goto L2b
        L28:
            r1 = r3
        L29:
            if (r1 == 0) goto L2e
        L2b:
            r1.close()     // Catch: java.lang.Throwable -> L2e
        L2e:
            java.util.Properties r1 = com.bytedance.apm.util.n.a     // Catch: java.lang.Exception -> L3c
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Exception -> L3c
            if (r1 == 0) goto L3c
            java.util.Properties r1 = com.bytedance.apm.util.n.a     // Catch: java.lang.Exception -> L3c
            java.lang.Object r3 = r1.get(r0)     // Catch: java.lang.Exception -> L3c
        L3c:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.n.c():java.lang.String");
    }
}
