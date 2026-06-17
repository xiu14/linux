package com.bytedance.android.input.common.t.a.d;

import android.text.TextUtils;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.asr.api.IAsr;
import com.bytedance.android.input.common.asr.sdkImpl.i.AsrConnectConfig;
import com.bytedance.common.wschannel.WsConstants;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.enums.SAMICoreTokenType;
import com.mammon.audiosdk.structures.SAMICoreConnectPoolContextParameter;
import com.mammon.audiosdk.structures.SAMICoreConnectPoolSetting;
import com.mammon.audiosdk.structures.SAMICoreFrontierClientContextParameter;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import java.util.Objects;
import kotlin.h;
import kotlin.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements com.bytedance.android.input.common.asr.sdkImpl.i.a {
    private boolean a;

    /* renamed from: com.bytedance.android.input.common.t.a.d.a$a, reason: collision with other inner class name */
    public static final class C0065a implements com.bytedance.android.input.basic.applog.api.b {
        C0065a() {
        }

        @Override // com.bytedance.android.input.basic.applog.api.b
        public void a(String str, String str2, String str3) {
            if (TextUtils.isEmpty(str)) {
                a.this.g("onGetDeviceId is null");
                return;
            }
            a.this.g("fetch did finish prepare init frontier");
            a.this.f();
            IAppLog.a.o(this);
        }
    }

    private final void d() {
        StringBuilder M = e.a.a.a.a.M("addPoolClient() begin ");
        M.append(Thread.currentThread().getName());
        h(M.toString());
        SAMICoreConnectPoolContextParameter sAMICoreConnectPoolContextParameter = new SAMICoreConnectPoolContextParameter();
        sAMICoreConnectPoolContextParameter.business = "ime";
        IAppGlobals.a aVar = IAppGlobals.a;
        aVar.j("FrontierWsConfigManager", "addPoolClient");
        AsrConnectConfig asrConnectConfig = AsrConnectConfig.INSTANCE;
        if (asrConnectConfig.isCanWsOpt()) {
            sAMICoreConnectPoolContextParameter.url = "wss://frontier-audio-ime-ws.doubao.com/ocean/api/v1/ws";
        } else {
            sAMICoreConnectPoolContextParameter.url = "wss://frontier-audio-ime-quic.doubao.com/api/v1/ws;wss://frontier-audio-ime-ws.doubao.com/ocean/api/v1/ws";
        }
        sAMICoreConnectPoolContextParameter.appKey = IAsr.a.b();
        sAMICoreConnectPoolContextParameter.tokenType = SAMICoreTokenType.TOKEN_TO_C_D.getValue();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("device_id", IAppLog.a.getDeviceId());
        Objects.requireNonNull(aVar);
        jSONObject.putOpt(WsConstants.KEY_APP_ID, "401734");
        sAMICoreConnectPoolContextParameter.token = jSONObject.toString();
        String string = aVar.u().getString("asr_ppe_set_v2", "");
        g(e.a.a.a.a.s("header ppe = ", string));
        if (string == null || string.length() == 0) {
            sAMICoreConnectPoolContextParameter.header = "{\"proto-version\":\"v2\"}";
        } else {
            sAMICoreConnectPoolContextParameter.header = e.a.a.a.a.t("{\"x-tt-env\":\"", string, "\",\"x-use-ppe\":\"1\",\"proto-version\":\"v2\"}");
            StringBuilder M2 = e.a.a.a.a.M("header pool = ");
            M2.append(sAMICoreConnectPoolContextParameter.header);
            aVar.j("Asr-Flow-ConnectPool", M2.toString());
        }
        sAMICoreConnectPoolContextParameter.timeout = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
        if (asrConnectConfig.isCanWsOpt()) {
            sAMICoreConnectPoolContextParameter.protocolType = 1;
            sAMICoreConnectPoolContextParameter.clientCnt = 1;
        } else {
            sAMICoreConnectPoolContextParameter.protocolType = 3;
            sAMICoreConnectPoolContextParameter.clientCnt = 2;
        }
        sAMICoreConnectPoolContextParameter.clientConnectTimeout = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
        sAMICoreConnectPoolContextParameter.query = com.bytedance.android.input.common.t.a.e.a.b();
        SAMICore.AddConnectPoolClient(sAMICoreConnectPoolContextParameter);
        g("addPoolClient() url " + sAMICoreConnectPoolContextParameter.url);
    }

    private final void e() {
        this.a = true;
        if (AsrConnectConfig.INSTANCE.isCanWsOpt()) {
            return;
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        aVar.j("FrontierWsConfigManager", "initFrontier InitFrontierClient");
        String deviceId = IAppLog.a.getDeviceId();
        SAMICoreFrontierClientContextParameter sAMICoreFrontierClientContextParameter = new SAMICoreFrontierClientContextParameter();
        sAMICoreFrontierClientContextParameter.url = "wss://frontier-audio-ime-quic.doubao.com/api/v1/ws";
        sAMICoreFrontierClientContextParameter.platform = 1;
        sAMICoreFrontierClientContextParameter.maxConcurrency = 10;
        Objects.requireNonNull(aVar);
        sAMICoreFrontierClientContextParameter.appId = 401734;
        Objects.requireNonNull(aVar);
        sAMICoreFrontierClientContextParameter.appVersion = "1.3.9";
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("proto-version", "v2");
        jSONObject.putOpt("x-tt-e-k", deviceId + "+W");
        sAMICoreFrontierClientContextParameter.header = jSONObject.toString();
        sAMICoreFrontierClientContextParameter.did = deviceId;
        sAMICoreFrontierClientContextParameter.connectTimeout = DownloadErrorCode.ERROR_CRONET_HTTP_ERROR_END;
        sAMICoreFrontierClientContextParameter.query = com.bytedance.android.input.common.t.a.e.a.b();
        SAMICore.InitFrontierClient(sAMICoreFrontierClientContextParameter);
        SAMICore.UpdateFrontierClientPingInterval(3000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        Object J2;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder M = e.a.a.a.a.M("connect start current Connected ? ");
        M.append(this.a);
        h(M.toString());
        try {
            e();
            SAMICoreConnectPoolSetting sAMICoreConnectPoolSetting = new SAMICoreConnectPoolSetting();
            sAMICoreConnectPoolSetting.retryCnt = 5;
            sAMICoreConnectPoolSetting.retryIntervalTime = 500;
            sAMICoreConnectPoolSetting.pollingIntervalTime = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
            SAMICore.InitConnectPool(sAMICoreConnectPoolSetting);
            d();
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            IAppGlobals.a.e("Asr-Flow-ConnectPool", e.a.a.a.a.w("PrepareConnect error = ", b));
        }
        StringBuilder M2 = e.a.a.a.a.M("connect end cost time = ");
        M2.append(System.currentTimeMillis() - currentTimeMillis);
        h(M2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str) {
        IAppGlobals.a.j("Asr-Flow-ConnectPool", str);
    }

    private final void h(String str) {
        IAppGlobals.a.x("Asr-Flow-ConnectPool", str);
    }

    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.a
    public void a() {
        IAppLog.a aVar = IAppLog.a;
        if (!TextUtils.isEmpty(aVar.getDeviceId())) {
            f();
        } else {
            g("current did is null. waiting");
            aVar.p(new C0065a());
        }
    }

    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.a
    public void disconnect() {
        Object J2;
        if (this.a) {
            try {
                SAMICoreConnectPoolContextParameter sAMICoreConnectPoolContextParameter = new SAMICoreConnectPoolContextParameter();
                sAMICoreConnectPoolContextParameter.business = "ime";
                SAMICore.RemoveConnectPoolClient(sAMICoreConnectPoolContextParameter);
                SAMICore.ShutDownConnectPool();
                SAMICore.CloseFrontierClient();
                h("close connect pool finish.");
                J2 = o.a;
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            Throwable b = h.b(J2);
            if (b != null) {
                IAppGlobals.a.e("Asr-Flow-ConnectPool", e.a.a.a.a.w("disconnect error = ", b));
            }
            this.a = false;
        }
    }

    @Override // com.bytedance.android.input.common.asr.sdkImpl.i.a
    public boolean isConnected() {
        return this.a;
    }
}
