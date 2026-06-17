package com.bytedance.applog.z;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.applog.w.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static void a(c cVar, JSONArray jSONArray) {
        int optInt;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2 == null || jSONArray.length() <= 0) {
            return;
        }
        cVar.i(jSONArray);
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("sampling_rate")) < 10000) {
                    int optInt2 = optJSONObject.optInt("sampling_method");
                    HashSet hashSet = new HashSet();
                    JSONArray optJSONArray = optJSONObject.optJSONArray("events");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            String optString = optJSONArray.optString(i2);
                            if (!TextUtils.isEmpty(optString)) {
                                hashSet.add(optString);
                            }
                        }
                    }
                    HashMap hashMap = new HashMap();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("param_keys");
                    if (optJSONObject2 != null) {
                        Iterator<String> keys = optJSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!TextUtils.isEmpty(next)) {
                                JSONArray optJSONArray2 = optJSONObject2.optJSONArray(next);
                                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                        JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i3);
                                        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                                            HashSet hashSet2 = new HashSet();
                                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                                String optString2 = optJSONArray3.optString(i4);
                                                if (!TextUtils.isEmpty(optString2)) {
                                                    hashSet2.add(optString2);
                                                }
                                            }
                                            arrayList.add(hashSet2);
                                        }
                                    }
                                    hashMap.put(next, arrayList);
                                }
                            }
                        }
                    }
                    HashMap hashMap2 = new HashMap();
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("param_key_values");
                    if (optJSONObject3 != null) {
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
                                            HashMap hashMap3 = new HashMap();
                                            Iterator<String> keys3 = optJSONObject4.keys();
                                            while (keys3.hasNext()) {
                                                String next3 = keys3.next();
                                                if (TextUtils.isEmpty(next3)) {
                                                    jSONObject3 = optJSONObject3;
                                                } else {
                                                    jSONObject3 = optJSONObject3;
                                                    Object opt = optJSONObject4.opt(next3);
                                                    if (opt != null) {
                                                        hashMap3.put(next3, opt);
                                                    }
                                                }
                                                optJSONObject3 = jSONObject3;
                                            }
                                            jSONObject2 = optJSONObject3;
                                            arrayList2.add(hashMap3);
                                        } else {
                                            jSONObject2 = optJSONObject3;
                                        }
                                        i5++;
                                        optJSONObject3 = jSONObject2;
                                    }
                                    jSONObject = optJSONObject3;
                                    hashMap2.put(next2, arrayList2);
                                }
                                optJSONObject3 = jSONObject;
                            }
                        }
                    }
                    cVar.a(optInt, optInt2, hashSet, hashMap, hashMap2);
                }
                i++;
                jSONArray2 = jSONArray;
            } catch (Throwable th) {
                k.z().u(12, "loadSamplingMapFromJsonArray error", th, new Object[0]);
                return;
            }
        }
    }

    public static c b(Context context, String str, JSONObject jSONObject, c cVar) {
        if (jSONObject == null) {
            return cVar;
        }
        try {
            c cVar2 = new c();
            cVar2.j(jSONObject.optInt("event_sampling_version", 0));
            cVar2.g(jSONObject.optInt("capability", 0));
            cVar2.h(jSONObject.optJSONArray("config_ids"));
            JSONArray optJSONArray = jSONObject.optJSONArray("samplings");
            a(cVar2, optJSONArray);
            if (TextUtils.isEmpty(str)) {
                str = "sampling_list";
            }
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putInt("capability", cVar2.b());
            edit.putInt("version", cVar2.d());
            if (optJSONArray != null) {
                edit.putString("samplings", optJSONArray.toString());
            }
            if (cVar2.c() != null) {
                edit.putString("config_ids", cVar2.c().toString());
            }
            edit.apply();
            return cVar2;
        } catch (Throwable th) {
            k.z().u(12, "parseEventSamplingFromServer", th, new Object[0]);
            return cVar;
        }
    }

    public static c c(Context context, String str) {
        c cVar = new c();
        if (TextUtils.isEmpty(str)) {
            str = "sampling_list";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        cVar.j(sharedPreferences.getInt("version", 0));
        cVar.g(sharedPreferences.getInt("capability", 0));
        String string = sharedPreferences.getString("config_ids", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                cVar.h(new JSONArray(string));
            } catch (Throwable th) {
                k.z().u(12, "parseEventSamplingFromLocal config ids error", th, new Object[0]);
            }
        }
        String string2 = sharedPreferences.getString("samplings", null);
        if (!TextUtils.isEmpty(string2)) {
            try {
                a(cVar, new JSONArray(string2));
            } catch (Throwable th2) {
                k.z().u(12, "parseEventSamplingFromLocal sampling config", th2, new Object[0]);
            }
        }
        return cVar;
    }
}
