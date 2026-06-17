package com.vivo.push.b;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class u extends t {
    private ArrayList<String> a;
    private ArrayList<String> b;

    public u(int i) {
        super(i);
        this.a = null;
        this.b = null;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("content", this.a);
        dVar.a("error_msg", this.b);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.a = dVar.c("content");
        this.b = dVar.c("error_msg");
    }

    public final ArrayList<String> e() {
        return this.a;
    }

    public final List<String> f() {
        return this.b;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnSetTagsCommand";
    }
}
