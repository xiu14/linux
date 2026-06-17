package com.lele.llmonitor.data.soc;
final class ThermalTempCandidate {
    private final float divisor;
    private final int fractionDigits;
    private final float value;

    public ThermalTempCandidate(float p1, float p2, int p3)
    {
        this.value = p1;
        this.divisor = p2;
        this.fractionDigits = p3;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.ThermalTempCandidate copy$default(com.lele.llmonitor.data.soc.ThermalTempCandidate p0, float p1, float p2, int p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.value;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.divisor;
        }
        if ((p4 & 4) != 0) {
            p3 = p0.fractionDigits;
        }
        return p0.copy(p1, p2, p3);
    }

    public final float component1()
    {
        return this.value;
    }

    public final float component2()
    {
        return this.divisor;
    }

    public final int component3()
    {
        return this.fractionDigits;
    }

    public final com.lele.llmonitor.data.soc.ThermalTempCandidate copy(float p1, float p2, int p3)
    {
        this = new com.lele.llmonitor.data.soc.ThermalTempCandidate;
        this(p1, p2, p3);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.ThermalTempCandidate)) {
                if (Float.compare(this.value, ((com.lele.llmonitor.data.soc.ThermalTempCandidate) p5).value) == 0) {
                    if (Float.compare(this.divisor, ((com.lele.llmonitor.data.soc.ThermalTempCandidate) p5).divisor) == 0) {
                        if (this.fractionDigits == ((com.lele.llmonitor.data.soc.ThermalTempCandidate) p5).fractionDigits) {
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

    public final float getDivisor()
    {
        return this.divisor;
    }

    public final int getFractionDigits()
    {
        return this.fractionDigits;
    }

    public final float getValue()
    {
        return this.value;
    }

    public int hashCode()
    {
        return (Integer.hashCode(this.fractionDigits) + ve2.c(this.divisor, (Float.hashCode(this.value) * 31), 31));
    }

    public String toString()
    {
        String v0_0 = this.value;
        float v1 = this.divisor;
        String v4_3 = this.fractionDigits;
        StringBuilder v2_1 = new StringBuilder("ThermalTempCandidate(value=");
        v2_1.append(v0_0);
        v2_1.append(", divisor=");
        v2_1.append(v1);
        v2_1.append(", fractionDigits=");
        v2_1.append(v4_3);
        v2_1.append(")");
        return v2_1.toString();
    }
}
