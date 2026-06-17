package com.bytedance.lego.init;

/* loaded from: classes.dex */
public final class IdleTaskConfig {
    public static final a Companion = new a(null);
    private static final IdleTaskConfig DEFAULT_IDLETASK_CONFIG = new IdleTaskConfig(0, 0, false, 0, 15, null);
    private static final long IDLE_START_TIME_OUT = 15000;
    private final boolean autoIdleTask;
    private final long bootFinishTimeOut;
    private final int nonUIThreadTaskNum;
    private final int uiThreadTaskNum;

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }
    }

    public IdleTaskConfig() {
        this(0, 0, false, 0L, 15, null);
    }

    public IdleTaskConfig(int i, int i2, boolean z, long j) {
        this.uiThreadTaskNum = i;
        this.nonUIThreadTaskNum = i2;
        this.autoIdleTask = z;
        this.bootFinishTimeOut = j;
    }

    public final boolean getAutoIdleTask() {
        return this.autoIdleTask;
    }

    public final long getBootFinishTimeOut() {
        return this.bootFinishTimeOut;
    }

    public final int getNonUIThreadTaskNum() {
        return this.nonUIThreadTaskNum;
    }

    public final int getUiThreadTaskNum() {
        return this.uiThreadTaskNum;
    }

    public /* synthetic */ IdleTaskConfig(int i, int i2, boolean z, long j, int i3, kotlin.s.c.g gVar) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) == 0 ? i2 : 1, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? IDLE_START_TIME_OUT : j);
    }
}
