package e.c.h.f;

import com.facebook.common.memory.MemoryTrimType;
import e.c.h.f.s;

/* loaded from: classes2.dex */
public class d implements s.a {
    @Override // e.c.h.f.s.a
    public double a(MemoryTrimType memoryTrimType) {
        int ordinal = memoryTrimType.ordinal();
        if (ordinal == 0) {
            return MemoryTrimType.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio();
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return 1.0d;
        }
        e.c.c.e.a.z("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", memoryTrimType);
        return 0.0d;
    }
}
