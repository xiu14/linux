package com.bytedance.ttnet.i;

import com.bytedance.frameworks.baselib.network.http.g;
import java.net.HttpURLConnection;

/* loaded from: classes2.dex */
public class c {

    class a implements g {
        final /* synthetic */ String a;
        final /* synthetic */ HttpURLConnection b;

        a(String str, HttpURLConnection httpURLConnection) {
            this.a = str;
            this.b = httpURLConnection;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.g
        public void a() {
            try {
                HttpURLConnection httpURLConnection = this.b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff A[Catch: all -> 0x022a, TryCatch #5 {all -> 0x022a, blocks: (B:25:0x00ae, B:28:0x00cc, B:30:0x00e8, B:31:0x00f0, B:33:0x00f6, B:35:0x010c, B:37:0x0116, B:39:0x011c, B:40:0x0124, B:42:0x012a, B:45:0x013c, B:50:0x014a, B:52:0x014e, B:53:0x0153, B:55:0x0189, B:59:0x01c7, B:61:0x01cb, B:63:0x01d3, B:66:0x01dd, B:68:0x01f3, B:70:0x01f7, B:74:0x01ff, B:75:0x0204, B:91:0x01c0, B:94:0x01bc, B:98:0x0213, B:99:0x0229), top: B:24:0x00ae }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12, com.bytedance.ttnet.i.a r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.i.c.a(java.lang.String, java.util.Map, java.util.Map, com.bytedance.ttnet.i.a):java.lang.String");
    }
}
