package com.lele.llmonitor.service;
final class BatteryMonitorService$startHealthWatchdog$1 extends jj3 implements h11 {
    private synthetic Object L$0;
    int label;
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$startHealthWatchdog$1(com.lele.llmonitor.service.BatteryMonitorService p1, n60 p2)
    {
        this.this$0 = p1;
        super(2, p2);
        return;
    }

    public final n60 create(Object p2, n60 p3)
    {
        com.lele.llmonitor.service.BatteryMonitorService$startHealthWatchdog$1 v0_1 = new com.lele.llmonitor.service.BatteryMonitorService$startHealthWatchdog$1(this.this$0, p3);
        v0_1.L$0 = p2;
        return v0_1;
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.service.BatteryMonitorService$startHealthWatchdog$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p11)
    {
        d80 v0_1 = ((d80) this.L$0);
        int v1_3 = this.label;
        if (v1_3 == 0) {
            ib1.Q(p11);
        } else {
            if (v1_3 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                ib1.Q(p11);
                if (com.lele.llmonitor.service.BatteryMonitorService.access$isMonitorLoopStarted$p(this.this$0)) {
                    d80 v11_5 = this.this$0.registerReceiver(0, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    int v1_4 = 0;
                    if (v11_5 != null) {
                        v1_4 = v11_5.getIntExtra("plugged", 0);
                    }
                    com.lele.llmonitor.service.BatteryMonitorService$startHealthWatchdog$1$1 v4_4;
                    d80 v11_7 = this.this$0.getSystemService("power");
                    v11_7.getClass();
                    d80 v11_8 = ((android.os.PowerManager) v11_7);
                    if (v1_4 == 0) {
                        if (!v11_8.isInteractive()) {
                            v4_4 = ((Number) com.lele.llmonitor.data.SettingsManager.INSTANCE.getRefreshRateNotifyNotChargingScreenOff().getValue()).longValue();
                        } else {
                            v4_4 = ((Number) com.lele.llmonitor.data.SettingsManager.INSTANCE.getRefreshRateNotifyNotCharging().getValue()).longValue();
                        }
                    } else {
                        if (!v11_8.isInteractive()) {
                            v4_4 = ((Number) com.lele.llmonitor.data.SettingsManager.INSTANCE.getRefreshRateNotifyChargingScreenOff().getValue()).longValue();
                        } else {
                            v4_4 = ((Number) com.lele.llmonitor.data.SettingsManager.INSTANCE.getRefreshRateNotifyCharging().getValue()).longValue();
                        }
                    }
                    com.lele.llmonitor.service.BatteryMonitorService$startHealthWatchdog$1$1 v4_5 = (v4_4 * 3);
                    if (v4_5 < 15000) {
                        v4_5 = 15000;
                    }
                    if ((android.os.SystemClock.elapsedRealtime() - com.lele.llmonitor.service.BatteryMonitorService.access$getLastVisualPublishElapsedMs$p(this.this$0)) >= v4_5) {
                        com.lele.llmonitor.service.BatteryMonitorService.access$requestImmediateUpdate(this.this$0);
                        xt3.I(com.lele.llmonitor.service.BatteryMonitorService.access$getServiceScope$p(this.this$0), 0, 0, new com.lele.llmonitor.service.BatteryMonitorService$startHealthWatchdog$1$1(this.this$0, v1_4, 0), 3);
                    }
                }
            }
        }
        if (!r7.I(v0_1)) {
            return bw3.a;
        } else {
            this.L$0 = v0_1;
            this.label = 1;
            int v1_0 = e80.d;
            if (n54.r(30000, this) != v1_0) {
            } else {
                return v1_0;
            }
        }
    }
}
