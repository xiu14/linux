package com.bytedance.applog.monitor.v3;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.applog.monitor.v3.h.b;
import com.bytedance.applog.w.k;
import com.bytedance.bdinstall.G;
import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
class d implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G f3827c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f3828d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f3829e;

    d(e eVar, int i, long j, G g2, String str) {
        this.f3829e = eVar;
        this.a = i;
        this.b = j;
        this.f3827c = g2;
        this.f3828d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> list;
        List<String> list2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONArray jSONArray;
        com.bytedance.applog.monitor.v3.h.b bVar;
        Pair<Map<String, b.a>, Long> c2;
        com.bytedance.applog.monitor.v3.h.c cVar;
        Pair<Map<String, Integer>, Long> b;
        com.bytedance.applog.monitor.v3.h.a aVar;
        Pair<Map<String, JSONObject>, Long> a;
        List<String> list3;
        List<String> list4;
        com.bytedance.applog.monitor.v3.h.b bVar2;
        com.bytedance.applog.monitor.v3.h.c cVar2;
        com.bytedance.applog.monitor.v3.h.a aVar2;
        List<String> list5;
        com.bytedance.applog.monitor.v3.h.a aVar3;
        com.bytedance.applog.monitor.v3.h.c cVar3;
        com.bytedance.applog.monitor.v3.h.b bVar3;
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            if (i >= 2) {
                com.bytedance.applog.w.e z = k.z();
                list = e.j;
                z.j(8, list, "report failed and break with try 2 times: {}.", new Object[0]);
                return;
            }
            try {
                Thread.sleep(WsConstants.EXIT_DELAY_TIME);
            } catch (InterruptedException unused) {
            }
            long j = this.b;
            try {
                jSONObject = new JSONObject();
                jSONObject2 = this.f3829e.f3832e;
                jSONObject3 = this.f3829e.i;
                jSONObject2.put("feature_options", jSONObject3);
                jSONObject4 = this.f3829e.f3832e;
                jSONObject.put("header", jSONObject4);
                jSONArray = new JSONArray();
                bVar = this.f3829e.f3830c;
                c2 = bVar.c(j);
                if (c2.first != null) {
                    bVar3 = this.f3829e.f3830c;
                    bVar3.b((Map) c2.first, jSONArray);
                    j = ((Long) c2.second).longValue();
                }
                cVar = this.f3829e.f3831d;
                b = cVar.b(j);
                if (b.first != null) {
                    cVar3 = this.f3829e.f3831d;
                    cVar3.a((Map) b.first, jSONArray);
                    j = ((Long) b.second).longValue();
                }
                aVar = this.f3829e.b;
                a = aVar.a(j);
                if (a.first != null) {
                    aVar3 = this.f3829e.b;
                    Map map = (Map) a.first;
                    Objects.requireNonNull(aVar3);
                    Iterator it2 = map.values().iterator();
                    while (it2.hasNext()) {
                        jSONArray.put((JSONObject) it2.next());
                    }
                    j = ((Long) a.second).longValue();
                }
            } catch (Throwable th) {
                com.bytedance.applog.w.e z2 = k.z();
                list2 = e.j;
                z2.q(8, list2, "report to server failed!", th, new Object[0]);
            }
            if (jSONArray.length() == 0) {
                com.bytedance.applog.w.e z3 = k.z();
                list5 = e.j;
                z3.j(8, list5, "report break for no any event!", new Object[0]);
                return;
            }
            jSONObject.put(PushLog.EVENT_V3_CATEGORY, jSONArray);
            byte[] k = com.bytedance.android.input.k.b.a.k(jSONObject.toString().getBytes("UTF-8"));
            HashMap hashMap = new HashMap();
            hashMap.put("log-encode-type", DownloadHelper.GZIP);
            hashMap.put(DownloadHelper.CONTENT_ENCODING, DownloadHelper.GZIP);
            hashMap.put(DownloadHelper.CONTENT_TYPE, "application/octet-stream;tt-data=b");
            String a2 = this.f3827c.a(this.f3828d, k, hashMap);
            com.bytedance.applog.w.e z4 = k.z();
            list3 = e.j;
            z4.j(8, list3, "report with left body size left: {} and response: {}.", Long.valueOf(j), a2);
            if (!TextUtils.isEmpty(a2) && "success".equals(new JSONObject(a2).getString("message"))) {
                com.bytedance.applog.w.e z5 = k.z();
                list4 = e.j;
                z5.m(8, list4, "report to server success!", new Object[0]);
                bVar2 = this.f3829e.f3830c;
                bVar2.i((Map) c2.first);
                cVar2 = this.f3829e.f3831d;
                cVar2.g((Map) b.first);
                aVar2 = this.f3829e.b;
                Objects.requireNonNull(aVar2);
                if (j > 0) {
                    return;
                }
            }
            i++;
        }
    }
}
