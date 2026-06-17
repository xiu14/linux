package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class l {
    private static final Map<String, Long> a = new HashMap();

    public static boolean a(byte[] bArr, String str) {
        boolean z = false;
        if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            String a2 = com.xiaomi.push.bm.a(bArr);
            if (!TextUtils.isEmpty(a2)) {
                Map<String, Long> map = a;
                synchronized (map) {
                    if (map.get(a2 + str) != null) {
                        z = true;
                    } else {
                        map.put(a2 + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    a();
                }
            }
        }
        return z;
    }

    private static void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (elapsedRealtime - entry.getValue().longValue() > com.heytap.mcssdk.constant.a.f6886d) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a.remove((String) it2.next());
        }
    }
}
