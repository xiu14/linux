package com.bytedance.crash.runtime;

import android.text.TextUtils;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a {
    private static String a = "https://mon.zijieapi.com";

    public static String a() {
        return a;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.android.input.k.b.a.W("setDomainName:" + str);
        if (str.startsWith("http")) {
            a = str;
        } else {
            a = e.a.a.a.a.s("https://", str);
        }
        StringBuilder M = e.a.a.a.a.M("setDomainName:");
        M.append(a);
        com.bytedance.android.input.k.b.a.W(M.toString());
    }

    public static void c(String str, JSONArray jSONArray) {
        if (TextUtils.isEmpty(str) || jSONArray == null || jSONArray.length() == 0) {
            com.bytedance.android.input.k.b.a.W("setDomainName: invalid param");
            return;
        }
        if (str.equals(a)) {
            com.bytedance.android.input.k.b.a.W("setDomainName: same domain");
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= jSONArray.length()) {
                break;
            }
            if (str.equals(jSONArray.optString(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            com.bytedance.android.input.k.b.a.W("setDomainName: check valid fail");
            return;
        }
        com.bytedance.android.input.k.b.a.W("setDomainName begin:" + str);
        a = str;
    }
}
