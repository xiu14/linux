package com.lele.llmonitor.data.soc;
public final class TemperatureResult {
    public static final int $stable = 8;
    private final java.util.List probes;
    private final String selectedZone;
    private final Float temperatureC;
    private final Integer temperatureFractionDigits;
    private final java.util.List zones;

    public TemperatureResult(Float p1, Integer p2, String p3, java.util.List p4, java.util.List p5)
    {
        p4.getClass();
        p5.getClass();
        this.temperatureC = p1;
        this.temperatureFractionDigits = p2;
        this.selectedZone = p3;
        this.probes = p4;
        this.zones = p5;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.TemperatureResult copy$default(com.lele.llmonitor.data.soc.TemperatureResult p0, Float p1, Integer p2, String p3, java.util.List p4, java.util.List p5, int p6, Object p7)
    {
        if ((p6 & 1) != 0) {
            p1 = p0.temperatureC;
        }
        if ((p6 & 2) != 0) {
            p2 = p0.temperatureFractionDigits;
        }
        if ((p6 & 4) != 0) {
            p3 = p0.selectedZone;
        }
        if ((p6 & 8) != 0) {
            p4 = p0.probes;
        }
        if ((p6 & 16) != 0) {
            p5 = p0.zones;
        }
        return p0.copy(p1, p2, p3, p4, p5);
    }

    public final Float component1()
    {
        return this.temperatureC;
    }

    public final Integer component2()
    {
        return this.temperatureFractionDigits;
    }

    public final String component3()
    {
        return this.selectedZone;
    }

    public final java.util.List component4()
    {
        return this.probes;
    }

    public final java.util.List component5()
    {
        return this.zones;
    }

    public final com.lele.llmonitor.data.soc.TemperatureResult copy(Float p1, Integer p2, String p3, java.util.List p4, java.util.List p5)
    {
        p4.getClass();
        p5.getClass();
        return new com.lele.llmonitor.data.soc.TemperatureResult(p1, p2, p3, p4, p5);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.soc.TemperatureResult)) {
                if (ni1.o(this.temperatureC, ((com.lele.llmonitor.data.soc.TemperatureResult) p5).temperatureC)) {
                    if (ni1.o(this.temperatureFractionDigits, ((com.lele.llmonitor.data.soc.TemperatureResult) p5).temperatureFractionDigits)) {
                        if (ni1.o(this.selectedZone, ((com.lele.llmonitor.data.soc.TemperatureResult) p5).selectedZone)) {
                            if (ni1.o(this.probes, ((com.lele.llmonitor.data.soc.TemperatureResult) p5).probes)) {
                                if (ni1.o(this.zones, ((com.lele.llmonitor.data.soc.TemperatureResult) p5).zones)) {
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

    public final java.util.List getProbes()
    {
        return this.probes;
    }

    public final String getSelectedZone()
    {
        return this.selectedZone;
    }

    public final Float getTemperatureC()
    {
        return this.temperatureC;
    }

    public final Integer getTemperatureFractionDigits()
    {
        return this.temperatureFractionDigits;
    }

    public final java.util.List getZones()
    {
        return this.zones;
    }

    public int hashCode()
    {
        int v0_6;
        int v0_0 = this.temperatureC;
        java.util.List v1_0 = 0;
        if (v0_0 != 0) {
            v0_6 = v0_0.hashCode();
        } else {
            v0_6 = 0;
        }
        String v3_0;
        int v0_7 = (v0_6 * 31);
        String v3_2 = this.temperatureFractionDigits;
        if (v3_2 != null) {
            v3_0 = v3_2.hashCode();
        } else {
            v3_0 = 0;
        }
        int v0_2 = ((v0_7 + v3_0) * 31);
        String v3_1 = this.selectedZone;
        if (v3_1 != null) {
            v1_0 = v3_1.hashCode();
        }
        return (this.zones.hashCode() + s42.e(this.probes, ((v0_2 + v1_0) * 31), 31));
    }

    public String toString()
    {
        String v0_0 = this.temperatureC;
        Integer v1 = this.temperatureFractionDigits;
        String v2 = this.selectedZone;
        java.util.List v3 = this.probes;
        String v6_3 = this.zones;
        StringBuilder v4_1 = new StringBuilder("TemperatureResult(temperatureC=");
        v4_1.append(v0_0);
        v4_1.append(", temperatureFractionDigits=");
        v4_1.append(v1);
        v4_1.append(", selectedZone=");
        v4_1.append(v2);
        v4_1.append(", probes=");
        v4_1.append(v3);
        v4_1.append(", zones=");
        v4_1.append(v6_3);
        v4_1.append(")");
        return v4_1.toString();
    }
}
