package com.ss.ugc.effectplatform.util;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b {
    private static Map<String, Object> a = new ConcurrentHashMap();

    public static class a {
        private long a;

        public long b() {
            return this.a;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static int b(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r1 = r1[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        a(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c() {
        /*
            java.util.Map<java.lang.String, java.lang.Object> r0 = com.ss.ugc.effectplatform.util.b.a
            java.lang.String r1 = "cache_key_cpu_model"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            java.lang.Class<com.ss.ugc.effectplatform.util.b> r0 = com.ss.ugc.effectplatform.util.b.class
            monitor-enter(r0)
            r1 = 0
            java.lang.String r2 = ":"
            java.lang.String r3 = "/proc/cpuinfo"
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            if (r4 == 0) goto L51
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
        L2a:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6b
            if (r1 == 0) goto L4d
            boolean r3 = r1.contains(r2)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6b
            if (r3 == 0) goto L2a
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6b
            r3 = 0
            r3 = r1[r3]     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6b
            java.lang.String r5 = "Hardware"
            boolean r3 = r3.contains(r5)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6b
            if (r3 == 0) goto L2a
            r2 = 1
            r1 = r1[r2]     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6b
            a(r4)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)
            goto L63
        L4d:
            r1 = r4
            goto L51
        L4f:
            r1 = move-exception
            goto L5a
        L51:
            a(r1)     // Catch: java.lang.Throwable -> L72
            goto L60
        L55:
            r2 = move-exception
            goto L6e
        L57:
            r2 = move-exception
            r4 = r1
            r1 = r2
        L5a:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L6b
            a(r4)     // Catch: java.lang.Throwable -> L72
        L60:
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)
        L63:
            java.util.Map<java.lang.String, java.lang.Object> r0 = com.ss.ugc.effectplatform.util.b.a
            java.lang.String r2 = "cache_key_cpu_model"
            r0.put(r2, r1)
            return r1
        L6b:
            r1 = move-exception
            r2 = r1
            r1 = r4
        L6e:
            a(r1)     // Catch: java.lang.Throwable -> L72
            throw r2     // Catch: java.lang.Throwable -> L72
        L72:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.b.c():java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|(2:7|8)|(12:10|11|(5:41|42|(5:44|45|46|47|48)|56|48)|13|14|15|(5:17|18|(5:22|23|24|25|26)|20|21)|39|18|(0)|20|21)|60|11|(0)|13|14|15|(0)|39|18|(0)|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #1 {Exception -> 0x006e, blocks: (B:15:0x005b, B:17:0x0068), top: B:14:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.ugc.effectplatform.util.b.a d(android.content.Context r12) {
        /*
            java.util.Map<java.lang.String, java.lang.Object> r0 = com.ss.ugc.effectplatform.util.b.a
            java.lang.String r1 = "cache_key_memory_info"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Ld
            com.ss.ugc.effectplatform.util.b$a r0 = (com.ss.ugc.effectplatform.util.b.a) r0
            return r0
        Ld:
            java.lang.String r0 = "activity"
            com.ss.ugc.effectplatform.util.b$a r2 = new com.ss.ugc.effectplatform.util.b$a
            r2.<init>()
            r3 = -1
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = r12.getSystemService(r0)     // Catch: java.lang.Exception -> L29
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6     // Catch: java.lang.Exception -> L29
            if (r6 == 0) goto L29
            r6.getMemoryInfo(r5)     // Catch: java.lang.Exception -> L29
            long r5 = r5.totalMem     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r5 = r3
        L2a:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            java.lang.String r8 = "/proc/meminfo"
            r9 = 0
            if (r7 != 0) goto L58
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L54
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L54
            boolean r7 = r7.exists()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L54
            if (r7 == 0) goto L54
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L54
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L54
            java.lang.String r10 = "MemTotal"
            int r5 = e(r10, r7)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L55
            long r5 = (long) r5
            r10 = 1024(0x400, double:5.06E-321)
            long r5 = r5 * r10
            goto L55
        L4c:
            r12 = move-exception
            r9 = r7
            goto L50
        L4f:
            r12 = move-exception
        L50:
            a(r9)
            throw r12
        L54:
            r7 = r9
        L55:
            a(r7)
        L58:
            com.ss.ugc.effectplatform.util.b.a.a(r2, r5)
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> L6e
            r5.<init>()     // Catch: java.lang.Exception -> L6e
            java.lang.Object r12 = r12.getSystemService(r0)     // Catch: java.lang.Exception -> L6e
            android.app.ActivityManager r12 = (android.app.ActivityManager) r12     // Catch: java.lang.Exception -> L6e
            if (r12 == 0) goto L6e
            r12.getMemoryInfo(r5)     // Catch: java.lang.Exception -> L6e
            long r5 = r5.availMem     // Catch: java.lang.Exception -> L6e
            goto L6f
        L6e:
            r5 = r3
        L6f:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L8f
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8c
            r12.<init>(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L8c
            java.lang.String r0 = "MemAvailable"
            e(r0, r12)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84
            a(r12)
            goto L8f
        L81:
            r0 = move-exception
            r9 = r12
            goto L88
        L84:
            r9 = r12
            goto L8c
        L86:
            r12 = move-exception
            r0 = r12
        L88:
            a(r9)
            throw r0
        L8c:
            a(r9)
        L8f:
            java.util.Map<java.lang.String, java.lang.Object> r12 = com.ss.ugc.effectplatform.util.b.a
            r12.put(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.b.d(android.content.Context):com.ss.ugc.effectplatform.util.b$a");
    }

    public static int e(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    for (int i2 = i; i2 < read; i2++) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            break;
                        }
                        if (i3 == str.length() - 1) {
                            return b(bArr, i2);
                        }
                    }
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }
}
