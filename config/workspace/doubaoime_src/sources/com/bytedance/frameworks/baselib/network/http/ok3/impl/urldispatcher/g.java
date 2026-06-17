package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends DispatchStrategy {

    /* renamed from: d, reason: collision with root package name */
    private static final String f5216d = "g";

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f5217c;

    public g(JSONObject jSONObject) {
        super(DispatchStrategy.DispatchStrategyType.STATIC_DISPATCH_STRATEGY);
        this.f5217c = new HashMap();
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                this.f5217c.put(next, optString);
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    public void a(k kVar) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    public String d(Uri uri) {
        String host = uri.getHost();
        String uri2 = uri.toString();
        String str = this.f5217c.get(host);
        if (TextUtils.isEmpty(str)) {
            return uri2;
        }
        if (Logger.debug()) {
            Logger.d(f5216d, "replace host " + str + " for " + host);
        }
        return uri2.replaceFirst(host, str);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    public boolean e() {
        return false;
    }
}
