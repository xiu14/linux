package com.bytedance.bdinstall.util;

import java.util.UUID;

/* loaded from: classes.dex */
final class l extends p<String> {
    l() {
    }

    @Override // com.bytedance.bdinstall.util.p
    protected String a(Object[] objArr) {
        return UUID.randomUUID().toString();
    }
}
