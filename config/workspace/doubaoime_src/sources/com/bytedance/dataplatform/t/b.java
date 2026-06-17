package com.bytedance.dataplatform.t;

import androidx.core.app.NotificationCompat;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.dataplatform.s;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.s.c.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static c a;
    private static Set<String> b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4753c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4754d;

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.b.contains(this.a)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("params_for_special", "abtest_ab_sdk");
                jSONObject.put("ab_sdk_version", this.b);
                jSONObject.put("trigger_vid", this.a);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            b.a("abtest_ab_sdk_vid_exposure", jSONObject);
            b.b.add(this.a);
        }
    }

    /* renamed from: com.bytedance.dataplatform.t.b$b, reason: collision with other inner class name */
    class RunnableC0220b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Integer b;

        RunnableC0220b(String str, Integer num) {
            this.a = str;
            this.b = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("params_for_special", "abtest_ab_sdk");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(this.a, this.b);
                jSONObject.put("client_layer_info", jSONObject2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            s.a(new com.bytedance.dataplatform.t.a("local_strategy", jSONObject));
        }
    }

    static void a(String str, JSONObject jSONObject) {
        if (a != null) {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            l.e(str, NotificationCompat.CATEGORY_EVENT);
            l.e(jSONObject, com.heytap.mcssdk.constant.b.D);
            aVar.j(str, jSONObject);
        }
    }

    public static void c(String str, String str2) {
        if (f4753c) {
            s.a(new a(str, str2));
        }
    }

    public static void d(String str, Integer num) {
        if (f4754d) {
            s.a(new RunnableC0220b(str, num));
        }
    }

    public static void e(c cVar, boolean z, boolean z2) {
        a = cVar;
        f4754d = z2;
        f4753c = z;
    }
}
