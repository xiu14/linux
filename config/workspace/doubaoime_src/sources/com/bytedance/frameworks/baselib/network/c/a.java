package com.bytedance.frameworks.baselib.network.c;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static volatile boolean a = false;
    private static final CopyOnWriteArraySet<String> b = new CopyOnWriteArraySet<>();

    /* renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArraySet<String> f5019c = new CopyOnWriteArraySet<>();

    public static Set<String> a(List<String> list) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = b;
        if (!copyOnWriteArraySet.isEmpty() && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator<String> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                for (String str : list) {
                    if (str != null) {
                        if (str.contains(next + ContainerUtils.KEY_VALUE_DELIMITER)) {
                            hashSet.add(next);
                        }
                    }
                }
            }
            if (hashSet.size() > 0) {
                return hashSet;
            }
        }
        return null;
    }

    public static Set<String> b(s sVar) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = f5019c;
        if (copyOnWriteArraySet.isEmpty() || sVar == null || sVar.i() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Iterator<String> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (sVar.d(next) != null) {
                hashSet.add(next);
            }
        }
        if (hashSet.size() > 0) {
            return hashSet;
        }
        return null;
    }

    public static boolean c() {
        return a;
    }

    public static void d(JSONObject jSONObject) {
        a = false;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = b;
        copyOnWriteArraySet.clear();
        CopyOnWriteArraySet<String> copyOnWriteArraySet2 = f5019c;
        copyOnWriteArraySet2.clear();
        JSONObject optJSONObject = jSONObject.optJSONObject("insecure_request_control");
        if (optJSONObject == null) {
            return;
        }
        a = optJSONObject.optInt("disable_share_insecure_cookie", 0) > 0;
        e(optJSONObject.optJSONArray("secret_cookie_list"), copyOnWriteArraySet);
        e(optJSONObject.optJSONArray("secret_header_list"), copyOnWriteArraySet2);
    }

    private static void e(JSONArray jSONArray, CopyOnWriteArraySet<String> copyOnWriteArraySet) {
        if (jSONArray == null || copyOnWriteArraySet == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    copyOnWriteArraySet.add(string);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }
}
