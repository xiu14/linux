package com.lele.llmonitor.data.soc;
public final class CpuUsageResult {
    public static final int $stable = 8;
    private final com.lele.llmonitor.data.soc.CpuTimes nextCpuTimes;
    private final java.util.List probes;
    private final Float usagePercent;

    public CpuUsageResult(Float p1, com.lele.llmonitor.data.soc.CpuTimes p2, java.util.List p3)
    {
        p3.getClass();
        this.usagePercent = p1;
        this.nextCpuTimes = p2;
        this.probes = p3;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.CpuUsageResult copy$default(com.lele.llmonitor.data.soc.CpuUsageResult p0, Float p1, com.lele.llmonitor.data.soc.CpuTimes p2, java.util.List p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.usagePercent;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.nextCpuTimes;
        }
        if ((p4 & 4) != 0) {
            p3 = p0.probes;
        }
        return p0.copy(p1, p2, p3);
    }

    public final Float component1()
    {
        return this.usagePercent;
    }

    public final com.lele.llmonitor.data.soc.CpuTimes component2()
    {
        return this.nextCpuTimes;
    }

    public final java.util.List component3()
    {
        return this.probes;
    }

    public final com.lele.llmonitor.data.soc.CpuUsageResult copy(Float p1, com.lele.llmonitor.data.soc.CpuTimes p2, java.util.List p3)
    {
        p3.getClass();
        this = new com.lele.llmonitor.data.soc.CpuUsageResult;
        this(p1, p2, p3);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.CpuUsageResult)) {
                if (ni1.o(this.usagePercent, ((com.lele.llmonitor.data.soc.CpuUsageResult) p5).usagePercent)) {
                    if (ni1.o(this.nextCpuTimes, ((com.lele.llmonitor.data.soc.CpuUsageResult) p5).nextCpuTimes)) {
                        if (ni1.o(this.probes, ((com.lele.llmonitor.data.soc.CpuUsageResult) p5).probes)) {
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
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final com.lele.llmonitor.data.soc.CpuTimes getNextCpuTimes()
    {
        return this.nextCpuTimes;
    }

    public final java.util.List getProbes()
    {
        return this.probes;
    }

    public final Float getUsagePercent()
    {
        return this.usagePercent;
    }

    public int hashCode()
    {
        int v0_3;
        int v0_0 = this.usagePercent;
        int v1 = 0;
        if (v0_0 != 0) {
            v0_3 = v0_0.hashCode();
        } else {
            v0_3 = 0;
        }
        int v0_4 = (v0_3 * 31);
        com.lele.llmonitor.data.soc.CpuTimes v2 = this.nextCpuTimes;
        if (v2 != null) {
            v1 = v2.hashCode();
        }
        return (this.probes.hashCode() + ((v0_4 + v1) * 31));
    }

    public String toString()
    {
        String v0_0 = this.usagePercent;
        com.lele.llmonitor.data.soc.CpuTimes v1 = this.nextCpuTimes;
        String v4_3 = this.probes;
        StringBuilder v2_1 = new StringBuilder("CpuUsageResult(usagePercent=");
        v2_1.append(v0_0);
        v2_1.append(", nextCpuTimes=");
        v2_1.append(v1);
        v2_1.append(", probes=");
        v2_1.append(v4_3);
        v2_1.append(")");
        return v2_1.toString();
    }
}
