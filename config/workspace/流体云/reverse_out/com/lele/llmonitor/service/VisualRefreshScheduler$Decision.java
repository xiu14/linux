package com.lele.llmonitor.service;
public final class VisualRefreshScheduler$Decision {
    public static final int $stable;
    private final boolean shouldPublish;
    private final long targetDelayMs;

    public VisualRefreshScheduler$Decision(boolean p1, long p2)
    {
        this.shouldPublish = p1;
        this.targetDelayMs = p2;
        return;
    }

    public static synthetic com.lele.llmonitor.service.VisualRefreshScheduler$Decision copy$default(com.lele.llmonitor.service.VisualRefreshScheduler$Decision p0, boolean p1, long p2, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.shouldPublish;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.targetDelayMs;
        }
        return p0.copy(p1, p2);
    }

    public final boolean component1()
    {
        return this.shouldPublish;
    }

    public final long component2()
    {
        return this.targetDelayMs;
    }

    public final com.lele.llmonitor.service.VisualRefreshScheduler$Decision copy(boolean p1, long p2)
    {
        this = new com.lele.llmonitor.service.VisualRefreshScheduler$Decision;
        this(p1, p2);
        return this;
    }

    public boolean equals(Object p6)
    {
        if (this != p6) {
            if ((p6 instanceof com.lele.llmonitor.service.VisualRefreshScheduler$Decision)) {
                if (this.shouldPublish == ((com.lele.llmonitor.service.VisualRefreshScheduler$Decision) p6).shouldPublish) {
                    if (this.targetDelayMs == ((com.lele.llmonitor.service.VisualRefreshScheduler$Decision) p6).targetDelayMs) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final boolean getShouldPublish()
    {
        return this.shouldPublish;
    }

    public final long getTargetDelayMs()
    {
        return this.targetDelayMs;
    }

    public int hashCode()
    {
        return (Long.hashCode(this.targetDelayMs) + (Boolean.hashCode(this.shouldPublish) * 31));
    }

    public String toString()
    {
        String v0_0 = this.shouldPublish;
        long v1 = this.targetDelayMs;
        String v4_2 = new StringBuilder;
        v4_2("Decision(shouldPublish=");
        v4_2.append(v0_0);
        v4_2.append(", targetDelayMs=");
        v4_2.append(v1);
        v4_2.append(")");
        return v4_2.toString();
    }
}
