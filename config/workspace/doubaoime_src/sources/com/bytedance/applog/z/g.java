package com.bytedance.applog.z;

import android.annotation.SuppressLint;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends a {
    g(int i, Set<String> set, Map<String, List<Set<String>>> map, Map<String, List<Map<String, Object>>> map2) {
        super(i, set, map, map2);
    }

    @Override // com.bytedance.applog.z.a
    @SuppressLint({"[ByDesign7.4]WeakPRNG"})
    boolean d(b bVar) {
        int a = a();
        if (a < 0) {
            return true;
        }
        return a <= 0 && new Random().nextInt(10000) >= this.a;
    }
}
