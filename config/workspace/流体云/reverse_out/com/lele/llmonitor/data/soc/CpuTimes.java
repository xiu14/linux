package com.lele.llmonitor.data.soc;
public final class CpuTimes {
    public static final int $stable;
    private final long idle;
    private final long total;

    public CpuTimes(long p1, long p3)
    {
        this.total = p1;
        this.idle = p3;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.CpuTimes copy$default(com.lele.llmonitor.data.soc.CpuTimes p0, long p1, long p3, int p5, Object p6)
    {
        if ((p5 & 1) != 0) {
            p1 = p0.total;
        }
        if ((p5 & 2) != 0) {
            p3 = p0.idle;
        }
        return p0.copy(p1, p3);
    }

    public final long component1()
    {
        return this.total;
    }

    public final long component2()
    {
        return this.idle;
    }

    public final com.lele.llmonitor.data.soc.CpuTimes copy(long p1, long p3)
    {
        this = new com.lele.llmonitor.data.soc.CpuTimes;
        this(p1, p3);
        return this;
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.lele.llmonitor.data.soc.CpuTimes)) {
                if (this.total == ((com.lele.llmonitor.data.soc.CpuTimes) p8).total) {
                    if (this.idle == ((com.lele.llmonitor.data.soc.CpuTimes) p8).idle) {
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

    public final long getIdle()
    {
        return this.idle;
    }

    public final long getTotal()
    {
        return this.total;
    }

    public int hashCode()
    {
        return (Long.hashCode(this.idle) + (Long.hashCode(this.total) * 31));
    }

    public String toString()
    {
        String v0_0 = this.total;
        long v2 = this.idle;
        String v5_2 = new StringBuilder;
        v5_2("CpuTimes(total=");
        v5_2.append(v0_0);
        v5_2.append(", idle=");
        v5_2.append(v2);
        v5_2.append(")");
        return v5_2.toString();
    }
}
