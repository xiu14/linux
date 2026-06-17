package com.bytedance.frameworks.baselib.network.asynctask;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b implements Runnable {
    private long mInitialDelay;
    private long mLoopInterval;
    private NetworkAsyncTaskType mTaskType;
    private TimeUnit mTimeUnit;

    public b() {
        this.mInitialDelay = 0L;
        this.mLoopInterval = 0L;
        this.mTimeUnit = TimeUnit.MILLISECONDS;
    }

    public long getInitialDelay() {
        return this.mInitialDelay;
    }

    public long getLoopInterval() {
        return this.mLoopInterval;
    }

    public NetworkAsyncTaskType getTaskType() {
        return this.mTaskType;
    }

    public TimeUnit getTimeUnit() {
        return this.mTimeUnit;
    }

    public boolean isLoop() {
        return this.mLoopInterval > 0;
    }

    public void setTaskType(NetworkAsyncTaskType networkAsyncTaskType) {
        this.mTaskType = networkAsyncTaskType;
    }

    public b(long j) {
        this.mInitialDelay = 0L;
        this.mLoopInterval = 0L;
        this.mTimeUnit = TimeUnit.MILLISECONDS;
        this.mLoopInterval = j;
    }

    public b(long j, long j2) {
        this(j2);
        this.mInitialDelay = j;
    }

    public b(long j, long j2, TimeUnit timeUnit) {
        this(j, j2);
        this.mTimeUnit = timeUnit;
    }
}
