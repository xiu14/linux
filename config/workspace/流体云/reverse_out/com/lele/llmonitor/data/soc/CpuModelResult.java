package com.lele.llmonitor.data.soc;
public final class CpuModelResult {
    public static final int $stable = 8;
    private final String modelName;
    private final java.util.List probes;

    public CpuModelResult(String p1, java.util.List p2)
    {
        p2.getClass();
        this.modelName = p1;
        this.probes = p2;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.CpuModelResult copy$default(com.lele.llmonitor.data.soc.CpuModelResult p0, String p1, java.util.List p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = p0.modelName;
        }
        if ((p3 & 2) != 0) {
            p2 = p0.probes;
        }
        return p0.copy(p1, p2);
    }

    public final String component1()
    {
        return this.modelName;
    }

    public final java.util.List component2()
    {
        return this.probes;
    }

    public final com.lele.llmonitor.data.soc.CpuModelResult copy(String p1, java.util.List p2)
    {
        p2.getClass();
        this = new com.lele.llmonitor.data.soc.CpuModelResult;
        this(p1, p2);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.CpuModelResult)) {
                if (ni1.o(this.modelName, ((com.lele.llmonitor.data.soc.CpuModelResult) p5).modelName)) {
                    if (ni1.o(this.probes, ((com.lele.llmonitor.data.soc.CpuModelResult) p5).probes)) {
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

    public final String getModelName()
    {
        return this.modelName;
    }

    public final java.util.List getProbes()
    {
        return this.probes;
    }

    public int hashCode()
    {
        int v0_1;
        int v0_0 = this.modelName;
        if (v0_0 != 0) {
            v0_1 = v0_0.hashCode();
        } else {
            v0_1 = 0;
        }
        return (this.probes.hashCode() + (v0_1 * 31));
    }

    public String toString()
    {
        String v0_0 = this.modelName;
        String v3_1 = this.probes;
        StringBuilder v1_1 = new StringBuilder("CpuModelResult(modelName=");
        v1_1.append(v0_0);
        v1_1.append(", probes=");
        v1_1.append(v3_1);
        v1_1.append(")");
        return v1_1.toString();
    }
}
