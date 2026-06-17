package com.lele.llmonitor.service;
public final class VisualRefreshScheduler {
    public static final int $stable = 8;
    private final long defaultPollCeilingMs;
    private long lastHeartbeatTimeMs;
    private long lastNotificationTimeMs;
    private Integer lastPluggedState;
    private long lastWidgetTimeMs;
    private final long staleForceFloorMs;

    public VisualRefreshScheduler()
    {
        this(0, 0, 3, 0);
        return;
    }

    public VisualRefreshScheduler(long p1, long p3)
    {
        this.staleForceFloorMs = p1;
        this.defaultPollCeilingMs = p3;
        return;
    }

    public synthetic VisualRefreshScheduler(long p1, long p3, int p5, ic0 p6)
    {
        if ((p5 & 1) != 0) {
            p1 = 15000;
        }
        if ((p5 & 2) != 0) {
            p3 = 10000;
        }
        this(p1, p3);
        return;
    }

    public static synthetic com.lele.llmonitor.service.VisualRefreshScheduler$Decision evaluate$default(com.lele.llmonitor.service.VisualRefreshScheduler p9, long p10, long p12, int p14, long p15, int p17, Object p18)
    {
        long v2_0;
        com.lele.llmonitor.service.VisualRefreshScheduler v1;
        long v7;
        int v6;
        long v4;
        if ((p17 & 8) == 0) {
            v7 = p15;
            v1 = p9;
            v2_0 = p10;
            v4 = p12;
            v6 = p14;
        } else {
            v7 = p9.defaultPollCeilingMs;
            v1 = p9;
            v4 = p12;
            v6 = p14;
            v2_0 = p10;
        }
        return v1.evaluate(v2_0, v4, v6, v7);
    }

    public final com.lele.llmonitor.service.VisualRefreshScheduler$Decision evaluate(long p8, long p10, int p12, long p13)
    {
        int v0_2;
        int v0_0 = this.lastPluggedState;
        int v1 = 1;
        if ((v0_0 == 0) || (v0_0.intValue() == p12)) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        this.lastPluggedState = Integer.valueOf(p12);
        long v3_1 = (3 * p10);
        long v5_0 = this.staleForceFloorMs;
        if (v3_1 < v5_0) {
            v3_1 = v5_0;
        }
        if ((v0_2 == 0) && (((p8 - this.lastNotificationTimeMs) < p10) && (((p8 - this.lastWidgetTimeMs) < p10) && ((p8 - this.lastHeartbeatTimeMs) < v3_1)))) {
            v1 = 0;
        }
        long v7_2 = new com.lele.llmonitor.service.VisualRefreshScheduler$Decision;
        v7_2(v1, Math.min(p10, p13));
        return v7_2;
    }

    public final void onExternalTrigger()
    {
        this.lastNotificationTimeMs = 0;
        this.lastWidgetTimeMs = 0;
        this.lastHeartbeatTimeMs = 0;
        return;
    }

    public final void onPublishResult(long p1, boolean p3, boolean p4)
    {
        if (p3) {
            this.lastNotificationTimeMs = p1;
        }
        if (p4) {
            this.lastWidgetTimeMs = p1;
        }
        if ((!p3) && (!p4)) {
            return;
        } else {
            this.lastHeartbeatTimeMs = p1;
            return;
        }
    }
}
