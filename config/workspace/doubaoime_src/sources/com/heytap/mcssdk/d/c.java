package com.heytap.mcssdk.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.c;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends d {
    @Override // com.heytap.mcssdk.d.e
    public BaseMode a(Context context, int i, Intent intent) {
        if (4103 != i && 4098 != i && 4108 != i) {
            return null;
        }
        BaseMode a = a(intent, i);
        com.heytap.mcssdk.f.a.a(context, c.a.b, (DataMessage) a);
        return a;
    }

    @Override // com.heytap.mcssdk.d.d
    public BaseMode a(Intent intent, int i) {
        try {
            DataMessage dataMessage = new DataMessage();
            dataMessage.setMessageID(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.f6895c)));
            dataMessage.setTaskID(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.f6896d)));
            dataMessage.setGlobalId(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.h)));
            dataMessage.setAppPackage(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.f6897e)));
            dataMessage.setTitle(com.heytap.mcssdk.utils.b.d(intent.getStringExtra("title")));
            dataMessage.setContent(com.heytap.mcssdk.utils.b.d(intent.getStringExtra("content")));
            dataMessage.setDescription(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.i)));
            String d2 = com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.j));
            int i2 = 0;
            dataMessage.setNotifyID(TextUtils.isEmpty(d2) ? 0 : Integer.parseInt(d2));
            dataMessage.setMiniProgramPkg(com.heytap.mcssdk.utils.b.d(intent.getStringExtra("miniProgramPkg")));
            dataMessage.setMessageType(i);
            dataMessage.setEventId(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.k)));
            dataMessage.setStatisticsExtra(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.l)));
            String d3 = com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.m));
            dataMessage.setDataExtra(d3);
            String a = a(d3);
            if (!TextUtils.isEmpty(a)) {
                i2 = Integer.parseInt(a);
            }
            dataMessage.setMsgCommand(i2);
            dataMessage.setBalanceTime(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.n)));
            dataMessage.setStartDate(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.s)));
            dataMessage.setEndDate(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.t)));
            dataMessage.setTimeRanges(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.o)));
            dataMessage.setRule(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.p)));
            dataMessage.setForcedDelivery(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.q)));
            dataMessage.setDistinctContent(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.r)));
            dataMessage.setAppId(com.heytap.mcssdk.utils.b.d(intent.getStringExtra(com.heytap.mcssdk.constant.b.u)));
            return dataMessage;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("OnHandleIntent--");
            M.append(e2.getMessage());
            com.heytap.mcssdk.utils.e.b(M.toString());
            return null;
        }
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString(com.heytap.mcssdk.constant.b.v);
        } catch (JSONException e2) {
            com.heytap.mcssdk.utils.e.b(e2.getMessage());
            return "";
        }
    }
}
