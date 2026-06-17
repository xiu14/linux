package com.bytedance.apm.util;

import android.text.TextUtils;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class c {
    public static String a(byte[] bArr, String str) {
        String str2;
        String str3 = "";
        try {
            byte[] decode = Base64.decode(bArr, 0);
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
                cipher.init(2, secretKeySpec);
                str2 = new String(cipher.doFinal(decode));
            } catch (Exception unused) {
            }
            try {
                int indexOf = str2.indexOf("$");
                return indexOf != -1 ? str2.substring(0, indexOf) : str2;
            } catch (Exception unused2) {
                str3 = str2;
                return str3;
            }
        } catch (Exception unused3) {
            return "";
        }
    }
}
