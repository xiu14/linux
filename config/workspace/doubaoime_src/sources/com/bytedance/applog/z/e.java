package com.bytedance.applog.z;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class e extends a {
    e(int i, Set<String> set, Map<String, List<Set<String>>> map, Map<String, List<Map<String, Object>>> map2) {
        super(i, set, map, map2);
    }

    @Override // com.bytedance.applog.z.a
    boolean d(b bVar) {
        int a = a();
        if (a < 0) {
            return true;
        }
        if (a > 0 || bVar == null || TextUtils.isEmpty(bVar.b())) {
            return false;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bVar.b().getBytes());
        return crc32.getValue() % com.heytap.mcssdk.constant.a.q >= ((long) this.a);
    }
}
