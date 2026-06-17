package com.bytedance.android.input.ttnet;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.r.j;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.dispatcher.f;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    private static final String a = "e";
    private static final f.b<com.bytedance.ttnet.i.b> b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final f.h<com.bytedance.ttnet.i.b> f3208c = new b();

    class a implements f.b<com.bytedance.ttnet.i.b> {
        a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.f.b
        public String a(String str, boolean z, Object... objArr) {
            return str;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.f.b
        public String b(String str, boolean z) {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Objects.requireNonNull(aVar2);
            return aVar.m(aVar2.getApplication(), str, z);
        }
    }

    class b implements f.h<com.bytedance.ttnet.i.b> {
        b() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.f.h
        public void a(long j, long j2, String str, String str2, com.bytedance.ttnet.i.b bVar) {
            com.bytedance.ttnet.i.b bVar2 = bVar;
            try {
                String[] strArr = new String[1];
                JSONObject jSONObject = new JSONObject();
                if (com.bytedance.android.input.k.b.a.Y(strArr[0])) {
                    strArr[0] = bVar2.s;
                }
                e.a(bVar2, jSONObject);
                j.m("monitorApiOk", " logId = " + str2 + " \nsendtime = " + j2 + " \nduration = " + j + " \nremoteip = " + strArr[0] + " \nstatus = 200 \njson = " + jSONObject);
                StringBuilder sb = new StringBuilder();
                sb.append("url = ");
                sb.append(str);
                j.i("monitorApiOk", sb.toString());
                com.bytedance.apm.c.i(j, j2, str, strArr[0], str2, 200, jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // com.bytedance.frameworks.baselib.network.http.f.h
        public void b(long j, long j2, String str, String str2, com.bytedance.ttnet.i.b bVar, Throwable th) {
            com.bytedance.ttnet.i.b bVar2 = bVar;
            try {
                String[] strArr = new String[1];
                int a = com.bytedance.android.input.k.b.a.a(th, strArr);
                JSONObject jSONObject = new JSONObject();
                if (!com.bytedance.android.input.k.b.a.Y(th.getClass().getName())) {
                    jSONObject.put("ex_name", th.getClass().getName());
                    if ((a == 1 && ApmDelegate.i().j("ex_message_open")) || ApmDelegate.i().j("debug_ex_message_open")) {
                        String b = com.bytedance.ttnet.utils.d.b(th);
                        if (!com.bytedance.android.input.k.b.a.Y(b)) {
                            jSONObject.put("ex_message", b);
                        }
                        String a2 = com.bytedance.ttnet.c.a();
                        if (!com.bytedance.android.input.k.b.a.Y(a2)) {
                            jSONObject.put("cronet_init_ex_message", a2);
                        }
                    }
                }
                if (com.bytedance.android.input.k.b.a.Y(strArr[0])) {
                    strArr[0] = bVar2.s;
                }
                e.a(bVar2, jSONObject);
                com.bytedance.apm.c.c(j, j2, str, strArr[0], str2, a, jSONObject);
                com.bytedance.apm.c.i(j, j2, str, strArr[0], str2, a, jSONObject);
                j.m("monitorApiError", " logId = " + str2 + " \nsendtime = " + j2 + " \nduration = " + j + " \nremoteip = " + strArr[0] + " \nstatus = " + a + " \njson = " + jSONObject);
                StringBuilder sb = new StringBuilder();
                sb.append("url = ");
                sb.append(str);
                j.i("monitorApiError", sb.toString());
            } catch (Throwable unused) {
            }
        }
    }

    static void a(com.bytedance.ttnet.i.b bVar, JSONObject jSONObject) {
        if (bVar != null) {
            try {
                Objects.requireNonNull(TTNetInit.getTTNetDepend());
                jSONObject.put("cronet_plugin_install", true);
                jSONObject.put("appLevelRequestStart", bVar.f5084e);
                jSONObject.put("beforeAllInterceptors", bVar.f5085f);
                jSONObject.put("requestStart", bVar.f5086g);
                jSONObject.put("responseBack", bVar.h);
                jSONObject.put("completeReadResponse", bVar.i);
                jSONObject.put("requestEnd", bVar.j);
                jSONObject.put("recycleCount", bVar.v);
                if (bVar.x == 0) {
                    jSONObject.put("timing_dns", bVar.k);
                    jSONObject.put("timing_connect", bVar.l);
                    jSONObject.put("timing_ssl", bVar.m);
                    jSONObject.put("timing_send", bVar.n);
                    jSONObject.put("timing_waiting", bVar.o);
                    jSONObject.put("timing_receive", bVar.p);
                    jSONObject.put("timing_total", bVar.q);
                    jSONObject.put("timing_isSocketReused", bVar.w);
                    jSONObject.put("timing_totalSendBytes", bVar.t);
                    jSONObject.put("timing_totalReceivedBytes", bVar.u);
                    jSONObject.put("timing_remoteIP", bVar.s);
                    jSONObject.put(MonitorConstants.REQUEST_LOG, bVar.A);
                }
                JSONObject jSONObject2 = bVar.B;
                if (jSONObject2 != null) {
                    jSONObject.put("req_info", jSONObject2);
                }
                jSONObject.put("streaming", bVar.C);
            } catch (JSONException e2) {
                Logger.w(a, "[packageRequestParamters] json op error. ", e2);
            }
        }
    }

    public static void b(Context context, Application application, int i) {
        try {
            String str = a;
            Log.i(str, "initTTNet APP_SECURITY_LEVEL: " + i);
            TTNetInit.setAppSecurityLevel(i);
            com.bytedance.android.input.ttnet.a aVar = com.bytedance.android.input.ttnet.a.a;
            org.chromium.e.a().setAdapter(com.bytedance.android.input.ttnet.a.a);
            org.chromium.d.U().x0(com.bytedance.android.input.ttnet.a.a);
            j.m(str, "initTTNet 0");
            TTNetInit.setTTNetDepend(new d(context));
            j.m(str, "initTTNet 1");
            TTNetInit.setCronetDepend(com.bytedance.android.input.ttnet.a.a);
            f.b bVar = new f.b();
            bVar.j(10L);
            bVar.k(10, 10);
            bVar.m(10, 10);
            bVar.l(10L);
            com.bytedance.frameworks.baselib.network.dispatcher.e.f(bVar.i());
            TTNetInit.tryInitTTNet(context, application, b, f3208c, null, true, false);
            j.m(str, "initTTNet 2");
            TTNetInit.preInitCronetKernel();
            j.m(str, "initTTNet 3");
            TTNetInit.setEnv(TTNetInit.ENV.DEBUG);
            String valueOf = String.valueOf(true);
            SharedPreferences.Editor edit = context.getSharedPreferences("ttnet_debug_setting", 0).edit();
            edit.putString("x86_support", valueOf);
            edit.apply();
            j.m(str, "initTTNet 4");
            RetrofitUtils.a(new com.bytedance.android.input.ttnet.g.c());
            RetrofitUtils.a(new com.bytedance.android.input.ttnet.g.a());
            RetrofitUtils.a(new com.bytedance.android.input.ttnet.g.b());
            com.bytedance.common.utility.e.e(new c());
            j.m(str, "initTTNet 5");
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Objects.requireNonNull(aVar2);
            if (!aVar2.h() && aVar2.F()) {
                throw null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
