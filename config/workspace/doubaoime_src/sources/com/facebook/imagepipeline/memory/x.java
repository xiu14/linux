package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public class x extends com.facebook.common.memory.j {
    private final u a;
    private e.c.c.g.a<t> b;

    /* renamed from: c, reason: collision with root package name */
    private int f6511c;

    public static class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public x(u uVar, int i) {
        e.c.c.d.h.a(i > 0);
        Objects.requireNonNull(uVar);
        this.a = uVar;
        this.f6511c = 0;
        this.b = e.c.c.g.a.D(uVar.get(i), uVar);
    }

    private void a() {
        if (!e.c.c.g.a.x(this.b)) {
            throw new a();
        }
    }

    @Override // com.facebook.common.memory.j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e.c.c.g.a<t> aVar = this.b;
        int i = e.c.c.g.a.h;
        if (aVar != null) {
            aVar.close();
        }
        this.b = null;
        this.f6511c = -1;
        super.close();
    }

    public v d() {
        a();
        return new v(this.b, this.f6511c);
    }

    @Override // com.facebook.common.memory.j
    public int size() {
        return this.f6511c;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder M = e.a.a.a.a.M("length=");
            e.a.a.a.a.F0(M, bArr.length, "; regionStart=", i, "; regionLength=");
            M.append(i2);
            throw new ArrayIndexOutOfBoundsException(M.toString());
        }
        a();
        int i3 = this.f6511c + i2;
        a();
        if (i3 > this.b.r().a()) {
            t tVar = this.a.get(i3);
            this.b.r().h(0, tVar, 0, this.f6511c);
            this.b.close();
            this.b = e.c.c.g.a.D(tVar, this.a);
        }
        this.b.r().l(this.f6511c, bArr, i, i2);
        this.f6511c += i2;
    }
}
