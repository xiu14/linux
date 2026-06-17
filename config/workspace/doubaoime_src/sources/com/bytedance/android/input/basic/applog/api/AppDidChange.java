package com.bytedance.android.input.basic.applog.api;

import com.bytedance.news.common.service.manager.IService;
import kotlin.s.c.A;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class AppDidChange implements IAppDidChange {
    public static final AppDidChange INSTANCE = new AppDidChange();
    private final /* synthetic */ IAppDidChange $$delegate_0;

    private AppDidChange() {
        IService S = com.bytedance.feedbackerlib.a.S(A.b(IAppDidChange.class));
        l.c(S);
        this.$$delegate_0 = (IAppDidChange) S;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppDidChange
    public void notifyConfigChange(boolean z) {
        this.$$delegate_0.notifyConfigChange(z);
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppDidChange
    public void registerDidChangeListener(a aVar) {
        this.$$delegate_0.registerDidChangeListener(aVar);
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppDidChange
    public void unregisterDidChangeListener(a aVar) {
        this.$$delegate_0.unregisterDidChangeListener(aVar);
    }
}
