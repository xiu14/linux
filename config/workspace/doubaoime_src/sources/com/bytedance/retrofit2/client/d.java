package com.bytedance.retrofit2.client;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface d {
    void cancel();

    c execute() throws IOException;

    boolean setThrottleNetSpeed(long j);
}
