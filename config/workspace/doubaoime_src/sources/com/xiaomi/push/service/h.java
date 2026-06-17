package com.xiaomi.push.service;

import com.xiaomi.push.it;

/* loaded from: classes2.dex */
public class h {
    private static a a;

    /* renamed from: a, reason: collision with other field name */
    private static b f1110a;

    public interface a {
        boolean a(it itVar);
    }

    public interface b {
        void a(it itVar, boolean z);
    }

    public static void a(b bVar) {
        f1110a = bVar;
    }

    public static void a(it itVar) {
        a(itVar, false);
    }

    public static void a(it itVar, boolean z) {
        if (f1110a != null && itVar != null) {
            if (!com.xiaomi.push.k.m655a(com.xiaomi.push.t.m841a())) {
                com.xiaomi.channel.commonutils.logger.c.m15a("rp app not permission to cpra");
                return;
            } else {
                f1110a.a(itVar, z);
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("rp params is null, not cpra");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m794a(it itVar) {
        if (a != null && itVar != null) {
            if (!com.xiaomi.push.k.m655a(com.xiaomi.push.t.m841a())) {
                com.xiaomi.channel.commonutils.logger.c.m15a("rc app not permission to cpra");
                return false;
            }
            return a.a(itVar);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("rc params is null, not cpra");
        return false;
    }
}
