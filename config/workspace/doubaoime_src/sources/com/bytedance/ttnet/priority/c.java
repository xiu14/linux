package com.bytedance.ttnet.priority;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.priority.TTHttpCallPriorityControl;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.ttuploader.TTUploadResolver;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends TTHttpCallPriorityControl.a {
    private final f h = new f();
    private final g i = new g();
    private final h j = new h();
    private final Set<String> k = new CopyOnWriteArraySet();
    private final Set<String> l = new CopyOnWriteArraySet();
    private int m = TTUploadResolver.HOST_MAX_CACHE_TIME;

    private boolean i(Request request) throws com.bytedance.frameworks.baselib.network.http.l.b {
        this.h.c(request);
        if (!this.k.isEmpty()) {
            return TTHttpCallPriorityControl.i(this.k, request.getPath());
        }
        if (this.l.isEmpty()) {
            return false;
        }
        return !TTHttpCallPriorityControl.i(this.l, request.getPath());
    }

    @Override // com.bytedance.retrofit2.T.a
    public boolean a(Request request, Executor executor, Runnable runnable) throws Exception {
        if (i(request)) {
            return this.a.g(request, false, this.m, runnable, executor);
        }
        return false;
    }

    @Override // com.bytedance.retrofit2.T.a
    public void b(Request request) throws Exception {
        if (i(request)) {
            this.a.h(request, false, this.m);
        }
    }

    @Override // com.bytedance.retrofit2.T.a
    public Request d(Request request) {
        return this.j.c(this.i.b(request));
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    public boolean f(JSONObject jSONObject) {
        super.f(jSONObject);
        this.h.a(jSONObject);
        this.a.d(jSONObject, this.b);
        JSONObject optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.Notification.PRIORITY);
        if (!this.h.b() && optJSONObject == null) {
            return false;
        }
        this.i.a(optJSONObject);
        this.j.b(jSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("delay");
        if (optJSONObject2 == null) {
            return true;
        }
        this.k.addAll(TTHttpCallPriorityControl.h(optJSONObject2, "bl_with_priority"));
        this.l.addAll(TTHttpCallPriorityControl.h(optJSONObject2, "wl_with_priority"));
        return true;
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    public void g() {
        super.g();
        this.j.a();
        this.a.f();
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    TTHttpCallPriorityControl.ModeType h() {
        return TTHttpCallPriorityControl.ModeType.PRIORITY;
    }
}
