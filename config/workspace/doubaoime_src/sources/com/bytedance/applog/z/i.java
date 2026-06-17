package com.bytedance.applog.z;

import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class i extends a {
    i(int i, Set<String> set, Map<String, List<Set<String>>> map, Map<String, List<Map<String, Object>>> map2) {
        super(i, set, map, map2);
    }

    @Override // com.bytedance.applog.z.a
    boolean d(b bVar) {
        int a = a();
        if (a < 0) {
            return true;
        }
        if (a > 0 || bVar == null) {
            return false;
        }
        if (TextUtils.isEmpty(bVar.d())) {
            return false;
        }
        if (TextUtils.isEmpty(bVar.c())) {
            return false;
        }
        bVar.a();
        if (TextUtils.isEmpty(null)) {
            return false;
        }
        return !com.bytedance.android.input.k.b.a.V(e.a.a.a.a.v(r0, Constants.COLON_SEPARATOR, null, BundleUtil.UNDERLINE_TAG, r3), com.heytap.mcssdk.constant.a.q, this.a);
    }
}
