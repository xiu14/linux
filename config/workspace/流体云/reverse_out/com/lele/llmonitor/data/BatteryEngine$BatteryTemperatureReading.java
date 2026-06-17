package com.lele.llmonitor.data;
public final class BatteryEngine$BatteryTemperatureReading {
    public static final int $stable;
    private final float celsius;
    private final int divisor;
    private final int fractionDigits;
    private final int raw;

    public BatteryEngine$BatteryTemperatureReading(float p1, int p2, int p3, int p4)
    {
        this.celsius = p1;
        this.fractionDigits = p2;
        this.raw = p3;
        this.divisor = p4;
        return;
    }

    public static synthetic com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading copy$default(com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading p0, float p1, int p2, int p3, int p4, int p5, Object p6)
    {
        if ((p5 & 1) != 0) {
            p1 = p0.celsius;
        }
        if ((p5 & 2) != 0) {
            p2 = p0.fractionDigits;
        }
        if ((p5 & 4) != 0) {
            p3 = p0.raw;
        }
        if ((p5 & 8) != 0) {
            p4 = p0.divisor;
        }
        return p0.copy(p1, p2, p3, p4);
    }

    public final float component1()
    {
        return this.celsius;
    }

    public final int component2()
    {
        return this.fractionDigits;
    }

    public final int component3()
    {
        return this.raw;
    }

    public final int component4()
    {
        return this.divisor;
    }

    public final com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading copy(float p1, int p2, int p3, int p4)
    {
        this = new com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading;
        this(p1, p2, p3, p4);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading)) {
                if (Float.compare(this.celsius, ((com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading) p5).celsius) == 0) {
                    if (this.fractionDigits == ((com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading) p5).fractionDigits) {
                        if (this.raw == ((com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading) p5).raw) {
                            if (this.divisor == ((com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading) p5).divisor) {
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

    public final float getCelsius()
    {
        return this.celsius;
    }

    public final int getDivisor()
    {
        return this.divisor;
    }

    public final int getFractionDigits()
    {
        return this.fractionDigits;
    }

    public final int getRaw()
    {
        return this.raw;
    }

    public int hashCode()
    {
        return (Integer.hashCode(this.divisor) + ve2.d(this.raw, ve2.d(this.fractionDigits, (Float.hashCode(this.celsius) * 31), 31), 31));
    }

    public String toString()
    {
        String v0_0 = this.celsius;
        int v1 = this.fractionDigits;
        int v2 = this.raw;
        String v5_3 = this.divisor;
        StringBuilder v3_1 = new StringBuilder("BatteryTemperatureReading(celsius=");
        v3_1.append(v0_0);
        v3_1.append(", fractionDigits=");
        v3_1.append(v1);
        v3_1.append(", raw=");
        v3_1.append(v2);
        v3_1.append(", divisor=");
        v3_1.append(v5_3);
        v3_1.append(")");
        return v3_1.toString();
    }
}
