package com.bytedance.crash.L;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {
    private final ArrayList<a> a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final a f4437c;

    /* renamed from: d, reason: collision with root package name */
    private final File f4438d;

    /* renamed from: e, reason: collision with root package name */
    private final File f4439e;

    private static class a {
        private String a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private long f4440c;

        /* renamed from: d, reason: collision with root package name */
        private long f4441d;

        /* renamed from: e, reason: collision with root package name */
        private int f4442e;

        /* renamed from: f, reason: collision with root package name */
        private int f4443f;

        /* renamed from: g, reason: collision with root package name */
        private int f4444g;
        private boolean h;
        private boolean i;
        private final ArrayList<String> j;
        JSONArray k = null;
        HashMap<String, JSONArray> l;

        a(ArrayList<String> arrayList, HashMap<String, JSONArray> hashMap) {
            this.l = null;
            this.j = arrayList;
            this.l = hashMap;
        }

        static String a(a aVar) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = aVar.j.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append('\n');
            }
            return sb.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static boolean h(com.bytedance.crash.L.r.a r10) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.L.r.a.h(com.bytedance.crash.L.r$a):boolean");
        }

        long j() {
            return this.f4441d;
        }

        long k() {
            return this.f4440c;
        }

        boolean l() {
            return this.b.equals("TimedWaiting") || this.b.equals("Waiting") || this.b.equals("Blocked");
        }

        boolean m() {
            if (!this.b.equals("Native")) {
                return false;
            }
            for (int i = this.f4444g; i < this.j.size(); i++) {
                String str = this.j.get(i);
                if (str.startsWith("  at")) {
                    return str.contains("BinderProxy.transactNative");
                }
                if (str.startsWith("  native: #") && (str.contains("__futex_wait_ex") || str.startsWith("talkWithDriver"))) {
                    return true;
                }
            }
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:12:0x008e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:16:0x009d, B:18:0x00a3, B:21:0x00a9, B:24:0x00b1, B:27:0x00b9, B:30:0x00c2, B:31:0x00ca, B:33:0x00d0, B:35:0x00d8, B:37:0x00dc, B:40:0x00e7, B:43:0x00ef), top: B:15:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3 A[EDGE_INSN: B:57:0x00f3->B:58:0x00f3 BREAK  A[LOOP:1: B:15:0x009d->B:45:0x009d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    r(java.io.File r11, int r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.L.r.<init>(java.io.File, int):void");
    }

    static File c(File file) {
        return new File(file, "trace.txt");
    }

    String a() {
        a aVar = this.f4437c;
        if (aVar != null) {
            return a.a(aVar);
        }
        return null;
    }

    long b() {
        a aVar = this.f4437c;
        if (aVar != null) {
            return aVar.j();
        }
        return -1L;
    }

    long d() {
        a aVar = this.f4437c;
        if (aVar != null) {
            return aVar.k();
        }
        return -1L;
    }

    boolean e() {
        return this.f4437c != null;
    }

    boolean f() {
        a aVar = this.f4437c;
        return aVar != null && aVar.l();
    }

    boolean g() {
        a aVar = this.f4437c;
        return aVar != null && aVar.m();
    }

    boolean h() {
        a aVar = this.f4437c;
        return aVar != null && "WaitingPerformingGc".equals(aVar.b);
    }

    boolean i() {
        a aVar = this.f4437c;
        if (aVar != null && "WaitingForGcToComplete".equals(aVar.b)) {
            return true;
        }
        Iterator<a> it2 = this.a.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            a next = it2.next();
            if (next.h) {
                if ("WaitingForGcToComplete".equals(next.b)) {
                    i++;
                }
                i2++;
            }
        }
        return i >= 5 || i * 4 > i2;
    }

    void j(@NonNull JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        Iterator<a> it2 = this.a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 1; i < next.j.size(); i++) {
                try {
                    jSONArray2.put(next.j.get(i));
                } catch (JSONException unused) {
                }
            }
            jSONObject2.put(CrashHianalyticsData.THREAD_NAME, next.j.get(0));
            jSONObject2.put("thread_stack", jSONArray2);
            jSONArray.put(jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("thread_stacks", jSONArray);
            jSONObject3.put("thread_all_count", this.b);
        } catch (JSONException unused2) {
        }
        com.bytedance.android.input.k.b.a.y0(jSONObject, "all_thread_stacks", jSONObject3);
        a aVar = this.f4437c;
        long j = aVar != null ? aVar.j() : -1L;
        a aVar2 = this.f4437c;
        com.bytedance.android.input.k.b.a.y0(jSONObject, "main_thread_cpu_tick", Long.valueOf(j + (aVar2 != null ? aVar2.k() : -1L)));
        com.bytedance.crash.dumper.a.v(jSONObject, c(this.f4438d));
    }

    void k(@NonNull JSONObject jSONObject) {
        int i;
        boolean z;
        if (this.a.isEmpty()) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "anr_replace_mainstack", "OnlyJavaStack");
        }
        a aVar = this.f4437c;
        int i2 = 0;
        if (aVar != null) {
            z = aVar.i;
            i = this.f4437c.f4443f;
        } else {
            i = -10;
            z = false;
        }
        Iterator<a> it2 = this.a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if ("RenderThread".equals(next.a)) {
                com.bytedance.android.input.k.b.a.y0(jSONObject, "anr_renderthread_nice", Integer.valueOf(next.f4443f));
            } else if (next.f4443f < i && next.f4443f <= -16) {
                i2++;
            }
            z |= next.i;
        }
        com.bytedance.android.input.k.b.a.y0(jSONObject, "anr_backup_native_stack", Boolean.valueOf(z));
        com.bytedance.android.input.k.b.a.y0(jSONObject, "anr_subthread_count_nice<=-16", Integer.valueOf(i2));
        com.bytedance.android.input.k.b.a.y0(jSONObject, "npth_is_wait_for_gc", Boolean.valueOf(i()));
        File file = this.f4439e;
        if (file == null || !file.exists()) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "anr_dump_async", "false");
            return;
        }
        if (this.f4439e.length() > DownloadConstants.KB) {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "anr_dump_async", "success");
        } else {
            com.bytedance.android.input.k.b.a.y0(jSONObject, "anr_dump_async", "fail");
        }
        this.f4439e.delete();
    }
}
