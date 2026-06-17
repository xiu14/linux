package com.lele.llmonitor.data.soc;
public final class CpuCoreFrequencySample {
    public static final int $stable;
    private final int coreId;
    private final Integer currentMHz;
    private final Integer maxMHz;
    private final boolean online;
    private final String policy;

    public CpuCoreFrequencySample(int p1, boolean p2, String p3, Integer p4, Integer p5)
    {
        this.coreId = p1;
        this.online = p2;
        this.policy = p3;
        this.currentMHz = p4;
        this.maxMHz = p5;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.CpuCoreFrequencySample copy$default(com.lele.llmonitor.data.soc.CpuCoreFrequencySample p0, int p1, boolean p2, String p3, Integer p4, Integer p5, int p6, Object p7)
    {
        if ((p6 & 1) != 0) {
            p1 = p0.coreId;
        }
        if ((p6 & 2) != 0) {
            p2 = p0.online;
        }
        if ((p6 & 4) != 0) {
            p3 = p0.policy;
        }
        if ((p6 & 8) != 0) {
            p4 = p0.currentMHz;
        }
        if ((p6 & 16) != 0) {
            p5 = p0.maxMHz;
        }
        return p0.copy(p1, p2, p3, p4, p5);
    }

    public final int component1()
    {
        return this.coreId;
    }

    public final boolean component2()
    {
        return this.online;
    }

    public final String component3()
    {
        return this.policy;
    }

    public final Integer component4()
    {
        return this.currentMHz;
    }

    public final Integer component5()
    {
        return this.maxMHz;
    }

    public final com.lele.llmonitor.data.soc.CpuCoreFrequencySample copy(int p1, boolean p2, String p3, Integer p4, Integer p5)
    {
        return new com.lele.llmonitor.data.soc.CpuCoreFrequencySample(p1, p2, p3, p4, p5);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.CpuCoreFrequencySample)) {
                if (this.coreId == ((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) p5).coreId) {
                    if (this.online == ((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) p5).online) {
                        if (ni1.o(this.policy, ((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) p5).policy)) {
                            if (ni1.o(this.currentMHz, ((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) p5).currentMHz)) {
                                if (ni1.o(this.maxMHz, ((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) p5).maxMHz)) {
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
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int getCoreId()
    {
        return this.coreId;
    }

    public final Integer getCurrentMHz()
    {
        return this.currentMHz;
    }

    public final Integer getMaxMHz()
    {
        return this.maxMHz;
    }

    public final boolean getOnline()
    {
        return this.online;
    }

    public final String getPolicy()
    {
        return this.policy;
    }

    public int hashCode()
    {
        int v2_0;
        int v0_8 = s42.c((Integer.hashCode(this.coreId) * 31), 31, this.online);
        int v2_4 = this.policy;
        int v3 = 0;
        if (v2_4 != 0) {
            v2_0 = v2_4.hashCode();
        } else {
            v2_0 = 0;
        }
        int v2_2;
        int v0_2 = ((v0_8 + v2_0) * 31);
        int v2_1 = this.currentMHz;
        if (v2_1 != 0) {
            v2_2 = v2_1.hashCode();
        } else {
            v2_2 = 0;
        }
        int v0_5 = ((v0_2 + v2_2) * 31);
        Integer v4_1 = this.maxMHz;
        if (v4_1 != null) {
            v3 = v4_1.hashCode();
        }
        return (v0_5 + v3);
    }

    public String toString()
    {
        String v0_0 = this.coreId;
        boolean v1 = this.online;
        String v2 = this.policy;
        Integer v3 = this.currentMHz;
        String v6_3 = this.maxMHz;
        StringBuilder v4_1 = new StringBuilder("CpuCoreFrequencySample(coreId=");
        v4_1.append(v0_0);
        v4_1.append(", online=");
        v4_1.append(v1);
        v4_1.append(", policy=");
        v4_1.append(v2);
        v4_1.append(", currentMHz=");
        v4_1.append(v3);
        v4_1.append(", maxMHz=");
        v4_1.append(v6_3);
        v4_1.append(")");
        return v4_1.toString();
    }
}
