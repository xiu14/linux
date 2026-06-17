package org.threeten.bp.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.l;

/* loaded from: classes2.dex */
public final class d implements Comparable<d>, Serializable {
    private final org.threeten.bp.f a;
    private final l b;

    /* renamed from: c, reason: collision with root package name */
    private final l f10890c;

    d(org.threeten.bp.f fVar, l lVar, l lVar2) {
        this.a = fVar;
        this.b = lVar;
        this.f10890c = lVar2;
    }

    public org.threeten.bp.f a() {
        return this.a.D(this.f10890c.k() - this.b.k());
    }

    public org.threeten.bp.f b() {
        return this.a;
    }

    public org.threeten.bp.c c() {
        return org.threeten.bp.c.d(this.f10890c.k() - this.b.k());
    }

    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        d dVar2 = dVar;
        return this.a.l(this.b).f(dVar2.a.l(dVar2.b));
    }

    public l d() {
        return this.f10890c;
    }

    public l e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.f10890c.equals(dVar.f10890c);
    }

    List<l> f() {
        return g() ? Collections.emptyList() : Arrays.asList(this.b, this.f10890c);
    }

    public boolean g() {
        return this.f10890c.k() > this.b.k();
    }

    public long h() {
        return this.a.k(this.b);
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.f10890c.hashCode(), 16);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Transition[");
        M.append(g() ? "Gap" : "Overlap");
        M.append(" at ");
        M.append(this.a);
        M.append(this.b);
        M.append(" to ");
        M.append(this.f10890c);
        M.append(']');
        return M.toString();
    }

    d(long j, l lVar, l lVar2) {
        this.a = org.threeten.bp.f.z(j, 0, lVar);
        this.b = lVar;
        this.f10890c = lVar2;
    }
}
