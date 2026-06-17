package com.bytedance.apm.B;

import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f3236c;
    private CopyOnWriteArraySet<String> a = new CopyOnWriteArraySet<>();
    private ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    private d() {
    }

    public static d a() {
        if (f3236c == null) {
            synchronized (d.class) {
                if (f3236c == null) {
                    f3236c = new d();
                }
            }
        }
        return f3236c;
    }

    public JSONObject b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (z) {
                com.bytedance.apm.util.e.g().b(jSONObject);
                com.bytedance.apm.util.e.g().a(jSONObject, false);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String c() {
        String sb;
        Object[] array = this.a.toArray();
        if (array == null) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Object obj : array) {
                if (z) {
                    z = false;
                } else {
                    sb2.append("#");
                }
                sb2.append(obj.toString());
            }
            sb = sb2.toString();
        }
        return TextUtils.isEmpty(sb) ? ActivityLifeObserver.getInstance().getTopActivityClassName() : sb;
    }
}
