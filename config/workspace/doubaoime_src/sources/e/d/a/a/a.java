package e.d.a.a;

import e.i.b.b.a.b;
import e.i.b.b.b.d;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    private final d a;
    private final b b;

    public a(d dVar, b bVar) {
        l.f(dVar, "animation");
        l.f(bVar, "config");
        this.a = dVar;
        this.b = bVar;
    }

    public final void a() {
        this.b.a(this.a);
        this.a.r();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && l.a(this.b, aVar.b);
    }

    public int hashCode() {
        d dVar = this.a;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        b bVar = this.b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("SpringAnimationHolder(animation=");
        M.append(this.a);
        M.append(", config=");
        M.append(this.b);
        M.append(")");
        return M.toString();
    }
}
