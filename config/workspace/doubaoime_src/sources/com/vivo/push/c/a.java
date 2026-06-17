package com.vivo.push.c;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.t;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a {
    private Context a;
    private HashMap<String, String> b = new HashMap<>();

    public a(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba A[Catch: Exception -> 0x00b6, TRY_LEAVE, TryCatch #4 {Exception -> 0x00b6, blocks: (B:74:0x00b2, B:67:0x00ba), top: B:73:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int g() {
        /*
            r12 = this;
            java.lang.String r0 = "close err "
            java.lang.String r1 = "CoreConfigManager"
            android.content.Context r2 = r12.a
            if (r2 != 0) goto Lb
            r0 = 8002(0x1f42, float:1.1213E-41)
            return r0
        Lb:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r12.b
            int r2 = r2.size()
            r3 = 0
            if (r2 <= 0) goto L15
            return r3
        L15:
            r2 = 0
            android.content.Context r4 = r12.a     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L94
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L94
            android.net.Uri r11 = com.vivo.push.x.a     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L94
            android.content.ContentProviderClient r4 = r4.acquireUnstableContentProviderClient(r11)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L94
            if (r4 == 0) goto L2e
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            r6 = r11
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
        L2e:
            if (r2 != 0) goto L42
            android.content.Context r5 = r12.a     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r11
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            goto L42
        L40:
            r3 = move-exception
            goto L96
        L42:
            if (r2 != 0) goto L5d
            java.lang.String r3 = "cursor is null"
            com.vivo.push.util.t.a(r1, r3)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.lang.Exception -> L4f
            goto L51
        L4f:
            r2 = move-exception
            goto L57
        L51:
            if (r4 == 0) goto L5a
            r4.close()     // Catch: java.lang.Exception -> L4f
            goto L5a
        L57:
            com.vivo.push.util.t.a(r1, r0, r2)
        L5a:
            r0 = 8008(0x1f48, float:1.1222E-41)
            return r0
        L5d:
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            if (r5 == 0) goto L83
            java.lang.String r5 = "name"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            java.lang.String r6 = "value"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            java.lang.String r6 = r2.getString(r6)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            if (r7 != 0) goto L5d
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r12.b     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            r7.put(r5, r6)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> Laf
            goto L5d
        L83:
            r2.close()     // Catch: java.lang.Exception -> L8c
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.lang.Exception -> L8c
            goto L90
        L8c:
            r2 = move-exception
            com.vivo.push.util.t.a(r1, r0, r2)
        L90:
            return r3
        L91:
            r3 = move-exception
            r4 = r2
            goto Lb0
        L94:
            r3 = move-exception
            r4 = r2
        L96:
            java.lang.String r5 = "provider exception"
            com.vivo.push.util.t.a(r1, r5, r3)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto La3
            r2.close()     // Catch: java.lang.Exception -> La1
            goto La3
        La1:
            r2 = move-exception
            goto La9
        La3:
            if (r4 == 0) goto Lac
            r4.close()     // Catch: java.lang.Exception -> La1
            goto Lac
        La9:
            com.vivo.push.util.t.a(r1, r0, r2)
        Lac:
            r0 = 8005(0x1f45, float:1.1217E-41)
            return r0
        Laf:
            r3 = move-exception
        Lb0:
            if (r2 == 0) goto Lb8
            r2.close()     // Catch: java.lang.Exception -> Lb6
            goto Lb8
        Lb6:
            r2 = move-exception
            goto Lbe
        Lb8:
            if (r4 == 0) goto Lc1
            r4.close()     // Catch: java.lang.Exception -> Lb6
            goto Lc1
        Lbe:
            com.vivo.push.util.t.a(r1, r0, r2)
        Lc1:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.g():int");
    }

    public final int a() {
        int b = b(1);
        t.d("CoreConfigManager", "isSupportNewControlStrategies : ".concat(String.valueOf(b)));
        return b;
    }

    public final int b() {
        int b = b(4);
        t.d("CoreConfigManager", "isSupportSyncProfileInfo : ".concat(String.valueOf(b)));
        return b;
    }

    public final boolean c() {
        int b = b(8);
        t.d("CoreConfigManager", "isSupportdeleteRegid : ".concat(String.valueOf(b)));
        return b == 0;
    }

    public final boolean d() {
        int b = b(16);
        t.d("CoreConfigManager", "isSupportQueryCurrentAppState : ".concat(String.valueOf(b)));
        return b == 0;
    }

    public final boolean e() {
        int b = b(32);
        t.d("CoreConfigManager", "isSupportCreateNotifyChannel : ".concat(String.valueOf(b)));
        return b == 0;
    }

    public final boolean f() {
        int b = b(128);
        t.d("CoreConfigManager", "isSupportAliasSubscribeCheck : ".concat(String.valueOf(b)));
        return b == 0;
    }

    private int b(int i) {
        int g2 = g();
        if (g2 != 0) {
            return g2;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap == null || hashMap.size() == 0) {
            return 8006;
        }
        String str = this.b.get("pushSupport");
        if (TextUtils.isEmpty(str)) {
            return 2;
        }
        try {
            return (i & Integer.parseInt(str)) > 0 ? 0 : 1;
        } catch (Exception unused) {
            return 8007;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r10 != 4096) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r10) {
        /*
            r9 = this;
            int r0 = r9.b(r10)
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 2048(0x800, float:2.87E-42)
            r2 = 1024(0x400, float:1.435E-42)
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 512(0x200, float:7.175E-43)
            r5 = 256(0x100, float:3.59E-43)
            r6 = 0
            if (r10 == r5) goto L20
            if (r10 == r4) goto L20
            if (r10 == r3) goto L20
            if (r10 == r2) goto L20
            if (r10 != r0) goto L1e
            goto L20
        L1e:
            r7 = r6
            goto L21
        L20:
            r7 = r1
        L21:
            if (r7 == 0) goto L61
            android.content.Context r7 = r9.a
            java.lang.String r7 = com.vivo.push.util.aa.a(r7)
            java.lang.String r8 = "com.vivo.pushservice"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L61
            android.content.Context r7 = r9.a
            long r7 = com.vivo.push.util.ah.a(r7)
            if (r10 == r5) goto L5a
            if (r10 == r4) goto L52
            if (r10 == r2) goto L4a
            if (r10 == r0) goto L42
            if (r10 == r3) goto L52
            goto L61
        L42:
            r2 = 4400(0x1130, double:2.174E-320)
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 < 0) goto L49
            return r1
        L49:
            return r6
        L4a:
            r2 = 4200(0x1068, double:2.075E-320)
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 < 0) goto L51
            return r1
        L51:
            return r6
        L52:
            r2 = 4100(0x1004, double:2.0257E-320)
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 < 0) goto L59
            return r1
        L59:
            return r6
        L5a:
            r2 = 3700(0xe74, double:1.828E-320)
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 < 0) goto L61
            return r1
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.a(int):boolean");
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x009f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:60:0x009f */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: Exception -> 0x0089, TRY_ENTER, TryCatch #1 {Exception -> 0x0089, blocks: (B:27:0x0080, B:29:0x0085, B:37:0x0095, B:39:0x009a), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: Exception -> 0x0089, TRY_LEAVE, TryCatch #1 {Exception -> 0x0089, blocks: (B:27:0x0080, B:29:0x0085, B:37:0x0095, B:39:0x009a), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "queryFromCoreSdk close error"
            r1 = 0
            java.lang.String r2 = "CoreConfigManager"
            if (r14 != 0) goto L16
            java.lang.String r14 = "queryFromCoreSdk context is null"
            com.vivo.push.util.t.a(r2, r14)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L11
            return r1
        Ld:
            r14 = move-exception
            r3 = r1
            goto La0
        L11:
            r14 = move-exception
            r3 = r1
            r13 = r3
            goto L8e
        L16:
            android.content.ContentResolver r3 = r14.getContentResolver()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L11
            android.net.Uri r10 = com.vivo.push.x.f8939f     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L11
            android.content.ContentProviderClient r3 = r3.acquireUnstableContentProviderClient(r10)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L11
            r11 = 0
            r12 = 1
            if (r3 == 0) goto L3f
            java.lang.String r4 = "queryFromCoreSdk client is null"
            com.vivo.push.util.t.a(r2, r4)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            r6 = 0
            java.lang.String r7 = "queryParameter = ?  "
            java.lang.String[] r8 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            r8[r11] = r15     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            r9 = 0
            r4 = r3
            r5 = r10
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            r13 = r4
            goto L40
        L39:
            r14 = move-exception
            goto La0
        L3c:
            r14 = move-exception
            r13 = r1
            goto L8e
        L3f:
            r13 = r1
        L40:
            if (r13 != 0) goto L57
            android.content.ContentResolver r4 = r14.getContentResolver()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L9e
            r6 = 0
            java.lang.String r7 = "queryParameter = ?  "
            java.lang.String[] r8 = new java.lang.String[r12]     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L9e
            r8[r11] = r15     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L9e
            r9 = 0
            r5 = r10
            android.database.Cursor r14 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L9e
            r13 = r14
            goto L57
        L55:
            r14 = move-exception
            goto L8e
        L57:
            if (r13 != 0) goto L70
            java.lang.String r14 = "queryFromCoreSdk cursor is null"
            com.vivo.push.util.t.a(r2, r14)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L9e
            if (r13 == 0) goto L66
            r13.close()     // Catch: java.lang.Exception -> L64
            goto L66
        L64:
            r14 = move-exception
            goto L6c
        L66:
            if (r3 == 0) goto L6f
            r3.close()     // Catch: java.lang.Exception -> L64
            goto L6f
        L6c:
            com.vivo.push.util.t.a(r2, r0, r14)
        L6f:
            return r1
        L70:
            boolean r14 = r13.moveToFirst()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L9e
            if (r14 == 0) goto L80
            java.lang.String r14 = "queryAppState"
            int r14 = r13.getColumnIndex(r14)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L9e
            java.lang.String r1 = r13.getString(r14)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L9e
        L80:
            r13.close()     // Catch: java.lang.Exception -> L89
            if (r3 == 0) goto L9d
            r3.close()     // Catch: java.lang.Exception -> L89
            goto L9d
        L89:
            r14 = move-exception
            com.vivo.push.util.t.a(r2, r0, r14)
            goto L9d
        L8e:
            java.lang.String r15 = "queryFromCoreSdk error "
            com.vivo.push.util.t.a(r2, r15, r14)     // Catch: java.lang.Throwable -> L9e
            if (r13 == 0) goto L98
            r13.close()     // Catch: java.lang.Exception -> L89
        L98:
            if (r3 == 0) goto L9d
            r3.close()     // Catch: java.lang.Exception -> L89
        L9d:
            return r1
        L9e:
            r14 = move-exception
            r1 = r13
        La0:
            if (r1 == 0) goto La8
            r1.close()     // Catch: java.lang.Exception -> La6
            goto La8
        La6:
            r15 = move-exception
            goto Lae
        La8:
            if (r3 == 0) goto Lb1
            r3.close()     // Catch: java.lang.Exception -> La6
            goto Lb1
        Lae:
            com.vivo.push.util.t.a(r2, r0, r15)
        Lb1:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.a(android.content.Context, java.lang.String):java.lang.String");
    }
}
