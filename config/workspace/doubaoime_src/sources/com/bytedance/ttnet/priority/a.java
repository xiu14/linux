package com.bytedance.ttnet.priority;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.priority.TTHttpCallPriorityControl;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class a extends TTHttpCallPriorityControl.a {
    private int i(Request request) {
        List<com.bytedance.retrofit2.client.b> headers = request.headers("x-tt-request-tag");
        return j.k().b(request.getUrl(), (headers == null || headers.size() < 1 || TextUtils.isEmpty(headers.get(0).b())) ? "" : headers.get(0).b());
    }

    @Override // com.bytedance.retrofit2.T.a
    public boolean a(Request request, Executor executor, Runnable runnable) throws Exception {
        long i = i(request);
        if (Logger.debug()) {
            StringBuilder Q = e.a.a.a.a.Q("get tag delay time ", i, " ");
            Q.append(request.getPath());
            Logger.d("ModeDefault", Q.toString());
        }
        return this.a.g(request, true, i, runnable, executor);
    }

    @Override // com.bytedance.retrofit2.T.a
    public void b(Request request) throws Exception {
        long i = i(request);
        if (Logger.debug()) {
            StringBuilder Q = e.a.a.a.a.Q("get tag delay time ", i, " ");
            Q.append(request.getPath());
            Logger.d("ModeDefault", Q.toString());
        }
        this.a.h(request, true, i);
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    public void g() {
    }

    @Override // com.bytedance.ttnet.priority.TTHttpCallPriorityControl.a
    TTHttpCallPriorityControl.ModeType h() {
        return TTHttpCallPriorityControl.ModeType.DEFAULT;
    }
}
