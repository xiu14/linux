package com.huawei.secure.android.common.util;

import android.util.Base64;
import android.util.Log;

/* loaded from: classes2.dex */
public class SafeBase64 {
    private SafeBase64() {
    }

    public static byte[] decode(byte[] bArr, int i) {
        try {
            return Base64.decode(bArr, i);
        } catch (Exception e2) {
            Log.e("SafeBase64", e2.getClass().getSimpleName() + " , message0 : " + e2.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i) {
        try {
            return Base64.encode(bArr, i);
        } catch (Exception e2) {
            Log.e("SafeBase64", e2.getClass().getSimpleName() + " , message3 : " + e2.getMessage());
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return Base64.encodeToString(bArr, i);
        } catch (Exception e2) {
            Log.e("SafeBase64", e2.getClass().getSimpleName() + " , message5 : " + e2.getMessage());
            return "";
        }
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        try {
            return Base64.decode(bArr, i, i2, i3);
        } catch (Exception e2) {
            Log.e("SafeBase64", e2.getClass().getSimpleName() + " , message1 : " + e2.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        try {
            return Base64.encode(bArr, i, i2, i3);
        } catch (Exception e2) {
            Log.e("SafeBase64", e2.getClass().getSimpleName() + " , message4 : " + e2.getMessage());
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i, int i2, int i3) {
        try {
            return Base64.encodeToString(bArr, i, i2, i3);
        } catch (Exception e2) {
            Log.e("SafeBase64", e2.getClass().getSimpleName() + " , message6 : " + e2.getMessage());
            return "";
        }
    }

    public static byte[] decode(String str, int i) {
        try {
            return Base64.decode(str, i);
        } catch (Exception e2) {
            Log.e("SafeBase64", e2.getClass().getSimpleName() + " , message2 : " + e2.getMessage());
            return new byte[0];
        }
    }
}
