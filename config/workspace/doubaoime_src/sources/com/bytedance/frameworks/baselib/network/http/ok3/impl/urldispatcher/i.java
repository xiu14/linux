package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class i extends BaseDispatchAction {
    private boolean p = false;

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction
    public boolean d(JSONObject jSONObject, String str, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, Boolean.FALSE);
        boolean n = n(jSONObject, arrayList, str, j);
        this.p = ((Boolean) arrayList.get(0)).booleanValue();
        return n;
    }

    public abstract BaseDispatchAction.DispatchResultEnum k(k kVar, String str, List<String> list);

    public abstract int l();

    public int m() {
        return -555;
    }

    protected abstract boolean n(JSONObject jSONObject, List<Boolean> list, String str, long j);

    public BaseDispatchAction.DispatchResultEnum o(k kVar, String str, List<String> list, List<c> list2) {
        if (!e(kVar) || TextUtils.isEmpty(str)) {
            list.set(0, str);
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        }
        BaseDispatchAction.DispatchResultEnum k = k(kVar, str, list);
        c cVar = new c();
        if (k != BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE) {
            cVar.f5209d = true;
            cVar.b = c();
            cVar.f5208c = b();
            cVar.f5210e = l();
            cVar.a = this.l;
            if (k == BaseDispatchAction.DispatchResultEnum.DISPATCH_HIT) {
                cVar.f5212g = list.get(0);
                cVar.f5211f = this.p;
            }
            kVar.e(this.m);
        }
        list2.add(cVar);
        return k;
    }
}
