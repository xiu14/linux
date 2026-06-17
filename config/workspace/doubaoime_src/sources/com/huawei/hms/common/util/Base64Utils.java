package com.huawei.hms.common.util;

import android.util.Base64;
import com.huawei.hms.support.log.HMSLog;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public final class Base64Utils {
    public static byte[] decode(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                StringBuilder M = a.M("decode failed : ");
                M.append(e2.getMessage());
                HMSLog.e("Base64Utils", M.toString());
            }
        }
        return bArr;
    }

    public static byte[] decodeUrlSafe(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return Base64.decode(str, 10);
            } catch (IllegalArgumentException e2) {
                StringBuilder M = a.M("decodeUrlSafe failed : ");
                M.append(e2.getMessage());
                HMSLog.e("Base64Utils", M.toString());
            }
        }
        return bArr;
    }

    public static byte[] decodeUrlSafeNoPadding(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return Base64.decode(str, 11);
            } catch (IllegalArgumentException e2) {
                StringBuilder M = a.M("decodeUrlSafeNoPadding failed : ");
                M.append(e2.getMessage());
                HMSLog.e("Base64Utils", M.toString());
            }
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 0);
        }
        return null;
    }

    public static String encodeUrlSafe(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 10);
        }
        return null;
    }

    public static String encodeUrlSafeNoPadding(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 11);
        }
        return null;
    }
}
