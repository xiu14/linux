package com.ss.android.h;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class c {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static class b {
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f8307c;

        /* renamed from: d, reason: collision with root package name */
        private long f8308d;

        /* renamed from: e, reason: collision with root package name */
        private String f8309e;

        b(a aVar) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:5|6|(9:13|14|(3:16|(1:18)|19)|(1:21)|22|(1:24)|25|26|(4:35|36|37|38)(3:30|31|32))|42|14|(0)|(0)|22|(0)|25|26|(1:28)|35|36|37|38) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:6:0x000d, B:10:0x001a, B:14:0x002d, B:16:0x003f, B:18:0x004b, B:21:0x0062, B:22:0x006c, B:24:0x007f, B:26:0x009a, B:35:0x00a9), top: B:5:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:6:0x000d, B:10:0x001a, B:14:0x002d, B:16:0x003f, B:18:0x004b, B:21:0x0062, B:22:0x006c, B:24:0x007f, B:26:0x009a, B:35:0x00a9), top: B:5:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[Catch: all -> 0x00eb, LOOP:1: B:23:0x007d->B:24:0x007f, LOOP_END, TryCatch #2 {all -> 0x00eb, blocks: (B:6:0x000d, B:10:0x001a, B:14:0x002d, B:16:0x003f, B:18:0x004b, B:21:0x0062, B:22:0x006c, B:24:0x007f, B:26:0x009a, B:35:0x00a9), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(com.ss.android.h.b r21, int r22, long r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.h.c.a(com.ss.android.h.b, int, long):java.lang.String");
    }

    public static int b(String str, File file) {
        return c(str, file, null);
    }

    public static int c(String str, File file, com.ss.android.h.b bVar) {
        String str2;
        if (str == null || str.length() == 0) {
            return 2;
        }
        try {
            if (bVar != null) {
                if (bVar.length() <= 0) {
                    try {
                        bVar.close();
                    } catch (Throwable unused) {
                    }
                    return 5;
                }
            } else if (file == null || !file.exists()) {
                return 5;
            }
            int i = -1;
            long j = -1;
            try {
                b e2 = e(str);
                if (e2 != null) {
                    if (e2.a > 1) {
                        return 3;
                    }
                    i = e2.f8307c;
                    j = e2.f8308d;
                }
                b bVar2 = null;
                try {
                    str2 = bVar != null ? a(bVar, i, j) : a(new com.ss.android.h.a(file), i, j);
                } catch (Throwable th) {
                    th.printStackTrace();
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    if (e2 != null && (e2.a != 1 || e2.b != 1)) {
                        if (e2.f8309e != null) {
                            try {
                                bVar2 = e(str2);
                            } catch (Throwable unused2) {
                            }
                            if (bVar2 != null && e2.f8307c == bVar2.f8307c && e2.f8308d == bVar2.f8308d && e2.f8309e.equals(bVar2.f8309e)) {
                                return 0;
                            }
                        }
                    }
                    return str2.equals(str) ? 0 : 1;
                }
                return 6;
            } catch (Throwable unused3) {
                return 4;
            }
        } catch (Throwable unused4) {
            return 99;
        }
    }

    private static long d(String str) throws RuntimeException {
        return (Long.parseLong(str, 16) - 31) >> 4;
    }

    private static b e(String str) throws Exception {
        if (!str.startsWith("ttmd5:")) {
            return null;
        }
        String[] split = str.split(";");
        String[] split2 = split[0].split(Constants.COLON_SEPARATOR);
        b bVar = new b(null);
        bVar.a = Integer.parseInt(split2[1]);
        if (bVar.a > 1) {
            return bVar;
        }
        bVar.b = Integer.parseInt(split2[2]);
        String[] split3 = split2[3].split("g");
        bVar.f8307c = (int) d(split3[0]);
        bVar.f8308d = d(split3[1]);
        bVar.f8309e = split[1];
        return bVar;
    }

    private static void f(com.ss.android.h.b bVar, MessageDigest messageDigest, byte[] bArr, long j, long j2) throws IOException {
        bVar.seek(j, j2);
        long j3 = 0;
        while (j3 < j2) {
            int read = bVar.read(bArr, 0, (int) Math.min(j2 - j3, bArr.length));
            if (read <= 0) {
                throw new IOException("updateSample unexpected readCount <= 0, readCount = " + read + ", readTotalCount = " + j3 + ", sampleSize = " + j2);
            }
            messageDigest.update(bArr, 0, read);
            j3 += read;
        }
    }
}
