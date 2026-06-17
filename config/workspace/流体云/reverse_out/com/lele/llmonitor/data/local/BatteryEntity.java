package com.lele.llmonitor.data.local;
public final class BatteryEntity {
    public static final int $stable;
    private final float current;
    private final long id;
    private final int level;
    private final float power;
    private final float temperature;
    private final long timestamp;
    private final float voltage;

    public BatteryEntity(long p1, long p3, int p5, float p6, float p7, float p8, float p9)
    {
        this.id = p1;
        this.timestamp = p3;
        this.level = p5;
        this.voltage = p6;
        this.current = p7;
        this.power = p8;
        this.temperature = p9;
        return;
    }

    public synthetic BatteryEntity(long p11, long p13, int p15, float p16, float p17, float p18, float p19, int p20, ic0 p21)
    {
        if ((p20 & 1) != 0) {
            p11 = 0;
        }
        float v9;
        if ((p20 & 64) == 0) {
            v9 = p19;
        } else {
            v9 = 0;
        }
        this(p11, p13, p15, p16, p17, p18, v9);
        return;
    }

    public static synthetic com.lele.llmonitor.data.local.BatteryEntity copy$default(com.lele.llmonitor.data.local.BatteryEntity p10, long p11, long p13, int p15, float p16, float p17, float p18, float p19, int p20, Object p21)
    {
        if ((p20 & 1) != 0) {
            p11 = p10.id;
        }
        if ((p20 & 2) != 0) {
            p13 = p10.timestamp;
        }
        if ((p20 & 4) != 0) {
            p15 = p10.level;
        }
        float v6;
        if ((p20 & 8) == 0) {
            v6 = p16;
        } else {
            v6 = p10.voltage;
        }
        float v7;
        if ((p20 & 16) == 0) {
            v7 = p17;
        } else {
            v7 = p10.current;
        }
        float v8;
        if ((p20 & 32) == 0) {
            v8 = p18;
        } else {
            v8 = p10.power;
        }
        float v9;
        if ((p20 & 64) == 0) {
            v9 = p19;
        } else {
            v9 = p10.temperature;
        }
        return p10.copy(p11, p13, p15, v6, v7, v8, v9);
    }

    public final long component1()
    {
        return this.id;
    }

    public final long component2()
    {
        return this.timestamp;
    }

    public final int component3()
    {
        return this.level;
    }

    public final float component4()
    {
        return this.voltage;
    }

    public final float component5()
    {
        return this.current;
    }

    public final float component6()
    {
        return this.power;
    }

    public final float component7()
    {
        return this.temperature;
    }

    public final com.lele.llmonitor.data.local.BatteryEntity copy(long p1, long p3, int p5, float p6, float p7, float p8, float p9)
    {
        return new com.lele.llmonitor.data.local.BatteryEntity(p1, p3, p5, p6, p7, p8, p9);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.lele.llmonitor.data.local.BatteryEntity)) {
                if (this.id == ((com.lele.llmonitor.data.local.BatteryEntity) p8).id) {
                    if (this.timestamp == ((com.lele.llmonitor.data.local.BatteryEntity) p8).timestamp) {
                        if (this.level == ((com.lele.llmonitor.data.local.BatteryEntity) p8).level) {
                            if (Float.compare(this.voltage, ((com.lele.llmonitor.data.local.BatteryEntity) p8).voltage) == 0) {
                                if (Float.compare(this.current, ((com.lele.llmonitor.data.local.BatteryEntity) p8).current) == 0) {
                                    if (Float.compare(this.power, ((com.lele.llmonitor.data.local.BatteryEntity) p8).power) == 0) {
                                        if (Float.compare(this.temperature, ((com.lele.llmonitor.data.local.BatteryEntity) p8).temperature) == 0) {
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
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final float getCurrent()
    {
        return this.current;
    }

    public final long getId()
    {
        return this.id;
    }

    public final int getLevel()
    {
        return this.level;
    }

    public final float getPower()
    {
        return this.power;
    }

    public final float getTemperature()
    {
        return this.temperature;
    }

    public final long getTimestamp()
    {
        return this.timestamp;
    }

    public final float getVoltage()
    {
        return this.voltage;
    }

    public int hashCode()
    {
        return (Float.hashCode(this.temperature) + ve2.c(this.power, ve2.c(this.current, ve2.c(this.voltage, ve2.d(this.level, s42.a((Long.hashCode(this.id) * 31), 31, this.timestamp), 31), 31), 31), 31));
    }

    public String toString()
    {
        String v0_0 = this.id;
        long v2 = this.timestamp;
        int v4 = this.level;
        float v5 = this.voltage;
        float v6 = this.current;
        float v7 = this.power;
        String v10_3 = this.temperature;
        StringBuilder v8_1 = new StringBuilder("BatteryEntity(id=");
        v8_1.append(v0_0);
        v8_1.append(", timestamp=");
        v8_1.append(v2);
        v8_1.append(", level=");
        v8_1.append(v4);
        v8_1.append(", voltage=");
        v8_1.append(v5);
        v8_1.append(", current=");
        v8_1.append(v6);
        v8_1.append(", power=");
        v8_1.append(v7);
        v8_1.append(", temperature=");
        v8_1.append(v10_3);
        v8_1.append(")");
        return v8_1.toString();
    }
}
