package com.bytedance.apm6.cpu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class g {
    private static List<f> a;

    static {
        new HashMap();
        a = new LinkedList();
    }

    public static synchronized void a() {
        synchronized (g.class) {
            if (!a.isEmpty()) {
                Iterator<f> it2 = a.iterator();
                while (it2.hasNext()) {
                    e.b.b.k.b.c(it2.next());
                }
                a.clear();
            }
        }
    }
}
