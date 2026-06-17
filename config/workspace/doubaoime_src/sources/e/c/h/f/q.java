package e.c.h.f;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class q {
    private static byte[] a = {1, 2, 3, 2, 1, 8, 1, 2, 4, 3, 1, 2};

    public static byte[] a(InputStream inputStream) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        byte[] c2 = c(inputStream);
        byte[] d2 = d("79e93ec548d39875969ea47be01345cc794f55626fd116f9b6cf4e5c77d313e4");
        byte[] copyOfRange = Arrays.copyOfRange(c2, 0, c2.length);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(a);
        SecretKeySpec secretKeySpec = new SecretKeySpec(d2, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(copyOfRange);
    }

    public static byte[] b(InputStream inputStream) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        byte[] c2 = c(inputStream);
        byte[] d2 = d("79e93ec548d39875969ea47be01345cc794f55626fd116f9b6cf4e5c77d313e4");
        byte[] copyOfRange = Arrays.copyOfRange(c2, 0, c2.length);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(a);
        SecretKeySpec secretKeySpec = new SecretKeySpec(d2, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(copyOfRange);
    }

    private static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= -1) {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private static byte[] d(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }
}
