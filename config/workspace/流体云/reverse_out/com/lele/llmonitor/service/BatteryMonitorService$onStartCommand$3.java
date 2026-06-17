package com.lele.llmonitor.service;
final class BatteryMonitorService$onStartCommand$3 extends jj3 implements h11 {
    float F$0;
    float F$1;
    float F$2;
    float F$3;
    float F$4;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    long J$4;
    long J$5;
    long J$6;
    long J$7;
    private synthetic Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    int label;
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$onStartCommand$3(com.lele.llmonitor.service.BatteryMonitorService p1, n60 p2)
    {
        this.this$0 = p1;
        super(2, p2);
        return;
    }

    public final n60 create(Object p2, n60 p3)
    {
        com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3 v0_1 = new com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3(this.this$0, p3);
        v0_1.L$0 = p2;
        return v0_1;
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p86)
    {
        try {
            int v35_2;
            int v23_1;
            float v21_0;
            float v20_0;
            boolean v24_7;
            int v35_4;
            int v10_1;
            boolean v25_0;
            float v11_2;
            float v11_0;
            int v14_2;
            boolean v25_2;
            float v67;
            long v12_3;
            boolean v22_0;
            long v12_2;
            int v8_0;
            int v30_0;
            float v11_3;
            long v18;
            int v14_0;
            int v30_2;
            int v26_1;
            int v23_2;
            Exception v0_90;
            int v36;
            int v30_3;
            long v45;
            boolean v24_2;
            float v4_3;
            long v27_0;
            int v26_3;
            long v47;
            long v75;
            int v1_6;
            boolean v22_2;
            float v61;
            int v77;
            long v12_0;
            int v26_7;
            int v29_0;
            Exception v28_0;
            int v73;
            int v23_0;
            float v31_1;
            int v13_0;
            long v27_2;
            long v12_4;
            Exception v0_25;
            int v9_1;
            long v2_4;
            int v13_2;
            Exception v28_1;
            int v9_4;
            int v1_0;
            float v65;
            boolean v41_2;
            float v64;
            long v38_0;
            long v62;
            int v69;
            float v20_2;
            boolean v39_0;
            float v15_3;
            int v1_14;
            int v42_2;
            int v56;
            float v71;
            boolean v24_1;
            int v29_2;
            long v52;
            int v29_3;
            int v33_2;
            int v10_0;
            long v5_2;
            long v5_3;
            Exception v49;
            int v79;
            boolean v22_1;
            float v15_4;
            float v34_0;
            int v9_0;
            long v5_0;
            boolean v74;
            int v3_4;
            float v66;
            Exception v0_61;
            int v35_0;
            long v2_24;
            long v16;
            long v2_5;
            int v1_8 = ((d80) this.L$0);
            int v8_1 = "db";
            float v4_2 = e80.d;
            switch (this.label) {
                case 0:
                    v20_2 = "power";
                    v16 = 10000;
                    v18 = 0;
                    ib1.Q(p86);
                    Exception v0_63 = this.this$0;
                    this.L$0 = v1_8;
                    v2_4 = 1;
                    this.label = 1;
                    if (com.lele.llmonitor.service.BatteryMonitorService.access$ensureDependenciesInitialized(v0_63, this) != v4_2) {
                        v9_1 = v20_2;
                        Exception v0_67 = this.this$0.getSystemService(v9_1);
                        v0_67.getClass();
                        int v3_5 = this.this$0;
                        Exception v0_69 = ((android.os.PowerManager) v0_67).newWakeLock(v2_4, "LLMonitor::BatteryUpdate");
                        v0_69.setReferenceCounted(0);
                        com.lele.llmonitor.service.BatteryMonitorService.access$setWakeLock$p(v3_5, v0_69);
                        v10_0 = v1_8;
                        v11_0 = v18;
                        if (!r7.I(v10_0)) {
                            return bw3.a;
                        } else {
                            v13_0 = android.os.SystemClock.elapsedRealtime();
                            try {
                                Exception v0_74 = com.lele.llmonitor.service.BatteryMonitorService.access$getWakeLock$p(this.this$0);
                                try {
                                    if (v0_74 != null) {
                                        v0_74.acquire(5000);
                                    }
                                } catch (Exception v0_2) {
                                    float v4_0 = v2_4;
                                    try {
                                        int v1_2 = com.lele.llmonitor.service.BatteryMonitorService.access$getWakeLock$p(this.this$0);
                                    } catch (Exception) {
                                        throw v0_2;
                                    }
                                    if (v1_2 == 0) {
                                    } else {
                                        if (v1_2.isHeld() != v4_0) {
                                        } else {
                                            int v1_5 = com.lele.llmonitor.service.BatteryMonitorService.access$getWakeLock$p(this.this$0);
                                            if (v1_5 == 0) {
                                            } else {
                                                v1_5.release();
                                            }
                                        }
                                    }
                                }
                                long v5_7;
                                int v26_4 = System.currentTimeMillis();
                                Exception v0_77 = this.this$0.registerReceiver(0, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                int v1_11 = -1;
                                if (v0_77 == null) {
                                    v5_7 = 0;
                                } else {
                                    v5_7 = v0_77.getIntExtra("level", -1);
                                }
                                if (v0_77 == null) {
                                    v15_3 = 0;
                                } else {
                                    v15_3 = v0_77.getIntExtra("temperature", 0);
                                }
                                int v3_12 = com.lele.llmonitor.data.BatteryEngine.INSTANCE;
                                int v6_2 = v3_12.parseBatteryTemperature(v15_3);
                                float v32_2 = v6_2.getCelsius();
                                com.lele.llmonitor.service.BatteryMonitorService.access$setLastBatteryTempFractionDigits$p(this.this$0, v6_2.getFractionDigits());
                                if (v0_77 != null) {
                                    v1_11 = v0_77.getIntExtra("status", -1);
                                }
                                Exception v0_79;
                                if (v0_77 == null) {
                                    v0_79 = 0;
                                } else {
                                    v0_79 = v0_77.getIntExtra("plugged", 0);
                                }
                                if ((v1_11 != 2) && (v1_11 != 5)) {
                                    int v6_6 = 0;
                                } else {
                                    v6_6 = 1;
                                }
                                long v2_19;
                                if (v0_79 == null) {
                                    v2_19 = 0;
                                } else {
                                    v2_19 = 1;
                                }
                                if (v2_19 != 0) {
                                    v35_4 = v4_2;
                                    v36 = v8_1;
                                    Exception v0_84;
                                    Exception v28_3;
                                    float v4_7 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
                                    int v8_3 = ((Boolean) v4_7.isInvertCurrent().getValue()).booleanValue();
                                    long v38_1 = v4_7;
                                    v39_0 = ((Boolean) v4_7.isDoubleCell().getValue()).booleanValue();
                                    v22_2 = ((Boolean) v38_1.isVirtualVoltageEnabled().getValue()).booleanValue();
                                    float v4_11 = this.this$0.getApplicationContext();
                                    v4_11.getClass();
                                    float v4_12 = v3_12.getCurrentMa(v4_11);
                                    int v30_4 = v3_12.sanitizeCurrentReading(v4_12, v5_7, v1_11, v0_79);
                                    int v40_0 = v0_79;
                                    Exception v0_82 = this.this$0;
                                    if (!v22_2) {
                                        v28_3 = v5_7;
                                        Exception v0_83 = v0_82.getApplicationContext();
                                        v0_83.getClass();
                                        v0_84 = v3_12.getVoltageV(v0_83);
                                    } else {
                                        Exception v0_85 = v0_82.getApplicationContext();
                                        v0_85.getClass();
                                        Exception v0_86 = v3_12.getBatteryDesignCapacity(v0_85);
                                        v28_3 = v5_7;
                                        long v5_9 = this.this$0.getApplicationContext();
                                        v5_9.getClass();
                                        v0_84 = v3_12.getVirtualVoltage(v3_12.getBatteryCurrentCapacity(v5_9), v0_86, v6_6);
                                    }
                                    int v29_4 = v0_84;
                                    int v23_8;
                                    float v31_2 = ((v30_4 / 1148846080) * v29_4);
                                    v41_2 = v8_3;
                                    int v8_4 = new com.lele.llmonitor.data.local.BatteryEntity(0, v26_4, v28_3, v29_4, v30_4, v31_2, v32_2, 1, 0);
                                    Exception v0_89 = v28_3;
                                    int v33_4 = v29_4;
                                    float v34_2 = v30_4;
                                    long v5_11 = v32_2;
                                    float v32_3 = v31_2;
                                    float v31_3 = v4_12;
                                    int v3_13 = v26_4;
                                    v42_2 = v2_19;
                                    long v2_21 = this.this$0.getSystemService(v9_1);
                                    v2_21.getClass();
                                    long v2_23 = ((android.os.PowerManager) v2_21).isInteractive();
                                    if (v42_2 == 0) {
                                        if (v2_23 == 0) {
                                            v23_8 = ((Number) v38_1.getRefreshRateNotifyNotChargingScreenOff().getValue()).longValue();
                                        } else {
                                            v23_8 = ((Number) v38_1.getRefreshRateNotifyNotCharging().getValue()).longValue();
                                        }
                                    } else {
                                        if (v2_23 == 0) {
                                            v23_8 = ((Number) v38_1.getRefreshRateNotifyChargingScreenOff().getValue()).longValue();
                                        } else {
                                            v23_8 = ((Number) v38_1.getRefreshRateNotifyCharging().getValue()).longValue();
                                        }
                                    }
                                    int v26_5 = v23_8;
                                    int v29_5;
                                    if (v2_23 == 0) {
                                        v29_5 = v26_5;
                                    } else {
                                        v29_5 = v16;
                                    }
                                    boolean v24_4 = android.os.SystemClock.elapsedRealtime();
                                    v38_0 = v9_1;
                                    try {
                                        Exception v28_4 = v40_0;
                                        int v23_19 = com.lele.llmonitor.service.BatteryMonitorService.access$getVisualRefreshScheduler$p(this.this$0).evaluate(v24_4, v26_5, v28_4, v29_5);
                                        v47 = v24_4;
                                        v45 = v26_5;
                                        v9_1 = v28_4;
                                        long v43_0 = v29_5;
                                        boolean v24_5 = v1_11;
                                        boolean v25_4 = v2_23;
                                        int v1_12 = v23_19.getTargetDelayMs();
                                    } catch (Exception v0_1) {
                                        v1_0 = v35_4;
                                        v0_1.printStackTrace();
                                        try {
                                            Exception v0_5 = com.lele.llmonitor.service.BatteryMonitorService.access$getWakeLock$p(this.this$0);
                                        } catch (Exception) {
                                            v8_0 = 3000;
                                            v5_0 = v11_0;
                                            v12_0 = v10_0;
                                            v10_1 = v13_0;
                                            int v3_3 = (android.os.SystemClock.elapsedRealtime() - v10_1);
                                            int v13_1 = (v8_0 - v3_3);
                                            if (v13_1 < v18) {
                                                v13_1 = v18;
                                            }
                                            Exception v0_16 = new com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3$triggered$1(this.this$0, 0);
                                            this.L$0 = v12_0;
                                            this.L$1 = 0;
                                            this.L$2 = 0;
                                            this.L$3 = 0;
                                            this.L$4 = 0;
                                            this.L$5 = 0;
                                            this.L$6 = 0;
                                            this.J$0 = v5_0;
                                            this.J$1 = v10_1;
                                            this.J$2 = v8_0;
                                            this.J$3 = v3_3;
                                            this.J$4 = v13_1;
                                            this.label = 6;
                                            Exception v0_17 = vc1.d0(v13_1, v0_16, this);
                                            if (v0_17 != v1_0) {
                                                v10_0 = v12_0;
                                                v11_0 = v5_0;
                                                if (ni1.o(((Boolean) v0_17), Boolean.TRUE)) {
                                                    com.lele.llmonitor.service.BatteryMonitorService.access$getVisualRefreshScheduler$p(this.this$0).onExternalTrigger();
                                                }
                                                long v2_3 = v18;
                                                com.lele.llmonitor.service.BatteryMonitorService.scheduleNextKeepAliveKick$default(this.this$0, v2_3, 1, 0);
                                                com.lele.llmonitor.service.BatteryMonitorService.scheduleNextHealthCheckKick$default(this.this$0, v2_3, 1, 0);
                                                v2_4 = 1;
                                                v8_1 = v36;
                                                v9_1 = v38_0;
                                                v4_2 = v1_0;
                                            } else {
                                            }
                                        }
                                        if (v0_5 == null) {
                                        } else {
                                            if (v0_5.isHeld() != 1) {
                                            } else {
                                                Exception v0_8 = com.lele.llmonitor.service.BatteryMonitorService.access$getWakeLock$p(this.this$0);
                                                if (v0_8 == null) {
                                                } else {
                                                    v0_8.release();
                                                }
                                            }
                                        }
                                    }
                                    if (!v23_19.getShouldPublish()) {
                                        v26_3 = v3_13;
                                        v23_2 = v6_6;
                                        v9_4 = 0;
                                        v33_2 = v1_12;
                                        v0_90 = v8_4;
                                        v66 = v5_11;
                                        v52 = v11_0;
                                        v56 = v15_3;
                                        v2_24 = v24_5;
                                        v12_4 = v25_4;
                                        v49 = v0_89;
                                        v61 = v33_4;
                                        v64 = v34_2;
                                        v15_4 = v31_3;
                                        v65 = v32_3;
                                        v1_14 = v9_1;
                                        v62 = v43_0;
                                        long v54 = v13_0;
                                        int v14_5 = v22_2;
                                        long v50 = v23_2;
                                        long v5_14 = v26_3;
                                        int v3_16 = v33_2;
                                        int v13_6 = v39_0;
                                        boolean v51 = v41_2;
                                        v11_2 = v42_2;
                                        float v59 = v45;
                                        float v57 = v47;
                                        try {
                                            int v8_9 = new com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3$2(v0_90, v9_4);
                                            this.L$0 = v10_0;
                                            this.L$1 = v9_4;
                                            this.L$2 = v9_4;
                                            this.L$3 = v9_4;
                                            this.L$4 = v0_90;
                                            this.L$5 = v9_4;
                                            this.L$6 = v9_4;
                                            boolean v22_12 = v10_0;
                                            int v9_8 = v52;
                                            try {
                                                this.J$0 = v9_8;
                                                int v23_22 = v9_8;
                                                int v9_9 = v54;
                                                try {
                                                    this.J$1 = v9_9;
                                                    this.J$2 = v3_16;
                                                    this.J$3 = v5_14;
                                                    boolean v25_7 = v0_90;
                                                    Exception v0_109 = v49;
                                                    this.I$0 = v0_109;
                                                    int v26_8 = v0_109;
                                                    Exception v0_110 = v56;
                                                    this.I$1 = v0_110;
                                                    long v27_5 = v0_110;
                                                    Exception v0_111 = v66;
                                                    this.F$0 = v0_111;
                                                    this.I$2 = v2_24;
                                                    this.I$3 = v1_14;
                                                    Exception v28_9 = v0_111;
                                                    Exception v0_112 = v50;
                                                    this.I$4 = v0_112;
                                                    this.I$5 = v11_2;
                                                    int v29_9 = v0_112;
                                                    Exception v0_113 = v51;
                                                    this.Z$0 = v0_113;
                                                    this.Z$1 = v13_6;
                                                    this.Z$2 = v14_5;
                                                    this.F$1 = v15_4;
                                                    int v30_7 = v0_113;
                                                    Exception v0_115 = v64;
                                                    this.F$2 = v0_115;
                                                    float v31_5 = v0_115;
                                                    Exception v0_116 = v61;
                                                    this.F$3 = v0_116;
                                                    float v32_5 = v0_116;
                                                    Exception v0_117 = v65;
                                                    this.F$4 = v0_117;
                                                    this.Z$3 = v12_4;
                                                    float v34_3 = v0_117;
                                                    int v33_5 = v1_14;
                                                    Exception v0_118 = v59;
                                                    this.J$4 = v0_118;
                                                    boolean v39_2 = v0_118;
                                                    Exception v0_119 = v62;
                                                    this.J$5 = v0_119;
                                                    boolean v41_3 = v0_119;
                                                    Exception v0_121 = v57;
                                                    this.J$6 = v0_121;
                                                    long v43_2 = v0_121;
                                                    this.label = 3;
                                                    v8_0 = v35_4;
                                                } catch (Exception v0_1) {
                                                    v1_0 = v35_4;
                                                    v13_0 = v9_9;
                                                    v10_0 = v22_12;
                                                    v11_0 = v23_22;
                                                }
                                                if (vc1.d0(300, v8_9, this) != v8_0) {
                                                    v35_2 = v8_0;
                                                    v1_6 = v26_8;
                                                    v74 = v32_5;
                                                    v73 = v34_3;
                                                    v71 = v39_2;
                                                    v69 = v41_3;
                                                    v67 = v43_2;
                                                    v26_1 = v14_5;
                                                    v4_3 = v2_24;
                                                    v2_5 = v27_5;
                                                    v3_4 = v28_9;
                                                    v28_1 = v29_9;
                                                    v29_2 = v31_5;
                                                    v27_2 = v33_5;
                                                    v23_1 = v12_4;
                                                    v24_1 = v25_7;
                                                    v25_2 = v30_7;
                                                    v30_2 = v15_4;
                                                    v14_2 = v3_16;
                                                    v22_1 = v13_6;
                                                    v12_2 = v5_14;
                                                    v5_2 = v9_9;
                                                    v10_0 = v22_12;
                                                    v8_0 = v23_22;
                                                    try {
                                                        float v31_7;
                                                        Exception v0_128 = com.lele.llmonitor.service.BatteryMonitorService.access$getDb$p(this.this$0);
                                                    } catch (Exception v0_1) {
                                                        v1_0 = v35_2;
                                                        v13_0 = v5_2;
                                                        v11_0 = v8_0;
                                                    }
                                                    if (v0_128 == null) {
                                                        v31_7 = v10_0;
                                                        v1_0 = v35_2;
                                                        try {
                                                            ni1.U(v36);
                                                            throw 0;
                                                        } catch (Exception v0_1) {
                                                        }
                                                    } else {
                                                        Exception v0_129 = v0_128.batteryDao();
                                                        this.L$0 = v10_0;
                                                        v31_7 = v10_0;
                                                        try {
                                                            this.L$1 = 0;
                                                            this.L$2 = 0;
                                                            this.L$3 = 0;
                                                            this.L$4 = 0;
                                                            this.L$5 = 0;
                                                            this.L$6 = 0;
                                                            this.J$0 = v8_0;
                                                            this.J$1 = v5_2;
                                                            this.J$2 = v14_2;
                                                            this.J$3 = v12_2;
                                                            this.I$0 = v1_6;
                                                            this.I$1 = v2_5;
                                                            this.F$0 = v3_4;
                                                            this.I$2 = v4_3;
                                                            int v10_3 = v27_2;
                                                            this.I$3 = v10_3;
                                                            long v27_6 = v1_6;
                                                            int v1_15 = v28_1;
                                                            this.I$4 = v1_15;
                                                            this.I$5 = v11_2;
                                                            Exception v28_10 = v1_15;
                                                            int v1_16 = v25_2;
                                                            this.Z$0 = v1_16;
                                                            boolean v25_8 = v1_16;
                                                            int v1_17 = v22_1;
                                                            this.Z$1 = v1_17;
                                                            boolean v22_13 = v1_17;
                                                            int v1_18 = v26_1;
                                                            this.Z$2 = v1_18;
                                                            int v26_9 = v1_18;
                                                            int v1_19 = v30_2;
                                                            this.F$1 = v1_19;
                                                            int v30_9 = v1_19;
                                                            int v1_20 = v29_2;
                                                            this.F$2 = v1_20;
                                                            int v29_10 = v1_20;
                                                            int v1_21 = v74;
                                                            this.F$3 = v1_21;
                                                            float v32_7 = v1_21;
                                                            int v1_22 = v73;
                                                            this.F$4 = v1_22;
                                                            int v33_7 = v1_22;
                                                            int v1_23 = v23_1;
                                                            this.Z$3 = v1_23;
                                                            float v34_5 = v1_23;
                                                            int v23_23 = v2_5;
                                                            int v1_24 = v71;
                                                            this.J$4 = v1_24;
                                                            boolean v39_3 = v1_24;
                                                            int v1_25 = v69;
                                                            this.J$5 = v1_25;
                                                            boolean v41_4 = v1_25;
                                                            int v1_26 = v67;
                                                            this.J$6 = v1_26;
                                                            long v43_3 = v1_26;
                                                            this.label = 4;
                                                            v1_0 = v35_2;
                                                        } catch (Exception v0_1) {
                                                            v1_0 = v35_2;
                                                        }
                                                        if (v0_129.insert(v24_1, this) != v1_0) {
                                                            v35_0 = v1_0;
                                                            v2_5 = v23_23;
                                                            v0_25 = v27_6;
                                                            v1_6 = v30_9;
                                                            v30_0 = v32_7;
                                                            v24_7 = v34_5;
                                                            v79 = v39_3;
                                                            v77 = v41_4;
                                                            v75 = v43_3;
                                                            v27_0 = v10_3;
                                                            v23_0 = v22_13;
                                                            v22_0 = v29_10;
                                                            v29_0 = v33_7;
                                                            v28_0 = v11_2;
                                                            v10_1 = v5_2;
                                                            v5_0 = v8_0;
                                                            v8_0 = v14_2;
                                                            v14_0 = v12_2;
                                                            v13_2 = v26_9;
                                                            v12_0 = v31_7;
                                                            v26_7 = v25_8;
                                                            v25_0 = v28_10;
                                                            if ((v14_0 - v5_0) < v16) {
                                                                v1_0 = v35_0;
                                                                Exception v0_10 = com.lele.llmonitor.service.BatteryMonitorService.access$getWakeLock$p(this.this$0);
                                                                if ((v0_10 == null) || (v0_10.isHeld() != 1)) {
                                                                } else {
                                                                    Exception v0_13 = com.lele.llmonitor.service.BatteryMonitorService.access$getWakeLock$p(this.this$0);
                                                                    if (v0_13 == null) {
                                                                    } else {
                                                                        v0_13.release();
                                                                    }
                                                                }
                                                            } else {
                                                                float v31_10 = v1_6;
                                                                try {
                                                                    int v1_30 = com.lele.llmonitor.service.BatteryMonitorService.access$getDb$p(this.this$0);
                                                                } catch (Exception v0_1) {
                                                                    v34_0 = v12_0;
                                                                    v1_0 = v35_0;
                                                                    v13_0 = v10_1;
                                                                    v10_0 = v34_0;
                                                                    v11_0 = v5_0;
                                                                }
                                                                if (v1_30 == 0) {
                                                                    v34_0 = v12_0;
                                                                    v1_0 = v35_0;
                                                                    try {
                                                                        ni1.U(v36);
                                                                        throw 0;
                                                                    } catch (Exception v0_1) {
                                                                    }
                                                                } else {
                                                                    int v1_31 = v1_30.batteryDao();
                                                                    float v32_8 = v3_4;
                                                                    int v33_8 = v4_3;
                                                                    int v3_18 = (v14_0 - 172800000);
                                                                    this.L$0 = v12_0;
                                                                    v34_0 = v12_0;
                                                                    try {
                                                                        this.L$1 = 0;
                                                                        this.L$2 = 0;
                                                                        this.L$3 = 0;
                                                                        this.L$4 = 0;
                                                                        this.L$5 = 0;
                                                                        this.L$6 = 0;
                                                                        this.J$0 = v5_0;
                                                                        this.J$1 = v10_1;
                                                                        this.J$2 = v8_0;
                                                                        this.J$3 = v14_0;
                                                                        this.I$0 = v0_25;
                                                                        this.I$1 = v2_5;
                                                                        this.F$0 = v32_8;
                                                                        this.I$2 = v33_8;
                                                                        this.I$3 = v27_0;
                                                                        this.I$4 = v25_0;
                                                                        this.I$5 = v28_0;
                                                                        this.Z$0 = v26_7;
                                                                        this.Z$1 = v23_0;
                                                                        this.Z$2 = v13_2;
                                                                        this.F$1 = v31_10;
                                                                        this.F$2 = v22_0;
                                                                        this.F$3 = v30_0;
                                                                        this.F$4 = v29_0;
                                                                        this.Z$3 = v24_7;
                                                                        this.J$4 = v79;
                                                                        this.J$5 = v77;
                                                                        this.J$6 = v75;
                                                                        this.J$7 = 172800000;
                                                                        try {
                                                                            this.label = 5;
                                                                            v1_0 = v35_0;
                                                                        } catch (Exception v0_1) {
                                                                            v1_0 = v35_0;
                                                                        }
                                                                        if (v1_31.clearOldData(v3_18, this) != v1_0) {
                                                                            v5_0 = v14_0;
                                                                            v13_0 = v10_1;
                                                                            v9_0 = v8_0;
                                                                            v8_0 = v9_0;
                                                                            v10_1 = v13_0;
                                                                            v12_0 = v34_0;
                                                                        } else {
                                                                        }
                                                                    } catch (Exception v0_1) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                        }
                                                    }
                                                    v13_0 = v5_2;
                                                    v11_0 = v8_0;
                                                    v10_0 = v31_7;
                                                } else {
                                                    v1_0 = v8_0;
                                                }
                                            } catch (Exception v0_1) {
                                                v23_22 = v9_9;
                                                v1_0 = v35_4;
                                                v9_9 = v54;
                                            }
                                        } catch (Exception v0_1) {
                                            v22_12 = v10_0;
                                            v1_0 = v35_4;
                                            v23_22 = v52;
                                        }
                                    } else {
                                        int v23_21 = v6_6;
                                        try {
                                            int v6_7 = this.this$0;
                                            this.L$0 = v10_0;
                                            int v26_6 = v6_7;
                                            try {
                                                this.L$1 = 0;
                                                this.L$2 = 0;
                                                this.L$3 = 0;
                                                this.L$4 = v8_4;
                                                this.L$5 = 0;
                                                this.L$6 = 0;
                                                this.J$0 = v11_0;
                                                this.J$1 = v13_0;
                                                this.J$2 = v1_12;
                                                this.J$3 = v3_13;
                                                this.I$0 = v0_89;
                                                this.I$1 = v15_3;
                                                this.F$0 = v5_11;
                                                int v6_9 = v24_5;
                                            } catch (Exception v0_1) {
                                                v8_0 = v35_4;
                                                v1_0 = v8_0;
                                            }
                                            this.I$2 = v6_9;
                                            this.I$3 = v9_1;
                                            Exception v28_6 = v0_89;
                                            Exception v0_92 = v23_21;
                                            this.I$4 = v0_92;
                                            v23_2 = v0_92;
                                            Exception v0_93 = v42_2;
                                            this.I$5 = v0_93;
                                            boolean v24_6 = v8_4;
                                            int v8_5 = v41_2;
                                            this.Z$0 = v8_5;
                                            v42_2 = v0_93;
                                            Exception v0_94 = v39_0;
                                            this.Z$1 = v0_94;
                                            v39_0 = v0_94;
                                            Exception v0_95 = v22_2;
                                            this.Z$2 = v0_95;
                                            v22_2 = v0_95;
                                            Exception v0_96 = v31_3;
                                            this.F$1 = v0_96;
                                            float v31_4 = v0_96;
                                            Exception v0_97 = v34_2;
                                            this.F$2 = v0_97;
                                            int v30_6 = v0_97;
                                            Exception v0_98 = v33_4;
                                            this.F$3 = v0_98;
                                            int v29_7 = v0_98;
                                            Exception v0_99 = v32_3;
                                            this.F$4 = v0_99;
                                            float v32_4 = v0_99;
                                            Exception v0_100 = v25_4;
                                            this.Z$3 = v0_100;
                                            v41_2 = v8_5;
                                            int v40_2 = v9_1;
                                            int v8_6 = v45;
                                            this.J$4 = v8_6;
                                            v45 = v8_6;
                                            int v8_7 = v43_0;
                                            this.J$5 = v8_7;
                                            boolean v25_5 = v0_100;
                                            v33_2 = v1_12;
                                            Exception v0_101 = v47;
                                            this.J$6 = v0_101;
                                            this.label = 2;
                                            long v2_27 = v28_6;
                                            v8_0 = v35_4;
                                            v9_4 = 0;
                                            float v4_14 = v5_11;
                                            int v3_15 = v40_2;
                                            long v5_13 = v0_101;
                                            v1_6 = v24_6;
                                            v26_3 = v3_13;
                                            try {
                                                v47 = v5_13;
                                            } catch (Exception v0_1) {
                                            }
                                            if (com.lele.llmonitor.service.BatteryMonitorService.access$publishVisuals(v26_6, v1_6, v2_27, v3_15, v4_14, v5_13, this) != v8_0) {
                                                v2_5 = v11_0;
                                                v0_61 = v2_27;
                                                v12_3 = v29_7;
                                                v21_0 = v31_4;
                                                v11_3 = v32_4;
                                                v29_3 = v3_15;
                                                v5_3 = v8_7;
                                                v31_1 = v4_14;
                                                v4_3 = v30_6;
                                                v30_3 = v6_9;
                                                v24_2 = v25_5;
                                                v49 = v0_61;
                                                v0_90 = v1_6;
                                                v52 = v2_5;
                                                v64 = v4_3;
                                                v62 = v5_3;
                                                v35_4 = v8_0;
                                                v65 = v11_3;
                                                v61 = v12_3;
                                                v56 = v15_3;
                                                v15_4 = v21_0;
                                                v12_4 = v24_2;
                                                v1_14 = v29_3;
                                                v2_24 = v30_3;
                                                v66 = v31_1;
                                            } else {
                                            }
                                        } catch (Exception v0_1) {
                                            v8_0 = v35_4;
                                        }
                                    }
                                } else {
                                    v35_4 = v4_2;
                                    if (!com.lele.llmonitor.service.BatteryMonitorService.access$isLiveSuppressedForCurrentSession$p(this.this$0)) {
                                    } else {
                                        v36 = v8_1;
                                        com.lele.llmonitor.service.BatteryMonitorService.access$setLiveSuppressedForCurrentSession$p(this.this$0, 0);
                                    }
                                }
                                v38_0 = v9_1;
                            } catch (Exception v0_1) {
                                v1_0 = v4_2;
                                v36 = v8_1;
                                v38_0 = v9_1;
                            }
                        }
                    } else {
                        v1_0 = v4_2;
                    }
                case 1:
                    v20_2 = "power";
                    v16 = 10000;
                    v18 = 0;
                    ib1.Q(p86);
                    v2_4 = 1;
                    break;
                case 2:
                    v20_0 = "power";
                    v16 = 10000;
                    v18 = 0;
                    v5_3 = this.J$5;
                    int v9_3 = this.J$4;
                    v11_3 = this.F$4;
                    v12_3 = this.F$3;
                    int v13_4 = this.F$2;
                    int v14_3 = this.F$1;
                    float v15_2 = this.Z$2;
                    v24_2 = this.Z$3;
                    boolean v25_3 = this.Z$1;
                    int v26_2 = this.Z$0;
                    long v27_3 = this.I$5;
                    Exception v28_2 = this.I$4;
                    v29_3 = this.I$3;
                    v30_3 = this.I$2;
                    v31_1 = this.F$0;
                    float v32_1 = this.I$1;
                    int v33_1 = this.J$6;
                    int v35_3 = this.J$3;
                    long v37_1 = this.J$2;
                    boolean v39_1 = this.J$1;
                    v2_5 = this.J$0;
                    boolean v41_1 = this.I$0;
                    Exception v0 = ((android.os.PowerManager) this.L$5);
                    int v42_1 = ((com.lele.llmonitor.data.local.BatteryEntity) this.L$4);
                    v0 = ((android.content.Intent) this.L$2);
                    ib1.Q(p86);
                    v45 = v9_3;
                    v21_0 = v14_3;
                    v22_2 = v15_2;
                    v23_2 = v28_2;
                    v15_3 = v32_1;
                    v47 = v33_1;
                    v33_2 = v37_1;
                    v0_61 = v41_1;
                    v9_4 = 0;
                    v10_0 = v1_8;
                    v38_0 = "power";
                    v41_2 = v26_2;
                    v1_6 = v42_1;
                    v42_2 = v27_3;
                    v26_3 = v35_3;
                    v36 = "db";
                    v8_0 = v4_2;
                    v4_3 = v13_4;
                    v13_0 = v39_1;
                    v39_0 = v25_3;
                    break;
                case 3:
                    v20_0 = "power";
                    v16 = 10000;
                    v18 = 0;
                    long v5_1 = this.J$5;
                    int v9_2 = this.J$4;
                    float v11_1 = this.F$4;
                    long v12_1 = this.F$3;
                    int v13_3 = this.F$2;
                    int v14_1 = this.F$1;
                    float v15_1 = this.Z$2;
                    boolean v24_0 = this.Z$3;
                    boolean v25_1 = this.Z$1;
                    int v26_0 = this.Z$0;
                    long v27_1 = this.I$5;
                    v28_1 = this.I$4;
                    int v29_1 = this.I$3;
                    int v30_1 = this.I$2;
                    float v31_0 = this.F$0;
                    float v32_0 = this.I$1;
                    int v33_0 = this.J$6;
                    int v35_1 = this.J$3;
                    long v37_0 = this.J$2;
                    v39_0 = this.J$1;
                    long v2_10 = this.J$0;
                    boolean v41_0 = this.I$0;
                    v0 = ((android.os.PowerManager) this.L$5);
                    int v42_0 = ((com.lele.llmonitor.data.local.BatteryEntity) this.L$4);
                    v0 = ((android.content.Intent) this.L$2);
                    ib1.Q(p86);
                    v69 = v5_1;
                    v71 = v9_2;
                    v73 = v11_1;
                    v74 = v12_1;
                    v23_1 = v24_0;
                    v22_1 = v25_1;
                    v25_2 = v26_0;
                    v11_2 = v27_1;
                    v27_2 = v29_1;
                    v67 = v33_0;
                    v5_2 = v39_0;
                    v24_1 = v42_0;
                    v10_0 = v1_8;
                    v29_2 = v13_3;
                    v26_1 = v15_1;
                    v12_2 = v35_1;
                    v1_6 = v41_0;
                    v35_2 = v4_2;
                    v36 = "db";
                    v4_3 = v30_1;
                    v8_0 = v2_10;
                    v30_2 = v14_1;
                    v3_4 = v31_0;
                    v2_5 = v32_0;
                    v14_2 = v37_0;
                    v38_0 = "power";
                    break;
                case 4:
                    v20_0 = "power";
                    v16 = 10000;
                    v18 = 0;
                    long v5_12 = this.J$6;
                    int v9_7 = this.J$5;
                    float v11_4 = this.J$4;
                    int v13_5 = this.F$4;
                    int v14_4 = this.F$3;
                    float v15_5 = this.F$1;
                    v24_7 = this.Z$3;
                    boolean v25_6 = this.Z$1;
                    v26_7 = this.Z$0;
                    long v27_4 = this.I$5;
                    Exception v28_8 = this.I$4;
                    int v29_8 = this.I$3;
                    int v30_8 = this.I$2;
                    float v31_6 = this.F$0;
                    float v32_6 = this.I$1;
                    float v34_4 = this.Z$2;
                    int v33_6 = this.F$2;
                    int v35_5 = this.J$3;
                    long v37_2 = this.J$2;
                    v39_0 = this.J$1;
                    long v2_31 = this.J$0;
                    boolean v41_5 = this.I$0;
                    v0 = ((android.os.PowerManager) this.L$5);
                    v0 = ((com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading) this.L$3);
                    v0 = ((android.os.PowerManager) this.L$1);
                    ib1.Q(p86);
                    v75 = v5_12;
                    v77 = v9_7;
                    v79 = v11_4;
                    v23_0 = v25_6;
                    v25_0 = v28_8;
                    v22_0 = v33_6;
                    v10_1 = v39_0;
                    v0_25 = v41_5;
                    v12_0 = v1_8;
                    v5_0 = v2_31;
                    v1_6 = v15_5;
                    v28_0 = v27_4;
                    v27_0 = v29_8;
                    v3_4 = v31_6;
                    v2_5 = v32_6;
                    v29_0 = v13_5;
                    v13_2 = v34_4;
                    v35_0 = v4_2;
                    v36 = "db";
                    v4_3 = v30_8;
                    v8_0 = v37_2;
                    v30_0 = v14_4;
                    v38_0 = "power";
                    v14_0 = v35_5;
                    break;
                case 5:
                    v5_0 = this.J$3;
                    v16 = 10000;
                    v9_0 = this.J$2;
                    v18 = 0;
                    v13_0 = this.J$1;
                    v11_0 = this.J$0;
                    v0 = ((android.os.PowerManager) this.L$5);
                    v0 = ((com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading) this.L$3);
                    v0 = ((android.os.PowerManager) this.L$1);
                    try {
                        ib1.Q(p86);
                        v34_0 = v1_8;
                        v1_0 = v4_2;
                        v36 = "db";
                        v38_0 = "power";
                    } catch (Exception v0_1) {
                        v10_0 = v1_0;
                        v1_0 = v4_2;
                        v36 = "db";
                        v38_0 = "power";
                    }
                    break;
                case 6:
                    v5_0 = this.J$0;
                    ib1.Q(p86);
                    v0_17 = p86;
                    v10_0 = v1_8;
                    v1_0 = v4_2;
                    v36 = "db";
                    v38_0 = "power";
                    v16 = 10000;
                    v18 = 0;
                    break;
                default:
                    h.m("call to \'resume\' before \'invoke\' with coroutine");
                    return 0;
            }
        } catch (Exception v0_1) {
            v10_0 = v1_6;
            v11_0 = v2_5;
            v1_0 = v4_3;
            v36 = v8_0;
            v38_0 = v20_0;
            v13_0 = v39_0;
        } catch (Exception v0_2) {
            v4_0 = 1;
        } catch (Exception) {
        }
        return v1_0;
    }
}
