package com.vivo.push.e;

import com.vivo.push.restructure.request.a.a.c;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
final class c implements c.a<b> {
    c() {
    }

    private static b b(String str) {
        try {
            return new b(new com.vivo.push.restructure.request.a.a.a(str));
        } catch (Exception e2) {
            t.a(8101, e2.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.restructure.request.a.a.c.a
    public final /* synthetic */ com.vivo.push.restructure.request.a.a.c a(String str) {
        return b(str);
    }
}
