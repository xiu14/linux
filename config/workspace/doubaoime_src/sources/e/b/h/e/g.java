package e.b.h.e;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: g, reason: collision with root package name */
    private final i f9560g;

    public g(boolean z, i iVar) throws IOException {
        this.a = z;
        this.f9560g = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        iVar.d(allocate, 16L, 2);
        allocate.getShort();
        this.b = iVar.h(allocate, 28L);
        this.f9554c = iVar.h(allocate, 32L);
        iVar.d(allocate, 42L, 2);
        this.f9555d = allocate.getShort() & 65535;
        iVar.d(allocate, 44L, 2);
        this.f9556e = allocate.getShort() & 65535;
        iVar.d(allocate, 46L, 2);
        this.f9557f = allocate.getShort() & 65535;
        iVar.d(allocate, 48L, 2);
        allocate.getShort();
        iVar.d(allocate, 50L, 2);
        allocate.getShort();
    }

    @Override // e.b.h.e.d
    public c a(long j, int i) throws IOException {
        return new a(this.f9560g, this, j, i);
    }

    @Override // e.b.h.e.d
    public e b(long j) throws IOException {
        return new j(this.f9560g, this, j);
    }

    @Override // e.b.h.e.d
    public f c(int i) throws IOException {
        return new l(this.f9560g, this, i);
    }
}
