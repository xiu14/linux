package com.huawei;

import android.text.TextUtils;
import com.bytedance.common.push.d;
import com.bytedance.push.C;
import com.bytedance.push.g0.f;
import com.bytedance.push.notification.n;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.hw.HWPushAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MessageService extends HmsMessageService {
    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        f.g("HW-MessageService", "onMessageReceived is called");
        String data = remoteMessage.getData();
        if (TextUtils.isEmpty(data)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(data);
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("android_payload"));
            jSONObject2.put("voip_params", jSONObject.optString("voip_params"));
            jSONObject2.put("push_show_type", jSONObject.optInt("push_show_type"));
            ((n) C.z()).i(jSONObject2, HWPushAdapter.getHwPush(), null, false);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String str) {
        super.onNewToken(str);
        d.b(new a(getApplicationContext(), str, 0));
    }
}
