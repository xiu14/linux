package com.lele.llmonitor.data.soc;
final class NormalizedThermalTemp {
    private final float celsius;
    private final int fractionDigits;

    public NormalizedThermalTemp(float p1, int p2)
    {
        this.celsius = p1;
        this.fractionDigits = p2;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.NormalizedThermalTemp copy$default(com.lele.llmonitor.data.soc.NormalizedThermalTemp p0, float p1, int p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = p0.celsius;
        }
        if ((p3 & 2) != 0) {
            p2 = p0.fractionDigits;
        }
        return p0.copy(p1, p2);
    }

    public final float component1()
    {
        return this.celsius;
    }

    public final int component2()
    {
        return this.fractionDigits;
    }

    public final com.lele.llmonitor.data.soc.NormalizedThermalTemp copy(float p1, int p2)
    {
        this = new com.lele.llmonitor.data.soc.NormalizedThermalTemp;
        this(p1, p2);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.NormalizedThermalTemp)) {
                if (Float.compare(this.celsius, ((com.lele.llmonitor.data.soc.NormalizedThermalTemp) p5).celsius) == 0) {
                    if (this.fractionDigits == ((com.lele.llmonitor.data.soc.NormalizedThermalTemp) p5).fractionDigits) {
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

    public final float getCelsius()
    {
        return this.celsius;
    }

    public final int getFractionDigits()
    {
        return this.fractionDigits;
    }

    public int hashCode()
    {
        return (Integer.hashCode(this.fractionDigits) + (Float.hashCode(this.celsius) * 31));
    }

    public String toString()
    {
        String v0_0 = this.celsius;
        String v3_1 = this.fractionDigits;
        StringBuilder v1_1 = new StringBuilder("NormalizedThermalTemp(celsius=");
        v1_1.append(v0_0);
        v1_1.append(", fractionDigits=");
        v1_1.append(v3_1);
        v1_1.append(")");
        return v1_1.toString();
    }
}
