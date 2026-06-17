package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.framwork.core.sdkmonitor.f;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SDKMonitorUtils {
    private static ConcurrentHashMap<String, f> a = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, List<String>> f5251c = new ConcurrentHashMap<>();

    public static f a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
        }
        if (a.get(str) == null) {
            synchronized (SDKMonitorUtils.class) {
                if (a.get(str) == null) {
                    a.put(str, new f(str));
                }
            }
        }
        return a.get(str);
    }

    public static synchronized void b(@NonNull Context context, @NonNull String str, @NonNull JSONObject jSONObject, f.k kVar) {
        synchronized (SDKMonitorUtils.class) {
            if (context == null) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
            }
            if (jSONObject == null) {
                throw new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
            }
            if (a.get(str) == null || !a.get(str).K()) {
                f fVar = a.get(str);
                if (fVar == null) {
                    fVar = new f(str);
                    a.put(str, fVar);
                }
                fVar.W(f5251c.remove(str));
                fVar.X(b.remove(str));
                fVar.I(context, jSONObject, kVar);
            }
        }
    }

    public static synchronized void c(@NonNull String str, @NonNull List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            if (!TextUtils.isEmpty(str) && !com.bytedance.feedbackerlib.a.V(list)) {
                LinkedList linkedList = new LinkedList();
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        linkedList.add(("https://" + new URL(it2.next()).getHost()) + "/monitor/appmonitor/v3/settings");
                    } catch (MalformedURLException e2) {
                        e2.printStackTrace();
                    }
                }
                f5251c.put(str, linkedList);
            }
        }
    }

    public static synchronized void d(@NonNull String str, @NonNull List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            if (!TextUtils.isEmpty(str) && !com.bytedance.feedbackerlib.a.V(list)) {
                b.put(str, list);
            }
        }
    }
}
