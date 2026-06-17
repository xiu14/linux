package com.heytap.msp.push.service;

import com.bytedance.push.C;
import com.bytedance.push.g0.f;
import com.bytedance.push.notification.n;
import com.coloros.OpPushAdapter;
import com.heytap.msp.push.mode.CallkitDataMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CallkitPushMessageService extends EnhancedDataMessageService {
    private final String TAG = "CallkitPushMessageService";

    @Override // com.heytap.msp.push.service.EnhancedDataMessageService, com.heytap.msp.push.callback.ICallkitDataMessageCallback
    public void onCallkitMessageReceived(CallkitDataMessage callkitDataMessage) {
        super.onCallkitMessageReceived(callkitDataMessage);
        String messageID = callkitDataMessage.getMessageID();
        String content = callkitDataMessage.getContent();
        f.g("CallkitPushMessageService", "[processCallkitMessage]messageId:" + messageID + " messageData:" + content);
        try {
            JSONObject jSONObject = new JSONObject(content);
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("android_payload"));
            jSONObject2.put("voip_params", jSONObject.optString("voip_params"));
            jSONObject2.put("push_show_type", jSONObject.optInt("push_show_type"));
            ((n) C.z()).i(jSONObject2, OpPushAdapter.getOpPush(), null, false);
        } catch (JSONException e2) {
            e2.printStackTrace();
            ((n) C.z()).h(content, OpPushAdapter.getOpPush(), null);
        }
    }
}
