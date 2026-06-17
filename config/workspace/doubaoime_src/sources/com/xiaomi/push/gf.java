package com.xiaomi.push;

import android.text.TextUtils;
import com.vivo.push.PushClient;
import com.xiaomi.push.ef;
import com.xiaomi.push.service.ax;
import java.util.HashMap;

/* loaded from: classes2.dex */
class gf {
    public static void a(ax.b bVar, String str, gp gpVar) {
        String a;
        ef.c cVar = new ef.c();
        if (!TextUtils.isEmpty(bVar.f9318c)) {
            cVar.a(bVar.f9318c);
        }
        if (!TextUtils.isEmpty(bVar.f9320e)) {
            cVar.d(bVar.f9320e);
        }
        if (!TextUtils.isEmpty(bVar.f9321f)) {
            cVar.e(bVar.f9321f);
        }
        cVar.b(bVar.f1062a ? PushClient.DEFAULT_REQUEST_ID : "0");
        if (TextUtils.isEmpty(bVar.f9319d)) {
            cVar.c("XIAOMI-SASL");
        } else {
            cVar.c(bVar.f9319d);
        }
        gg ggVar = new gg();
        ggVar.c(bVar.f1063b);
        ggVar.a(Integer.parseInt(bVar.f9322g));
        ggVar.b(bVar.f1060a);
        ggVar.a("BIND", (String) null);
        ggVar.a(ggVar.e());
        com.xiaomi.channel.commonutils.logger.c.m15a("[Slim]: bind id=" + ggVar.e());
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", str);
        hashMap.put("token", bVar.f9318c);
        hashMap.put("chid", bVar.f9322g);
        hashMap.put("from", bVar.f1063b);
        hashMap.put("id", ggVar.e());
        hashMap.put("to", "xiaomi.com");
        if (bVar.f1062a) {
            hashMap.put("kick", PushClient.DEFAULT_REQUEST_ID);
        } else {
            hashMap.put("kick", "0");
        }
        if (TextUtils.isEmpty(bVar.f9320e)) {
            hashMap.put("client_attrs", "");
        } else {
            hashMap.put("client_attrs", bVar.f9320e);
        }
        if (TextUtils.isEmpty(bVar.f9321f)) {
            hashMap.put("cloud_attrs", "");
        } else {
            hashMap.put("cloud_attrs", bVar.f9321f);
        }
        if (bVar.f9319d.equals("XIAOMI-PASS") || bVar.f9319d.equals("XMPUSH-PASS")) {
            a = bk.a(bVar.f9319d, null, hashMap, bVar.h);
        } else {
            bVar.f9319d.equals("XIAOMI-SASL");
            a = null;
        }
        cVar.f(a);
        ggVar.a(cVar.m380a(), (String) null);
        gpVar.b(ggVar);
    }

    public static void a(String str, String str2, gp gpVar) {
        gg ggVar = new gg();
        ggVar.c(str2);
        ggVar.a(Integer.parseInt(str));
        ggVar.a("UBND", (String) null);
        gpVar.b(ggVar);
    }
}
