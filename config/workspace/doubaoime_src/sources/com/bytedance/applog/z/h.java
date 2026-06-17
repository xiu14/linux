package com.bytedance.applog.z;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class h extends a {
    h(int i, Set<String> set, Map<String, List<Set<String>>> map, Map<String, List<Map<String, Object>>> map2) {
        super(i, set, map, map2);
    }

    @Override // com.bytedance.applog.z.a
    boolean d(b bVar) {
        int a = a();
        if (a < 0) {
            return true;
        }
        if (a > 0 || bVar == null || TextUtils.isEmpty(bVar.d()) || TextUtils.isEmpty(bVar.b())) {
            return false;
        }
        return !com.bytedance.android.input.k.b.a.V(bVar.d() + Constants.COLON_SEPARATOR + bVar.b(), com.heytap.mcssdk.constant.a.q, this.a);
    }
}
