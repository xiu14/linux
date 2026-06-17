package com.xiaomi.push;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class dl {
    private final String a = "power_consumption_stats";
    private final String b = "off_up_ct";

    /* renamed from: c, reason: collision with root package name */
    private final String f9040c = "off_dn_ct";

    /* renamed from: d, reason: collision with root package name */
    private final String f9041d = "off_ping_ct";

    /* renamed from: e, reason: collision with root package name */
    private final String f9042e = "off_pong_ct";

    /* renamed from: f, reason: collision with root package name */
    private final String f9043f = "off_dur";

    /* renamed from: g, reason: collision with root package name */
    private final String f9044g = "on_up_ct";
    private final String h = "on_dn_ct";
    private final String i = "on_ping_ct";
    private final String j = "on_pong_ct";
    private final String k = "on_dur";
    private final String l = "hb_strategy";
    private final String m = "start_time";
    private final String n = "end_time";
    private final String o = "xmsf_vc";
    private final String p = "android_vc";
    private final String q = "uuid";
    private final String r = "push_bundle_vc";

    public void a(Context context, dk dkVar) {
        if (dkVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("off_up_ct", Integer.valueOf(dkVar.a()));
        hashMap.put("off_dn_ct", Integer.valueOf(dkVar.b()));
        hashMap.put("off_ping_ct", Integer.valueOf(dkVar.c()));
        hashMap.put("off_pong_ct", Integer.valueOf(dkVar.d()));
        hashMap.put("off_dur", Long.valueOf(dkVar.m244a()));
        hashMap.put("on_up_ct", Integer.valueOf(dkVar.e()));
        hashMap.put("on_dn_ct", Integer.valueOf(dkVar.f()));
        hashMap.put("on_ping_ct", Integer.valueOf(dkVar.g()));
        hashMap.put("on_pong_ct", Integer.valueOf(dkVar.h()));
        hashMap.put("on_dur", Long.valueOf(dkVar.m246b()));
        hashMap.putAll(dkVar.m245a());
        hashMap.put("start_time", Long.valueOf(dkVar.m247c()));
        hashMap.put("end_time", Long.valueOf(dkVar.m248d()));
        hashMap.put("xmsf_vc", Integer.valueOf(dkVar.i()));
        hashMap.put("android_vc", Integer.valueOf(dkVar.j()));
        hashMap.put("uuid", com.xiaomi.push.service.v.m833a(context));
        hashMap.put("push_bundle_vc", Integer.valueOf(dkVar.k()));
        fw.a().a("power_consumption_stats", hashMap);
    }
}
