package com.bytedance.apm.y;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static c a;
    private static c b;

    static class a implements c {
        a() {
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        b = aVar;
    }

    static String a(String[] strArr) {
        StringBuilder sb = new StringBuilder(400);
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void b(String str, String... strArr) {
        Log.d(str, a(strArr));
    }

    public static void c(String str, String... strArr) {
        Log.e(str, a(strArr));
    }

    public static void d(String str, String... strArr) {
        Log.i(str, a(strArr));
    }

    public static void e(String str, Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        int length = objArr.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < length; i += 2) {
            try {
                jSONObject.put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        Log.i(str, a(new String[]{jSONObject.toString()}));
    }

    public static void f(String str, Throwable th, String... strArr) {
        String a2 = a(strArr);
        if (a2 == null) {
            a2 = "";
        }
        StringBuilder S = e.a.a.a.a.S(a2, "  ");
        S.append(Log.getStackTraceString(th));
        Log.e(str, S.toString());
    }

    public static void g(String str, String... strArr) {
        Log.w(str, a(strArr));
    }
}
