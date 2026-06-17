package com.obric.oui.window.bean;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b {
    private final String a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private final c f8175c;

    /* renamed from: d, reason: collision with root package name */
    private final d f8176d;

    public b(String str, a aVar, c cVar, d dVar) {
        l.f(str, "gridMode");
        l.f(aVar, "pageColumns");
        l.f(cVar, "pageGutter");
        l.f(dVar, "pageMargin");
        this.a = str;
        this.b = aVar;
        this.f8175c = cVar;
        this.f8176d = dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.a, bVar.a) && l.a(this.b, bVar.b) && l.a(this.f8175c, bVar.f8175c) && l.a(this.f8176d, bVar.f8176d);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        c cVar = this.f8175c;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        d dVar = this.f8176d;
        return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("PageGridConfig(gridMode=");
        M.append(this.a);
        M.append(", pageColumns=");
        M.append(this.b);
        M.append(", pageGutter=");
        M.append(this.f8175c);
        M.append(", pageMargin=");
        M.append(this.f8176d);
        M.append(")");
        return M.toString();
    }
}
