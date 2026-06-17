package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class en {
    private static a a;

    /* renamed from: a, reason: collision with other field name */
    private static Map<String, ie> f380a;

    public interface a {
        void uploader(Context context, hy hyVar);
    }

    public static int a(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m352a(int i) {
        return i == 1000 ? "E100000" : i == 3000 ? "E100002" : i == 2000 ? "E100001" : i == 6000 ? "E100003" : "";
    }

    public static void a(a aVar) {
        a = aVar;
    }

    private static void a(Context context, hy hyVar) {
        if (m354a(context.getApplicationContext())) {
            com.xiaomi.push.service.bm.a(context.getApplicationContext(), hyVar);
            return;
        }
        a aVar = a;
        if (aVar != null) {
            aVar.uploader(context, hyVar);
        }
    }

    public static EventClientReport a(String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = str;
        return eventClientReport;
    }

    public static PerfClientReport a() {
        PerfClientReport perfClientReport = new PerfClientReport();
        perfClientReport.production = 1000;
        perfClientReport.reportType = 1000;
        perfClientReport.clientInterfaceId = "P100000";
        return perfClientReport;
    }

    public static EventClientReport a(Context context, String str, String str2, int i, long j, String str3) {
        EventClientReport a2 = a(str);
        a2.eventId = str2;
        a2.eventType = i;
        a2.eventTime = j;
        a2.eventContent = str3;
        return a2;
    }

    public static PerfClientReport a(Context context, int i, long j, long j2) {
        PerfClientReport a2 = a();
        a2.code = i;
        a2.perfCounts = j;
        a2.perfLatencies = j2;
        return a2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m354a(Context context) {
        return (context == null || TextUtils.isEmpty(context.getPackageName()) || !"com.xiaomi.xmsf".equals(context.getPackageName())) ? false : true;
    }

    public static void a(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        try {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                hy a2 = a(context, it2.next());
                if (!com.xiaomi.push.service.bl.a(a2, false)) {
                    a(context, a2);
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.d(th.getMessage());
        }
    }

    public static hy a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        hy hyVar = new hy();
        hyVar.d("category_client_report_data");
        hyVar.a("push_sdk_channel");
        hyVar.a(1L);
        hyVar.b(str);
        hyVar.a(true);
        hyVar.b(System.currentTimeMillis());
        hyVar.g(context.getPackageName());
        hyVar.e("com.xiaomi.xmsf");
        hyVar.f(com.xiaomi.push.service.bl.a());
        hyVar.c("quality_support");
        return hyVar;
    }

    public static void a(Context context, Config config) {
        ClientReportClient.init(context, config, new el(context), new em(context));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m353a(Context context) {
        ClientReportClient.updateConfig(context, a(context));
    }

    public static Config a(Context context) {
        boolean a2 = com.xiaomi.push.service.aq.a(context).a(hz.PerfUploadSwitch.a(), false);
        boolean a3 = com.xiaomi.push.service.aq.a(context).a(hz.EventUploadNewSwitch.a(), false);
        return Config.getBuilder().setEventUploadSwitchOpen(a3).setEventUploadFrequency(com.xiaomi.push.service.aq.a(context).a(hz.EventUploadFrequency.a(), RemoteMessageConst.DEFAULT_TTL)).setPerfUploadSwitchOpen(a2).setPerfUploadFrequency(com.xiaomi.push.service.aq.a(context).a(hz.PerfUploadFrequency.a(), RemoteMessageConst.DEFAULT_TTL)).build(context);
    }

    public static int a(Enum r1) {
        if (r1 != null) {
            if (r1 instanceof hu) {
                return r1.ordinal() + 1001;
            }
            if (r1 instanceof ie) {
                return r1.ordinal() + INotificationPermissionCallback.CODE_NOT_TOP;
            }
            if (r1 instanceof fs) {
                return r1.ordinal() + 3001;
            }
        }
        return -1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static ie m351a(String str) {
        if (f380a == null) {
            synchronized (ie.class) {
                if (f380a == null) {
                    f380a = new HashMap();
                    ie[] values = ie.values();
                    for (int i = 0; i < 84; i++) {
                        ie ieVar = values[i];
                        f380a.put(ieVar.f611a.toLowerCase(), ieVar);
                    }
                }
            }
        }
        ie ieVar2 = f380a.get(str.toLowerCase());
        return ieVar2 != null ? ieVar2 : ie.Invalid;
    }
}
