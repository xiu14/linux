package com.lele.llmonitor.data.soc;
public final class SocSnapshot {
    public static final int $stable = 8;
    private final java.util.List coreFrequencies;
    private final String cpuModelName;
    private final java.util.List cpuModelSources;
    private final Float cpuUsagePercent;
    private final java.util.List cpuUsageSources;
    private final Float loadAvg1;
    private final Float loadAvg15;
    private final Float loadAvg5;
    private final java.util.List loadAvgSources;
    private final Long memoryAvailableBytes;
    private final java.util.List memorySources;
    private final Long memoryTotalBytes;
    private final int onlineCores;
    private final Float socTemperatureC;
    private final Integer socTemperatureFractionDigits;
    private final String socTemperatureSource;
    private final java.util.List socTemperatureSources;
    private final java.util.List thermalZones;
    private final long timestamp;
    private final int totalCores;

    public SocSnapshot(long p1, Float p3, int p4, int p5, Float p6, Float p7, Float p8, Float p9, Integer p10, String p11, java.util.List p12, java.util.List p13, java.util.List p14, Long p15, Long p16, java.util.List p17, String p18, java.util.List p19, java.util.List p20, java.util.List p21)
    {
        p12.getClass();
        p13.getClass();
        p14.getClass();
        p17.getClass();
        p19.getClass();
        p20.getClass();
        p21.getClass();
        this.timestamp = p1;
        this.cpuUsagePercent = p3;
        this.onlineCores = p4;
        this.totalCores = p5;
        this.loadAvg1 = p6;
        this.loadAvg5 = p7;
        this.loadAvg15 = p8;
        this.socTemperatureC = p9;
        this.socTemperatureFractionDigits = p10;
        this.socTemperatureSource = p11;
        this.cpuUsageSources = p12;
        this.loadAvgSources = p13;
        this.socTemperatureSources = p14;
        this.memoryTotalBytes = p15;
        this.memoryAvailableBytes = p16;
        this.memorySources = p17;
        this.cpuModelName = p18;
        this.cpuModelSources = p19;
        this.thermalZones = p20;
        this.coreFrequencies = p21;
        return;
    }

    public static synthetic com.lele.llmonitor.data.soc.SocSnapshot copy$default(com.lele.llmonitor.data.soc.SocSnapshot p19, long p20, Float p22, int p23, int p24, Float p25, Float p26, Float p27, Float p28, Integer p29, String p30, java.util.List p31, java.util.List p32, java.util.List p33, Long p34, Long p35, java.util.List p36, String p37, java.util.List p38, java.util.List p39, java.util.List p40, int p41, Object p42)
    {
        Long v2_1;
        if ((p41 & 1) == 0) {
            v2_1 = p20;
        } else {
            v2_1 = p19.timestamp;
        }
        Float v4_1;
        if ((p41 & 2) == 0) {
            v4_1 = p22;
        } else {
            v4_1 = p19.cpuUsagePercent;
        }
        int v5_1;
        if ((p41 & 4) == 0) {
            v5_1 = p23;
        } else {
            v5_1 = p19.onlineCores;
        }
        int v6_1;
        if ((p41 & 8) == 0) {
            v6_1 = p24;
        } else {
            v6_1 = p19.totalCores;
        }
        Float v7_1;
        if ((p41 & 16) == 0) {
            v7_1 = p25;
        } else {
            v7_1 = p19.loadAvg1;
        }
        Float v8_1;
        if ((p41 & 32) == 0) {
            v8_1 = p26;
        } else {
            v8_1 = p19.loadAvg5;
        }
        Float v9_1;
        if ((p41 & 64) == 0) {
            v9_1 = p27;
        } else {
            v9_1 = p19.loadAvg15;
        }
        Float v10_1;
        if ((p41 & 128) == 0) {
            v10_1 = p28;
        } else {
            v10_1 = p19.socTemperatureC;
        }
        Integer v11_1;
        if ((p41 & 256) == 0) {
            v11_1 = p29;
        } else {
            v11_1 = p19.socTemperatureFractionDigits;
        }
        String v12_1;
        if ((p41 & 512) == 0) {
            v12_1 = p30;
        } else {
            v12_1 = p19.socTemperatureSource;
        }
        java.util.List v13_1;
        if ((p41 & 1024) == 0) {
            v13_1 = p31;
        } else {
            v13_1 = p19.cpuUsageSources;
        }
        java.util.List v14_1;
        if ((p41 & 2048) == 0) {
            v14_1 = p32;
        } else {
            v14_1 = p19.loadAvgSources;
        }
        java.util.List v15_1;
        if ((p41 & 4096) == 0) {
            v15_1 = p33;
        } else {
            v15_1 = p19.socTemperatureSources;
        }
        Long v2_3;
        if ((p41 & 8192) == 0) {
            v2_3 = p34;
        } else {
            v2_3 = p19.memoryTotalBytes;
        }
        Long v3_1;
        if ((p41 & 16384) == 0) {
            v3_1 = p35;
        } else {
            v3_1 = p19.memoryAvailableBytes;
        }
        java.util.List v1_1;
        if ((p41 & 32768) == 0) {
            v1_1 = p36;
        } else {
            v1_1 = p19.memorySources;
        }
        java.util.List v1_2;
        if ((p41 & 65536) == 0) {
            v1_2 = p37;
        } else {
            v1_2 = p19.cpuModelName;
        }
        java.util.List v1_3;
        if ((p41 & 131072) == 0) {
            v1_3 = p38;
        } else {
            v1_3 = p19.cpuModelSources;
        }
        java.util.List v1_4;
        if ((p41 & 262144) == 0) {
            v1_4 = p39;
        } else {
            v1_4 = p19.thermalZones;
        }
        java.util.List v41_1;
        java.util.List v40_1;
        if ((p41 & 524288) == 0) {
            v41_1 = p40;
            v40_1 = v1_4;
        } else {
            v40_1 = v1_4;
            v41_1 = p19.coreFrequencies;
        }
        return p19.copy(v2_1, v4_1, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15_1, v2_3, v3_1, v1_1, v1_2, v1_3, v40_1, v41_1);
    }

