package com.bytedance.frameworks.baselib.network.http.p;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static volatile String a = null;
    private static volatile String b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f5231c = false;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f5232d = false;

    /* renamed from: e, reason: collision with root package name */
    private static volatile List<String> f5233e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private static volatile List<String> f5234f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f5235g = false;
    private static volatile List<Pattern> h = new ArrayList();
    private static volatile List<String> i = new CopyOnWriteArrayList();

    public static String a(Context context, String str) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
        } catch (Throwable unused) {
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            String str2 = new String(bArr, "UTF-8");
            try {
                inputStream.close();
                return str2;
            } catch (IOException e2) {
                e2.printStackTrace();
                return str2;
            }
        } catch (Throwable unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            return "";
        }
    }

    public static boolean b(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append("/");
            sb.append("ttnet_boe.flag");
            return new File(sb.toString()).exists();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean c() {
        return f5231c;
    }

    public static void d(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (!f5231c || (optJSONArray = jSONObject.optJSONArray("boe_bypass_host_list")) == null) {
            return;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            String optString = optJSONArray.optString(i2);
            if (!com.bytedance.android.input.k.b.a.Y(optString)) {
                i.add(optString);
            }
        }
    }

    public static String e(String str) {
        if (!f5231c || !f5232d || str == null || !str.contains(a)) {
            return null;
        }
        String scheme = Uri.parse(str).getScheme();
        if ("http".equals(scheme)) {
            str = str.replaceFirst("http", "https");
        } else if ("ws".equals(scheme)) {
            str = str.replaceFirst("ws", "wss");
        }
        return str.replaceFirst(a, "");
    }

    public static void f(String str) {
        b = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f5232d = false;
    }

    public static void g(String str) {
        a = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f5232d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(android.content.Context r6, java.lang.String r7, java.util.List<com.bytedance.retrofit2.client.b> r8) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p.c.h(android.content.Context, java.lang.String, java.util.List):java.lang.String");
    }
}
