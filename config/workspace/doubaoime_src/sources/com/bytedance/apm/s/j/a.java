package com.bytedance.apm.s.j;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.g;
import com.bytedance.apm.s.k.l;
import com.bytedance.apm.y.d;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private String a = "";
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.apm.battery.dao.c.a f3486c;

    /* renamed from: com.bytedance.apm.s.j.a$a, reason: collision with other inner class name */
    class RunnableC0123a implements Runnable {
        RunnableC0123a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.k();
            } catch (Throwable th) {
                com.bytedance.services.apm.api.a.e(th, "handleReportAndHandleCache");
            }
        }
    }

    private static class b {
        private static final a a = new a(null);
    }

    a(RunnableC0123a runnableC0123a) {
    }

    private boolean b(com.bytedance.apm.s.j.b bVar, List<com.bytedance.apm.w.a> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.apm.w.a aVar : list) {
            if (aVar.k()) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        try {
            boolean z = arrayList.isEmpty() || j(bVar, arrayList);
            if (!arrayList2.isEmpty()) {
                if (!j(bVar, arrayList2)) {
                    return false;
                }
            }
            return z;
        } catch (Exception e2) {
            com.bytedance.services.apm.api.a.e(e2, "divideByChargingStatusAndReport");
            return false;
        }
    }

    private boolean c(com.bytedance.apm.s.j.b bVar, List<com.bytedance.apm.w.a> list) {
        HashMap hashMap = new HashMap(4);
        for (com.bytedance.apm.w.a aVar : list) {
            String d2 = aVar.d();
            List list2 = (List) hashMap.get(d2);
            if (list2 != null) {
                list2.add(aVar);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(aVar);
                hashMap.put(d2, linkedList);
            }
        }
        try {
            Iterator it2 = hashMap.values().iterator();
            boolean z = true;
            while (it2.hasNext()) {
                if (!b(bVar, (List) it2.next())) {
                    z = false;
                }
            }
            return z;
        } catch (Exception e2) {
            com.bytedance.services.apm.api.a.e(e2, "divideBySceneAndReport");
            return false;
        }
    }

    private List<com.bytedance.apm.w.a> d(boolean z, long j) {
        List<com.bytedance.apm.w.a> d2;
        try {
            com.bytedance.apm.battery.dao.c.a e2 = e();
            synchronized (e2) {
                d2 = z ? e2.d("main_process = 1 AND delete_flag = 0", null, DBDefinition.ID, e2) : e2.d("main_process = 0 AND delete_flag = 0 AND timestamp <= ? ", new String[]{String.valueOf(j)}, DBDefinition.ID, e2);
            }
            return d2;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    private com.bytedance.apm.battery.dao.c.a e() {
        if (this.f3486c == null) {
            this.f3486c = com.bytedance.apm.battery.dao.c.a.g();
        }
        return this.f3486c;
    }

    public static a g() {
        return b.a;
    }

    private boolean j(com.bytedance.apm.s.j.b bVar, List<com.bytedance.apm.w.a> list) throws Exception {
        Map<String, l> A = com.bytedance.apm.s.a.B().A();
        StringBuilder sb = new StringBuilder();
        String str = null;
        for (com.bytedance.apm.w.a aVar : list) {
            if (str == null || !str.equals(aVar.f())) {
                str = aVar.f();
                sb.append(str);
            }
            if (!"ground_record".equals(aVar.f3611d)) {
                l lVar = A.get(aVar.f3611d);
                if (lVar != null) {
                    lVar.e(bVar, aVar);
                }
            } else if (aVar.i()) {
                bVar.m(aVar.a());
            } else {
                bVar.c(aVar.a());
            }
        }
        com.bytedance.apm.w.a aVar2 = list.get(0);
        bVar.x(aVar2.j());
        bVar.y(aVar2.c());
        bVar.A(sb.toString());
        bVar.z(aVar2.d());
        bVar.w(aVar2.k());
        StringBuilder M = e.a.a.a.a.M("Report Data proc:");
        M.append(aVar2.c());
        M.append(" scene:");
        M.append(aVar2.d());
        M.append(" size:");
        M.append(list.size());
        com.bytedance.apm.y.a.b("APM-Battery", M.toString());
        return bVar.u(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (g.F()) {
            com.bytedance.apm.s.j.b bVar = new com.bytedance.apm.s.j.b();
            List<com.bytedance.apm.w.a> d2 = d(true, 0L);
            if (com.bytedance.android.input.k.b.a.a0(d2)) {
                return;
            }
            boolean c2 = c(bVar, d2);
            bVar.t();
            com.bytedance.apm.w.a aVar = d2.get(d2.size() - 1);
            long b2 = aVar.b();
            long j = aVar.f3610c;
            if (!c2) {
                if (g.B()) {
                    d.g("<monitor><battery>", "report main process data failed, clean data and stop calc data of other process");
                }
                try {
                    e().i(b2);
                    return;
                } catch (Exception e2) {
                    com.bytedance.services.apm.api.a.e(e2, "cleanBatteryLog");
                    return;
                }
            }
            if (g.B()) {
                d.d("<monitor><battery>", "report main process data over, begin handle other process data");
            }
            List<com.bytedance.apm.w.a> d3 = d(false, j);
            HashMap hashMap = new HashMap(4);
            for (com.bytedance.apm.w.a aVar2 : d3) {
                String c3 = aVar2.c();
                List list = (List) hashMap.get(c3);
                if (list != null) {
                    list.add(aVar2);
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(aVar2);
                    hashMap.put(c3, linkedList);
                }
            }
            try {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    c(bVar, (List) it2.next());
                    bVar.t();
                }
            } catch (Exception e3) {
                com.bytedance.services.apm.api.a.e(e3, "reportLastTimeBattery");
            }
            bVar.v();
            try {
                e().i(b2);
            } catch (Exception e4) {
                com.bytedance.services.apm.api.a.e(e4, "cleanBatteryLog");
            }
            com.bytedance.apm.y.a.b("APM-Battery", "Report Data All Success");
        }
    }

    private String m(com.bytedance.apm.w.a aVar) throws JSONException {
        JSONObject t = aVar.t();
        if (TextUtils.equals(aVar.f3611d, "cpu_active_time")) {
            t.put("accumulation", (aVar.a() * 1000) / com.bytedance.apm.util.b.e(100L));
        } else if (TextUtils.equals(aVar.f3611d, "traffic")) {
            t.put("accumulation", aVar.a() / DownloadConstants.KB);
        } else {
            t.put("accumulation", aVar.a());
        }
        return t.toString();
    }

    public String f() {
        return this.a;
    }

    public void h(boolean z) {
        if (z) {
            com.bytedance.apm.F.b.e().h(new RunnableC0123a());
            return;
        }
        try {
            k();
        } catch (Throwable th) {
            com.bytedance.services.apm.api.a.e(th, "handleReportAndHandleCache");
        }
    }

    public void i(com.bytedance.apm.w.a aVar) {
        if (TextUtils.isEmpty(this.b)) {
            this.b = String.valueOf(System.currentTimeMillis());
        }
        aVar.n(g.F());
        aVar.o(g.i());
        aVar.q(this.b);
        String str = aVar.i() ? this.a : "background";
        if (!TextUtils.isEmpty(aVar.d())) {
            str = aVar.d() + "#" + str;
        }
        aVar.p(str);
        if (Build.VERSION.SDK_INT >= 34 && !aVar.i()) {
            aVar.r(false);
        }
        try {
            if (g.B()) {
                d.d("<monitor><battery>", "saveBatteryLog into db: " + aVar);
            }
            com.bytedance.apm.y.a.b("APM-BatteryLocal", m(aVar));
            e().h(aVar);
        } catch (Exception e2) {
            com.bytedance.services.apm.api.a.e(e2, "saveBatteryLog");
        }
    }

    public void l(String str) {
        this.a = str;
    }
}
