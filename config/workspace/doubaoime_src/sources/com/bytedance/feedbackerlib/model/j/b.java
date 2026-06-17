package com.bytedance.feedbackerlib.model.j;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class b {
    private static volatile b b;
    private List<String> a = new CopyOnWriteArrayList();

    public static b d() {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public void a(String str) {
        this.a.add(str);
    }

    public void b() {
        this.a.clear();
    }

    public List<String> c() {
        return this.a;
    }
}
