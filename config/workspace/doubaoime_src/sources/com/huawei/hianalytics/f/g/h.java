package com.huawei.hianalytics.f.g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes2.dex */
public final class h {
    public static int a(String str) {
        if ("preins".equals(str)) {
            return 2;
        }
        return "maint".equals(str) ? 1 : 0;
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
            com.huawei.hianalytics.g.b.c("StreamUtil", "closeStream(): Exception: close OutputStream error!");
        }
        return byteArray;
    }
}
