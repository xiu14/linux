package com.bytedance.common.c;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.e;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.A;
import okhttp3.Request;
import okhttp3.s;
import okhttp3.x;

/* loaded from: classes.dex */
public class g extends com.bytedance.common.utility.e {
    private final x b;

    public g() {
        x.b bVar = new x.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.d(15000L, timeUnit);
        bVar.o(15000L, timeUnit);
        bVar.s(15000L, timeUnit);
        this.b = bVar.c();
    }

    private s f(Map<String, String> map) {
        s.a aVar = new s.a();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    aVar.a(key, value);
                }
            }
        }
        return aVar.c();
    }

    private com.bytedance.common.utility.a g(Throwable th) {
        if (!(th instanceof b)) {
            return th instanceof IOException ? new com.bytedance.common.utility.a(0, th.getMessage()) : new com.bytedance.common.utility.a(0, th.getMessage());
        }
        b bVar = (b) th;
        return new com.bytedance.common.utility.a(bVar.a, bVar.getMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:3:0x000c, B:6:0x0016, B:11:0x005e, B:13:0x0062, B:15:0x006a, B:16:0x0071, B:18:0x008b, B:20:0x008f, B:24:0x0097, B:25:0x009c, B:37:0x0057, B:40:0x0053, B:43:0x00ab, B:44:0x00b9), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String h(okhttp3.Request r11) throws java.lang.Throwable {
        /*
            r10 = this;
            okhttp3.x r0 = r10.b
            okhttp3.d r0 = r0.m(r11)
            okhttp3.y r0 = (okhttp3.y) r0
            okhttp3.B r0 = r0.c()
            int r1 = r0.l()     // Catch: java.lang.Throwable -> Lba
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.String r3 = "OkHttpNetworkClient"
            if (r1 != r2) goto Lab
            java.lang.String r1 = "using okhttp successful"
            com.bytedance.push.g0.f.c(r3, r1)     // Catch: java.lang.Throwable -> Lba
            okhttp3.D r1 = r0.a()     // Catch: java.lang.Throwable -> Lba
            java.io.InputStream r1 = r1.a()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r2 = r0.p(r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = "gzip"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = "Content-Type"
            java.lang.String r3 = r0.p(r3)     // Catch: java.lang.Throwable -> Lba
            boolean r4 = com.bytedance.common.c.k.e(r3)     // Catch: java.lang.Throwable -> Lba
            r5 = 0
            if (r3 != 0) goto L3e
            r7 = r5
            goto L5c
        L3e:
            com.bytedance.common.c.c r6 = new com.bytedance.common.c.c     // Catch: java.lang.Throwable -> L50
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = r6.a()     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = "charset"
            java.lang.String r6 = r6.b(r7)     // Catch: java.lang.Throwable -> L4e
            goto L57
        L4e:
            r6 = move-exception
            goto L53
        L50:
            r3 = move-exception
            r6 = r3
            r3 = r5
        L53:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> Lba
            r6 = r5
        L57:
            android.util.Pair r7 = new android.util.Pair     // Catch: java.lang.Throwable -> Lba
            r7.<init>(r3, r6)     // Catch: java.lang.Throwable -> Lba
        L5c:
            if (r7 == 0) goto L6f
            java.lang.Object r3 = r7.second     // Catch: java.lang.Throwable -> Lba
            if (r3 == 0) goto L6f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lba
            boolean r3 = java.nio.charset.Charset.isSupported(r3)     // Catch: java.lang.Throwable -> Lba
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r7.second     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lba
            goto L71
        L6f:
            java.lang.String r3 = "UTF-8"
        L71:
            r6 = 1
            int[] r6 = new int[r6]     // Catch: java.lang.Throwable -> Lba
            r7 = 0
            r6[r7] = r7     // Catch: java.lang.Throwable -> Lba
            okhttp3.t r11 = r11.url()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lba
            r8 = -1
            com.bytedance.common.c.f r9 = new com.bytedance.common.c.f     // Catch: java.lang.Throwable -> Lba
            r9.<init>(r10, r11, r0)     // Catch: java.lang.Throwable -> Lba
            byte[] r11 = com.bytedance.common.c.k.c(r2, r8, r1, r6, r9)     // Catch: java.lang.Throwable -> Lba
            if (r11 == 0) goto La7
            r1 = r6[r7]     // Catch: java.lang.Throwable -> Lba
            if (r1 <= 0) goto La7
            r1 = r6[r7]     // Catch: java.lang.Throwable -> Lba
            int r2 = r11.length     // Catch: java.lang.Throwable -> Lba
            if (r1 <= r2) goto L95
            goto La7
        L95:
            if (r4 == 0) goto L9c
            r1 = r6[r7]     // Catch: java.lang.Throwable -> Lba
            com.bytedance.common.c.k.a(r11, r1)     // Catch: java.lang.Throwable -> Lba
        L9c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lba
            r2 = r6[r7]     // Catch: java.lang.Throwable -> Lba
            r1.<init>(r11, r7, r2, r3)     // Catch: java.lang.Throwable -> Lba
            r0.close()
            return r1
        La7:
            r0.close()
            return r5
        Lab:
            java.lang.String r11 = r0.A()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r2 = "okhttp connection fail"
            com.bytedance.push.g0.f.e(r3, r2)     // Catch: java.lang.Throwable -> Lba
            com.bytedance.common.c.b r2 = new com.bytedance.common.c.b     // Catch: java.lang.Throwable -> Lba
            r2.<init>(r1, r11)     // Catch: java.lang.Throwable -> Lba
            throw r2     // Catch: java.lang.Throwable -> Lba
        Lba:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lc1
            goto Lc5
        Lc1:
            r0 = move-exception
            r11.addSuppressed(r0)
        Lc5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.c.g.h(okhttp3.Request):java.lang.String");
    }

    @Override // com.bytedance.common.utility.e
    public String a(String str, Map<String, String> map, e.a aVar) throws com.bytedance.common.utility.a {
        try {
            if (TextUtils.isDigitsOnly(str)) {
                return null;
            }
            com.ss.android.message.f.a.c(str, new HashMap());
            Request.a aVar2 = new Request.a();
            aVar2.j(str);
            aVar2.c();
            aVar2.e(f(map));
            return h(aVar2.b());
        } catch (Throwable th) {
            throw g(th);
        }
    }

    @Override // com.bytedance.common.utility.e
    public String c(String str, List<Pair<String, String>> list, Map<String, String> map, e.a aVar) throws com.bytedance.common.utility.a {
        try {
            StringBuilder sb = new StringBuilder();
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
        } catch (Throwable th) {
            throw g(th);
        }
    }

    @Override // com.bytedance.common.utility.e
    public String d(String str, byte[] bArr, Map<String, String> map, e.a aVar) throws com.bytedance.common.utility.a {
        try {
            com.ss.android.message.f.a.c(str, new HashMap());
            A d2 = A.d(null, bArr);
            Request.a aVar2 = new Request.a();
            aVar2.j(str);
            aVar2.f("POST", d2);
            aVar2.e(f(map));
            return h(aVar2.b());
        } catch (Throwable th) {
            throw g(th);
        }
    }
}
