package f;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class s implements f {
    public final e a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final x f10059c;

    public s(x xVar) {
        kotlin.s.c.l.g(xVar, "sink");
        this.f10059c = xVar;
        this.a = new e();
    }

    @Override // f.f
    public f C() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        long d2 = this.a.d();
        if (d2 > 0) {
            this.f10059c.O(this.a, d2);
        }
        return this;
    }

    @Override // f.f
    public f J(String str) {
        kotlin.s.c.l.g(str, TypedValues.Custom.S_STRING);
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.j0(str);
        C();
        return this;
    }

    @Override // f.x
    public void O(e eVar, long j) {
        kotlin.s.c.l.g(eVar, "source");
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.O(eVar, j);
        C();
    }

    @Override // f.f
    public f R(long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.R(j);
        C();
        return this;
    }

    @Override // f.f
    public f Z(h hVar) {
        kotlin.s.c.l.g(hVar, "byteString");
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.N(hVar);
        C();
        return this;
    }

    @Override // f.f
    public e b() {
        return this.a;
    }

    @Override // f.x
    public A c() {
        return this.f10059c.c();
    }

    @Override // f.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.b) {
            return;
        }
        Throwable th = null;
        try {
            if (this.a.I() > 0) {
                x xVar = this.f10059c;
                e eVar = this.a;
                xVar.O(eVar, eVar.I());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f10059c.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // f.f, f.x, java.io.Flushable
    public void flush() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.a.I() > 0) {
            x xVar = this.f10059c;
            e eVar = this.a;
            xVar.O(eVar, eVar.I());
        }
        this.f10059c.flush();
    }

    @Override // f.f
    public f h0(long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.h0(j);
        C();
        return this;
    }

    @Override // f.f
    public OutputStream i0() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.b;
    }

    @Override // f.f
    public f n() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        long I = this.a.I();
        if (I > 0) {
            this.f10059c.O(this.a, I);
        }
        return this;
    }

    @Override // f.f
    public f q(long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.e0(com.prolificinteractive.materialcalendarview.r.i0(j));
        C();
        return this;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("buffer(");
        M.append(this.f10059c);
        M.append(')');
        return M.toString();
    }

    @Override // f.f
    public f u(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.c0(com.prolificinteractive.materialcalendarview.r.h0(i));
        C();
        return this;
    }

    @Override // f.f
    public f write(byte[] bArr) {
        kotlin.s.c.l.g(bArr, "source");
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.P(bArr);
        C();
        return this;
    }

    @Override // f.f
    public f writeByte(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.U(i);
        C();
        return this;
    }

    @Override // f.f
    public f writeInt(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.c0(i);
        C();
        return this;
    }

    @Override // f.f
    public f writeShort(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.f0(i);
        C();
        return this;
    }

    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            s.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            s sVar = s.this;
            if (sVar.b) {
                return;
            }
            sVar.flush();
        }

        public String toString() {
            return s.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            s sVar = s.this;
            if (sVar.b) {
                throw new IOException("closed");
            }
            sVar.a.U((byte) i);
            s.this.C();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            kotlin.s.c.l.g(bArr, RemoteMessageConst.DATA);
            s sVar = s.this;
            if (!sVar.b) {
                sVar.a.Q(bArr, i, i2);
                s.this.C();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // f.f
    public f write(byte[] bArr, int i, int i2) {
        kotlin.s.c.l.g(bArr, "source");
        if (!this.b) {
            this.a.Q(bArr, i, i2);
            C();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        kotlin.s.c.l.g(byteBuffer, "source");
        if (!this.b) {
            int write = this.a.write(byteBuffer);
            C();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
