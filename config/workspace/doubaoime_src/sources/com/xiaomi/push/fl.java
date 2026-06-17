package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes2.dex */
class fl extends fj {
    protected fl(final Context context) {
        super(context, new fq() { // from class: com.xiaomi.push.fl.1
            @Override // com.xiaomi.push.fq
            public long a() {
                return com.xiaomi.push.service.p.a(context).m814a();
            }

            @Override // com.xiaomi.push.fq
            /* renamed from: b */
            public long mo801b() {
                return com.xiaomi.push.service.p.a(context).b();
            }
        });
    }
}
