package com.bytedance.ttnet.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private static volatile boolean a = false;
    private static List<b> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static ReentrantReadWriteLock f6265c;

    /* renamed from: d, reason: collision with root package name */
    private static Lock f6266d;

    /* renamed from: e, reason: collision with root package name */
    private static Lock f6267e;

    /* renamed from: com.bytedance.ttnet.utils.a$a, reason: collision with other inner class name */
    public static class C0319a {
        public int a;
        public String b;
    }

    public static class b {
        private Pattern a;

        public boolean a(URI uri) {
            if (uri != null && !TextUtils.isEmpty(uri.getHost()) && this.a != null) {
                String host = uri.getHost();
                if (!TextUtils.isEmpty(uri.getPath())) {
                    StringBuilder M = e.a.a.a.a.M(host);
                    M.append(uri.getPath());
                    host = M.toString();
                }
                try {
                    return this.a.matcher(host).matches();
                } catch (IllegalArgumentException unused) {
                }
            }
            return false;
        }

        public boolean b(String str) {
            try {
                this.a = Pattern.compile(str);
                return true;
            } catch (PatternSyntaxException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f6265c = reentrantReadWriteLock;
        f6266d = reentrantReadWriteLock.readLock();
        f6267e = f6265c.writeLock();
    }

    private static String a(URI uri) {
        boolean z;
        try {
            f6266d.lock();
            Iterator<b> it2 = b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    f6266d.unlock();
                    z = false;
                    break;
                }
                if (it2.next().a(uri)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return UUID.randomUUID().toString();
            }
            return null;
        } finally {
            f6266d.unlock();
        }
    }

    public static void b(SharedPreferences sharedPreferences) {
        JSONArray jSONArray;
        int i = sharedPreferences.getInt("ttnet_response_verify_enabled", -1);
        String string = sharedPreferences.getString("ttnet_response_verify", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONArray = new JSONArray(string);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            f(i, jSONArray);
        }
        jSONArray = null;
        f(i, jSONArray);
    }

    public static C0319a c(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("ttnet_response_verify_enabled", -1);
        JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_response_verify");
        String jSONArray = optJSONArray != null ? optJSONArray.toString() : "";
        f(optInt, optJSONArray);
        C0319a c0319a = new C0319a();
        c0319a.a = optInt;
        c0319a.b = jSONArray;
        return c0319a;
    }

    public static void d(Request request, com.bytedance.retrofit2.client.c cVar, com.bytedance.ttnet.i.b bVar) throws IOException {
        if (a) {
            Logger.w("CDN_CACHE_VERIFY", "Req info is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r2, java.util.List<com.bytedance.retrofit2.client.b> r3, com.bytedance.retrofit2.RetrofitMetrics r4) {
        /*
            boolean r0 = com.bytedance.ttnet.utils.a.a
            if (r0 != 0) goto L5
            return
        L5:
            if (r4 == 0) goto Le
            com.bytedance.retrofit2.I r0 = r4.E0
            com.bytedance.retrofit2.I$c r0 = r0.f5962c
            r0.c()
        Le:
            java.net.URI r2 = com.bytedance.feedbackerlib.a.E0(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L27
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L2b
            com.bytedance.retrofit2.client.b r0 = new com.bytedance.retrofit2.client.b     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "X-TT-VERIFY-ID"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L27
            r3.add(r0)     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L31
        L2b:
            if (r4 == 0) goto L30
            r4.L()
        L30:
            return
        L31:
            r2 = move-exception
            if (r4 == 0) goto L37
            r4.L()
        L37:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.a.e(java.lang.String, java.util.List, com.bytedance.retrofit2.RetrofitMetrics):void");
    }

    private static void f(int i, JSONArray jSONArray) {
        if (i <= 0) {
            a = false;
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    b bVar = new b();
                    if (bVar.b(optString)) {
                        arrayList.add(bVar);
                    }
                }
            }
            try {
                f6267e.lock();
                b = arrayList;
            } finally {
                f6267e.unlock();
            }
        }
        a = true;
    }
}
