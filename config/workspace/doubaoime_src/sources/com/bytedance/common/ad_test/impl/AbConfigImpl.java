package com.bytedance.common.ad_test.impl;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.common.ad_test.api.IAbConfig;
import com.bytedance.dataplatform.n;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class AbConfigImpl implements IAbConfig {
    @Override // com.bytedance.common.ad_test.api.IAbConfig
    public void initAbtestPanel() {
        n.b(true);
        HashSet hashSet = new HashSet();
        IAppGlobals.a.j("ImeAbTestManager", "[initAbtestPanel] allExperiments=" + hashSet);
        n.a("ime_ab", hashSet);
    }
}
