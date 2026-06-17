package f;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public interface f extends x, WritableByteChannel {
    f C() throws IOException;

    f J(String str) throws IOException;

    f R(long j) throws IOException;

    f Z(h hVar) throws IOException;

    e b();

    @Override // f.x, java.io.Flushable
    void flush() throws IOException;

    f h0(long j) throws IOException;

    OutputStream i0();

    f n() throws IOException;

    f q(long j) throws IOException;

    f u(int i) throws IOException;

    f write(byte[] bArr) throws IOException;

    f write(byte[] bArr, int i, int i2) throws IOException;

    f writeByte(int i) throws IOException;

    f writeInt(int i) throws IOException;

    f writeShort(int i) throws IOException;
}
