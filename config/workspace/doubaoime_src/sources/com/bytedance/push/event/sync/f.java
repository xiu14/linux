package com.bytedance.push.event.sync;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.alliance.IAllianceService;
import com.bytedance.common.utility.e;
import com.bytedance.push.C;
import com.bytedance.push.event.sync.d;
import com.bytedance.push.settings.LocalSettings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends com.bytedance.common.push.c implements d {

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d.a f5665c;

        a(String str, JSONObject jSONObject, d.a aVar) {
            this.a = str;
            this.b = jSONObject;
            this.f5665c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            String str = this.a;
            JSONObject jSONObject = this.b;
            Objects.requireNonNull(fVar);
            com.bytedance.push.g0.f.c("SignalReporterImpl", "[reporterSignalByHttp]signalData:" + jSONObject);
            boolean z = false;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.bytedance.push.g0.f.e("SignalReporterImpl", "[reporterSignalByHttp]don't invoke cur method in main thread! ");
            } else if (jSONObject == null) {
                com.bytedance.push.g0.f.e("SignalReporterImpl", "[reporterSignalByHttp]events is empty,not request! ");
            } else {
                Map<String, String> a = ((com.bytedance.common.g.b.a) com.bytedance.common.g.a.c().d()).a(null);
                Set<Integer> set = com.ss.android.g.d.a;
                String a2 = com.ss.android.g.a.a("/cloudpush/event_sync/");
                e.a aVar = new e.a();
                aVar.a = false;
                String c2 = com.ss.android.message.f.a.c(a2, a);
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair("event_version", String.valueOf(1)));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            arrayList.add(new Pair(next, jSONObject.get(next).toString()));
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    fVar.add(jSONObject2, "signal_name", str);
                    String h = com.bytedance.common.g.b.c.f().h(c2, arrayList, com.ss.android.message.f.a.a(null), aVar, jSONObject2);
                    if (TextUtils.isEmpty(h)) {
                        com.bytedance.push.g0.f.e("SignalReporterImpl", "[reporterSignalByHttp]request failed because server return empty");
                    } else {
                        JSONObject jSONObject3 = new JSONObject(h);
                        if (TextUtils.equals("success", jSONObject3.optString("message"))) {
                            if (TextUtils.equals(str, "hw_screen_status")) {
                                boolean optBoolean = jSONObject3.optBoolean("server_disable_aw_barrier", false);
                                com.ss.android.pushmanager.setting.c.c().e().l(optBoolean);
                                if (optBoolean) {
                                    ((C) C.a()).t().onHwScreenConfigDisable();
                                }
                            }
                            com.bytedance.push.g0.f.c("SignalReporterImpl", "[reporterSignalByHttp]request success");
                            z = true;
                        } else {
                            com.bytedance.push.g0.f.e("SignalReporterImpl", "[reporterSignalByHttp]request failed because server response is not success");
                        }
                    }
                } catch (Throwable th2) {
                    com.bytedance.push.g0.f.e("SignalReporterImpl", String.format("[reporterSignalByHttp]request failed,errorCode: %s errorMsg: %s", Integer.valueOf(th2 instanceof com.bytedance.common.utility.a ? th2.a() : -100), th2.getMessage()));
                }
            }
            f fVar2 = f.this;
            d.a aVar2 = this.f5665c;
            Objects.requireNonNull(fVar2);
            if (aVar2 != null) {
                aVar2.a(z, "reporterSignalByHttp");
            }
        }
    }

    public void n(com.bytedance.push.settings.A.a.b bVar, String str, String str2, JSONObject jSONObject) {
        o(bVar, str, str2, jSONObject, null);
    }

    public void o(com.bytedance.push.settings.A.a.b bVar, String str, String str2, JSONObject jSONObject, d.a aVar) {
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        ConcurrentHashMap<String, WeakReference<b>> businessExtraInfoProviderMap = ((C) C.a()).t().getBusinessExtraInfoProviderMap();
        com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]signalName:" + str + " signalInfo:" + jSONObject2);
        IAllianceService iAllianceService = PushServiceManager.get().getIAllianceService();
        StringBuilder sb = new StringBuilder();
        sb.append("signal$");
        sb.append(str);
        iAllianceService.startClientAccountRetryTask(sb.toString());
        JSONObject jSONObject3 = new JSONObject();
        if (businessExtraInfoProviderMap != null) {
            StringBuilder M = e.a.a.a.a.M("[reportSignal]businessExtraInfoProviderMap size is ");
            M.append(businessExtraInfoProviderMap.size());
            com.bytedance.push.g0.f.c("SignalReporterImpl", M.toString());
            for (String str3 : businessExtraInfoProviderMap.keySet()) {
                WeakReference<b> weakReference = businessExtraInfoProviderMap.get(str3);
                if (weakReference != null) {
                    b bVar2 = weakReference.get();
                    if (bVar2 != null) {
                        String a2 = bVar2.a(str);
                        com.bytedance.push.g0.f.m("SignalReporterImpl", "[reportSignal]extraInfoString for " + str3 + " is " + a2);
                        if (!TextUtils.isEmpty(a2)) {
                            add(jSONObject3, str3, a2);
                        }
                    } else {
                        com.bytedance.push.g0.f.m("SignalReporterImpl", "[reportSignal]iBusinessExtraInfoProvider for " + str3 + " is null");
                    }
                }
            }
        } else {
            com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]businessExtraInfoProviderMap is null");
        }
        try {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("extra_string");
            Iterator<String> keys = jSONObject4.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                add(jSONObject3, next, jSONObject4.get(next).toString());
            }
        } catch (JSONException e2) {
            com.bytedance.push.g0.f.e("SignalReporterImpl", String.valueOf(e2));
            e2.printStackTrace();
        }
        add(jSONObject2, "extra_string", jSONObject3.toString());
        if (bVar.f5796c > 0) {
            StringBuilder M2 = e.a.a.a.a.M("[reportSignal]need frequency control because signalReportInterval is ");
            M2.append(bVar.f5796c);
            com.bytedance.push.g0.f.c("SignalReporterImpl", M2.toString());
            LocalSettings e3 = com.ss.android.pushmanager.setting.c.c().e();
            com.bytedance.push.settings.A.a.c X = e3.X();
            if (X == null) {
                com.bytedance.push.g0.f.m("SignalReporterImpl", "[reportSignal]signalReportHistory is null");
                X = new com.bytedance.push.settings.A.a.c();
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                Map<String, com.bytedance.push.settings.A.a.a> map = X.a;
                if (map != null) {
                    com.bytedance.push.settings.A.a.a aVar2 = map.get(str);
                    if (aVar2 != null) {
                        com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]itemSignalReportHistory:" + com.bytedance.push.g0.d.b(aVar2));
                        long j = currentTimeMillis - aVar2.b;
                        boolean equals = TextUtils.equals(jSONObject2.toString(), aVar2.a);
                        boolean z = j < bVar.f5796c;
                        com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]dataIsSame:" + equals + " timeFrequencyControl:" + z);
                        if (equals && z) {
                            com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]not report because frequency control");
                            if (aVar != null) {
                                aVar.a(false, "frequency control");
                            }
                            return;
                        }
                    } else {
                        com.bytedance.push.g0.f.m("SignalReporterImpl", "[reportSignal]itemSignalReportHistory is null");
                    }
                } else {
                    com.bytedance.push.g0.f.m("SignalReporterImpl", "[reportSignal]signalReportHistory.history is null");
                }
                com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]not frequency control,write cur data to cache");
                if (X.a == null) {
                    X.a = new HashMap();
                }
                X.a.put(str, new com.bytedance.push.settings.A.a.a(jSONObject2.toString(), currentTimeMillis));
                e3.o0(X);
            }
        } else {
            com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]needn't frequency control because signalReportInterval is 0");
        }
        add(jSONObject2, "client_time", System.currentTimeMillis());
        add(jSONObject2, "trigger_scene", str2);
        JSONObject jSONObject5 = new JSONObject();
        add(jSONObject5, "signal_name", str);
        add(jSONObject5, "extra_info", jSONObject2);
        com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]final_signal_data:" + jSONObject5);
        if ((bVar.b & 2) == 2) {
            com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]report signal by applog");
            ((C) C.a()).j().onEventV3("bdpush_client_signal", jSONObject5);
        }
        if ((bVar.b & 1) == 1) {
            com.bytedance.push.g0.f.c("SignalReporterImpl", "[reportSignal]report signal by http");
            com.ss.android.message.e.e().f(new a(str, jSONObject5, aVar), 0L);
        }
    }
}
