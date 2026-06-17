package com.ttnet.org.chromium.net.impl;

/* loaded from: classes2.dex */
public class D extends com.ttnet.org.chromium.net.r {
    private final int a;
    private final NetworkExceptionImpl b;

    public D(String str, int i, int i2, int i3) {
        super(str, null);
        this.b = new NetworkExceptionImpl(str, i, i2);
        this.a = i3;
    }

    @Override // com.ttnet.org.chromium.net.p
    public int getCronetInternalErrorCode() {
        return this.b.getCronetInternalErrorCode();
    }

    @Override // com.ttnet.org.chromium.net.p
    public int getErrorCode() {
        return this.b.getErrorCode();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b.getMessage() + ", QuicDetailedErrorCode=" + this.a;
    }

    @Override // com.ttnet.org.chromium.net.p
    public boolean immediatelyRetryable() {
        return this.b.immediatelyRetryable();
    }
}
