package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.ht;
import com.xiaomi.push.hu;
import com.xiaomi.push.hy;
import com.xiaomi.push.ih;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.je;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class t implements ht {
    private final XMPushService a;

    public t(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.ht
    public void a(final List<hy> list, final String str, final String str2) {
        this.a.a(new XMPushService.j(4) { // from class: com.xiaomi.push.service.t.1
            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "Send tiny data.";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo403a() {
                String a = t.this.a(str);
                ArrayList<it> a2 = bl.a(list, str, a, 32768);
                if (a2 == null) {
                    com.xiaomi.channel.commonutils.logger.c.d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
                    return;
                }
                Iterator<it> it2 = a2.iterator();
                while (it2.hasNext()) {
                    it next = it2.next();
                    next.a("uploadWay", "longXMPushService");
                    iq a3 = ab.a(str, a, next, hu.Notification);
                    if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
                        if (a3.m558a() == null) {
                            ih ihVar = new ih();
                            ihVar.a("-1");
                            a3.a(ihVar);
                        }
                        a3.m558a().b("ext_traffic_source_pkg", str2);
                    }
                    t.this.a.a(str, je.a(a3), true);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if ("com.xiaomi.xmsf".equals(str)) {
            return v.f1157a;
        }
        return this.a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }
}
