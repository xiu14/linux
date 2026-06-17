package com.bytedance.ttnet.priority;

import com.bytedance.retrofit2.client.Request;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g {
    private Set<String> a = new CopyOnWriteArraySet();
    private Set<String> b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f6245c = new CopyOnWriteArraySet();

    private boolean c(Set<String> set, String str, Request.a aVar, int i, int i2) {
        if (!TTHttpCallPriorityControl.i(set, str)) {
            return false;
        }
        aVar.d(i);
        aVar.e(i2);
        return true;
    }

    public void a(JSONObject jSONObject) {
        this.a = TTHttpCallPriorityControl.h(jSONObject, "high");
        this.b = TTHttpCallPriorityControl.h(jSONObject, "normal");
        this.f6245c = TTHttpCallPriorityControl.h(jSONObject, "low");
    }

    public Request b(Request request) {
        Request.a newBuilder = request.newBuilder();
        if (c(this.a, request.getPath(), newBuilder, 3, 4)) {
            return newBuilder.a();
        }
        if (c(this.f6245c, request.getPath(), newBuilder, -1, 1)) {
            return newBuilder.a();
        }
        int priorityLevel = request.getPriorityLevel();
        if (priorityLevel >= 3) {
            priorityLevel = 1;
        }
        if (priorityLevel <= -1) {
            priorityLevel = 0;
        }
        int i = priorityLevel;
        int requestPriorityLevel = request.getRequestPriorityLevel();
        if (requestPriorityLevel >= 4) {
            requestPriorityLevel = 3;
        }
        if (requestPriorityLevel >= 1) {
            requestPriorityLevel = 2;
        }
        if (c(this.b, request.getPath(), newBuilder, i, requestPriorityLevel)) {
            return newBuilder.a();
        }
        newBuilder.d(1);
        newBuilder.e(3);
        return newBuilder.a();
    }
}
