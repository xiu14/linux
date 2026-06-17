package com.bytedance.apm6.cpu;

import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class a {
    private static volatile a b;
    private CopyOnWriteArraySet<String> a = new CopyOnWriteArraySet<>();

    private a() {
    }

    public static a c() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public CopyOnWriteArraySet<String> a() {
        return this.a;
    }

    public String b() {
        String e2 = com.bytedance.android.input.k.b.a.e(this.a.toArray(), "#");
        return !TextUtils.isEmpty(e2) ? e2 : "";
    }
}
