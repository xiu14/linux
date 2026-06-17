package com.bytedance.lego.init;

import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.bytedance.lego.init.generate.DelayTaskCollector__common_biz_initializer;
import com.bytedance.lego.init.generate.FeedShowTaskCollector__common_biz_initializer;
import com.bytedance.lego.init.generate.PeriodTaskCollector__common_biz_initializer;
import com.bytedance.lego.init.model.InitPeriod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class y {
    private static final List<g> a = new ArrayList();
    private static final List<e> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static final List<f> f5332c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static List<com.bytedance.lego.init.model.g> f5333d = null;

    /* renamed from: e, reason: collision with root package name */
    private static List<com.bytedance.lego.init.model.b> f5334e = null;

    /* renamed from: f, reason: collision with root package name */
    private static List<com.bytedance.lego.init.model.c> f5335f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, com.bytedance.lego.init.model.f> f5336g = new HashMap();
    private static List<com.bytedance.lego.init.model.e> h = new LinkedList();
    private static List<com.bytedance.lego.init.model.e> i = new LinkedList();

    public static List<com.bytedance.lego.init.model.b> a() {
        if (f5334e == null) {
            f5334e = new ArrayList();
            List<e> list = b;
            if (list.isEmpty()) {
                list.clear();
                list.add(new DelayTaskCollector__common_biz_initializer());
            }
            Iterator<e> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().collectDelayTask(f5334e);
            }
        }
        return f5334e;
    }

    public static List<com.bytedance.lego.init.model.c> b() {
        if (f5335f == null) {
            f5335f = new ArrayList();
            List<f> list = f5332c;
            if (list.isEmpty()) {
                list.clear();
                list.add(new FeedShowTaskCollector__common_biz_initializer());
            }
            Iterator<f> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().collectTask(f5335f);
            }
        }
        return f5335f;
    }

    public static List<com.bytedance.lego.init.model.g> c() {
        if (f5333d == null) {
            f5333d = new ArrayList();
            List<g> list = a;
            if (list.isEmpty()) {
                list.clear();
                list.add(new PeriodTaskCollector__common_biz_initializer());
            }
            Iterator<g> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().collectPeriodTask(f5333d);
            }
        }
        return f5333d;
    }

    public static Map<String, com.bytedance.lego.init.model.f> d() {
        Map<String, com.bytedance.lego.init.model.f> map = f5336g;
        if (map.isEmpty()) {
            map.clear();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            arrayList.add("SPLASH_ONCREATE2SUPER_START");
            arrayList2.add("APP_SUPER2ONCREATEEND_START");
            arrayList2.add("ImeAbTestInitializer");
            arrayList2.add("ImeMSSDKInitializer");
            arrayList2.add("ImePraiseDialogInitializer");
            arrayList2.add("ImeTTNetInitializer");
            arrayList3.add("APP_SUPER2ONCREATEEND_START");
            arrayList3.add("ImeAbTestInitializer");
            arrayList3.add("ImeMSSDKInitializer");
            arrayList3.add("ImePraiseDialogInitializer");
            arrayList3.add("ImeTTNetInitializer");
            arrayList4.add("all");
            InitPeriod initPeriod = InitPeriod.NONE;
            ArrayList Z = e.a.a.a.a.Z(map, "APP_SUPER2ONCREATEEND_END", new com.bytedance.lego.init.model.f("APP_SUPER2ONCREATEEND_END", true, false, 17.497513f, arrayList4, arrayList, arrayList2, arrayList3, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList Y = e.a.a.a.a.Y(Z, "MAIN_ONRESUME2SUPER_END", arrayList5, "MAIN_SUPER2ONCREATEEND_END");
            arrayList6.add("MAIN_SUPER2ONCREATEEND_END");
            Y.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z2 = e.a.a.a.a.Z(map, "MAIN_ONRESUME2SUPER_START", new com.bytedance.lego.init.model.f("MAIN_ONRESUME2SUPER_START", true, false, 4.4975123f, Y, Z, arrayList5, arrayList6, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            Z2.add("ImeAbTestInitializer");
            Z2.add("ImeMSSDKInitializer");
            Z2.add("APP_SUPER2ONCREATEEND_END");
            arrayList7.add("APP_SUPER2ONCREATEEND_START");
            arrayList8.add("APP_SUPER2ONCREATEEND_START");
            arrayList9.add("all");
            InitPeriod initPeriod2 = InitPeriod.APP_SUPER2ONCREATEEND;
            ArrayList Z3 = e.a.a.a.a.Z(map, "ImeTTNetInitializer", new com.bytedance.lego.init.model.f("ImeTTNetInitializer", true, false, 54.497513f, arrayList9, Z2, arrayList7, arrayList8, "com.bytedance.android.input.common_biz.init.task.ImeTTNetInitializer", initPeriod2));
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            ArrayList Y2 = e.a.a.a.a.Y(Z3, "MAIN_ONCREATE2SUPER_END", arrayList10, "SPLASH_SUPER2ONRESUMEEND_END");
            arrayList11.add("SPLASH_SUPER2ONRESUMEEND_END");
            Y2.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z4 = e.a.a.a.a.Z(map, "MAIN_ONCREATE2SUPER_START", new com.bytedance.lego.init.model.f("MAIN_ONCREATE2SUPER_START", true, false, 8.497513f, Y2, Z3, arrayList10, arrayList11, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            ArrayList Y3 = e.a.a.a.a.Y(Z4, "MAIN_ONRESUME2SUPER_START", arrayList12, "MAIN_SUPER2ONCREATEEND_START");
            arrayList13.add("MAIN_SUPER2ONCREATEEND_START");
            Y3.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z5 = e.a.a.a.a.Z(map, "MAIN_SUPER2ONCREATEEND_END", new com.bytedance.lego.init.model.f("MAIN_SUPER2ONCREATEEND_END", true, false, 5.4975123f, Y3, Z4, arrayList12, arrayList13, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            ArrayList Y4 = e.a.a.a.a.Y(Z5, "APP_SUPER2ATTACHBASEEND_START", arrayList14, "APP_ATTACHBASE2SUPER_START");
            arrayList15.add("APP_ATTACHBASE2SUPER_START");
            Y4.add("all");
            ArrayList Z6 = e.a.a.a.a.Z(map, "APP_ATTACHBASE2SUPER_END", new com.bytedance.lego.init.model.f("APP_ATTACHBASE2SUPER_END", true, false, 131.49751f, Y4, Z5, arrayList14, arrayList15, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList16 = new ArrayList();
            ArrayList arrayList17 = new ArrayList();
            ArrayList Y5 = e.a.a.a.a.Y(Z6, "SPLASH_ONCREATE2SUPER_END", arrayList16, "APP_SUPER2ONCREATEEND_END");
            arrayList17.add("APP_SUPER2ONCREATEEND_END");
            Y5.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z7 = e.a.a.a.a.Z(map, "SPLASH_ONCREATE2SUPER_START", new com.bytedance.lego.init.model.f("SPLASH_ONCREATE2SUPER_START", true, false, 16.497513f, Y5, Z6, arrayList16, arrayList17, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList18 = new ArrayList();
            ArrayList arrayList19 = new ArrayList();
            ArrayList Y6 = e.a.a.a.a.Y(Z7, "APP_ONCREATE2SUPER_START", arrayList18, "APP_SUPER2ATTACHBASEEND_START");
            arrayList19.add("APP_SUPER2ATTACHBASEEND_START");
            Y6.add("all");
            ArrayList Z8 = e.a.a.a.a.Z(map, "APP_SUPER2ATTACHBASEEND_END", new com.bytedance.lego.init.model.f("APP_SUPER2ATTACHBASEEND_END", true, false, 129.49751f, Y6, Z7, arrayList18, arrayList19, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList20 = new ArrayList();
            ArrayList arrayList21 = new ArrayList();
            ArrayList arrayList22 = new ArrayList();
            Z8.add("APP_ATTACHBASE2SUPER_END");
            arrayList22.add("all");
            ArrayList Z9 = e.a.a.a.a.Z(map, "APP_ATTACHBASE2SUPER_START", new com.bytedance.lego.init.model.f("APP_ATTACHBASE2SUPER_START", true, false, 132.49751f, arrayList22, Z8, arrayList20, arrayList21, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList23 = new ArrayList();
            ArrayList arrayList24 = new ArrayList();
            ArrayList Y7 = e.a.a.a.a.Y(Z9, "APP_SUPER2ONCREATEEND_START", arrayList23, "APP_ONCREATE2SUPER_START");
            arrayList24.add("APP_ONCREATE2SUPER_START");
            Y7.add("all");
            ArrayList Z10 = e.a.a.a.a.Z(map, "APP_ONCREATE2SUPER_END", new com.bytedance.lego.init.model.f("APP_ONCREATE2SUPER_END", true, false, 127.49751f, Y7, Z9, arrayList23, arrayList24, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList25 = new ArrayList();
            ArrayList arrayList26 = new ArrayList();
            ArrayList arrayList27 = new ArrayList();
            arrayList25.add("MAIN_SUPER2ONRESUMEEND_START");
            arrayList26.add("MAIN_SUPER2ONRESUMEEND_START");
            arrayList27.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z11 = e.a.a.a.a.Z(map, "MAIN_SUPER2ONRESUMEEND_END", new com.bytedance.lego.init.model.f("MAIN_SUPER2ONRESUMEEND_END", true, false, 1.4975125f, arrayList27, Z10, arrayList25, arrayList26, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList28 = new ArrayList();
            ArrayList arrayList29 = new ArrayList();
            ArrayList Y8 = e.a.a.a.a.Y(Z11, "SPLASH_SUPER2ONCREATEEND_START", arrayList28, "SPLASH_ONCREATE2SUPER_START");
            arrayList29.add("SPLASH_ONCREATE2SUPER_START");
            Y8.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z12 = e.a.a.a.a.Z(map, "SPLASH_ONCREATE2SUPER_END", new com.bytedance.lego.init.model.f("SPLASH_ONCREATE2SUPER_END", true, false, 15.497513f, Y8, Z11, arrayList28, arrayList29, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList30 = new ArrayList();
            ArrayList arrayList31 = new ArrayList();
            ArrayList Y9 = e.a.a.a.a.Y(Z12, "SPLASH_SUPER2ONCREATEEND_END", arrayList30, "SPLASH_ONCREATE2SUPER_END");
            arrayList31.add("SPLASH_ONCREATE2SUPER_END");
            Y9.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z13 = e.a.a.a.a.Z(map, "SPLASH_SUPER2ONCREATEEND_START", new com.bytedance.lego.init.model.f("SPLASH_SUPER2ONCREATEEND_START", true, false, 14.497513f, Y9, Z12, arrayList30, arrayList31, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList32 = new ArrayList();
            ArrayList arrayList33 = new ArrayList();
            ArrayList arrayList34 = new ArrayList();
            Z13.add("APP_SUPER2ONCREATEEND_END");
            arrayList32.add("APP_SUPER2ONCREATEEND_START");
            arrayList32.add("ImeTTNetInitializer");
            arrayList33.add("APP_SUPER2ONCREATEEND_START");
            arrayList33.add("ImeTTNetInitializer");
            arrayList34.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z14 = e.a.a.a.a.Z(map, "ImeMSSDKInitializer", new com.bytedance.lego.init.model.f("ImeMSSDKInitializer", false, true, 18.497513f, arrayList34, Z13, arrayList32, arrayList33, "com.bytedance.android.input.common_biz.init.task.ImeMSSDKInitializer", initPeriod2));
            ArrayList arrayList35 = new ArrayList();
            ArrayList arrayList36 = new ArrayList();
            ArrayList Y10 = e.a.a.a.a.Y(Z14, "SPLASH_ONRESUME2SUPER_END", arrayList35, "SPLASH_SUPER2ONCREATEEND_END");
            arrayList36.add("SPLASH_SUPER2ONCREATEEND_END");
            Y10.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z15 = e.a.a.a.a.Z(map, "SPLASH_ONRESUME2SUPER_START", new com.bytedance.lego.init.model.f("SPLASH_ONRESUME2SUPER_START", true, false, 12.497513f, Y10, Z14, arrayList35, arrayList36, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList37 = new ArrayList();
            ArrayList arrayList38 = new ArrayList();
            ArrayList Y11 = e.a.a.a.a.Y(Z15, "APP_ONCREATE2SUPER_END", arrayList37, "APP_SUPER2ATTACHBASEEND_END");
            arrayList38.add("APP_SUPER2ATTACHBASEEND_END");
            Y11.add("all");
            ArrayList Z16 = e.a.a.a.a.Z(map, "APP_ONCREATE2SUPER_START", new com.bytedance.lego.init.model.f("APP_ONCREATE2SUPER_START", true, false, 128.49751f, Y11, Z15, arrayList37, arrayList38, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList39 = new ArrayList();
            ArrayList arrayList40 = new ArrayList();
            ArrayList Y12 = e.a.a.a.a.Y(Z16, "MAIN_SUPER2ONRESUMEEND_END", arrayList39, "MAIN_ONRESUME2SUPER_END");
            arrayList40.add("MAIN_ONRESUME2SUPER_END");
            Y12.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z17 = e.a.a.a.a.Z(map, "MAIN_SUPER2ONRESUMEEND_START", new com.bytedance.lego.init.model.f("MAIN_SUPER2ONRESUMEEND_START", true, false, 2.4975123f, Y12, Z16, arrayList39, arrayList40, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList41 = new ArrayList();
            ArrayList arrayList42 = new ArrayList();
            ArrayList Y13 = e.a.a.a.a.Y(Z17, "MAIN_SUPER2ONRESUMEEND_START", arrayList41, "MAIN_ONRESUME2SUPER_START");
            arrayList42.add("MAIN_ONRESUME2SUPER_START");
            Y13.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z18 = e.a.a.a.a.Z(map, "MAIN_ONRESUME2SUPER_END", new com.bytedance.lego.init.model.f("MAIN_ONRESUME2SUPER_END", true, false, 3.4975123f, Y13, Z17, arrayList41, arrayList42, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList43 = new ArrayList();
            ArrayList arrayList44 = new ArrayList();
            ArrayList arrayList45 = new ArrayList();
            Z18.add("APP_SUPER2ONCREATEEND_END");
            arrayList43.add("APP_SUPER2ONCREATEEND_START");
            arrayList43.add("ImeTTNetInitializer");
            arrayList44.add("APP_SUPER2ONCREATEEND_START");
            arrayList44.add("ImeTTNetInitializer");
            arrayList45.add("all");
            ArrayList Z19 = e.a.a.a.a.Z(map, "ImeAbTestInitializer", new com.bytedance.lego.init.model.f("ImeAbTestInitializer", false, true, 18.497513f, arrayList45, Z18, arrayList43, arrayList44, "com.bytedance.android.input.common_biz.init.task.ImeAbTestInitializer", initPeriod2));
            ArrayList arrayList46 = new ArrayList();
            ArrayList arrayList47 = new ArrayList();
            ArrayList arrayList48 = new ArrayList();
            Z19.add("ImeTTNetInitializer");
            Z19.add("ImeAbTestInitializer");
            Z19.add("ImeMSSDKInitializer");
            Z19.add("ImePraiseDialogInitializer");
            Z19.add("APP_SUPER2ONCREATEEND_END");
            arrayList46.add("APP_ONCREATE2SUPER_END");
            arrayList47.add("APP_ONCREATE2SUPER_END");
            arrayList48.add("all");
            ArrayList Z20 = e.a.a.a.a.Z(map, "APP_SUPER2ONCREATEEND_START", new com.bytedance.lego.init.model.f("APP_SUPER2ONCREATEEND_START", true, false, 126.49751f, arrayList48, Z19, arrayList46, arrayList47, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList49 = new ArrayList();
            ArrayList arrayList50 = new ArrayList();
            ArrayList Y14 = e.a.a.a.a.Y(Z20, "APP_SUPER2ATTACHBASEEND_END", arrayList49, "APP_ATTACHBASE2SUPER_END");
            arrayList50.add("APP_ATTACHBASE2SUPER_END");
            Y14.add("all");
            ArrayList Z21 = e.a.a.a.a.Z(map, "APP_SUPER2ATTACHBASEEND_START", new com.bytedance.lego.init.model.f("APP_SUPER2ATTACHBASEEND_START", true, false, 130.49751f, Y14, Z20, arrayList49, arrayList50, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList51 = new ArrayList();
            ArrayList arrayList52 = new ArrayList();
            ArrayList Y15 = e.a.a.a.a.Y(Z21, "MAIN_SUPER2ONCREATEEND_START", arrayList51, "MAIN_ONCREATE2SUPER_START");
            arrayList52.add("MAIN_ONCREATE2SUPER_START");
            Y15.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z22 = e.a.a.a.a.Z(map, "MAIN_ONCREATE2SUPER_END", new com.bytedance.lego.init.model.f("MAIN_ONCREATE2SUPER_END", true, false, 7.4975123f, Y15, Z21, arrayList51, arrayList52, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList53 = new ArrayList();
            ArrayList arrayList54 = new ArrayList();
            ArrayList Y16 = e.a.a.a.a.Y(Z22, "SPLASH_SUPER2ONRESUMEEND_END", arrayList53, "SPLASH_ONRESUME2SUPER_END");
            arrayList54.add("SPLASH_ONRESUME2SUPER_END");
            Y16.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z23 = e.a.a.a.a.Z(map, "SPLASH_SUPER2ONRESUMEEND_START", new com.bytedance.lego.init.model.f("SPLASH_SUPER2ONRESUMEEND_START", true, false, 10.497513f, Y16, Z22, arrayList53, arrayList54, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList55 = new ArrayList();
            ArrayList arrayList56 = new ArrayList();
            ArrayList Y17 = e.a.a.a.a.Y(Z23, "SPLASH_ONRESUME2SUPER_START", arrayList55, "SPLASH_SUPER2ONCREATEEND_START");
            arrayList56.add("SPLASH_SUPER2ONCREATEEND_START");
            Y17.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z24 = e.a.a.a.a.Z(map, "SPLASH_SUPER2ONCREATEEND_END", new com.bytedance.lego.init.model.f("SPLASH_SUPER2ONCREATEEND_END", true, false, 13.497513f, Y17, Z23, arrayList55, arrayList56, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList57 = new ArrayList();
            ArrayList arrayList58 = new ArrayList();
            ArrayList Y18 = e.a.a.a.a.Y(Z24, "APP_SUPER2ONCREATEEND_END", arrayList57, "APP_SUPER2ONCREATEEND_START");
            arrayList58.add("APP_SUPER2ONCREATEEND_START");
            Y18.add("nonmain");
            ArrayList Z25 = e.a.a.a.a.Z(map, "ImePraiseDialogInitializer", new com.bytedance.lego.init.model.f("ImePraiseDialogInitializer", false, true, 18.497513f, Y18, Z24, arrayList57, arrayList58, "com.bytedance.android.input.common_biz.init.task.ImePraiseDialogInitializer", initPeriod2));
            ArrayList arrayList59 = new ArrayList();
            ArrayList arrayList60 = new ArrayList();
            ArrayList Y19 = e.a.a.a.a.Y(Z25, "MAIN_SUPER2ONCREATEEND_END", arrayList59, "MAIN_ONCREATE2SUPER_END");
            arrayList60.add("MAIN_ONCREATE2SUPER_END");
            Y19.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z26 = e.a.a.a.a.Z(map, "MAIN_SUPER2ONCREATEEND_START", new com.bytedance.lego.init.model.f("MAIN_SUPER2ONCREATEEND_START", true, false, 6.4975123f, Y19, Z25, arrayList59, arrayList60, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList61 = new ArrayList();
            ArrayList arrayList62 = new ArrayList();
            ArrayList Y20 = e.a.a.a.a.Y(Z26, "MAIN_ONCREATE2SUPER_START", arrayList61, "SPLASH_SUPER2ONRESUMEEND_START");
            arrayList62.add("SPLASH_SUPER2ONRESUMEEND_START");
            Y20.add(PullConfiguration.PROCESS_NAME_MAIN);
            ArrayList Z27 = e.a.a.a.a.Z(map, "SPLASH_SUPER2ONRESUMEEND_END", new com.bytedance.lego.init.model.f("SPLASH_SUPER2ONRESUMEEND_END", true, false, 9.497513f, Y20, Z26, arrayList61, arrayList62, "init_shceduler_internal_task", initPeriod));
            ArrayList arrayList63 = new ArrayList();
            ArrayList arrayList64 = new ArrayList();
            ArrayList Y21 = e.a.a.a.a.Y(Z27, "SPLASH_SUPER2ONRESUMEEND_START", arrayList63, "SPLASH_ONRESUME2SUPER_START");
            arrayList64.add("SPLASH_ONRESUME2SUPER_START");
            Y21.add(PullConfiguration.PROCESS_NAME_MAIN);
            map.put("SPLASH_ONRESUME2SUPER_END", new com.bytedance.lego.init.model.f("SPLASH_ONRESUME2SUPER_END", true, false, 11.497513f, Y21, Z27, arrayList63, arrayList64, "init_shceduler_internal_task", initPeriod));
        }
        return map;
    }

    public static List<com.bytedance.lego.init.model.e> e() {
        if (i.isEmpty() && h.isEmpty()) {
            h.clear();
            i.clear();
        }
        return i;
    }

    public static List<com.bytedance.lego.init.model.e> f() {
        if (i.isEmpty() && h.isEmpty()) {
            h.clear();
            i.clear();
        }
        return h;
    }
}
