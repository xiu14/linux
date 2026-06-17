package com.xiaomi.push;

import com.xiaomi.push.ai;

/* loaded from: classes2.dex */
public class hn {
    private static ai a = new ai(true, 20);

    public static void a(final Runnable runnable) {
        a.a(new ai.b() { // from class: com.xiaomi.push.hn.1
            @Override // com.xiaomi.push.ai.b
            public void b() {
                runnable.run();
            }
        });
    }

    public static void a(ai.b bVar) {
        a.a(bVar);
    }

    public static void a(ai.b bVar, long j) {
        a.a(bVar, j);
    }
}
