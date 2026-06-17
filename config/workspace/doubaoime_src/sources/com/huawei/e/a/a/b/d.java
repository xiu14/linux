package com.huawei.e.a.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes2.dex */
public class d {
    private static volatile e a;

    private d() {
    }

    @SuppressLint({"NewApi"})
    public static e a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        System.currentTimeMillis();
        com.huawei.e.a.a.b.g.b.g(context);
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    InputStream inputStream = null;
                    try {
                        inputStream = com.huawei.e.a.a.b.g.a.k(context);
                    } catch (RuntimeException unused) {
                        com.huawei.e.a.a.b.g.b.c("SecureX509SingleInstance", "get files bks error");
                    }
                    if (inputStream == null) {
                        com.huawei.e.a.a.b.g.b.d("SecureX509SingleInstance", "get assets bks");
                        inputStream = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        com.huawei.e.a.a.b.g.b.d("SecureX509SingleInstance", "get files bks");
                    }
                    a = new e(inputStream, "");
                }
            }
        }
        System.currentTimeMillis();
        return a;
    }
}
