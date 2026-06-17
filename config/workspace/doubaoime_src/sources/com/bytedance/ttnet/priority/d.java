package com.bytedance.ttnet.priority;

import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.asynctask.NetworkAsyncTaskType;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.priority.TTHttpCallPriorityControl;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends TTHttpCallPriorityControl.a {
    private final f h = new f();
    private final Set<String> i = new CopyOnWriteArraySet();
    private final Set<String> j = new CopyOnWriteArraySet();
    private final Set<String> k = new CopyOnWriteArraySet();
    private int l = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
    private int m = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
    private final AtomicLong n = new AtomicLong(0);
    private final Set<Request> o = new CopyOnWriteArraySet();

    class a extends com.bytedance.frameworks.baselib.network.asynctask.b {
        final /* synthetic */ Request a;

        a(Request request) {
            this.a = request;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.o.remove(this.a) && d.this.o.size() == 0) {
                d.this.a.f();
            }
        }
    }

    private boolean j(Request request) throws com.bytedance.frameworks.baselib.network.http.l.b {
        this.h.c(request);
        boolean z = false;
        if (TTHttpCallPriorityControl.i(this.i, request.getPath())) {
            this.n.set(System.currentTimeMillis());
            this.o.add(request);
            return false;
        }
        if (System.currentTimeMillis() - this.n.get() <= this.l && !this.o.isEmpty()) {
            if (!this.j.isEmpty()) {
                return TTHttpCallPriorityControl.i(this.j, request.getPath());
            }
            z = true;
            if (!this.k.isEmpty()) {
                return !TTHttpCallPriorityControl.i(this.k, request.getPath());
            }
        }
        return z;
    }

    @Override // com.bytedance.retrofit2.T.a
    public boolean a(Request request, Executor executor, Runnable runnable) throws Exception {
        if (j(request)) {
            return this.a.g(request, false, this.m, runnable, executor);
        }
        return false;
    }

    @Override // com.bytedance.retrofit2.T.a
    public void b(Request request) throws Exception {
        if (j(request)) {
            this.a.h(request, false, this.m);
        }
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a, com.bytedance.retrofit2.T.a
    public void c(Request request) {
        com.bytedance.frameworks.baselib.network.asynctask.c.d(NetworkAsyncTaskType.NETWORK).e(new a(request));
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    public boolean f(JSONObject jSONObject) {
        super.f(jSONObject);
        this.h.a(jSONObject);
        this.a.d(jSONObject, this.b);
        JSONArray optJSONArray = jSONObject.optJSONArray("p0");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.i.add(optString);
                }
            }
        }
        if (!this.h.b() && this.i.isEmpty()) {
            return false;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("bl_for_runtime");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                String optString2 = optJSONArray2.optString(i2);
                if (!TextUtils.isEmpty(optString2)) {
                    this.j.add(optString2);
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("wl_for_runtime");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                String optString3 = optJSONArray3.optString(i3);
                if (!TextUtils.isEmpty(optString3)) {
                    this.k.add(optString3);
                }
            }
        }
        this.l = jSONObject.optInt("p0_check_max_ms", DownloadSettingValues.SYNC_INTERVAL_MS_FG);
        this.m = jSONObject.optInt("p1_wait_max_ms", DownloadSettingValues.SYNC_INTERVAL_MS_FG);
        return true;
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    public void g() {
        super.g();
        this.a.f();
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    TTHttpCallPriorityControl.ModeType h() {
        return TTHttpCallPriorityControl.ModeType.RUNTIME_DELAY;
    }
}
