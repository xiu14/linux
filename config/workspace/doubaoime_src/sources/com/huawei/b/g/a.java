package com.huawei.b.g;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public abstract class a implements com.huawei.b.d {
    private static final Map<String, a> a = new HashMap();
    private static final Object b = new Object();

    public static a d(Context context) {
        a aVar;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        synchronized (b) {
            Map<String, a> map = a;
            aVar = map.get(packageName);
            if (aVar == null) {
                aVar = new com.huawei.b.g.e.c(context, packageName);
                map.put(packageName, aVar);
            }
        }
        return aVar;
    }
}
