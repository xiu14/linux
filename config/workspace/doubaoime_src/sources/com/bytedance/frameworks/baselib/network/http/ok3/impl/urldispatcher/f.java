package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends DispatchStrategy {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f5215c;

    public f(JSONObject jSONObject) {
        super(DispatchStrategy.DispatchStrategyType.REQUEST_HEADER_DISPATCH_STRATEGY);
        this.f5215c = new HashMap();
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                this.f5215c.put(next, optString);
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    public void a(k kVar) {
        if (kVar.b() != null) {
            for (Map.Entry<String, String> entry : this.f5215c.entrySet()) {
                kVar.b().add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    public String d(Uri uri) {
        return uri.toString();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    public boolean e() {
        return false;
    }
}
