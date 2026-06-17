package com.xiaomi.clientreport.manager;

import android.content.Context;
import android.os.Process;
import com.xiaomi.channel.commonutils.logger.c;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.clientreport.processor.b;
import com.xiaomi.push.h;

/* loaded from: classes2.dex */
public class ClientReportClient {
    public static void init(Context context) {
        init(context, Config.defaultConfig(context), new com.xiaomi.clientreport.processor.a(context), new b(context));
    }

    public static void reportEvent(Context context, EventClientReport eventClientReport) {
        if (eventClientReport != null) {
            a.a(context).a(eventClientReport);
        }
    }

    public static void reportPerf(Context context, PerfClientReport perfClientReport) {
        if (perfClientReport != null) {
            a.a(context).a(perfClientReport);
        }
    }

    public static void updateConfig(Context context, Config config) {
        if (config == null) {
            return;
        }
        a.a(context).a(config.isEventUploadSwitchOpen(), config.isPerfUploadSwitchOpen(), config.getEventUploadFrequency(), config.getPerfUploadFrequency());
    }

    public static void init(Context context, Config config) {
        init(context, config, new com.xiaomi.clientreport.processor.a(context), new b(context));
    }

    public static void init(Context context, Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        StringBuilder M = e.a.a.a.a.M("init in  pid :");
        M.append(Process.myPid());
        M.append(" threadId: ");
        M.append(Thread.currentThread().getId());
        c.c(M.toString());
        a.a(context).a(config, iEventProcessor, iPerfProcessor);
        if (h.m457a(context)) {
            c.c("init in process\u3000start scheduleJob");
            a.a(context).m27a();
        }
    }
}
