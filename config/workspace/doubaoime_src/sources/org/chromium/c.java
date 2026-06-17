package org.chromium;

import com.ttnet.org.chromium.net.x;

/* loaded from: classes2.dex */
public class c extends x {
    private static c a;

    private c() {
    }

    public static c a() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }
}
