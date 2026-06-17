package com.vivo.push.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ad extends c {
    private static ad b;

    /* renamed from: d, reason: collision with root package name */
    private static com.vivo.push.f.a f8896d;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, byte[]> f8897c = new ConcurrentHashMap();

    private synchronized void b(Context context) {
        if (!b("data_clear") && context != null) {
            Iterator<Map.Entry<String, ?>> it2 = a().getAll().entrySet().iterator();
            while (it2.hasNext()) {
                String key = it2.next().getKey();
                if (!TextUtils.isEmpty(key) && (key.contains("_sub_") || key.contains("_cache_"))) {
                    c(key);
                }
            }
            t.c("SharePreferenceManager", " old data clear ");
            a("data_clear");
        }
    }

    public static synchronized ad c() {
        ad adVar;
        synchronized (ad.class) {
            if (b == null) {
                b = new ad();
            }
            if (f8896d == null) {
                f8896d = new com.vivo.push.f.a();
            }
            adVar = b;
        }
        return adVar;
    }

    public final synchronized void a(Context context) {
        if (this.a == null) {
            this.a = context;
            a(context, "com.vivo.push_preferences");
            List<String> e2 = e("local_iv");
            if (e2 != null && e2.size() >= 4) {
                this.f8897c.put("com.vivo.push.a", d(e2.get(1)));
                this.f8897c.put("com.vivo.push.b", d(e2.get(2)));
                this.f8897c.put("com.vivo.push.c", d(e2.get(3)));
                this.f8897c.put("com.vivo.push.d", d(e2.get(0)));
                b(this.a);
            }
            t.a("SharePreferenceManager", " initSecureCode error list is null ");
            b(this.a);
        }
    }

    public final byte[] d() {
        byte[] bArr = this.f8897c.get("com.vivo.push.c");
        return (bArr == null || bArr.length <= 0) ? f8896d.a(this.a) : bArr;
    }

    public final byte[] e() {
        byte[] bArr = this.f8897c.get("com.vivo.push.d");
        return (bArr == null || bArr.length <= 0) ? f8896d.b(this.a) : bArr;
    }

    private static byte[] d(String str) {
        int i;
        byte[] bArr = null;
        try {
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (split.length > 0) {
                bArr = new byte[split.length];
                i = split.length;
            } else {
                i = 0;
            }
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = Byte.parseByte(split[i2].trim());
            }
        } catch (Exception e2) {
            e.a.a.a.a.h0(e2, new StringBuilder("getCodeBytes error:"), "SharePreferenceManager");
        }
        return bArr;
    }

    private List<String> e(String str) {
        Object a;
        String[] split;
        if (this.a == null) {
            t.c("SharePreferenceManager", " parsLocalIv error mContext is null ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.a;
            a = ah.a(context, context.getPackageName(), str);
        } catch (Exception e2) {
            t.c("SharePreferenceManager", " parsLocalIv error e =" + e2.getMessage());
        }
        if (a == null) {
            return null;
        }
        String str2 = new String(Base64.decode(a.toString(), 2));
        if (!TextUtils.isEmpty(str2) && (split = str2.split(",#@")) != null && split.length >= 4) {
            for (String str3 : split) {
                arrayList.add(str3.replace(",#@", ""));
            }
            if (arrayList.size() >= 4) {
                return arrayList;
            }
        }
        return null;
    }
}
