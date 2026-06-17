package kotlin.io;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.prolificinteractive.materialcalendarview.r;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import kotlin.io.f;
import kotlin.io.f.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b {
    public static boolean a(File file) {
        l.f(file, "<this>");
        l.f(file, "<this>");
        FileWalkDirection fileWalkDirection = FileWalkDirection.BOTTOM_UP;
        l.f(file, "<this>");
        l.f(fileWalkDirection, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        f.b bVar = new f(file, fileWalkDirection).new b();
        while (true) {
            boolean z = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.delete() || !next.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String b(File file) {
        l.f(file, "<this>");
        String name = file.getName();
        l.e(name, "name");
        return kotlin.text.a.N(name, '.', "");
    }

    public static final kotlin.x.e<String> c(BufferedReader bufferedReader) {
        l.f(bufferedReader, "<this>");
        g gVar = new g(bufferedReader);
        l.f(gVar, "<this>");
        return gVar instanceof kotlin.x.a ? gVar : new kotlin.x.a(gVar);
    }

    public static byte[] d(File file) {
        l.f(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int read = fileInputStream.read(bArr, i3, i2);
                if (read < 0) {
                    break;
                }
                i2 -= read;
                i3 += read;
            }
            if (i2 > 0) {
                bArr = Arrays.copyOf(bArr, i3);
                l.e(bArr, "copyOf(this, newSize)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    c cVar = new c(8193);
                    cVar.write(read2);
                    r.H(fileInputStream, cVar, 0, 2);
                    int size = cVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a = cVar.a();
                    bArr = Arrays.copyOf(bArr, size);
                    l.e(bArr, "copyOf(this, newSize)");
                    kotlin.collections.g.h(a, bArr, i, 0, cVar.size());
                }
            }
            r.E(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r.E(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static void e(File file, byte[] bArr) {
        l.f(file, "<this>");
        l.f(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            r.E(fileOutputStream, null);
        } finally {
        }
    }
}
