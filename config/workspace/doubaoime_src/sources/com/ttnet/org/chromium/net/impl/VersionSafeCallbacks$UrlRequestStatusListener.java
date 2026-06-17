package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.F;

/* loaded from: classes2.dex */
public final class VersionSafeCallbacks$UrlRequestStatusListener extends F.c {
    private final F.c a;

    public VersionSafeCallbacks$UrlRequestStatusListener(F.c cVar) {
        this.a = cVar;
    }

    @Override // com.ttnet.org.chromium.net.F.c
    public void onStatus(int i) {
        this.a.onStatus(i);
    }
}
