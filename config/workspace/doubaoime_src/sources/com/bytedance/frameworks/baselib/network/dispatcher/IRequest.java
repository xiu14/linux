package com.bytedance.frameworks.baselib.network.dispatcher;

/* loaded from: classes.dex */
public interface IRequest {

    public enum Priority {
        LOWEST,
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    Priority a();

    int b();
}
