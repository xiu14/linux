package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b extends com.google.gson.stream.b {
    private static final Writer p = new a();
    private static final o q = new o("closed");
    private final List<i> m;
    private String n;
    private i o;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public b() {
        super(p);
        this.m = new ArrayList();
        this.o = k.a;
    }

    private i n0() {
        return this.m.get(r0.size() - 1);
    }

    private void o0(i iVar) {
        if (this.n != null) {
            if (!(iVar instanceof k) || r()) {
                ((l) n0()).d(this.n, iVar);
            }
            this.n = null;
            return;
        }
        if (this.m.isEmpty()) {
            this.o = iVar;
            return;
        }
        i n0 = n0();
        if (!(n0 instanceof f)) {
            throw new IllegalStateException();
        }
        ((f) n0).d(iVar);
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b D() throws IOException {
        o0(k.a);
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b U(double d2) throws IOException {
        if (w() || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            o0(new o(Double.valueOf(d2)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b Y(long j) throws IOException {
        o0(new o(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b a0(Boolean bool) throws IOException {
        if (bool == null) {
            o0(k.a);
            return this;
        }
        o0(new o(bool));
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b c0(Number number) throws IOException {
        if (number == null) {
            o0(k.a);
            return this;
        }
        if (!w()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        o0(new o(number));
        return this;
    }

    @Override // com.google.gson.stream.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.m.add(q);
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b d() throws IOException {
        f fVar = new f();
        o0(fVar);
        this.m.add(fVar);
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b e0(String str) throws IOException {
        if (str == null) {
            o0(k.a);
            return this;
        }
        o0(new o(str));
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b f0(boolean z) throws IOException {
        o0(new o(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.b, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b h() throws IOException {
        l lVar = new l();
        o0(lVar);
        this.m.add(lVar);
        return this;
    }

    public i l0() {
        if (this.m.isEmpty()) {
            return this.o;
        }
        StringBuilder M = e.a.a.a.a.M("Expected one JSON element but was ");
        M.append(this.m);
        throw new IllegalStateException(M.toString());
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b o() throws IOException {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(n0() instanceof f)) {
            throw new IllegalStateException();
        }
        this.m.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b p() throws IOException {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(n0() instanceof l)) {
            throw new IllegalStateException();
        }
        this.m.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b x(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.b
    public com.google.gson.stream.b z(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(n0() instanceof l)) {
            throw new IllegalStateException();
        }
        this.n = str;
        return this;
    }
}
