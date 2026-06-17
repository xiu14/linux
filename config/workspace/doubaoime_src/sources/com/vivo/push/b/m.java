package com.vivo.push.b;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m extends t {
    private ArrayList<String> a;

    public m() {
        super(8);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("tags_list", this.a);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.a = dVar.c("tags_list");
    }

    public final ArrayList<String> e() {
        return this.a;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnListTagCommand";
    }
}
