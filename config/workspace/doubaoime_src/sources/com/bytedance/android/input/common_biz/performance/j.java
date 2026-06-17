package com.bytedance.android.input.common_biz.performance;

import android.os.Build;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common_biz.performance.api.PerformanceConfig;
import com.bytedance.android.input.common_biz.performance.model.CalculateType;
import com.prolificinteractive.materialcalendarview.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.o;
import kotlin.h;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    private static long f2257c;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f2260f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f2261g;
    private static String h;
    private static Integer i;
    private static long j;
    private static boolean k;
    private static boolean l;
    private static long m;
    private static long n;
    private static long o;
    private static long p;
    private static boolean s;
    private static boolean t;
    public static final j a = new j();
    private static final ConcurrentLinkedQueue<a> b = new ConcurrentLinkedQueue<>();

    /* renamed from: d, reason: collision with root package name */
    private static int f2258d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static String f2259e = "";
    private static final Choreographer.FrameCallback q = new Choreographer.FrameCallback() { // from class: com.bytedance.android.input.common_biz.performance.d
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j2) {
            j jVar = j.a;
            try {
                j.o("[android][ui] draw finish");
            } catch (Exception e2) {
                e.a.a.a.a.d0(e2, e.a.a.a.a.M("doFrame error:"), IAppGlobals.a, "RenderPathTrack");
            }
        }
    };
    private static boolean r = d.a.b.a.h(IAppGlobals.a);

    public static final class a {
        private final String a;
        private final long b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2262c;

        public a(String str, long j, String str2) {
            kotlin.s.c.l.f(str, "type");
            kotlin.s.c.l.f(str2, "message");
            this.a = str;
            this.b = j;
            this.f2262c = str2;
        }

        public final long a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.s.c.l.a(this.a, aVar.a) && this.b == aVar.b && kotlin.s.c.l.a(this.f2262c, aVar.f2262c);
        }

        public int hashCode() {
            return this.f2262c.hashCode() + ((Long.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("TrackEvent(type=");
            M.append(this.a);
            M.append(", timestamp=");
            M.append(this.b);
            M.append(", message=");
            return e.a.a.a.a.G(M, this.f2262c, ')');
        }
    }

    static final class b extends m implements kotlin.s.b.a<String> {
        final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.a = aVar;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("ACTION_SECOND_REFRESH_START firstRefreshCompleted:");
            M.append(j.f2260f);
            M.append(" secondRefreshCompleted:");
            M.append(j.f2261g);
            M.append(" secondRefreshStart:");
            a aVar = this.a;
            M.append(aVar != null ? Long.valueOf(aVar.a()) : null);
            return M.toString();
        }
    }

    static final class c extends m implements kotlin.s.b.a<String> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "ACTION_SECOND_REFRESH_START recordEvent";
        }
    }

    static final class d extends m implements kotlin.s.b.l<Map.Entry<String, Object>, CharSequence> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public CharSequence invoke(Map.Entry<String, Object> entry) {
            Map.Entry<String, Object> entry2 = entry;
            kotlin.s.c.l.f(entry2, "it");
            return entry2.getKey() + '=' + entry2.getValue();
        }
    }

    static {
        PerformanceConfig performanceConfig = PerformanceConfig.INSTANCE;
        s = performanceConfig.isEnablePrintLog();
        t = performanceConfig.isUploadDrawPathData();
    }

    private j() {
    }

    private final void c(CalculateType calculateType) {
        a aVar;
        Object obj;
        Object obj2;
        long j2;
        Long l2;
        a aVar2;
        long j3;
        long j4;
        if (f2257c == 0) {
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            d("key_click");
            a d2 = d("llm_request_start");
            a d3 = d("convert_start");
            a d4 = d("convert_finish");
            a d5 = d("cloud_request_start");
            a d6 = d("cloud_request_finish");
            a d7 = d("llm_request_finish");
            a d8 = d("first_refresh_start");
            a d9 = d("first_refresh_finish");
            a d10 = d("second_refresh_start");
            a d11 = d("second_refresh_finish");
            a d12 = d("action_down");
            a d13 = d("action_down_pointer");
            a d14 = d("action_up");
            a d15 = d("click_cand");
            a d16 = d("doing_flush_candidate");
            if (d12 != null) {
                if (d3 != null) {
                    try {
                        long a2 = d3.a() - d12.a();
                        if (a2 >= 0) {
                            aVar = d14;
                            linkedHashMap.put("down_to_convert_start", Long.valueOf(a2));
                        } else {
                            aVar = d14;
                            linkedHashMap.remove("down_to_convert_start");
                        }
                    } catch (Throwable th) {
                        th = th;
                        r.J(th);
                    }
                } else {
                    aVar = d14;
                }
                if (d2 != null) {
                    long a3 = d2.a() - d12.a();
                    if (a3 >= 0) {
                        linkedHashMap.put("down_to_llm_start", Long.valueOf(a3));
                    } else {
                        linkedHashMap.remove("down_to_llm_start");
                    }
                }
                if (d5 != null) {
                    long a4 = d5.a() - d12.a();
                    if (a4 >= 0) {
                        linkedHashMap.put("down_to_cloud_start", Long.valueOf(a4));
                    } else {
                        linkedHashMap.remove("down_to_cloud_start");
                    }
                }
            } else {
                aVar = d14;
            }
            if (d3 != null && d4 != null) {
                long a5 = d4.a() - d3.a();
                if (a5 >= 0) {
                    linkedHashMap.put("convert_time", Long.valueOf(a5));
                } else {
                    linkedHashMap.remove("convert_time");
                }
            }
            if (d2 != null && d7 != null) {
                long a6 = d7.a() - d2.a();
                if (a6 >= 0) {
                    linkedHashMap.put("llm_request_time", Long.valueOf(a6));
                } else {
                    linkedHashMap.remove("llm_request_time");
                }
            }
            if (d5 != null && d6 != null) {
                long a7 = d6.a() - d5.a();
                if (a7 >= 0) {
                    linkedHashMap.put("cloud_request_time", Long.valueOf(a7));
                } else {
                    linkedHashMap.remove("cloud_request_time");
                }
            }
            if (d8 != null && d9 != null) {
                long a8 = d9.a() - d8.a();
                if (a8 >= 0) {
                    linkedHashMap.put("first_refresh_time", Long.valueOf(a8));
                } else {
                    linkedHashMap.remove("first_refresh_time");
                }
            }
            if (d10 != null && d11 != null) {
                long a9 = d11.a() - d10.a();
                if (a9 >= 0) {
                    linkedHashMap.put("second_refresh_time", Long.valueOf(a9));
                } else {
                    linkedHashMap.remove("second_refresh_time");
                }
            }
            if (d9 != null && d10 != null) {
                long a10 = d10.a() - d9.a();
                if (0 <= a10 && a10 < 161) {
                    linkedHashMap.put("refresh_interval", Long.valueOf(a10));
                } else {
                    linkedHashMap.remove("refresh_interval");
                }
            }
            if (aVar != null) {
                if (d12 == null && d13 == null) {
                    obj = "down_to_llm_start";
                    obj2 = "convert_time";
                    aVar2 = d8;
                } else {
                    if (d12 != null) {
                        aVar2 = d8;
                        j3 = aVar.a() - d12.a();
                    } else {
                        aVar2 = d8;
                        j3 = -1;
                    }
                    if (d13 != null) {
                        obj = "down_to_llm_start";
                        obj2 = "convert_time";
                        j4 = aVar.a() - d13.a();
                    } else {
                        obj = "down_to_llm_start";
                        obj2 = "convert_time";
                        j4 = -1;
                    }
                    if (j3 != -1 || j4 != -1) {
                        long max = j3 * j4 <= 0 ? Math.max(j3, j4) : Math.min(j3, j4);
                        if (max > 0) {
                            linkedHashMap.put("down_to_up", Long.valueOf(max));
                        } else {
                            linkedHashMap.remove("down_to_up");
                        }
                    }
                }
                if (aVar2 != null) {
                    long a11 = aVar2.a() - aVar.a();
                    if (a11 >= 0) {
                        linkedHashMap.put("up_to_first_refresh_start", Long.valueOf(a11));
                    } else {
                        linkedHashMap.remove("up_to_first_refresh_start");
                    }
                }
                if (d10 != null) {
                    long a12 = d10.a() - aVar.a();
                    if (a12 >= 0) {
                        linkedHashMap.put("up_to_second_refresh_start", Long.valueOf(a12));
                    } else {
                        linkedHashMap.remove("up_to_second_refresh_start");
                    }
                }
            } else {
                obj = "down_to_llm_start";
                obj2 = "convert_time";
            }
            if (d15 == null || d16 == null) {
                j2 = 0;
            } else {
                long a13 = d16.a() - d15.a();
                j2 = 0;
                if (a13 >= 0) {
                    linkedHashMap.put("candidates_click_to_show", Long.valueOf(a13));
                } else {
                    linkedHashMap.remove("candidates_click_to_show");
                }
            }
            int ordinal = calculateType.ordinal();
            try {
                if (ordinal == 3) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Long l3 = (Long) linkedHashMap.get("down_to_time");
                    if (l3 != null) {
                        linkedHashMap2.put("down_to_time", Long.valueOf(l3.longValue()));
                    }
                    Long l4 = (Long) linkedHashMap.get("down_to_convert_start");
                    if (l4 != null) {
                        linkedHashMap2.put("down_to_convert_start", Long.valueOf(l4.longValue()));
                    }
                    Object obj3 = obj2;
                    Long l5 = (Long) linkedHashMap.get(obj3);
                    if (l5 != null) {
                        linkedHashMap2.put(obj3, Long.valueOf(l5.longValue()));
                    }
                    Long l6 = (Long) linkedHashMap.get("down_to_cloud_start");
                    if (l6 != null) {
                        linkedHashMap2.put("down_to_cloud_start", Long.valueOf(l6.longValue()));
                    }
                    Long l7 = (Long) linkedHashMap.get("cloud_request_time");
                    if (l7 != null) {
                        long longValue = l7.longValue();
                        linkedHashMap2.put("cloud_request_time", Long.valueOf(longValue));
                        linkedHashMap2.put("ime_cloud_request_time", Long.valueOf(longValue));
                    }
                    Long l8 = (Long) linkedHashMap.get("llm_request_time");
                    if (l8 != null) {
                        long longValue2 = l8.longValue();
                        linkedHashMap2.put("llm_request_time", Long.valueOf(longValue2));
                        linkedHashMap2.put("ime_llm_request_time", Long.valueOf(longValue2));
                    }
                    Object obj4 = obj;
                    Long l9 = (Long) linkedHashMap.get(obj4);
                    if (l9 != null) {
                        linkedHashMap2.put(obj4, Long.valueOf(l9.longValue()));
                    }
                    Long l10 = (Long) linkedHashMap.get(obj4);
                    if (l10 != null) {
                        linkedHashMap2.put(obj4, Long.valueOf(l10.longValue()));
                    }
                    Long l11 = (Long) linkedHashMap.get("up_to_first_refresh_start");
                    if (l11 != null) {
                        linkedHashMap2.put("up_to_first_refresh_start", Long.valueOf(l11.longValue()));
                    }
                    Long l12 = (Long) linkedHashMap.get("first_refresh_time");
                    if (l12 != null) {
                        linkedHashMap2.put("first_refresh_time", Long.valueOf(l12.longValue()));
                    }
                    if (!linkedHashMap2.isEmpty()) {
                        n(linkedHashMap2);
                    }
                } else if (ordinal == 4) {
                    IAppGlobals.a.j("RenderPathTrack", "ACTION_SECOND_REFRESH_FINISH");
                    Long l13 = (Long) linkedHashMap.get("up_to_second_refresh_start");
                    Long l14 = (Long) linkedHashMap.get("second_refresh_time");
                    Long l15 = (Long) linkedHashMap.get("refresh_interval");
                    Long l16 = (Long) linkedHashMap.get("cloud_request_time");
                    long longValue3 = l16 != null ? l16.longValue() : j2;
                    Long l17 = (Long) linkedHashMap.get("llm_request_time");
                    long longValue4 = l17 != null ? l17.longValue() : j2;
                    if (l13 != null && l14 != null && l15 != null) {
                        n(kotlin.collections.g.J(new kotlin.g("up_to_second_refresh_start", l13), new kotlin.g("second_refresh_time", l14), new kotlin.g("refresh_interval", l15), new kotlin.g("cloud_request_time_in_second_refresh", Long.valueOf(longValue3)), new kotlin.g("llm_request_time_in_second_refresh", Long.valueOf(longValue4)), new kotlin.g("ime_cloud_request_time", Long.valueOf(longValue3)), new kotlin.g("ime_llm_request_time", Long.valueOf(longValue4))));
                    }
                } else if (ordinal == 7 && (l2 = (Long) linkedHashMap.get("candidates_click_to_show")) != null) {
                    n(kotlin.collections.g.I(new kotlin.g("candidates_click_to_show", l2)));
                }
                if (d.a.b.a.h(IAppGlobals.a)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Perf_Data: ");
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        sb.append(((String) entry.getKey()) + '=' + ((Number) entry.getValue()).longValue() + ' ');
                    }
                    String sb2 = sb.toString();
                    kotlin.s.c.l.e(sb2, "StringBuilder().apply(builderAction).toString()");
                    Log.d("RenderPathTrack", sb2);
                }
            } catch (Throwable th2) {
                th = th2;
                r.J(th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final a d(String str) {
        Object obj;
        Iterator it2 = kotlin.collections.g.T(b).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (kotlin.s.c.l.a(((a) obj).b(), str)) {
                break;
            }
        }
        return (a) obj;
    }

    public static final float e() {
        Object J2;
        Display.Mode mode;
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            Display defaultDisplay = ((WindowManager) aVar.getApplication().getSystemService(WindowManager.class)).getDefaultDisplay();
            float refreshRate = defaultDisplay.getRefreshRate();
            try {
                Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
                kotlin.s.c.l.e(supportedModes, "modes");
                if (!(supportedModes.length == 0)) {
                    if (supportedModes.length == 0) {
                        mode = null;
                    } else {
                        mode = supportedModes[0];
                        int y = kotlin.collections.g.y(supportedModes);
                        if (y != 0) {
                            float refreshRate2 = mode.getRefreshRate();
                            o it2 = new kotlin.w.d(1, y).iterator();
                            while (((kotlin.w.c) it2).hasNext()) {
                                Display.Mode mode2 = supportedModes[it2.nextInt()];
                                float refreshRate3 = mode2.getRefreshRate();
                                if (Float.compare(refreshRate2, refreshRate3) < 0) {
                                    mode = mode2;
                                    refreshRate2 = refreshRate3;
                                }
                            }
                        }
                    }
                    if (mode != null) {
                        refreshRate = mode.getRefreshRate();
                    }
                }
            } catch (Exception unused) {
                IAppGlobals.a.e("RenderPathTrack", "getDeviceMaxRefreshRate - use default refresh rate");
            }
            J2 = Float.valueOf(refreshRate);
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Float f2 = (Float) (J2 instanceof h.a ? null : J2);
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    public static final float f() {
        Object J2;
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            J2 = Float.valueOf(((WindowManager) aVar.getApplication().getSystemService(WindowManager.class)).getDefaultDisplay().getRefreshRate());
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        if (J2 instanceof h.a) {
            J2 = null;
        }
        Float f2 = (Float) J2;
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    private final boolean g(long j2) {
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = b;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (a aVar : concurrentLinkedQueue) {
                if (kotlin.s.c.l.a(aVar.b(), "key_click") && aVar.a() > j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void h() {
        PerformanceConfig performanceConfig = PerformanceConfig.INSTANCE;
        s = performanceConfig.isEnablePrintLog();
        t = performanceConfig.isUploadDrawPathData();
    }

    public static void i(String str, long j2) {
        kotlin.s.c.l.f(str, "$msg");
        try {
            a.j(str, j2);
        } catch (Exception e2) {
            e.a.a.a.a.d0(e2, e.a.a.a.a.M("parseAndRecordEvent error:"), IAppGlobals.a, "RenderPathTrack");
        }
    }

    private final void j(String str, long j2) {
        String str2;
        if (kotlin.text.a.d(str, "[android][key] onTouchEvent ACTION_DOWN", false, 2, null)) {
            b.clear();
            l("action_down", j2, str);
            return;
        }
        if (kotlin.text.a.d(str, "[android][key] onTouchEvent ACTION_POINTER_DOWN", false, 2, null)) {
            IAppGlobals.a.j("RenderPathTrack", "ACTION_POINTER_DOWN");
            l("action_up", j2, str);
            c(CalculateType.DOWN_TO_UP);
            return;
        }
        if (kotlin.text.a.d(str, "[c++][key] type:", false, 2, null)) {
            Integer S = kotlin.text.a.S(kotlin.text.a.M(str, "[c++][key] type:", null, 2, null));
            int intValue = S != null ? S.intValue() : -1;
            f2258d = intValue;
            if (intValue != -1) {
                if (intValue == 0) {
                    str2 = "pinyin26";
                } else if (intValue == 1) {
                    str2 = "pinyin9";
                } else if (intValue == 2) {
                    str2 = "english26";
                } else if (intValue == 3) {
                    str2 = "double_spell";
                } else if (intValue == 4) {
                    str2 = "handwrite";
                }
                f2259e = str2;
                return;
            }
            str2 = "unknown";
            f2259e = str2;
            return;
        }
        if (kotlin.text.a.d(str, "[android][key] onTouchEvent ACTION_UP", false, 2, null)) {
            l("action_up", j2, str);
            j = j2;
            k = false;
            l = false;
            return;
        }
        if (kotlin.text.a.d(str, "[android][key] onTouchEvent ACTION_POINTER_UP", false, 2, null)) {
            IAppGlobals.a.j("RenderPathTrack", "ACTION_POINTER_UP");
            l("action_down_pointer", j2, str);
            return;
        }
        if (kotlin.text.a.d(str, "[c++][key] click code", false, 2, null)) {
            l("key_click", j2, str);
            f2257c = j2;
            c(CalculateType.DOWN_TO_KEY_CLICK);
            l("key_click", j2, str);
            f2260f = false;
            f2261g = false;
            return;
        }
        if (kotlin.text.a.d(str, "[c++][ui] click cand", false, 2, null)) {
            l("click_cand", j2, str);
            return;
        }
        if (kotlin.text.a.d(str, "[c++][ui] doing flush candidate", false, 2, null)) {
            l("doing_flush_candidate", j2, str);
            c(CalculateType.CANDIDATE_CLICK_TO_SHOW);
            return;
        }
        if (kotlin.text.a.d(str, "[android][key] clear onTouchEvent ACTION_UP", false, 2, null)) {
            j = 0L;
            k = false;
            l = false;
            return;
        }
        if (kotlin.text.a.d(str, "[c++][associate] CloudWordAssociation Prepare", false, 2, null)) {
            m = j2;
            return;
        }
        if (kotlin.text.a.d(str, "[c++][associate] CloudWordAssociation start", false, 2, null)) {
            n = j2;
            return;
        }
        if (kotlin.text.a.d(str, "[android][associate] CloudWordAssociation start", false, 2, null)) {
            o = j2;
            return;
        }
        if (kotlin.text.a.d(str, "[android][associate] CloudWordAssociation finish", false, 2, null)) {
            p = j2;
            return;
        }
        if (kotlin.text.a.d(str, "[c++][associate] CloudWordAssociation parse finish", false, 2, null)) {
            long j3 = m;
            if (1 <= j3 && j3 < j2) {
                long j4 = p;
                long j5 = j4 - o;
                if (j5 <= 0) {
                    j = 0L;
                    k = false;
                    l = false;
                } else if (j2 - j4 < 1000) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("associate_request_all_time", Long.valueOf(j2 - m));
                    linkedHashMap.put("associate_request_prepare_to_c_start_time", Long.valueOf(n - m));
                    linkedHashMap.put("associate_request_c_to_android_start_time", Long.valueOf(o - n));
                    linkedHashMap.put("associate_request_url_time", Long.valueOf(j5));
                    linkedHashMap.put("associate_request_url_to_parse_finish_time", Long.valueOf(j2 - p));
                    q(linkedHashMap, true);
                }
            }
            m = 0L;
            n = 0L;
            o = 0L;
            p = 0L;
            return;
        }
        if (kotlin.text.a.d(str, "[1][c++][associate] doing flush candidate", false, 2, null)) {
            long j6 = j;
            if ((1 <= j6 && j6 < j2) && j2 - j6 < 1000) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("up_to_associate_start", Long.valueOf(j2 - j));
                q(linkedHashMap2, false);
            }
            k = true;
            return;
        }
        if (kotlin.text.a.d(str, "[2][c++][associate] doing flush candidate", false, 2, null)) {
            long j7 = j;
            if ((1 <= j7 && j7 < j2) && j2 - j7 < 1000) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("up_to_associate_start_2nd", Long.valueOf(j2 - j));
                q(linkedHashMap3, false);
            }
            l = true;
            return;
        }
        if (kotlin.text.a.d(str, "[android][request][llm] real request LLM-start", false, 2, null)) {
            l("llm_request_start", j2, str);
            return;
        }
        if (kotlin.text.a.d(str, "[c++][request][convert] start", false, 2, null)) {
            l("convert_start", j2, str);
            return;
        }
        if (kotlin.text.a.d(str, "[c++][request][convert] finish", false, 2, null)) {
            l("convert_finish", j2, str);
            c(CalculateType.CONVERT_FINISH);
            return;
        }
        if (kotlin.text.a.d(str, "[android][request][cloud] start", false, 2, null)) {
            l("cloud_request_start", j2, str);
            return;
        }
        if (kotlin.text.a.d(str, "[android][request][llm] real request LLM-start", false, 2, null)) {
            l("llm_request_start", j2, str);
            return;
        }
        if (kotlin.text.a.d(str, "[android][request][llm] real request LLM-end", false, 2, null)) {
            l("llm_request_finish", j2, str);
            c(CalculateType.LLM_REQUEST_FINISH);
            return;
        }
        if (kotlin.text.a.d(str, "[android][request][cloud] finish", false, 2, null)) {
            l("cloud_request_finish", j2, str);
            c(CalculateType.CLOUD_REQUEST_FINISH);
            return;
        }
        if (kotlin.text.a.d(str, "[c++][ui] start first_refresh", false, 2, null)) {
            l("first_refresh_start", j2, str);
            return;
        }
        if (!kotlin.text.a.d(str, "[android][ui] draw finish", false, 2, null)) {
            if (kotlin.text.a.d(str, "[c++][ui] start second_refresh", false, 2, null)) {
                l("second_refresh_start", j2, str);
                return;
            }
            return;
        }
        a d2 = d("first_refresh_start");
        if (!f2260f && d2 != null && !g(d2.a())) {
            l("first_refresh_finish", j2, str);
            f2260f = true;
            c(CalculateType.FIRST_REFRESH_FINISH);
        }
        a d3 = d("second_refresh_start");
        com.bytedance.android.input.basic.a.e.a("RenderPathTrack", new b(d3));
        if (f2260f && !f2261g && d3 != null && !g(d3.a())) {
            com.bytedance.android.input.basic.a.e.a("RenderPathTrack", c.a);
            l("second_refresh_finish", j2, str);
            f2261g = true;
            c(CalculateType.SECOND_REFRESH_FINISH);
        }
        if (k) {
            k = false;
            long j8 = j;
            if ((1 <= j8 && j8 < j2) && j2 - j8 < 1000) {
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("up_to_associate_finish", Long.valueOf(j2 - j));
                q(linkedHashMap4, false);
            }
        }
        if (l) {
            l = false;
            long j9 = j;
            if ((1 <= j9 && j9 < j2) && j2 - j9 < 1000) {
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("up_to_associate_finish_2nd", Long.valueOf(j2 - j));
                q(linkedHashMap5, false);
            }
            j = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:2:0x0000, B:7:0x000a, B:11:0x0033, B:15:0x0024, B:19:0x0029), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k() {
        /*
            com.bytedance.android.input.common_biz.performance.api.PerformanceConfig r0 = com.bytedance.android.input.common_biz.performance.api.PerformanceConfig.INSTANCE     // Catch: java.lang.Throwable -> L74
            boolean r1 = r0.isUploadRefreshRate()     // Catch: java.lang.Throwable -> L74
            if (r1 != 0) goto La
            goto L78
        La:
            float r1 = f()     // Catch: java.lang.Throwable -> L74
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L74
            float r2 = e()     // Catch: java.lang.Throwable -> L74
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = com.bytedance.android.input.basic.d.b.a()     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = com.bytedance.android.input.common_biz.performance.j.h     // Catch: java.lang.Throwable -> L74
            boolean r4 = kotlin.s.c.l.a(r4, r3)     // Catch: java.lang.Throwable -> L74
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L24
        L22:
            r4 = r6
            goto L31
        L24:
            java.lang.Integer r4 = com.bytedance.android.input.common_biz.performance.j.i     // Catch: java.lang.Throwable -> L74
            if (r4 != 0) goto L29
            goto L2f
        L29:
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L74
            if (r4 == r1) goto L30
        L2f:
            goto L22
        L30:
            r4 = r5
        L31:
            if (r4 == 0) goto L78
            java.lang.String r4 = "ime_perf_refresh_rate"
            r7 = 3
            kotlin.g[] r7 = new kotlin.g[r7]     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = "refresh_rate"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L74
            kotlin.g r10 = new kotlin.g     // Catch: java.lang.Throwable -> L74
            r10.<init>(r8, r9)     // Catch: java.lang.Throwable -> L74
            r7[r5] = r10     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "max_refresh_rate"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L74
            kotlin.g r8 = new kotlin.g     // Catch: java.lang.Throwable -> L74
            r8.<init>(r5, r2)     // Catch: java.lang.Throwable -> L74
            r7[r6] = r8     // Catch: java.lang.Throwable -> L74
            r2 = 2
            java.lang.String r5 = "first_refresh_level"
            int r6 = r0.getFirstRefreshLevel()     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L74
            kotlin.g r8 = new kotlin.g     // Catch: java.lang.Throwable -> L74
            r8.<init>(r5, r6)     // Catch: java.lang.Throwable -> L74
            r7[r2] = r8     // Catch: java.lang.Throwable -> L74
            java.util.Map r2 = kotlin.collections.g.J(r7)     // Catch: java.lang.Throwable -> L74
            r0.trace(r4, r2)     // Catch: java.lang.Throwable -> L74
            com.bytedance.android.input.common_biz.performance.j.h = r3     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L74
            com.bytedance.android.input.common_biz.performance.j.i = r0     // Catch: java.lang.Throwable -> L74
            goto L78
        L74:
            r0 = move-exception
            com.prolificinteractive.materialcalendarview.r.J(r0)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common_biz.performance.j.k():void");
    }

    private final void l(String str, long j2, String str2) {
        a aVar = new a(str, j2, str2);
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = b;
        concurrentLinkedQueue.offer(aVar);
        if (concurrentLinkedQueue.size() > 50) {
            concurrentLinkedQueue.poll();
        }
    }

    private final void m(long j2, String str) {
        if (r && s) {
            String str2 = "[time:" + j2 + "]" + str;
            kotlin.s.c.l.e(str2, "StringBuilder().apply(builderAction).toString()");
            Log.d("RenderPathTrack", str2);
        }
    }

    private final void n(Map map) {
        PerformanceConfig performanceConfig = PerformanceConfig.INSTANCE;
        if (performanceConfig.isNoFreqRender()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.put("keyboard_type", Integer.valueOf(f2258d));
            linkedHashMap.put("keyboard_type_name", f2259e);
            linkedHashMap.put("first_refresh_level", Integer.valueOf(performanceConfig.getFirstRefreshLevel()));
            String str = Build.MODEL;
            kotlin.s.c.l.e(str, "MODEL");
            linkedHashMap.put("ime_device_type", str);
            String str2 = Build.BRAND;
            kotlin.s.c.l.e(str2, "BRAND");
            linkedHashMap.put("ime_device_brand", str2);
            performanceConfig.trace("ime_perf_path", linkedHashMap);
        }
    }

    public static final void o(final String str) {
        kotlin.s.c.l.f(str, "msg");
        try {
            int i2 = com.bytedance.android.input.basic.d.b.b;
            final long currentTimeMillis = System.currentTimeMillis();
            a.m(currentTimeMillis, str);
            if (t) {
                com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.common_biz.performance.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.i(str, currentTimeMillis);
                    }
                });
            }
        } catch (Exception e2) {
            e.a.a.a.a.d0(e2, e.a.a.a.a.M("trackLog error:"), IAppGlobals.a, "RenderPathTrack");
        }
    }

    public static final void p(String str) {
        kotlin.s.c.l.f(str, "msg");
        try {
            if (t && (kotlin.text.a.d(str, "[c++][ui] doing flush candidate", false, 2, null) || kotlin.text.a.d(str, "[c++][associate] doing flush candidate", false, 2, null))) {
                Choreographer.getInstance().postFrameCallback(q);
            }
            o(str);
        } catch (Exception e2) {
            e.a.a.a.a.d0(e2, e.a.a.a.a.M("trackLog error:"), IAppGlobals.a, "RenderPathTrack");
        }
    }

    private final void q(Map<String, Object> map, boolean z) {
        if (!map.isEmpty()) {
            if (z) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(map);
                linkedHashMap.put("keyboard_type", Integer.valueOf(f2258d));
                linkedHashMap.put("keyboard_type_name", f2259e);
                PerformanceConfig performanceConfig = PerformanceConfig.INSTANCE;
                linkedHashMap.put("associate_time_out", Integer.valueOf(performanceConfig.getAssociationFirstRefresh()));
                String str = Build.MODEL;
                kotlin.s.c.l.e(str, "MODEL");
                linkedHashMap.put("ime_device_type", str);
                String str2 = Build.BRAND;
                kotlin.s.c.l.e(str2, "BRAND");
                linkedHashMap.put("ime_device_brand", str2);
                performanceConfig.trace("ime_perf_associate_path", linkedHashMap);
            }
            if (r && s) {
                Log.d("RenderPathTrack", "Perf_Associate_Data: " + kotlin.collections.g.C(map.entrySet(), " ", null, null, 0, null, d.a, 30, null));
            }
        }
    }
}
