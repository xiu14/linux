package com.lele.llmonitor.data;
public final class BatteryEngine {
    public static final int $stable;
    public static final com.lele.llmonitor.data.BatteryEngine INSTANCE;

    static BatteryEngine()
    {
        com.lele.llmonitor.data.BatteryEngine.INSTANCE = new com.lele.llmonitor.data.BatteryEngine();
        return;
    }

    private BatteryEngine()
    {
        return;
    }

    private final java.util.List collectBatteryVoltageCandidates()
    {
        boolean v2_1;
        java.util.List v8_0 = new java.util.LinkedHashSet;
        v8_0();
        java.util.Iterator v0_9 = new java.io.File("/sys/class/power_supply").listFiles();
        String v1_5 = 0;
        if (v0_9 == null) {
            v2_1 = 0;
        } else {
            v2_1 = new java.util.ArrayList();
            String v3_0 = v0_9.length;
            java.io.File v4_0 = 0;
            while (v4_0 < v3_0) {
                java.util.Iterator v5_5 = v0_9[v4_0];
                if (v5_5.isDirectory()) {
                    v2_1.add(v5_5);
                }
                v4_0++;
            }
        }
        if (!v2_1) {
            v2_1 = uo0.d;
        }
        java.util.Iterator v0_3 = r7.M(new String[] {"voltage_now", "bat_vol_get", "ptim_battery_voltage_get", "batt_vol", "voltage_ocv"}));
        String v3_3 = new java.util.ArrayList();
        boolean v2_2 = v2_1.iterator();
        while (v2_2.hasNext()) {
            java.io.File v4_5 = v2_2.next();
            if (com.lele.llmonitor.data.BatteryEngine.collectBatteryVoltageCandidates$isBatteryLikeDir(((java.io.File) v4_5))) {
                v3_3.add(v4_5);
            }
        }
        boolean v2_3 = v3_3.size();
        while (v1_5 < v2_3) {
            java.io.File v4_3 = v3_3.get(v1_5);
            v1_5++;
            java.io.File v4_4 = ((java.io.File) v4_3);
            java.util.Iterator v5_1 = v0_3.iterator();
            while (v5_1.hasNext()) {
                java.io.File v7_1 = new java.io.File(v4_4, ((String) v5_1.next()));
                if (v7_1.exists()) {
                    v8_0.add(v7_1.getAbsolutePath());
                }
            }
        }
        java.util.Iterator v0_8 = r7.M(new String[] {"/sys/class/power_supply/battery/voltage_now", "/sys/class/power_supply/battery/batt_vol", "/sys/class/power_supply/Battery/voltage_now", "/sys/class/power_supply/battery/voltage_ocv"})).iterator();
        while (v0_8.hasNext()) {
            String v1_4 = ((String) v0_8.next());
            if (new java.io.File(v1_4).exists()) {
                v8_0.add(v1_4);
            }
        }
        return yw.W0(v8_0);
    }

    private static final boolean collectBatteryVoltageCandidates$isBatteryLikeDir(java.io.File p5)
    {
        com.lele.llmonitor.data.BatteryEngine v0_0 = p5.getName();
        v0_0.getClass();
        java.util.Locale v1 = java.util.Locale.ROOT;
        v1.getClass();
        com.lele.llmonitor.data.BatteryEngine v0_3 = v0_0.toLowerCase(v1);
        v0_3.getClass();
        if (!com.lele.llmonitor.data.BatteryEngine.collectBatteryVoltageCandidates$isChargerLike(v0_3)) {
            if ((!hh3.m0(v0_3, "battery", 0)) && ((!hh3.m0(v0_3, "gauge", 0)) && ((!hh3.m0(v0_3, "fuel", 0)) && (!oh3.j0(v0_3, "mt", 0))))) {
                boolean v5_4;
                boolean v5_1 = com.lele.llmonitor.data.BatteryEngine.INSTANCE.readSysText(new java.io.File(p5, "type"));
                if (!v5_1) {
                    v5_4 = 0;
                } else {
                    boolean v5_3 = hh3.O0(v5_1).toString();
                    if (!v5_3) {
                    } else {
                        v5_4 = v5_3.toLowerCase(v1);
                        v5_4.getClass();
                    }
                }
                return ni1.o(v5_4, "battery");
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    private static final boolean collectBatteryVoltageCandidates$isChargerLike(String p2)
    {
        String v0_0 = java.util.Locale.ROOT;
        v0_0.getClass();
        boolean v2_1 = p2.toLowerCase(v0_0);
        v2_1.getClass();
        if ((!hh3.m0(v2_1, "usb", 0)) && ((!hh3.m0(v2_1, "wireless", 0)) && ((!hh3.m0(v2_1, "charger", 0)) && ((!hh3.m0(v2_1, "chrg", 0)) && ((!hh3.m0(v2_1, "primary", 0)) && ((!v2_1.equals("main")) && (!v2_1.equals("ac")))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    private final float normalizeCurrentToMa(long p5)
    {
        if (Math.abs(p5) <= 20000) {
            return ((float) p5);
        } else {
            return (((float) p5) / 1148846080);
        }
    }

    private final Long readSysFile(String p1)
    {
        try {
            Long v0_0 = new java.io.File;
            v0_0(p1);
        } catch (Exception) {
            return 0;
        }
        if (!v0_0.exists()) {
            return 0;
        } else {
            return Long.valueOf(Long.parseLong(hh3.O0(wt0.V(v0_0)).toString()));
        }
    }

    private final String readSysText(java.io.File p1)
    {
        try {
            if (!p1.exists()) {
                return 0;
            } else {
                return wt0.V(p1);
            }
        } catch (Exception) {
            return 0;
        }
    }

    private final float roundToFractionDigits(float p5, int p6)
    {
        float v4_2 = ((float) Math.pow(4621819117588971520, ((double) ib1.l(p6, 0, 4))));
        return (((float) Math.rint(((double) (p5 * v4_2)))) / v4_2);
    }

    public final float applyCurrentAdjustments(float p1, boolean p2, boolean p3)
    {
        if (p2) {
            p1 *= -1082130432;
        }
        if (p3) {
            p1 *= 1073741824;
        }
        return p1;
    }

    public final String formatTemperatureC(float p4, int p5)
    {
        return String.format(java.util.Locale.getDefault(), s42.g(ib1.l(p5, 0, 1), "%.", "f"), java.util.Arrays.copyOf(new Object[] {Float.valueOf(p4)}), 1));
    }

    public final float getAdjustedCurrentMa(android.content.Context p1, boolean p2, boolean p3)
    {
        p1.getClass();
        return this.applyCurrentAdjustments(this.getCurrentMa(p1), p2, p3);
    }

    public final int getBatteryCurrentCapacity(android.content.Context p1)
    {
        p1.getClass();
        return ((Number) this.getBatteryCurrentCapacityWithSources(p1).getValue()).intValue();
    }

    public final com.lele.llmonitor.data.BatteryProbeResult getBatteryCurrentCapacityWithSources(android.content.Context p11)
    {
        p11.getClass();
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        com.lele.llmonitor.data.BatteryProbeResult v11_10 = p11.getSystemService("batterymanager");
        v11_10.getClass();
        com.lele.llmonitor.data.BatteryProbeResult v11_1 = ((android.os.BatteryManager) v11_10).getIntProperty(1);
        if (v11_1 <= null) {
            int v5_1 = new StringBuilder();
            v5_1.append(v11_1);
            v5_1.append("(uAh)");
            v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe("BatteryManager.CHARGE_COUNTER", v5_1.toString(), 0));
            com.lele.llmonitor.data.BatteryProbeResult v11_7 = r7.M(new String[] {"/sys/class/power_supply/battery/charge_now", "/sys/class/power_supply/battery/charge_counter"})).iterator();
            while (v11_7.hasNext()) {
                String v3_4 = ((String) v11_7.next());
                StringBuilder v4_2 = this.readSysFile(v3_4);
                if ((v4_2 == null) || (v4_2.longValue() <= 0)) {
                    v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe(v3_4, "unavailable", 0));
                } else {
                    Integer v10_5 = ((int) (v4_2.longValue() / 1000));
                    StringBuilder v4_7 = new StringBuilder();
                    v4_7.append(v10_5);
                    v4_7.append("mAh");
                    v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe(v3_4, v4_7.toString(), 1));
                    return new com.lele.llmonitor.data.BatteryProbeResult(Integer.valueOf(v10_5), v0_1);
                }
            }
            Integer v10_1 = new com.lele.llmonitor.data.BatterySourceProbe;
            v10_1("fallback", "0mAh", 1);
            v0_1.add(v10_1);
            Integer v10_2 = new com.lele.llmonitor.data.BatteryProbeResult;
            v10_2(Integer.valueOf(0), v0_1);
            return v10_2;
        } else {
            com.lele.llmonitor.data.BatteryProbeResult v11_16 = (v11_1 / 1000);
            Integer v10_7 = new com.lele.llmonitor.data.BatterySourceProbe;
            StringBuilder v4_9 = new StringBuilder();
            v4_9.append(v11_16);
            v4_9.append("mAh");
            v10_7("BatteryManager.CHARGE_COUNTER", v4_9.toString(), 1);
            v0_1.add(v10_7);
            Integer v10_8 = new com.lele.llmonitor.data.BatteryProbeResult;
            v10_8(Integer.valueOf(v11_16), v0_1);
            return v10_8;
        }
    }

    public final int getBatteryDesignCapacity(android.content.Context p1)
    {
        p1.getClass();
        return ((Number) this.getBatteryDesignCapacityWithSources(p1).getValue()).intValue();
    }

    public final com.lele.llmonitor.data.BatteryProbeResult getBatteryDesignCapacityWithSources(android.content.Context p11)
    {
        p11.getClass();
        java.util.ArrayList v3_1 = new java.util.ArrayList();
        try {
            com.lele.llmonitor.data.BatteryProbeResult v11_3 = Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", 0).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(new Class[] {android.content.Context})).newInstance(new Object[] {p11})), 0);
            v11_3.getClass();
            com.lele.llmonitor.data.BatteryProbeResult v11_5 = ((int) ((Double) v11_3).doubleValue());
            long v5_4 = new StringBuilder();
            v5_4.append(v11_5);
            v5_4.append("mAh");
            v3_1.add(new com.lele.llmonitor.data.BatterySourceProbe("PowerProfile.getBatteryCapacity()", v5_4.toString(), 1));
            return new com.lele.llmonitor.data.BatteryProbeResult(Integer.valueOf(v11_5), v3_1);
        } catch (Exception) {
            v3_1.add(new com.lele.llmonitor.data.BatterySourceProbe("PowerProfile.getBatteryCapacity()", "unavailable", 0));
            Integer v10_1 = this.readSysFile("/sys/class/power_supply/battery/charge_full_design");
            if (v10_1 != null) {
                if (v10_1.longValue() > 0) {
                    Integer v10_5 = ((int) (v10_1.longValue() / 1000));
                    StringBuilder v2_9 = new StringBuilder();
                    v2_9.append(v10_5);
                    v2_9.append("mAh");
                    v3_1.add(new com.lele.llmonitor.data.BatterySourceProbe("/sys/.../charge_full_design", v2_9.toString(), 1));
                    return new com.lele.llmonitor.data.BatteryProbeResult(Integer.valueOf(v10_5), v3_1);
                }
            }
            Integer v10_2 = new com.lele.llmonitor.data.BatterySourceProbe;
            v10_2("/sys/.../charge_full_design", "unavailable", 0);
            v3_1.add(v10_2);
            Integer v10_3 = new com.lele.llmonitor.data.BatterySourceProbe;
            v10_3("fallback(default)", "5000mAh", 1);
            v3_1.add(v10_3);
            Integer v10_4 = new com.lele.llmonitor.data.BatteryProbeResult;
            v10_4(Integer.valueOf(5000), v3_1);
            return v10_4;
        }
    }

    public final float getCurrentMa(android.content.Context p1)
    {
        p1.getClass();
        return ((Number) this.getCurrentMaWithSources(p1).getValue()).floatValue();
    }

    public final com.lele.llmonitor.data.BatteryProbeResult getCurrentMaWithSources(android.content.Context p15)
    {
        p15.getClass();
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        com.lele.llmonitor.data.BatteryProbeResult v1_17 = p15.getSystemService("batterymanager");
        v1_17.getClass();
        com.lele.llmonitor.data.BatteryProbeResult v1_23 = ((android.os.BatteryManager) v1_17);
        com.lele.llmonitor.data.BatterySourceProbe v2_0 = v1_23.getLongProperty(2);
        String v7 = "BatteryManager.CURRENT_NOW";
        if (v2_0 == 0) {
            v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe("BatteryManager.CURRENT_NOW", "0", 0));
            com.lele.llmonitor.data.BatteryProbeResult v1_13 = v1_23.getLongProperty(3);
            v7 = "BatteryManager.CURRENT_AVERAGE";
            if (v1_13 == 0) {
                v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe("BatteryManager.CURRENT_AVERAGE", "0", 0));
                v7 = "fallback";
            } else {
                String v6_5 = new StringBuilder();
                v6_5.append(v1_13);
                v6_5.append("mA");
                v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe("BatteryManager.CURRENT_AVERAGE", v6_5.toString(), 1));
            }
            v2_0 = v1_13;
        } else {
            String v6_8 = new StringBuilder();
            v6_8.append(v2_0);
            v6_8.append("mA");
            v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe("BatteryManager.CURRENT_NOW", v6_8.toString(), 1));
        }
        if (v2_0 == 0) {
            com.lele.llmonitor.data.BatteryProbeResult v1_22 = r7.M(new String[] {"/sys/class/power_supply/battery/current_now", "/sys/class/power_supply/main/current_now", "/sys/class/power_supply/battery/batt_current"})).iterator();
            while (v1_22.hasNext()) {
                String v6_13 = ((String) v1_22.next());
                com.lele.llmonitor.data.BatterySourceProbe v11_1 = this.readSysFile(v6_13);
                if ((v11_1 == null) || (v11_1.longValue() == 0)) {
                    v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe(v6_13, "unavailable", 0));
                } else {
                    v2_0 = v11_1.longValue();
                    StringBuilder v4_6 = new StringBuilder();
                    v4_6.append(v11_1);
                    v4_6.append("mA");
                    v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe(v6_13, v4_6.toString(), 1));
                    v7 = v6_13;
                    break;
                }
            }
        }
        if ((v2_0 != -2147483648) && ((v2_0 != 2147483647) && ((v2_0 != -9223372036854775808) && (v2_0 != 9223372036854775807)))) {
            com.lele.llmonitor.data.BatteryProbeResult v1_3;
            Float v14_1 = this.normalizeCurrentToMa(v2_0);
            if (Math.abs(v2_0) <= 20000) {
                v1_3 = "auto(mA)";
            } else {
                v1_3 = "auto(uA->mA)";
            }
            String v3_4 = String.format("%.1f", java.util.Arrays.copyOf(new Object[] {Float.valueOf(v14_1)}), 1));
            StringBuilder v4_4 = new StringBuilder();
            v4_4.append(v7);
            v4_4.append("/");
            v4_4.append(v1_3);
            v4_4.append(" => ");
            v4_4.append(v3_4);
            v4_4.append("mA");
            v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe("unit-normalize", v4_4.toString(), 1));
            return new com.lele.llmonitor.data.BatteryProbeResult(Float.valueOf(v14_1), v0_1);
        } else {
            Float v14_3 = new com.lele.llmonitor.data.BatterySourceProbe;
            com.lele.llmonitor.data.BatteryProbeResult v1_9 = new StringBuilder();
            v1_9.append(v2_0);
            v1_9.append(" => 0mA");
            v14_3("invalid-marker-filter", v1_9.toString(), 1);
            v0_1.add(v14_3);
            Float v14_4 = new com.lele.llmonitor.data.BatteryProbeResult;
            v14_4(Float.valueOf(0), v0_1);
            return v14_4;
        }
    }

    public final float getVirtualVoltage(int p4, int p5, boolean p6)
    {
        if (p5 > 0) {
            float v0_2;
            int v2_0;
            float v5_2 = 0;
            float v3_7 = ib1.k((((float) p4) / ((float) p5)), 0, 1065353216);
            int v4_3 = 1045220557;
            if (v3_7 < 1045220557) {
                v0_2 = ((1057803468 * v3_7) / 1045220557);
                v2_0 = 1078774989;
            } else {
                v0_2 = (((v3_7 - 1045220557) * 1060320048) / 1061997773);
                v2_0 = 1081081856;
            }
            if (p6) {
                float v3_3;
                if (v3_7 > 1061997773) {
                    v3_3 = (((v3_7 - 1061997773) * 1045220557) / 1045220557);
                } else {
                    v3_3 = ((v3_7 * 1050253722) / 1061997773);
                    v4_3 = 1056964608;
                }
                v5_2 = (v4_3 - v3_3);
            }
            return ((v0_2 + v2_0) + v5_2);
        } else {
            return 1081291571;
        }
    }

    public final float getVoltageV(android.content.Context p1)
    {
        p1.getClass();
        return ((Number) this.getVoltageVWithSources(p1).getValue()).floatValue();
    }

    public final com.lele.llmonitor.data.BatteryProbeResult getVoltageVWithSources(android.content.Context p13)
    {
        com.lele.llmonitor.data.BatteryProbeResult v13_4;
        p13.getClass();
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        com.lele.llmonitor.data.BatteryProbeResult v13_16 = p13.registerReceiver(0, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (v13_16 == null) {
            v13_4 = 0;
        } else {
            v13_4 = v13_16.getIntExtra("voltage", 0);
        }
        if (v13_4 <= null) {
            long v8_1 = new StringBuilder();
            v8_1.append(v13_4);
            v8_1.append("mV");
            v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe("Intent.EXTRA_VOLTAGE", v8_1.toString(), 0));
            com.lele.llmonitor.data.BatteryProbeResult v13_12 = this.collectBatteryVoltageCandidates().iterator();
            while (v13_12.hasNext()) {
                String v4_3 = ((String) v13_12.next());
                com.lele.llmonitor.data.BatterySourceProbe v7_2 = this.readSysFile(v4_3);
                if ((v7_2 == null) || (v7_2.longValue() <= 0)) {
                    v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe(v4_3, "unavailable", 0));
                } else {
                    float v12_12;
                    if (v7_2.longValue() <= 100000) {
                        if (v7_2.longValue() <= 1000) {
                            v12_12 = ((float) v7_2.longValue());
                        } else {
                            v12_12 = (((float) v7_2.longValue()) / 1148846080);
                        }
                    } else {
                        v12_12 = (((float) v7_2.longValue()) / 1232348160);
                    }
                    String v1_10 = String.format("%.3f", java.util.Arrays.copyOf(new Object[] {Float.valueOf(v12_12)}), 1));
                    StringBuilder v3_3 = new StringBuilder();
                    v3_3.append(v7_2);
                    v3_3.append(" => ");
                    v3_3.append(v1_10);
                    v3_3.append("V");
                    v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe(v4_3, v3_3.toString(), 1));
                    return new com.lele.llmonitor.data.BatteryProbeResult(Float.valueOf(v12_12), v0_1);
                }
            }
            float v12_5 = new com.lele.llmonitor.data.BatterySourceProbe;
            v12_5("fallback", "0V", 1);
            v0_1.add(v12_5);
            float v12_6 = new com.lele.llmonitor.data.BatteryProbeResult;
            v12_6(Float.valueOf(0), v0_1);
            return v12_6;
        } else {
            float v12_3 = (((float) v13_4) / 1148846080);
            StringBuilder v3_0 = String.format("%.3f", java.util.Arrays.copyOf(new Object[] {Float.valueOf(v12_3)}), 1));
            String v5_4 = new StringBuilder();
            v5_4.append(v13_4);
            v5_4.append("mV => ");
            v5_4.append(v3_0);
            v5_4.append("V");
            v0_1.add(new com.lele.llmonitor.data.BatterySourceProbe("Intent.EXTRA_VOLTAGE", v5_4.toString(), 1));
            return new com.lele.llmonitor.data.BatteryProbeResult(Float.valueOf(v12_3), v0_1);
        }
    }

    public final com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading parseBatteryTemperature(int p5)
    {
        int v0_1;
        if (Math.abs(p5) <= 2000) {
            v0_1 = 10;
        } else {
            v0_1 = 1000;
        }
        int v2_4;
        if (v0_1 != 1000) {
            if ((p5 % 10) != 0) {
                v2_4 = 1;
            } else {
                v2_4 = 0;
            }
        } else {
            if ((p5 % 10) == 0) {
                if ((p5 % 100) == 0) {
                    if ((p5 % 1000) == 0) {
                    }
                } else {
                    v2_4 = 2;
                }
            } else {
                v2_4 = 3;
            }
        }
        int v1_1 = ib1.l(v2_4, 0, 1);
        return new com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading(this.roundToFractionDigits((((float) p5) / ((float) v0_1)), v1_1), v1_1, p5, v0_1);
    }

    public final float sanitizeCurrentReading(float p4, int p5, int p6, int p7)
    {
        int v7_1;
        int v3_0 = 0;
        if (p7 == 0) {
            v7_1 = 0;
        } else {
            v7_1 = 1;
        }
        int v5_1;
        if (p5 <= 98) {
            v5_1 = 0;
        } else {
            v5_1 = 1;
        }
        int v0_0 = l02.F(p4);
        if ((Math.abs((p4 - ((float) v0_0))) < 981668463) && ((Math.abs(v0_0) >= 1000) && ((Math.abs(v0_0) % 1000) == 0))) {
            v3_0 = 1;
        }
        if ((v7_1 == 0) || ((v5_1 == 0) || (v3_0 == 0))) {
            return p4;
        } else {
            return 0;
        }
    }
}
