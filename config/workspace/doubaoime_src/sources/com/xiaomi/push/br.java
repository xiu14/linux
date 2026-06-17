package com.xiaomi.push;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class br extends JSONObject implements bp {
    private static final int a = 2;
    private static final int b = 3;

    /* renamed from: a, reason: collision with other field name */
    private final LinkedHashMap<String, Integer> f149a = new LinkedHashMap<>();

    @Override // com.xiaomi.push.bp
    public int a() {
        int i = a;
        Iterator<Integer> it2 = this.f149a.values().iterator();
        while (it2.hasNext()) {
            i += it2.next().intValue();
        }
        return (length() - 1) + i;
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f149a.put(str, Integer.valueOf(String.valueOf(i).length() + str.length() + b));
        }
        return super.put(str, i);
    }

    @Override // org.json.JSONObject
    public Object remove(String str) {
        this.f149a.remove(str);
        return super.remove(str);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f149a.put(str, Integer.valueOf(String.valueOf(j).length() + str.length() + b));
        }
        return super.put(str, j);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, double d2) {
        if (!TextUtils.isEmpty(str)) {
            this.f149a.put(str, Integer.valueOf(String.valueOf(d2).length() + str.length() + b));
        }
        return super.put(str, d2);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, Object obj) {
        JSONObject put = super.put(str, obj);
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (obj instanceof bp) {
                this.f149a.put(str, Integer.valueOf(((bp) obj).a() + str.length() + b));
            } else {
                this.f149a.put(str, Integer.valueOf(str.length() + String.valueOf(obj).getBytes(StandardCharsets.UTF_8).length + b + a));
            }
        }
        return put;
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f149a.put(str, Integer.valueOf(String.valueOf(z).length() + str.length() + b));
        }
        return super.put(str, z);
    }
}
