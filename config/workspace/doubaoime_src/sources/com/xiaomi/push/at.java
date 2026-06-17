package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.vivo.push.PushClient;

/* loaded from: classes2.dex */
class at implements al {
    private static String a = "content://com.vivo.vms.IdProvider/IdentifierId/";
    private static String b = e.a.a.a.a.J(new StringBuilder(), a, "OAID");

    /* renamed from: c, reason: collision with root package name */
    private static String f8988c = e.a.a.a.a.J(new StringBuilder(), a, "VAID_");

    /* renamed from: d, reason: collision with root package name */
    private static String f8989d = e.a.a.a.a.J(new StringBuilder(), a, "AAID_");

    /* renamed from: e, reason: collision with root package name */
    private static String f8990e = e.a.a.a.a.J(new StringBuilder(), a, "OAIDSTATUS");

    /* renamed from: f, reason: collision with root package name */
    private static String f8991f = "persist.sys.identifierid.supported";

    /* renamed from: a, reason: collision with other field name */
    private Context f130a;

    public at(Context context) {
        this.f130a = context;
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public boolean mo102a() {
        return PushClient.DEFAULT_REQUEST_ID.equals(C0779r.a(f8991f, "0"));
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public String mo101a() {
        return a(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r10 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r10 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.f130a     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L38
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L38
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L38
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L38
            if (r10 == 0) goto L28
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L39
            if (r1 == 0) goto L28
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L39
            java.lang.String r0 = r10.getString(r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L39
            goto L28
        L26:
            r0 = move-exception
            goto L32
        L28:
            if (r10 == 0) goto L3c
        L2a:
            r10.close()
            goto L3c
        L2e:
            r10 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L32:
            if (r10 == 0) goto L37
            r10.close()
        L37:
            throw r0
        L38:
            r10 = r0
        L39:
            if (r10 == 0) goto L3c
            goto L2a
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.at.a(java.lang.String):java.lang.String");
    }

    public static boolean a(Context context) {
        try {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(a).getAuthority(), 128);
            if (resolveContentProvider != null) {
                if ((resolveContentProvider.applicationInfo.flags & 1) != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
