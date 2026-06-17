package com.bytedance.applog.y;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static final List<String> a = Collections.singletonList("EventPriorityLoader");

    public static a a(com.bytedance.applog.c cVar, com.bytedance.applog.x.b bVar) {
        SharedPreferences sharedPreferences = bVar.j().getSharedPreferences(com.bytedance.applog.b.b(cVar, "priority_list"), 0);
        int i = sharedPreferences.getInt("priority_version", -1);
        if (i == -1) {
            return null;
        }
        a aVar = new a();
        aVar.a = i;
        aVar.b = sharedPreferences.getInt("base_interval", 5);
        String string = sharedPreferences.getString("priorities", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                c(cVar, bVar, aVar, new JSONArray(string));
            } catch (JSONException e2) {
                cVar.I().t(a, "parseEventPriorityFromLocal failed", e2, new Object[0]);
            }
        }
        return aVar;
    }

    public static void b(com.bytedance.applog.c cVar, com.bytedance.applog.x.b bVar, @NonNull JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("priority_list");
        if (optJSONObject != null) {
            try {
                a aVar = new a();
                boolean z = true;
                if (optJSONObject.optInt("prefer_batch_event_interval", 0) != 1) {
                    z = false;
                }
                aVar.h = z;
                aVar.a = optJSONObject.optInt("priority_version", 0);
                aVar.b = optJSONObject.optInt("base_interval", 5);
                JSONArray optJSONArray = optJSONObject.optJSONArray("priorities");
                c(cVar, bVar, aVar, optJSONArray);
                if (aVar.g()) {
                    bVar.Q(aVar);
                    SharedPreferences.Editor edit = bVar.j().getSharedPreferences(com.bytedance.applog.b.b(cVar, "priority_list"), 0).edit();
                    edit.putInt("priority_version", aVar.a);
                    edit.putInt("base_interval", aVar.b);
                    edit.putString("priorities", optJSONArray.toString());
                    edit.apply();
                }
            } catch (Throwable th) {
                cVar.I().t(a, "parseEventPriorityFromServer", th, new Object[0]);
            }
        }
    }

    private static void c(com.bytedance.applog.c cVar, com.bytedance.applog.x.b bVar, a aVar, JSONArray jSONArray) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONArray jSONArray2 = jSONArray;
        HashMap hashMap = new HashMap();
        aVar.f3924f = new HashMap();
        if (jSONArray2 == null || jSONArray.length() <= 0) {
            return;
        }
        aVar.i(jSONArray);
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                if (optJSONObject != null) {
                    b bVar2 = new b();
                    int optInt = optJSONObject.optInt(RemoteMessageConst.Notification.PRIORITY);
                    bVar2.a = optInt;
                    if (optInt > aVar.f3921c) {
                        aVar.f3921c = optInt;
                    }
                    int optInt2 = optJSONObject.optInt("interval_multiple");
                    bVar2.f3926c = optInt2;
                    if (optInt2 <= 0) {
                        bVar2.f3926c = 1;
                    }
                    long j = aVar.b * bVar2.f3926c * 1000;
                    bVar2.f3927d = j;
                    try {
                        bVar2.k = new com.bytedance.applog.E.a(cVar, bVar, j);
                        bVar2.f3930g = optJSONObject.optString("report_host");
                        bVar2.h = optJSONObject.optString("report_path");
                        JSONArray optJSONArray = optJSONObject.optJSONArray("events");
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                String optString = optJSONArray.optString(i2);
                                if (!TextUtils.isEmpty(optString)) {
                                    aVar.f3924f.put(optString, Integer.valueOf(bVar2.a));
                                }
                            }
                        }
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("param_keys");
                        if (optJSONObject2 != null) {
                            bVar2.f3928e = new HashMap();
                            Iterator<String> keys = optJSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!TextUtils.isEmpty(next)) {
                                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray(next);
                                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                                        jSONObject4 = optJSONObject2;
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        int i3 = 0;
                                        while (i3 < optJSONArray2.length()) {
                                            JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i3);
                                            if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                                                jSONObject5 = optJSONObject2;
                                            } else {
                                                HashSet hashSet = new HashSet();
                                                jSONObject5 = optJSONObject2;
                                                for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                                    String optString2 = optJSONArray3.optString(i4);
                                                    if (!TextUtils.isEmpty(optString2)) {
                                                        hashSet.add(optString2);
                                                    }
                                                }
                                                arrayList.add(hashSet);
                                            }
                                            i3++;
                                            optJSONObject2 = jSONObject5;
                                        }
                                        jSONObject4 = optJSONObject2;
                                        bVar2.f3928e.put(next, arrayList);
                                    }
                                    optJSONObject2 = jSONObject4;
                                }
                            }
                        }
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("param_key_values");
                        if (optJSONObject3 != null) {
                            bVar2.f3929f = new HashMap();
                            Iterator<String> keys2 = optJSONObject3.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                if (!TextUtils.isEmpty(next2)) {
                                    JSONArray optJSONArray4 = optJSONObject3.optJSONArray(next2);
                                    if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                                        jSONObject = optJSONObject3;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        int i5 = 0;
                                        while (i5 < optJSONArray4.length()) {
                                            JSONObject optJSONObject4 = optJSONArray4.optJSONObject(i5);
                                            if (optJSONObject4 != null) {
                                                HashMap hashMap2 = new HashMap();
                                                Iterator<String> keys3 = optJSONObject4.keys();
                                                while (keys3.hasNext()) {
                                                    String next3 = keys3.next();
                                                    if (TextUtils.isEmpty(next3)) {
                                                        jSONObject3 = optJSONObject3;
                                                    } else {
                                                        jSONObject3 = optJSONObject3;
                                                        Object opt = optJSONObject4.opt(next3);
                                                        if (opt != null) {
                                                            hashMap2.put(next3, opt);
                                                        }
                                                    }
                                                    optJSONObject3 = jSONObject3;
                                                }
                                                jSONObject2 = optJSONObject3;
                                                arrayList2.add(hashMap2);
                                            } else {
                                                jSONObject2 = optJSONObject3;
                                            }
                                            i5++;
                                            optJSONObject3 = jSONObject2;
                                        }
                                        jSONObject = optJSONObject3;
                                        bVar2.f3929f.put(next2, arrayList2);
                                    }
                                    optJSONObject3 = jSONObject;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(bVar2.a), bVar2);
                    } catch (Throwable th) {
                        th = th;
                        cVar.I().t(a, "parsePriorityMapFromJsonArray failed", th, new Object[0]);
                        return;
                    }
                }
                i++;
                jSONArray2 = jSONArray;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).b = aVar.f3921c;
        }
        aVar.h(hashMap);
    }

    public static void d(@NonNull JSONObject jSONObject, a aVar) {
        JSONArray optJSONArray;
        b a2;
        if (aVar == null || (optJSONArray = jSONObject.optJSONArray("priority_request_config")) == null || optJSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (a2 = aVar.a(optJSONObject.optInt(RemoteMessageConst.Notification.PRIORITY))) != null) {
                a2.k.b(optJSONObject, a2.f3927d, a2);
            }
        }
    }
}
