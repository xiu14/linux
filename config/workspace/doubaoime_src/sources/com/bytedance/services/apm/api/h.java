package com.bytedance.services.apm.api;

import android.content.Context;

/* loaded from: classes2.dex */
public interface h {
    void init(Context context);

    boolean isOnlyMainProcess();

    void notifyParams(k kVar);

    void start();
}
