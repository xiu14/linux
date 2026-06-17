package org.apache.thrift.transport;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes2.dex */
public class TFileTransport extends org.apache.thrift.transport.b {
    protected org.apache.thrift.transport.a b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10758g;
    TailPolicy a = TailPolicy.NOWAIT;

    /* renamed from: c, reason: collision with root package name */
    protected OutputStream f10754c = null;

    /* renamed from: d, reason: collision with root package name */
    b f10755d = null;

    /* renamed from: e, reason: collision with root package name */
    InputStream f10756e = null;

    /* renamed from: f, reason: collision with root package name */
    a f10757f = null;

    public enum TailPolicy {
        NOWAIT(0, 0),
        WAIT_FOREVER(500, -1);

        public final int retries_;
        public final int timeout_;

        TailPolicy(int i, int i2) {
            this.timeout_ = i;
            this.retries_ = i2;
        }
    }

    public static class a {
        private long a = 0;

        public long a() {
            return this.a;
        }

        public int b() {
            return 16777216 - ((int) (this.a % 16777216));
        }

        public void c(long j) {
            this.a = j;
        }

        public void d(int i) {
            this.a += i;
        }
    }

    public static class b {
        private byte[] a;

        /* renamed from: c, reason: collision with root package name */
        private int f10759c = 0;
        private int b = 0;

        public b(byte[] bArr) {
            this.a = bArr;
        }

        public int a(byte[] bArr, int i, int i2) {
            if (i2 == 0 || i2 > c()) {
                i2 = c();
            }
            if (i2 <= 0) {
                return i2;
            }
            System.arraycopy(this.a, this.b, bArr, i, i2);
            this.b += i2;
            return i2;
        }

        public byte[] b() {
            return this.a;
        }

        public int c() {
            return this.f10759c - this.b;
        }

        public int d() {
            return this.a.length;
        }

        public void e(int i) {
            this.b = 0;
            this.f10759c = i;
        }
    }

    public static class c extends BufferedInputStream {
        public c(InputStream inputStream) {
            super(inputStream);
        }

        public void a() {
            ((BufferedInputStream) this).count = 0;
            ((BufferedInputStream) this).pos = 0;
        }
    }

    public TFileTransport(String str, boolean z) throws IOException {
        this.b = null;
        this.f10758g = false;
        this.b = new org.apache.thrift.transport.a(str);
        this.f10758g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void main(java.lang.String[] r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.thrift.transport.TFileTransport.main(java.lang.String[]):void");
    }

    private InputStream r() throws org.apache.thrift.transport.c {
        try {
            InputStream inputStream = this.f10756e;
            if (inputStream != null) {
                ((c) inputStream).a();
                return this.f10756e;
            }
            org.apache.thrift.transport.a aVar = this.b;
            Objects.requireNonNull(aVar);
            return new c(new FileInputStream(aVar.b.getFD()));
        } catch (IOException e2) {
            PrintStream printStream = System.err;
            StringBuilder M = e.a.a.a.a.M("createInputStream: ");
            M.append(e2.getMessage());
            printStream.println(M.toString());
            throw new org.apache.thrift.transport.c(e2.getMessage(), e2);
        }
    }

    private boolean w() throws org.apache.thrift.transport.c {
        int i;
        byte[] bArr = new byte[4];
        do {
            int b2 = this.f10757f.b();
            if ((b2 < 4 && x(this.f10756e, bArr, 0, b2, this.a) != b2) || x(this.f10756e, bArr, 0, 4, this.a) != 4) {
                return false;
            }
            i = 0;
            for (int i2 = 3; i2 >= 0; i2--) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            if (i > this.f10757f.b()) {
                throw new org.apache.thrift.transport.c("FileTransport error: bad event size");
            }
        } while (i == 0);
        if (this.f10755d.d() < i) {
            this.f10755d = new b(new byte[i]);
        }
        if (x(this.f10756e, this.f10755d.b(), 0, i, this.a) != i) {
            return false;
        }
        this.f10755d.e(i);
        return true;
    }

    private int x(InputStream inputStream, byte[] bArr, int i, int i2, TailPolicy tailPolicy) throws org.apache.thrift.transport.c {
        int read;
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (i3 > 0) {
                try {
                    read = inputStream.read(bArr, i, i3);
                    if (read > 0) {
                        break;
                    }
                    if (read != -1) {
                        throw new org.apache.thrift.transport.c("Unexpected return from InputStream.read = " + read);
                    }
                    i4++;
                    int i5 = tailPolicy.retries_;
                    if (i5 != -1 && i5 < i4) {
                        return i2 - i3;
                    }
                    int i6 = tailPolicy.timeout_;
                    if (i6 > 0) {
                        try {
                            Thread.sleep(i6);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (IOException e2) {
                    throw new org.apache.thrift.transport.c(e2.getMessage(), e2);
                }
            }
            return i2 - i3;
            i += read;
            i3 -= read;
            this.f10757f.d(read);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        org.apache.thrift.transport.a aVar = this.b;
        if (aVar != null) {
            try {
                RandomAccessFile randomAccessFile = aVar.b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                PrintStream printStream = System.err;
                StringBuilder M = e.a.a.a.a.M("WARNING: Error closing input file: ");
                M.append(e2.getMessage());
                printStream.println(M.toString());
            }
            this.b = null;
        }
        OutputStream outputStream = this.f10754c;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e3) {
                PrintStream printStream2 = System.err;
                StringBuilder M2 = e.a.a.a.a.M("WARNING: Error closing output stream: ");
                M2.append(e3.getMessage());
                printStream2.println(M2.toString());
            }
            this.f10754c = null;
        }
    }

    public boolean isOpen() {
        return this.f10756e != null && (this.f10758g || this.f10754c != null);
    }

    @Override // org.apache.thrift.transport.b
    public int o(byte[] bArr, int i, int i2) throws org.apache.thrift.transport.c {
        int i3 = 0;
        while (i3 < i2) {
            int read = read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                throw new org.apache.thrift.transport.c("Error in reading from file");
            }
            if (read == 0) {
                throw new org.apache.thrift.transport.c(4, "End of File reached");
            }
            i3 += read;
        }
        return i3;
    }

    @Override // org.apache.thrift.transport.b
    public void p(byte[] bArr, int i, int i2) throws org.apache.thrift.transport.c {
        throw new org.apache.thrift.transport.c("Not Supported");
    }

    @Override // org.apache.thrift.transport.b
    public int read(byte[] bArr, int i, int i2) throws org.apache.thrift.transport.c {
        if (!isOpen()) {
            throw new org.apache.thrift.transport.c(1, "Must open before reading");
        }
        if (this.f10755d.c() != 0 || w()) {
            return this.f10755d.a(bArr, i, i2);
        }
        return 0;
    }

    public int s() throws org.apache.thrift.transport.c {
        if (!isOpen()) {
            throw new org.apache.thrift.transport.c(1, "Must open before getNumChunks");
        }
        try {
            long length = this.b.b.length();
            if (length == 0) {
                return 0;
            }
            Objects.requireNonNull(this.f10757f);
            return ((int) (length / 16777216)) + 1;
        } catch (IOException e2) {
            throw new org.apache.thrift.transport.c(e2.getMessage(), e2);
        }
    }
}
