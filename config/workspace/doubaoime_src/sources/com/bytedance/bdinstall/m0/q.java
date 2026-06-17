package com.bytedance.bdinstall.m0;

import android.content.Context;
import android.os.SystemProperties;
import com.vivo.push.PushClient;

/* loaded from: classes.dex */
final class q implements m {
    private static final com.bytedance.bdinstall.util.p<Boolean> a = new a();

    static class a extends com.bytedance.bdinstall.util.p<Boolean> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected Boolean a(Object[] objArr) {
            return Boolean.valueOf(PushClient.DEFAULT_REQUEST_ID.equals(q.d("persist.sys.identifierid.supported", "0")));
        }
    }

    q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, String str2) {
        try {
            return SystemProperties.get(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    static boolean e() {
        return a.b(new Object[0]).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.bdinstall.m0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.bdinstall.m0.m.a a(android.content.Context r11) {
        /*
            r10 = this;
            com.bytedance.bdinstall.m0.m$a r0 = new com.bytedance.bdinstall.m0.m$a
            r0.<init>()
            java.lang.String r1 = "OaidVivo#query close cursor exception."
            r2 = 0
            java.lang.String r3 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r5 = android.net.Uri.parse(r3)
            if (r5 == 0) goto L9d
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            if (r11 == 0) goto L31
            boolean r3 = r11.moveToNext()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L7f
            if (r3 == 0) goto L31
            java.lang.String r3 = "value"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L7f
            java.lang.String r2 = r11.getString(r3)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L7f
            goto L31
        L2f:
            r3 = move-exception
            goto L51
        L31:
            if (r11 == 0) goto L9d
            r11.close()     // Catch: java.lang.Exception -> L37
            goto L9d
        L37:
            r11 = move-exception
            r11.printStackTrace()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r11)
            r3.toString()
            int r11 = com.bytedance.bdinstall.C0640u.a
            goto L9d
        L4c:
            r11 = move-exception
            goto L82
        L4e:
            r11 = move-exception
            r3 = r11
            r11 = r2
        L51:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L7f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r4.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "OaidVivo#query"
            r4.append(r5)     // Catch: java.lang.Throwable -> L7f
            r4.append(r3)     // Catch: java.lang.Throwable -> L7f
            r4.toString()     // Catch: java.lang.Throwable -> L7f
            int r3 = com.bytedance.bdinstall.C0640u.a     // Catch: java.lang.Throwable -> L7f
            if (r11 == 0) goto L9d
            r11.close()     // Catch: java.lang.Exception -> L6c
            goto L9d
        L6c:
            r11 = move-exception
            r11.printStackTrace()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r11)
            r3.toString()
            goto L9d
        L7f:
            r0 = move-exception
            r2 = r11
            r11 = r0
        L82:
            if (r2 == 0) goto L9c
            r2.close()     // Catch: java.lang.Exception -> L88
            goto L9c
        L88:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            r2.toString()
            int r0 = com.bytedance.bdinstall.C0640u.a
        L9c:
            throw r11
        L9d:
            r0.a = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.m0.q.a(android.content.Context):com.bytedance.bdinstall.m0.m$a");
    }

    @Override // com.bytedance.bdinstall.m0.m
    public boolean b(Context context) {
        return a.b(new Object[0]).booleanValue();
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "Vivo";
    }
}
