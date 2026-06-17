package e.c.h.n;

import e.c.h.g.m;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class f implements d {
    private final int a;
    private final boolean b;

    public f(int i, boolean z, d dVar, Integer num, boolean z2) {
        this.a = i;
        this.b = z2;
    }

    private c a(e.c.g.d dVar, boolean z) {
        int i = this.a;
        boolean z2 = this.b;
        try {
            Class<?> cls = Class.forName("com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory");
            Class<?> cls2 = Boolean.TYPE;
            return ((d) cls.getConstructor(Integer.TYPE, cls2, cls2).newInstance(Integer.valueOf(i), Boolean.FALSE, Boolean.valueOf(z2))).createImageTranscoder(dVar, z);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        }
    }

    @Override // e.c.h.n.d
    public c createImageTranscoder(e.c.g.d dVar, boolean z) {
        c a = m.a() ? a(dVar, z) : null;
        return a == null ? new h(this.a).createImageTranscoder(dVar, z) : a;
    }
}
