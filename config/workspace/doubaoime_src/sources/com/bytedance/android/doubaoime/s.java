package com.bytedance.android.doubaoime;

import android.util.Log;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.llm.LLMRequest;
import com.bytedance.android.input.network.api.IRecommends;
import com.bytedance.retrofit2.N;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.S;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s implements Runnable {
    final /* synthetic */ ImeService a;

    @kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.ImeService$reportIP$1$run$1", f = "ImeService.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
        a(kotlin.r.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new a(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
            return new a(dVar).invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            IAppGlobals.a aVar = IAppGlobals.a;
            boolean z = com.bytedance.android.input.common.u.c.b(aVar.getContext()) == 0;
            if (aVar.F() && !z) {
                Log.i("ImeService", "obric not full input mode, skip run_report");
                return kotlin.o.a;
            }
            Log.i("ImeService", "run_report");
            String b = com.bytedance.android.input.common.u.d.b(aVar.getContext());
            if (b == null && (b = com.bytedance.android.input.common.u.d.a(aVar.getContext())) == null) {
                return kotlin.o.a;
            }
            e.a.a.a.a.r0("reportIP, ip = ", b, "ImeService");
            try {
                IRecommends.ReportIPApi n = IRecommends.a.n();
                kotlin.s.c.l.e(b, "ip");
                N<String> execute = n.request(b, false).execute();
                if (execute.f()) {
                    JSONObject jSONObject = new JSONObject(execute.a());
                    com.bytedance.android.input.r.j.i("ImeService", "reportIP, response body = " + execute.a());
                    if (jSONObject.getInt("code") == 0 && (optJSONObject = jSONObject.optJSONObject("msg")) != null) {
                        JSONArray optJSONArray = optJSONObject.optJSONArray("Subdivisions");
                        String optString = (optJSONArray == null || (optJSONObject2 = optJSONArray.optJSONObject(0)) == null) ? null : optJSONObject2.optString("Name");
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("City");
                        String optString2 = optJSONObject3 != null ? optJSONObject3.optString("Name") : null;
                        JSONObject optJSONObject4 = optJSONObject.optJSONObject("District");
                        String optString3 = optJSONObject4 != null ? optJSONObject4.optString("Name") : null;
                        String optString4 = optJSONObject.optString("ISP");
                        com.bytedance.android.input.r.j.i("ImeService", "reportIP, subdivisions = " + optString + ", city = " + optString2 + ", district = " + optString3 + ", isp = " + optString4);
                        IAppLog.a aVar2 = IAppLog.a;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ip", b);
                        jSONObject2.put("subdivisions", optString == null ? "" : optString);
                        jSONObject2.put("city", optString2 == null ? "" : optString2);
                        jSONObject2.put("district", optString3 == null ? "" : optString3);
                        StringBuilder sb = new StringBuilder();
                        sb.append(optString2 == null ? "" : optString2);
                        sb.append(optString3 == null ? "" : optString3);
                        jSONObject2.put("city_district", sb.toString());
                        jSONObject2.put("isp", optString4 == null ? "" : optString4);
                        aVar2.t("reportIP", jSONObject2);
                        LLMRequest.a.j(optString == null ? "" : optString, optString2 == null ? "" : optString2, optString3 == null ? "" : optString3, optString4 == null ? "" : optString4);
                        KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
                        if (optString == null) {
                            optString = "";
                        }
                        if (optString2 == null) {
                            optString2 = "";
                        }
                        if (optString3 == null) {
                            optString3 = "";
                        }
                        if (optString4 == null) {
                            optString4 = "";
                        }
                        keyboardJni.setIpInfo(optString, optString2, optString3, optString4);
                    }
                }
            } catch (Exception e2) {
                e.a.a.a.a.o0("reportIP, e = ", e2, "ImeService");
            }
            return kotlin.o.a;
        }
    }

    s(ImeService imeService) {
        this.a = imeService;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0795d.l(LifecycleOwnerKt.getLifecycleScope(this.a), S.b(), null, new a(null), 2, null);
        this.a.b.postDelayed(this, 10800000L);
    }
}
