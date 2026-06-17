package com.bytedance.memory.shrink;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class g {
    public static int a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    public static long b(InputStream inputStream) throws IOException {
        d(inputStream, new byte[8], 8L);
        return (r1[0] << 56) + ((r1[1] & 255) << 48) + ((r1[2] & 255) << 40) + ((r1[3] & 255) << 32) + ((r1[4] & 255) << 24) + ((r1[5] & 255) << 16) + ((r1[6] & 255) << 8) + (r1[7] & 255);
    }

    public static short c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if ((read | read2) >= 0) {
            return (short) (read2 | (read << 8));
        }
        throw new EOFException();
    }

    public static void d(InputStream inputStream, byte[] bArr, long j) throws IOException {
        int i = 0;
        while (true) {
            long j2 = i;
            if (j2 >= j) {
                return;
            }
            int read = inputStream.read(bArr, i, (int) (j - j2));
            if (read < 0) {
                throw new EOFException();
            }
            i += read;
        }
    }

    public static c e(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        d(inputStream, bArr, i);
        return new c(bArr);
    }

    public static void f(InputStream inputStream, long j) throws IOException {
        long j2 = 0;
        while (j2 < j) {
            long skip = inputStream.skip(j - j2);
            if (skip < 0) {
                throw new EOFException();
            }
            j2 += skip;
        }
    }

    public static void g(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[4096];
        for (int i = 0; i < (j >> 12); i++) {
            outputStream.write(bArr);
        }
        outputStream.write(bArr, 0, (int) (j & 4095));
    }

    public static void h(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 24) & 255);
        outputStream.write((i >>> 16) & 255);
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    public static void i(OutputStream outputStream, long j) throws IOException {
        outputStream.write(new byte[]{(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j}, 0, 8);
    }

    public static void j(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    public static void k(OutputStream outputStream, c cVar) throws IOException {
        outputStream.write(cVar.a());
    }

    public static void l(OutputStream outputStream, Object obj) throws IOException {
        if (obj == null) {
            throw new IllegalArgumentException("value is null.");
        }
        if (obj instanceof c) {
            outputStream.write(((c) obj).a());
            return;
        }
        if ((obj instanceof Boolean) || Boolean.TYPE.isAssignableFrom(obj.getClass())) {
            outputStream.write(((Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if ((obj instanceof Character) || Character.TYPE.isAssignableFrom(obj.getClass())) {
            char charValue = ((Character) obj).charValue();
            outputStream.write((charValue >>> '\b') & 255);
            outputStream.write(charValue & 255);
            return;
        }
        if ((obj instanceof Float) || Float.TYPE.isAssignableFrom(obj.getClass())) {
            h(outputStream, Float.floatToRawIntBits(((Float) obj).floatValue()));
            return;
        }
        if ((obj instanceof Double) || Double.TYPE.isAssignableFrom(obj.getClass())) {
            i(outputStream, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
            return;
        }
        if ((obj instanceof Byte) || Byte.TYPE.isAssignableFrom(obj.getClass())) {
            outputStream.write(((Byte) obj).byteValue());
            return;
        }
        if ((obj instanceof Short) || Short.TYPE.isAssignableFrom(obj.getClass())) {
            short shortValue = ((Short) obj).shortValue();
            outputStream.write((shortValue >>> 8) & 255);
            outputStream.write(shortValue & 255);
        } else if ((obj instanceof Integer) || Integer.TYPE.isAssignableFrom(obj.getClass())) {
            h(outputStream, ((Integer) obj).intValue());
        } else if ((obj instanceof Long) || Long.TYPE.isAssignableFrom(obj.getClass())) {
            i(outputStream, ((Long) obj).longValue());
        } else {
            StringBuilder M = e.a.a.a.a.M("bad value type: ");
            M.append(obj.getClass().getName());
            throw new IllegalArgumentException(M.toString());
        }
    }
}
