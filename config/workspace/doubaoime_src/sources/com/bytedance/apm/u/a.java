package com.bytedance.apm.u;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    public static final List<String> a;
    public static final List<String> b;

    /* renamed from: c, reason: collision with root package name */
    public static final List<String> f3578c;

    /* renamed from: d, reason: collision with root package name */
    public static final List<String> f3579d;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add("https://mon.zijieapi.com/monitor/appmonitor/v5/batch_settings");
        arrayList.add("https://monsetting.toutiao.com/monitor/appmonitor/v5/batch_settings");
        ArrayList arrayList2 = new ArrayList();
        b = arrayList2;
        arrayList2.add("https://mon.zijieapi.com/monitor/collect/batch/");
        arrayList2.add("https://mon.toutiao.com/monitor/collect/batch/");
        ArrayList arrayList3 = new ArrayList();
        f3578c = arrayList3;
        arrayList3.add("https://mon.zijieapi.com/monitor/collect/c/trace_collect");
        ArrayList arrayList4 = new ArrayList();
        f3579d = arrayList4;
        arrayList4.add("https://mon.zijieapi.com/monitor/collect/c/exception");
        arrayList4.add("https://mon.zijieapi.com/monitor/collect/c/exception");
    }
}
