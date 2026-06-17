package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends i {
    private static final String r = "e";
    private DispatchStrategy q;

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.i
    public BaseDispatchAction.DispatchResultEnum k(k kVar, String str, List<String> list) {
        DispatchStrategy dispatchStrategy;
        if (Logger.debug()) {
            String str2 = r;
            StringBuilder M = e.a.a.a.a.M("dispatch action ");
            M.append(this.q.c());
            Logger.d(str2, M.toString());
        }
        BaseDispatchAction.DispatchResultEnum dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        Uri parse = Uri.parse(str);
        if (parse.getHost() != null && h(parse) && (dispatchStrategy = this.q) != null) {
            dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_HIT;
            if (dispatchStrategy.c() == DispatchStrategy.DispatchStrategyType.REQUEST_HEADER_DISPATCH_STRATEGY) {
                this.q.a(kVar);
                list.set(0, str);
                return dispatchResultEnum;
            }
            String d2 = this.q.d(parse);
            if (str.equals(d2)) {
                list.set(0, str);
            } else {
                list.set(0, d2);
            }
        }
        return dispatchResultEnum;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.i
    public int l() {
        return this.q.c().ordinal();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.i
    protected boolean n(JSONObject jSONObject, List<Boolean> list, String str, long j) {
        i(jSONObject);
        String optString = jSONObject.optString("service_name");
        if (!TextUtils.isEmpty(optString)) {
            this.l = optString;
        }
        int optInt = jSONObject.optInt("dispatch_strategy", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("strategy_info");
        if (optInt < 0 || optInt > 6) {
            this.q = null;
            return false;
        }
        DispatchStrategy b = DispatchStrategy.b(DispatchStrategy.DispatchStrategyType.values()[optInt], optJSONObject);
        this.q = b;
        list.set(0, Boolean.valueOf(b.e()));
        return true;
    }
}
