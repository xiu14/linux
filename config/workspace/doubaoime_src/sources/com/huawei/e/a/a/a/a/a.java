package com.huawei.e.a.a.a.a;

import android.text.TextUtils;
import com.huawei.e.a.a.a.d.b;
import com.huawei.e.a.a.a.d.d;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.e.a.a.a.a.a.a(java.lang.String, byte[]):java.lang.String");
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 0) {
            d.a("CBC", "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            d.a("CBC", "decrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            d.a("CBC", "decrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            d.a("CBC", "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e2) {
            StringBuilder M = e.a.a.a.a.M("NullPointerException: ");
            M.append(e2.getMessage());
            d.a("CBC", M.toString());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e3) {
            StringBuilder M2 = e.a.a.a.a.M("InvalidAlgorithmParameterException: ");
            M2.append(e3.getMessage());
            d.a("CBC", M2.toString());
            return new byte[0];
        } catch (InvalidKeyException e4) {
            StringBuilder M3 = e.a.a.a.a.M("InvalidKeyException: ");
            M3.append(e4.getMessage());
            d.a("CBC", M3.toString());
            return new byte[0];
        } catch (NoSuchAlgorithmException e5) {
            StringBuilder M4 = e.a.a.a.a.M("NoSuchAlgorithmException: ");
            M4.append(e5.getMessage());
            d.a("CBC", M4.toString());
            return new byte[0];
        } catch (BadPaddingException e6) {
            StringBuilder M5 = e.a.a.a.a.M("BadPaddingException: ");
            M5.append(e6.getMessage());
            d.a("CBC", M5.toString());
            d.a("CBC", "key is not right");
            return new byte[0];
        } catch (IllegalBlockSizeException e7) {
            StringBuilder M6 = e.a.a.a.a.M("IllegalBlockSizeException: ");
            M6.append(e7.getMessage());
            d.a("CBC", M6.toString());
            return new byte[0];
        } catch (NoSuchPaddingException e8) {
            StringBuilder M7 = e.a.a.a.a.M("NoSuchPaddingException: ");
            M7.append(e8.getMessage());
            d.a("CBC", M7.toString());
            return new byte[0];
        }
    }

    public static String c(String str, byte[] bArr) {
        byte[] bArr2;
        if (TextUtils.isEmpty(str)) {
            d.a("CBC", "encrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            d.a("CBC", "encrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            d.a("CBC", "encrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        byte[] c2 = b.c(16);
        if (TextUtils.isEmpty(str)) {
            d.a("CBC", "encrypt 5 content is null");
            bArr2 = new byte[0];
        } else if (bArr.length < 16) {
            d.a("CBC", "encrypt 5 key error: 5 key length less than 16 bytes.");
            bArr2 = new byte[0];
        } else if (c2.length < 16) {
            d.a("CBC", "encrypt 5 iv error: 5 iv length less than 16 bytes.");
            bArr2 = new byte[0];
        } else {
            try {
                bArr2 = d(str.getBytes("UTF-8"), bArr, c2);
            } catch (UnsupportedEncodingException e2) {
                StringBuilder M = e.a.a.a.a.M(" cbc encrypt data error");
                M.append(e2.getMessage());
                d.a("CBC", M.toString());
                bArr2 = new byte[0];
            }
        }
        if (bArr2 == null || bArr2.length == 0) {
            return "";
        }
        String f2 = com.bytedance.feedbackerlib.a.f(c2);
        String f3 = com.bytedance.feedbackerlib.a.f(bArr2);
        if (TextUtils.isEmpty(f2) || TextUtils.isEmpty(f3)) {
            return "";
        }
        try {
            return f3.substring(0, 6) + f2.substring(0, 6) + f3.substring(6, 10) + f2.substring(6, 16) + f3.substring(10, 16) + f2.substring(16) + f3.substring(16);
        } catch (Exception e3) {
            StringBuilder M2 = e.a.a.a.a.M("mix exception: ");
            M2.append(e3.getMessage());
            d.a("CBC", M2.toString());
            return "";
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            d.a("CBC", "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            d.a("CBC", "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            d.a("CBC", "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            d.a("CBC", "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            d.a("CBC", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e2) {
            StringBuilder M = e.a.a.a.a.M("NullPointerException: ");
            M.append(e2.getMessage());
            d.a("CBC", M.toString());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e3) {
            StringBuilder M2 = e.a.a.a.a.M("InvalidAlgorithmParameterException: ");
            M2.append(e3.getMessage());
            d.a("CBC", M2.toString());
            return new byte[0];
        } catch (InvalidKeyException e4) {
            StringBuilder M3 = e.a.a.a.a.M("InvalidKeyException: ");
            M3.append(e4.getMessage());
            d.a("CBC", M3.toString());
            return new byte[0];
        } catch (NoSuchAlgorithmException e5) {
            StringBuilder M4 = e.a.a.a.a.M("NoSuchAlgorithmException: ");
            M4.append(e5.getMessage());
            d.a("CBC", M4.toString());
            return new byte[0];
        } catch (BadPaddingException e6) {
            StringBuilder M5 = e.a.a.a.a.M("BadPaddingException: ");
            M5.append(e6.getMessage());
            d.a("CBC", M5.toString());
            return new byte[0];
        } catch (IllegalBlockSizeException e7) {
            StringBuilder M6 = e.a.a.a.a.M("IllegalBlockSizeException: ");
            M6.append(e7.getMessage());
            d.a("CBC", M6.toString());
            return new byte[0];
        } catch (NoSuchPaddingException e8) {
            StringBuilder M7 = e.a.a.a.a.M("NoSuchPaddingException: ");
            M7.append(e8.getMessage());
            d.a("CBC", M7.toString());
            return new byte[0];
        }
    }
}
