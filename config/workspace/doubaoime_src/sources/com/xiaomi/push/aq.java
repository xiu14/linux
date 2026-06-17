package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public class aq implements al {
    private static volatile aq a;

    /* renamed from: a, reason: collision with other field name */
    private int f120a = ap.a;

    /* renamed from: a, reason: collision with other field name */
    private Context f121a;

    /* renamed from: a, reason: collision with other field name */
    private al f122a;

    private aq(Context context) {
        this.f121a = context.getApplicationContext();
        this.f122a = ap.a(context);
        StringBuilder M = e.a.a.a.a.M("create id manager is: ");
        M.append(this.f120a);
        com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
    }

    public static aq a(Context context) {
        if (a == null) {
            synchronized (aq.class) {
                if (a == null) {
                    a = new aq(context.getApplicationContext());
                }
            }
        }
        return a;
    }

    private String a(String str) {
        return str == null ? "" : str;
    }

    public void a() {
    }

    public String b() {
        return null;
    }

    public String c() {
        return null;
    }

    public String d() {
        return null;
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public boolean mo102a() {
        return this.f122a.mo102a();
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public String mo101a() {
        return k.m655a(this.f121a) ? a(this.f122a.mo101a()) : "";
    }

    public void a(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            map.put("udid", b);
        }
        String mo101a = mo101a();
        if (!TextUtils.isEmpty(mo101a)) {
            map.put("oaid", mo101a);
        }
        String c2 = c();
        if (!TextUtils.isEmpty(c2)) {
            map.put("vaid", c2);
        }
        String d2 = d();
        if (!TextUtils.isEmpty(d2)) {
            map.put("aaid", d2);
        }
        map.put("oaid_type", String.valueOf(this.f120a));
    }
}
