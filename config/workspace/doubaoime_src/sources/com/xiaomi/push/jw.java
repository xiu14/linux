package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class jw extends jz {
    protected InputStream a;

    /* renamed from: a, reason: collision with other field name */
    protected OutputStream f920a;

    protected jw() {
        this.a = null;
        this.f920a = null;
    }

    @Override // com.xiaomi.push.jz
    public int a(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.a;
        if (inputStream == null) {
            throw new ka(1, "Cannot read from null inputStream");
        }
        try {
            int read = inputStream.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            throw new ka(4);
        } catch (IOException e2) {
            throw new ka(0, e2);
        }
    }

    public jw(OutputStream outputStream) {
        this.a = null;
        this.f920a = null;
        this.f920a = outputStream;
    }

    @Override // com.xiaomi.push.jz
    /* renamed from: a, reason: collision with other method in class */
    public void mo650a(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.f920a;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
                return;
            } catch (IOException e2) {
                throw new ka(0, e2);
            }
        }
        throw new ka(1, "Cannot write to null outputStream");
    }
}
