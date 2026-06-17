package com.coloros;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.core.provider.FontsContractCompat;
import com.bytedance.android.service.manager.permission.boot.AlertRequestParam;
import com.bytedance.common.c.h;
import com.bytedance.common.push.e.i;
import com.bytedance.push.C;
import com.bytedance.push.H;
import com.bytedance.push.g0.a;
import com.bytedance.push.g0.f;
import com.bytedance.push.interfaze.IPushService;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.g;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.vivo.push.PushClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class OpPushAdapter extends com.bytedance.push.third.b implements com.bytedance.push.third.c, ICallBackResultService {
    private static int OP_PUSH = -1;
    private static final String TAG = "OpPush";
    private IPushService.a mCallback;
    private Context mContext;
    private String mRegisterId;
    private int mRetryCount = 0;
    private boolean monitorRegisterSenderFailed = false;
    private volatile boolean appStatusHasChange = false;
    private boolean hasShowing = false;
    private final long DIALOG_SHOW_TIME_OUT = 2000;
    private final long RESULT_CODE_USER_DISAGREE = 1000;

    class a implements Runnable {

        /* renamed from: com.coloros.OpPushAdapter$a$a, reason: collision with other inner class name */
        class C0320a implements h.b {
            C0320a() {
            }

            @Override // com.bytedance.common.c.h.b
            public void a(boolean z) {
                Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                f.g(OpPushAdapter.TAG, "registerOpPush");
                Pair<String, String> b = ((H) C.B()).b(OpPushAdapter.getOpPush());
                if (b == null) {
                    return;
                }
                try {
                    Context applicationContext = OpPushAdapter.this.mContext.getApplicationContext();
                    Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                    HeytapPushManager.init(applicationContext, f.d());
                    HeytapPushManager.register(OpPushAdapter.this.mContext, (String) b.first, (String) b.second, OpPushAdapter.this);
                    HeytapPushManager.resumePush();
                } catch (Throwable th) {
                    com.bytedance.push.Q.b x = C.x();
                    StringBuilder M = e.a.a.a.a.M("op register push get exception=");
                    M.append(th.getMessage());
                    String sb = M.toString();
                    Objects.requireNonNull((com.bytedance.push.Q.c) x);
                    f.c("mcssdk", sb);
                }
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            new h("api.push.oppomobile.com", 443, new C0320a()).a();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("notification_status", 1 == com.ss.android.message.f.a.d(OpPushAdapter.this.mContext) ? PushClient.DEFAULT_REQUEST_ID : "0");
                C.A().onEventV3("push_guide_status_change_oppo", jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    class c implements Observer {
        final /* synthetic */ long[] a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6268c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6269d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f6270e;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.a[0] <= 0) {
                    f.c(OpPushAdapter.TAG, "invalid app status change,sys dialog show failed");
                    c cVar = c.this;
                    OpPushAdapter.this.onGuideRequestResult(cVar.b, cVar.f6268c, "op", false, "invalid app status change", cVar.f6269d, cVar.f6270e);
                    OpPushAdapter.this.hasShowing = false;
                    return;
                }
                f.c(OpPushAdapter.TAG, "find valid app status change");
                OpPushAdapter.this.appStatusHasChange = true;
                if (OpPushAdapter.this.hasShowing) {
                    c cVar2 = c.this;
                    OpPushAdapter.this.onGuideRequestResult(cVar2.b, cVar2.f6268c, "op", true, "success", cVar2.f6269d, cVar2.f6270e);
                }
            }
        }

        c(long[] jArr, String str, int i, int i2, i iVar) {
            this.a = jArr;
            this.b = str;
            this.f6268c = i;
            this.f6269d = i2;
            this.f6270e = iVar;
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            f.c(OpPushAdapter.TAG, "app status changed,isInBackGround:" + booleanValue);
            if (!booleanValue) {
                this.a[0] = 0;
            } else {
                this.a[0] = System.currentTimeMillis();
                com.ss.android.message.e.e().f(new a(), 1000L);
            }
        }
    }

    class d implements INotificationPermissionCallback {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f6272c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6273d;

        d(String str, int i, i iVar, int i2) {
            this.a = str;
            this.b = i;
            this.f6272c = iVar;
            this.f6273d = i2;
        }

        @Override // com.heytap.msp.push.callback.INotificationPermissionCallback
        public void onFail(int i, String str) {
            f.c(OpPushAdapter.TAG, "requestNotificationAdvance onFail,errorCode:" + i + " errorMsg:" + str);
            if (i == 1000) {
                OpPushAdapter.this.onUserClickResult(this.a, this.b, false, i, str, this.f6272c);
            } else {
                OpPushAdapter.this.onGuideRequestResult(this.a, this.f6273d, "op", false, "onFail:{errorCode:" + i + ",errorMsg:" + str + "}", this.b, this.f6272c);
            }
            OpPushAdapter.this.hasShowing = false;
        }

        @Override // com.heytap.msp.push.callback.INotificationPermissionCallback
        public void onSuccess() {
            f.c(OpPushAdapter.TAG, "requestNotificationAdvance success");
            OpPushAdapter.this.onUserClickResult(this.a, this.b, true, 0, "", this.f6272c);
        }
    }

    class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6275c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f6276d;

        e(String str, int i, int i2, i iVar) {
            this.a = str;
            this.b = i;
            this.f6275c = i2;
            this.f6276d = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder M = e.a.a.a.a.M("backup detect dialog show result now, hasShown:");
            M.append(OpPushAdapter.this.hasShowing);
            M.append(" appStatusHasChanged:");
            M.append(OpPushAdapter.this.appStatusHasChange);
            f.c(OpPushAdapter.TAG, M.toString());
            if (OpPushAdapter.this.hasShowing) {
                if (OpPushAdapter.this.appStatusHasChange) {
                    OpPushAdapter.this.onGuideRequestResult(this.a, this.b, "op", true, "success", this.f6275c, this.f6276d);
                } else {
                    OpPushAdapter.this.onGuideRequestResult(this.a, this.b, "op", false, "time out", this.f6275c, this.f6276d);
                }
            }
            OpPushAdapter.this.hasShowing = false;
        }
    }

    public static int getOpPush() {
        if (OP_PUSH == -1) {
            OP_PUSH = g.o(com.ss.android.message.a.a()).d(OpPushAdapter.class.getName());
        }
        return OP_PUSH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserClickResult(String str, int i, boolean z, int i2, String str2, i iVar) {
        f.g(TAG, "on request op notification permission result,hasAgree:" + z);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FontsContractCompat.Columns.RESULT_CODE, i2);
            onClickResult(str, getOpPush(), "op", z, "", i, jSONObject, iVar);
        } catch (Throwable th) {
            f.f(TAG, "onUserClickResult error ", th);
        }
    }

    @Override // com.bytedance.push.third.c
    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        boolean z;
        Pair<String, String> b2 = ((H) C.B()).b(getOpPush());
        if (b2 == null || TextUtils.isEmpty((CharSequence) b2.first) || TextUtils.isEmpty((CharSequence) b2.second)) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.e(str, "OPPO error，oppo key configuration is incorrect");
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        a.C0301a c0301a = new a.C0301a("com.heytap.msp.push.service.DataMessageCallbackService");
        c0301a.e(context.getPackageName());
        c0301a.d("com.heytap.mcs.permission.SEND_PUSH_MESSAGE");
        c0301a.a(new a.b(Collections.singletonList("com.heytap.mcs.action.RECEIVE_MCS_MESSAGE")));
        c0301a.a(new a.b(Collections.singletonList("com.heytap.msp.push.RECEIVE_MCS_MESSAGE")));
        com.bytedance.push.g0.a b3 = c0301a.b();
        a.C0301a c0301a2 = new a.C0301a("com.heytap.msp.push.service.CompatibleDataMessageCallbackService");
        c0301a2.e(context.getPackageName());
        c0301a2.d("com.coloros.mcs.permission.SEND_MCS_MESSAGE");
        c0301a2.a(new a.b(Collections.singletonList("com.coloros.mcs.action.RECEIVE_MCS_MESSAGE")));
        com.bytedance.push.g0.a b4 = c0301a2.b();
        arrayList.add(b3);
        arrayList.add(b4);
        return com.bytedance.push.g0.g.d(context, str, "OPPOPush", arrayList) & z & true;
    }

    @Override // com.bytedance.push.third.b
    public int getPushType() {
        return 10;
    }

    @Override // com.bytedance.push.third.b
    public String isBusinessAlertDialogAvailable(Context context, boolean z) {
        if (!isPushAvailable(context, 10)) {
            f.g(TAG, "[isBusinessAlertDialogAvailable]return false because push is not available");
            return "push is not available";
        }
        if (com.ss.android.pushmanager.setting.c.c().g().q()) {
            f.g(TAG, "[isBusinessAlertDialogAvailable]return true");
            return PushClient.DEFAULT_REQUEST_ID;
        }
        f.g(TAG, "[isBusinessAlertDialogAvailable]return false because enableOppoBusinessNotificationDialog is false");
        return "enableOppoBusinessNotificationDialog is false";
    }

    @Override // com.bytedance.push.third.c
    public boolean isPushAvailable(Context context, int i) {
        try {
            return HeytapPushManager.isSupportPush(context);
        } catch (Throwable th) {
            com.bytedance.push.Q.b x = C.x();
            StringBuilder M = e.a.a.a.a.M("register onSuccess registerId = ");
            M.append(Log.getStackTraceString(th));
            String sb = M.toString();
            Objects.requireNonNull((com.bytedance.push.Q.c) x);
            f.g(TAG, sb);
            return false;
        }
    }

    @Override // com.bytedance.push.third.b
    public boolean isSupportCallKit() {
        boolean isSupportCallkit = HeytapPushManager.isSupportCallkit(com.ss.android.message.a.a());
        com.bytedance.push.Q.b x = C.x();
        String A = e.a.a.a.a.A("[isSupportCallKit]pushSupport = ", isSupportCallkit);
        Objects.requireNonNull((com.bytedance.push.Q.c) x);
        f.g(TAG, A);
        return isSupportCallkit;
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onError(int i, String str, String str2, String str3) {
        com.bytedance.push.Q.b x = C.x();
        String K = e.a.a.a.a.K(e.a.a.a.a.P("onError errorCode = ", i, "  message=", str, " packageName="), str2, " miniProgramPkg=", str3);
        Objects.requireNonNull((com.bytedance.push.Q.c) x);
        f.e(TAG, K);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onGetNotificationStatus(int i, int i2) {
        com.bytedance.push.Q.b x = C.x();
        String l = e.a.a.a.a.l("onGetNotificationStatus and i= ", i, " i1= ", i2);
        Objects.requireNonNull((com.bytedance.push.Q.c) x);
        f.g(TAG, l);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onGetPushStatus(int i, int i2) {
        com.bytedance.push.Q.b x = C.x();
        String l = e.a.a.a.a.l("onSetPushTime and i= ", i, " i1= ", i2);
        Objects.requireNonNull((com.bytedance.push.Q.c) x);
        f.g(TAG, l);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onRegister(int i, String str, String str2, String str3) {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.g(TAG, "onRegister and resultCode= " + i + " registerId = " + str);
        if (i == 0 && !TextUtils.isEmpty(str)) {
            com.bytedance.push.Q.b x = C.x();
            String s = e.a.a.a.a.s("register onSuccess registerId = ", str);
            Objects.requireNonNull((com.bytedance.push.Q.c) x);
            f.g(TAG, s);
            IPushService.a aVar = this.mCallback;
            if (aVar != null) {
                aVar.a(str);
            }
            this.mRegisterId = str;
            ((H) C.B()).e(this.mContext, getOpPush(), str);
            return;
        }
        int i2 = this.mRetryCount + 1;
        this.mRetryCount = i2;
        if (i2 > ((PushOnlineSettings) com.bytedance.push.settings.h.b(this.mContext, PushOnlineSettings.class)).J()) {
            C.y().a(getOpPush(), 102, "0", "token is empty");
            return;
        }
        if (((PushOnlineSettings) com.bytedance.push.settings.h.b(com.ss.android.message.a.a(), PushOnlineSettings.class)).O().b) {
            com.ss.android.message.e.e().f(new a(), ((PushOnlineSettings) com.bytedance.push.settings.h.b(this.mContext, PushOnlineSettings.class)).o());
        }
        if (this.monitorRegisterSenderFailed) {
            return;
        }
        this.monitorRegisterSenderFailed = true;
        if (i == 0) {
            C.y().a(getOpPush(), 102, "0", "token is empty");
            return;
        }
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.e(TAG, "register onFailure resultCode " + i + " registerId = " + str);
        String str4 = i + " " + str;
        ((H) C.B()).d(getOpPush(), String.valueOf(i), str4);
        C.y().a(getOpPush(), 104, String.valueOf(i), str4);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onSetPushTime(int i, String str) {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.g(TAG, "onSetPushTime and i= " + i + " s= " + str);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onUnRegister(int i, String str, String str2) {
        com.bytedance.push.Q.b x = C.x();
        StringBuilder P = e.a.a.a.a.P("onUnRegister and responseCode= ", i, " packageName=", str, " miniPackageName=");
        P.append(str2);
        String sb = P.toString();
        Objects.requireNonNull((com.bytedance.push.Q.c) x);
        f.g(TAG, sb);
    }

    @Override // com.bytedance.push.third.c
    public void registerPush(Context context, int i) {
        if (context == null || i != getOpPush() || !HeytapPushManager.isSupportPush(context)) {
            C.y().a(i, 101, "0", context == null ? "context is null" : i != getOpPush() ? "register channel error" : "the phone does not support OP Push");
            return;
        }
        this.mContext = context.getApplicationContext();
        if (com.ss.android.message.f.a.z(context)) {
            com.ss.android.message.f.a.G(context, "com.heytap.msp.push.service.DataMessageCallbackService", false);
            com.ss.android.message.f.a.G(context, "com.heytap.msp.push.service.SmpDataMessageCallbackService", true);
            com.ss.android.message.f.a.G(context, "com.heytap.msp.push.service.CompatibleDataMessageCallbackService", false);
            com.ss.android.message.f.a.G(context, "com.heytap.msp.push.service.SmpCompatibleDataMessageCallbackService", true);
        }
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.g(TAG, "registerOpPush");
        Pair<String, String> b2 = ((H) C.B()).b(getOpPush());
        if (b2 == null) {
            C.y().a(i, 106, "0", "configuration error");
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.g(TAG, "registerOpPush but config is null");
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            HeytapPushManager.init(applicationContext, f.d());
            HeytapPushManager.register(context, (String) b2.first, (String) b2.second, this);
        } catch (Throwable th) {
            com.bytedance.push.Q.b x = C.x();
            StringBuilder M = e.a.a.a.a.M("op register push get exception=");
            M.append(th.getMessage());
            String sb = M.toString();
            Objects.requireNonNull((com.bytedance.push.Q.c) x);
            f.c("mcssdk", sb);
        }
        HeytapPushManager.resumePush();
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.g(TAG, "resumePush");
    }

    @Override // com.bytedance.push.third.b
    public synchronized boolean requestNotificationPermission(String str, int i, int i2, AlertRequestParam alertRequestParam, i iVar) {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.c(TAG, "[requestNotificationPermission]");
        if (i != getOpPush()) {
            f.e(TAG, "invalid push_type:" + i);
            onGuideRequestResult(str, i, "op", false, "invalid push_type:" + i, i2, iVar);
            return false;
        }
        Activity h = com.bytedance.common.push.b.e().h();
        if (h == null) {
            f.e(TAG, "can't requestNotificationPermission on op device because topActivity is null");
            onGuideRequestResult(str, i, "op", false, "topActivity is null,app is not in the foreground!", i2, iVar);
            return false;
        }
        if (this.hasShowing) {
            f.e(TAG, "can't requestNotificationPermission because cur has showing");
            return false;
        }
        this.hasShowing = true;
        this.appStatusHasChange = false;
        this.hasCallbackShowResult = false;
        this.mAlertRequestParam = alertRequestParam;
        com.bytedance.push.helper.d.c().addObserver(new c(new long[]{0}, str, i, i2, iVar));
        HeytapPushManager.requestNotificationAdvance(h, new d(str, i2, iVar, i), com.bytedance.push.third.b.REQUEST_CODE_REQUEST_NOTIFICATION_PERMISSION_BY_SYS_DIALOG);
        f.c(TAG, "backup detect dialog show result after 2000");
        com.ss.android.message.e.e().f(new e(str, i, i2, iVar), 2000L);
        return true;
    }

    @Override // com.bytedance.push.third.b
    public boolean requestOpNotificationPermission(int i) {
        try {
            C.A().onEventV3("push_guide_request_oppo", null);
        } catch (Throwable unused) {
        }
        if (i != getOpPush()) {
            com.bytedance.push.Q.b x = C.x();
            StringBuilder M = e.a.a.a.a.M("OpPushAdapter.requestNotificationPermission error, push_type is not ");
            M.append(getOpPush());
            String sb = M.toString();
            Objects.requireNonNull((com.bytedance.push.Q.c) x);
            f.c(TAG, sb);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("result_value", "0");
                jSONObject.put("error_msg", "push_type is not for oppo");
                C.A().onEventV3("push_guide_show_oppo", jSONObject);
            } catch (Throwable unused2) {
            }
            return false;
        }
        if (TextUtils.isEmpty(this.mRegisterId)) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.c(TAG, "OpPushAdapter.requestNotificationPermission op register failed or not registered");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result_value", "0");
                jSONObject2.put("error_msg", "oppo register failed or not registered");
                C.A().onEventV3("push_guide_show_oppo", jSONObject2);
            } catch (Throwable unused3) {
            }
            return false;
        }
        if (1 != com.ss.android.message.f.a.d(this.mContext)) {
            HeytapPushManager.requestNotificationPermission();
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.c(TAG, "OpPushAdapter.requestNotificationPermission no permission, request");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("result_value", PushClient.DEFAULT_REQUEST_ID);
                jSONObject3.put("error_msg", "success");
                C.A().onEventV3("push_guide_show_oppo", jSONObject3);
            } catch (Throwable unused4) {
            }
            com.ss.android.message.e.e().f(new b(), TimeUnit.SECONDS.toMillis(15L));
        } else {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.c(TAG, "OpPushAdapter.requestNotificationPermission already has permission");
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("result_value", "0");
                jSONObject4.put("error_msg", "already has permission");
                C.A().onEventV3("push_guide_show_oppo", jSONObject4);
            } catch (Throwable unused5) {
            }
        }
        return true;
    }

    public boolean requestRemoveVoipNotification(Context context, int i) {
        return false;
    }

    @Override // com.bytedance.push.third.c
    public void setAlias(Context context, String str, int i) {
    }

    public void setPushTokenListener(IPushService.a aVar) {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.c(TAG, "OpPushAdapter.setPushTokenListener");
        this.mCallback = aVar;
        if (this.mRegisterId != null) {
            com.bytedance.push.Q.b x = C.x();
            StringBuilder M = e.a.a.a.a.M("OpPushAdapter.onTokenReceived:");
            M.append(this.mRegisterId);
            String sb = M.toString();
            Objects.requireNonNull((com.bytedance.push.Q.c) x);
            f.c(TAG, sb);
            IPushService.a aVar2 = this.mCallback;
            if (aVar2 != null) {
                aVar2.a(this.mRegisterId);
            }
        }
    }

    @Override // com.bytedance.push.third.c
    public void trackPush(Context context, int i, Object obj) {
    }

    @Override // com.bytedance.push.third.c
    public void unregisterPush(Context context, int i) {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.g(TAG, "unregisterOpPush start");
        if (context != null && i == getOpPush() && HeytapPushManager.isSupportPush(context)) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.g(TAG, "unregisterOpPush");
            try {
                HeytapPushManager.pausePush();
                HeytapPushManager.unRegister();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
