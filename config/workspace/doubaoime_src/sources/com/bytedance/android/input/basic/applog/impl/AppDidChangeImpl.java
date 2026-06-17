package com.bytedance.android.input.basic.applog.impl;

import com.bytedance.android.input.basic.applog.api.IAppDidChange;
import com.bytedance.android.input.basic.d.f;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class AppDidChangeImpl implements IAppDidChange {
    private f<com.bytedance.android.input.basic.applog.api.a> bdTrackerListener = new f<>();

    static final class a extends m implements l<com.bytedance.android.input.basic.applog.api.a, Boolean> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.s.b.l
        public Boolean invoke(com.bytedance.android.input.basic.applog.api.a aVar) {
            com.bytedance.android.input.basic.applog.api.a aVar2 = aVar;
            kotlin.s.c.l.f(aVar2, "it");
            aVar2.a(com.bytedance.applog.a.c(), com.bytedance.applog.a.d(), Boolean.valueOf(this.a));
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyConfigChange$lambda$0(AppDidChangeImpl appDidChangeImpl, boolean z) {
        kotlin.s.c.l.f(appDidChangeImpl, "this$0");
        appDidChangeImpl.bdTrackerListener.a(new a(z));
    }

    public final f<com.bytedance.android.input.basic.applog.api.a> getBdTrackerListener() {
        return this.bdTrackerListener;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppDidChange
    public void notifyConfigChange(final boolean z) {
        com.bytedance.common.utility.h.c.b(new Runnable() { // from class: com.bytedance.android.input.basic.applog.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                AppDidChangeImpl.notifyConfigChange$lambda$0(AppDidChangeImpl.this, z);
            }
        });
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppDidChange
    public void registerDidChangeListener(com.bytedance.android.input.basic.applog.api.a aVar) {
        if (aVar != null) {
            this.bdTrackerListener.b(aVar);
        }
    }

    public final void setBdTrackerListener(f<com.bytedance.android.input.basic.applog.api.a> fVar) {
        kotlin.s.c.l.f(fVar, "<set-?>");
        this.bdTrackerListener = fVar;
    }

    @Override // com.bytedance.android.input.basic.applog.api.IAppDidChange
    public void unregisterDidChangeListener(com.bytedance.android.input.basic.applog.api.a aVar) {
        if (aVar != null) {
            this.bdTrackerListener.c(aVar);
        }
    }
}
