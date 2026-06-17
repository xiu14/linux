package com.bytedance.push.L;

import android.content.Context;
import com.bytedance.push.g0.f;
import com.bytedance.push.interfaze.e;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements e {
    @Override // com.bytedance.push.interfaze.e
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        StringBuilder W = e.a.a.a.a.W("[onEventV2] tag:", str2, " category:", str, " label:");
        W.append(str3);
        W.append(" ext_json:");
        W.append(jSONObject);
        f.c("DefaultEventSender", W.toString());
        AppLog.onEvent(context, str, str2, str3, j, j2, jSONObject);
    }

    @Override // com.bytedance.push.interfaze.e
    public void onEventV3(String str, JSONObject jSONObject) {
        f.c("DefaultEventSender", "[onEventV3] " + str);
        AppLogNewUtils.onEventV3(str, jSONObject);
    }
}
