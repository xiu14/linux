package com.bytedance.push.e0;

import com.bytedance.push.e0.a;
import com.bytedance.push.g0.f;
import com.bytedance.push.helper.NetWorkStatusMonitorHelper;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
class b implements NetWorkStatusMonitorHelper.a {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // com.bytedance.push.helper.NetWorkStatusMonitorHelper.a
    public void a(String str, String str2) {
        Map map;
        Map map2;
        Map map3;
        f.g("TokenRetryService", "[onAvailableNetworkTypeChanged]lastType:" + str + " curType:" + str2);
        map = this.a.f5658c;
        synchronized (map) {
            map2 = this.a.f5658c;
            if (map2.isEmpty()) {
                f.g("TokenRetryService", "[onCapabilitiesChanged]unregister NetworkCallback because  mTokenRetryTaskMap is empty");
                return;
            }
            map3 = this.a.f5658c;
            Iterator it2 = map3.values().iterator();
            while (it2.hasNext()) {
                a.b.a((a.b) it2.next(), "network_type_changed-" + str2);
            }
        }
    }
}
