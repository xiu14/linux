package com.bytedance.push.client.intelligence;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.client.ai.IClientAICallback;
import com.bytedance.push.B;
import com.bytedance.push.C;
import com.bytedance.push.PushBody;
import com.bytedance.push.interfaze.IClientIntelligenceService;
import com.bytedance.push.notification.n;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ClientIntelligenceServiceImpl extends AbsSystemStatusMonitor implements IClientIntelligenceService, Handler.Callback, IClientAICallback {
    private final int MSG_WHAT_CHECK_CLIENT_STATUS;
    private final int MSG_WHAT_SHOW_CACHED_MESSAGE;
    private final int MSG_WHAT_SHOW_NOTIFICATION_AFTER_TIMEOUT;
    private final String TAG;
    private com.bytedance.push.client.intelligence.c mClientIntelligenceEventService;
    private com.bytedance.push.settings.n.a.b mClientIntelligenceSettingsModel;
    private Context mContext;
    private boolean mCurIsHighCtr;
    private boolean mCurIsLowCtr;
    private Handler mHandler;
    private KeyguardManager mKeyguardManager;
    private long mLastJudgeHighCtrTimeStamp;
    private long mLastJudgeLowCtrTimeStamp;
    private int mMonitorNotificationBarSupportLevel;
    private int mMonitorUserPresentSupportLevel;
    private PowerManager mPowerManager;
    private final Map<Long, B> mPushNotificationMessageMapNeedToShow;

    class a implements Runnable {
        final /* synthetic */ List a;

        a(List list) {
            this.a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClientIntelligenceServiceImpl.this.showMessageWithInterval(this.a);
        }
    }

    class b implements com.bytedance.push.client.intelligence.e {
        final /* synthetic */ CountDownLatch a;

        b(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public void a(boolean z, boolean z2, float f2, boolean z3, float f3, float f4, float f5) {
            boolean z4 = true;
            boolean z5 = z2 && f2 >= 0.0f && f2 < 5.0f;
            boolean z6 = z3 && (f3 >= 5.0f || f4 < 0.0f || (Math.abs(f5) > 9.0f && Math.abs(f3) < 1.0f && Math.abs(f4) < 1.0f));
            ClientIntelligenceServiceImpl clientIntelligenceServiceImpl = ClientIntelligenceServiceImpl.this;
            if (!z && !z5 && !z6) {
                z4 = false;
            }
            clientIntelligenceServiceImpl.mCurIsLowCtr = z4;
            if (!z2 || !z3) {
                com.bytedance.push.g0.f.e("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "client feature collect failed , distanceCollectSuccess:" + z2 + " accelerometerCollectSuccess:" + z3);
            }
            StringBuilder M = e.a.a.a.a.M("[onFeatureCallback] curIsLowCtr is ");
            M.append(ClientIntelligenceServiceImpl.this.mCurIsLowCtr);
            M.append(" because isMusicActive: ");
            M.append(z);
            M.append(" isLowCtrDistance:");
            M.append(z5);
            M.append(" distanceCollectSuccess:");
            M.append(z2);
            M.append(" distance:");
            M.append(f2);
            M.append(" isLowCtrAc:");
            M.append(z6);
            M.append(" accelerometerCollectSuccess:");
            M.append(z3);
            M.append(" xAc:");
            M.append(f3);
            M.append(" yAc:");
            M.append(f4);
            M.append(" zAc:");
            M.append(f5);
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", M.toString());
            this.a.countDown();
        }
    }

    class c implements Runnable {
        final /* synthetic */ B a;

        c(B b) {
            this.a = b;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceStrategyOnChildThread]show notification with default personal strategy");
            ClientIntelligenceServiceImpl.this.showPushWithOldClientIntelligencePersonalStrategy(this.a);
        }
    }

    class d implements Runnable {
        final /* synthetic */ B a;
        final /* synthetic */ boolean b;

        d(B b, boolean z) {
            this.a = b;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceStrategyOnChildThread]show notification with model");
            ClientIntelligenceServiceImpl.this.showPushWithClientIntelligenceModelStrategy(this.a, this.b);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClientIntelligenceServiceImpl.this.checkClientStatusForMessageShow();
        }
    }

    class f implements Runnable {
        final /* synthetic */ long a;

        f(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder M = e.a.a.a.a.M("[onPushShow] ruleId64 is ");
            M.append(this.a);
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", M.toString());
            B g2 = com.bytedance.push.helper.c.f(ClientIntelligenceServiceImpl.this.mContext).g(this.a);
            if (g2 != null) {
                synchronized (ClientIntelligenceServiceImpl.this.mPushNotificationMessageMapNeedToShow) {
                    ClientIntelligenceServiceImpl.this.mPushNotificationMessageMapNeedToShow.remove(Long.valueOf(g2.f5543c));
                }
                ClientIntelligenceServiceImpl.this.showNotification(g2.a, g2.o(), g2.f5545e, true);
            }
        }
    }

    class g implements com.bytedance.push.client.intelligence.d {
        final /* synthetic */ CountDownLatch a;

        g(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        public void a(boolean z, boolean z2, boolean z3) {
            ClientIntelligenceServiceImpl.this.mCurIsHighCtr = (z || z2) && !z3;
            StringBuilder M = e.a.a.a.a.M("[onFeatureCallback] mCurIsHighCtr is ");
            M.append(ClientIntelligenceServiceImpl.this.mCurIsHighCtr);
            M.append(" because isUsingEarPhone: ");
            M.append(z);
            M.append(" isScreenOn:");
            M.append(z2);
            M.append(" isMusicActive:");
            M.append(z3);
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", M.toString());
            this.a.countDown();
        }
    }

    public ClientIntelligenceServiceImpl(Context context) {
        super(context);
        this.TAG = "CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl";
        this.mPushNotificationMessageMapNeedToShow = new LinkedHashMap();
        this.MSG_WHAT_CHECK_CLIENT_STATUS = 2091558;
        this.MSG_WHAT_SHOW_NOTIFICATION_AFTER_TIMEOUT = 2091559;
        this.MSG_WHAT_SHOW_CACHED_MESSAGE = 2091560;
        this.mContext = context;
        this.mHandler = com.ss.android.message.e.e().c(this);
        this.mClientIntelligenceEventService = new com.bytedance.push.client.intelligence.a();
        if (getClientIntelligenceSettings().j == 2) {
            PushServiceManager.get().getIClientAiExternalService().registerClientAICallback(this);
            return;
        }
        if (getClientIntelligenceSettings().j == 1) {
            LocalSettings localSettings = (LocalSettings) h.b(this.mContext, LocalSettings.class);
            this.mMonitorNotificationBarSupportLevel = localSettings.j();
            this.mMonitorUserPresentSupportLevel = localSettings.B0();
            StringBuilder M = e.a.a.a.a.M("[ClientIntelligenceServiceImpl] mMonitorNotificationBarSupportLevel is ");
            M.append(this.mMonitorNotificationBarSupportLevel);
            M.append(" mMonitorUserPresentSupportLevel is ");
            M.append(this.mMonitorUserPresentSupportLevel);
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", M.toString());
            startMonitorNotificationBarPull();
            startMonitorScreenOn();
            if (getClientIntelligenceSettings().m) {
                startMonitorSystemBroadCastForUnDoze();
            }
            if (getClientIntelligenceSettings().b()) {
                this.mKeyguardManager = (KeyguardManager) this.mContext.getSystemService("keyguard");
                this.mPowerManager = (PowerManager) this.mContext.getSystemService("power");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkClientStatusForMessageShow() {
        if (!curIsLowCtr()) {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[checkClientStatusForMessageShow] cur is not low ctr, show the cached message");
            synchronized (this.mPushNotificationMessageMapNeedToShow) {
                showMessageWithInterval(this.mPushNotificationMessageMapNeedToShow.keySet());
            }
            return;
        }
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[checkClientStatusForMessageShow] cur is low ctr");
        if (this.mPushNotificationMessageMapNeedToShow.size() <= 0) {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[checkClientStatusForMessageShow]  message need to show size is 0, cancel all MSG_WHAT_CHECK_CLIENT_STATUS");
            this.mHandler.removeMessages(2091558);
            return;
        }
        StringBuilder M = e.a.a.a.a.M("[checkClientStatusForMessageShow] message need to show size is not 0, send next MSG_WHAT_CHECK_CLIENT_STATUS delay ");
        M.append(getClientIntelligenceSettings().f5815e);
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", M.toString());
        this.mHandler.removeMessages(2091558);
        this.mHandler.sendEmptyMessageDelayed(2091558, getClientIntelligenceSettings().f5815e);
    }

    private void showCachedMessage(long j) {
        B b2;
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showCachedMessage] localMessageId is  " + j);
        synchronized (this.mPushNotificationMessageMapNeedToShow) {
            b2 = this.mPushNotificationMessageMapNeedToShow.get(Long.valueOf(j));
            this.mPushNotificationMessageMapNeedToShow.remove(Long.valueOf(j));
        }
        if (b2 == null) {
            com.bytedance.push.g0.f.e("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showCachedMessage] message with localMessageId " + j + " is null");
            return;
        }
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showCachedMessage] finally show message: " + j);
        String str = null;
        if (getClientIntelligenceSettings().c(b2.o().E)) {
            str = "screen_on";
        } else if (getClientIntelligenceSettings().a(b2.o().E)) {
            str = "notification_bar";
        }
        showNotification(b2.a, b2.o(), b2.f5545e, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMessageWithInterval(Collection<Long> collection) {
        int i = 1;
        long j = 0;
        for (Long l : collection) {
            if (i > getClientIntelligenceSettings().i) {
                j += getClientIntelligenceSettings().h;
            }
            Message obtainMessage = this.mHandler.obtainMessage(2091560, l);
            StringBuilder sb = new StringBuilder();
            sb.append("[checkClientStatusForMessageShow] show ");
            sb.append(l);
            sb.append(" after ");
            sb.append(j);
            e.a.a.a.a.J0(sb, " mill", "CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl");
            this.mHandler.sendMessageDelayed(obtainMessage, j);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNotification(int i, PushBody pushBody, boolean z, boolean z2) {
        showNotification(i, pushBody, z, z2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPushWithClientIntelligenceModelStrategy(B b2, boolean z) {
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceModelStrategy] isRetry:" + z);
        PushServiceManager.get().getIClientAiExternalService().runTask(b2.n());
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceModelStrategy] finish isRetry:" + z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPushWithOldClientIntelligencePersonalStrategy(B b2) {
        if (!curIsLowCtr()) {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceStrategyOnChildThread] cur is not  low ctr, show notification directly");
            showNotification(b2.a, b2.o(), b2.f5545e);
            return;
        }
        long j = b2.f5543c;
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceStrategyOnChildThread] cur is low ctr, put " + j + " to mPushNotificationMessageMapNeedToShow");
        synchronized (this.mPushNotificationMessageMapNeedToShow) {
            this.mPushNotificationMessageMapNeedToShow.put(Long.valueOf(j), b2);
            if (this.mPushNotificationMessageMapNeedToShow.size() == 1) {
                com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceStrategyOnChildThread] send  MSG_WHAT_CHECK_CLIENT_STATUS delay " + getClientIntelligenceSettings().f5815e);
                this.mHandler.sendEmptyMessageDelayed(2091558, getClientIntelligenceSettings().f5815e);
            }
        }
        StringBuilder Q = e.a.a.a.a.Q("[showPushWithClientIntelligenceStrategyOnChildThread] send MSG_WHAT_SHOW_NOTIFICATION_AFTER_TIMEOUT for  ", j, " delay ");
        Q.append(getClientIntelligenceSettings().f5816f);
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", Q.toString());
        Message obtainMessage = this.mHandler.obtainMessage(2091559, Long.valueOf(j));
        long f2 = getClientIntelligenceSettings().f5816f - (com.ss.android.message.f.a.f() - b2.f5543c);
        if (f2 < 0) {
            f2 = 0;
        }
        this.mHandler.sendMessageDelayed(obtainMessage, f2);
    }

    private com.bytedance.push.client.intelligence.b showPushWithOldClientIntelligencePersonalStrategyV2(B b2) {
        PushBody o = b2.o();
        com.bytedance.push.client.intelligence.b bVar = new com.bytedance.push.client.intelligence.b();
        if (!o.B) {
            com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]pushBody.useClientIntelligenceShow is false, show notification directly");
            showNotification(b2.a, o, b2.f5545e, false);
            bVar.b = false;
            bVar.f5646c = "use client intelligence of pushBody is false";
            return bVar;
        }
        if (o.D != 1) {
            com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]pushBody.clientIntelligencePushShowMode is not CLIENT_INTELLIGENCE_MODE_PERSONAL, show notification directly");
            showNotification(b2.a, o, b2.f5545e, false);
            bVar.b = false;
            bVar.f5646c = "client intelligence show mode of pushBody is invalid";
            return bVar;
        }
        boolean a2 = getClientIntelligenceSettings().a(o.E);
        boolean c2 = getClientIntelligenceSettings().c(o.E);
        ArrayList arrayList = new ArrayList();
        if (!a2) {
            arrayList.add("pushBody.needShowAfterNotificationBar is false");
        }
        if (!c2) {
            arrayList.add("pushBody.needShowAfterScreenOn is false");
        }
        if (a2) {
            com.bytedance.push.settings.n.a.b clientIntelligenceSettings = getClientIntelligenceSettings();
            if (!clientIntelligenceSettings.a(clientIntelligenceSettings.k)) {
                com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]update needShowAfterNotificationBarPull to false because  needShowAfterNotificationBarPull of settings is false");
                o.u = "";
                arrayList.add("settings.needShowAfterNotificationBar is false");
                a2 = false;
            }
        }
        if (a2 && this.mMonitorNotificationBarSupportLevel < 1) {
            com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]update needShowAfterNotificationBarPull to false because mMonitorNotificationBarSupportLevel < SUPPORT_LEVEL_SUPPORT");
            o.u = "";
            arrayList.add("device not support monitor notification bar");
            a2 = false;
        }
        if (c2 && !getClientIntelligenceSettings().b()) {
            com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]update needShowAfterScreenOn to false because needShowAfterScreenOn of settings is false");
            arrayList.add("settings.needShowAfterScreenOn is false");
            c2 = false;
        }
        if (c2 && this.mMonitorUserPresentSupportLevel < 1) {
            com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]update needShowAfterNotificationBarPull to false because mMonitorUserPresentSupportLevel < SUPPORT_LEVEL_SUPPORT");
            arrayList.add("device not support monitor user present");
            c2 = false;
        }
        if (!a2 && !c2) {
            com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]needShowAfterNotificationBarPull and needShowAfterScreenOn is invalid, show notification directly");
            showNotification(b2.a, o, b2.f5545e, false);
            bVar.b = false;
            bVar.f5646c = "client intelligence show sub mode of pushBody is invalid" + Constants.COLON_SEPARATOR + arrayList;
            return bVar;
        }
        if (a2) {
            a2 = com.bytedance.push.K.a.i();
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]app is in background:  " + a2);
            if (!a2) {
                o.u = "";
                arrayList.add("app_in_foreground");
            }
        }
        if (c2) {
            boolean isScreenOn = this.mPowerManager.isScreenOn();
            boolean inKeyguardRestrictedInputMode = this.mKeyguardManager.inKeyguardRestrictedInputMode();
            c2 = !inKeyguardRestrictedInputMode ? !isScreenOn : inKeyguardRestrictedInputMode;
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]device is in keyguard restricted:  " + c2);
            if (!c2) {
                arrayList.add("device_is_screen_on");
            }
        }
        if (!a2 && !c2) {
            com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]message be filtered,show directly");
            showNotification(b2.a, o, b2.f5545e, false);
            bVar.b = false;
            bVar.f5646c = arrayList.toString();
            return bVar;
        }
        if (this.mPushNotificationMessageMapNeedToShow.size() >= getClientIntelligenceSettings().l) {
            com.bytedance.push.g0.f.m("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2]cached message number reached to max");
            if (a2) {
                o.u = "";
            }
            showNotification(b2.a, o, b2.f5545e, false);
            bVar.b = false;
            bVar.f5646c = "reached_max_cache_number";
            return bVar;
        }
        if (a2) {
            long j = b2.f5543c;
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2] cache the msg of " + j + " to mPushNotificationMessageMapNeedToShowAfterNotificationBarPull");
            synchronized (this.mPushNotificationMessageMapNeedToShow) {
                this.mPushNotificationMessageMapNeedToShow.put(Long.valueOf(j), b2);
            }
            startMonitorNotificationBarPull();
        }
        if (c2) {
            long j2 = b2.f5543c;
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithOldClientIntelligencePersonalStrategyV2] cache the msg of " + j2 + " to mPushNotificationMessageMapNeedToShowAfterScreenOn");
            synchronized (this.mPushNotificationMessageMapNeedToShow) {
                this.mPushNotificationMessageMapNeedToShow.put(Long.valueOf(j2), b2);
            }
            startMonitorScreenOn();
        }
        bVar.b = true;
        bVar.f5646c = "success";
        return bVar;
    }

    @Override // com.bytedance.android.service.manager.push.client.intelligence.IClientIntelligenceService
    public boolean curIsHighCtr() {
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "start judge curIsHighCtr or not");
        if (System.currentTimeMillis() - this.mLastJudgeHighCtrTimeStamp < getLocalPushClientIntelligenceSettings().b) {
            return this.mCurIsHighCtr;
        }
        this.mLastJudgeHighCtrTimeStamp = System.currentTimeMillis();
        this.mCurIsHighCtr = false;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        FeatureCollectionHelper.getInstance(this.mContext).getFeatureForLocalPush(new g(countDownLatch));
        try {
            countDownLatch.await(((C) C.a()).b().getClientIntelligenceSettings().f5814d + 1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return this.mCurIsHighCtr;
    }

    @Override // com.bytedance.push.interfaze.IClientIntelligenceService
    public boolean curIsLowCtr() {
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "start judge curIsLowCtr or not");
        if (com.ss.android.message.f.a.f() - this.mLastJudgeLowCtrTimeStamp < getClientIntelligenceSettings().f5815e) {
            return this.mCurIsLowCtr;
        }
        this.mLastJudgeLowCtrTimeStamp = com.ss.android.message.f.a.f();
        this.mCurIsLowCtr = false;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        FeatureCollectionHelper.getInstance(this.mContext).getFeatureForPushShow(new b(countDownLatch));
        try {
            countDownLatch.await(((C) C.a()).b().getClientIntelligenceSettings().f5814d + 1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return this.mCurIsLowCtr;
    }

    @Override // com.bytedance.push.interfaze.IClientIntelligenceService
    public boolean enableClientIntelligencePushShow() {
        if (!getClientIntelligenceSettings().f5813c) {
            return false;
        }
        if (!com.ss.android.message.f.a.t(this.mContext) || getClientIntelligenceSettings().j != 2 || PushServiceManager.get().getIClientAiExternalService().isClientAiReady()) {
            return true;
        }
        com.bytedance.push.client.intelligence.a aVar = (com.bytedance.push.client.intelligence.a) this.mClientIntelligenceEventService;
        Objects.requireNonNull(aVar);
        com.bytedance.common.g.b.b e2 = com.bytedance.common.g.a.c().e();
        JSONObject jSONObject = new JSONObject();
        aVar.add(jSONObject, "client_timestamp", System.currentTimeMillis());
        aVar.add(jSONObject, "process_alive_duration", System.currentTimeMillis() - e2.b());
        aVar.add(jSONObject, "process", com.ss.android.message.f.a.j(e2.c().a));
        ((C) C.a()).j().onEventV3("bdpush_client_ai_paralysis", jSONObject);
        return false;
    }

    @Override // com.bytedance.push.interfaze.IClientIntelligenceService
    public com.bytedance.push.settings.n.a.b getClientIntelligenceSettings() {
        if (this.mClientIntelligenceSettingsModel == null) {
            this.mClientIntelligenceSettingsModel = ((PushOnlineSettings) h.b(this.mContext, PushOnlineSettings.class)).getClientIntelligenceSettings();
        }
        return this.mClientIntelligenceSettingsModel;
    }

    @Override // com.bytedance.android.service.manager.push.client.intelligence.IClientIntelligenceService
    public com.bytedance.push.settings.n.a.c getLocalPushClientIntelligenceSettings() {
        return getClientIntelligenceSettings().o;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 2091558:
                com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[handleMessage of MSG_WHAT_CHECK_CLIENT_STATUS] start check cur client status ");
                com.bytedance.common.push.d.b(new e());
                break;
            case 2091559:
                long longValue = ((Long) message.obj).longValue();
                com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[handleMessage of MSG_WHAT_SHOW_NOTIFICATION_AFTER_TIMEOUT] show message " + longValue + " because timeout");
                showCachedMessage(longValue);
                break;
            case 2091560:
                com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[handleMessage of MSG_WHAT_SHOW_CACHED_MESSAGE] show message ");
                showCachedMessage(((Long) message.obj).longValue());
                break;
        }
        return true;
    }

    @Override // com.bytedance.push.client.intelligence.AbsSystemStatusMonitor
    void onNotificationBarPull() {
        if (this.mMonitorNotificationBarSupportLevel < 1) {
            this.mMonitorNotificationBarSupportLevel = 1;
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[onUserPresent] update  monitorNotificationBarSupportLevel to support");
            ((LocalSettings) h.b(this.mContext, LocalSettings.class)).m(1);
        }
        synchronized (this.mPushNotificationMessageMapNeedToShow) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Long, B> entry : this.mPushNotificationMessageMapNeedToShow.entrySet()) {
                if (getClientIntelligenceSettings().a(entry.getValue().o().E)) {
                    arrayList.add(entry.getKey());
                }
            }
            if (arrayList.size() > 0) {
                showMessageWithInterval(arrayList);
            }
        }
    }

    @Override // com.bytedance.android.service.manager.client.ai.IClientAICallback
    public void onPushShow(long j) {
        com.bytedance.common.push.d.a(new f(j));
    }

    @Override // com.bytedance.push.interfaze.IClientIntelligenceService
    public void onPushStart() {
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[onPushStart] handle message that not shown");
        if (!getClientIntelligenceSettings().f5813c) {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[onPushStart] enableClientIntelligencePushShow is false,need't handle cache message that not show");
            return;
        }
        List<B> e2 = com.bytedance.push.helper.c.f(this.mContext).e();
        StringBuilder M = e.a.a.a.a.M("[onPushStart] allMessageNotShown size is ");
        ArrayList arrayList = (ArrayList) e2;
        M.append(arrayList.size());
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", M.toString());
        if (arrayList.size() > 0) {
            long f2 = com.ss.android.message.f.a.f();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                B b2 = (B) it2.next();
                PushBody o = b2.o();
                if (getClientIntelligenceSettings().a(o.E) || getClientIntelligenceSettings().c(o.E)) {
                    if (getClientIntelligenceSettings().a(o.E)) {
                        o.u = "";
                    }
                    synchronized (this.mPushNotificationMessageMapNeedToShow) {
                        this.mPushNotificationMessageMapNeedToShow.put(Long.valueOf(b2.f5543c), b2);
                    }
                    arrayList2.add(Long.valueOf(b2.f5543c));
                } else if (f2 - b2.f5543c > getClientIntelligenceSettings().f5816f) {
                    synchronized (this.mPushNotificationMessageMapNeedToShow) {
                        this.mPushNotificationMessageMapNeedToShow.put(Long.valueOf(b2.f5543c), b2);
                    }
                    arrayList2.add(Long.valueOf(b2.f5543c));
                } else {
                    showPushWithClientIntelligenceStrategy(b2, true);
                }
            }
            com.ss.android.message.e.e().f(new a(arrayList2), getClientIntelligenceSettings().f5817g);
        }
    }

    @Override // com.bytedance.push.client.intelligence.AbsSystemStatusMonitor
    void onUserPresent() {
        if (this.mMonitorUserPresentSupportLevel < 1) {
            this.mMonitorUserPresentSupportLevel = 1;
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[onUserPresent] update  monitorUserPresentSupportLevel to support");
            ((LocalSettings) h.b(this.mContext, LocalSettings.class)).I(1);
        }
        synchronized (this.mPushNotificationMessageMapNeedToShow) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Long, B> entry : this.mPushNotificationMessageMapNeedToShow.entrySet()) {
                if (getClientIntelligenceSettings().c(entry.getValue().o().E)) {
                    arrayList.add(entry.getKey());
                }
            }
            if (arrayList.size() > 0) {
                showMessageWithInterval(arrayList);
            }
        }
    }

    @Override // com.bytedance.push.interfaze.IClientIntelligenceService
    public com.bytedance.push.client.intelligence.b showPushWithClientIntelligenceStrategy(B b2, boolean z) {
        com.bytedance.push.client.intelligence.b bVar = new com.bytedance.push.client.intelligence.b();
        StringBuilder M = e.a.a.a.a.M("[showPushWithClientIntelligenceStrategyOnChildThread] localMessageId is ");
        M.append(b2.f5543c);
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", M.toString());
        if (!enableClientIntelligencePushShow()) {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceStrategyOnChildThread] enableClientIntelligencePushShow is false, show notification directly");
            showNotification(b2.a, b2.o(), b2.f5545e, false);
            bVar.b = false;
            bVar.f5646c = "enableClientIntelligencePushShow is false";
            return bVar;
        }
        if (getClientIntelligenceSettings().j != 1) {
            if (getClientIntelligenceSettings().j == 2) {
                com.bytedance.common.push.d.b(new d(b2, z));
                bVar.b = true;
                bVar.f5646c = "success";
                return bVar;
            }
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceStrategyOnChildThread] show notification for  backup");
            showNotification(b2.a, b2.o(), b2.f5545e, false);
            bVar.b = false;
            bVar.f5646c = "back up show notification";
            return bVar;
        }
        if (getClientIntelligenceSettings().k == 0) {
            com.bytedance.common.push.d.b(new c(b2));
            bVar.b = true;
            bVar.f5646c = "success";
            return bVar;
        }
        com.bytedance.push.settings.n.a.b clientIntelligenceSettings = getClientIntelligenceSettings();
        if (clientIntelligenceSettings.a(clientIntelligenceSettings.k) || getClientIntelligenceSettings().b()) {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceStrategyOnChildThread]show notification with  personal strategy v2");
            return showPushWithOldClientIntelligencePersonalStrategyV2(b2);
        }
        com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showPushWithClientIntelligenceStrategyOnChildThread] CLIENT_INTELLIGENCE_SUB_MODE is invalid, show notification directly");
        showNotification(b2.a, b2.o(), b2.f5545e, false);
        bVar.b = false;
        bVar.f5646c = "no legal client intelligence sub mode";
        return bVar;
    }

    private void showNotification(int i, PushBody pushBody, boolean z, boolean z2, String str) {
        boolean z3;
        if (pushBody.C < System.currentTimeMillis()) {
            com.bytedance.push.g0.f.c("CLIENT_INTELLIGENCE-ClientIntelligenceServiceImpl", "[showNotification] message expired , not show !");
            z3 = true;
        } else {
            z3 = false;
        }
        ((n) ((C) C.a()).o()).m(i, pushBody, z, z2, z3, str, -1L);
    }

    private void showNotification(int i, PushBody pushBody, boolean z, String str) {
        showNotification(i, pushBody, z, true, str);
    }

    private void showNotification(int i, PushBody pushBody, boolean z) {
        showNotification(i, pushBody, z, true);
    }
}
