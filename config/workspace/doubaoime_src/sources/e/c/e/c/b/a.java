package e.c.e.c.b;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.c;

/* loaded from: classes2.dex */
public class a extends c {
    private long b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f9796c = -1;

    /* renamed from: d, reason: collision with root package name */
    private b f9797d;

    public a(b bVar) {
        this.f9797d = bVar;
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void b(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f9796c = currentTimeMillis;
        b bVar = this.f9797d;
        if (bVar != null) {
            ((e.c.e.c.a) bVar).c(currentTimeMillis - this.b);
        }
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void e(String str, Object obj) {
        this.b = System.currentTimeMillis();
    }
}
