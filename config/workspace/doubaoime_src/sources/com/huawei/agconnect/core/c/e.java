package com.huawei.agconnect.core.c;

import android.content.Context;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {
    private final Context a;

    private static class b implements Serializable, Comparator<Map.Entry<String, Integer>> {
        b(a aVar) {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    e(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.huawei.agconnect.core.a> a() {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.core.c.e.a():java.util.List");
    }
}
