package com.bytedance.push;

import android.app.Application;
import android.util.Log;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class BDPushConfiguration extends com.bytedance.push.L.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BDPushConfiguration(Application application) {
        super(application);
        kotlin.s.c.l.f(application, "application");
    }

    @Override // com.bytedance.push.L.a
    public com.bytedance.push.L.b getBDPushBaseConfiguration() {
        C0677a c0677a = new C0677a();
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        c0677a.g(401734);
        c0677a.k(100309006);
        c0677a.l("1.3.9");
        c0677a.j(100309006);
        c0677a.i(d.a.b.a.c(aVar));
        c0677a.h("oime");
        aVar.j("ImePushConfiguration", "buildPushConfiguration: " + c0677a);
        Log.d("ImePushConfiguration", "buildPushConfiguration: " + c0677a);
        return new com.bytedance.push.L.b(c0677a, "https://ime.doubao.com", false);
    }

    @Override // com.bytedance.push.L.a
    public com.bytedance.push.interfaze.e getEventSender() {
        return com.bytedance.android.input.impl.b.a;
    }

    @Override // com.bytedance.common.push.e.g
    public com.bytedance.push.frontier.a.a getFrontierService() {
        return null;
    }

    @Override // com.bytedance.push.L.a
    public com.bytedance.push.interfaze.z getOnPushClickListener() {
        return com.bytedance.android.input.impl.a.a;
    }

    @Override // com.bytedance.push.L.a
    public com.bytedance.push.interfaze.m getPushMsgShowInterceptor() {
        return com.bytedance.android.input.impl.c.a;
    }
}
