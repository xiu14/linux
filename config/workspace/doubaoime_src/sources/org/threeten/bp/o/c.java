package org.threeten.bp.o;

import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.j;

/* loaded from: classes2.dex */
public abstract class c implements org.threeten.bp.temporal.b {
    @Override // org.threeten.bp.temporal.b
    public int get(e eVar) {
        return range(eVar).a(getLong(eVar), eVar);
    }

    @Override // org.threeten.bp.temporal.b
    public <R> R query(g<R> gVar) {
        if (gVar == f.g() || gVar == f.a() || gVar == f.e()) {
            return null;
        }
        return gVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public j range(e eVar) {
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        if (isSupported(eVar)) {
            return eVar.range();
        }
        throw new i(e.a.a.a.a.z("Unsupported field: ", eVar));
    }
}
