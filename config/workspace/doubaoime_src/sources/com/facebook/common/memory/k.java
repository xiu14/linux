package com.facebook.common.memory;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class k {
    private final int a;
    private final a b;

    public k(a aVar) {
        e.c.c.d.h.a(true);
        this.a = 16384;
        this.b = aVar;
    }

    public long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.b.get(this.a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += read;
            } finally {
                this.b.release(bArr);
            }
        }
    }

    public long b(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        MessageDigest messageDigest;
        byte[] bArr = this.b.get(this.a);
        String str2 = null;
        long j = 0;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception unused) {
            messageDigest = null;
        }
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.a);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                j += read;
                if (messageDigest != null && read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            } finally {
                this.b.release(bArr);
            }
        }
        if (messageDigest != null) {
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toHexString(i));
            }
            str2 = sb.toString();
        }
        if (TextUtils.isEmpty(str2)) {
            e.c.c.e.a.t(getClass(), "the image md5 should not be null, you should check the image is valid or not");
        } else if (str == null) {
            e.c.c.e.a.t(getClass(), "the target md5 should not be null, you should check the md5 file has been remove or not");
        } else if (!str.equals(str2)) {
            return -1L;
        }
        return j;
    }
}
