package com.bytedance.apm6.perf.base.model;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class ThreadStatInfo {
    public long threadCpuTime;
    public String threadName;

    public ThreadStatInfo(String str, long j) {
        this.threadName = str;
        this.threadCpuTime = j;
    }
}
