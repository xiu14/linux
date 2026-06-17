package org.chromium;

import com.ttnet.org.chromium.net.v;

/* loaded from: classes2.dex */
public class g implements v.a {
    private static volatile g a;

    private g() {
    }

    public static g a() {
        if (a == null) {
            synchronized (g.class) {
                if (a == null) {
                    a = new g();
                }
            }
        }
        return a;
    }
}
