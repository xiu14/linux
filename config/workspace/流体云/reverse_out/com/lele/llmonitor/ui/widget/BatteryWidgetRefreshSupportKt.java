package com.lele.llmonitor.ui.widget;
public final class BatteryWidgetRefreshSupportKt {

    public static final Object forceRefreshBatteryWidgetsOnce(android.content.Context p36, n60 p37)
    {
        float v1_1;
        if (!(p37 instanceof com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$1)) {
            v1_1 = new com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$1(p37);
        } else {
            v1_1 = ((com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$1) p37);
            com.lele.llmonitor.ui.widget.BatteryWidget v2_11 = ((com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$1) p37).label;
            if ((v2_11 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$1) p37).label = (v2_11 - -2147483648);
            }
        }
        int v10_2;
        float v25_0;
        float v12_5;
        float v12_7;
        int v22_2;
        com.lele.llmonitor.ui.widget.BatteryWidget v2_9;
        int v8_1;
        int v6_1;
        float v17_3;
        int v26_0;
        float v11_0;
        bw3 v23_1;
        boolean v14_3;
        int v19_2;
        int v0_52;
        float v11_2;
        int v9_1;
        java.util.Iterator v7_1;
        com.lele.llmonitor.ui.widget.BatteryWidget v3_2;
        int v0_31;
        float v13_0;
        int v20_2;
        String v30;
        int v4_2;
        float v24_0;
        float v28_0;
        float v13_2;
        int v27;
        com.lele.llmonitor.ui.widget.BatteryWidget v2_2;
        boolean v15_1;
        int v0_61;
        com.lele.llmonitor.ui.widget.BatteryWidget v2_4;
        int v21_2;
        float v1_8;
        int v29_0;
        float v25_2;
        int v10_0;
        float v18_4;
        int v0_7;
        int v0_2 = v1_1.result;
        com.lele.llmonitor.ui.widget.BatteryWidget v2_1 = v1_1.label;
        int v5_0 = 1;
        int v8_0 = e80.d;
        if (v2_1 == null) {
            ib1.Q(v0_2);
            int v0_30 = p36.getApplicationContext();
            v0_30.getClass();
            com.lele.llmonitor.ui.widget.BatteryWidget v2_7 = new x21(v0_30);
            v1_1.L$0 = 0;
            v1_1.L$1 = v0_30;
            v1_1.L$2 = 0;
            v1_1.label = 1;
            com.lele.llmonitor.ui.widget.BatteryWidget v2_8 = v2_7.a(com.lele.llmonitor.ui.widget.BatteryWidget, v1_1);
            if (v2_8 != v8_0) {
                v2_9 = v0_30;
                v0_61 = v2_8;
                int v0_70 = ((java.util.List) v0_61);
                if (!v0_70.isEmpty()) {
                    com.lele.llmonitor.ui.widget.BatteryWidget v3_11 = v2_9.registerReceiver(0, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    v4_2 = -1;
                    if (v3_11 == null) {
                        v6_1 = -1;
                    } else {
                        v6_1 = v3_11.getIntExtra("level", -1);
                    }
                    if (v3_11 != null) {
                        v4_2 = v3_11.getIntExtra("status", -1);
                    }
                    if (v3_11 == null) {
                        v9_1 = 0;
                    } else {
                        v9_1 = v3_11.getIntExtra("plugged", 0);
                    }
                    if ((v4_2 != 2) && (v4_2 != 5)) {
                        v5_0 = 0;
                    }
                    float v12_4;
                    java.util.Iterator v7_9 = com.lele.llmonitor.data.BatteryEngine.INSTANCE;
                    int v10_4 = v7_9.getCurrentMa(v2_9);
                    float v11_4 = v7_9.sanitizeCurrentReading(v10_4, v6_1, v4_2, v9_1);
                    float v12_11 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
                    float v13_8 = ((Boolean) v12_11.isInvertCurrent().getValue()).booleanValue();
                    boolean v14_2 = ((Boolean) v12_11.isDoubleCell().getValue()).booleanValue();
                    boolean v15_0 = v7_9.applyCurrentAdjustments(v11_4, v13_8, v14_2);
                    String v36_1 = v0_70;
                    int v0_1 = v7_9.getBatteryDesignCapacity(v2_9);
                    float v17_0 = v1_1;
                    float v1_2 = v7_9.getBatteryCurrentCapacity(v2_9);
                    if (!((Boolean) v12_11.isVirtualVoltageEnabled().getValue()).booleanValue()) {
                        v12_4 = v7_9.getVoltageV(v2_9);
                    } else {
                        v12_4 = v7_9.getVirtualVoltage(v1_2, v0_1, v5_0);
                    }
                    int v20_0;
                    int v0_3;
                    float v18_2 = ((v15_0 / 1148846080) * v12_4);
                    int v19_0 = v0_1;
                    if (v3_11 == null) {
                        v20_0 = v1_2;
                        v0_3 = 0;
                    } else {
                        v20_0 = v1_2;
                        v0_3 = v3_11.getIntExtra("temperature", 0);
                    }
                    float v1_4 = v7_9.parseBatteryTemperature(v0_3);
                    com.lele.llmonitor.ui.widget.BatteryWidget v3_0 = v1_4.getCelsius();
                    int v21_0 = v0_3;
                    int v22_0 = v1_4.getFractionDigits();
                    int v0_6 = com.lele.llmonitor.utils.BatteryUtils.INSTANCE.formatTimestamp(System.currentTimeMillis());
                    float v1_7 = new com.lele.llmonitor.ui.widget.BatteryWidget();
                    v7_1 = v36_1.iterator();
                    v30 = v0_6;
                    v28_0 = v3_0;
                    v25_0 = v15_0;
                    v24_0 = v18_2;
                    v27 = v19_0;
                    v26_0 = v20_0;
                    v0_7 = v21_0;
                    v29_0 = v22_0;
                    v3_2 = v2_9;
                    v15_1 = v14_2;
                    v2_2 = v1_7;
                    v14_3 = v13_8;
                    v1_1 = v17_0;
                    v13_0 = v12_4;
                    v12_5 = v11_4;
                    v11_0 = v10_4;
                    v10_0 = 0;
                    if (v7_1.hasNext()) {
                        float v18_6 = v8_0;
                        int v8_3 = ((d31) v7_1.next());
                        v3_2.getClass();
                        int v19_4 = v0_7;
                        float v17_7 = v10_0;
                        int v20_4 = v13_0;
                        com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$2$1 v34 = new com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$2$1(v24_0, v25_0, v26_0, v27, v28_0, v29_0, v30, 0);
                        int v0_54 = v25_0;
                        com.lele.llmonitor.ui.widget.BatteryWidget v32 = v28_0;
                        java.util.Iterator v33 = v29_0;
                        v10_2 = v30;
                        v1_1.L$0 = 0;
                        v1_1.L$1 = v3_2;
                        v1_1.L$2 = 0;
                        v1_1.L$3 = 0;
                        v1_1.L$4 = 0;
                        v1_1.L$5 = 0;
                        v1_1.L$6 = v10_2;
                        v1_1.L$7 = v2_2;
                        v1_1.L$8 = 0;
                        v1_1.L$9 = v7_1;
                        v1_1.L$10 = 0;
                        v1_1.L$11 = v8_3;
                        v1_1.I$0 = v6_1;
                        v1_1.I$1 = v4_2;
                        v1_1.I$2 = v9_1;
                        v1_1.I$3 = v5_0;
                        v1_1.F$0 = v11_0;
                        v1_1.F$1 = v12_5;
                        v1_1.Z$0 = v14_3;
                        v1_1.Z$1 = v15_1;
                        v1_1.F$2 = v0_54;
                        v13_2 = v27;
                        v1_1.I$4 = v13_2;
                        v1_1.I$5 = v26_0;
                        v1_1.F$3 = v20_4;
                        v1_1.F$4 = v24_0;
                        v1_1.I$6 = v19_4;
                        int v0_59 = v32;
                        v1_1.F$5 = v0_59;
                        float v28_1 = v0_59;
                        int v0_60 = v33;
                        v1_1.I$7 = v0_60;
                        int v29_1 = v0_60;
                        v1_1.I$8 = v17_7;
                        v1_1.I$9 = 0;
                        v1_1.label = 2;
                        float v1_10 = v18_6;
                        if (wm1.o0(v3_2, v8_3, v34, v1_1) != v1_10) {
                            v18_4 = v1_10;
                            v0_31 = v2_2;
                            v1_8 = v12_5;
                            v23_1 = v19_4;
                            v2_4 = v25_0;
                            v12_7 = v26_0;
                            v22_2 = v28_1;
                            v19_2 = 0;
                            v25_2 = v20_4;
                            v20_2 = v17_7;
                            v17_3 = v8_3;
                            v8_1 = v11_0;
                            v11_2 = v1_1;
                            v21_2 = v29_1;
                            v3_2.getClass();
                            int v26_2 = v12_7;
                            v11_2.L$0 = 0;
                            v11_2.L$1 = v3_2;
                            v11_2.L$2 = 0;
                            v11_2.L$3 = 0;
                            v11_2.L$4 = 0;
                            v11_2.L$5 = 0;
                            v11_2.L$6 = v10_2;
                            v11_2.L$7 = v0_31;
                            v11_2.L$8 = 0;
                            v11_2.L$9 = v7_1;
                            v11_2.L$10 = 0;
                            v11_2.L$11 = 0;
                            v11_2.I$0 = v6_1;
                            v11_2.I$1 = v4_2;
                            v11_2.I$2 = v9_1;
                            v11_2.I$3 = v5_0;
                            v11_2.F$0 = v8_1;
                            v11_2.F$1 = v1_8;
                            v11_2.Z$0 = v14_3;
                            v11_2.Z$1 = v15_1;
                            v11_2.F$2 = v2_4;
                            v11_2.I$4 = v13_2;
                            float v12_10 = v26_2;
                            v11_2.I$5 = v12_10;
                            int v26_3 = v1_8;
                            v11_2.F$3 = v25_2;
                            v11_2.F$4 = v24_0;
                            v11_2.I$6 = v23_1;
                            v11_2.F$5 = v22_2;
                            v11_2.I$7 = v21_2;
                            v11_2.I$8 = v20_2;
                            v11_2.I$9 = v19_2;
                            v11_2.label = 3;
                            v0_52 = v18_4;
                            if (v0_31.update(v3_2, v17_3, v11_2) != v0_52) {
                                v26_0 = v12_10;
                                v12_5 = v26_3;
                                v30 = v10_2;
                                v1_1 = v11_2;
                                v27 = v13_2;
                                v10_0 = v20_2;
                                v29_0 = v21_2;
                                v28_0 = v22_2;
                                v13_0 = v25_2;
                                v25_0 = v2_4;
                                v11_0 = v8_1;
                                v2_2 = v0_31;
                                v8_0 = v0_52;
                                v0_7 = v23_1;
                            } else {
                                return v0_52;
                            }
                        } else {
                            v0_52 = v1_10;
                            return v0_52;
                        }
                    }
                }
            } else {
                v0_52 = v8_0;
                return v0_52;
            }
        } else {
            if (v2_1 == 1) {
                float v17_8 = v0_2;
                int v0_69 = ((android.content.Context) v1_1.L$1);
                ib1.Q(v17_8);
                v2_9 = v0_69;
                v0_61 = v17_8;
            } else {
                if (v2_1 == 2) {
                    com.lele.llmonitor.ui.widget.BatteryWidget v2_3 = v1_1.I$8;
                    com.lele.llmonitor.ui.widget.BatteryWidget v3_3 = v1_1.I$7;
                    int v4_1 = v1_1.F$5;
                    int v5_1 = v1_1.I$6;
                    int v6_0 = v1_1.F$4;
                    java.util.Iterator v7_2 = v1_1.F$3;
                    int v9_0 = v1_1.I$5;
                    int v10_1 = v1_1.I$4;
                    float v11_1 = v1_1.F$2;
                    float v12_6 = v1_1.Z$1;
                    float v13_1 = v1_1.Z$0;
                    boolean v14_4 = v1_1.F$1;
                    boolean v15_2 = v1_1.F$0;
                    float v18_3 = v1_1.I$9;
                    int v19_1 = v1_1.I$3;
                    int v20_1 = v1_1.I$2;
                    int v21_1 = v1_1.I$1;
                    int v22_1 = v1_1.I$0;
                    String v36_2 = ((d31) v1_1.L$11);
                    bw3 v23_0 = ((java.util.Iterator) v1_1.L$9);
                    float v24_1 = ((com.lele.llmonitor.ui.widget.BatteryWidget) v1_1.L$7);
                    float v25_1 = ((String) v1_1.L$6);
                    int v0 = ((android.content.Intent) v1_1.L$4);
                    v0 = ((x21) v1_1.L$2);
                    int v26_1 = ((android.content.Context) v1_1.L$1);
                    ib1.Q(v0_2);
                    v11_2 = v1_1;
                    v1_8 = v14_4;
                    v14_3 = v13_1;
                    v13_2 = v10_1;
                    v10_2 = v25_1;
                    v25_2 = v7_2;
                    v7_1 = v23_0;
                    v23_1 = v5_1;
                    v5_0 = v19_1;
                    v19_2 = v18_3;
                    v18_4 = v8_0;
                    v8_1 = v15_2;
                    v15_1 = v12_6;
                    v12_7 = v9_0;
                    v9_1 = v20_1;
                    v20_2 = v2_3;
                    v2_4 = v11_1;
                    v17_3 = v36_2;
                    v0_31 = v24_1;
                    v24_0 = v6_0;
                    v6_1 = v22_1;
                    v22_2 = v4_1;
                    v4_2 = v21_1;
                    v21_2 = v3_3;
                    v3_2 = v26_1;
                } else {
                    if (v2_1 != 3) {
                        h.m("call to \'resume\' before \'invoke\' with coroutine");
                        return 0;
                    } else {
                        com.lele.llmonitor.ui.widget.BatteryWidget v2_6 = v1_1.I$8;
                        int v5_2 = v1_1.I$7;
                        int v9_2 = v1_1.F$5;
                        int v10_3 = v1_1.I$6;
                        float v11_3 = v1_1.F$4;
                        float v12_8 = v1_1.F$3;
                        float v13_3 = v1_1.I$5;
                        boolean v14_5 = v1_1.I$4;
                        boolean v15_3 = v1_1.F$2;
                        com.lele.llmonitor.ui.widget.BatteryWidget v3_4 = v1_1.Z$1;
                        int v4_3 = v1_1.Z$0;
                        int v6_2 = v1_1.F$1;
                        java.util.Iterator v7_3 = v1_1.F$0;
                        String v36_3 = v1_1.I$3;
                        float v18_5 = v1_1.I$2;
                        int v19_3 = v1_1.I$1;
                        int v20_3 = v1_1.I$0;
                        int v21_3 = ((java.util.Iterator) v1_1.L$9);
                        int v22_3 = ((com.lele.llmonitor.ui.widget.BatteryWidget) v1_1.L$7);
                        bw3 v23_2 = ((String) v1_1.L$6);
                        v0 = ((android.content.Intent) v1_1.L$4);
                        v0 = ((x21) v1_1.L$2);
                        float v24_2 = ((android.content.Context) v1_1.L$1);
                        ib1.Q(v0_2);
                        v29_0 = v5_2;
                        v0_52 = v8_0;
                        v28_0 = v9_2;
                        v26_0 = v13_3;
                        v27 = v14_5;
                        v25_0 = v15_3;
                        v9_1 = v18_5;
                        v30 = v23_2;
                        v5_0 = v36_3;
                        v15_1 = v3_4;
                        v14_3 = v4_3;
                        v23_1 = v10_3;
                        v13_0 = v12_8;
                        v4_2 = v19_3;
                        v3_2 = v24_2;
                        v10_0 = v2_6;
                        v12_5 = v6_2;
                        v24_0 = v11_3;
                        v6_1 = v20_3;
                        v2_2 = v22_3;
                        v11_0 = v7_3;
                        v7_1 = v21_3;
                    }
                }
            }
        }
        return bw3.a;
    }
}
