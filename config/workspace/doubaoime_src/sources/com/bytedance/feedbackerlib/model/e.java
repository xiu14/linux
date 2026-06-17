package com.bytedance.feedbackerlib.model;

import android.text.TextUtils;
import com.bytedance.feedbackerlib.model.b;
import com.bytedance.feedbackerlib.util.d;
import com.bytedance.feedbackerlib.util.k;
import com.huawei.hms.push.constant.RemoteMessageConst;
import okhttp3.B;
import okhttp3.D;
import okhttp3.Request;
import okhttp3.x;
import okhttp3.y;
import org.json.JSONObject;

/* loaded from: classes.dex */
class e implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ b.r b;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.b.a(1, null);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.b.a(1, null);
        }
    }

    class c implements Runnable {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(this.a)) {
                e.this.b.a(1, null);
            } else {
                e.this.b.a(0, this.a);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.b.a(1, null);
        }
    }

    e(com.bytedance.feedbackerlib.model.b bVar, String str, b.r rVar) {
        this.a = str;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        D a2;
        x f2 = com.bytedance.feedbackerlib.util.d.f();
        String J2 = e.a.a.a.a.J(new StringBuilder(), d.f.b, "tos/auth");
        Request.a aVar = new Request.a();
        aVar.j(J2);
        aVar.c();
        Request b2 = aVar.b();
        B b3 = null;
        try {
            try {
                com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestTOSAuthorization: request: " + b2 + ", header: " + b2.headers());
                com.bytedance.feedbackerlib.a.l0(this.a, "requestTOSAuthorization: request: " + b2 + ", header: " + b2.headers(), new String[0]);
                b3 = ((y) f2.m(b2)).c();
                StringBuilder sb = new StringBuilder();
                sb.append("requestTOSAuthorization: response: ");
                sb.append(b3);
                com.bytedance.feedbackerlib.a.R("FeedbackModel upload", sb.toString());
                com.bytedance.feedbackerlib.a.l0(this.a, "requestTOSAuthorization: response: " + b3, new String[0]);
                a2 = b3.a();
                com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestTOSAuthorization: body: " + a2);
                com.bytedance.feedbackerlib.a.l0(this.a, "requestTOSAuthorization: body: " + a2, new String[0]);
            } finally {
                if (0 != 0) {
                    b3.close();
                }
            }
        } catch (Throwable unused) {
            k.a(new d());
            if (b3 == null) {
                return;
            }
        }
        if (a2 == null) {
            k.a(new a());
            b3.close();
            return;
        }
        JSONObject jSONObject = new JSONObject(a2.p());
        com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestTOSAuthorization: jsonObject: " + jSONObject);
        com.bytedance.feedbackerlib.a.l0(this.a, "requestTOSAuthorization: jsonObject: " + jSONObject, new String[0]);
        JSONObject optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA);
        if (optJSONObject != null) {
            k.a(new c(optJSONObject.optString("auth")));
        } else {
            k.a(new b());
            b3.close();
        }
    }
}
