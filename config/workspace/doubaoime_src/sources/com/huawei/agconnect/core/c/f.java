package com.huawei.agconnect.core.c;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f {
    private static Map<Class<?>, com.huawei.agconnect.core.a> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static Map<Class<?>, Object> f6948c = new HashMap();
    private Map<Class<?>, com.huawei.agconnect.core.a> a = new HashMap();

    f(List<com.huawei.agconnect.core.a> list, Context context) {
        new HashMap();
        a(list, context);
    }

    public void a(List<com.huawei.agconnect.core.a> list, Context context) {
        Log.d("AGC_ServiceRepository", "addService start");
        if (list == null) {
            return;
        }
        for (com.huawei.agconnect.core.a aVar : list) {
            Objects.requireNonNull(aVar);
            this.a.put(null, aVar);
        }
        Log.d("AGC_ServiceRepository", "addService end");
    }
}
