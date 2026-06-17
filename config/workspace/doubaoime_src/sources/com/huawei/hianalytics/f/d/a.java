package com.huawei.hianalytics.f.d;

import com.huawei.hianalytics.g.b;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.huawei.hianalytics.f.d.a$a, reason: collision with other inner class name */
    public interface InterfaceC0346a {
        void a(long j, byte[] bArr);
    }

    public static void a(String str, String str2, InterfaceC0346a interfaceC0346a) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] digest = messageDigest.digest((str + str2 + currentTimeMillis).getBytes("UTF-8"));
            if (interfaceC0346a != null) {
                interfaceC0346a.a(currentTimeMillis, digest);
            }
        } catch (UnsupportedEncodingException unused) {
            b.c("Generator", "getHmac(): UnsupportedEncodingException: Exception when writing the log file.");
        }
    }
}
