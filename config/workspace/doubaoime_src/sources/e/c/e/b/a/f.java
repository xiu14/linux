package e.c.e.b.a;

import android.content.Context;
import android.content.res.Resources;
import e.c.c.d.j;
import e.c.h.g.h;
import e.c.h.g.l;
import java.util.Set;

/* loaded from: classes2.dex */
public class f implements j<e> {
    private final Context a;
    private final h b;

    /* renamed from: c, reason: collision with root package name */
    private final g f9769c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<com.facebook.drawee.controller.e> f9770d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<e.c.f.b.a.b> f9771e;

    public f(Context context, l lVar, Set set, Set set2) {
        this.a = context;
        h i = lVar.i();
        this.b = i;
        g gVar = new g();
        this.f9769c = gVar;
        Resources resources = context.getResources();
        com.facebook.drawee.components.a b = com.facebook.drawee.components.a.b();
        e.c.h.c.a.a c2 = lVar.c();
        gVar.b(resources, b, c2 == null ? null : c2.a(context), e.c.c.b.h.b(), i.c(), null, null, null);
        this.f9770d = null;
        this.f9771e = null;
    }

    @Override // e.c.c.d.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e get() {
        e eVar = new e(this.a, this.f9769c, this.b, this.f9770d, this.f9771e);
        eVar.w(null);
        return eVar;
    }
}
