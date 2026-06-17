package org.threeten.bp.o;

import org.threeten.bp.chrono.i;
import org.threeten.bp.chrono.o;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;

/* loaded from: classes2.dex */
public abstract class a extends c implements i {
    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.a(ChronoField.ERA, ((o) this).h());
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public int get(e eVar) {
        return eVar == ChronoField.ERA ? ((o) this).h() : range(eVar).a(getLong(eVar), eVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(e eVar) {
        if (eVar == ChronoField.ERA) {
            return ((o) this).h();
        }
        if (eVar instanceof ChronoField) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        return eVar.getFrom(this);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(e eVar) {
        return eVar instanceof ChronoField ? eVar == ChronoField.ERA : eVar != null && eVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(g<R> gVar) {
        if (gVar == f.e()) {
            return (R) ChronoUnit.ERAS;
        }
        if (gVar == f.a() || gVar == f.f() || gVar == f.g() || gVar == f.d() || gVar == f.b() || gVar == f.c()) {
            return null;
        }
        return gVar.a(this);
    }
}
