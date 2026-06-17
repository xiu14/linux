package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.TTDelayStateManager;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends BaseDispatchAction {
    private static final String t = "b";
    private int p = 0;
    private int q = 0;
    private int r = 0;
    private final Map<String, Set<String>> s = new HashMap();

    private int k() {
        int i = this.p;
        if (i > 0) {
            return i;
        }
        if (this.q < this.r) {
            return new Random().nextInt(this.r - this.q) + this.q;
        }
        return 0;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction
    public boolean d(JSONObject jSONObject, String str, long j) {
        int i;
        int i2;
        i(jSONObject);
        String optString = jSONObject.optString("tag");
        int i3 = 0;
        if (!TextUtils.isEmpty(optString)) {
            for (String str2 : optString.split(";")) {
                ArrayList arrayList = new ArrayList();
                if (com.bytedance.frameworks.baselib.network.http.p.h.d(str2, Constants.ACCEPT_TIME_SEPARATOR_SP, ContainerUtils.KEY_VALUE_DELIMITER, arrayList)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        Set<String> set = this.s.get(pair.first);
                        if (set == null) {
                            set = new HashSet<>();
                        }
                        set.add((String) pair.second);
                        this.s.put((String) pair.first, set);
                    }
                }
            }
        }
        this.p = jSONObject.optInt("delay");
        JSONArray optJSONArray = jSONObject.optJSONArray("random");
        if (this.p > 0 || optJSONArray == null) {
            i = 0;
        } else {
            if (optJSONArray.length() != 2) {
                return false;
            }
            try {
                i2 = optJSONArray.getInt(0);
                try {
                    i = optJSONArray.getInt(1);
                } catch (JSONException e2) {
                    e = e2;
                    e.printStackTrace();
                    i = 0;
                    if (i2 > 0) {
                    }
                    return false;
                }
            } catch (JSONException e3) {
                e = e3;
                i2 = 0;
            }
            if (i2 > 0 || i <= 0 || i2 >= i) {
                return false;
            }
            i3 = i2;
        }
        this.q = i3;
        this.r = i;
        if (Logger.debug()) {
            String str3 = t;
            StringBuilder M = e.a.a.a.a.M("initwithparam tnc tag map is ");
            M.append(this.s);
            Logger.d(str3, M.toString());
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseDispatchAction.DispatchResultEnum l(String str, String str2, List<Integer> list) {
        if (Logger.debug()) {
            Logger.d(t, "take delay action");
        }
        if (!f() || TextUtils.isEmpty(str)) {
            list.set(0, 0);
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        }
        Uri parse = Uri.parse(str);
        if (parse.getHost() == null || !h(parse)) {
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        }
        if (this.s.isEmpty()) {
            list.set(0, Integer.valueOf(k()));
            if (Logger.debug()) {
                String str3 = t;
                StringBuilder M = e.a.a.a.a.M("tnc tag map is empty, result delay time is ");
                M.append(list.get(0));
                Logger.d(str3, M.toString());
            }
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_DELAY;
        }
        if (!TTDelayStateManager.c()) {
            if (Logger.debug()) {
                Logger.d(t, "this action with tag is not enabled");
            }
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        }
        if ("".equals(str2)) {
            str2 = "s=0;p=0";
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!com.bytedance.frameworks.baselib.network.http.p.h.d(str2, ";", ContainerUtils.KEY_VALUE_DELIMITER, arrayList)) {
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            hashMap.put((String) pair.first, (String) pair.second);
        }
        TTDelayStateManager.AppStartState appStartState = TTDelayStateManager.AppStartState.NormalStart;
        String num = Integer.toString(appStartState.getValue());
        if (TTDelayStateManager.a() != appStartState) {
            num = Integer.toString(TTDelayStateManager.b().getValue());
        }
        hashMap.put("s", num);
        Context a = j.k().a();
        hashMap.put("p", Integer.toString((a != null ? com.bytedance.frameworks.baselib.network.http.p.i.c(a) : 1) ^ 1));
        if (Logger.debug()) {
            e.a.a.a.a.s0("request tag string is ", str2, t);
        }
        BaseDispatchAction.DispatchResultEnum dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_DELAY;
        Iterator<Map.Entry<String, Set<String>>> it3 = this.s.entrySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry<String, Set<String>> next = it3.next();
            String str4 = (String) hashMap.get(next.getKey());
            if (str4 == null) {
                dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
                break;
            }
            if (!next.getValue().contains(str4)) {
                dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
                break;
            }
        }
        if (dispatchResultEnum == BaseDispatchAction.DispatchResultEnum.DISPATCH_DELAY) {
            list.set(0, Integer.valueOf(k()));
        }
        if (Logger.debug()) {
            String str5 = t;
            Logger.d(str5, "match tag result is " + dispatchResultEnum);
            Logger.d(str5, "will delay time is " + list.get(0));
            Logger.d(str5, "request tag map is " + hashMap);
            Logger.d(str5, "tnc tag map is " + this.s);
        }
        return dispatchResultEnum;
    }
}
