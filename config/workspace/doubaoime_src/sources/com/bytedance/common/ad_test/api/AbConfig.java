package com.bytedance.common.ad_test.api;

import com.bytedance.feedbackerlib.a;
import com.bytedance.news.common.service.manager.IService;
import kotlin.s.c.A;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class AbConfig implements IAbConfig {
    public static final AbConfig INSTANCE = new AbConfig();
    private final /* synthetic */ IAbConfig $$delegate_0;

    private AbConfig() {
        IService S = a.S(A.b(IAbConfig.class));
        l.c(S);
        this.$$delegate_0 = (IAbConfig) S;
    }

    @Override // com.bytedance.common.ad_test.api.IAbConfig
    public void initAbtestPanel() {
        this.$$delegate_0.initAbtestPanel();
    }
}
