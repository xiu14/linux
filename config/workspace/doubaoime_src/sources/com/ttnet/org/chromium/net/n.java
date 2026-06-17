package com.ttnet.org.chromium.net;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class n extends RejectedExecutionException {
    public n() {
        super("Inline execution is prohibited for this request");
    }
}
