package com.bytedance.common.g.b;

import com.bytedance.common.c.g;
import com.bytedance.common.utility.e;
import com.bytedance.push.g0.f;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f4142c;
    private final e b = new com.bytedance.common.c.a();

    private c() {
    }

    public static c f() {
        if (f4142c == null) {
            synchronized (c.class) {
                if (f4142c == null) {
                    f4142c = new c();
                }
            }
        }
        return f4142c;
    }

    private e g() {
        e networkClient = com.bytedance.common.g.a.c().e().c().o.getNetworkClient();
        if (networkClient != null) {
            return networkClient;
        }
        e b = e.b();
        if (!b.getClass().getName().contains("DummyNetworkClient")) {
            return b;
        }
        f.m("PushNetworkClient", "use DefaultNetWorkClient as backup networkClient because NetworkClient.getDefault() is DummyNetworkClient");
        return ((PushOnlineSettings) h.b(com.ss.android.message.a.a(), PushOnlineSettings.class)).O().a ? new g() : this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bytedance.common.utility.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, com.bytedance.common.utility.e.a r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.g.b.c.a(java.lang.String, java.util.Map, com.bytedance.common.utility.e$a):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.common.utility.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c(java.lang.String r14, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r15, java.util.Map<java.lang.String, java.lang.String> r16, com.bytedance.common.utility.e.a r17) throws com.bytedance.common.utility.a {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.g.b.c.c(java.lang.String, java.util.List, java.util.Map, com.bytedance.common.utility.e$a):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    @Override // com.bytedance.common.utility.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String d(java.lang.String r12, byte[] r13, java.util.Map<java.lang.String, java.lang.String> r14, com.bytedance.common.utility.e.a r15) throws com.bytedance.common.utility.a {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.g.b.c.d(java.lang.String, byte[], java.util.Map, com.bytedance.common.utility.e$a):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String h(java.lang.String r14, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r15, java.util.Map<java.lang.String, java.lang.String> r16, com.bytedance.common.utility.e.a r17, org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.g.b.c.h(java.lang.String, java.util.List, java.util.Map, com.bytedance.common.utility.e$a, org.json.JSONObject):java.lang.String");
    }
}
