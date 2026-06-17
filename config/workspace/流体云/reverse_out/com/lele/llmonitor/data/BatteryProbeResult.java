package com.lele.llmonitor.data;
public final class BatteryProbeResult {
    public static final int $stable = 8;
    private final java.util.List probes;
    private final Object value;

    public BatteryProbeResult(Object p1, java.util.List p2)
    {
        p2.getClass();
        this.value = p1;
        this.probes = p2;
        return;
    }

    public static synthetic com.lele.llmonitor.data.BatteryProbeResult copy$default(com.lele.llmonitor.data.BatteryProbeResult p0, Object p1, java.util.List p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = p0.value;
        }
        if ((p3 & 2) != 0) {
            p2 = p0.probes;
        }
        return p0.copy(p1, p2);
    }

    public final Object component1()
    {
        return this.value;
    }

    public final java.util.List component2()
    {
        return this.probes;
    }

    public final com.lele.llmonitor.data.BatteryProbeResult copy(Object p1, java.util.List p2)
    {
        p2.getClass();
        this = new com.lele.llmonitor.data.BatteryProbeResult;
        this(p1, p2);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.BatteryProbeResult)) {
                if (ni1.o(this.value, ((com.lele.llmonitor.data.BatteryProbeResult) p5).value)) {
                    if (ni1.o(this.probes, ((com.lele.llmonitor.data.BatteryProbeResult) p5).probes)) {
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

    public final java.util.List getProbes()
    {
        return this.probes;
    }

    public final Object getValue()
    {
        return this.value;
    }

    public int hashCode()
    {
        int v0_1;
        int v0_0 = this.value;
        if (v0_0 != 0) {
            v0_1 = v0_0.hashCode();
        } else {
            v0_1 = 0;
        }
        return (this.probes.hashCode() + (v0_1 * 31));
    }

    public String toString()
    {
        String v0_0 = this.value;
        String v3_1 = this.probes;
        StringBuilder v1_1 = new StringBuilder("BatteryProbeResult(value=");
        v1_1.append(v0_0);
        v1_1.append(", probes=");
        v1_1.append(v3_1);
        v1_1.append(")");
        return v1_1.toString();
    }
}
