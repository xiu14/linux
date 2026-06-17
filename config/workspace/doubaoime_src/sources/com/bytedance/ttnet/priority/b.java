package com.bytedance.ttnet.priority;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.priority.TTHttpCallPriorityControl;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends TTHttpCallPriorityControl.a {
    private final f h = new f();
    private final Map<String, Integer> i = new ConcurrentHashMap();
    private final Set<String> j = new CopyOnWriteArraySet();
    private int k = 1000;

    private int i(Request request) throws IOException {
        this.h.c(request);
        if (!this.i.isEmpty()) {
            Integer g2 = TTHttpCallPriorityControl.g(this.i, request.getPath());
            if (g2 != null) {
                return g2.intValue();
            }
            return 0;
        }
        if (this.j.isEmpty()) {
            return -1;
        }
        if (TTHttpCallPriorityControl.i(this.j, request.getPath())) {
            return 0;
        }
        return this.k;
    }

    @Override // com.bytedance.retrofit2.T.a
    public boolean a(Request request, Executor executor, Runnable runnable) throws Exception {
        long i = i(request);
        if (Logger.debug()) {
            StringBuilder Q = e.a.a.a.a.Q("get normal delay time ", i, " ");
            Q.append(request.getPath());
            Logger.d("ModeNormalDelay", Q.toString());
        }
        return this.a.g(request, false, i, runnable, executor);
    }

    @Override // com.bytedance.retrofit2.T.a
    public void b(Request request) throws Exception {
        long i = i(request);
        if (Logger.debug()) {
            StringBuilder Q = e.a.a.a.a.Q("get normal delay time ", i, " ");
            Q.append(request.getPath());
            Logger.d("ModeNormalDelay", Q.toString());
        }
        this.a.h(request, false, i);
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    public boolean f(JSONObject jSONObject) {
        super.f(jSONObject);
        if (jSONObject.isNull("bl_with_delay_ms") && jSONObject.isNull("wl")) {
            return false;
        }
        this.h.a(jSONObject);
        this.a.d(jSONObject, this.b);
        JSONObject optJSONObject = jSONObject.optJSONObject("bl_with_delay_ms");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.i.put(next, Integer.valueOf(optJSONObject.optInt(next)));
            }
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("wl");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        this.j.add(optString);
                    }
                }
            }
            this.k = jSONObject.optInt("delay_time_ms", 1000);
        }
        return (!this.h.b() && this.i.isEmpty() && this.j.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    public void g() {
        super.g();
        this.a.f();
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    TTHttpCallPriorityControl.ModeType h() {
        return TTHttpCallPriorityControl.ModeType.NORMAL_DELAY;
    }
}
