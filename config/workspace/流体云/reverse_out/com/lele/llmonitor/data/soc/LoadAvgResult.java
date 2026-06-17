package com.lele.llmonitor.data.soc;
public final class LoadAvgResult {
    public static final int $stable = 8;
    private final Float loadAvg1;
    private final Float loadAvg15;
    private final Float loadAvg5;
    private final java.util.List probes;

    public LoadAvgResult(Float p1, Float p2, Float p3, java.util.List p4)
    {
        p4.getClass();
        this.loadAvg1 = p1;
        this.loadAvg5 = p2;
        this.loadAvg15 = p3;
        this.probes = p4;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.LoadAvgResult copy$default(com.lele.llmonitor.data.soc.LoadAvgResult p0, Float p1, Float p2, Float p3, java.util.List p4, int p5, Object p6)
    {
        if ((p5 & 1) != 0) {
            p1 = p0.loadAvg1;
        }
        if ((p5 & 2) != 0) {
            p2 = p0.loadAvg5;
        }
        if ((p5 & 4) != 0) {
            p3 = p0.loadAvg15;
        }
        if ((p5 & 8) != 0) {
            p4 = p0.probes;
        }
        return p0.copy(p1, p2, p3, p4);
    }

    public final Float component1()
    {
        return this.loadAvg1;
    }

    public final Float component2()
    {
        return this.loadAvg5;
    }

    public final Float component3()
    {
        return this.loadAvg15;
    }

    public final java.util.List component4()
    {
        return this.probes;
    }

    public final com.lele.llmonitor.data.soc.LoadAvgResult copy(Float p1, Float p2, Float p3, java.util.List p4)
    {
        p4.getClass();
        this = new com.lele.llmonitor.data.soc.LoadAvgResult;
        this(p1, p2, p3, p4);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.LoadAvgResult)) {
                if (ni1.o(this.loadAvg1, ((com.lele.llmonitor.data.soc.LoadAvgResult) p5).loadAvg1)) {
                    if (ni1.o(this.loadAvg5, ((com.lele.llmonitor.data.soc.LoadAvgResult) p5).loadAvg5)) {
                        if (ni1.o(this.loadAvg15, ((com.lele.llmonitor.data.soc.LoadAvgResult) p5).loadAvg15)) {
                            if (ni1.o(this.probes, ((com.lele.llmonitor.data.soc.LoadAvgResult) p5).probes)) {
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
            return 1;
        }
    }

    public final Float getLoadAvg1()
    {
        return this.loadAvg1;
    }

    public final Float getLoadAvg15()
    {
        return this.loadAvg15;
    }

    public final Float getLoadAvg5()
    {
        return this.loadAvg5;
    }

    public final java.util.List getProbes()
    {
        return this.probes;
    }

    public int hashCode()
    {
        int v0_5;
        int v0_0 = this.loadAvg1;
        int v1 = 0;
        if (v0_0 != 0) {
            v0_5 = v0_0.hashCode();
        } else {
            v0_5 = 0;
        }
        Float v2_0;
        int v0_6 = (v0_5 * 31);
        Float v2_2 = this.loadAvg5;
        if (v2_2 != null) {
            v2_0 = v2_2.hashCode();
        } else {
            v2_0 = 0;
        }
        int v0_2 = ((v0_6 + v2_0) * 31);
        Float v2_1 = this.loadAvg15;
        if (v2_1 != null) {
            v1 = v2_1.hashCode();
        }
        return (this.probes.hashCode() + ((v0_2 + v1) * 31));
    }

    public String toString()
    {
        String v0_0 = this.loadAvg1;
        Float v1 = this.loadAvg5;
        Float v2 = this.loadAvg15;
        String v5_3 = this.probes;
        StringBuilder v3_1 = new StringBuilder("LoadAvgResult(loadAvg1=");
        v3_1.append(v0_0);
        v3_1.append(", loadAvg5=");
        v3_1.append(v1);
        v3_1.append(", loadAvg15=");
        v3_1.append(v2);
        v3_1.append(", probes=");
        v3_1.append(v5_3);
        v3_1.append(")");
        return v3_1.toString();
    }
}
