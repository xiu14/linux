package e.h.a.f.c;

import java.util.Enumeration;

/* loaded from: classes2.dex */
public class k implements e.h.a.f.b {
    @Override // e.h.a.f.b
    public boolean b(e.h.a.e.a aVar) {
        Enumeration h = e.h.a.a.g().h();
        if (h != null) {
            while (h.hasMoreElements()) {
                e.h.a.h.a aVar2 = (e.h.a.h.a) h.nextElement();
                if (aVar2 != null && aVar2.a(aVar)) {
                    e.h.a.j.a.c(new e.h.a.j.c.b(0L, false, aVar.b(), null));
                    return true;
                }
            }
        }
        return false;
    }
}
