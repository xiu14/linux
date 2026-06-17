package com.bytedance.crash.a0;

import com.bytedance.crash.a0.a;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
class b implements Comparator<Map.Entry<Integer, a.c>> {
    b(a aVar) {
    }

    @Override // java.util.Comparator
    public int compare(Map.Entry<Integer, a.c> entry, Map.Entry<Integer, a.c> entry2) {
        long j = entry.getValue().f4556e - entry2.getValue().f4556e;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }
}
