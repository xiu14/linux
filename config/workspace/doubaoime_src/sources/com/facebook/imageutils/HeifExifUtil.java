package com.facebook.imageutils;

import android.util.Pair;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class HeifExifUtil {

    @com.facebook.soloader.e
    private static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }
    }

    private static boolean a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int b(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (((byte) inputStream.read()) & 255);
    }

    public static int c(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    private static int d(InputStream inputStream) throws IOException {
        byte read = (byte) inputStream.read();
        byte read2 = (byte) inputStream.read();
        return ((((byte) inputStream.read()) << 24) & ViewCompat.MEASURED_STATE_MASK) | ((((byte) inputStream.read()) << 16) & 16711680) | ((read2 << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (read & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3 A[Catch: IOException -> 0x00dc, TryCatch #0 {IOException -> 0x00dc, blocks: (B:3:0x0001, B:4:0x0004, B:8:0x0011, B:29:0x003a, B:31:0x0042, B:42:0x0091, B:47:0x0097, B:55:0x00c9, B:59:0x00d1, B:63:0x00d8, B:66:0x00a3, B:67:0x00a9, B:71:0x00b1, B:73:0x00ba, B:79:0x0061, B:83:0x0071, B:86:0x007f, B:88:0x0087, B:90:0x008b, B:21:0x002c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(java.io.InputStream r11) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.HeifExifUtil.e(java.io.InputStream):int");
    }

    public static Pair<Integer, Integer> f(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    inputStream.read(bArr);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        if (!a(bArr, "RIFF")) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            return null;
        }
        d(inputStream);
        inputStream.read(bArr);
        if (!a(bArr, "WEBP")) {
            try {
                inputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            return null;
        }
        inputStream.read(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        if ("VP8 ".equals(sb2)) {
            Pair<Integer, Integer> g2 = g(inputStream);
            try {
                inputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            return g2;
        }
        if ("VP8L".equals(sb2)) {
            Pair<Integer, Integer> h = h(inputStream);
            try {
                inputStream.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            return h;
        }
        if (!"VP8X".equals(sb2)) {
            inputStream.close();
            return null;
        }
        inputStream.skip(8L);
        Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(i(inputStream) + 1), Integer.valueOf(i(inputStream) + 1));
        try {
            inputStream.close();
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        return pair;
    }

    private static Pair<Integer, Integer> g(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        short read = (short) (inputStream.read() & 255);
        short read2 = (short) (inputStream.read() & 255);
        short read3 = (short) (inputStream.read() & 255);
        if (read == 157 && read2 == 1 && read3 == 42) {
            return new Pair<>(Integer.valueOf(b(inputStream)), Integer.valueOf(b(inputStream)));
        }
        return null;
    }

    private static Pair<Integer, Integer> h(InputStream inputStream) throws IOException {
        d(inputStream);
        if (((byte) (inputStream.read() & 255)) != 47) {
            return null;
        }
        int read = ((byte) inputStream.read()) & 255;
        int read2 = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read2 & 192) >> 6)) + 1));
    }

    private static int i(InputStream inputStream) throws IOException {
        byte read = (byte) (inputStream.read() & 255);
        return ((((byte) (inputStream.read() & 255)) << 16) & 16711680) | ((((byte) (inputStream.read() & 255)) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (read & 255);
    }

    public static int j(InputStream inputStream, int i, boolean z) throws IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IOException("no more bytes");
            }
            if (z) {
                i2 = (read & 255) << (i4 * 8);
            } else {
                i3 <<= 8;
                i2 = read & 255;
            }
            i3 |= i2;
        }
        return i3;
    }
}
