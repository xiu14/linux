package f;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public interface g extends z, ReadableByteChannel {
    long B(h hVar) throws IOException;

    String E(long j) throws IOException;

    boolean K(long j, h hVar) throws IOException;

    String L(Charset charset) throws IOException;

    boolean T(long j) throws IOException;

    String V() throws IOException;

    int W() throws IOException;

    byte[] X(long j) throws IOException;

    e b();

    long d0() throws IOException;

    void g0(long j) throws IOException;

    InputStream j();

    String k(long j) throws IOException;

    long k0() throws IOException;

    h m(long j) throws IOException;

    int m0(p pVar) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;

    e t();

    boolean v() throws IOException;

    void y(e eVar, long j) throws IOException;
}
