package com.bytedance.android.input.speech;

import com.bytedance.retrofit2.N;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONObject;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrGlobalContext$getContextToken$1", f = "AsrGlobalContext.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class w extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.h<? extends kotlin.o>>, Object> {
    final /* synthetic */ com.google.gson.l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(com.google.gson.l lVar, kotlin.r.d<? super w> dVar) {
        super(2, dVar);
        this.a = lVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new w(this.a, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.h<? extends kotlin.o>> dVar) {
        return new w(this.a, dVar).invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        Object J2;
        Object obj2;
        String str = "";
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        try {
            boolean z = true;
            N<String> execute = IRequests.a.e().request(this.a, true).execute();
            String a = execute.a();
            if (a == null) {
                a = null;
            }
            List<com.bytedance.retrofit2.client.b> e2 = execute.e();
            kotlin.s.c.l.e(e2, "response.headers()");
            Iterator<T> it2 = e2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (kotlin.text.a.i(((com.bytedance.retrofit2.client.b) obj2).a(), "x-tt-logid", true)) {
                    break;
                }
            }
            com.bytedance.retrofit2.client.b bVar = (com.bytedance.retrofit2.client.b) obj2;
            String b = bVar != null ? bVar.b() : null;
            com.bytedance.android.input.r.j.i("AsrGlobalContext", "getContextToken, response = " + a);
            com.bytedance.android.input.r.j.i("AsrGlobalContext", "getContextToken, response header = " + execute.e());
            com.bytedance.android.input.r.j.i("AsrGlobalContext", "getContextToken, x-tt-logid = " + b);
            if (!(a == null || a.length() == 0)) {
                try {
                    JSONObject jSONObject = new JSONObject(a).getJSONObject(RemoteMessageConst.DATA);
                    String string = jSONObject != null ? jSONObject.getString("sami_token") : null;
                    if (string != null) {
                        kotlin.s.c.l.e(string, "rootObj?.getJSONObject(\"…tring(\"sami_token\") ?: \"\"");
                        str = string;
                    }
                } catch (Exception e3) {
                    com.bytedance.android.input.r.j.j("AsrGlobalContext", "getContextToken, data error = " + e3);
                    try {
                        JSONObject jSONObject2 = new JSONObject(a).getJSONObject("Data");
                        String string2 = jSONObject2 != null ? jSONObject2.getString("sami_token") : null;
                        if (string2 != null) {
                            kotlin.s.c.l.e(string2, "rootObj?.getJSONObject(\"…tring(\"sami_token\") ?: \"\"");
                            str = string2;
                        }
                    } catch (Exception e4) {
                        com.bytedance.android.input.r.j.j("AsrGlobalContext", "getContextToken, Data error = " + e4);
                    }
                }
                if (str.length() != 0) {
                    z = false;
                }
                if (!z) {
                    x xVar = x.a;
                    x.f3197d = str;
                    x.f3198e = System.currentTimeMillis();
                    com.bytedance.android.input.r.j.i("AsrGlobalContext", "getContextToken, New token fetched and timestamp updated.");
                }
            }
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.v0("getContextToken, e = ", b2, "AsrGlobalContext");
        }
        return kotlin.h.a(J2);
    }
}
