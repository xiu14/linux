package com.xiaomi.push;

import com.xiaomi.push.jl;

/* loaded from: classes2.dex */
public class ji {
    private final jp a;

    /* renamed from: a, reason: collision with other field name */
    private final jy f906a;

    public ji() {
        this(new jl.a());
    }

    public void a(jf jfVar, byte[] bArr) {
        try {
            this.f906a.a(bArr);
            jfVar.a(this.a);
        } finally {
            this.a.k();
        }
    }

    public ji(jr jrVar) {
        jy jyVar = new jy();
        this.f906a = jyVar;
        this.a = jrVar.a(jyVar);
    }
}
