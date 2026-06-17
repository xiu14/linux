package com.bytedance.push.V;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.push.e.g;
import com.bytedance.push.g0.f;
import com.bytedance.push.third.b;
import com.ss.android.pushmanager.setting.c;

/* loaded from: classes2.dex */
public class a {
    private final Context a = com.ss.android.message.a.a();
    private final Boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final g f5598c;

    public a() {
        Boolean valueOf = Boolean.valueOf(c.c().g().x());
        this.b = valueOf;
        com.bytedance.common.model.c c2 = com.bytedance.common.g.a.c().e().c();
        if (c2 != null) {
            this.f5598c = c2.o;
        } else {
            this.f5598c = null;
        }
        f.c("ProfileIdServiceImpl", "[ProfileIdServiceImpl]mAllowProfileId is " + valueOf + " mIPushCommonConfiguration is " + this.f5598c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(com.bytedance.push.third.c cVar, boolean z) {
        if (cVar instanceof b) {
            if (this.b.booleanValue() || z) {
                String d2 = c.c().d();
                if (TextUtils.isEmpty(d2)) {
                    return;
                }
                f.c("ProfileIdServiceImpl", "removeProfileId for " + cVar);
                if (((b) cVar).deleteProfileId(this.a, d2)) {
                    c.c().e().p("");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String d(com.bytedance.push.third.c cVar) {
        g gVar;
        if (this.b.booleanValue() && (cVar instanceof b) && (gVar = this.f5598c) != null) {
            String profileId = gVar.getProfileId();
            if (!TextUtils.isEmpty(profileId)) {
                String d2 = c.c().d();
                if (!TextUtils.isEmpty(d2)) {
                    if (TextUtils.equals(d2, profileId)) {
                        f.c("ProfileIdServiceImpl", "needn't set profile id because lastProfileId==profileIdFromHost");
                        return d2;
                    }
                    f.c("ProfileIdServiceImpl", "remove last profile id because lastProfileId!=profileIdFromHost");
                    c(cVar, false);
                }
                f.c("ProfileIdServiceImpl", "setProfileId for " + cVar);
                if (((b) cVar).setProfileId(this.a, profileId)) {
                    c.c().e().p(profileId);
                    return profileId;
                }
            }
        }
        return null;
    }

    public void a(com.bytedance.push.third.c cVar) {
        f.c("ProfileIdServiceImpl", "onPushAdapterRegister");
        if (this.b.booleanValue()) {
            d(cVar);
        } else {
            c(cVar, true);
        }
    }

    public void b(com.bytedance.push.third.c cVar) {
        f.c("ProfileIdServiceImpl", "onPushAdapterUnregister");
        c(cVar, false);
    }
}
