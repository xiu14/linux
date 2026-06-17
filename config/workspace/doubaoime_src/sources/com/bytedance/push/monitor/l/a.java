package com.bytedance.push.monitor.l;

import android.text.TextUtils;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.common.model.ProcessEnum;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements com.bytedance.common.d.a.d {
    private static volatile a a;

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    @Override // com.bytedance.common.d.a.d
    public String getMethodName() {
        return "active_source_method";
    }

    @Override // com.bytedance.common.d.a.d
    public String onMethodCall(ProcessEnum processEnum, List list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        String str = (String) list.get(0);
        if (TextUtils.equals("dau", str)) {
            return String.valueOf(PushServiceManager.get().getPushExternalService().getPushSdkMonitorService().curIsDau());
        }
        if (TextUtils.equals("transmit", str)) {
            return String.valueOf(PushServiceManager.get().getPushExternalService().getPushSdkMonitorService().curIsTransmit());
        }
        return null;
    }
}
