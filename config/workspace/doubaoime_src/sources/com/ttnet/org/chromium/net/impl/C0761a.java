package com.ttnet.org.chromium.net.impl;

import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.ttnet.org.chromium.net.impl.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0761a extends NetworkExceptionImpl {
    public C0761a(String str, int i, int i2) {
        super(str, i, i2);
    }

    @Override // com.ttnet.org.chromium.net.impl.NetworkExceptionImpl, com.ttnet.org.chromium.net.p
    public boolean immediatelyRetryable() {
        int i = this.mCronetInternalErrorCode;
        if (i == -358 || i == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
