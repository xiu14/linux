package com.lele.llmonitor.data.soc;
final class SocRepository$stream$1 extends jj3 implements h11 {
    final synthetic long $intervalMs;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    long J$2;
    private synthetic Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final synthetic com.lele.llmonitor.data.soc.SocRepository this$0;

    public SocRepository$stream$1(com.lele.llmonitor.data.soc.SocRepository p1, long p2, n60 p4)
    {
        this.this$0 = p1;
        this.$intervalMs = p2;
        super(2, p4);
        return;
    }

    public final n60 create(Object p5, n60 p6)
    {
        com.lele.llmonitor.data.soc.SocRepository$stream$1 v0_1 = new com.lele.llmonitor.data.soc.SocRepository$stream$1(this.this$0, this.$intervalMs, p6);
        v0_1.L$0 = p5;
        return v0_1;
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((pv0) p1), ((n60) p2));
    }

    public final Object invoke(pv0 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.soc.SocRepository$stream$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public final Object invokeSuspend(Object p51)
    {
        int v9_1;
        int v16_11;
        java.util.List v14_6;
        long v18_0;
        java.util.List v14_7;
        com.lele.llmonitor.data.soc.CpuModelResult v13_3;
        int v20_0;
        int v11_3;
        Object v3_0;
        com.lele.llmonitor.data.soc.CpuModelResult v13_5;
        int v9_5;
        com.lele.llmonitor.data.soc.LoadAvgResult v1_1;
        Object v3_1;
        int v10_0;
        int v10_1;
        int v16_2;
        com.lele.llmonitor.data.soc.LoadAvgResult v2_10;
        com.lele.llmonitor.data.soc.TemperatureResult v17_2;
        int v8_2;
        Object v3_3;
        int v6_5;
        int v10_2;
        com.lele.llmonitor.data.soc.CpuModelResult v4_0;
        com.lele.llmonitor.data.soc.SocSnapshot v12_0;
        int v8_3;
        int v10_3;
        int v6_6;
        com.lele.llmonitor.data.soc.CpuModelResult v4_1;
        com.lele.llmonitor.data.soc.SocSnapshot v12_1;
        int v8_4;
        int v10_4;
        Object v3_5;
        com.lele.llmonitor.data.soc.CpuModelResult v4_2;
        Object v3_6;
        com.lele.llmonitor.data.soc.LoadAvgResult v2_0;
        com.lele.llmonitor.data.soc.SocSnapshot v15_1;
        java.util.List v14_1;
        com.lele.llmonitor.data.soc.TemperatureResult v21;
        com.lele.llmonitor.data.soc.SocSnapshot v15_3;
        com.lele.llmonitor.data.soc.LoadAvgResult v1_4;
        java.util.List v7_1;
        Object v5_0;
        com.lele.llmonitor.data.soc.CpuModelResult v13_0;
        int v11_0;
        java.util.List v7_2;
        com.lele.llmonitor.data.soc.LoadAvgResult v1_5 = ((pv0) this.L$0);
        com.lele.llmonitor.data.soc.LoadAvgResult v2_17 = this.label;
        int v9_0 = e80.d;
        if (v2_17 == null) {
            int v16_0 = v1_5;
            ib1.Q(p51);
            com.lele.llmonitor.data.soc.LoadAvgResult v2_7 = uo0.d;
            v3_5 = 0;
            v7_2 = new com.lele.llmonitor.data.soc.CpuModelResult(0, v2_7);
            v8_3 = v2_7;
            v5_0 = 0;
            v1_4 = v16_0;
            v2_10 = 0;
            v10_2 = 0;
            if (!ib1.G(this.getContext())) {
                return bw3.a;
            } else {
                v11_3 = android.os.SystemClock.elapsedRealtime();
                com.lele.llmonitor.data.soc.CpuModelResult v13_2 = com.lele.llmonitor.data.soc.SocRepository.access$getDataSource$p(this.this$0);
                this.L$0 = v1_4;
                this.L$1 = v2_10;
                this.L$2 = v10_2;
                this.L$3 = v8_3;
                this.L$4 = v7_2;
                this.L$5 = 0;
                this.L$6 = 0;
                this.L$7 = 0;
                this.L$8 = 0;
                this.L$9 = 0;
                this.J$0 = v5_0;
                this.J$1 = v3_5;
                this.J$2 = v11_3;
                this.label = 1;
                v13_3 = v13_2.probeCpuUsage(v2_10, this);
                if (v13_3 != v9_0) {
                    com.lele.llmonitor.data.soc.CpuModelResult v13_4 = ((com.lele.llmonitor.data.soc.CpuUsageResult) v13_3);
                    v15_3 = v13_4.getNextCpuTimes();
                    if (v15_3 == null) {
                        v15_3 = v2_10;
                    }
                    com.lele.llmonitor.data.soc.LoadAvgResult v2_13 = com.lele.llmonitor.data.soc.SocRepository.access$getDataSource$p(this.this$0).readOnlineAndTotalCores();
                    v14_6 = ((Number) v2_13.d).intValue();
                    com.lele.llmonitor.data.soc.LoadAvgResult v2_16 = ((Number) v2_13.e).intValue();
                    int v16_1 = v9_0;
                    int v9_3 = com.lele.llmonitor.data.soc.SocRepository.access$getDataSource$p(this.this$0);
                    this.L$0 = v1_4;
                    this.L$1 = v15_3;
                    this.L$2 = v10_2;
                    this.L$3 = v8_3;
                    this.L$4 = v7_2;
                    this.L$5 = v13_4;
                    this.J$0 = v5_0;
                    this.J$1 = v3_5;
                    this.J$2 = v11_3;
                    this.I$0 = v14_6;
                    this.I$1 = v2_16;
                    boolean v51_1 = v1_4;
                    this.label = 2;
                    int v9_4 = v9_3.probeLoadAverages(this);
                    v1_1 = v16_1;
                    if (v9_4 != v1_1) {
                        v16_2 = v1_1;
                        v2_0 = v51_1;
                        p51 = v9_4;
                        v9_5 = v10_2;
                        v10_3 = v13_4;
                        v13_5 = v7_2;
                        v3_6 = v2_16;
                        v4_1 = v5_0;
                        v6_6 = v3_5;
                        boolean v51_2 = v3_6;
                        Object v3_8 = com.lele.llmonitor.data.soc.SocRepository.access$getDataSource$p(this.this$0);
                        this.L$0 = v2_0;
                        this.L$1 = v15_3;
                        this.L$2 = v9_5;
                        this.L$3 = v8_3;
                        this.L$4 = v13_5;
                        this.L$5 = v10_3;
                        this.L$6 = ((com.lele.llmonitor.data.soc.LoadAvgResult) p51);
                        this.J$0 = v4_1;
                        this.J$1 = v6_6;
                        this.J$2 = v11_3;
                        this.I$0 = v14_6;
                        this.I$1 = v51_2;
                        this.label = 3;
                        v3_0 = v3_8.probeSocTemperatureC(this);
                        v1_1 = v16_2;
                        if (v3_0 != v1_1) {
                            v12_1 = v10_3;
                            v10_4 = v4_1;
                            v4_2 = v11_3;
                            v21 = v51_2;
                            v20_0 = v14_6;
                            v14_7 = v8_3;
                            v8_4 = ((com.lele.llmonitor.data.soc.LoadAvgResult) p51);
                            boolean v51_3 = ((com.lele.llmonitor.data.soc.TemperatureResult) v3_0);
                            Object v3_12 = com.lele.llmonitor.data.soc.SocRepository.access$getDataSource$p(this.this$0).probeMemoryInfo();
                            if ((v14_7.isEmpty()) || ((v4_2 - v10_4) >= 2500)) {
                                v14_7 = com.lele.llmonitor.data.soc.SocRepository.access$getDataSource$p(this.this$0).readCpuCoreFrequencies();
                                v10_4 = v4_2;
                            }
                            int v37_0 = v14_7;
                            java.util.List v14_8 = v13_5.getModelName();
                            if ((v14_8 != null) && ((!hh3.w0(v14_8)) && ((v4_2 - v6_6) < 300000))) {
                                v6_5 = v13_5;
                                v13_0 = v6_6;
                            } else {
                                v6_5 = com.lele.llmonitor.data.soc.SocRepository.access$getDataSource$p(this.this$0).probeCpuModel();
                                v13_0 = v4_2;
                            }
                            com.lele.llmonitor.data.soc.SocSnapshot v22_1;
                            int v9_6;
                            com.lele.llmonitor.data.soc.SocSnapshot v12_2 = new com.lele.llmonitor.data.soc.SocSnapshot(System.currentTimeMillis(), v12_1.getUsagePercent(), v20_0, v21, v8_4.getLoadAvg1(), v8_4.getLoadAvg5(), v8_4.getLoadAvg15(), v51_3.getTemperatureC(), v51_3.getTemperatureFractionDigits(), v51_3.getSelectedZone(), v12_1.getProbes(), v8_4.getProbes(), v51_3.getProbes(), v3_12.getTotalBytes(), v3_12.getAvailableBytes(), v3_12.getProbes(), v6_5.getModelName(), v6_5.getProbes(), v51_3.getZones(), v37_0);
                            int v8_6 = v20_0;
                            v3_1 = v21;
                            v7_1 = v37_0;
                            if (v9_5 == 0) {
                                v22_1 = v9_5;
                                v9_6 = 0;
                            } else {
                                v22_1 = v9_5;
                                v9_6 = com.lele.llmonitor.data.soc.SocSnapshot.copy$default(v22_1, v12_2.getTimestamp(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048574, 0);
                            }
                            boolean v51_4 = ni1.o(v9_6, v12_2);
                            v9_1 = (v51_4 ^ 1);
                            if (v51_4) {
                                v12_0 = v10_4;
                                v17_2 = v3_1;
                                v3_3 = v15_3;
                                v15_1 = v22_1;
                                v16_11 = v8_6;
                                v10_1 = v13_0;
                                v14_1 = v7_1;
                                java.util.List v7_4 = this.$intervalMs;
                                this.L$0 = v2_0;
                                this.L$1 = v3_3;
                                this.L$2 = v15_1;
                                this.L$3 = v14_1;
                                this.L$4 = v6_5;
                                v18_0 = v2_0;
                                this.L$5 = 0;
                                this.L$6 = 0;
                                this.L$7 = 0;
                                this.L$8 = 0;
                                this.L$9 = 0;
                                this.J$0 = v12_0;
                                this.J$1 = v10_1;
                                this.J$2 = v4_2;
                                this.I$0 = v16_11;
                                this.I$1 = v17_2;
                                this.I$2 = v9_1;
                                this.label = 5;
                                if (n54.r(v7_4, this) != v1_1) {
                                    v7_2 = v6_5;
                                    v5_0 = v12_0;
                                    v8_3 = v14_1;
                                    v9_0 = v1_1;
                                    v2_10 = v3_3;
                                    v3_5 = v10_1;
                                    v10_2 = v15_1;
                                    v1_4 = v18_0;
                                }
                            } else {
                                this.L$0 = v2_0;
                                this.L$1 = v15_3;
                                int v16_12 = v15_3;
                                this.L$2 = 0;
                                this.L$3 = v7_1;
                                this.L$4 = v6_5;
                                this.L$5 = 0;
                                this.L$6 = 0;
                                this.L$7 = 0;
                                this.L$8 = 0;
                                this.L$9 = v12_2;
                                this.J$0 = v10_4;
                                this.J$1 = v13_0;
                                this.J$2 = v4_2;
                                this.I$0 = v8_6;
                                this.I$1 = v3_1;
                                this.I$2 = v9_1;
                                this.label = 4;
                                if (v2_0.emit(v12_2, this) != v1_1) {
                                    v15_1 = v12_2;
                                    v10_0 = v8_6;
                                    v11_0 = v4_2;
                                    v4_0 = v10_4;
                                    v8_2 = v16_12;
                                    v17_2 = v3_1;
                                    v3_3 = v8_2;
                                    v16_11 = v10_0;
                                    v12_0 = v4_0;
                                    v4_2 = v11_0;
                                    v14_1 = v7_1;
                                    v10_1 = v13_0;
                                }
                            }
                        }
                    }
                } else {
                    v1_1 = v9_0;
                }
            }
        } else {
            if (v2_17 == 1) {
                int v16_3 = v1_5;
                com.lele.llmonitor.data.soc.LoadAvgResult v1_9 = this.J$2;
                v3_5 = this.J$1;
                v5_0 = this.J$0;
                v7_2 = ((com.lele.llmonitor.data.soc.CpuModelResult) this.L$4);
                v8_3 = ((java.util.List) this.L$3);
                v10_2 = ((com.lele.llmonitor.data.soc.SocSnapshot) this.L$2);
                int v11_5 = ((com.lele.llmonitor.data.soc.CpuTimes) this.L$1);
                ib1.Q(p51);
                v2_10 = v11_5;
                v11_3 = v1_9;
                v13_3 = p51;
                v1_4 = v16_3;
            } else {
                if (v2_17 == 2) {
                    int v16_13 = v1_5;
                    com.lele.llmonitor.data.soc.LoadAvgResult v1_12 = this.I$1;
                    com.lele.llmonitor.data.soc.LoadAvgResult v2_19 = this.I$0;
                    Object v3_14 = this.J$2;
                    Object v5_2 = this.J$1;
                    java.util.List v7_5 = this.J$0;
                    v10_3 = ((com.lele.llmonitor.data.soc.CpuUsageResult) this.L$5);
                    int v11_7 = ((com.lele.llmonitor.data.soc.CpuModelResult) this.L$4);
                    com.lele.llmonitor.data.soc.SocSnapshot v12_4 = ((java.util.List) this.L$3);
                    com.lele.llmonitor.data.soc.CpuModelResult v13_8 = ((com.lele.llmonitor.data.soc.SocSnapshot) this.L$2);
                    java.util.List v14_12 = ((com.lele.llmonitor.data.soc.CpuTimes) this.L$1);
                    ib1.Q(p51);
                    v15_3 = v14_12;
                    v14_6 = v2_19;
                    v2_0 = v16_13;
                    v16_2 = v9_0;
                    v9_5 = v13_8;
                    v13_5 = v11_7;
                    v3_6 = v1_12;
                    v8_3 = v12_4;
                    v11_3 = v3_14;
                    v6_6 = v5_2;
                    v4_1 = v7_5;
                } else {
                    if (v2_17 == 3) {
                        com.lele.llmonitor.data.soc.LoadAvgResult v2_20 = this.I$1;
                        Object v3_15 = this.I$0;
                        v4_2 = this.J$2;
                        v6_6 = this.J$1;
                        v10_4 = this.J$0;
                        v8_4 = ((com.lele.llmonitor.data.soc.LoadAvgResult) this.L$6);
                        v12_1 = ((com.lele.llmonitor.data.soc.CpuUsageResult) this.L$5);
                        v13_5 = ((com.lele.llmonitor.data.soc.CpuModelResult) this.L$4);
                        v14_7 = ((java.util.List) this.L$3);
                        com.lele.llmonitor.data.soc.SocSnapshot v15_8 = ((com.lele.llmonitor.data.soc.SocSnapshot) this.L$2);
                        int v16_14 = v1_5;
                        com.lele.llmonitor.data.soc.LoadAvgResult v1_14 = ((com.lele.llmonitor.data.soc.CpuTimes) this.L$1);
                        ib1.Q(p51);
                        v15_3 = v1_14;
                        v1_1 = v9_0;
                        v9_5 = v15_8;
                        v21 = v2_20;
                        v20_0 = v3_15;
                        v2_0 = v16_14;
                        v3_0 = p51;
                    } else {
                        if (v2_17 == 4) {
                            com.lele.llmonitor.data.soc.LoadAvgResult v2_1 = this.I$2;
                            v3_1 = this.I$1;
                            v10_0 = this.I$0;
                            v11_0 = this.J$2;
                            v13_0 = this.J$1;
                            v4_0 = this.J$0;
                            v15_1 = ((com.lele.llmonitor.data.soc.SocSnapshot) this.L$9);
                            int v6 = ((com.lele.llmonitor.data.soc.TemperatureResult) this.L$7);
                            v6 = ((com.lele.llmonitor.data.soc.CpuUsageResult) this.L$5);
                            v6_5 = ((com.lele.llmonitor.data.soc.CpuModelResult) this.L$4);
                            v7_1 = ((java.util.List) this.L$3);
                            v8_2 = ((com.lele.llmonitor.data.soc.CpuTimes) this.L$1);
                            ib1.Q(p51);
                            v2_0 = v1_5;
                            v1_1 = v9_0;
                            v9_1 = v2_1;
                        } else {
                            if (v2_17 != 5) {
                                h.m("call to \'resume\' before \'invoke\' with coroutine");
                                return 0;
                            } else {
                                v10_1 = this.J$1;
                                v12_0 = this.J$0;
                                com.lele.llmonitor.data.soc.LoadAvgResult v2 = ((com.lele.llmonitor.data.soc.MemoryInfoResult) this.L$8);
                                v2 = ((com.lele.llmonitor.data.soc.LoadAvgResult) this.L$6);
                                com.lele.llmonitor.data.soc.LoadAvgResult v2_9 = ((com.lele.llmonitor.data.soc.CpuModelResult) this.L$4);
                                v14_1 = ((java.util.List) this.L$3);
                                v15_1 = ((com.lele.llmonitor.data.soc.SocSnapshot) this.L$2);
                                v3_3 = ((com.lele.llmonitor.data.soc.CpuTimes) this.L$1);
                                ib1.Q(p51);
                                v18_0 = v1_5;
                                v7_2 = v2_9;
                                v1_1 = v9_0;
                            }
                        }
                    }
                }
            }
        }
        return v1_1;
    }
}
