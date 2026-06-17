package com.vivo.push;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.vivo.push.listener.IPushQueryActionListener;
import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PushClient extends a implements com.vivo.push.e.a {
    public static final String DEFAULT_REQUEST_ID = "1";
    private static volatile PushClient sPushClient;
    private Context mContext;
    private boolean mIsInitSdk;
    private com.vivo.push.e.a mSyncProfileInfo;

    private PushClient(Context context) {
        this.mContext = ContextDelegate.getContext(context);
        com.vivo.push.restructure.a.a().a(context);
        m.a().a(context);
        this.mSyncProfileInfo = new com.vivo.push.e.d();
    }

    private boolean checkAgreePrivacyStatementAndInitSdk() {
        if (!com.vivo.push.restructure.a.a().e().m().isAgreePrivacyStatement()) {
            return false;
        }
        inidSdk(this.mContext);
        return true;
    }

    private void checkParam(String str) {
        if (str == null) {
            throw new IllegalArgumentException("PushManager String param should not be ".concat(String.valueOf(str)));
        }
    }

    private String getAppId(String str) {
        return !TextUtils.isEmpty(str) ? str : com.vivo.push.restructure.a.a().e().a();
    }

    private String getAppKey(String str) {
        return !TextUtils.isEmpty(str) ? str : com.vivo.push.restructure.a.a().e().c();
    }

    public static synchronized PushClient getInstance(Context context) {
        PushClient pushClient;
        synchronized (PushClient.class) {
            if (sPushClient == null) {
                sPushClient = new PushClient(context.getApplicationContext());
            }
            pushClient = sPushClient;
        }
        return pushClient;
    }

    private void inidSdk(Context context) {
        synchronized (this) {
            if (!this.mIsInitSdk) {
                m.a().a(context);
                this.mIsInitSdk = true;
            }
        }
    }

    @Override // com.vivo.push.e.a
    public void addProfileId(String str, IPushRequestCallback<Integer> iPushRequestCallback) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(104);
            }
        } else {
            com.vivo.push.e.a aVar = this.mSyncProfileInfo;
            if (aVar != null) {
                aVar.addProfileId(str, iPushRequestCallback);
            }
        }
    }

    public void bindAlias(String str, IPushActionListener iPushActionListener) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            checkParam(str);
            m.a().a(str, getAppId(""), getAppKey(""), iPushActionListener);
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(104);
        }
    }

    public void checkManifest() throws VivoPushException {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            m.a().b();
        }
    }

    public void delTopic(String str, IPushActionListener iPushActionListener) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            ArrayList<String> arrayList = new ArrayList<>(1);
            arrayList.add(str);
            m.a().b(arrayList, getAppId(""), getAppKey(""), iPushActionListener);
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(104);
        }
    }

    @Override // com.vivo.push.e.a
    public void deleteAllProfileId(IPushRequestCallback<Integer> iPushRequestCallback) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(104);
            }
        } else {
            com.vivo.push.e.a aVar = this.mSyncProfileInfo;
            if (aVar != null) {
                aVar.deleteAllProfileId(iPushRequestCallback);
            }
        }
    }

    @Override // com.vivo.push.e.a
    public void deleteProfileId(String str, IPushRequestCallback<Integer> iPushRequestCallback) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(104);
            }
        } else {
            com.vivo.push.e.a aVar = this.mSyncProfileInfo;
            if (aVar != null) {
                aVar.deleteProfileId(str, iPushRequestCallback);
            }
        }
    }

    public void deleteRegid(IPushActionListener iPushActionListener) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            super.deleteRegid(iPushActionListener, getAppId(""), getAppKey(""));
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(104);
        }
    }

    public String getAlias() {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            return m.a().i();
        }
        return null;
    }

    @Override // com.vivo.push.a
    public void getRegId(IPushQueryActionListener iPushQueryActionListener) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            super.getRegId(iPushQueryActionListener);
        } else if (iPushQueryActionListener != null) {
            iPushQueryActionListener.onFail(104);
        }
    }

    public List<String> getTopics() {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            return new ArrayList();
        }
        m.a();
        return m.c();
    }

    public String getVersion() {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            return "506";
        }
        return null;
    }

    public void initialize(PushConfig pushConfig) throws VivoPushException {
        if (pushConfig == null) {
            throw new VivoPushException("initialize error config is null");
        }
        com.vivo.push.restructure.a.a().e().a(pushConfig);
        initialize();
    }

    public void isNotifyGuideDialogAllowed(Activity activity, IPushActionListener iPushActionListener) {
        if (iPushActionListener == null) {
            return;
        }
        if (checkAgreePrivacyStatementAndInitSdk()) {
            com.vivo.push.d.b.a().a(activity, iPushActionListener);
        } else {
            iPushActionListener.onStateChanged(104);
        }
    }

    public boolean isPushSupport(int i) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            return com.vivo.push.restructure.a.a().g().a(i);
        }
        return false;
    }

    public boolean isSupport() {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            return m.a().d();
        }
        return false;
    }

    public int isSupportNewControlStrategies() {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            return com.vivo.push.restructure.a.a().g().a();
        }
        return -1;
    }

    public int isSupportSyncProfileInfo() {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            return com.vivo.push.restructure.a.a().g().b();
        }
        return -1;
    }

    @Override // com.vivo.push.e.a
    public void queryProfileIds(IPushRequestCallback<List<String>> iPushRequestCallback) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(104);
            }
        } else {
            com.vivo.push.e.a aVar = this.mSyncProfileInfo;
            if (aVar != null) {
                aVar.queryProfileIds(iPushRequestCallback);
            }
        }
    }

    @Override // com.vivo.push.a
    public void querySubscribeState(IPushActionListener iPushActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk() && iPushActionListener != null) {
            iPushActionListener.onStateChanged(104);
        }
        super.querySubscribeState(iPushActionListener);
    }

    public void setSystemModel(boolean z) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            m.a().a(z);
        }
    }

    public void setTopic(String str, IPushActionListener iPushActionListener) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            ArrayList<String> arrayList = new ArrayList<>(1);
            arrayList.add(str);
            m.a().a(arrayList, getAppId(""), getAppKey(""), iPushActionListener);
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(104);
        }
    }

    public void showNotifyGuideDialog(Activity activity, IPushActionListener iPushActionListener) {
        if (iPushActionListener == null) {
            return;
        }
        if (checkAgreePrivacyStatementAndInitSdk()) {
            com.vivo.push.d.b.a().a(activity, iPushActionListener, SystemClock.elapsedRealtime());
        } else {
            iPushActionListener.onStateChanged(104);
        }
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            m.a().c(iPushActionListener, getAppId(""), getAppKey(""));
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(104);
        }
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            m.a().a(iPushActionListener, getAppId(""), getAppKey(""));
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(104);
        }
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            checkParam(str);
            m.a().b(str, getAppId(""), getAppKey(""), iPushActionListener);
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(104);
        }
    }

    private void initialize() throws VivoPushException {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            checkManifest();
            m a = m.a();
            com.vivo.push.b.f fVar = new com.vivo.push.b.f();
            fVar.a(com.vivo.push.restructure.a.a().e().l());
            a.a(fVar);
            com.vivo.push.util.t.d("PushClientManager", "startWork");
        }
    }
}
