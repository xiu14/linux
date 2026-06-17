package com.ss.android.message.log;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.h.c;
import com.bytedance.push.g0.f;
import com.prolificinteractive.materialcalendarview.r;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushLog {
    public static final String CATEGORY = "event_v1";
    public static final String EVENT_LABEL_TEST = "click_headline";
    public static final String EVENT_SIGN = "_event_v3";
    public static final String EVENT_TAG_TEST1 = "go_detail";
    public static final String EVENT_TAG_TEST2 = "video_play";
    public static final String EVENT_V3_CATEGORY = "event_v3";
    public static final String KEY_CATEGORY = "category";
    public static final String KEY_EXT_JSON = "ext_json";
    public static final String KEY_EXT_VALUE = "ext_value";
    public static final String KEY_LABEL = "label";
    public static final String KEY_TAG = "tag";
    public static final String KEY_VALUE = "value";

    static class a extends c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f8354e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f8355f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f8356g;
        final /* synthetic */ long h;
        final /* synthetic */ long i;
        final /* synthetic */ JSONObject j;
        final /* synthetic */ Context k;

        a(String str, String str2, String str3, long j, long j2, JSONObject jSONObject, Context context) {
            this.f8354e = str;
            this.f8355f = str2;
            this.f8356g = str3;
            this.h = j;
            this.i = j2;
            this.j = jSONObject;
            this.k = context;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            try {
                b bVar = new b();
                bVar.a = this.f8354e;
                bVar.b = this.f8355f;
                bVar.f8359c = this.f8356g;
                bVar.f8360d = this.h;
                bVar.f8361e = this.i;
                JSONObject jSONObject = this.j;
                if (jSONObject != null) {
                    bVar.f8362f = jSONObject.toString();
                }
                if (f.d()) {
                    f.c("PushLog", "category = " + bVar.a + " tag = " + bVar.b + " label = " + bVar.f8359c + " value = " + bVar.f8360d + " ext_value = " + this.i + " ext_json = " + bVar.f8362f);
                }
                com.ss.android.message.log.a c2 = com.ss.android.message.log.a.c(this.k);
                if (c2 != null) {
                    c2.d(bVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        onEvent(context, str, str2, str3, j, j2, jSONObject, false);
    }

    public static void onEventNow(String str, JSONObject jSONObject) {
        try {
            jSONObject.put(EVENT_SIGN, 1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        b bVar = new b();
        bVar.a = EVENT_V3_CATEGORY;
        bVar.b = str;
        bVar.f8362f = jSONObject.toString();
        if (f.d()) {
            StringBuilder M = e.a.a.a.a.M("category = ");
            M.append(bVar.a);
            M.append(" tag = ");
            M.append(bVar.b);
            M.append(" label = ");
            M.append(bVar.f8359c);
            M.append(" value = ");
            M.append(bVar.f8360d);
            M.append(" ext_json = ");
            e.a.a.a.a.J0(M, bVar.f8362f, "PushLog");
        }
        com.ss.android.message.log.a c2 = com.ss.android.message.log.a.c(com.bytedance.common.g.a.c().e().c().a);
        if (c2 != null) {
            c2.d(bVar);
        }
    }

    public static void onEventV3(Context context, String str, JSONObject jSONObject, boolean z) {
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject;
        try {
            jSONObject2.put(EVENT_SIGN, 1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        onEvent(context, EVENT_V3_CATEGORY, str, null, 0L, 0L, jSONObject2, z);
    }

    public static void onEventV3Bundle(Context context, String str, Bundle bundle) {
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(EVENT_SIGN, 1);
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        onEvent(context, EVENT_V3_CATEGORY, str, null, 0L, 0L, jSONObject);
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject, boolean z) {
        if (com.bytedance.android.input.k.b.a.Y(str) || com.bytedance.android.input.k.b.a.Y(str2)) {
            return;
        }
        if (z || !com.ss.android.message.f.a.t(context)) {
            new a(str, str2, str3, j, j2, jSONObject, context).a();
        } else {
            r.R().onEvent(context, str, str2, str3, j, j2, jSONObject);
        }
    }

    public static void onEventV3(String str, JSONObject jSONObject) {
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject;
        try {
            jSONObject2.put(EVENT_SIGN, 1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        onEvent(null, EVENT_V3_CATEGORY, str, null, 0L, 0L, jSONObject2);
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2) {
        onEvent(context, str, str2, str3, j, j2, null);
    }

    public static void onEvent(Context context, String str, String str2, JSONObject... jSONObjectArr) {
        if (jSONObjectArr != null && jSONObjectArr.length > 0) {
            onEvent(context, CATEGORY, str, str2, 0L, 0L, jSONObjectArr[0]);
        } else {
            onEvent(context, CATEGORY, str, str2, 0L, 0L, null);
        }
    }

    public static void onEventV3Bundle(String str, Bundle bundle) {
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(EVENT_SIGN, 1);
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        onEvent(null, EVENT_V3_CATEGORY, str, null, 0L, 0L, jSONObject);
    }

    public static void onEvent(Context context, String str, JSONObject... jSONObjectArr) {
        if (jSONObjectArr != null && jSONObjectArr.length > 0) {
            onEvent(context, CATEGORY, str, null, 0L, 0L, jSONObjectArr[0]);
        } else {
            onEvent(context, CATEGORY, str, null, 0L, 0L, null);
        }
    }

    public static void onEventV3(Context context, String str, JSONObject jSONObject) {
        onEventV3(context, str, jSONObject, false);
    }
}
