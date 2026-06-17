package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import com.bytedance.common.utility.Logger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class DispatchStrategy {
    private static final String b = "DispatchStrategy";
    private DispatchStrategyType a;

    public enum DispatchStrategyType {
        UNKNOWN_DISPATCH_STRATEGY,
        STATIC_DISPATCH_STRATEGY,
        WRR_DISPATCH_STRATEGY,
        CONSERVATIVE_DISPATCH_STRATEGY,
        OPTIMIZED_DISPATCH_STRATEGY,
        ROUTE_SELECTION_DISPATCH_STRATEGY,
        REQUEST_HEADER_DISPATCH_STRATEGY,
        DISPATCH_STRATEGY_SUPPORTED_LAST
    }

    public DispatchStrategy(DispatchStrategyType dispatchStrategyType) {
        this.a = dispatchStrategyType;
    }

    public static DispatchStrategy b(DispatchStrategyType dispatchStrategyType, JSONObject jSONObject) {
        int ordinal = dispatchStrategyType.ordinal();
        if (ordinal == 1) {
            return new g(jSONObject);
        }
        if (ordinal == 6) {
            return new f(jSONObject);
        }
        if (Logger.debug()) {
            Logger.d(b, "dispatch strategy " + dispatchStrategyType + " is not supported, fallback to default strategy");
        }
        return new a();
    }

    public abstract void a(k kVar);

    public DispatchStrategyType c() {
        return this.a;
    }

    public abstract String d(Uri uri);

    public abstract boolean e();
}
