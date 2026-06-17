package com.bytedance.push.X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.common.push.d;
import com.bytedance.push.interfaze.o;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements o {
    private final Context a;
    private final Application.ActivityLifecycleCallbacks b = new C0291a();

    /* renamed from: com.bytedance.push.X.a$a, reason: collision with other inner class name */
    class C0291a extends com.bytedance.common.push.a {
        C0291a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (com.bytedance.common.push.b.e().j()) {
                a aVar = a.this;
                Objects.requireNonNull(aVar);
                d.b(new b(aVar));
            }
        }
    }

    public a(Context context) {
        this.a = context;
    }

    public void b() {
        com.bytedance.common.push.b.e().c(this.b);
        if (com.bytedance.common.push.b.e().j()) {
            return;
        }
        d.b(new b(this));
    }

    public void c(int i) {
        PushOnlineSettings pushOnlineSettings;
        if (!com.bytedance.common.push.b.e().j() || (pushOnlineSettings = (PushOnlineSettings) h.b(this.a, PushOnlineSettings.class)) == null || !pushOnlineSettings.G() || i <= 0) {
            return;
        }
        PushServiceManager.get().getIRedBadgeExternalService().applyCount(this.a, i);
    }
}
