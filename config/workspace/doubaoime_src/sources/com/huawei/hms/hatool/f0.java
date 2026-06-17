package com.huawei.hms.hatool;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vivo.push.PushClient;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f0 extends k0 {

    /* renamed from: g, reason: collision with root package name */
    private String f7349g = "";

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject a0 = e.a.a.a.a.a0("protocol_version", ExifInterface.GPS_MEASUREMENT_3D, "compress_mode", PushClient.DEFAULT_REQUEST_ID);
        a0.put("serviceid", this.f7369d);
        a0.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.a);
        a0.put("hmac", this.f7349g);
        a0.put("chifer", this.f7371f);
        a0.put("timestamp", this.b);
        a0.put("servicetag", this.f7368c);
        a0.put("requestid", this.f7370e);
        return a0;
    }

    public void g(String str) {
        this.f7349g = str;
    }
}
