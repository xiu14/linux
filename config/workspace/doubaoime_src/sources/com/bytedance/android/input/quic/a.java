package com.bytedance.android.input.quic;

import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.quic.ImeNetSDK;
import com.bytedance.android.input.r.j;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements ImeNetSDK.Callback {
    a() {
    }

    @Override // com.bytedance.android.input.quic.ImeNetSDK.Callback
    public void CBAndroidLoggerCall(String str) {
        b bVar = b.a;
        j.m("ImeQuic", "NetSdk: = " + str);
    }

    @Override // com.bytedance.android.input.quic.ImeNetSDK.Callback
    public void CBConnectUseTime(int i) {
        b bVar = b.a;
        e.a.a.a.a.j0("CBConnectUseTime: value = ", i, "ImeQuic");
        IAppLog.a aVar = IAppLog.a;
        JSONObject put = new JSONObject().put(MonitorConstants.CONNECT_TIME, i);
        l.e(put, "JSONObject().put(\"connect_time\", value)");
        aVar.t("quic_connect", put);
    }
}
