package com.bytedance.applog.z;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class f extends a {
    f(int i, Set<String> set, Map<String, List<Set<String>>> map, Map<String, List<Map<String, Object>>> map2) {
        super(i, set, map, map2);
    }

    @Override // com.bytedance.applog.z.a
    boolean d(b bVar) {
        int a = a();
        if (a < 0) {
            return true;
        }
        if (a <= 0 && bVar != null && !TextUtils.isEmpty(bVar.b())) {
            try {
                return Long.parseLong(bVar.b()) % com.heytap.mcssdk.constant.a.q >= ((long) this.a);
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }
}
