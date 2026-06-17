package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class hq {
    private static boolean a = false;

    static class a implements Runnable {
        private Context a;

        /* renamed from: a, reason: collision with other field name */
        private ht f570a;

        public a(Context context, ht htVar) {
            this.f570a = htVar;
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            hq.c(this.a, this.f570a);
        }
    }

    public static void a(Context context, ht htVar) {
        ah.a(context).a(new a(context, htVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r11, com.xiaomi.push.ht r12) {
        /*
            java.lang.String r0 = "/"
            java.lang.String r1 = "/tdReadTemp"
            boolean r2 = com.xiaomi.push.hq.a
            if (r2 != 0) goto Ldd
            r2 = 1
            com.xiaomi.push.hq.a = r2
            java.io.File r2 = new java.io.File
            java.io.File r3 = r11.getFilesDir()
            java.lang.String r4 = "tiny_data.data"
            r2.<init>(r3, r4)
            boolean r3 = r2.exists()
            java.lang.String r5 = "TinyData no ready file to get data."
            if (r3 != 0) goto L22
            com.xiaomi.channel.commonutils.logger.c.m15a(r5)
            return
        L22:
            a(r11)
            byte[] r3 = com.xiaomi.push.service.bm.a(r11)
            r6 = 0
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.io.File r8 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.lang.String r9 = "tiny_data.lock"
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            com.xiaomi.push.y.m850a(r7)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.lang.String r9 = "rw"
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.nio.channels.FileChannel r7 = r8.getChannel()     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            java.nio.channels.FileLock r6 = r7.lock()     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            r9.<init>()     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            java.io.File r10 = r11.getFilesDir()     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            r9.append(r10)     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            r9.append(r1)     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            r9.append(r0)     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            r9.append(r4)     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            r7.<init>(r9)     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            r2.renameTo(r7)     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lc8
            if (r6 == 0) goto L90
            boolean r2 = r6.isValid()
            if (r2 == 0) goto L90
            r6.release()     // Catch: java.io.IOException -> L74
            goto L90
        L74:
            r2 = move-exception
            goto L8d
        L76:
            r2 = move-exception
            goto L7d
        L78:
            r11 = move-exception
            r8 = r6
            goto Lc9
        L7b:
            r2 = move-exception
            r8 = r6
        L7d:
            com.xiaomi.channel.commonutils.logger.c.m18a(r2)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto L90
            boolean r2 = r6.isValid()
            if (r2 == 0) goto L90
            r6.release()     // Catch: java.io.IOException -> L8c
            goto L90
        L8c:
            r2 = move-exception
        L8d:
            com.xiaomi.channel.commonutils.logger.c.m18a(r2)
        L90:
            com.xiaomi.push.y.a(r8)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r7 = r11.getFilesDir()
            r6.append(r7)
            r6.append(r1)
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto Lbb
            com.xiaomi.channel.commonutils.logger.c.m15a(r5)
            return
        Lbb:
            a(r11, r12, r2, r3)
            r12 = 0
            com.xiaomi.push.hp.a(r12)
            b(r11)
            com.xiaomi.push.hq.a = r12
            return
        Lc8:
            r11 = move-exception
        Lc9:
            if (r6 == 0) goto Ld9
            boolean r12 = r6.isValid()
            if (r12 == 0) goto Ld9
            r6.release()     // Catch: java.io.IOException -> Ld5
            goto Ld9
        Ld5:
            r12 = move-exception
            com.xiaomi.channel.commonutils.logger.c.m18a(r12)
        Ld9:
            com.xiaomi.push.y.a(r8)
            throw r11
        Ldd:
            java.lang.String r11 = "TinyData extractTinyData is running"
            com.xiaomi.channel.commonutils.logger.c.m15a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hq.c(android.content.Context, com.xiaomi.push.ht):void");
    }

    private static void a(Context context, ht htVar, File file, byte[] bArr) {
        int a2;
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream = null;
                loop0: while (true) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        try {
                            int read = bufferedInputStream2.read(bArr2);
                            if (read == -1) {
                                break loop0;
                            }
                            if (read == 4) {
                                a2 = aa.a(bArr2);
                                if (a2 < 1 || a2 > 30720) {
                                    break loop0;
                                }
                                byte[] bArr3 = new byte[a2];
                                int read2 = bufferedInputStream2.read(bArr3);
                                if (read2 != a2) {
                                    com.xiaomi.channel.commonutils.logger.c.d("TinyData read from cache file failed cause buffer size not equal length. size:" + read2 + "__length:" + a2);
                                    break loop0;
                                }
                                byte[] a3 = i.a(bArr, bArr3);
                                if (a3 != null && a3.length != 0) {
                                    hy hyVar = new hy();
                                    je.a(hyVar, a3);
                                    hyVar.a("item_size", String.valueOf(a3.length));
                                    arrayList.add(hyVar);
                                    i++;
                                    i2 += a3.length;
                                    if (i >= 8 || i2 >= 30720) {
                                    }
                                }
                                com.xiaomi.channel.commonutils.logger.c.d("TinyData read from cache file failed cause decrypt fail");
                            } else {
                                com.xiaomi.channel.commonutils.logger.c.d("TinyData read from cache file failed cause lengthBuffer error. size:" + read);
                                break loop0;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            bufferedInputStream = bufferedInputStream2;
                            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                            y.a((Closeable) bufferedInputStream);
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream = bufferedInputStream2;
                            y.a((Closeable) bufferedInputStream);
                            throw th;
                        }
                    }
                    hr.a(context, htVar, arrayList);
                    arrayList.clear();
                }
                com.xiaomi.channel.commonutils.logger.c.d("TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + a2);
                hr.a(context, htVar, arrayList);
                if (file != null && file.exists() && !file.delete()) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("TinyData delete reading temp file failed");
                }
                y.a((Closeable) bufferedInputStream2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private static void b(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 4).edit();
        edit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    private static void a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }
}
