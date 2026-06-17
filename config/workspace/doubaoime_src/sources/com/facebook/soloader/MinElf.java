package com.facebook.soloader;

import android.content.Context;
import android.util.Log;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public final class MinElf {

    public enum ISA {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");

        private final String value;

        ISA(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    private static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }

    public static void a(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("Could not delete file " + file);
    }

    public static String[] b(f fVar) throws IOException {
        if (!(fVar instanceof g)) {
            return c(fVar);
        }
        g gVar = (g) fVar;
        int i = 0;
        while (true) {
            try {
                return c(gVar);
            } catch (ClosedByInterruptException e2) {
                i++;
                if (i > 4) {
                    throw e2;
                }
                Thread.interrupted();
                Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e2);
                gVar.a();
            }
        }
    }

    private static String[] c(f fVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        int i = 8;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long e2 = e(fVar, allocate, 0L);
        if (e2 != 1179403647) {
            StringBuilder M = e.a.a.a.a.M("file is not ELF: 0x");
            M.append(Long.toHexString(e2));
            throw new a(M.toString());
        }
        h(fVar, allocate, 1, 4L);
        boolean z = ((short) (allocate.get() & 255)) == 1;
        h(fVar, allocate, 1, 5L);
        if (((short) (allocate.get() & 255)) == 2) {
            allocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (z) {
            j = e(fVar, allocate, 28L);
        } else {
            h(fVar, allocate, 8, 32L);
            j = allocate.getLong();
        }
        h(fVar, allocate, 2, z ? 44L : 56L);
        long j12 = allocate.getShort() & 65535;
        h(fVar, allocate, 2, z ? 42L : 54L);
        int i2 = 65535 & allocate.getShort();
        if (j12 == 65535) {
            if (z) {
                j11 = e(fVar, allocate, 32L);
            } else {
                h(fVar, allocate, 8, 40L);
                j11 = allocate.getLong();
            }
            j12 = z ? e(fVar, allocate, j11 + 28) : e(fVar, allocate, j11 + 44);
        }
        long j13 = 0;
        long j14 = j;
        while (true) {
            if (j13 >= j12) {
                j2 = 0;
                break;
            }
            if ((z ? e(fVar, allocate, j14 + 0) : e(fVar, allocate, 0 + j14)) != 2) {
                j14 += i2;
                j13++;
            } else if (z) {
                j2 = e(fVar, allocate, j14 + 4);
            } else {
                h(fVar, allocate, 8, j14 + 8);
                j2 = allocate.getLong();
            }
        }
        long j15 = 0;
        if (j2 == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        int i3 = 0;
        long j16 = j2;
        long j17 = 0;
        while (true) {
            if (z) {
                j3 = e(fVar, allocate, j16 + j15);
            } else {
                h(fVar, allocate, i, j16 + j15);
                j3 = allocate.getLong();
            }
            long j18 = j2;
            if (j3 == 1) {
                if (i3 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i3++;
            } else if (j3 == 5) {
                if (z) {
                    j17 = e(fVar, allocate, j16 + 4);
                } else {
                    h(fVar, allocate, 8, j16 + 8);
                    j17 = allocate.getLong();
                }
            }
            j16 += z ? 8L : 16L;
            long j19 = 0;
            if (j3 != 0) {
                i = 8;
                j2 = j18;
                j15 = 0;
            } else {
                if (j17 == 0) {
                    throw new a("Dynamic section string-table not found");
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= j12) {
                        j4 = 0;
                        break;
                    }
                    if ((z ? e(fVar, allocate, j + j19) : e(fVar, allocate, j + j19)) == 1) {
                        if (z) {
                            j8 = e(fVar, allocate, j + 8);
                        } else {
                            h(fVar, allocate, 8, j + 16);
                            j8 = allocate.getLong();
                        }
                        if (z) {
                            j7 = j12;
                            j9 = e(fVar, allocate, j + 20);
                        } else {
                            j7 = j12;
                            h(fVar, allocate, 8, 40 + j);
                            j9 = allocate.getLong();
                        }
                        if (j8 <= j17 && j17 < j9 + j8) {
                            if (z) {
                                j10 = e(fVar, allocate, j + 4);
                            } else {
                                h(fVar, allocate, 8, j + 8);
                                j10 = allocate.getLong();
                            }
                            j4 = (j17 - j8) + j10;
                        }
                    } else {
                        j7 = j12;
                    }
                    j += i2;
                    i4++;
                    j19 = 0;
                    j12 = j7;
                }
                long j20 = 0;
                if (j4 == 0) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i3];
                int i5 = 0;
                while (true) {
                    long j21 = j18 + j20;
                    if (z) {
                        j5 = e(fVar, allocate, j21);
                    } else {
                        h(fVar, allocate, 8, j21);
                        j5 = allocate.getLong();
                    }
                    if (j5 == 1) {
                        if (z) {
                            j6 = e(fVar, allocate, j18 + 4);
                        } else {
                            h(fVar, allocate, 8, j18 + 8);
                            j6 = allocate.getLong();
                        }
                        long j22 = j6 + j4;
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            long j23 = j22 + 1;
                            h(fVar, allocate, 1, j22);
                            short s = (short) (allocate.get() & 255);
                            if (s == 0) {
                                break;
                            }
                            sb.append((char) s);
                            j22 = j23;
                        }
                        strArr[i5] = sb.toString();
                        if (i5 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i5++;
                    }
                    j18 += z ? 8L : 16L;
                    if (j5 == 0) {
                        if (i5 == i3) {
                            return strArr;
                        }
                        throw new a("malformed DT_NEEDED section");
                    }
                    j20 = 0;
                }
            }
        }
    }

    public static void d(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("cannot list directory " + file);
            }
            for (File file2 : listFiles) {
                d(file2);
            }
            return;
        }
        if (file.getPath().endsWith("_lock")) {
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, DownloadFileUtils.MODE_READ);
        try {
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long e(f fVar, ByteBuffer byteBuffer, long j) throws IOException {
        h(fVar, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    static void f(String str) {
        throw new IllegalArgumentException(e.a.a.a.a.s("Unknown library: ", str));
    }

    public static boolean g(Context context, int i) throws IOException {
        if (i == 2) {
            ZipFile zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir));
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement != null && nextElement.getName().endsWith(".so") && nextElement.getName().contains("/lib")) {
                        r0 = nextElement.getMethod() == 0;
                        zipFile.close();
                    }
                }
                zipFile.close();
                return false;
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (context == null || (context.getApplicationInfo().flags & 268435456) != 0) {
            r0 = false;
        }
        return r0;
    }

    private static void h(f fVar, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int F;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (F = fVar.F(byteBuffer, j)) != -1) {
            j += F;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
