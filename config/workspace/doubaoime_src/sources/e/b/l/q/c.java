package e.b.l.q;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class c {
    public static final String[] a = new String[0];
    public static final Object[] b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f9649c = new byte[0];

    public static final boolean a(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        boolean z = length == 0;
        if (!z) {
            int i = length - 1;
            z = Character.isWhitespace(charSequence.charAt(i));
            while (z && i > 0) {
                i--;
                z = Character.isWhitespace(charSequence.charAt(i));
            }
        }
        return z;
    }

    public static boolean b(CharSequence charSequence) {
        return a(charSequence) || "null".equalsIgnoreCase(charSequence.toString());
    }

    public static boolean c(CharSequence charSequence) {
        return !a(charSequence);
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
        return byteArray;
    }

    public static String e(InputStream inputStream, String str) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
            }
        }
        String byteArrayOutputStream2 = byteArrayOutputStream.toString(str);
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
        return byteArrayOutputStream2;
    }
}
