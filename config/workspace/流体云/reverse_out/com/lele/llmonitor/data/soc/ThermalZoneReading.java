package com.lele.llmonitor.data.soc;
public final class ThermalZoneReading {
    public static final int $stable;
    private final float tempC;
    private final int tempFractionDigits;
    private final String type;
    private final String zone;

    public ThermalZoneReading(String p1, String p2, float p3, int p4)
    {
        p1.getClass();
        p2.getClass();
        this.zone = p1;
        this.type = p2;
        this.tempC = p3;
        this.tempFractionDigits = p4;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.ThermalZoneReading copy$default(com.lele.llmonitor.data.soc.ThermalZoneReading p0, String p1, String p2, float p3, int p4, int p5, Object p6)
    {
        if ((p5 & 1) != 0) {
            p1 = p0.zone;
        }
        if ((p5 & 2) != 0) {
            p2 = p0.type;
        }
        if ((p5 & 4) != 0) {
            p3 = p0.tempC;
        }
        if ((p5 & 8) != 0) {
            p4 = p0.tempFractionDigits;
        }
        return p0.copy(p1, p2, p3, p4);
    }

    public final String component1()
    {
        return this.zone;
    }

    public final String component2()
    {
        return this.type;
    }

    public final float component3()
    {
        return this.tempC;
    }

    public final int component4()
    {
        return this.tempFractionDigits;
    }

    public final com.lele.llmonitor.data.soc.ThermalZoneReading copy(String p1, String p2, float p3, int p4)
    {
        p1.getClass();
        p2.getClass();
        this = new com.lele.llmonitor.data.soc.ThermalZoneReading;
        this(p1, p2, p3, p4);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.ThermalZoneReading)) {
                if (ni1.o(this.zone, ((com.lele.llmonitor.data.soc.ThermalZoneReading) p5).zone)) {
                    if (ni1.o(this.type, ((com.lele.llmonitor.data.soc.ThermalZoneReading) p5).type)) {
                        if (Float.compare(this.tempC, ((com.lele.llmonitor.data.soc.ThermalZoneReading) p5).tempC) == 0) {
                            if (this.tempFractionDigits == ((com.lele.llmonitor.data.soc.ThermalZoneReading) p5).tempFractionDigits) {
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

    public final float getTempC()
    {
        return this.tempC;
    }

    public final int getTempFractionDigits()
    {
        return this.tempFractionDigits;
    }

    public final String getType()
    {
        return this.type;
    }

    public final String getZone()
    {
        return this.zone;
    }

    public int hashCode()
    {
        return (Integer.hashCode(this.tempFractionDigits) + ve2.c(this.tempC, s42.d(this.type, (this.zone.hashCode() * 31), 31), 31));
    }

    public String toString()
    {
        String v0_0 = this.zone;
        String v1 = this.type;
        float v2 = this.tempC;
        String v5_3 = this.tempFractionDigits;
        StringBuilder v3_1 = new StringBuilder("ThermalZoneReading(zone=");
        v3_1.append(v0_0);
        v3_1.append(", type=");
        v3_1.append(v1);
        v3_1.append(", tempC=");
        v3_1.append(v2);
        v3_1.append(", tempFractionDigits=");
        v3_1.append(v5_3);
        v3_1.append(")");
        return v3_1.toString();
    }
}
