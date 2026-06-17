package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class b {

    @SerializedName("polish")
    private c a;

    @SerializedName("expansion")
    private c b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("suggest")
    private c f2089c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.basic.settings.api.c.b.<init>():void");
    }

    public b(c cVar, c cVar2, c cVar3) {
        kotlin.s.c.l.f(cVar, "polish");
        kotlin.s.c.l.f(cVar2, "expansion");
        kotlin.s.c.l.f(cVar3, "suggest");
        this.a = cVar;
        this.b = cVar2;
        this.f2089c = cVar3;
    }

    public final c a() {
        return this.b;
    }

    public final c b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.s.c.l.a(this.a, bVar.a) && kotlin.s.c.l.a(this.b, bVar.b) && kotlin.s.c.l.a(this.f2089c, bVar.f2089c);
    }

    public int hashCode() {
        return this.f2089c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Assistant(polish=");
        M.append(this.a);
        M.append(", expansion=");
        M.append(this.b);
        M.append(", suggest=");
        M.append(this.f2089c);
        M.append(')');
        return M.toString();
    }

    public /* synthetic */ b(c cVar, c cVar2, c cVar3, int i) {
        this((i & 1) != 0 ? new c(null, null, 3) : cVar, (i & 2) != 0 ? new c(null, null, 3) : null, (i & 4) != 0 ? new c(null, null, 3) : null);
    }
}
