package com.bytedance.apm.q.b;

import com.bytedance.apm.v.d.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: com.bytedance.apm.q.b.a$a, reason: collision with other inner class name */
    static class RunnableC0119a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f3469c;

        RunnableC0119a(String str, String str2, JSONObject jSONObject) {
            this.a = str;
            this.b = str2;
            this.f3469c = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm.data.pipeline.a.k().d(new e(this.a, this.b, this.f3469c, null));
        }
    }

    static class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f3470c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f3471d;

        b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            this.a = str;
            this.b = jSONObject;
            this.f3470c = jSONObject2;
            this.f3471d = jSONObject3;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.d(this.a, "", this.b, this.f3470c, this.f3471d));
        }
    }

    static class c implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ JSONObject b;

        c(JSONObject jSONObject, JSONObject jSONObject2) {
            this.a = jSONObject;
            this.b = jSONObject2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.d("start", "", this.a, null, this.b));
        }
    }

    static class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3472c;

        d(String str, long j, String str2) {
            this.a = str;
            this.b = j;
            this.f3472c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(this.a, this.b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("scene", this.f3472c);
                com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.d("page_load", "page_load", jSONObject, jSONObject2, null));
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        com.bytedance.apm.F.b.e().h(new b(str, jSONObject, jSONObject2, jSONObject3));
    }

    public static void b(JSONObject jSONObject, long j, long j2) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("begin_time", j);
            jSONObject2.put("end_time", j2);
            jSONObject2.put("from", "monitor-plugin");
            com.bytedance.apm.F.b.e().h(new c(jSONObject, jSONObject2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void c(String str, String str2, JSONObject jSONObject) {
        com.bytedance.apm.F.b.e().h(new RunnableC0119a(str, str2, jSONObject));
    }

    public static void d(String str, String str2, long j) {
        com.bytedance.apm.F.b.e().h(new d(str2, j, str));
    }
}
