package com.bytedance.push.X;

import android.content.Context;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.redbadge.IRedBadgeExternalService;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;

/* loaded from: classes2.dex */
class b implements Runnable {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        context = this.a.a;
        PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) h.b(context, PushOnlineSettings.class);
        if (pushOnlineSettings == null || !pushOnlineSettings.L()) {
            return;
        }
        IRedBadgeExternalService iRedBadgeExternalService = PushServiceManager.get().getIRedBadgeExternalService();
        context2 = this.a.a;
        iRedBadgeExternalService.removeCount(context2);
    }
}
