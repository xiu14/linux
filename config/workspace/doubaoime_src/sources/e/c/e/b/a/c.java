package e.c.e.b.a;

import android.content.Context;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import e.c.c.d.j;
import e.c.h.g.l;

/* loaded from: classes2.dex */
final class c implements com.facebook.drawee.controller.g {
    private volatile f a = null;
    final /* synthetic */ Context b;

    c(Context context) {
        this.b = context;
    }

    @Override // com.facebook.drawee.controller.g
    public j<? extends AbstractDraweeControllerBuilder> a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = new f(this.b, l.j(), null, null);
                }
            }
        }
        return this.a;
    }
}
