package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy;

/* loaded from: classes.dex */
public class a extends DispatchStrategy {
    public a() {
        super(DispatchStrategy.DispatchStrategyType.UNKNOWN_DISPATCH_STRATEGY);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    public void a(k kVar) {
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
