package com.bytedance.apm.doctor;

import android.text.TextUtils;
import com.bytedance.apm.doctor.DoctorManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static AtomicInteger a = new AtomicInteger(0);

    public static void a(String str, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("DATA_DOCTOR");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        try {
            if (optJSONObject.optInt("DATA_ID", -1) == -1) {
                optJSONObject.put("DATA_ID", a.incrementAndGet());
            }
            optJSONObject.put("DATA_PROCESS", com.ss.android.e.a.a.a(e.b.b.n.a.a()));
            optJSONObject.put("DATA_TYPE", str);
            optJSONObject.put("DATA_AID", e.b.b.h.c.a.f());
            jSONObject.put("DATA_DOCTOR", optJSONObject);
            DoctorManager.c.a.a("DATA_DOWNGRADE", new JSONObject(jSONObject.toString()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void b(String str, JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("DATA_DOCTOR");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        try {
            if (optJSONObject.optInt("DATA_ID", -1) == -1) {
                optJSONObject.put("DATA_ID", a.incrementAndGet());
            }
            optJSONObject.put("DATA_PROCESS", com.ss.android.e.a.a.a(e.b.b.n.a.a()));
            optJSONObject.put("DATA_TYPE", str);
            optJSONObject.put("DATA_SAMPLE", z);
            optJSONObject.put("DATA_AID", e.b.b.h.c.a.f());
            jSONObject.put("DATA_DOCTOR", optJSONObject);
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            DoctorManager.c.a.a("DATA_RECEIVE", jSONObject2);
            DoctorManager.c.a.a("DATA_CACHE", jSONObject2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void c(JSONObject jSONObject) {
        try {
            DoctorManager.c.a.a("DATA_SAVE_TO_DB", new JSONObject(jSONObject.toString()));
        } catch (Exception unused) {
        }
    }

    public static void d(byte[] bArr) {
        List<JSONObject> i = i(bArr);
        if (i == null) {
            return;
        }
        Iterator<JSONObject> it2 = i.iterator();
        while (it2.hasNext()) {
            e(it2.next(), "DATA_SEND_BEGIN");
        }
    }

    private static void e(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return;
        }
        try {
            DoctorManager.c.a.a(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void f(byte[] bArr) {
        for (JSONObject jSONObject : i(bArr)) {
            e(jSONObject, "DATA_SEND_FAIL");
            e(jSONObject, "DATA_SEND_END");
        }
    }

    public static void g(byte[] bArr, JSONObject jSONObject) {
        for (JSONObject jSONObject2 : i(bArr)) {
            try {
                JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
                JSONObject optJSONObject = jSONObject2.optJSONObject("DATA_DOCTOR");
                if (optJSONObject != null) {
                    jSONObject3.put("DATA_DOCTOR", optJSONObject);
                }
                e(jSONObject3, "DATA_SEND_RESPONSE");
                e(jSONObject2.put("response", jSONObject3), "DATA_SEND_RESPONSE_NEW");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void h(byte[] bArr) {
        for (JSONObject jSONObject : i(bArr)) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("DATA_DOCTOR");
                if (optJSONObject != null) {
                    optJSONObject.put("DATA_SEND_RESULT", 200);
                }
            } catch (Exception unused) {
            }
            e(jSONObject, "DATA_SEND_SUCCESS");
            e(jSONObject, "DATA_SEND_END");
        }
    }

    private static List<JSONObject> i(byte[] bArr) {
        JSONArray optJSONArray;
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("list")) {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("list");
                if (optJSONArray2 == null) {
                    return null;
                }
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                    if (jSONObject2 != null && (optJSONArray = jSONObject2.optJSONArray(RemoteMessageConst.DATA)) != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            arrayList.add(optJSONArray.getJSONObject(i2));
                        }
                    }
                }
            } else {
                JSONArray optJSONArray3 = jSONObject.optJSONArray(RemoteMessageConst.DATA);
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    arrayList.add(optJSONArray3.getJSONObject(i3));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
