package com.bytedance.bdinstall.m0;

import android.content.Context;
import com.bytedance.bdinstall.m0.m;

/* loaded from: classes.dex */
public class s implements m {

    static class a extends m.a {
        a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.bytedance.bdinstall.m0.m
    @androidx.annotation.RequiresApi(api = 24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.bdinstall.m0.m.a a(android.content.Context r4) {
        /*
            r3 = this;
            com.bytedance.bdinstall.m0.s$a r0 = new com.bytedance.bdinstall.m0.s$a
            r0.<init>()
            r1 = 0
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L24
            java.lang.String r2 = "content://com.pico.idprovider"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L24
            android.content.ContentProviderClient r4 = r4.acquireUnstableContentProviderClient(r2)     // Catch: java.lang.Throwable -> L22 android.os.RemoteException -> L24
            java.lang.String r2 = "request_oaid"
            android.os.Bundle r2 = r4.call(r2, r1, r1)     // Catch: android.os.RemoteException -> L20 java.lang.Throwable -> L43
            if (r4 == 0) goto L2f
            r4.close()
            goto L2f
        L20:
            r2 = move-exception
            goto L26
        L22:
            r0 = move-exception
            goto L45
        L24:
            r2 = move-exception
            r4 = r1
        L26:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L2e
            r4.close()
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L42
            java.lang.String r4 = "oaid"
            java.lang.String r4 = r2.getString(r4, r1)
            r0.a = r4
            r4 = 0
            java.lang.String r1 = "forbidden"
            boolean r4 = r2.getBoolean(r1, r4)
            r0.b = r4
        L42:
            return r0
        L43:
            r0 = move-exception
            r1 = r4
        L45:
            if (r1 == 0) goto L4a
            r1.close()
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.m0.s.a(android.content.Context):com.bytedance.bdinstall.m0.m$a");
    }

    @Override // com.bytedance.bdinstall.m0.m
    public boolean b(Context context) {
        return true;
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "Pico";
    }
}
