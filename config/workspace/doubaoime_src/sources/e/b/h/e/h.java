package e.b.h.e;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: g, reason: collision with root package name */
    private final i f9561g;

    public h(boolean z, i iVar) throws IOException {
        this.a = z;
        this.f9561g = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        iVar.d(allocate, 16L, 2);
        allocate.getShort();
        iVar.d(allocate, 32L, 8);
        this.b = allocate.getLong();
        iVar.d(allocate, 40L, 8);
        this.f9554c = allocate.getLong();
        iVar.d(allocate, 54L, 2);
        this.f9555d = allocate.getShort() & 65535;
        iVar.d(allocate, 56L, 2);
        this.f9556e = allocate.getShort() & 65535;
        iVar.d(allocate, 58L, 2);
        this.f9557f = allocate.getShort() & 65535;
        iVar.d(allocate, 60L, 2);
        allocate.getShort();
        iVar.d(allocate, 62L, 2);
        allocate.getShort();
    }

    @Override // e.b.h.e.d
    public c a(long j, int i) throws IOException {
        return new b(this.f9561g, this, j, i);
    }

    @Override // e.b.h.e.d
    public e b(long j) throws IOException {
        return new k(this.f9561g, this, j);
    }

    @Override // e.b.h.e.d
    public f c(int i) throws IOException {
        return new m(this.f9561g, this, i);
    }
}
