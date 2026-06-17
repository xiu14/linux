package com.bytedance.push.g0;

import com.bytedance.android.service.manager.push.notification.PushNotificationButtonInfo;
import com.bytedance.push.PushBody;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {
    public static String a(PushNotificationButtonInfo pushNotificationButtonInfo, String str) {
        if (pushNotificationButtonInfo == null) {
            f.c("OpenUrlUtils", "buttonInfo is null");
            return b(str);
        }
        if (!pushNotificationButtonInfo.mButtonOpenUrl.isEmpty()) {
            f.c("OpenUrlUtils", "buttonInfo.open_url is not empty");
            return pushNotificationButtonInfo.mButtonOpenUrl;
        }
        if (pushNotificationButtonInfo.mButtonAction.equals("open_app")) {
            f.c("OpenUrlUtils", "buttonInfo.action is open_app");
            return b(str);
        }
        f.c("OpenUrlUtils", "buttonInfo.open_url is empty, so open_url is empty");
        return pushNotificationButtonInfo.mButtonOpenUrl;
    }

    public static String b(String str) {
        try {
            return new PushBody(new JSONObject(str)).p;
        } catch (Exception e2) {
            f.e("OpenUrlUtils", e2.getMessage());
            return "";
        }
    }
}
