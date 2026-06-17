package com.heytap.msp.push.service;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.d.e;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.EnhanceDataMessage;

/* loaded from: classes2.dex */
public class a implements e {
    private static final String a = "EnhanceDataMessageParser";

    @Override // com.heytap.mcssdk.d.e
    public BaseMode a(Context context, int i, Intent intent) {
        if (intent == null) {
            com.heytap.mcssdk.utils.e.d(a, "Intent is null, cannot parse message");
            return null;
        }
        if (i != 4117) {
            com.heytap.mcssdk.utils.e.d(a, "Message type mismatch, expected: 4117, got: " + i);
            return null;
        }
        try {
            com.heytap.mcssdk.utils.e.b(a, "Parsing enhanced data message, type: " + i);
            EnhanceDataMessage enhanceDataMessage = new EnhanceDataMessage(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.f6897e)), com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.f6895c)), com.heytap.mcssdk.utils.b.d(intent.getStringExtra("content")), i);
            com.heytap.mcssdk.utils.e.b(a, "Successfully parsed enhanced data message: " + enhanceDataMessage.getMessageID());
            return enhanceDataMessage;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Error parsing enhanced data message: ");
            M.append(e2.getMessage());
            com.heytap.mcssdk.utils.e.e(a, M.toString());
            return null;
        }
    }
}