    public final long component1()
    {
        return this.timestamp;
    }

    public final String component10()
    {
        return this.socTemperatureSource;
    }

    public final java.util.List component11()
    {
        return this.cpuUsageSources;
    }

    public final java.util.List component12()
    {
        return this.loadAvgSources;
    }

    public final java.util.List component13()
    {
        return this.socTemperatureSources;
    }

    public final Long component14()
    {
        return this.memoryTotalBytes;
    }

    public final Long component15()
    {
        return this.memoryAvailableBytes;
    }

    public final java.util.List component16()
    {
        return this.memorySources;
    }

    public final String component17()
    {
        return this.cpuModelName;
    }

    public final java.util.List component18()
    {
        return this.cpuModelSources;
    }

    public final java.util.List component19()
    {
        return this.thermalZones;
    }

    public final Float component2()
    {
        return this.cpuUsagePercent;
    }

    public final java.util.List component20()
    {
        return this.coreFrequencies;
    }

    public final int component3()
    {
        return this.onlineCores;
    }

    public final int component4()
    {
        return this.totalCores;
    }

    public final Float component5()
    {
        return this.loadAvg1;
    }

    public final Float component6()
    {
        return this.loadAvg5;
    }

    public final Float component7()
    {
        return this.loadAvg15;
    }

    public final Float component8()
    {
        return this.socTemperatureC;
    }

    public final Integer component9()
    {
        return this.socTemperatureFractionDigits;
    }

