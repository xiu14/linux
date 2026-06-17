package com.bytedance.ttnet;

import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.client.Request;
import com.vivo.push.PushClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f implements SsHttpCall.d {

    /* renamed from: c, reason: collision with root package name */
    private static volatile f f6215c;
    private final List<a> a = new CopyOnWriteArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);

    static final class a {
        int a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        final List<String> f6216c;

        /* renamed from: d, reason: collision with root package name */
        final List<String> f6217d;

        a(int i, int i2, List<String> list, List<String> list2) {
            ArrayList arrayList = new ArrayList();
            this.f6216c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f6217d = arrayList2;
            this.a = i;
            this.b = i2;
            arrayList.addAll(list);
            arrayList2.addAll(list2);
        }
    }

    public static f a() {
        if (f6215c == null) {
            synchronized (f.class) {
                if (f6215c == null) {
                    f6215c = new f();
                    SsHttpCall.setRequestFlagHandler(f6215c);
                }
            }
        }
        return f6215c;
    }

    public Request b(Request request) {
        boolean z;
        boolean z2;
        List<String> list;
        if (request == null) {
            return request;
        }
        if (request.getExtraInfo() instanceof com.bytedance.frameworks.baselib.network.http.c) {
            int i = ((com.bytedance.frameworks.baselib.network.http.c) request.getExtraInfo()).k;
            if (Logger.debug()) {
                Logger.d("TNCRequestFlagHandler", "handleFlag commonParamLevelInCtx: " + i);
            }
            if (i > 0) {
                request.setCommonParamLevel(Math.max(request.getCommonParamLevel(), i));
            }
        }
        if (!this.b.get()) {
            return request;
        }
        Iterator<a> it2 = this.a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            a next = it2.next();
            Iterator<String> it3 = next.f6216c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z2 = false;
                    break;
                }
                if (l.b(request.getHost(), it3.next())) {
                    z2 = true;
                    break;
                }
            }
            if (z2 && (list = next.f6217d) != null) {
                Iterator<String> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z = false;
                        break;
                    }
                    String next2 = it4.next();
                    if (request.getPath() != null && request.getPath().startsWith(next2)) {
                        break;
                    }
                }
                if (z) {
                    if (request.getExtraInfo() == null) {
                        Request.a newBuilder = request.newBuilder();
                        newBuilder.f(new com.bytedance.ttnet.i.d());
                        request = newBuilder.a();
                    }
                    if (request.getExtraInfo() instanceof com.bytedance.frameworks.baselib.network.http.c) {
                        com.bytedance.frameworks.baselib.network.http.c cVar = (com.bytedance.frameworks.baselib.network.http.c) request.getExtraInfo();
                        cVar.h |= next.a;
                        cVar.f5090f = next.b | cVar.f5090f;
                        Request.a newBuilder2 = request.newBuilder();
                        newBuilder2.f(cVar);
                        request = newBuilder2.a();
                    }
                }
            }
        }
        if (!(request.getExtraInfo() instanceof com.bytedance.frameworks.baselib.network.http.c)) {
            return request;
        }
        int i2 = ((com.bytedance.frameworks.baselib.network.http.c) request.getExtraInfo()).f5090f;
        boolean z3 = (i2 & 2048) > 0;
        z = (i2 & 4096) > 0;
        if (!z3 && !z) {
            return request;
        }
        Request.a newBuilder3 = request.newBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(request.getHeaders());
        if (z3) {
            arrayList.add(new com.bytedance.retrofit2.client.b(Request.KEY_BYPASS_TTNET_FEATURES, PushClient.DEFAULT_REQUEST_ID));
        }
        if (z) {
            arrayList.add(new com.bytedance.retrofit2.client.b(Request.KEY_BYPASS_DISPATCH, PushClient.DEFAULT_REQUEST_ID));
        }
        newBuilder3.b(arrayList);
        return newBuilder3.a();
    }

    public void c(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("request_flag_control");
        if (optJSONArray == null) {
            return;
        }
        this.b.set(false);
        this.a.clear();
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                int optInt = jSONObject2.optInt("cronet_flags");
                int optInt2 = jSONObject2.optInt("ttnet_flags");
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("prefix_group");
                JSONArray optJSONArray3 = jSONObject2.optJSONArray("host_group");
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList2.add(optJSONArray2.optString(i2, ""));
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray3 != null) {
                    for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                        arrayList3.add(optJSONArray3.optString(i3, ""));
                    }
                }
                if ((optInt > 0 || optInt2 > 0) && !arrayList2.isEmpty() && !arrayList3.isEmpty()) {
                    arrayList.add(new a(optInt, optInt2, arrayList3, arrayList2));
                    if (Logger.debug()) {
                        Logger.d("TNCRequestFlagHandler", "paths: " + arrayList2);
                        Logger.d("TNCRequestFlagHandler", "hosts: " + arrayList3);
                        Logger.d("TNCRequestFlagHandler", "flag: " + optInt);
                        Logger.d("TNCRequestFlagHandler", "type flag: " + optInt2);
                    }
                }
            }
            if (jSONObject.optInt("req_flag_ctl_enabled") <= 0 || arrayList.size() <= 0) {
                return;
            }
            this.a.addAll(arrayList);
            this.b.set(true);
        } catch (JSONException unused) {
        }
    }
}
