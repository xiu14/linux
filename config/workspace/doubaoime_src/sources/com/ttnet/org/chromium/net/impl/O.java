package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.u;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class O extends u.a {
    private final u.a b;

    public O(u.a aVar) {
        super(aVar.a());
        this.b = aVar;
    }

    @Override // com.ttnet.org.chromium.net.u.a
    public Executor a() {
        return this.b.a();
    }

    @Override // com.ttnet.org.chromium.net.u.a
    public void b(com.ttnet.org.chromium.net.u uVar) {
        this.b.b(uVar);
    }
}
