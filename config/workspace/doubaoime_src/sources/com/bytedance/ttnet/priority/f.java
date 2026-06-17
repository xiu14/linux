package com.bytedance.ttnet.priority;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {
    private final Set<String> a = new CopyOnWriteArraySet();

    public void a(JSONObject jSONObject) {
        this.a.clear();
        JSONArray optJSONArray = jSONObject.optJSONArray("dl");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.a.add(optString);
                }
            }
        }
    }

    public boolean b() {
        return this.a.size() > 0;
    }

    public void c(Request request) throws com.bytedance.frameworks.baselib.network.http.l.b {
        if (TTHttpCallPriorityControl.i(this.a, request.getPath())) {
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("check drop and match ");
                M.append(request.getPath());
                Logger.d("RequestDropController", M.toString());
            }
            throw new com.bytedance.frameworks.baselib.network.http.l.b();
        }
    }
}
