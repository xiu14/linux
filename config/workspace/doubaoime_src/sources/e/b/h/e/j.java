package e.b.h.e;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class j extends e {
    public j(i iVar, d dVar, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * dVar.f9555d) + dVar.b;
        this.a = iVar.h(allocate, j2);
        this.b = iVar.h(allocate, 4 + j2);
        this.f9558c = iVar.h(allocate, 8 + j2);
        this.f9559d = iVar.h(allocate, j2 + 20);
    }
}