    public final com.lele.llmonitor.data.soc.SocSnapshot copy(long p23, Float p25, int p26, int p27, Float p28, Float p29, Float p30, Float p31, Integer p32, String p33, java.util.List p34, java.util.List p35, java.util.List p36, Long p37, Long p38, java.util.List p39, String p40, java.util.List p41, java.util.List p42, java.util.List p43)
    {
        p34.getClass();
        p35.getClass();
        p36.getClass();
        p39.getClass();
        p41.getClass();
        p42.getClass();
        p43.getClass();
        return new com.lele.llmonitor.data.soc.SocSnapshot(p23, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.lele.llmonitor.data.soc.SocSnapshot)) {
                if (this.timestamp == ((com.lele.llmonitor.data.soc.SocSnapshot) p8).timestamp) {
                    if (ni1.o(this.cpuUsagePercent, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).cpuUsagePercent)) {
                        if (this.onlineCores == ((com.lele.llmonitor.data.soc.SocSnapshot) p8).onlineCores) {
                            if (this.totalCores == ((com.lele.llmonitor.data.soc.SocSnapshot) p8).totalCores) {
                                if (ni1.o(this.loadAvg1, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).loadAvg1)) {
                                    if (ni1.o(this.loadAvg5, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).loadAvg5)) {
                                        if (ni1.o(this.loadAvg15, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).loadAvg15)) {
                                            if (ni1.o(this.socTemperatureC, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).socTemperatureC)) {
                                                if (ni1.o(this.socTemperatureFractionDigits, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).socTemperatureFractionDigits)) {
                                                    if (ni1.o(this.socTemperatureSource, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).socTemperatureSource)) {
                                                        if (ni1.o(this.cpuUsageSources, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).cpuUsageSources)) {
                                                            if (ni1.o(this.loadAvgSources, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).loadAvgSources)) {
                                                                if (ni1.o(this.socTemperatureSources, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).socTemperatureSources)) {
                                                                    if (ni1.o(this.memoryTotalBytes, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).memoryTotalBytes)) {
                                                                        if (ni1.o(this.memoryAvailableBytes, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).memoryAvailableBytes)) {
                                                                            if (ni1.o(this.memorySources, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).memorySources)) {
                                                                                if (ni1.o(this.cpuModelName, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).cpuModelName)) {
                                                                                    if (ni1.o(this.cpuModelSources, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).cpuModelSources)) {
                                                                                        if (ni1.o(this.thermalZones, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).thermalZones)) {
                                                                                            if (ni1.o(this.coreFrequencies, ((com.lele.llmonitor.data.soc.SocSnapshot) p8).coreFrequencies)) {
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

    public final java.util.List getCoreFrequencies()
    {
        return this.coreFrequencies;
    }

    public final String getCpuModelName()
    {
        return this.cpuModelName;
    }

    public final java.util.List getCpuModelSources()
    {
        return this.cpuModelSources;
    }

    public final Float getCpuUsagePercent()
    {
        return this.cpuUsagePercent;
    }

    public final java.util.List getCpuUsageSources()
    {
        return this.cpuUsageSources;
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

    public final java.util.List getLoadAvgSources()
    {
        return this.loadAvgSources;
    }

    public final Long getMemoryAvailableBytes()
    {
        return this.memoryAvailableBytes;
    }

    public final java.util.List getMemorySources()
    {
        return this.memorySources;
    }

    public final Long getMemoryTotalBytes()
    {
        return this.memoryTotalBytes;
    }

    public final int getOnlineCores()
    {
        return this.onlineCores;
    }

    public final Float getSocTemperatureC()
    {
        return this.socTemperatureC;
    }

    public final Integer getSocTemperatureFractionDigits()
    {
        return this.socTemperatureFractionDigits;
    }

    public final String getSocTemperatureSource()
    {
        return this.socTemperatureSource;
    }

    public final java.util.List getSocTemperatureSources()
    {
        return this.socTemperatureSources;
    }

    public final java.util.List getThermalZones()
    {
        return this.thermalZones;
    }

    public final long getTimestamp()
    {
        return this.timestamp;
    }

    public final int getTotalCores()
    {
        return this.totalCores;
    }

    public int hashCode()
    {
        java.util.List v2_0;
        int v0_12 = (Long.hashCode(this.timestamp) * 31);
        java.util.List v2_12 = this.cpuUsagePercent;
        int v3 = 0;
        if (v2_12 != null) {
            v2_0 = v2_12.hashCode();
        } else {
            v2_0 = 0;
        }
        java.util.List v2_4;
        int v0_4 = ve2.d(this.totalCores, ve2.d(this.onlineCores, ((v0_12 + v2_0) * 31), 31), 31);
        java.util.List v2_3 = this.loadAvg1;
        if (v2_3 != null) {
            v2_4 = v2_3.hashCode();
        } else {
            v2_4 = 0;
        }
        java.util.List v2_6;
        int v0_7 = ((v0_4 + v2_4) * 31);
        java.util.List v2_5 = this.loadAvg5;
        if (v2_5 != null) {
            v2_6 = v2_5.hashCode();
        } else {
            v2_6 = 0;
        }
        java.util.List v2_8;
        int v0_9 = ((v0_7 + v2_6) * 31);
        java.util.List v2_7 = this.loadAvg15;
        if (v2_7 != null) {
            v2_8 = v2_7.hashCode();
        } else {
            v2_8 = 0;
        }
        java.util.List v2_10;
        int v0_11 = ((v0_9 + v2_8) * 31);
        java.util.List v2_9 = this.socTemperatureC;
        if (v2_9 != null) {
            v2_10 = v2_9.hashCode();
        } else {
            v2_10 = 0;
        }
        java.util.List v2_13;
        int v0_14 = ((v0_11 + v2_10) * 31);
        java.util.List v2_11 = this.socTemperatureFractionDigits;
        if (v2_11 != null) {
            v2_13 = v2_11.hashCode();
        } else {
            v2_13 = 0;
        }
        java.util.List v2_15;
        int v0_16 = ((v0_14 + v2_13) * 31);
        java.util.List v2_14 = this.socTemperatureSource;
        if (v2_14 != null) {
            v2_15 = v2_14.hashCode();
        } else {
            v2_15 = 0;
        }
        java.util.List v2_20;
        int v0_21 = s42.e(this.socTemperatureSources, s42.e(this.loadAvgSources, s42.e(this.cpuUsageSources, ((v0_16 + v2_15) * 31), 31), 31), 31);
        java.util.List v2_19 = this.memoryTotalBytes;
        if (v2_19 != null) {
            v2_20 = v2_19.hashCode();
        } else {
            v2_20 = 0;
        }
        java.util.List v2_22;
        int v0_23 = ((v0_21 + v2_20) * 31);
        java.util.List v2_21 = this.memoryAvailableBytes;
        if (v2_21 != null) {
            v2_22 = v2_21.hashCode();
        } else {
            v2_22 = 0;
        }
        int v0_26 = s42.e(this.memorySources, ((v0_23 + v2_22) * 31), 31);
        java.util.List v2_24 = this.cpuModelName;
        if (v2_24 != null) {
            v3 = v2_24.hashCode();
        }
        return (this.coreFrequencies.hashCode() + s42.e(this.thermalZones, s42.e(this.cpuModelSources, ((v0_26 + v3) * 31), 31), 31));
    }

    public String toString()
    {
        String v1_0 = this.timestamp;
        Float v3 = this.cpuUsagePercent;
        int v4 = this.onlineCores;
        int v5 = this.totalCores;
        Float v6 = this.loadAvg1;
        Float v7 = this.loadAvg5;
        Float v8 = this.loadAvg15;
        Float v9 = this.socTemperatureC;
        Integer v10 = this.socTemperatureFractionDigits;
        String v11 = this.socTemperatureSource;
        java.util.List v12 = this.cpuUsageSources;
        java.util.List v13 = this.loadAvgSources;
        java.util.List v14 = this.socTemperatureSources;
        Long v16 = this.memoryTotalBytes;
        Long v17 = this.memoryAvailableBytes;
        java.util.List v18 = this.memorySources;
        String v19 = this.cpuModelName;
        java.util.List v20 = this.cpuModelSources;
        java.util.List v22_1 = this.coreFrequencies;
        java.util.List v21 = this.thermalZones;
        String v0_3 = new StringBuilder("SocSnapshot(timestamp=");
        v0_3.append(v1_0);
        v0_3.append(", cpuUsagePercent=");
        v0_3.append(v3);
        v0_3.append(", onlineCores=");
        v0_3.append(v4);
        v0_3.append(", totalCores=");
        v0_3.append(v5);
        v0_3.append(", loadAvg1=");
        v0_3.append(v6);
        v0_3.append(", loadAvg5=");
        v0_3.append(v7);
        v0_3.append(", loadAvg15=");
        v0_3.append(v8);
        v0_3.append(", socTemperatureC=");
        v0_3.append(v9);
        v0_3.append(", socTemperatureFractionDigits=");
        v0_3.append(v10);
        v0_3.append(", socTemperatureSource=");
        v0_3.append(v11);
        v0_3.append(", cpuUsageSources=");
        v0_3.append(v12);
        v0_3.append(", loadAvgSources=");
        v0_3.append(v13);
        v0_3.append(", socTemperatureSources=");
        v0_3.append(v14);
        v0_3.append(", memoryTotalBytes=");
        v0_3.append(v16);
        v0_3.append(", memoryAvailableBytes=");
        v0_3.append(v17);
        v0_3.append(", memorySources=");
        v0_3.append(v18);
        v0_3.append(", cpuModelName=");
        v0_3.append(v19);
        v0_3.append(", cpuModelSources=");
        v0_3.append(v20);
        v0_3.append(", thermalZones=");
        v0_3.append(v21);
        v0_3.append(", coreFrequencies=");
        v0_3.append(v22_1);
        v0_3.append(")");
        return v0_3.toString();
    }
}
