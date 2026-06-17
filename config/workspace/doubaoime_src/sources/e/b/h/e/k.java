package e.b.h.e;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class k extends e {
    public k(i iVar, d dVar, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * dVar.f9555d) + dVar.b;
        this.a = iVar.h(allocate, j2);
        iVar.d(allocate, 8 + j2, 8);
        this.b = allocate.getLong();
        iVar.d(allocate, 16 + j2, 8);
        this.f9558c = allocate.getLong();
        iVar.d(allocate, j2 + 40, 8);
        this.f9559d = allocate.getLong();
    }
}
