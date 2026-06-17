package com.xiaomi.push;

import android.content.Context;
import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class df {
    private final String a = "disconnection_event";
    private final String b = "connection_stability_stats";

    /* renamed from: c, reason: collision with root package name */
    private final String f9028c = "count";

    /* renamed from: d, reason: collision with root package name */
    private final String f9029d = "host";

    /* renamed from: e, reason: collision with root package name */
    private final String f9030e = WsConstants.KEY_NETWORK_STATE;

    /* renamed from: f, reason: collision with root package name */
    private final String f9031f = "reason";

    /* renamed from: g, reason: collision with root package name */
    private final String f9032g = "ping_interval";
    private final String h = "hb_strategy";
    private final String i = "network_type";
    private final String j = "wifi_digest";
    private final String k = "online_duration";
    private final String l = "duration";
    private final String m = "disconnect_time";
    private final String n = MonitorConstants.CONNECT_TIME;
    private final String o = "xmsf_vc";
    private final String p = "app_vc";
    private final String q = "android_vc";
    private final String r = "uuid";
    private final String s = "push_bundle_vc";

    public void a(Context context, List<de> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("upload size = ");
        M.append(list.size());
        dd.a(M.toString());
        String m833a = com.xiaomi.push.service.v.m833a(context);
        if (k.m655a(context)) {
            a(list, m833a);
        } else if ("com.mitv.tvhome".equals(context.getPackageName()) || "com.xiaomi.micolauncher".equals(context.getPackageName())) {
            a(list, m833a, context);
        }
    }

    private void a(List<de> list, String str) {
        for (de deVar : list) {
            HashMap hashMap = new HashMap();
            hashMap.put("count", Integer.valueOf(deVar.a()));
            hashMap.put("host", deVar.m231a());
            hashMap.put(WsConstants.KEY_NETWORK_STATE, Integer.valueOf(deVar.b()));
            hashMap.put("reason", Integer.valueOf(deVar.c()));
            hashMap.put("ping_interval", Long.valueOf(deVar.m230a()));
            hashMap.put("hb_strategy", Integer.valueOf(deVar.d()));
            hashMap.put("network_type", Integer.valueOf(deVar.e()));
            hashMap.put("wifi_digest", deVar.m233b());
            hashMap.put("connected_network_type", Integer.valueOf(deVar.f()));
            hashMap.put("online_duration", Long.valueOf(deVar.m234c()));
            hashMap.put("duration", Long.valueOf(deVar.m232b()));
            hashMap.put("disconnect_time", Long.valueOf(deVar.m235d()));
            hashMap.put(MonitorConstants.CONNECT_TIME, Long.valueOf(deVar.m236e()));
            hashMap.put("app_vc", Integer.valueOf(deVar.g()));
            hashMap.put("xmsf_vc", Integer.valueOf(deVar.h()));
            hashMap.put("android_vc", Integer.valueOf(deVar.i()));
            hashMap.put("uuid", str);
            hashMap.put("push_bundle_vc", Integer.valueOf(deVar.j()));
            fw.a().a("disconnection_event", hashMap);
        }
    }

    private void a(List<de> list, String str, Context context) {
        String packageName = context.getPackageName();
        for (de deVar : list) {
            hy hyVar = new hy();
            hyVar.f589c = "disconnection_event";
            hyVar.f590d = "connection_stability_stats";
            hyVar.f583a = "push_sdk_channel";
            hyVar.f586a = true;
            hyVar.f591e = packageName;
            hyVar.f582a = 1L;
            hyVar.f587b = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hyVar.f585a = hashMap;
            hashMap.put("count", String.valueOf(deVar.a()));
            hyVar.f585a.put("host", deVar.m231a());
            hyVar.f585a.put(WsConstants.KEY_NETWORK_STATE, String.valueOf(deVar.b()));
            hyVar.f585a.put("reason", String.valueOf(deVar.c()));
            hyVar.f585a.put("ping_interval", String.valueOf(deVar.m230a()));
            hyVar.f585a.put("hb_strategy", String.valueOf(deVar.d()));
            hyVar.f585a.put("network_type", String.valueOf(deVar.e()));
            hyVar.f585a.put("wifi_digest", deVar.m233b());
            hyVar.f585a.put("connected_network_type", String.valueOf(deVar.f()));
            hyVar.f585a.put("online_duration", String.valueOf(deVar.m234c()));
            hyVar.f585a.put("duration", String.valueOf(deVar.m232b()));
            hyVar.f585a.put("disconnect_time", String.valueOf(deVar.m235d()));
            hyVar.f585a.put(MonitorConstants.CONNECT_TIME, String.valueOf(deVar.m236e()));
            hyVar.f585a.put("app_vc", String.valueOf(deVar.g()));
            hyVar.f585a.put("xmsf_vc", String.valueOf(deVar.h()));
            hyVar.f585a.put("android_vc", String.valueOf(deVar.i()));
            hyVar.f585a.put("uuid", str);
            hyVar.f585a.put("push_bundle_vc", String.valueOf(deVar.j()));
            hs.a(context).a(hyVar, packageName);
        }
    }
}
