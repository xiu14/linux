package e.b.h.e;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends c {
    public b(i iVar, d dVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 16);
        iVar.d(allocate, j2, 8);
        this.a = allocate.getLong();
        iVar.d(allocate, j2 + 8, 8);
        this.b = allocate.getLong();
    }
}
