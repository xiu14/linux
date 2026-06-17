package com.lele.llmonitor.data.soc;
public final class LinuxSocDataSource implements com.lele.llmonitor.data.soc.SocDataSource {
    public static final int $stable = 8;
    private volatile com.lele.llmonitor.data.soc.CpuModelResult cachedCpuModelResult;
    private final mq1 cpuDirs$delegate;

    public LinuxSocDataSource()
    {
        this.cpuDirs$delegate = pe1.B(ws1.e, new ja0(28));
        return;
    }

    public static synthetic boolean a(java.io.File p0)
    {
        return com.lele.llmonitor.data.soc.LinuxSocDataSource.readThermalZones$lambda$0(p0);
    }

    public static final synthetic Object access$sampleCpuUsageShortWindow(com.lele.llmonitor.data.soc.LinuxSocDataSource p0, n60 p1)
    {
        return p0.sampleCpuUsageShortWindow(p1);
    }

    public static synthetic boolean b(java.io.File p0)
    {
        return com.lele.llmonitor.data.soc.LinuxSocDataSource.cpuDirs_delegate$lambda$0$0(p0);
    }

    public static synthetic Long c(d02 p0)
    {
        return com.lele.llmonitor.data.soc.LinuxSocDataSource.readLong$lambda$2(p0);
    }

    private final Float calculateCpuUsagePercent(com.lele.llmonitor.data.soc.CpuTimes p6, com.lele.llmonitor.data.soc.CpuTimes p7)
    {
        Float v5_0 = 0;
        if ((p6 != 0) && (p7 != 0)) {
            long v0_1 = (p7.getTotal() - p6.getTotal());
            long v2_3 = p7.getIdle();
            int v6_1 = p6.getIdle();
            int v6_2 = 0;
            if (v0_1 > 0) {
                long v2_1 = (v0_1 - (v2_3 - v6_1));
                if (v2_1 >= 0) {
                    v6_2 = v2_1;
                }
                int v6_4 = 1120403456;
                v5_0 = Float.valueOf(ib1.k(((((float) v6_2) / ((float) v0_1)) * v6_4), 0, v6_4));
            } else {
                return 0;
            }
        }
        return v5_0;
    }

    private final int countFractionDigits(String p4)
    {
        String v3_4 = hh3.t0(p4, 46, 0, 6);
        if ((v3_4 >= null) && (v3_4 < (p4.length() - 1))) {
            String v3_2 = p4.substring((v3_4 + 1));
            int v4_1 = v3_2.length();
            int v0_1 = 0;
            while (v0_1 < v4_1) {
                if (Character.isDigit(v3_2.charAt(v0_1))) {
                    v0_1++;
                } else {
                    v3_2 = v3_2.substring(0, v0_1);
                    break;
                }
            }
            return v3_2.length();
        } else {
            return 0;
        }
    }

    private static final java.util.List cpuDirs_delegate$lambda$0()
    {
        uo0 v0_1;
        uo0 v0_3 = new java.io.File("/sys/devices/system/cpu").listFiles(new ev1(2));
        if (v0_3 == null) {
            v0_1 = 0;
        } else {
            v0_1 = wh.n0(v0_3, new com.lele.llmonitor.data.soc.LinuxSocDataSource$cpuDirs_delegate$lambda$0$$inlined$sortedBy$1());
        }
        if (v0_1 == null) {
            v0_1 = uo0.d;
        }
        return v0_1;
    }

    private static final boolean cpuDirs_delegate$lambda$0$0(java.io.File p1)
    {
        if (p1.isDirectory()) {
            int v1_5 = p1.getName();
            v1_5.getClass();
            java.util.regex.Pattern v0_2 = java.util.regex.Pattern.compile("cpu\\d+");
            v0_2.getClass();
            if (v0_2.matcher(v1_5).matches()) {
                return 1;
            }
        }
        return 0;
    }

    public static synthetic java.util.List d()
    {
        return com.lele.llmonitor.data.soc.LinuxSocDataSource.cpuDirs_delegate$lambda$0();
    }

    private final int divisorFractionDigits(int p1)
    {
        if (p1 == 10) {
            return 1;
        } else {
            if (p1 == 100) {
                return 2;
            } else {
                if (p1 == 1000) {
                    return 3;
                } else {
                    return 0;
                }
            }
        }
    }

    public static synthetic boolean e(java.io.File p0)
    {
        return com.lele.llmonitor.data.soc.LinuxSocDataSource.readPolicyFrequencyMap$lambda$0(p0);
    }

