package com.bytedance.dataplatform;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4719c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f4720d;

        a(Context context, String str, String str2, Set set) {
            this.a = context;
            this.b = str;
            this.f4719c = str2;
            this.f4720d = set;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.e(this.a, this.b).edit().putStringSet(this.f4719c, this.f4720d).apply();
        }
    }

    public static Map<String, Integer> b(Context context, String str) {
        SharedPreferences e2 = e(context, str);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : e2.getAll().entrySet()) {
            if (entry.getValue() instanceof Integer) {
                concurrentHashMap.put(entry.getKey(), (Integer) entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static Map<String, String> c(Context context, String str) {
        SharedPreferences e2 = e(context, str);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : e2.getAll().entrySet()) {
            if (entry.getValue() instanceof String) {
                concurrentHashMap.put(entry.getKey(), (String) entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static JSONObject d(Context context, String str, String str2) {
        try {
            return new JSONObject(e(context, str).getString(str2, ""));
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SharedPreferences e(Context context, String str) {
        try {
            return context.getSharedPreferences(str, 0);
        } catch (Exception unused) {
            return context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
        }
    }

    public static String f(Context context, String str, String str2) {
        return e(context, str).getString(str2, "");
    }

    public static Set<String> g(Context context, String str, String str2) {
        return new ConcurrentSkipListSet(e(context, str).getStringSet(str2, new ConcurrentSkipListSet()));
    }

    public static void h(Context context, String str, String str2, Set<String> set) {
        s.a(new a(context, str, str2, set));
    }
}
