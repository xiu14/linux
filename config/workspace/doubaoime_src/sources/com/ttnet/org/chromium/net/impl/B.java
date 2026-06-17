package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.AbstractC0759g;

/* loaded from: classes2.dex */
public class B extends A {
    private L R;

    public B(Context context, boolean z) {
        super(context, z);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    /* renamed from: W0 */
    public CronetEngineBuilderImpl x(AbstractC0759g.a.AbstractC0400a abstractC0400a) {
        this.R = new L(abstractC0400a);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m x(AbstractC0759g.a.AbstractC0400a abstractC0400a) {
        this.R = new L(abstractC0400a);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    L y0() {
        return this.R;
    }
}
