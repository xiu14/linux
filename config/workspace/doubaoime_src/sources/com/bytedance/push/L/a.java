package com.bytedance.push.L;

import android.app.Application;
import com.bytedance.common.push.e.g;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.push.C0679c;
import com.bytedance.push.C0680d;
import com.bytedance.push.O.d;
import com.bytedance.push.interfaze.A;
import com.bytedance.push.interfaze.C;
import com.bytedance.push.interfaze.D;
import com.bytedance.push.interfaze.InterfaceC0686a;
import com.bytedance.push.interfaze.InterfaceC0687b;
import com.bytedance.push.interfaze.InterfaceC0688c;
import com.bytedance.push.interfaze.InterfaceC0689d;
import com.bytedance.push.interfaze.e;
import com.bytedance.push.interfaze.m;
import com.bytedance.push.interfaze.p;
import com.bytedance.push.interfaze.q;
import com.bytedance.push.interfaze.y;
import com.bytedance.push.interfaze.z;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class a extends g {
    private final String TAG = "AbsBDPushConfiguration";
    private Application mApplication;

    public a(Application application) {
        this.mApplication = application;
    }

    public boolean autoInitRedBadge() {
        return true;
    }

    public boolean enableALog() {
        return true;
    }

    public boolean enableAutoInit() {
        return true;
    }

    public boolean enableAutoRequestSettings() {
        return false;
    }

    public boolean enableAutoStart() {
        return true;
    }

    public boolean enableEncryptPassThroughMsg() {
        return false;
    }

    public boolean enableRealTimeReportEvent() {
        return false;
    }

    public String getAdmPayloadName() {
        return WsConstants.KEY_PAYLOAD;
    }

    public Application getApplication() {
        return this.mApplication;
    }

    public abstract b getBDPushBaseConfiguration();

    public com.bytedance.common.model.a getClientDisplayFeature() {
        return new com.bytedance.common.model.a();
    }

    public C0679c getConfiguration() {
        b bDPushBaseConfiguration = getBDPushBaseConfiguration();
        C0679c.b bVar = new C0679c.b(getApplication(), bDPushBaseConfiguration.a(), bDPushBaseConfiguration.b());
        bVar.G(isDebug());
        bVar.P(isBoe());
        bVar.R(getLogLevel());
        bVar.V(getProcess());
        bVar.H(getDefaultNotificationChannelName());
        bVar.B(getPushLifeAdapters());
        bVar.X(getEventSender());
        bVar.E(getAccountService());
        bVar.C(getPushMsgShowInterceptor());
        bVar.v(getCustomNotificationBuilder());
        bVar.r(bDPushBaseConfiguration.c());
        bVar.L(getUrlFilter());
        bVar.M(getHMSLowVersionCallback());
        bVar.O(getImageDownloader());
        bVar.J(getHttpCommonParams());
        bVar.W(getOnPushClickListener());
        bVar.S(getPushMonitor());
        bVar.b0(getSoLoader());
        bVar.K(getFcmPayloadName());
        bVar.F(getAdmPayloadName());
        bVar.q(isForbidSDKClickEvent());
        bVar.o(getDefaultInitTimeout());
        bVar.z(isPreInstallVersion());
        bVar.U(getITracingMonitor());
        bVar.x(getRevokeEventInterceptor());
        bVar.y(getIVerifyFailedListener());
        bVar.c0(getSoundDownloader());
        bVar.a0(getRegisterResultCallback());
        bVar.Y(getKeyConfiguration());
        bVar.T(getCustomSoundsRes());
        bVar.N(getI18nCommonParams());
        bVar.p(enableALog());
        bVar.A(getPushAlogInstanceName());
        bVar.I(enableRealTimeReportEvent());
        bVar.t(enableAutoRequestSettings());
        bVar.Q(enableEncryptPassThroughMsg());
        bVar.s(autoInitRedBadge());
        bVar.w(this);
        bVar.u(getClientDisplayFeature());
        if (getOnPushReceiveHandler() != null) {
            bVar.Z(getOnPushReceiveHandler());
        }
        if (getCustomNotificationBuilder() != null) {
            bVar.v(getCustomNotificationBuilder());
        }
        if (getPushMsgShowInterceptor() != null) {
            bVar.C(getPushMsgShowInterceptor());
        }
        return bVar.n();
    }

    public InterfaceC0689d getCustomNotificationBuilder() {
        return null;
    }

    public int[] getCustomSoundsRes() {
        return null;
    }

    public long getDefaultInitTimeout() {
        return TimeUnit.MINUTES.toMillis(2L);
    }

    public String getDefaultNotificationChannelName() {
        return null;
    }

    public e getEventSender() {
        return new c();
    }

    public String getFcmPayloadName() {
        return WsConstants.KEY_PAYLOAD;
    }

    public InterfaceC0686a getHMSLowVersionCallback() {
        return null;
    }

    public InterfaceC0688c getHttpCommonParams() {
        return null;
    }

    public InterfaceC0687b getI18nCommonParams() {
        return null;
    }

    public com.bytedance.push.monitor.m.a getITracingMonitor() {
        return null;
    }

    public y getIVerifyFailedListener() {
        return null;
    }

    public com.bytedance.push.O.a getImageDownloader() {
        return new d();
    }

    public com.ss.android.g.c getKeyConfiguration() {
        return new C0680d(getBDPushBaseConfiguration().c(), getBDPushBaseConfiguration().a().c());
    }

    public int getLogLevel() {
        return 3;
    }

    public abstract z getOnPushClickListener();

    public A getOnPushReceiveHandler() {
        return null;
    }

    public String getProcess() {
        return com.ss.android.message.f.a.h(getApplication());
    }

    public String getPushAlogInstanceName() {
        return null;
    }

    public List<com.ss.android.message.b> getPushLifeAdapters() {
        return null;
    }

    public com.bytedance.push.monitor.c getPushMonitor() {
        return null;
    }

    public m getPushMsgShowInterceptor() {
        return null;
    }

    public p getRegisterResultCallback() {
        return null;
    }

    public q getRevokeEventInterceptor() {
        return null;
    }

    public C getSoLoader() {
        return new C.a();
    }

    public com.bytedance.push.Z.a getSoundDownloader() {
        return new com.bytedance.push.Z.b();
    }

    public D getUrlFilter() {
        return null;
    }

    protected boolean isBoe() {
        return false;
    }

    public boolean isDebug() {
        return false;
    }

    public boolean isForbidSDKClickEvent() {
        return false;
    }

    public boolean isPreInstallVersion() {
        return false;
    }
}
