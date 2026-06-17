package ms.bd.c;

import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class w {
    public static final String a = (String) y2.a(16777217, 0, 0, "bebbe2", new byte[]{67, 117, 30, 21, 95, 54, 114, 75, 33});
    public static final String b = (String) y2.a(16777217, 0, 0, "b6fd29", new byte[]{91, 53, 7, 20, 26, 47, 115, 18});

    /* renamed from: c, reason: collision with root package name */
    public static final String f10465c = (String) y2.a(16777217, 0, 0, "601904", new byte[]{1, 55, 67, 89, 26, 49, 48, 2});

    /* renamed from: d, reason: collision with root package name */
    public static final String f10466d = (String) y2.a(16777217, 0, 0, "e10e0f", new byte[]{100, 48});

    /* renamed from: e, reason: collision with root package name */
    public static final String f10467e = (String) y2.a(16777217, 0, 0, "8e5057", new byte[]{33, 112});

    /* renamed from: f, reason: collision with root package name */
    public static final String f10468f = (String) y2.a(16777217, 0, 0, "429469", new byte[]{35, 36});

    /* renamed from: g, reason: collision with root package name */
    public static final String f10469g = (String) y2.a(16777217, 0, 0, "bce5cc", new byte[]{126, 96, 14});
    public static final String h = (String) y2.a(16777217, 0, 0, "0cbe0d", new byte[]{44, 104, 31});
    public static final String i = (String) y2.a(16777217, 0, 0, "228340", new byte[]{32, 63, 89, 66});
    public static final v j = new v();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        if (r11 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r11) {
        /*
            r0 = 117(0x75, float:1.64E-43)
            r1 = 0
            r2 = 1
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L3a
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L3a
            boolean r11 = r4.exists()     // Catch: java.lang.Throwable -> L3a
            if (r11 != 0) goto L23
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.String r9 = "428dba"
            byte[] r10 = new byte[r2]     // Catch: java.lang.Throwable -> L3a
            r10[r1] = r0     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r11 = ms.bd.c.y2.a(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L3a
            return r11
        L23:
            java.io.FileReader r11 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3a
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L3c
            r4.close()     // Catch: java.lang.Throwable -> L34
        L34:
            r11.close()     // Catch: java.lang.Throwable -> L44
            goto L44
        L38:
            r4 = r3
            goto L3c
        L3a:
            r11 = r3
            r4 = r11
        L3c:
            if (r4 == 0) goto L41
            r4.close()     // Catch: java.lang.Throwable -> L41
        L41:
            if (r11 == 0) goto L44
            goto L34
        L44:
            if (r3 != 0) goto L59
            byte[] r9 = new byte[r2]
            r9[r1] = r0
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.String r8 = "4ff34b"
            java.lang.Object r11 = ms.bd.c.y2.a(r4, r5, r6, r8, r9)
            java.lang.String r11 = (java.lang.String) r11
            goto L5d
        L59:
            java.lang.String r11 = r3.trim()
        L5d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.w.a(java.lang.String):java.lang.String");
    }

    public static String b(HashMap hashMap, String str) {
        String str2;
        try {
            str2 = (String) hashMap.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (r2 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap c() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> La5
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r7 = "d9f117"
            r8 = 13
            byte[] r9 = new byte[r8]     // Catch: java.lang.Throwable -> La5
            r10 = 58
            r11 = 0
            r9[r11] = r10     // Catch: java.lang.Throwable -> La5
            r10 = 43
            r12 = 1
            r9[r12] = r10     // Catch: java.lang.Throwable -> La5
            r10 = 7
            r13 = 2
            r9[r13] = r10     // Catch: java.lang.Throwable -> La5
            r14 = 74
            r15 = 3
            r9[r15] = r14     // Catch: java.lang.Throwable -> La5
            r14 = 4
            r9[r14] = r8     // Catch: java.lang.Throwable -> La5
            r8 = 111(0x6f, float:1.56E-43)
            r14 = 5
            r9[r14] = r8     // Catch: java.lang.Throwable -> La5
            r8 = 100
            r14 = 6
            r9[r14] = r8     // Catch: java.lang.Throwable -> La5
            r8 = 8
            r9[r10] = r8     // Catch: java.lang.Throwable -> La5
            r10 = 34
            r9[r8] = r10     // Catch: java.lang.Throwable -> La5
            r8 = 104(0x68, float:1.46E-43)
            r10 = 9
            r9[r10] = r8     // Catch: java.lang.Throwable -> La5
            r8 = 123(0x7b, float:1.72E-43)
            r10 = 10
            r9[r10] = r8     // Catch: java.lang.Throwable -> La5
            r8 = 61
            r10 = 11
            r9[r10] = r8     // Catch: java.lang.Throwable -> La5
            r8 = 26
            r10 = 12
            r9[r10] = r8     // Catch: java.lang.Throwable -> La5
            r8 = r9
            java.lang.Object r3 = ms.bd.c.y2.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> La5
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La5
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La6
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La6
        L63:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L70
            r3.close()     // Catch: java.lang.Throwable -> L6c
        L6c:
            r2.close()     // Catch: java.lang.Throwable -> Lae
            goto Lae
        L70:
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.String r8 = "31ab79"
            byte[] r9 = new byte[r12]     // Catch: java.lang.Throwable -> La3
            r10 = 120(0x78, float:1.68E-43)
            r9[r11] = r10     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = ms.bd.c.y2.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> La3
            java.lang.String[] r1 = r1.split(r4, r13)     // Catch: java.lang.Throwable -> La3
            int r4 = r1.length     // Catch: java.lang.Throwable -> La3
            if (r4 >= r13) goto L8c
            goto L63
        L8c:
            r4 = r1[r11]     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> La3
            r1 = r1[r12]     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> La3
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> La3
            if (r5 == 0) goto L9f
            goto L63
        L9f:
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> La3
            goto L63
        La3:
            r1 = r3
            goto La6
        La5:
            r2 = r1
        La6:
            if (r1 == 0) goto Lab
            r1.close()     // Catch: java.lang.Throwable -> Lab
        Lab:
            if (r2 == 0) goto Lae
            goto L6c
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.w.c():java.util.HashMap");
    }
}
