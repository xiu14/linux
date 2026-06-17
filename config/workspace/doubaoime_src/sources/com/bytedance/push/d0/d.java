package com.bytedance.push.d0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.settings.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class d {
    private static Map<Integer, com.bytedance.push.R.g> a;

    @SuppressLint({"CI_UseSparseArrays"})
    private static void a(Context context) {
        if (a != null) {
            return;
        }
        List<com.bytedance.push.R.g> l0 = ((LocalFrequencySettings) h.b(context, LocalFrequencySettings.class)).l0();
        if (l0 == null) {
            a = new HashMap();
            return;
        }
        HashMap hashMap = new HashMap();
        for (com.bytedance.push.R.g gVar : l0) {
            if (gVar != null) {
                hashMap.put(Integer.valueOf(gVar.f5590e), gVar);
            }
        }
        a = hashMap;
    }

    public static synchronized Map<Integer, com.bytedance.push.R.g> b(Context context) {
        synchronized (d.class) {
            a(context);
            Map<Integer, com.bytedance.push.R.g> map = a;
            if (map == null) {
                return null;
            }
            return Collections.unmodifiableMap(map);
        }
    }

    @Nullable
    static synchronized com.bytedance.push.R.g c(Context context, int i) {
        synchronized (d.class) {
            a(context);
            Map<Integer, com.bytedance.push.R.g> map = a;
            if (map == null) {
                return null;
            }
            return map.get(Integer.valueOf(i));
        }
    }

    static synchronized void d(Context context, com.bytedance.push.R.g gVar) {
        synchronized (d.class) {
            a(context);
            Map<Integer, com.bytedance.push.R.g> map = a;
            if (map == null) {
                return;
            }
            map.put(Integer.valueOf(gVar.f5590e), gVar);
            ((LocalFrequencySettings) h.b(context, LocalFrequencySettings.class)).K(new ArrayList(a.values()));
        }
    }
}