    private final Float estimateCpuUsageFromFrequencies()
    {
        Float v12_1 = this.readCpuCoreFrequencies();
        int v0_3 = new java.util.ArrayList();
        Float v12_9 = v12_1.iterator();
        while (v12_9.hasNext()) {
            int v1_0 = v12_9.next();
            if (((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) v1_0).getOnline()) {
                v0_3.add(v1_0);
            }
        }
        if (!v0_3.isEmpty()) {
            Float v12_3 = new java.util.ArrayList;
            v12_3();
            float v2_3 = v0_3.size();
            int v3 = 0;
            float v4_0 = 0;
            while (v4_0 < v2_3) {
                qh2 v5_0;
                int v6_1 = v0_3.get(v4_0);
                v4_0++;
                int v6_2 = ((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) v6_1);
                int v7_0 = v6_2.getCurrentMHz();
                if (v7_0 == 0) {
                    v5_0 = 0;
                } else {
                    int v7_3 = Float.valueOf(((float) v7_0.intValue()));
                    if (v7_3.floatValue() <= 0) {
                        v7_3 = 0;
                    }
                    if (v7_3 == 0) {
                    } else {
                        int v6_3 = v6_2.getMaxMHz();
                        if (v6_3 == 0) {
                        } else {
                            int v6_6 = Float.valueOf(((float) v6_3.intValue()));
                            if (v6_6.floatValue() <= 0) {
                                v6_6 = 0;
                            }
                            if (v6_6 == 0) {
                            } else {
                                v5_0 = new qh2(v7_3, v6_6);
                            }
                        }
                    }
                }
                if (v5_0 != null) {
                    v12_3.add(v5_0);
                }
            }
            if (!v12_3.isEmpty()) {
                int v0_2 = v12_3.size();
                int v6_0 = 0;
                float v2_4 = 0;
                double v8_0 = 0;
                while (v2_4 < v0_2) {
                    float v4_6 = v12_3.get(v2_4);
                    v2_4++;
                    v8_0 += ((double) ((Number) ((qh2) v4_6).d).floatValue());
                }
                int v0_4 = ((float) v8_0);
                float v2_5 = v12_3.size();
                while (v3 < v2_5) {
                    float v4_1 = v12_3.get(v3);
                    v3++;
                    v6_0 += ((double) ((Number) ((qh2) v4_1).e).floatValue());
                }
                Float v12_4 = ((float) v6_0);
                if (v12_4 > 0) {
                    return Float.valueOf((ib1.k((v0_4 / v12_4), 0, 1065353216) * 1120403456));
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    private final java.util.List filterSocThermalCandidates(java.util.List p5)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        java.util.Iterator v5_1 = p5.iterator();
        while (v5_1.hasNext()) {
            Object v1_1 = v5_1.next();
            boolean v2_2 = ((com.lele.llmonitor.data.soc.ThermalZoneReading) v1_1).getType();
            boolean v3_0 = java.util.Locale.getDefault();
            v3_0.getClass();
            boolean v2_3 = v2_2.toLowerCase(v3_0);
            v2_3.getClass();
            if ((!this.isIrrelevantThermalType(v2_3)) && (this.isSocFocusedThermalType(v2_3))) {
                v0_1.add(v1_1);
            }
        }
        return v0_1;
    }

    private final String formatPercent(float p2)
    {
        return String.format(java.util.Locale.getDefault(), "%.1f%%", java.util.Arrays.copyOf(new Object[] {Float.valueOf(p2)}), 1));
    }

    private final String formatTemp(float p4, int p5)
    {
        return String.format(java.util.Locale.getDefault(), s42.g(ib1.l(p5, 0, 1), "%.", "f \u00b0C"), java.util.Arrays.copyOf(new Object[] {Float.valueOf(p4)}), 1));
    }

    private final java.util.List getCpuDirs()
    {
        return ((java.util.List) this.cpuDirs$delegate.getValue());
    }

    private final boolean hasPeerAgreement(com.lele.llmonitor.data.soc.ThermalZoneReading p4, java.util.List p5)
    {
        this = 0;
        if ((p5 == null) || (!p5.isEmpty())) {
            java.util.Iterator v5_1 = p5.iterator();
            while (v5_1.hasNext()) {
                float v0_1 = ((com.lele.llmonitor.data.soc.ThermalZoneReading) v5_1.next());
                if ((!ni1.o(v0_1.getZone(), p4.getZone())) && (Math.abs((v0_1.getTempC() - p4.getTempC())) <= 1086324736)) {
                    this = 1;
                    break;
                }
            }
            return this;
        } else {
            return 0;
        }
    }

    private final boolean isApThermalType(String p2)
    {
        if (!hh3.m0(p2, "apss", 0)) {
            int v1_6 = java.util.regex.Pattern.compile("(^|[_-])ap([_-]|$)");
            v1_6.getClass();
            if (!v1_6.matcher(p2).find()) {
                return 0;
            }
        }
        return 1;
    }

    private final boolean isIrrelevantThermalType(String p20)
    {
        int v0_0 = java.util.Locale.getDefault();
        v0_0.getClass();
        int v0_2 = p20.toLowerCase(v0_0);
        v0_2.getClass();
        int v3 = "usb";
        String v5 = "wlc";
        String v7 = "chg";
        String v9 = "quiet";
        String v11 = "disp";
        String v13 = "flash";
        String v15 = "wifi";
        java.util.Iterator v1_1 = r7.M(new String[] {"battery", "bcl"}));
        if (!v1_1.isEmpty()) {
            java.util.Iterator v1_3 = v1_1.iterator();
            while (v1_3.hasNext()) {
                if (hh3.m0(v0_2, ((String) v1_3.next()), 0)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    private final boolean isReliableSocTemperatureCandidate(com.lele.llmonitor.data.soc.ThermalZoneReading p4, int p5, Float p6, java.util.List p7)
    {
        if (p5 >= 35) {
            if (p4.getTempC() <= 1123024896) {
                if ((p6 == 0) || ((p4.getTempC() + 1092616192) >= p6.floatValue())) {
                    if (p4.getTempC() >= 1097859072) {
                        return 1;
                    } else {
                        int v4_4;
                        boolean v3_1 = this.hasPeerAgreement(p4, p7);
                        if ((p6 != 0) && ((p4.getTempC() + 1084227584) < p6.floatValue())) {
                            v4_4 = 0;
                        } else {
                            v4_4 = 1;
                        }
                        if ((p5 < 60) || ((!v3_1) || (v4_4 == 0))) {
                            return 0;
                        } else {
                            return 1;
                        }
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
    }

    private final boolean isSocFocusedThermalType(String p3)
    {
        if ((!hh3.m0(p3, "soc", 0)) && ((!hh3.m0(p3, "cpu", 0)) && ((!hh3.m0(p3, "cpuss", 0)) && ((!this.isApThermalType(p3)) && ((!hh3.m0(p3, "tsens", 0)) && ((!hh3.m0(p3, "cluster", 0)) && ((!hh3.m0(p3, "little", 0)) && ((!hh3.m0(p3, "big", 0)) && ((!hh3.m0(p3, "gold", 0)) && ((!hh3.m0(p3, "silver", 0)) && (!hh3.m0(p3, "prime", 0)))))))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    private final com.lele.llmonitor.data.soc.NormalizedThermalTemp normalizeThermalTemp(float p36, String p37, String p38)
    {
        int v31;
        if (p36 > 0) {
            com.lele.llmonitor.data.soc.NormalizedThermalTemp v1_4 = java.util.Locale.getDefault();
            v1_4.getClass();
            com.lele.llmonitor.data.soc.NormalizedThermalTemp v1_5 = p37.toLowerCase(v1_4);
            v1_5.getClass();
            int v3_1 = this.countFractionDigits(p38);
            int v5_11 = r7.M(new Integer[] {Integer.valueOf(1), Integer.valueOf(10), Integer.valueOf(100), Integer.valueOf(1000)}));
            boolean v7_5 = new java.util.ArrayList(zw.j0(v5_11, 10));
            int v5_12 = v5_11.iterator();
            while (v5_12.hasNext()) {
                int v8_8 = ((Number) v5_12.next()).intValue();
                int v11_1 = ((float) v8_8);
                v7_5.add(new com.lele.llmonitor.data.soc.ThermalTempCandidate((p36 / v11_1), v11_1, ib1.l((this.divisorFractionDigits(v8_8) + v3_1), 0, 1)));
            }
            int v3_4 = new java.util.ArrayList();
            Object v4_3 = v7_5.size();
            int v5_9 = 0;
            do {
                int v8_2 = 1092616192;
                if (v5_9 >= v4_3) {
                    if (!v3_4.isEmpty()) {
                        Object v4_1;
                        int v3_5 = v3_4.iterator();
                        if (v3_5.hasNext()) {
                            v4_1 = v3_5.next();
                            if (v3_5.hasNext()) {
                                int v12_9;
                                int v5_15 = ((com.lele.llmonitor.data.soc.ThermalTempCandidate) v4_1);
                                boolean v7_6 = v5_15.getValue();
                                int v5_16 = v5_15.getDivisor();
                                if ((1103626240 > v7_6) || (v7_6 > 1119748096)) {
                                    if ((1097859072 > v7_6) || (v7_6 > 1123024896)) {
                                        v12_9 = -40;
                                    } else {
                                        v12_9 = 10;
                                    }
                                } else {
                                    v12_9 = 40;
                                }
                                int v5_1;
                                if (v5_16 != 1148846080) {
                                    if (v5_16 != 1120403456) {
                                        if (v5_16 != 1092616192) {
                                            if (p36 > 1125515264) {
                                                v5_1 = -20;
                                            } else {
                                                v5_1 = 15;
                                            }
                                            int v12_0 = (v12_9 + v5_1);
                                            v31 = 0;
                                            if (((hh3.m0(v1_5, "cpu", 0)) || ((hh3.m0(v1_5, "soc", 0)) || (hh3.m0(v1_5, "ap", 0)))) && (v7_6 < 1101004800)) {
                                                v12_0 -= 30;
                                            }
                                            while(true) {
                                                int v33_4;
                                                boolean v7_1 = v3_5.next();
                                                int v19_4 = ((com.lele.llmonitor.data.soc.ThermalTempCandidate) v7_1);
                                                float v32 = v19_4.getValue();
                                                int v19_5 = v19_4.getDivisor();
                                                if ((1103626240 > v32) || (v32 > 1119748096)) {
                                                    if ((1097859072 > v32) || (v32 > 1123024896)) {
                                                        v33_4 = -40;
                                                    } else {
                                                        v33_4 = 10;
                                                    }
                                                } else {
                                                    v33_4 = 40;
                                                }
                                                int v19_8;
                                                if (v19_5 != 1148846080) {
                                                    if (v19_5 != 1120403456) {
                                                        if (v19_5 != v8_2) {
                                                            if (p36 > 1125515264) {
                                                                v19_8 = -20;
                                                            } else {
                                                                v19_8 = 15;
                                                            }
                                                            int v33_5 = (v33_4 + v19_8);
                                                            if (((hh3.m0(v1_5, "cpu", 0)) || ((hh3.m0(v1_5, "soc", 0)) || (hh3.m0(v1_5, "ap", 0)))) && (v32 < 1101004800)) {
                                                                v33_5 -= 30;
                                                            }
                                                            int v8_0 = v33_5;
                                                            if (v12_0 < v8_0) {
                                                                v4_1 = v7_1;
                                                                v12_0 = v8_0;
                                                            }
                                                            if (!v3_5.hasNext()) {
                                                                break;
                                                            }
                                                            v8_2 = 1092616192;
                                                        } else {
                                                            if ((1125515264 <= p36) && (p36 <= 1153138688)) {
                                                                v19_8 = 20;
                                                            }
                                                        }
                                                    } else {
                                                        if ((1153138688 <= p36) && (p36 <= 1184645120)) {
                                                            v19_8 = 18;
                                                        }
                                                    }
                                                    v19_8 = 4;
                                                } else {
                                                    if (p36 < 1184645120) {
                                                        v19_8 = 5;
                                                    } else {
                                                        v19_8 = 25;
                                                    }
                                                }
                                            }
                                            Object v4_2 = ((com.lele.llmonitor.data.soc.ThermalTempCandidate) v4_1);
                                            if (v4_2 != null) {
                                                return new com.lele.llmonitor.data.soc.NormalizedThermalTemp(this.roundToFractionDigits(v4_2.getValue(), v4_2.getFractionDigits()), v4_2.getFractionDigits());
                                            }
                                            return v31;
                                        } else {
                                            if ((1125515264 <= p36) && (p36 <= 1153138688)) {
                                                v5_1 = 20;
                                            }
                                        }
                                    } else {
                                        if ((1153138688 <= p36) && (p36 <= 1184645120)) {
                                            v5_1 = 18;
                                        }
                                    }
                                    v5_1 = 4;
                                } else {
                                    if (p36 < 1184645120) {
                                        v5_1 = 5;
                                    } else {
                                        v5_1 = 25;
                                    }
                                }
                            } else {
                                v31 = 0;
                            }
                        } else {
                            v4_1 = 0;
                        }
                    } else {
                        v31 = 0;
                    }
                } else {
                    int v11_0 = v7_5.get(v5_9);
                    v5_9++;
                    int v12_3 = ((com.lele.llmonitor.data.soc.ThermalTempCandidate) v11_0).getValue();
                }
            } while((1092616192 > v12_3) || (v12_3 > 1125515264));
            v3_4.add(v11_0);
        }
        return v31;
    }

    private final java.util.Set parseCpuList(String p9)
    {
        if (!hh3.w0(p9)) {
            java.util.LinkedHashSet v8_2 = new java.util.LinkedHashSet;
            v8_2();
            int v1_3 = new char[2];
            v1_3 = {44, 32};
            java.util.ArrayList v9_1 = hh3.H0(p9, v1_3, 6);
            int v1_1 = new java.util.ArrayList(zw.j0(v9_1, 10));
            java.util.ArrayList v9_2 = v9_1.iterator();
            while (v9_2.hasNext()) {
                v1_1.add(hh3.O0(((String) v9_2.next())).toString());
            }
            java.util.ArrayList v9_4 = new java.util.ArrayList();
            int v2_5 = v1_1.size();
            int v4_0 = 0;
            while (v4_0 < v2_5) {
                int v5_6 = v1_1.get(v4_0);
                v4_0++;
                if (((String) v5_6).length() > 0) {
                    v9_4.add(v5_6);
                }
            }
            int v1_2 = v9_4.size();
            int v2_6 = 0;
            while (v2_6 < v1_2) {
                int v4_1 = v9_4.get(v2_6);
                v2_6++;
                int v4_2 = ((String) v4_1);
                if (!hh3.n0(v4_2, 45)) {
                    int v4_3 = oh3.k0(v4_2);
                    if (v4_3 == 0) {
                    } else {
                        v8_2.add(Integer.valueOf(v4_3.intValue()));
                    }
                } else {
                    int v5_3;
                    Integer v7_0 = new char[1];
                    v7_0[0] = 45;
                    int v4_6 = hh3.H0(v4_2, v7_0, 2);
                    int v5_2 = ((String) yw.B0(0, v4_6));
                    Integer v7_1 = 0;
                    if (v5_2 == 0) {
                        v5_3 = 0;
                    } else {
                        v5_3 = oh3.k0(v5_2);
                    }
                    int v4_8 = ((String) yw.B0(1, v4_6));
                    if (v4_8 != 0) {
                        v7_1 = oh3.k0(v4_8);
                    }
                    if ((v5_3 != 0) && (v7_1 != null)) {
                        int v4_10 = Math.min(v5_3.intValue(), v7_1.intValue());
                        int v5_5 = Math.max(v5_3.intValue(), v7_1.intValue());
                        if (v4_10 <= v5_5) {
                        }
                        while(true) {
                            v8_2.add(Integer.valueOf(v4_10));
                            if (v4_10 == v5_5) {
                                break;
                            }
                            v4_10++;
                        }
                    }
                }
            }
            return v8_2;
        } else {
            return zo0.d;
        }
    }

    private final Float readBatteryTempForHint()
    {
        try {
            Float v3_0 = new java.io.File;
            v3_0("/sys/class/power_supply/battery/temp");
            Float v3_2 = Float.valueOf(Float.parseFloat(hh3.O0(wt0.V(v3_0)).toString()));
        } catch (Float v3_3) {
            v3_2 = new cw2(v3_3);
        }
        if ((v3_2 instanceof cw2)) {
            v3_2 = 0;
        }
        Float v3_4 = ((Float) v3_2);
        if (v3_4 == null) {
            return 0;
        } else {
            float v0_4 = v3_4.floatValue();
            if (v0_4 <= 1148846080) {
                if (v0_4 > 1125515264) {
                    v3_4 = Float.valueOf((v0_4 / 1092616192));
                }
            } else {
                v3_4 = Float.valueOf((v0_4 / 1148846080));
            }
            return v3_4;
        }
    }

    private final com.lele.llmonitor.data.soc.CpuTimes readCpuTimesFromProcStat()
    {
        long v0 = 0;
        com.lele.llmonitor.data.soc.CpuTimes v9_0 = Long.valueOf(0);
        try {
            long v4_10;
            int v3_6 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("/proc/stat")), uu.a), 8192);
            try {
                long v4_9;
                long v4_8 = ((d40) b63.a0(new yh(2, v3_6))).iterator();
            } catch (long v4_11) {
                try {
                    throw v4_11;
                } catch (int v5_5) {
                    p34.j(v3_6, v4_11);
                    throw v5_5;
                }
            }
            if (v4_8.hasNext()) {
                v4_9 = v4_8.next();
            } else {
                v4_9 = 0;
            }
            v4_10 = ((String) v4_9);
            v3_6.close();
            if ((v4_10 instanceof cw2)) {
                v4_10 = 0;
            }
            long v4_13 = ((String) v4_10);
            if (v4_13 != 0) {
                int v3_15;
                int v3_11 = hh3.O0(v4_13).toString();
                long v4_16 = java.util.regex.Pattern.compile("\\s+");
                v4_16.getClass();
                v3_11.getClass();
                int v5_2 = 0;
                hh3.E0(0);
                long v4_17 = v4_16.matcher(v3_11);
                if (v4_17.find()) {
                    int v6_9 = new java.util.ArrayList(10);
                    int v7_1 = 0;
                    do {
                        v6_9.add(v3_11.subSequence(v7_1, v4_17.start()).toString());
                        v7_1 = v4_17.end();
                    } while(v4_17.find());
                    v6_9.add(v3_11.subSequence(v7_1, v3_11.length()).toString());
                    v3_15 = v6_9;
                } else {
                    v3_15 = r7.L(v3_11.toString());
                }
                if ((!v3_15.isEmpty()) && (ni1.o(v3_15.get(0), "cpu"))) {
                    int v3_17 = yw.u0(v3_15);
                    long v4_0 = new java.util.ArrayList();
                    int v3_0 = v3_17.iterator();
                    while (v3_0.hasNext()) {
                        int v6_6 = oh3.l0(((String) v3_0.next()));
                        if (v6_6 != 0) {
                            v4_0.add(v6_6);
                        }
                    }
                    if (!v4_0.isEmpty()) {
                        long v2_0 = v4_0.size();
                        while (v5_2 < v2_0) {
                            int v3_4 = v4_0.get(v5_2);
                            v5_2++;
                            v0 += ((Number) v3_4).longValue();
                        }
                        long v2_2;
                        if (3 >= v4_0.size()) {
                            v2_2 = v9_0;
                        } else {
                            v2_2 = v4_0.get(3);
                        }
                        long v2_4 = ((Number) v2_2).longValue();
                        if (4 < v4_0.size()) {
                            v9_0 = v4_0.get(4);
                        }
                        com.lele.llmonitor.data.soc.CpuTimes v9_2 = new com.lele.llmonitor.data.soc.CpuTimes;
                        v9_2(v0, (((Number) v9_0).longValue() + v2_4));
                        return v9_2;
                    }
                }
            }
            return 0;
        } catch (int v3_7) {
            v4_10 = new cw2(v3_7);
        }
    }

    private final Float readLoadAvg1FromUptime()
    {
        Float v7_8 = com.lele.llmonitor.data.soc.LinuxSocDataSource.runCommand$default(this, new String[] {"/system/bin/uptime"}), 0, 2, 0);
        if (v7_8 != null) {
            int v0_2 = java.util.regex.Pattern.compile("load averages?:\\s*([0-9]+(?:\\.[0-9]+)?)[,\\s]+([0-9]+(?:\\.[0-9]+)?)[,\\s]+([0-9]+(?:\\.[0-9]+)?)", 66);
            v0_2.getClass();
            int v0_3 = v0_2.matcher(v7_8);
            v0_3.getClass();
            Float v7_1 = df2.h(v0_3, 0, v7_8);
            if (v7_1 != null) {
                return nh3.a0(((String) ((e02) v7_1.a()).get(1)));
            }
        }
        return 0;
    }

    private final pt3 readLoadAvgFromProc()
    {
        try {
            Float v6_0 = new java.io.File;
            v6_0("/proc/loadavg");
            Float v6_1 = hh3.O0(wt0.V(v6_0)).toString();
        } catch (Float v6_12) {
            v6_1 = new cw2(v6_12);
        }
        pt3 v1_0 = 0;
        if ((v6_1 instanceof cw2)) {
            v6_1 = 0;
        }
        Float v6_2 = ((String) v6_1);
        if (v6_2 != null) {
            Float v6_6;
            int v0_5 = java.util.regex.Pattern.compile("\\s+");
            v0_5.getClass();
            hh3.E0(0);
            int v0_6 = v0_5.matcher(v6_2);
            if (v0_6.find()) {
                int v3_2 = new java.util.ArrayList(10);
                int v4_1 = 0;
                do {
                    v3_2.add(v6_2.subSequence(v4_1, v0_6.start()).toString());
                    v4_1 = v0_6.end();
                } while(v0_6.find());
                v3_2.add(v6_2.subSequence(v4_1, v6_2.length()).toString());
                v6_6 = v3_2;
            } else {
                v6_6 = r7.L(v6_2.toString());
            }
            if (v6_6.size() >= 3) {
                int v0_11 = nh3.a0(((String) v6_6.get(0)));
                if (v0_11 != 0) {
                    Float v2_4 = nh3.a0(((String) v6_6.get(1)));
                    if (v2_4 != null) {
                        Float v6_11 = nh3.a0(((String) v6_6.get(2)));
                        if (v6_11 != null) {
                            v1_0 = new pt3(v0_11, v2_4, v6_11);
                        }
                    }
                }
            }
        }
        return v1_0;
    }

    private final Long readLong(java.io.File p6, String p7)
    {
        try {
            boolean v5_0 = new java.io.File;
            v5_0(p6, p7);
            boolean v5_4 = hh3.O0(wt0.V(v5_0)).toString();
        } catch (boolean v5_18) {
            v5_4 = new cw2(v5_18);
        }
        Object v7_1 = 0;
        if ((v5_4 instanceof cw2)) {
            v5_4 = 0;
        }
        boolean v5_5 = ((String) v5_4);
        if (v5_5) {
            java.util.Iterator v6_3 = oh3.l0(v5_5);
            if (v6_3 == null) {
                java.util.Iterator v6_5 = new yt2("-?\\d+");
                if (v5_5.length() < 0) {
                    boolean v5_7 = v5_5.length();
                    Object v7_3 = new StringBuilder("Start index out of bounds: 0, input length: ");
                    v7_3.append(v5_7);
                    throw new IndexOutOfBoundsException(v7_3.toString());
                } else {
                    java.util.Iterator v6_9 = new m21(0, new n2(27, v6_5, v5_5), xt2.d);
                    boolean v5_10 = new tk1;
                    v5_10(9);
                    long v0_7 = new gs3(v6_9, v5_10);
                    boolean v5_12 = new yz2;
                    v5_12(28);
                    boolean v5_13 = b63.e0(new bu0(v0_7, 0, v5_12));
                    if (!v5_13.isEmpty()) {
                        if (v5_13.size() != 1) {
                            java.util.Iterator v6_15 = v5_13.iterator();
                            if (v6_15.hasNext()) {
                                v7_1 = v6_15.next();
                                if (v6_15.hasNext()) {
                                    long v0_10 = Math.abs(((Number) v7_1).longValue());
                                    do {
                                        boolean v5_19 = v6_15.next();
                                        long v2_3 = Math.abs(((Number) v5_19).longValue());
                                        if (v0_10 < v2_3) {
                                            v7_1 = v5_19;
                                            v0_10 = v2_3;
                                        }
                                    } while(v6_15.hasNext());
                                }
                            }
                            return ((Long) v7_1);
                        } else {
                            return ((Long) yw.z0(v5_13));
                        }
                    }
                }
            } else {
                return Long.valueOf(v6_3.longValue());
            }
        }
        return 0;
    }

    private static final Long readLong$lambda$2(d02 p0)
    {
        p0.getClass();
        Long v0_3 = ((g02) p0).a.group();
        v0_3.getClass();
        return oh3.l0(v0_3);
    }

    private final java.util.Map readPolicyFrequencyMap()
    {
        java.util.Iterator v0_1;
        java.util.Iterator v0_4 = new java.io.File("/sys/devices/system/cpu/cpufreq").listFiles(new ev1(0));
        if (v0_4 == null) {
            v0_1 = 0;
        } else {
            v0_1 = wh.n0(v0_4, new com.lele.llmonitor.data.soc.LinuxSocDataSource$readPolicyFrequencyMap$$inlined$sortedBy$1());
        }
        if (v0_1 == null) {
            v0_1 = uo0.d;
        }
        String v2_4 = b02.L(zw.j0(v0_1, 10));
        if (v2_4 < 16) {
            v2_4 = 16;
        }
        java.util.LinkedHashMap v3_2 = new java.util.LinkedHashMap(v2_4);
        java.util.Iterator v0_3 = v0_1.iterator();
        while (v0_3.hasNext()) {
            String v2_7 = ((java.io.File) v0_3.next());
            try {
                java.util.Set v4_4 = hh3.O0(wt0.V(new java.io.File(v2_7, "related_cpus"))).toString();
            } catch (java.util.Set v4_5) {
                v4_4 = new cw2(v4_5);
            }
            if ((v4_4 instanceof cw2)) {
                v4_4 = 0;
            }
            java.util.Set v4_6 = ((String) v4_4);
            if (v4_6 == null) {
                v4_6 = "";
            }
            java.util.Set v4_7 = this.parseCpuList(v4_6);
            v2_7.getClass();
            Long v5_5 = this.readLong(v2_7, "scaling_cur_freq");
            if (v5_5 == null) {
                v5_5 = this.readLong(v2_7, "cpuinfo_cur_freq");
            }
            Long v6_1 = this.readLong(v2_7, "cpuinfo_max_freq");
            if (v6_1 == null) {
                v6_1 = this.readLong(v2_7, "scaling_max_freq");
            }
            String v7 = v2_7.getName();
            String v2_9 = v2_7.getName();
            v2_9.getClass();
            v3_2.put(v7, new com.lele.llmonitor.data.soc.PolicyFrequency(v2_9, v4_7, v5_5, v6_1));
        }
        return v3_2;
    }

    private static final boolean readPolicyFrequencyMap$lambda$0(java.io.File p2)
    {
        if (p2.isDirectory()) {
            int v2_2 = p2.getName();
            v2_2.getClass();
            if (oh3.j0(v2_2, "policy", 0)) {
                return 1;
            }
        }
        return 0;
    }

    private final java.util.List readThermalZones()
    {
        java.util.Iterator v0_1;
        java.util.Iterator v0_4 = new java.io.File("/sys/class/thermal").listFiles(new ev1(1));
        if (v0_4 == null) {
            v0_1 = 0;
        } else {
            v0_1 = wh.n0(v0_4, new com.lele.llmonitor.data.soc.LinuxSocDataSource$readThermalZones$$inlined$sortedBy$1());
        }
        if (v0_1 == null) {
            v0_1 = uo0.d;
        }
        java.util.ArrayList v2_3 = new java.util.ArrayList();
        java.util.Iterator v0_3 = v0_1.iterator();
        while (v0_3.hasNext()) {
            String v3_2 = ((java.io.File) v0_3.next());
            try {
                String v4_4 = hh3.O0(wt0.V(new java.io.File(v3_2, "type"))).toString();
            } catch (String v4_5) {
                v4_4 = new cw2(v4_5);
            }
            if ((v4_4 instanceof cw2)) {
                v4_4 = 0;
            }
            com.lele.llmonitor.data.soc.ThermalZoneReading v6_7;
            String v4_6 = ((String) v4_4);
            if (v4_6 != null) {
                try {
                    int v5_8 = hh3.O0(wt0.V(new java.io.File(v3_2, "temp"))).toString();
                } catch (int v5_9) {
                    v5_8 = new cw2(v5_9);
                }
                if ((v5_8 instanceof cw2)) {
                    v5_8 = 0;
                }
                int v5_10 = ((String) v5_8);
                if (v5_10 != 0) {
                    com.lele.llmonitor.data.soc.ThermalZoneReading v6_4 = nh3.a0(v5_10);
                    if (v6_4 == null) {
                        v6_7 = 0;
                    } else {
                        int v5_11 = this.normalizeThermalTemp(v6_4.floatValue(), v4_6, v5_10);
                        if (v5_11 != 0) {
                            String v3_3 = v3_2.getName();
                            v3_3.getClass();
                            v6_7 = new com.lele.llmonitor.data.soc.ThermalZoneReading(v3_3, v4_6, v5_11.getCelsius(), v5_11.getFractionDigits());
                        }
                    }
                }
            }
            if (v6_7 != null) {
                v2_3.add(v6_7);
            }
        }
        return v2_3;
    }

    private static final boolean readThermalZones$lambda$0(java.io.File p2)
    {
        if (p2.isDirectory()) {
            int v2_2 = p2.getName();
            v2_2.getClass();
            if (oh3.j0(v2_2, "thermal_zone", 0)) {
                return 1;
            }
        }
        return 0;
    }

    private final float roundToFractionDigits(float p5, int p6)
    {
        float v4_1;
        if (p6 > 0) {
            double v0_1 = Math.pow(4621819117588971520, ((double) p6));
            v4_1 = (Math.rint((((double) p5) * v0_1)) / v0_1);
        } else {
            v4_1 = Math.rint(((double) p5));
        }
        return ((float) v4_1);
    }

    private final String runCommand(String[] p3, long p4)
    {
        String v2_0 = 0;
        Throwable v4_4;
        boolean v3_1 = new ProcessBuilder(((String[]) java.util.Arrays.copyOf(p3, p3.length))).redirectErrorStream(1).start();
        if (v3_1.waitFor(p4, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            boolean v3_2 = v3_1.getInputStream();
            v3_2.getClass();
            boolean v3_4 = new java.io.BufferedReader(new java.io.InputStreamReader(v3_2, uu.a), 8192);
            try {
                v4_4 = df2.P(v3_4);
            } catch (Throwable v4_5) {
                try {
                    throw v4_5;
                } catch (Throwable v5_2) {
                    p34.j(v3_4, v4_5);
                    throw v5_2;
                }
            }
            v3_4.close();
            if (!(v4_4 instanceof cw2)) {
                v2_0 = v4_4;
            }
            return ((String) v2_0);
        } else {
            v3_1.destroyForcibly();
            v4_4 = 0;
        }
    }

    public static synthetic String runCommand$default(com.lele.llmonitor.data.soc.LinuxSocDataSource p0, String[] p1, long p2, int p4, Object p5)
    {
        if ((p4 & 2) != 0) {
            p2 = 1200;
        }
        return p0.runCommand(p1, p2);
    }

    private final Object sampleCpuUsageShortWindow(n60 p6)
    {
        com.lele.llmonitor.data.soc.CpuTimes v0_4;
        if (!(p6 instanceof com.lele.llmonitor.data.soc.LinuxSocDataSource$sampleCpuUsageShortWindow$1)) {
            v0_4 = new com.lele.llmonitor.data.soc.LinuxSocDataSource$sampleCpuUsageShortWindow$1(this, p6);
        } else {
            v0_4 = ((com.lele.llmonitor.data.soc.LinuxSocDataSource$sampleCpuUsageShortWindow$1) p6);
            e80 v1_3 = ((com.lele.llmonitor.data.soc.LinuxSocDataSource$sampleCpuUsageShortWindow$1) p6).label;
            if ((v1_3 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.data.soc.LinuxSocDataSource$sampleCpuUsageShortWindow$1) p6).label = (v1_3 - -2147483648);
            }
        }
        com.lele.llmonitor.data.soc.CpuTimes v0_3;
        com.lele.llmonitor.data.soc.CpuTimes v6_1 = v0_4.result;
        e80 v1_1 = v0_4.label;
        if (v1_1 == null) {
            ib1.Q(v6_1);
            com.lele.llmonitor.data.soc.CpuTimes v6_2 = this.readCpuTimesFromProcStat();
            if (v6_2 != null) {
                v0_4.L$0 = v6_2;
                v0_4.label = 1;
                e80 v1_2 = e80.d;
                if (n54.r(360, v0_4) != v1_2) {
                    v0_3 = v6_2;
                } else {
                    return v1_2;
                }
            } else {
                return 0;
            }
        } else {
            if (v1_1 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                v0_3 = ((com.lele.llmonitor.data.soc.CpuTimes) v0_4.L$0);
                ib1.Q(v6_1);
            }
        }
        com.lele.llmonitor.data.soc.CpuTimes v6_3 = this.readCpuTimesFromProcStat();
        if (v6_3 != null) {
            return this.calculateCpuUsagePercent(v0_3, v6_3);
        } else {
            return 0;
        }
    }

    private final int scoreThermalZone(com.lele.llmonitor.data.soc.ThermalZoneReading p8, Float p9)
    {
        int v1_8;
        String v0_0 = p8.getType();
        int v1_9 = java.util.Locale.getDefault();
        v1_9.getClass();
        String v0_1 = v0_0.toLowerCase(v1_9);
        v0_1.getClass();
        int v3_0 = 40;
        if (!hh3.m0(v0_1, "soc", 0)) {
            if (!hh3.m0(v0_1, "cpu", 0)) {
                if (!this.isApThermalType(v0_1)) {
                    if (!hh3.m0(v0_1, "tsens", 0)) {
                        if (!hh3.m0(v0_1, "gpu", 0)) {
                            v1_8 = -10;
                        } else {
                            v1_8 = 40;
                        }
                    } else {
                        v1_8 = 70;
                    }
                } else {
                    v1_8 = 80;
                }
            } else {
                v1_8 = 90;
            }
        } else {
            v1_8 = 100;
        }
        int v2_0 = p8.getTempC();
        int v5 = 10;
        if ((1103626240 > v2_0) || (v2_0 > 1119748096)) {
            int v2_2 = p8.getTempC();
            if ((1097859072 > v2_2) || (v2_2 > 1123024896)) {
                v3_0 = -60;
            } else {
                v3_0 = 10;
            }
        }
        int v1_10 = (v1_8 + v3_0);
        if (p8.getTempC() >= 1097859072) {
            if (p8.getTempC() < 1101004800) {
                v1_10 -= 30;
            }
        } else {
            v1_10 -= 80;
        }
        if (p9 != 0) {
            int v2_9 = (p8.getTempC() - p9.floatValue());
            if ((0 > v2_9) || (v2_9 > 1106247680)) {
                if ((-1063256064 > v2_9) || (v2_9 > 1110704128)) {
                    v5 = -15;
                }
            } else {
                v5 = 25;
            }
            v1_10 += v5;
            if ((p8.getTempC() + 1090519040) < p9.floatValue()) {
                v1_10 -= 70;
            }
        }
        if (!this.isSocFocusedThermalType(v0_1)) {
            v1_10 -= 25;
        }
        return v1_10;
    }

    public com.lele.llmonitor.data.soc.CpuModelResult probeCpuModel()
    {
        com.lele.llmonitor.data.soc.CpuModelResult v0_0 = this.cachedCpuModelResult;
        if (v0_0 == null) {
            java.util.ArrayList v2_1 = new java.util.ArrayList();
            if (android.os.Build$VERSION.SDK_INT < 31) {
                v2_1.add(new com.lele.llmonitor.data.soc.SourceProbe("Build.SOC_MODEL", "API<31", 0));
            } else {
                com.lele.llmonitor.data.soc.CpuModelResult v0_11 = k6.p();
                v0_11.getClass();
                com.lele.llmonitor.data.soc.CpuModelResult v0_13 = hh3.O0(v0_11).toString();
                if ((v0_13.length() <= 0) || (v0_13.equalsIgnoreCase("unknown"))) {
                    v2_1.add(new com.lele.llmonitor.data.soc.SourceProbe("Build.SOC_MODEL", "unavailable", 0));
                } else {
                    v2_1.add(new com.lele.llmonitor.data.soc.SourceProbe("Build.SOC_MODEL", v0_13, 1));
                    String v1_8 = new com.lele.llmonitor.data.soc.CpuModelResult(v0_13, v2_1);
                    this.cachedCpuModelResult = v1_8;
                    return v1_8;
                }
            }
            try {
                com.lele.llmonitor.data.soc.CpuModelResult v0_18 = wt0.U(new java.io.File("/proc/cpuinfo"));
            } catch (com.lele.llmonitor.data.soc.CpuModelResult v0_19) {
                v0_18 = new cw2(v0_19);
            }
            if ((v0_18 instanceof cw2)) {
                v0_18 = 0;
            }
            com.lele.llmonitor.data.soc.CpuModelResult v0_20 = ((java.util.List) v0_18);
            if (v0_20 == null) {
                v2_1.add(new com.lele.llmonitor.data.soc.SourceProbe("/proc/cpuinfo", "read failed", 0));
            } else {
                boolean v3_14 = r7.M(new String[] {"Hardware", "model name", "Processor", "Model"})).iterator();
                while (v3_14.hasNext()) {
                    com.lele.llmonitor.data.soc.LinuxSocDataSource v9_1 = ((String) v3_14.next());
                    int v10_0 = v0_20.iterator();
                    while (v10_0.hasNext()) {
                        int v11_1 = v10_0.next();
                        if (oh3.d0(hh3.O0(hh3.L0(((String) v11_1), 58)).toString(), v9_1, 1)) {
                        }
                        int v11_3;
                        int v11_2 = ((String) v11_1);
                        int v10_1 = "";
                        if (v11_2 == 0) {
                            v11_3 = 0;
                        } else {
                            v11_3 = hh3.O0(hh3.I0(58, v11_2, "")).toString();
                        }
                        if (v11_3 != 0) {
                            v10_1 = v11_3;
                        }
                        if (v10_1.length() > 0) {
                            v2_1.add(new com.lele.llmonitor.data.soc.SourceProbe(s42.h("/proc/cpuinfo:", v9_1), v10_1, 1));
                            com.lele.llmonitor.data.soc.CpuModelResult v0_10 = new com.lele.llmonitor.data.soc.CpuModelResult(v10_1, v2_1);
                            this.cachedCpuModelResult = v0_10;
                            return v0_10;
                        }
                        v2_1.add(new com.lele.llmonitor.data.soc.SourceProbe("/proc/cpuinfo", "no model field", 0));
                    }
                    v11_1 = 0;
                }
            }
            com.lele.llmonitor.data.soc.CpuModelResult v0_29 = r7.M(new String[] {"ro.soc.model", "ro.hardware", "ro.board.platform"})).iterator();
            while (v0_29.hasNext()) {
                com.lele.llmonitor.data.soc.LinuxSocDataSource v15_1;
                String v1_12 = ((String) v0_29.next());
                com.lele.llmonitor.data.soc.LinuxSocDataSource v15_4 = com.lele.llmonitor.data.soc.LinuxSocDataSource.runCommand$default(this, new String[] {"/system/bin/getprop", v1_12}), 0, 2, 0);
                if (v15_4 == null) {
                    v15_1 = 0;
                } else {
                    v15_1 = hh3.O0(v15_4).toString();
                    if ((v15_1 == null) || ((v15_1.length() <= 0) || (v15_1.equalsIgnoreCase("unknown")))) {
                    }
                }
                if (v15_1 == null) {
                    com.lele.llmonitor.data.soc.LinuxSocDataSource v15_2 = new com.lele.llmonitor.data.soc.SourceProbe;
                    v15_2(s42.h("getprop ", v1_12), "unavailable", 0);
                    v2_1.add(v15_2);
                } else {
                    v2_1.add(new com.lele.llmonitor.data.soc.SourceProbe(s42.h("getprop ", v1_12), v15_1, 1));
                    com.lele.llmonitor.data.soc.CpuModelResult v0_4 = new com.lele.llmonitor.data.soc.CpuModelResult(v15_1, v2_1);
                    this.cachedCpuModelResult = v0_4;
                    return v0_4;
                }
            }
            com.lele.llmonitor.data.soc.LinuxSocDataSource v15_3 = new com.lele.llmonitor.data.soc.CpuModelResult;
            v15_3(0, v2_1);
            return v15_3;
        } else {
            return v0_0;
        }
    }

    public Object probeCpuUsage(com.lele.llmonitor.data.soc.CpuTimes p11, n60 p12)
    {
        String v0_4;
        if (!(p12 instanceof com.lele.llmonitor.data.soc.LinuxSocDataSource$probeCpuUsage$1)) {
            v0_4 = new com.lele.llmonitor.data.soc.LinuxSocDataSource$probeCpuUsage$1(this, p12);
        } else {
            v0_4 = ((com.lele.llmonitor.data.soc.LinuxSocDataSource$probeCpuUsage$1) p12);
            java.util.List v1_4 = ((com.lele.llmonitor.data.soc.LinuxSocDataSource$probeCpuUsage$1) p12).label;
            if ((v1_4 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.data.soc.LinuxSocDataSource$probeCpuUsage$1) p12).label = (v1_4 - -2147483648);
            }
        }
        java.util.List v1_3;
        String v12_2 = v0_4.result;
        java.util.List v1_1 = v0_4.label;
        String v3_0 = "read failed";
        int v5 = 1;
        if (v1_1 == null) {
            ib1.Q(v12_2);
            v1_3 = new java.util.ArrayList();
            String v12_3 = this.readCpuTimesFromProcStat();
            if (v12_3 == null) {
                v1_3.add(new com.lele.llmonitor.data.soc.SourceProbe("proc/stat(delta)", "read failed", 0));
            } else {
                com.lele.llmonitor.data.soc.SourceProbe v7_1;
                Object v11_1 = this.calculateCpuUsagePercent(p11, v12_3);
                if (v11_1 == null) {
                    v7_1 = "delta unavailable";
                } else {
                    v7_1 = this.formatPercent(v11_1.floatValue());
                    if (v7_1 == null) {
                    }
                }
                String v8_0;
                if (v11_1 == null) {
                    v8_0 = 0;
                } else {
                    v8_0 = 1;
                }
                v1_3.add(new com.lele.llmonitor.data.soc.SourceProbe("proc/stat(delta)", v7_1, v8_0));
                if (v11_1 == null) {
                    p11 = v12_3;
                } else {
                    com.lele.llmonitor.data.soc.CpuUsageResult v10_5 = new com.lele.llmonitor.data.soc.CpuUsageResult;
                    v10_5(v11_1, v12_3, v1_3);
                    return v10_5;
                }
            }
            v0_4.L$0 = 0;
            v0_4.L$1 = v1_3;
            v0_4.L$2 = p11;
            v0_4.L$3 = 0;
            v0_4.label = 1;
            v12_2 = this.sampleCpuUsageShortWindow(v0_4);
            String v0_5 = e80.d;
            if (v12_2 == v0_5) {
                return v0_5;
            }
        } else {
            if (v1_1 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                p11 = ((com.lele.llmonitor.data.soc.CpuTimes) v0_4.L$2);
                v1_3 = ((java.util.List) v0_4.L$1);
                ib1.Q(v12_2);
            }
        }
        String v0_8;
        String v12_6 = ((Float) v12_2);
        if (v12_6 == null) {
            v0_8 = "read failed";
        } else {
            v0_8 = this.formatPercent(v12_6.floatValue());
            if (v0_8 == null) {
            }
        }
        int v6_1;
        if (v12_6 == null) {
            v6_1 = 0;
        } else {
            v6_1 = 1;
        }
        v1_3.add(new com.lele.llmonitor.data.soc.SourceProbe("proc/stat(short-window)", v0_8, v6_1));
        if (v12_6 == null) {
            String v12_7 = this.estimateCpuUsageFromFrequencies();
            if (v12_7 != null) {
                com.lele.llmonitor.data.soc.CpuUsageResult v10_7 = this.formatPercent(v12_7.floatValue());
                if (v10_7 != null) {
                    v3_0 = v10_7;
                }
            }
            if (v12_7 == null) {
                v5 = 0;
            }
            com.lele.llmonitor.data.soc.CpuUsageResult v10_8 = new com.lele.llmonitor.data.soc.SourceProbe;
            v10_8("cpufreq(estimated)", v3_0, v5);
            v1_3.add(v10_8);
            if (v12_7 == null) {
                com.lele.llmonitor.data.soc.CpuUsageResult v10_1 = new com.lele.llmonitor.data.soc.SourceProbe;
                v10_1("trusted-sources-only", "no reliable system cpu source", 0);
                v1_3.add(v10_1);
                com.lele.llmonitor.data.soc.CpuUsageResult v10_2 = new com.lele.llmonitor.data.soc.CpuUsageResult;
                v10_2(0, p11, v1_3);
                return v10_2;
            } else {
                com.lele.llmonitor.data.soc.CpuUsageResult v10_3 = new com.lele.llmonitor.data.soc.CpuUsageResult;
                v10_3(v12_7, p11, v1_3);
                return v10_3;
            }
        } else {
            com.lele.llmonitor.data.soc.CpuUsageResult v10_4 = new com.lele.llmonitor.data.soc.CpuUsageResult;
            v10_4(v12_6, p11, v1_3);
            return v10_4;
        }
    }

    public Object probeLoadAverages(n60 p9)
    {
        String v2_0;
        java.util.ArrayList v9_1 = new java.util.ArrayList();
        com.lele.llmonitor.data.soc.LoadAvgResult v0_0 = this.readLoadAvgFromProc();
        int v1_1 = "read failed";
        if (v0_0 == null) {
            v2_0 = "read failed";
        } else {
            v2_0 = String.format(java.util.Locale.getDefault(), "%.2f/%.2f/%.2f", java.util.Arrays.copyOf(new Object[] {v0_0.d, v0_0.e, v0_0.f}), 3));
        }
        int v5_1;
        int v3_2 = 0;
        if (v0_0 == null) {
            v5_1 = 0;
        } else {
            v5_1 = 1;
        }
        v9_1.add(new com.lele.llmonitor.data.soc.SourceProbe("proc/loadavg", v2_0, v5_1));
        if (v0_0 == null) {
            Float v8_1 = this.readLoadAvg1FromUptime();
            if (v8_1 != null) {
                v1_1 = String.format(java.util.Locale.getDefault(), "%.2f", java.util.Arrays.copyOf(new Object[] {new Float(v8_1.floatValue())}), 1));
            }
            if (v8_1 != null) {
                v3_2 = 1;
            }
            v9_1.add(new com.lele.llmonitor.data.soc.SourceProbe("shell(uptime 1m)", v1_1, v3_2));
            return new com.lele.llmonitor.data.soc.LoadAvgResult(v8_1, 0, 0, v9_1);
        } else {
            Float v8_2 = new com.lele.llmonitor.data.soc.LoadAvgResult;
            v8_2(((Float) v0_0.d), ((Float) v0_0.e), ((Float) v0_0.f), v9_1);
            return v8_2;
        }
    }

    public com.lele.llmonitor.data.soc.MemoryInfoResult probeMemoryInfo()
    {
        java.util.ArrayList v2_1 = new java.util.ArrayList();
        try {
            com.lele.llmonitor.data.soc.MemoryInfoResult v0_0 = wt0.U(new java.io.File("/proc/meminfo"));
        } catch (com.lele.llmonitor.data.soc.MemoryInfoResult v0_14) {
            v0_0 = new cw2(v0_14);
        }
        Long v4 = 0;
        if ((v0_0 instanceof cw2)) {
            v0_0 = 0;
        }
        com.lele.llmonitor.data.soc.MemoryInfoResult v0_7 = ((java.util.List) v0_0);
        long v3_0 = 0;
        if (v0_7 != null) {
            long v5_4 = new java.util.LinkedHashMap();
            com.lele.llmonitor.data.soc.MemoryInfoResult v0_8 = v0_7.iterator();
            while (v0_8.hasNext()) {
                String v6_2 = ((String) v0_8.next());
                long v7_5 = hh3.O0(hh3.L0(v6_2, 58)).toString();
                java.util.regex.Matcher v8_1 = java.util.regex.Pattern.compile("\\d+");
                v8_1.getClass();
                java.util.regex.Matcher v8_2 = v8_1.matcher(v6_2);
                v8_2.getClass();
                String v6_3 = df2.h(v8_2, 0, v6_2);
                if (v6_3 != null) {
                    String v6_5 = v6_3.a.group();
                    v6_5.getClass();
                    String v6_6 = oh3.l0(v6_5);
                    if (v6_6 != null) {
                        v5_4.put(v7_5, v6_6);
                    }
                }
            }
            long v5_9;
            com.lele.llmonitor.data.soc.MemoryInfoResult v0_11 = ((Long) v5_4.get("MemTotal"));
            String v6_10 = ((Long) v5_4.get("MemAvailable"));
            if (v6_10 == null) {
                long v9_1;
                String v6_13 = ((Long) v5_4.get("MemFree"));
                if (v6_13 == null) {
                    v9_1 = 0;
                } else {
                    v9_1 = v6_13.longValue();
                }
                long v11_1;
                String v6_16 = ((Long) v5_4.get("Buffers"));
                if (v6_16 == null) {
                    v11_1 = 0;
                } else {
                    v11_1 = v6_16.longValue();
                }
                long v13;
                String v6_19 = ((Long) v5_4.get("Cached"));
                if (v6_19 == null) {
                    v13 = 0;
                } else {
                    v13 = v6_19.longValue();
                }
                long v15;
                String v6_22 = ((Long) v5_4.get("SReclaimable"));
                if (v6_22 == null) {
                    v15 = 0;
                } else {
                    v15 = v6_22.longValue();
                }
                long v5_7;
                long v5_6 = ((Long) v5_4.get("Shmem"));
                if (v5_6 == 0) {
                    v5_7 = 0;
                } else {
                    v5_7 = v5_6.longValue();
                }
                long v9_5 = ((((v9_1 + v11_1) + v13) + v15) - v5_7);
                if (v9_5 >= 0) {
                    v5_9 = v9_5;
                } else {
                    v5_9 = 0;
                }
            } else {
                v5_9 = v6_10.longValue();
            }
            long v7_0 = v5_9;
            String v6_24;
            if (v0_11 != null) {
                v6_24 = v0_11;
            } else {
                v6_24 = "?";
            }
            long v9_7 = new StringBuilder("MemTotal=");
            v9_7.append(v6_24);
            v9_7.append("kB, MemAvailable=");
            v9_7.append(v7_0);
            v9_7.append("kB");
            String v6_0 = v9_7.toString();
            if (v0_11 != null) {
                v3_0 = 1;
            }
            v2_1.add(new com.lele.llmonitor.data.soc.SourceProbe("/proc/meminfo", v6_0, v3_0));
            if (v0_11 != null) {
                v4 = Long.valueOf((v0_11.longValue() * 1024));
            }
            if (v0_11 != null) {
                v7_0 = ib1.m(v7_0, 0, v0_11.longValue());
            }
            return new com.lele.llmonitor.data.soc.MemoryInfoResult(v4, Long.valueOf((v7_0 * 1024)), v2_1);
        } else {
            v2_1.add(new com.lele.llmonitor.data.soc.SourceProbe("/proc/meminfo", "read failed", 0));
            return new com.lele.llmonitor.data.soc.MemoryInfoResult(0, 0, v2_1);
        }
    }

    public Object probeSocTemperatureC(n60 p13)
    {
        java.util.ArrayList v4_1 = new java.util.ArrayList();
        String v13_5 = this.readThermalZones();
        uo0 v5_1 = this.filterSocThermalCandidates(v13_5);
        com.lele.llmonitor.data.soc.TemperatureResult v0_9 = this.readBatteryTempForHint();
        String v3_1 = 1;
        v4_1.add(new com.lele.llmonitor.data.soc.SourceProbe("sysfs(thermal zones)", ve2.n("soc-candidates=", v5_1.size(), "/", v13_5.size()), (v5_1.isEmpty() ^ 1)));
        if (!v5_1.isEmpty()) {
            String v13_6 = new java.util.ArrayList(zw.j0(v5_1, 10));
            int v1_8 = v5_1.iterator();
            while (v1_8.hasNext()) {
                int v2_7 = ((com.lele.llmonitor.data.soc.ThermalZoneReading) v1_8.next());
                v13_6.add(new qh2(v2_7, new Integer(this.scoreThermalZone(v2_7, v0_9))));
            }
            int v1_10;
            String v13_7 = v13_6.iterator();
            int v2_3 = 0;
            if (v13_7.hasNext()) {
                v1_10 = v13_7.next();
                if (v13_7.hasNext()) {
                    int v7_9 = ((Number) ((qh2) v1_10).e).intValue();
                    do {
                        StringBuilder v8_7 = v13_7.next();
                        String v9_7 = ((Number) ((qh2) v8_7).e).intValue();
                        if (v7_9 < v9_7) {
                            v1_10 = v8_7;
                            v7_9 = v9_7;
                        }
                    } while(v13_7.hasNext());
                }
            } else {
                v1_10 = 0;
            }
            String v13_12;
            int v1_11 = ((qh2) v1_10);
            if (v1_11 == 0) {
                v13_12 = 0;
            } else {
                String v13_11;
                if (!this.isReliableSocTemperatureCandidate(((com.lele.llmonitor.data.soc.ThermalZoneReading) v1_11.d), ((Number) v1_11.e).intValue(), v0_9, v5_1)) {
                    v13_11 = 0;
                } else {
                    v13_11 = v1_11;
                }
                if (v13_11 == null) {
                } else {
                    v13_12 = ((com.lele.llmonitor.data.soc.ThermalZoneReading) v13_11.d);
                }
            }
            String v12_4;
            if (v13_12 == null) {
                if (v1_11 == 0) {
                    v12_4 = "none";
                } else {
                    StringBuilder v8_9 = v1_11.d;
                    String v9_10 = ((com.lele.llmonitor.data.soc.ThermalZoneReading) v8_9).getZone();
                    String v10_3 = ((com.lele.llmonitor.data.soc.ThermalZoneReading) v8_9).getType();
                    String v12_1 = this.formatTemp(((com.lele.llmonitor.data.soc.ThermalZoneReading) v8_9).getTempC(), ((com.lele.llmonitor.data.soc.ThermalZoneReading) v8_9).getTempFractionDigits());
                    int v1_0 = v1_11.e;
                    StringBuilder v8_3 = new StringBuilder("no reliable candidate (");
                    v8_3.append(v9_10);
                    v8_3.append(" ");
                    v8_3.append(v10_3);
                    v8_3.append(" ");
                    v8_3.append(v12_1);
                    v8_3.append(" score=");
                    v8_3.append(v1_0);
                    v8_3.append(")");
                    v12_4 = v8_3.toString();
                }
            } else {
                int v1_1 = v13_12.getZone();
                StringBuilder v8_4 = v13_12.getType();
                String v12_5 = this.formatTemp(v13_12.getTempC(), v13_12.getTempFractionDigits());
                String v9_2 = new StringBuilder();
                v9_2.append(v1_1);
                v9_2.append(" ");
                v9_2.append(v8_4);
                v9_2.append(" ");
                v9_2.append(v12_5);
                v12_4 = v9_2.toString();
            }
            if (v13_12 == null) {
                v3_1 = 0;
            }
            int v1_3;
            v4_1.add(new com.lele.llmonitor.data.soc.SourceProbe("selector(score)", v12_4, v3_1));
            if (v13_12 == null) {
                v1_3 = 0;
            } else {
                v1_3 = new Float(v13_12.getTempC());
            }
            com.lele.llmonitor.data.soc.TemperatureResult v0_3;
            if (v13_12 == null) {
                v0_3 = 0;
            } else {
                v0_3 = new Integer(v13_12.getTempFractionDigits());
            }
            if (v13_12 != null) {
                String v12_8 = v13_12.getZone();
                String v13_2 = v13_12.getType();
                int v2_2 = new StringBuilder();
                v2_2.append(v12_8);
                v2_2.append("/");
                v2_2.append(v13_2);
                v2_3 = v2_2.toString();
            }
            return new com.lele.llmonitor.data.soc.TemperatureResult(v1_3, v0_3, v2_3, v4_1, v5_1);
        } else {
            return new com.lele.llmonitor.data.soc.TemperatureResult(0, 0, 0, v4_1, uo0.d);
        }
    }

    public java.util.List readCpuCoreFrequencies()
    {
        if (!this.getCpuDirs().isEmpty()) {
            java.util.Map v1 = this.readPolicyFrequencyMap();
            int v0_24 = this.getCpuDirs();
            java.util.ArrayList v2_0 = new java.util.ArrayList();
            java.util.Iterator v3 = v0_24.iterator();
            while (v3.hasNext()) {
                int v4_3 = ((java.io.File) v3.next());
                int v0_8 = v4_3.getName();
                v0_8.getClass();
                com.lele.llmonitor.data.soc.CpuCoreFrequencySample v5_2 = oh3.k0(hh3.D0(v0_8, "cpu"));
                com.lele.llmonitor.data.soc.CpuCoreFrequencySample v6_2 = 0;
                if (v5_2 != null) {
                    int v8 = v5_2.intValue();
                    try {
                        int v0_18;
                        com.lele.llmonitor.data.soc.CpuCoreFrequencySample v7_4 = 1;
                    } catch (int v0_17) {
                        v0_18 = new cw2(v0_17);
                        if ((v0_18 instanceof cw2)) {
                            v0_18 = Boolean.TRUE;
                        }
                        boolean v9_1 = ((Boolean) v0_18).booleanValue();
                        int v0_21 = new java.io.File(v4_3, "cpufreq");
                        int v4_0 = this.readLong(v0_21, "scaling_cur_freq");
                        if (v4_0 == 0) {
                            v4_0 = this.readLong(v0_21, "cpuinfo_cur_freq");
                        }
                        com.lele.llmonitor.data.soc.CpuCoreFrequencySample v7_0 = this.readLong(v0_21, "cpuinfo_max_freq");
                        if (v7_0 == null) {
                            v7_0 = this.readLong(v0_21, "scaling_max_freq");
                        }
                        int v0_25 = ((Iterable) v1.entrySet()).iterator();
                        while (v0_25.hasNext()) {
                            int v10_2 = v0_25.next();
                            if (((com.lele.llmonitor.data.soc.PolicyFrequency) ((java.util.Map$Entry) v10_2).getValue()).getRelatedCores().contains(v5_2)) {
                            }
                            int v0_1;
                            int v10_3 = ((java.util.Map$Entry) v10_2);
                            if (v10_3 == 0) {
                                v0_1 = 0;
                            } else {
                                v0_1 = ((com.lele.llmonitor.data.soc.PolicyFrequency) v10_3.getValue());
                            }
                            if (v4_0 == 0) {
                                if (v0_1 == 0) {
                                    v4_0 = 0;
                                } else {
                                    v4_0 = v0_1.getCurrentKhz();
                                }
                            }
                            if (v7_0 == null) {
                                if (v0_1 == 0) {
                                    v7_0 = 0;
                                } else {
                                    v7_0 = v0_1.getMaxKhz();
                                }
                            }
                            int v10_0;
                            if (v0_1 == 0) {
                                v10_0 = 0;
                            } else {
                                v10_0 = v0_1.getName();
                            }
                            int v0_4;
                            if (v4_0 == 0) {
                                v0_4 = 0;
                            } else {
                                v0_4 = Integer.valueOf(((int) (v4_0.longValue() / 1000)));
                            }
                            if (v7_0 != null) {
                                v6_2 = Integer.valueOf(((int) (v7_0.longValue() / 1000)));
                            }
                            v6_2 = new com.lele.llmonitor.data.soc.CpuCoreFrequencySample(v8, v9_1, v10_0, v0_4, v6_2);
                        }
                        v10_2 = 0;
                    }
                    if (Integer.parseInt(hh3.O0(wt0.V(new java.io.File(v4_3, "online"))).toString()) != 1) {
                        v7_4 = 0;
                    } else {
                    }
                    v0_18 = Boolean.valueOf(v7_4);
                }
                if (v6_2 != null) {
                    v2_0.add(v6_2);
                }
            }
            return v2_0;
        } else {
            return uo0.d;
        }
    }

    public qh2 readOnlineAndTotalCores()
    {
        qh2 v1_0 = 1;
        if (!this.getCpuDirs().isEmpty()) {
            Integer v0_5 = this.getCpuDirs().size();
            Integer v6_1 = this.getCpuDirs();
            int v2 = 0;
            if ((v6_1 == null) || (!v6_1.isEmpty())) {
                Integer v6_2 = v6_1.iterator();
                while (v6_2.hasNext()) {
                    try {
                        int v3_6 = hh3.O0(wt0.V(new java.io.File(((java.io.File) v6_2.next()), "online"))).toString();
                    } catch (int v3_7) {
                        v3_6 = new cw2(v3_7);
                    }
                    if ((v3_6 instanceof cw2)) {
                        v3_6 = 0;
                    }
                    int v3_8 = ((String) v3_6);
                    if (v3_8 != 0) {
                        int v3_9 = oh3.k0(v3_8);
                        if ((v3_9 == 0) || (v3_9.intValue() == 1)) {
                        }
                    }
                    v2++;
                    if (v2 < 0) {
                        r7.d0();
                        throw 0;
                    }
                }
            }
            if (v2 >= 1) {
                v1_0 = v2;
            }
            return new qh2(Integer.valueOf(v1_0), Integer.valueOf(v0_5));
        } else {
            Integer v6_5 = Runtime.getRuntime().availableProcessors();
            if (v6_5 >= 1) {
                v1_0 = v6_5;
            }
            return new qh2(Integer.valueOf(v1_0), Integer.valueOf(v1_0));
        }
    }
}
