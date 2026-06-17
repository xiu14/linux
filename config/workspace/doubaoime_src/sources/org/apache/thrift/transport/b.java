package org.apache.thrift.transport;

import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class b implements Closeable {
    public void a(int i) {
    }

    public byte[] d() {
        return null;
    }

    public int h() {
        return 0;
    }

    public int l() {
        return -1;
    }

    public int o(byte[] bArr, int i, int i2) throws c {
        int i3 = 0;
        while (i3 < i2) {
            int read = read(bArr, i + i3, i2 - i3);
            if (read <= 0) {
                throw new c("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
            i3 += read;
        }
        return i3;
    }

    public abstract void p(byte[] bArr, int i, int i2) throws c;

    public abstract int read(byte[] bArr, int i, int i2) throws c;
}
