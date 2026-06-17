package com.bytedance.frameworks.baselib.network.c;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static volatile boolean a = false;
    private static volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f5020c = false;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f5021d = false;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f5022e = false;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f5023f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<String> f5024g = new CopyOnWriteArraySet();

    public static boolean a() {
        return b;
    }

    public static boolean b() {
        return f5020c;
    }

    public static boolean c() {
        return a;
    }

    public static boolean d() {
        return f5021d;
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String trim = str.trim();
        int indexOf = trim.indexOf(59);
        if (indexOf != -1) {
            trim = trim.substring(0, indexOf);
        }
        Iterator<String> it2 = f5024g.iterator();
        while (it2.hasNext()) {
            if (trim.startsWith(it2.next() + ContainerUtils.KEY_VALUE_DELIMITER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f() {
        return f5023f;
    }

    public static boolean g() {
        return f5022e;
    }

    public static void h(JSONObject jSONObject) {
        a = false;
        b = false;
        f5020c = false;
        f5021d = false;
        f5022e = false;
        f5023f = false;
        f5024g.clear();
        a = jSONObject.optInt("cookie_save_v2_enabled", 0) > 0;
        b = jSONObject.optInt("cookie_backup_async_save_enabled", 0) > 0;
        f5020c = jSONObject.optInt("cookie_batch", 0) > 0;
        f5021d = jSONObject.optInt("disable_cookie_share_host_match_fix", 0) > 0;
        f5022e = jSONObject.optInt("enable_flush_cookie_for_region", 0) > 0;
        f5023f = jSONObject.optInt("enable_share_cookie_batch", 0) > 0;
        JSONArray optJSONArray = jSONObject.optJSONArray("disable_share_cookie_keys");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                hashSet.add(optString);
            }
        }
        f5024g.addAll(hashSet);
    }
}
