package com.bytedance.apm.t;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e {
    private static List<d> a = new ArrayList(2);

    public static synchronized void a(d dVar) {
        synchronized (e.class) {
            a.add(dVar);
        }
    }

    public static synchronized void b(boolean z, long j) {
        synchronized (e.class) {
            for (d dVar : a) {
                if (dVar != null) {
                    dVar.a(z, j);
                }
            }
        }
    }
}
