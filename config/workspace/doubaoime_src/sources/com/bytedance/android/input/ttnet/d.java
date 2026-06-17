package com.bytedance.android.input.ttnet;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.r.j;
import com.bytedance.ttnet.TTNetInit;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements com.bytedance.ttnet.d {
    private static final String b = "d";
    private final Context a;

    public d(Context context) {
        this.a = context;
    }

    public int a() {
        Objects.requireNonNull(IAppGlobals.a);
        return 401734;
    }

    public String[] b() {
        return new String[]{"tnc3-bjlgy.snssdk.com", "tnc3-alisc1.snssdk.com", "tnc3-aliec2.snssdk.com"};
    }

    public Context c() {
        return this.a;
    }

    public Map<String, String> d() {
        HashMap hashMap = new HashMap();
        hashMap.put(TTNetInit.DOMAIN_HTTPDNS_KEY, "dig.bdurl.net");
        hashMap.put(TTNetInit.DOMAIN_NETLOG_KEY, "crash.snssdk.com");
        hashMap.put(TTNetInit.DOMAIN_BOE_KEY, ".boe-gateway.byted.org");
        return hashMap;
    }

    public void e(Context context, String str, String str2, JSONObject jSONObject) {
        StringBuilder W = e.a.a.a.a.W("event: ", str, " label: ", str2, " json: ");
        W.append(jSONObject.toString());
        j.j("tyy", W.toString());
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2.length() > 1 && str2.startsWith(".")) {
                    str2 = str2.substring(1);
                }
                arrayList.add(str2);
            }
        }
        com.ss.android.token.b.a(arrayList);
        j.m(b, "cookieHostList: " + arrayList);
    }
}
