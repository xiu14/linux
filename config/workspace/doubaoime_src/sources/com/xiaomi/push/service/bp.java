package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.je;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class bp implements XMPushService.n {
    private static Context a;

    /* renamed from: a, reason: collision with other field name */
    private static final boolean f1099a = Log.isLoggable("UNDatas", 3);

    /* renamed from: a, reason: collision with other field name */
    private static final Map<Integer, Map<String, List<String>>> f1097a = new HashMap();

    /* renamed from: a, reason: collision with other field name */
    private static final AtomicReference<String> f1098a = new AtomicReference<>();
    private static final AtomicReference<String> b = new AtomicReference<>();

    public bp(Context context) {
        a = context;
    }

    private static void b() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f1097a);
        if (hashMap.size() > 0) {
            for (Integer num : hashMap.keySet()) {
                Map map = (Map) hashMap.get(num);
                if (map != null && map.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : map.keySet()) {
                        sb.append(str);
                        sb.append(Constants.COLON_SEPARATOR);
                        List list = (List) map.get(str);
                        if (!com.xiaomi.push.u.a(list)) {
                            for (int i = 0; i < list.size(); i++) {
                                if (i != 0) {
                                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                }
                                sb.append((String) list.get(i));
                            }
                        }
                        sb.append(";");
                    }
                    it a2 = a(null, as.a(), ie.NotificationRemoved.f611a, null);
                    a2.a("removed_reason", String.valueOf(num));
                    a2.a("all_delete_msgId_appId", sb.toString());
                    com.xiaomi.channel.commonutils.logger.c.b("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                    a(a, a2);
                }
                f1097a.remove(num);
            }
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* renamed from: a */
    public void mo487a() {
        Map<Integer, Map<String, List<String>>> map = f1097a;
        if (map.size() > 0) {
            synchronized (map) {
                b();
            }
        }
    }

    private static void a(Context context, it itVar) {
        a(context, itVar, null);
    }

    private static void a(Context context, final it itVar, final ih ihVar) {
        if (f1099a) {
            com.xiaomi.channel.commonutils.logger.c.b("UNDatas upload message notification:" + itVar);
        }
        com.xiaomi.push.ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.service.bp.1
            @Override // java.lang.Runnable
            public void run() {
                iq a2 = ab.a(it.this.d(), it.this.b(), it.this, hu.Notification);
                ih ihVar2 = ihVar;
                if (ihVar2 != null) {
                    a2.f732a = ihVar2;
                }
                byte[] a3 = je.a(a2);
                if (bp.a instanceof XMPushService) {
                    ((XMPushService) bp.a).a(it.this.d(), a3, true);
                } else {
                    com.xiaomi.channel.commonutils.logger.c.m15a("UNDatas UploadNotificationDatas failed because not xmsf");
                }
            }
        });
    }

    private static it a(String str, String str2, String str3, String str4) {
        it itVar = new it();
        if (str3 != null) {
            itVar.c(str3);
        }
        if (str != null) {
            itVar.b(str);
        }
        if (str2 != null) {
            itVar.a(str2);
        }
        if (str4 != null) {
            itVar.d(str4);
        }
        itVar.a(false);
        return itVar;
    }
}
