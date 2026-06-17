package ms.bd.c;

import java.util.HashSet;

/* loaded from: classes2.dex */
public final class q1 {
    public static int b;

    /* renamed from: c, reason: collision with root package name */
    public static int f10434c;
    public final int a;

    public q1(int i) {
        this.a = i;
    }

    public static HashSet a() {
        HashSet hashSet = new HashSet();
        hashSet.add((String) y2.a(16777217, 0, 0L, "840171", new byte[]{42, 57, 78, 11, 28, 35, 53, 22, 100, 111, 61, 120, 78, 72}));
        hashSet.add((String) y2.a(16777217, 0, 0L, "e2c42b", new byte[]{119, 63, 29, 14, 25, 112, 104, 16, 55, 106, 96, 126, 29, 79, 15, 124, 106, 22, 35, 117}));
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008e A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:8:0x001c, B:10:0x0020, B:11:0x0079, B:12:0x007b, B:14:0x008e, B:16:0x0098, B:17:0x0099, B:18:0x00b8, B:22:0x009e, B:23:0x0050, B:25:0x0056, B:26:0x005b), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:8:0x001c, B:10:0x0020, B:11:0x0079, B:12:0x007b, B:14:0x008e, B:16:0x0098, B:17:0x0099, B:18:0x00b8, B:22:0x009e, B:23:0x0050, B:25:0x0056, B:26:0x005b), top: B:7:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ms.bd.c.p1 b(android.content.Context r18, android.content.pm.ResolveInfo r19, java.lang.String r20) {
        /*
            r17 = this;
            r0 = r19
            android.content.pm.PackageManager r1 = r18.getPackageManager()     // Catch: java.lang.Exception -> Lbb
            ms.bd.c.p1 r2 = new ms.bd.c.p1     // Catch: java.lang.Exception -> Lbb
            r3 = r20
            r2.<init>(r3)     // Catch: java.lang.Exception -> Lbb
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lbb
            r4 = 29
            r5 = 3
            r6 = 79
            r7 = 4
            r8 = 2
            r9 = 0
            r10 = 1
            if (r3 != r4) goto L4e
            r3 = r17
            int r4 = r3.a     // Catch: java.lang.Exception -> Lbd
            if (r4 != r10) goto L50
            r11 = 16777217(0x1000001, float:2.350989E-38)
            r12 = 0
            r13 = 0
            java.lang.String r15 = "6fa5ff"
            r1 = 7
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> Lbd
            r4 = 50
            r1[r9] = r4     // Catch: java.lang.Exception -> Lbd
            r4 = 106(0x6a, float:1.49E-43)
            r1[r10] = r4     // Catch: java.lang.Exception -> Lbd
            r4 = 25
            r1[r8] = r4     // Catch: java.lang.Exception -> Lbd
            r1[r5] = r6     // Catch: java.lang.Exception -> Lbd
            r4 = 86
            r1[r7] = r4     // Catch: java.lang.Exception -> Lbd
            r4 = 102(0x66, float:1.43E-43)
            r5 = 5
            r1[r5] = r4     // Catch: java.lang.Exception -> Lbd
            r4 = 59
            r5 = 6
            r1[r5] = r4     // Catch: java.lang.Exception -> Lbd
            r16 = r1
            java.lang.Object r1 = ms.bd.c.y2.a(r11, r12, r13, r15, r16)     // Catch: java.lang.Exception -> Lbd
            goto L79
        L4e:
            r3 = r17
        L50:
            java.lang.CharSequence r1 = r0.loadLabel(r1)     // Catch: java.lang.Exception -> Lbd
            if (r1 == 0) goto L5b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lbd
            goto L7b
        L5b:
            r11 = 16777217(0x1000001, float:2.350989E-38)
            r12 = 0
            r13 = 0
            java.lang.String r15 = "0b06c6"
            byte[] r1 = new byte[r7]     // Catch: java.lang.Exception -> Lbd
            r4 = 47
            r1[r9] = r4     // Catch: java.lang.Exception -> Lbd
            r4 = 117(0x75, float:1.64E-43)
            r1[r10] = r4     // Catch: java.lang.Exception -> Lbd
            r1[r8] = r6     // Catch: java.lang.Exception -> Lbd
            r4 = 78
            r1[r5] = r4     // Catch: java.lang.Exception -> Lbd
            r16 = r1
            java.lang.Object r1 = ms.bd.c.y2.a(r11, r12, r13, r15, r16)     // Catch: java.lang.Exception -> Lbd
        L79:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lbd
        L7b:
            r2.b = r1     // Catch: java.lang.Exception -> Lbd
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.Exception -> Lbd
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = r0.sourceDir     // Catch: java.lang.Exception -> Lbd
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Lbd
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lbd
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto L9e
            long r0 = r1.lastModified()     // Catch: java.lang.Exception -> Lbd
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L99
            long r0 = r0 / r4
        L99:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Lbd
            goto Lb8
        L9e:
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r6 = 0
            java.lang.String r0 = "23d600"
            byte[] r1 = new byte[r8]     // Catch: java.lang.Exception -> Lbd
            r8 = 110(0x6e, float:1.54E-43)
            r1[r9] = r8     // Catch: java.lang.Exception -> Lbd
            r8 = 96
            r1[r10] = r8     // Catch: java.lang.Exception -> Lbd
            r8 = r0
            r9 = r1
            java.lang.Object r0 = ms.bd.c.y2.a(r4, r5, r6, r8, r9)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lbd
        Lb8:
            r2.f10427c = r0     // Catch: java.lang.Exception -> Lbd
            return r2
        Lbb:
            r3 = r17
        Lbd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.q1.b(android.content.Context, android.content.pm.ResolveInfo, java.lang.String):ms.bd.c.p1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONArray c(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.q1.c(android.content.Context):org.json.JSONArray");
    }
}
