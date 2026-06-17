package com.bytedance.ttnet.priority;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.throttle.TTNetThrottle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {
    private static final String[] j = new String[0];
    private final Map<String, Integer> a = new ConcurrentHashMap();
    private Set<String> b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f6246c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f6247d = new CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f6248e = new CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    private long f6249f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f6250g = -1;
    private long h = -1;
    private long i = -1;

    public void a() {
        Set<String> set = this.b;
        String[] strArr = j;
        TTNetThrottle.stop((String[]) set.toArray(strArr), 1);
        TTNetThrottle.stop((String[]) this.f6246c.toArray(strArr), 2);
        TTNetThrottle.stop((String[]) this.f6247d.toArray(strArr), 4);
        TTNetThrottle.stop((String[]) this.f6248e.toArray(strArr), 8);
    }

    public boolean b(JSONObject jSONObject) {
        a();
        this.a.clear();
        JSONObject optJSONObject = jSONObject.optJSONObject("throttle");
        if (optJSONObject == null) {
            return false;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_throttle");
        if (optJSONObject2 != null) {
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.a.put(next, Integer.valueOf(optJSONObject2.optInt(next)));
            }
        }
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("connection_throttle");
        if (optJSONObject3 == null) {
            return true;
        }
        JSONObject optJSONObject4 = optJSONObject3.optJSONObject("normal_up");
        if (optJSONObject4 != null) {
            this.b = TTHttpCallPriorityControl.h(optJSONObject4, "hosts");
            this.f6249f = optJSONObject4.optInt("speed", -1);
        }
        JSONObject optJSONObject5 = optJSONObject3.optJSONObject("normal_down");
        if (optJSONObject5 != null) {
            this.f6246c = TTHttpCallPriorityControl.h(optJSONObject5, "hosts");
            this.f6250g = optJSONObject5.optInt("speed", -1);
        }
        JSONObject optJSONObject6 = optJSONObject3.optJSONObject("ws_up");
        if (optJSONObject6 != null) {
            this.f6247d = TTHttpCallPriorityControl.h(optJSONObject6, "hosts");
            this.h = optJSONObject6.optInt("speed", -1);
        }
        JSONObject optJSONObject7 = optJSONObject3.optJSONObject("ws_down");
        if (optJSONObject7 == null) {
            return true;
        }
        this.f6248e = TTHttpCallPriorityControl.h(optJSONObject7, "hosts");
        this.i = optJSONObject7.optInt("speed", -1);
        return true;
    }

    public Request c(Request request) {
        Integer g2 = TTHttpCallPriorityControl.g(this.a, request.getPath());
        if (g2 == null) {
            return request;
        }
        Request.a newBuilder = request.newBuilder();
        Object extraInfo = request.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new com.bytedance.ttnet.i.d();
            newBuilder.f(extraInfo);
        }
        if (extraInfo instanceof com.bytedance.frameworks.baselib.network.http.c) {
            ((com.bytedance.frameworks.baselib.network.http.c) extraInfo).i = g2.longValue();
        }
        newBuilder.f(extraInfo);
        return newBuilder.a();
    }
}
