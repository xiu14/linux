package com.bytedance.push.T;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.alliance.IsSupportWakeUp;
import com.bytedance.push.C0679c;
import com.bytedance.push.g0.f;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import com.bytedance.push.third.g;
import com.vivo.push.PushClient;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    private volatile C0679c a;

    public a(C0679c c0679c) {
        this.a = c0679c;
    }

    public Map<String, String> a() {
        boolean z;
        HashMap hashMap = new HashMap();
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = C0679c.a();
                }
            }
        }
        Application application = this.a.a;
        boolean z2 = false;
        try {
            z = PushServiceManager.get().getIPushNotificationService().isSupportProxyNotification();
        } catch (Throwable unused) {
            z = false;
        }
        try {
            IsSupportWakeUp isSupportWakeUp = PushServiceManager.get().getIAllianceService().isSupportWakeUp(application);
            if (isSupportWakeUp != null) {
                PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) h.b(application, PushOnlineSettings.class);
                if (pushOnlineSettings.T() == 1) {
                    z2 = isSupportWakeUp.mIsSupportWakeUp;
                } else if (pushOnlineSettings.T() == 2) {
                    z2 = isSupportWakeUp.mIsEnableWakeUp;
                } else if (pushOnlineSettings.T() == 3 && isSupportWakeUp.mIsEnableWakeUp && isSupportWakeUp.mIsSupportWakeUp) {
                    z2 = true;
                }
            }
        } catch (Throwable unused2) {
        }
        hashMap.put("proxy_support_type", (z && z2) ? ExifInterface.GPS_MEASUREMENT_3D : z2 ? PushClient.DEFAULT_REQUEST_ID : z ? ExifInterface.GPS_MEASUREMENT_2D : "");
        f.c("CommonParamProvider", "[getHttpCommonParams]curSysAdapter:" + g.o(com.ss.android.message.a.a()).e());
        return ((com.bytedance.common.g.b.a) com.bytedance.common.g.a.c().d()).a(hashMap);
    }
}
