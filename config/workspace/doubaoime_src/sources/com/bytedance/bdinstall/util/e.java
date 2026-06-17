package com.bytedance.bdinstall.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class e {
    private static String a;

    public static String a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean b(Context context) {
        try {
            return context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String c(byte[] bArr, String str) throws Exception {
        try {
            byte[] decode = Base64.decode(bArr, 0);
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, new SecretKeySpec(str.getBytes(), "AES"), new IvParameterSpec("NIfb&95GUY86Gfgh".getBytes()));
            return new String(cipher.doFinal(decode)).trim();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] d(String str, String str2) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            int blockSize = cipher.getBlockSize();
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            if (length % blockSize != 0) {
                length += blockSize - (length % blockSize);
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec("NIfb&95GUY86Gfgh".getBytes()));
            return Base64.encode(cipher.doFinal(bArr), 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String e() {
        if (TextUtils.isEmpty(a)) {
            a = a("Ynl0ZWRhbmNl");
        }
        return a;
    }
}
