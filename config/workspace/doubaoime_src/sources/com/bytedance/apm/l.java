package com.bytedance.apm;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class l {
    private static List<k> a = new ArrayList(2);

    public static synchronized void a(k kVar) {
        synchronized (l.class) {
            a.add(kVar);
        }
    }

    public static synchronized void b(com.bytedance.apm.config.e eVar) {
        synchronized (l.class) {
            for (k kVar : a) {
                if (kVar != null) {
                    kVar.b(eVar);
                }
            }
        }
    }
}
