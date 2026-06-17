package org.threeten.bp.format;

import org.threeten.bp.chrono.h;
import org.threeten.bp.k;
import org.threeten.bp.temporal.j;

/* loaded from: classes2.dex */
final class c extends org.threeten.bp.o.c {
    final /* synthetic */ org.threeten.bp.chrono.b a;
    final /* synthetic */ org.threeten.bp.temporal.b b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f10831c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f10832d;

    c(org.threeten.bp.chrono.b bVar, org.threeten.bp.temporal.b bVar2, h hVar, k kVar) {
        this.a = bVar;
        this.b = bVar2;
        this.f10831c = hVar;
        this.f10832d = kVar;
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        return (this.a == null || !eVar.isDateBased()) ? this.b.getLong(eVar) : this.a.getLong(eVar);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return (this.a == null || !eVar.isDateBased()) ? this.b.isSupported(eVar) : this.a.isSupported(eVar);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        return gVar == org.threeten.bp.temporal.f.a() ? (R) this.f10831c : gVar == org.threeten.bp.temporal.f.g() ? (R) this.f10832d : gVar == org.threeten.bp.temporal.f.e() ? (R) this.b.query(gVar) : gVar.a(this);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public j range(org.threeten.bp.temporal.e eVar) {
        return (this.a == null || !eVar.isDateBased()) ? this.b.range(eVar) : this.a.range(eVar);
    }
}
