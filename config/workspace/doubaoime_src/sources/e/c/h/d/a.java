package e.c.h.d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.e;
import e.c.c.d.h;

@TargetApi(21)
/* loaded from: classes2.dex */
public class a extends b {
    private final e a;
    private final e.c.h.g.b b;

    public a(e eVar, e.c.h.g.b bVar) {
        this.a = eVar;
        this.b = bVar;
    }

    @Override // e.c.h.d.b
    public e.c.c.g.a<Bitmap> a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = this.a.get(com.facebook.imageutils.b.d(i, i2, config));
        h.a(bitmap.getAllocationByteCount() >= com.facebook.imageutils.b.c(config) * (i * i2));
        bitmap.reconfigure(i, i2, config);
        return this.b.b(bitmap, this.a);
    }
}
