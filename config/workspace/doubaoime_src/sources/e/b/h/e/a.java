package e.b.h.e;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class a extends c {
    public a(i iVar, d dVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 8);
        this.a = iVar.h(allocate, j2);
        this.b = iVar.h(allocate, j2 + 4);
    }
}
