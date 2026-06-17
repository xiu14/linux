package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class am {
    private static long a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f1032a = false;
    private static long b;

    public static class a {
        int a;

        /* renamed from: a, reason: collision with other field name */
        byte[] f1033a;

        public a(byte[] bArr, int i) {
            this.f1033a = bArr;
            this.a = i;
        }
    }

    public static class b {
        public long a;

        /* renamed from: a, reason: collision with other field name */
        public Bitmap f1034a;

        public b(Bitmap bitmap, long j) {
            this.f1034a = bitmap;
            this.a = j;
        }
    }

    public static b a(Context context, String str, boolean z) {
        Bitmap b2;
        ByteArrayInputStream byteArrayInputStream = null;
        b bVar = new b(null, 0L);
        try {
            try {
                b2 = b(context, str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (b2 != null) {
            bVar.f1034a = b2;
            com.xiaomi.push.y.a((Closeable) null);
            return bVar;
        }
        a a2 = a(str, z);
        if (a2 == null) {
            com.xiaomi.push.y.a((Closeable) null);
            return bVar;
        }
        bVar.a = a2.a;
        byte[] bArr = a2.f1033a;
        if (bArr != null) {
            if (z) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                try {
                    int a3 = a(context, byteArrayInputStream2);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = a3;
                    bVar.f1034a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    byteArrayInputStream = byteArrayInputStream2;
                } catch (Exception e3) {
                    e = e3;
                    byteArrayInputStream = byteArrayInputStream2;
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                    com.xiaomi.push.y.a((Closeable) byteArrayInputStream);
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    com.xiaomi.push.y.a((Closeable) byteArrayInputStream);
                    throw th;
                }
            } else {
                bVar.f1034a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
        }
        a(context, a2.f1033a, str);
        com.xiaomi.push.y.a((Closeable) byteArrayInputStream);
        return bVar;
    }

    private static synchronized Bitmap b(Context context, String str) {
        Bitmap bitmap;
        File file;
        synchronized (am.class) {
            FileInputStream fileInputStream = null;
            Bitmap bitmap2 = null;
            try {
                file = new File(a(context), com.xiaomi.push.bm.a(str));
            } catch (Throwable th) {
                th = th;
                bitmap = null;
            }
            if (!file.exists()) {
                return null;
            }
            if (System.currentTimeMillis() - file.lastModified() > 1209600000) {
                com.xiaomi.channel.commonutils.logger.c.m15a("The pic cache has expired.");
                return null;
            }
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                bitmap2 = BitmapFactory.decodeStream(fileInputStream2);
                file.setLastModified(System.currentTimeMillis());
                com.xiaomi.push.y.a((Closeable) fileInputStream2);
            } catch (Throwable th2) {
                Bitmap bitmap3 = bitmap2;
                fileInputStream = fileInputStream2;
                th = th2;
                bitmap = bitmap3;
                try {
                    com.xiaomi.channel.commonutils.logger.c.d("Load bmp from cache error: " + th);
                    bitmap2 = bitmap;
                    return bitmap2;
                } finally {
                    com.xiaomi.push.y.a((Closeable) fileInputStream);
                }
            }
            return bitmap2;
        }
    }

    private static synchronized void b(Context context) {
        String str;
        File file;
        synchronized (am.class) {
            if (f1032a) {
                return;
            }
            a = 0L;
            b = 0L;
            try {
                file = new File(a(context));
            } catch (Throwable th) {
                try {
                    com.xiaomi.channel.commonutils.logger.c.d("Init pic cache error: " + th);
                    f1032a = true;
                    str = "Init pic cache finish.";
                } finally {
                    f1032a = true;
                    com.xiaomi.channel.commonutils.logger.c.b("Init pic cache finish.");
                }
            }
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        a += file2.length();
                        long j = b;
                        if (j <= 0) {
                            b = file2.lastModified();
                        } else {
                            b = Math.min(j, file2.lastModified());
                        }
                    }
                }
                f1032a = true;
                str = "Init pic cache finish.";
                com.xiaomi.channel.commonutils.logger.c.b(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        if (r1 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
    
        r1.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
    
        if (r1 == null) goto L54;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00fc: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:59:0x00fc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.xiaomi.push.service.am.a a(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.am.a(java.lang.String, boolean):com.xiaomi.push.service.am$a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static Bitmap a(Context context, String str) {
        InputStream inputStream;
        InputStream inputStream2;
        Uri parse = Uri.parse(str);
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                inputStream = context.getContentResolver().openInputStream(parse);
            } catch (Throwable th) {
                th = th;
                r0 = context;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream2 = null;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            int a2 = a(context, inputStream);
            inputStream2 = context.getContentResolver().openInputStream(parse);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = a2;
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, null, options);
                com.xiaomi.push.y.a((Closeable) inputStream2);
                com.xiaomi.push.y.a((Closeable) inputStream);
                return decodeStream;
            } catch (IOException e3) {
                e = e3;
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                com.xiaomi.push.y.a((Closeable) inputStream2);
                com.xiaomi.push.y.a((Closeable) inputStream);
                return null;
            }
        } catch (IOException e4) {
            e = e4;
            inputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            com.xiaomi.push.y.a((Closeable) r0);
            com.xiaomi.push.y.a((Closeable) inputStream);
            throw th;
        }
    }

    private static int a(Context context, InputStream inputStream) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            int round = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
            int i2 = options.outWidth;
            if (i2 <= round || (i = options.outHeight) <= round) {
                return 1;
            }
            return Math.min(i2 / round, i / round);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("decode dimension failed for bitmap.");
        return 1;
    }

    private static void a(Context context, byte[] bArr, String str) {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        if (bArr == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("cannot save small icon cause bitmap is null");
            return;
        }
        m741a(context);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            File file = new File(a(context));
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, com.xiaomi.push.bm.a(str));
            if (!file2.exists()) {
                file2.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file2);
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                a += file2.length();
                long j = b;
                if (j <= 0) {
                    b = file2.lastModified();
                } else {
                    b = Math.min(j, file2.lastModified());
                }
                com.xiaomi.push.y.a(bufferedOutputStream);
            } catch (Exception e3) {
                e = e3;
                bufferedOutputStream2 = bufferedOutputStream;
                com.xiaomi.channel.commonutils.logger.c.d("Save pic error: " + e);
                com.xiaomi.push.y.a(bufferedOutputStream2);
                com.xiaomi.push.y.a(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                com.xiaomi.push.y.a(bufferedOutputStream2);
                com.xiaomi.push.y.a(fileOutputStream);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        com.xiaomi.push.y.a(fileOutputStream);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static synchronized void m741a(Context context) {
        File file;
        long j;
        synchronized (am.class) {
            b(context);
            if (a >= 62914560 || System.currentTimeMillis() - b >= 1209600000) {
                try {
                    file = new File(a(context));
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.c.d("Clear pic cache error: " + th);
                }
                if (!file.exists()) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("The pic cache dir do not exists.");
                    return;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    a(listFiles);
                    long j2 = a;
                    int length = listFiles.length - 1;
                    while (true) {
                        if (length < 0) {
                            j = 0;
                            break;
                        }
                        File file2 = listFiles[length];
                        if (file2 != null) {
                            if (j2 <= 31457280 && System.currentTimeMillis() - file2.lastModified() <= 864000000) {
                                j = file2.lastModified();
                                break;
                            }
                            j2 -= file2.length();
                            file2.delete();
                        }
                        length--;
                    }
                    a = Math.max(j2, 0L);
                    b = j;
                } else {
                    com.xiaomi.channel.commonutils.logger.c.m15a("The pic cache file list is null.");
                }
            }
        }
    }

    private static void a(File[] fileArr) {
        if (fileArr != null) {
            try {
                if (fileArr.length > 1) {
                    Arrays.sort(fileArr, new Comparator<File>() { // from class: com.xiaomi.push.service.am.1
                        @Override // java.util.Comparator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            if (file == file2) {
                                return 0;
                            }
                            if (file == null) {
                                return 1;
                            }
                            if (file2 == null) {
                                return -1;
                            }
                            long lastModified = file.lastModified() - file2.lastModified();
                            if (lastModified == 0) {
                                return 0;
                            }
                            return lastModified < 0 ? 1 : -1;
                        }
                    });
                }
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.d("Sort pic cache error: " + th);
            }
        }
    }

    private static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        return e.a.a.a.a.J(sb, File.separator, "mipush_icon");
    }
}
