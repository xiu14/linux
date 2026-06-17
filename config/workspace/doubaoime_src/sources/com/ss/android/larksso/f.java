package com.ss.android.larksso;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static List<String> a(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(byteArray);
                        byte[] digest = messageDigest.digest();
                        char[] cArr = new char[32];
                        int i = 0;
                        for (int i2 = 0; i2 < 16; i2++) {
                            byte b = digest[i2];
                            int i3 = i + 1;
                            char[] cArr2 = a;
                            cArr[i] = cArr2[(b >>> 4) & 15];
                            i = i3 + 1;
                            cArr[i3] = cArr2[b & 15];
                        }
                        str2 = new String(cArr);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        str2 = null;
                    }
                    arrayList.add(str2);
                }
                return arrayList;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
