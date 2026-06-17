package com.lele.llmonitor.service;
public final class BatteryMonitorService extends android.app.Service {
    public static final int $stable = 0;
    public static final String ACTION_HEALTH_CHECK = "com.lele.llmonitor.ACTION_HEALTH_CHECK";
    public static final String ACTION_KEEP_ALIVE_KICK = "com.lele.llmonitor.ACTION_KEEP_ALIVE_KICK";
    private static final String ACTION_LIVE_NOTIFICATION_CLOSE_ONCE = "com.lele.llmonitor.ACTION_LIVE_NOTIFICATION_CLOSE_ONCE";
    private static final String ACTION_NOTIFICATION_DISMISSED = "com.lele.llmonitor.ACTION_NOTIFICATION_DISMISSED";
    private static final String CHANNEL_ID = "battery_monitor";
    public static final com.lele.llmonitor.service.BatteryMonitorService$Companion Companion = None;
    private static final long DB_CLEANUP_INTERVAL_MS = 10000;
    private static final String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";
    private static final long HEALTH_CHECK_INTERVAL_MS = 60000;
    private static final int HEALTH_CHECK_REQUEST_CODE = 20260307;
    private static final long HEALTH_STALE_FLOOR_MS = 15000;
    private static final long KEEP_ALIVE_INTERVAL_MS = 120000;
    private static final int KEEP_ALIVE_REQUEST_CODE = 20260306;
    private static final String LIVE_CHANNEL_ID = "battery_live_update_v2";
    private static final long LIVE_OFF_GRACE_MS = 5000;
    private static final int NOTIFICATION_ID = 1;
    private static final int SECONDARY_NOTIFICATION_ID = 2;
    private static final long STARTUP_WIDGET_DEFER_MS = 8000;
    private static final long VISUAL_UPDATE_TIMEOUT_MS = 2500;
    private static volatile boolean isRunning;
    private com.lele.llmonitor.data.local.AppDatabase db;
    private final z52 dependencyInitMutex;
    private int designCapacity;
    private final com.lele.llmonitor.service.BatteryMonitorService$forceUpdateReceiver$1 forceUpdateReceiver;
    private pj1 healthWatchdogJob;
    private boolean isForceUpdateReceiverRegistered;
    private boolean isForegroundActive;
    private boolean isLiveForegroundArmed;
    private boolean isLiveSuppressedForCurrentSession;
    private boolean isMonitorLoopStarted;
    private int lastBatteryTempFractionDigits;
    private long lastLiveEligibleTime;
    private long lastVisualPublishElapsedMs;
    private final d80 serviceScope;
    private long serviceStartElapsedMs;
    private final vt updateTrigger;
    private final com.lele.llmonitor.service.VisualRefreshScheduler visualRefreshScheduler;
    private android.os.PowerManager$WakeLock wakeLock;

    static BatteryMonitorService()
    {
        com.lele.llmonitor.service.BatteryMonitorService.Companion = new com.lele.llmonitor.service.BatteryMonitorService$Companion(0);
        com.lele.llmonitor.service.BatteryMonitorService.$stable = 8;
        return;
    }

    public BatteryMonitorService()
    {
        com.lele.llmonitor.service.BatteryMonitorService$forceUpdateReceiver$1 v0_4 = bd0.f;
        com.lele.llmonitor.service.VisualRefreshScheduler v1_3 = id1.g();
        v0_4.getClass();
        this.serviceScope = r7.b(ix2.P(v0_4, v1_3));
        this.dependencyInitMutex = new b62();
        this.updateTrigger = ix2.f(-1, 6, 0);
        this.visualRefreshScheduler = new com.lele.llmonitor.service.VisualRefreshScheduler(0, 0, 3, 0);
        this.lastBatteryTempFractionDigits = 1;
        this.forceUpdateReceiver = new com.lele.llmonitor.service.BatteryMonitorService$forceUpdateReceiver$1(this);
        return;
    }

    public static final synthetic Object access$ensureDependenciesInitialized(com.lele.llmonitor.service.BatteryMonitorService p0, n60 p1)
    {
        return p0.ensureDependenciesInitialized(p1);
    }

    public static final synthetic Object access$forceImmediateNotificationRefresh(com.lele.llmonitor.service.BatteryMonitorService p0, Integer p1, n60 p2)
    {
        return p0.forceImmediateNotificationRefresh(p1, p2);
    }

    public static final synthetic com.lele.llmonitor.data.local.AppDatabase access$getDb$p(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        return p0.db;
    }

    public static final synthetic int access$getDesignCapacity$p(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        return p0.designCapacity;
    }

    public static final synthetic int access$getLastBatteryTempFractionDigits$p(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        return p0.lastBatteryTempFractionDigits;
    }

    public static final synthetic long access$getLastVisualPublishElapsedMs$p(com.lele.llmonitor.service.BatteryMonitorService p2)
    {
        return p2.lastVisualPublishElapsedMs;
    }

    public static final synthetic d80 access$getServiceScope$p(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        return p0.serviceScope;
    }

    public static final synthetic vt access$getUpdateTrigger$p(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        return p0.updateTrigger;
    }

    public static final synthetic com.lele.llmonitor.service.VisualRefreshScheduler access$getVisualRefreshScheduler$p(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        return p0.visualRefreshScheduler;
    }

    public static final synthetic android.os.PowerManager$WakeLock access$getWakeLock$p(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        return p0.wakeLock;
    }

    public static final synthetic boolean access$isLiveSuppressedForCurrentSession$p(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        return p0.isLiveSuppressedForCurrentSession;
    }

    public static final synthetic boolean access$isMonitorLoopStarted$p(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        return p0.isMonitorLoopStarted;
    }

    public static final synthetic boolean access$isRunning$cp()
    {
        return com.lele.llmonitor.service.BatteryMonitorService.isRunning;
    }

    public static final synthetic Object access$publishVisuals(com.lele.llmonitor.service.BatteryMonitorService p0, com.lele.llmonitor.data.local.BatteryEntity p1, int p2, int p3, float p4, long p5, n60 p7)
    {
        return p0.publishVisuals(p1, p2, p3, p4, p5, p7);
    }

    public static final synthetic void access$requestImmediateUpdate(com.lele.llmonitor.service.BatteryMonitorService p0)
    {
        p0.requestImmediateUpdate();
        return;
    }

    public static final synthetic void access$setDb$p(com.lele.llmonitor.service.BatteryMonitorService p0, com.lele.llmonitor.data.local.AppDatabase p1)
    {
        p0.db = p1;
        return;
    }

    public static final synthetic void access$setDesignCapacity$p(com.lele.llmonitor.service.BatteryMonitorService p0, int p1)
    {
        p0.designCapacity = p1;
        return;
    }

    public static final synthetic void access$setLastBatteryTempFractionDigits$p(com.lele.llmonitor.service.BatteryMonitorService p0, int p1)
    {
        p0.lastBatteryTempFractionDigits = p1;
        return;
    }

    public static final synthetic void access$setLiveSuppressedForCurrentSession$p(com.lele.llmonitor.service.BatteryMonitorService p0, boolean p1)
    {
        p0.isLiveSuppressedForCurrentSession = p1;
        return;
    }

    public static final synthetic void access$setRunning$cp(boolean p0)
    {
        com.lele.llmonitor.service.BatteryMonitorService.isRunning = p0;
        return;
    }

    public static final synthetic void access$setWakeLock$p(com.lele.llmonitor.service.BatteryMonitorService p0, android.os.PowerManager$WakeLock p1)
    {
        p0.wakeLock = p1;
        return;
    }

    public static final synthetic Object access$updateWidget(com.lele.llmonitor.service.BatteryMonitorService p0, com.lele.llmonitor.data.local.BatteryEntity p1, float p2, n60 p3)
    {
        return p0.updateWidget(p1, p2, p3);
    }

    private final String buildNotificationContentText(int p7, String p8, float p9, float p10, String p11)
    {
        String v6_0 = r7.B();
        hv1 v0_0 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
        if (((Boolean) v0_0.getShowNotificationBatteryLevel().getValue()).booleanValue()) {
            String v1_1 = new StringBuilder();
            v1_1.append(p7);
            v1_1.append("%");
            v6_0.add(v1_1.toString());
        }
        if (((Boolean) v0_0.getShowNotificationSupply().getValue()).booleanValue()) {
            v6_0.add(p8);
        }
        if (((Boolean) v0_0.getShowNotificationVoltage().getValue()).booleanValue()) {
            v6_0.add(String.format("%.2f", java.util.Arrays.copyOf(new Object[] {Float.valueOf(p9)}), 1)).concat("V"));
        }
        if (((Boolean) v0_0.getShowNotificationCurrent().getValue()).booleanValue()) {
            String v8_5 = new StringBuilder();
            v8_5.append(((int) p10));
            v8_5.append("mA");
            v6_0.add(v8_5.toString());
        }
        if (((Boolean) v0_0.getShowNotificationTemperature().getValue()).booleanValue()) {
            String v7_28 = new StringBuilder();
            v7_28.append(p11);
            v7_28.append("\u2103");
            v6_0.add(v7_28.toString());
        }
        return yw.F0(r7.w(v6_0), " \u2022 ", 0, 0, 0, 62);
    }

    private final android.app.Notification createBootstrapNotification()
    {
        android.app.Notification v3_3 = new android.app.Notification$Builder(this, "battery_monitor").setSmallIcon(this.resolveNotificationSmallIconRes()).setContentTitle("LLMonitor").setContentText("Starting monitoring...").setOngoing(1).setOnlyAlertOnce(1).setContentIntent(this.createPendingIntent()).build();
        v3_3.getClass();
        return v3_3;
    }

    private final android.app.Notification createInitialNotification()
    {
        int v2_0;
        android.app.Notification$Builder v0_4 = this.registerReceiver(0, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        String v1_3 = 0;
        if (v0_4 == null) {
            v2_0 = 0;
        } else {
            v2_0 = v0_4.getIntExtra("level", 0);
        }
        android.app.Notification$ProgressStyle$Segment v3_0;
        if (v0_4 == null) {
            v3_0 = 0;
        } else {
            v3_0 = v0_4.getIntExtra("plugged", 0);
        }
        android.app.Notification$Builder v0_1;
        if (v0_4 == null) {
            v0_1 = 0;
        } else {
            v0_1 = v0_4.getIntExtra("temperature", 0);
        }
        int v4_1 = com.lele.llmonitor.data.BatteryEngine.INSTANCE;
        android.app.Notification$Builder v0_3 = v4_1.parseBatteryTemperature(v0_1);
        float v5 = v0_3.getCelsius();
        this.lastBatteryTempFractionDigits = v0_3.getFractionDigits();
        String v6_1 = this.resolveSupplyTextForNotification(v3_0);
        int v7_4 = ((Boolean) com.lele.llmonitor.data.SettingsManager.INSTANCE.isLiveNotificationEnabled().getValue()).booleanValue();
        if ((v3_0 != null) && ((v7_4 != 0) && (android.os.Build$VERSION.SDK_INT >= 36))) {
            v1_3 = 1;
        }
        android.app.Notification$ProgressStyle$Segment v3_3;
        if (v1_3 == null) {
            v3_3 = "battery_monitor";
        } else {
            v3_3 = "battery_live_update_v2";
        }
        int v7_5 = this.resolveNotificationSmallIconRes();
        android.app.Notification$Builder v10_1 = new android.app.Notification$Builder(this, v3_3);
        if (v1_3 != null) {
            v7_5 = com.lele.llmonitor.R$drawable.ic_bolt;
        }
        String v1_5 = v10_1.setSmallIcon(v7_5).setContentTitle("--W");
        android.app.Notification$Builder v0_6 = v4_1.formatTemperatureC(v5, v0_3.getFractionDigits());
        android.app.Notification$ProgressStyle$Segment v3_6 = new StringBuilder();
        v3_6.append(v2_0);
        v3_6.append("% \u2022 ");
        v3_6.append(v6_1);
        v3_6.append(" \u2022 ");
        v3_6.append(v0_6);
        v3_6.append("\u2103");
        android.app.Notification$Builder v0_12 = v1_5.setContentText(v3_6.toString()).setOngoing(int v9).setOnlyAlertOnce(1).setContentIntent(this.createPendingIntent());
        v0_12.getClass();
        if (android.os.Build$VERSION.SDK_INT >= 36) {
            android.app.Notification v11_2 = tl.f(tl.g(tl.e(), tl.d(tl.c(), this.getColor(17170469))), v2_0);
            v11_2.getClass();
            v0_12.setStyle(v11_2);
            android.app.Notification v11_3 = new android.os.Bundle;
            v11_3();
            v11_3.putBoolean("android.requestPromotedOngoing", 1);
            v0_12.addExtras(v11_3);
        }
        android.app.Notification v11_4 = v0_12.build();
        v11_4.getClass();
        return v11_4;
    }

    private final void createNotificationChannel()
    {
        android.app.NotificationChannel v0_1 = new android.app.NotificationChannel("battery_monitor", com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7535\u6c60\u76d1\u63a7\u540e\u53f0\u670d\u52a1"), 2);
        v0_1.setDescription(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u663e\u793a\u5b9e\u65f6\u5145\u7535\u529f\u7387\uff08\u9759\u9ed8\u901a\u77e5\uff0c\u4e0d\u4f1a\u6253\u6270\uff09"));
        v0_1.setShowBadge(0);
        v0_1.enableVibration(0);
        v0_1.enableLights(0);
        v0_1.setSound(0, 0);
        v0_1.setLockscreenVisibility(1);
        android.app.NotificationChannel v4_1 = new android.app.NotificationChannel("battery_live_update_v2", com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5b9e\u65f6\u6d3b\u52a8 (\u7075\u52a8\u5c9b)"), 3);
        v4_1.setDescription(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5145\u7535\u65f6\u663e\u793a\u7075\u52a8\u5c9b\u98ce\u683c\u7684\u5b9e\u51b5\u901a\u77e5"));
        v4_1.setShowBadge(0);
        v4_1.enableVibration(0);
        v4_1.enableLights(0);
        v4_1.setSound(0, 0);
        v4_1.setLockscreenVisibility(1);
        android.app.NotificationManager v8_2 = ((android.app.NotificationManager) this.getSystemService(android.app.NotificationManager));
        v8_2.createNotificationChannel(v0_1);
        v8_2.createNotificationChannel(v4_1);
        return;
    }

    private final android.app.PendingIntent createPendingIntent()
    {
        android.app.PendingIntent v3_1 = android.app.PendingIntent.getActivity(this, 0, new android.content.Intent(this, com.lele.llmonitor.ui.MainActivity), 67108864);
        v3_1.getClass();
        return v3_1;
    }

    private final Object ensureDependenciesInitialized(n60 p11)
    {
        com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$1 v0_2;
        if (!(p11 instanceof com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$1)) {
            v0_2 = new com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$1(this, p11);
        } else {
            v0_2 = ((com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$1) p11);
            int v1_4 = ((com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$1) p11).label;
            if ((v1_4 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$1) p11).label = (v1_4 - -2147483648);
            }
        }
        int v1_3;
        Throwable v10_3;
        Throwable v11_4;
        Throwable v11_1 = v0_2.result;
        int v1_1 = v0_2.label;
        bw3 v5 = bw3.a;
        e80 v7 = e80.d;
        if (v1_1 == 0) {
            ib1.Q(v11_1);
            if ((this.db == null) || (this.designCapacity <= 0)) {
                v11_4 = this.dependencyInitMutex;
                v0_2.L$0 = v11_4;
                v0_2.I$0 = 0;
                v0_2.label = 1;
                if (v11_4.e(v0_2) != v7) {
                    v1_3 = 0;
                    try {
                        if ((this.db == null) || (this.designCapacity <= 0)) {
                            com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$2$1 v8_1 = new com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$2$1(this, 0);
                            v0_2.L$0 = v11_4;
                            v0_2.I$0 = v1_3;
                            v0_2.I$1 = 0;
                            v0_2.label = 2;
                            if (xt3.k0(bd0.f, v8_1, v0_2) != v7) {
                                v10_3 = v11_4;
                            } else {
                                return v7;
                            }
                        } else {
                            v11_4.d(0);
                            return v5;
                        }
                    } catch (Throwable v10_2) {
                        Throwable v11_5 = v10_2;
                        v10_3 = v11_4;
                        v10_3.d(0);
                        throw v11_5;
                    }
                }
            } else {
                return v5;
            }
        } else {
            if (v1_1 == 1) {
                v1_3 = v0_2.I$0;
                bd0 v4_2 = ((z52) v0_2.L$0);
                ib1.Q(v11_1);
                v11_4 = v4_2;
            } else {
                if (v1_1 != 2) {
                    h.m("call to \'resume\' before \'invoke\' with coroutine");
                    return 0;
                } else {
                    v10_3 = ((z52) v0_2.L$0);
                    try {
                        ib1.Q(v11_1);
                    } catch (Throwable v11_5) {
                    }
                }
            }
        }
        v10_3.d(0);
        return v5;
    }

    private final Object forceImmediateNotificationRefresh(Integer p30, n60 p31)
    {
        float v2_1;
        if (!(p31 instanceof com.lele.llmonitor.service.BatteryMonitorService$forceImmediateNotificationRefresh$1)) {
            v2_1 = new com.lele.llmonitor.service.BatteryMonitorService$forceImmediateNotificationRefresh$1(this, p31);
        } else {
            v2_1 = ((com.lele.llmonitor.service.BatteryMonitorService$forceImmediateNotificationRefresh$1) p31);
            float v3_14 = ((com.lele.llmonitor.service.BatteryMonitorService$forceImmediateNotificationRefresh$1) p31).label;
            if ((v3_14 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.service.BatteryMonitorService$forceImmediateNotificationRefresh$1) p31).label = (v3_14 - -2147483648);
            }
        }
        int v12;
        int v10_2;
        com.lele.llmonitor.data.local.BatteryEntity v1_2;
        int v11_0;
        int v15;
        com.lele.llmonitor.data.local.BatteryEntity v1_3;
        float v2_2;
        int v14;
        boolean v4_3;
        float v13;
        float v9_1;
        float v5_0;
        com.lele.llmonitor.service.BatteryMonitorService$forceImmediateNotificationRefresh$1 v7 = v2_1;
        com.lele.llmonitor.data.local.BatteryEntity v1_1 = v7.result;
        float v2_3 = v7.label;
        float v5_1 = 1;
        e80 v8 = e80.d;
        try {
            if (v2_3 == 0) {
                ib1.Q(v1_1);
                v1_3 = p30;
                v7.L$0 = p30;
                v7.label = 1;
                if (this.ensureDependenciesInitialized(v7) != v8) {
                    float v9_2;
                    float v2_13 = this.registerReceiver(0, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    float v3_13 = -1;
                    if (v2_13 == 0) {
                        v9_2 = 0;
                    } else {
                        v9_2 = v2_13.getIntExtra("level", -1);
                    }
                    if (v2_13 == 0) {
                        v14 = 0;
                    } else {
                        v14 = v2_13.getIntExtra("temperature", 0);
                    }
                    int v10_5 = com.lele.llmonitor.data.BatteryEngine.INSTANCE;
                    int v11_1 = v10_5.parseBatteryTemperature(v14);
                    float v26 = v11_1.getCelsius();
                    this.lastBatteryTempFractionDigits = v11_1.getFractionDigits();
                    if (v2_13 != 0) {
                        v3_13 = v2_13.getIntExtra("status", -1);
                    }
                    com.lele.llmonitor.data.local.BatteryEntity v1_5;
                    v12 = v3_13;
                    if (v1_3 == null) {
                        if (v2_13 == 0) {
                            v11_0 = 0;
                        } else {
                            v1_5 = v2_13.getIntExtra("plugged", 0);
                            v11_0 = v1_5;
                        }
                    } else {
                        v1_5 = v1_3.intValue();
                    }
                    if (v12 != 2) {
                        if (v12 != 5) {
                            v5_1 = 0;
                        } else {
                        }
                    }
                    float v3_0;
                    com.lele.llmonitor.data.local.BatteryEntity v1_7 = this.getApplicationContext();
                    v1_7.getClass();
                    com.lele.llmonitor.data.local.BatteryEntity v1_8 = v10_5.getCurrentMa(v1_7);
                    float v24 = v10_5.sanitizeCurrentReading(v1_8, v9_2, v12, v11_0);
                    float v2_18 = ((Boolean) com.lele.llmonitor.data.SettingsManager.INSTANCE.isVirtualVoltageEnabled().getValue()).booleanValue();
                    if (v2_18 == 0) {
                        float v3_15 = this.getApplicationContext();
                        v3_15.getClass();
                        v3_0 = v10_5.getVoltageV(v3_15);
                    } else {
                        float v3_1 = this.getApplicationContext();
                        v3_1.getClass();
                        float v3_2 = v10_5.getBatteryDesignCapacity(v3_1);
                        com.lele.llmonitor.data.local.BatteryEntity v6_0 = this.getApplicationContext();
                        v6_0.getClass();
                        v3_0 = v10_5.getVirtualVoltage(v10_5.getBatteryCurrentCapacity(v6_0), v3_2, v5_1);
                    }
                    float v23 = v3_0;
                    int v22 = v9_2;
                    com.lele.llmonitor.data.local.BatteryEntity v6_2 = new com.lele.llmonitor.data.local.BatteryEntity(0, System.currentTimeMillis(), v22, v23, v24, ((v24 / 1148846080) * v23), v26, 1, 0);
                    v15 = v22;
                    float v3_6 = v23;
                    float v9_0 = v24;
                    v13 = v26;
                    int v10_0 = this.db;
                    if (v10_0 == 0) {
                        ni1.U("db");
                        throw 0;
                    } else {
                        int v10_1 = v10_0.batteryDao();
                        v7.L$0 = 0;
                        v7.L$1 = 0;
                        v7.L$2 = 0;
                        v7.L$3 = v6_2;
                        v7.I$0 = v15;
                        v7.I$1 = v14;
                        v7.F$0 = v13;
                        v7.I$2 = v12;
                        v7.I$3 = v11_0;
                        v7.I$4 = v5_1;
                        v7.F$1 = v1_8;
                        v7.F$2 = v9_0;
                        v7.Z$0 = v2_18;
                        v7.F$3 = v3_6;
                        v7.label = 2;
                        if (v10_1.insert(v6_2, v7) != v8) {
                            v4_3 = v2_18;
                            v2_2 = v3_6;
                            v10_2 = v5_1;
                            v5_0 = v9_0;
                            v9_1 = v1_8;
                            v1_2 = v6_2;
                            float v3_10 = v11_0;
                            com.lele.llmonitor.data.local.BatteryEntity v17_2 = android.os.SystemClock.elapsedRealtime();
                            v7.L$0 = 0;
                            v7.L$1 = 0;
                            v7.L$2 = 0;
                            v7.L$3 = 0;
                            v7.I$0 = v15;
                            v7.I$1 = v14;
                            v7.F$0 = v13;
                            v7.I$2 = v12;
                            v7.I$3 = v3_10;
                            v7.I$4 = v10_2;
                            v7.F$1 = v9_1;
                            v7.F$2 = v5_0;
                            v7.Z$0 = v4_3;
                            v7.F$3 = v2_2;
                            v7.label = 3;
                            if (this.publishVisuals(v1_2, v15, v3_10, v13, v17_2, v7) == v8) {
                                return v8;
                            }
                        } else {
                            return v8;
                        }
                    }
                } else {
                    return v8;
                }
            } else {
                if (v2_3 == 1) {
                    float v2_9 = ((Integer) v7.L$0);
                    ib1.Q(v1_1);
                    v1_3 = v2_9;
                } else {
                    if (v2_3 == 2) {
                        v2_2 = v7.F$3;
                        v4_3 = v7.Z$0;
                        v5_0 = v7.F$2;
                        v9_1 = v7.F$1;
                        v10_2 = v7.I$4;
                        v11_0 = v7.I$3;
                        v12 = v7.I$2;
                        v13 = v7.F$0;
                        v14 = v7.I$1;
                        v15 = v7.I$0;
                        float v3_9 = ((com.lele.llmonitor.data.local.BatteryEntity) v7.L$3);
                        com.lele.llmonitor.data.local.BatteryEntity v6 = ((android.content.Intent) v7.L$1);
                        ib1.Q(v1_1);
                        v1_2 = v3_9;
                    } else {
                        if (v2_3 != 3) {
                            h.m("call to \'resume\' before \'invoke\' with coroutine");
                            return 0;
                        } else {
                            String v0 = ((com.lele.llmonitor.data.BatteryEngine$BatteryTemperatureReading) v7.L$2);
                            v0 = ((Integer) v7.L$0);
                            ib1.Q(v1_1);
                        }
                    }
                }
            }
        } catch (String v0_8) {
            v0_8.printStackTrace();
        }
        return bw3.a;
    }

    public static synthetic Object forceImmediateNotificationRefresh$default(com.lele.llmonitor.service.BatteryMonitorService p0, Integer p1, n60 p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = 0;
        }
        return p0.forceImmediateNotificationRefresh(p1, p2);
    }

    private final void handleNormalNotificationDismiss()
    {
        com.lele.llmonitor.data.SettingsManager v2_1;
        com.lele.llmonitor.data.SettingsManager v2_4 = this.registerReceiver(0, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (v2_4 == null) {
            v2_1 = 0;
        } else {
            v2_1 = v2_4.getIntExtra("plugged", 0);
        }
        if (v2_1 == null) {
            com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleShowNotificationWhenNotCharging(0);
            return;
        } else {
            com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleNotificationEnabled(0);
            return;
        }
    }

    private final Object publishVisuals(com.lele.llmonitor.data.local.BatteryEntity p17, int p18, int p19, float p20, long p21, n60 p23)
    {
        e80 v5_1;
        long v3 = p21;
        if (!(p23 instanceof com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$1)) {
            v5_1 = new com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$1(this, p23);
        } else {
            v5_1 = ((com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$1) p23);
            long v6_8 = ((com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$1) p23).label;
            if ((v6_8 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$1) p23).label = (v6_8 - -2147483648);
            }
        }
        Object v0_5;
        int v2_2;
        Object v0_0 = v5_1.result;
        long v6_1 = v5_1.label;
        int v8_1 = 0;
        bw3 v9 = bw3.a;
        if (v6_1 == 0) {
            ib1.Q(v0_0);
            try {
                this.updateNotification(p17, p18, p19);
                long v6_2 = v9;
            } catch (Object v0_1) {
                v6_2 = new cw2(v0_1);
            }
            Object v0_3 = dw2.a(v6_2);
            if (v0_3 != null) {
                v0_3.printStackTrace();
            }
            long v6_6;
            v0_5 = ((v6_2 instanceof cw2) ^ 1);
            com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$widgetUpdated$1 v11_0 = this.serviceStartElapsedMs;
            if ((v11_0 <= 0) || ((p21 - v11_0) >= 8000)) {
                v6_6 = 0;
            } else {
                v6_6 = 1;
            }
            if (v6_6 == 0) {
                com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$widgetUpdated$1 v11_3 = new com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$widgetUpdated$1(this, p17, p20, 0);
                v5_1.L$0 = 0;
                v5_1.I$0 = p18;
                v5_1.I$1 = p19;
                v5_1.F$0 = p20;
                v5_1.J$0 = p21;
                v5_1.Z$0 = v0_5;
                v5_1.I$2 = v6_6;
                v5_1.label = 1;
                int v2_1 = vc1.d0(2500, v11_3, v5_1);
                e80 v5_4 = e80.d;
                if (v2_1 != v5_4) {
                    v2_2 = v0_5;
                    v0_0 = v2_1;
                    Object v0_7 = ((Boolean) v0_0);
                    if (v0_7 != null) {
                        v8_1 = v0_7.booleanValue();
                    }
                    v0_5 = v2_2;
                } else {
                    return v5_4;
                }
            } else {
                v8_1 = 1;
            }
        } else {
            if (v6_1 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                v2_2 = v5_1.Z$0;
                v3 = v5_1.J$0;
                ib1.Q(v0_0);
            }
        }
        if ((v0_5 != null) || (v8_1 != 0)) {
            this.lastVisualPublishElapsedMs = v3;
        }
        this.visualRefreshScheduler.onPublishResult(v3, v0_5, v8_1);
        return v9;
    }

    private final void requestImmediateUpdate()
    {
        this.visualRefreshScheduler.onExternalTrigger();
        this.updateTrigger.l(bw3.a);
        return;
    }

    private final int resolveNotificationSmallIconRes()
    {
        com.lele.llmonitor.data.FollowSystemAppIconMode v0_0 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
        return com.lele.llmonitor.data.AppIconPaletteManager.INSTANCE.resolveExpectedForegroundIconRes(((Number) v0_0.getThemeMode().getValue()).intValue(), ((com.lele.llmonitor.ui.theme.ThemePalettePreset) v0_0.getThemePalettePreset().getValue()), ((com.lele.llmonitor.data.FollowSystemAppIconMode) v0_0.getFollowSystemAppIconMode().getValue()));
    }

    private final String resolveSupplyTextForNotification(int p1)
    {
        if (p1 == 1) {
            return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7535\u6e90\u9002\u914d\u5668");
        } else {
            if (p1 == 2) {
                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7535\u8111 (USB)");
            } else {
                if (p1 == 4) {
                    return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u65e0\u7ebf\u5145\u7535");
                } else {
                    return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7535\u6c60\u4f9b\u7535");
                }
            }
        }
    }

    private final void scheduleNextHealthCheckKick(long p5)
    {
        try {
            android.app.AlarmManager v0_1 = this.getSystemService("alarm");
            v0_1.getClass();
            android.app.AlarmManager v0_2 = ((android.app.AlarmManager) v0_1);
            long v1_0 = new android.content.Intent(this, com.lele.llmonitor.service.BatteryMonitorService).setAction("com.lele.llmonitor.ACTION_HEALTH_CHECK");
            v1_0.getClass();
            android.app.PendingIntent v4_1 = android.app.PendingIntent.getForegroundService(this, 20260307, v1_0, 201326592);
            v0_2.cancel(v4_1);
            v0_2.setAndAllowWhileIdle(2, (android.os.SystemClock.elapsedRealtime() + p5), v4_1);
        } catch (Exception) {
        }
        return;
    }

    public static synthetic void scheduleNextHealthCheckKick$default(com.lele.llmonitor.service.BatteryMonitorService p0, long p1, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = 60000;
        }
        p0.scheduleNextHealthCheckKick(p1);
        return;
    }

    private final void scheduleNextKeepAliveKick(long p5)
    {
        try {
            android.app.AlarmManager v0_1 = this.getSystemService("alarm");
            v0_1.getClass();
            android.app.AlarmManager v0_2 = ((android.app.AlarmManager) v0_1);
            long v1_0 = new android.content.Intent(this, com.lele.llmonitor.service.BatteryMonitorService).setAction("com.lele.llmonitor.ACTION_KEEP_ALIVE_KICK");
            v1_0.getClass();
            android.app.PendingIntent v4_1 = android.app.PendingIntent.getForegroundService(this, 20260306, v1_0, 201326592);
            v0_2.cancel(v4_1);
            v0_2.setAndAllowWhileIdle(2, (android.os.SystemClock.elapsedRealtime() + p5), v4_1);
        } catch (Exception) {
        }
        return;
    }

    public static synthetic void scheduleNextKeepAliveKick$default(com.lele.llmonitor.service.BatteryMonitorService p0, long p1, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = 120000;
        }
        p0.scheduleNextKeepAliveKick(p1);
        return;
    }

    private final void startHealthWatchdog()
    {
        tf3 v0_0 = this.healthWatchdogJob;
        if ((v0_0 == null) || (v0_0.e() != 1)) {
            this.healthWatchdogJob = xt3.I(this.serviceScope, 0, 0, new com.lele.llmonitor.service.BatteryMonitorService$startHealthWatchdog$1(this, 0), 3);
            return;
        } else {
            return;
        }
    }

    private final void updateNotification(com.lele.llmonitor.data.local.BatteryEntity p25, int p26, int p27)
    {
        int v1_16 = this.getSystemService("notification");
        v1_16.getClass();
        android.app.NotificationManager v7_1 = ((android.app.NotificationManager) v1_16);
        int v1_17 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
        android.app.Notification$Builder v2_7 = ((Boolean) v1_17.isNotificationEnabled().getValue()).booleanValue();
        int v3_7 = ((Boolean) v1_17.isShowNotificationWhenNotCharging().getValue()).booleanValue();
        String v4_12 = ((Boolean) v1_17.isLiveNotificationEnabled().getValue()).booleanValue();
        android.os.Bundle v8_16 = ((Boolean) v1_17.isLiveCloseActionEnabled().getValue()).booleanValue();
        String v5_21 = this.registerReceiver(0, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        android.app.PendingIntent v10_0 = -1;
        if (v5_21 != null) {
            v10_0 = v5_21.getIntExtra("status", -1);
        }
        if ((v10_0 != 2) && (v10_0 != 5)) {
            android.app.PendingIntent v10_1 = 0;
        } else {
            v10_1 = 1;
        }
        String v5_23;
        if (p27 == 0) {
            v5_23 = 0;
        } else {
            v5_23 = 1;
        }
        String v14_4;
        if (v5_23 == null) {
            v14_4 = v3_7;
        } else {
            v14_4 = v2_7;
        }
        android.app.Notification$Builder v2_11;
        int v15 = android.os.Build$VERSION.SDK_INT;
        if (v15 < 36) {
            v2_11 = 0;
        } else {
            v2_11 = 1;
        }
        if ((v2_11 == null) || ((v4_12 == null) || ((v5_23 == null) || (this.isLiveSuppressedForCurrentSession)))) {
            int v3_15 = 0;
        } else {
            v3_15 = 1;
        }
        int v16 = v10_1;
        String v9_9 = android.os.SystemClock.elapsedRealtime();
        if (v3_15 != 0) {
            this.lastLiveEligibleTime = v9_9;
        }
        if ((v3_15 == 0) && ((v2_11 == null) || ((v4_12 == null) || ((this.isLiveSuppressedForCurrentSession) || ((v16 == 0) || ((v9_9 - this.lastLiveEligibleTime) > 5000)))))) {
            String v9_11 = 0;
        } else {
            v9_11 = 1;
        }
        int v22;
        android.app.Notification$ProgressStyle v21;
        android.app.Notification v6_1;
        boolean v23;
        android.app.Notification$Builder v2_17 = new android.content.Intent(this, com.lele.llmonitor.ui.MainActivity);
        v2_17.setFlags(536870912);
        android.app.PendingIntent v10_2 = android.app.PendingIntent.getActivity(this, 0, v2_17, 201326592);
        android.app.Notification$Builder v2_3 = android.app.PendingIntent.getService(this, 100, new android.content.Intent(this, com.lele.llmonitor.service.BatteryMonitorService).setAction("com.lele.llmonitor.ACTION_NOTIFICATION_DISMISSED"), 201326592);
        int v3_1 = new android.app.Notification$Action$Builder(0, com.lele.llmonitor.i18n.TextI18nKt.l10n("\u672c\u6b21\u5173\u95ed"), android.app.PendingIntent.getService(this, 101, new android.content.Intent(this, com.lele.llmonitor.service.BatteryMonitorService).setAction("com.lele.llmonitor.ACTION_LIVE_NOTIFICATION_CLOSE_ONCE"), 201326592)).build();
        v3_1.getClass();
        String v4_5 = v2_3;
        android.app.Notification$Builder v2_5 = this.resolveSupplyTextForNotification(p27);
        android.app.PendingIntent v12_0 = com.lele.llmonitor.data.BatteryEngine.INSTANCE;
        int v1_4 = v12_0.applyCurrentAdjustments(p25.getCurrent(), ((Boolean) v1_17.isInvertCurrent().getValue()).booleanValue(), ((Boolean) v1_17.isDoubleCell().getValue()).booleanValue());
        int v11_3 = ((v1_4 / 1148846080) * p25.getVoltage());
        android.app.Notification$Action v13_1 = v3_1;
        boolean v17 = v8_16;
        android.app.PendingIntent v12_2 = v4_5;
        android.app.Notification$Builder v2_8 = this.buildNotificationContentText(p26, v2_5, p25.getVoltage(), v1_4, v12_0.formatTemperatureC(p25.getTemperature(), com.lele.llmonitor.service.BatteryMonitorService v0.lastBatteryTempFractionDigits));
        int v3_3 = this.resolveNotificationSmallIconRes();
        if (v9_11 == null) {
            v21 = v9_11;
            v22 = v11_3;
            v23 = v14_4;
            v6_1 = 0;
        } else {
            android.os.Bundle v8_1;
            int v18 = -16711936;
            if (v15 < 31) {
                if (v16 == 0) {
                    v8_1 = -7829368;
                    v21 = v9_11;
                } else {
                    v21 = v9_11;
                    v8_1 = -16711936;
                }
            } else {
                android.os.Bundle v8_2;
                if (v16 == 0) {
                    v8_2 = 17170469;
                } else {
                    v8_2 = 17170495;
                }
                v8_1 = this.getColor(v8_2);
            }
            v22 = v11_3;
            String v9_1 = tl.h(tl.e(), android.graphics.drawable.Icon.createWithResource(this, com.lele.llmonitor.R$drawable.ic_dot));
            int v11_6 = tl.c();
            v23 = v14_4;
            if (v15 < 31) {
                if (v16 == 0) {
                    v18 = -3355444;
                }
            } else {
                String v14_1;
                if (v16 == 0) {
                    v14_1 = 17170469;
                } else {
                    v14_1 = 17170495;
                }
                v18 = this.getColor(v14_1);
            }
            android.app.Notification v6_2;
            String v9_3 = tl.f(tl.i(v9_1, tl.d(v11_6, v18)), p26);
            v9_3.getClass();
            if (p27 == 1) {
                v6_2 = com.lele.llmonitor.R$drawable.ic_bolt;
            } else {
                if (p27 == 2) {
                    v6_2 = com.lele.llmonitor.R$drawable.ic_usb;
                } else {
                    if (p27 == 4) {
                        v6_2 = com.lele.llmonitor.R$drawable.ic_wireless;
                    } else {
                        v6_2 = com.lele.llmonitor.R$drawable.ic_bolt;
                    }
                }
            }
            android.app.Notification v6_10 = new android.app.Notification$Builder(this, "battery_live_update_v2").setSmallIcon(v6_2).setColor(v8_1).setContentTitle(String.format("%.1f", java.util.Arrays.copyOf(new Object[] {Float.valueOf(v22)}), 1)).concat("W")).setContentText(v2_8).setStyle(v9_3).setOngoing(1).setOnlyAlertOnce(1).setContentIntent(v10_2);
            v6_10.getClass();
            if (v17) {
                v6_10.addAction(v13_1);
            }
            android.os.Bundle v8_9 = new android.os.Bundle();
            v8_9.putBoolean("android.requestPromotedOngoing", 1);
            v6_10.addExtras(v8_9);
            v6_1 = v6_10.build();
        }
        int v11_14;
        String v9_5;
        if (!v23) {
            v11_14 = 1;
            v9_5 = 0;
        } else {
            v11_14 = 1;
            int v1_11 = new android.app.Notification$Builder(this, "battery_monitor").setSmallIcon(v3_3).setContentTitle(String.format("%.1f", java.util.Arrays.copyOf(new Object[] {Float.valueOf(v22)}), 1)).concat("W")).setContentText(v2_8).setProgress(100, p26, 0).setOngoing(0).setOnlyAlertOnce(1).setContentIntent(v10_2).setDeleteIntent(v12_2);
            v1_11.getClass();
            v9_5 = v1_11.build();
        }
        if ((v21 == null) || (!v23)) {
            if (v21 == null) {
                if (!v23) {
                    this.isLiveForegroundArmed = 0;
                    this.stopForeground(v11_14);
                    this.isForegroundActive = 0;
                    v7_1.cancel(2);
                    return;
                } else {
                    this.isLiveForegroundArmed = 0;
                    this.startForeground(v11_14, v9_5);
                    this.isForegroundActive = v11_14;
                    v7_1.cancel(2);
                    return;
                }
            } else {
                if (!this.isLiveForegroundArmed) {
                    this.stopForeground(v11_14);
                    this.isForegroundActive = 0;
                    this.isLiveForegroundArmed = v11_14;
                }
                this.startForeground(v11_14, v6_1);
                this.isForegroundActive = v11_14;
                v7_1.cancel(2);
                return;
            }
        } else {
            if (!this.isLiveForegroundArmed) {
                this.stopForeground(v11_14);
                this.isForegroundActive = 0;
                this.isLiveForegroundArmed = v11_14;
            }
            this.startForeground(v11_14, v6_1);
            this.isForegroundActive = v11_14;
            v7_1.notify(2, v9_5);
            return;
        }
    }

    private final Object updateWidget(com.lele.llmonitor.data.local.BatteryEntity p21, float p22, n60 p23)
    {
        float v1_1;
        boolean v4_0 = this;
        if (!(p23 instanceof com.lele.llmonitor.service.BatteryMonitorService$updateWidget$1)) {
            v1_1 = new com.lele.llmonitor.service.BatteryMonitorService$updateWidget$1(this, p23);
        } else {
            v1_1 = ((com.lele.llmonitor.service.BatteryMonitorService$updateWidget$1) p23);
            float v2_11 = ((com.lele.llmonitor.service.BatteryMonitorService$updateWidget$1) p23).label;
            if ((v2_11 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.service.BatteryMonitorService$updateWidget$1) p23).label = (v2_11 - -2147483648);
            }
        }
        String v6_1;
        String v9_3;
        android.content.Context v14_6;
        float v5_0;
        int v0_11;
        boolean v10_6;
        String v6_3;
        float v5_1;
        java.util.Iterator v8_0;
        boolean v12_1;
        String v9_6;
        int v15_0;
        boolean v10_0;
        float v1_2;
        float v5_4;
        int v0_14;
        java.util.Iterator v8_3;
        d31 v11_3;
        int v3_2;
        java.util.Iterator v8_4;
        int v15_3;
        d31 v11_5;
        int v7_0;
        d31 v11_0;
        int v3_3;
        com.lele.llmonitor.ui.widget.BatteryWidget v13_3;
        float v2_4;
        int v0_1;
        float v2_6;
        android.content.Context v14_0;
        int v16_1;
        float v2_0;
        boolean v4_1;
        String v6_0;
        float v2_8;
        boolean v10_3;
        String v9_2;
        int v0_3 = v1_1.result;
        float v2_3 = v1_1.label;
        boolean v12_0 = e80.d;
        if (v2_3 == 0) {
            v16_1 = 0;
            ib1.Q(v0_3);
            v0_14 = p21;
            v1_1.L$0 = p21;
            v2_8 = p22;
            v1_1.F$0 = p22;
            v1_1.label = 1;
            if (this.ensureDependenciesInitialized(v1_1) != v12_0) {
                float v5_7 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
                v6_0 = ((Boolean) v5_7.isInvertCurrent().getValue()).booleanValue();
                v5_0 = ((Boolean) v5_7.isDoubleCell().getValue()).booleanValue();
                int v7_7 = com.lele.llmonitor.data.BatteryEngine.INSTANCE;
                java.util.Iterator v8_8 = v7_7.applyCurrentAdjustments(v0_14.getCurrent(), v6_0, v5_0);
                v9_2 = (v0_14.getVoltage() * (v8_8 / 1148846080));
                v7_7.formatTemperatureC(v0_14.getTemperature(), this.lastBatteryTempFractionDigits);
                int v0_27 = this.getApplicationContext();
                v0_27.getClass();
                int v0_28 = v7_7.getBatteryCurrentCapacity(v0_27);
                boolean v10_13 = com.lele.llmonitor.utils.BatteryUtils.INSTANCE.formatTimestamp(System.currentTimeMillis());
                int v7_9 = this.getApplicationContext();
                d31 v11_11 = new com.lele.llmonitor.ui.widget.BatteryWidget();
                v7_9.getClass();
                com.lele.llmonitor.ui.widget.BatteryWidget v13_8 = new x21(v7_9);
                android.content.Context v14_8 = v16_1;
                v1_1.L$0 = v14_8;
                v1_1.L$1 = v14_8;
                v1_1.L$2 = v10_13;
                v1_1.L$3 = v7_9;
                v1_1.L$4 = v11_11;
                v1_1.L$5 = v14_8;
                v1_1.F$0 = v2_8;
                v1_1.Z$0 = v6_0;
                v1_1.Z$1 = v5_0;
                v1_1.F$1 = v8_8;
                v1_1.F$2 = v9_2;
                v1_1.I$0 = v0_28;
                v1_1.label = 2;
                int v3_1 = v13_8.a(com.lele.llmonitor.ui.widget.BatteryWidget, v1_1);
                if (v3_1 != v12_0) {
                    v2_0 = v0_28;
                    v0_1 = v3_1;
                    v3_2 = v8_8;
                    v8_0 = v11_11;
                    v11_0 = v10_13;
                    v10_0 = v7_9;
                    v7_0 = v2_8;
                    v9_3 = v1_1;
                    v1_2 = v9_2;
                    v3_3 = v2_0;
                    v2_4 = v3_2;
                    v11_3 = v6_0;
                    v6_1 = v11_0;
                    v13_3 = v8_0;
                    v14_0 = v10_0;
                    v15_0 = 0;
                    v8_3 = ((java.util.List) v0_1).iterator();
                    v10_3 = v5_0;
                    v5_1 = v7_0;
                    if (!v8_3.hasNext()) {
                        return bw3.a;
                    } else {
                        int v0_18 = ((d31) v8_3.next());
                        v14_0.getClass();
                        boolean v18 = v12_0;
                        boolean v12_2 = v0_18;
                        int v0_20 = new com.lele.llmonitor.service.BatteryMonitorService$updateWidget$2$1(v1_2, v2_4, v3_3, v4_0, v5_1, v6_1, 0);
                        v9_3.L$0 = 0;
                        v9_3.L$1 = 0;
                        v9_3.L$2 = v6_1;
                        v9_3.L$3 = v14_0;
                        v9_3.L$4 = v13_3;
                        v9_3.L$5 = 0;
                        v9_3.L$6 = 0;
                        v9_3.L$7 = 0;
                        v9_3.L$8 = v8_3;
                        v9_3.L$9 = 0;
                        v9_3.L$10 = v12_2;
                        v9_3.F$0 = v5_1;
                        v9_3.Z$0 = v11_3;
                        v9_3.Z$1 = v10_3;
                        v9_3.F$1 = v2_4;
                        v9_3.F$2 = v1_2;
                        v9_3.I$0 = v3_3;
                        v9_3.I$1 = v15_0;
                        v9_3.I$2 = 0;
                        v9_3.label = 3;
                        v4_1 = v18;
                        if (wm1.o0(v14_0, v12_2, v0_20, v9_3) != v4_1) {
                            v5_4 = v1_2;
                            v1_1 = v9_3;
                            v9_6 = v6_1;
                            v6_3 = v2_4;
                            v2_6 = v15_0;
                            v15_3 = v8_3;
                            v8_4 = v10_3;
                            v10_6 = v14_0;
                            v14_6 = v5_1;
                            v12_1 = v11_3;
                            v11_5 = v12_2;
                            v0_11 = 0;
                            v10_6.getClass();
                            v1_1.L$0 = 0;
                            v1_1.L$1 = 0;
                            v1_1.L$2 = v9_6;
                            v1_1.L$3 = v10_6;
                            v1_1.L$4 = v13_3;
                            v1_1.L$5 = 0;
                            v1_1.L$6 = 0;
                            v1_1.L$7 = 0;
                            v1_1.L$8 = v15_3;
                            v1_1.L$9 = 0;
                            v1_1.L$10 = 0;
                            v1_1.F$0 = v14_6;
                            v1_1.Z$0 = v12_1;
                            v1_1.Z$1 = v8_4;
                            v1_1.F$1 = v6_3;
                            v1_1.F$2 = v5_4;
                            v1_1.I$0 = v3_3;
                            v1_1.I$1 = v2_6;
                            v1_1.I$2 = v0_11;
                            v1_1.label = 4;
                            if (v13_3.update(v10_6, v11_5, v1_1) != v4_1) {
                                v9_3 = v1_1;
                                v1_2 = v5_4;
                                v5_1 = v14_6;
                                v14_0 = v10_6;
                                v10_3 = v8_4;
                                v8_3 = v15_3;
                                v15_0 = v2_6;
                                v2_4 = v6_3;
                                v6_1 = v9_6;
                                v11_3 = v12_1;
                                v12_0 = v4_1;
                                v4_0 = this;
                            }
                        }
                    }
                } else {
                    v4_1 = v12_0;
                }
            }
        } else {
            if (v2_3 == 1) {
                v16_1 = 0;
                int v0_25 = v1_1.F$0;
                float v2_10 = ((com.lele.llmonitor.data.local.BatteryEntity) v1_1.L$0);
                ib1.Q(v0_3);
                v2_8 = v0_25;
                v0_14 = v2_10;
            } else {
                if (v2_3 == 2) {
                    d31 v17_0 = v0_3;
                    int v0_2 = v1_1.I$0;
                    float v2_2 = v1_1.F$2;
                    v3_2 = v1_1.F$1;
                    v5_0 = v1_1.Z$1;
                    v6_0 = v1_1.Z$0;
                    v7_0 = v1_1.F$0;
                    v8_0 = ((com.lele.llmonitor.ui.widget.BatteryWidget) v1_1.L$4);
                    String v9_1 = ((android.content.Context) v1_1.L$3);
                    boolean v10_2 = ((String) v1_1.L$2);
                    d31 v11 = ((com.lele.llmonitor.data.local.BatteryEntity) v1_1.L$0);
                    ib1.Q(v17_0);
                    v11_0 = v10_2;
                    v10_0 = v9_1;
                    v9_2 = v2_2;
                    v2_0 = v0_2;
                    v0_1 = v17_0;
                } else {
                    if (v2_3 == 3) {
                        float v2_5 = v1_1.I$2;
                        int v3_4 = v1_1.I$1;
                        float v5_2 = v1_1.I$0;
                        String v6_2 = v1_1.F$2;
                        int v7_1 = v1_1.F$1;
                        v8_4 = v1_1.Z$1;
                        String v9_5 = v1_1.Z$0;
                        boolean v10_5 = v1_1.F$0;
                        v11_5 = ((d31) v1_1.L$10);
                        com.lele.llmonitor.ui.widget.BatteryWidget v13_5 = ((java.util.Iterator) v1_1.L$8);
                        android.content.Context v14 = ((java.util.List) v1_1.L$6);
                        android.content.Context v14_5 = ((com.lele.llmonitor.ui.widget.BatteryWidget) v1_1.L$4);
                        int v15_2 = ((android.content.Context) v1_1.L$3);
                        String v21_1 = ((String) v1_1.L$2);
                        int v0 = ((com.lele.llmonitor.data.local.BatteryEntity) v1_1.L$0);
                        ib1.Q(v0_3);
                        v14_6 = v10_5;
                        v10_6 = v15_2;
                        v15_3 = v13_5;
                        v13_3 = v14_5;
                        v0_11 = v2_5;
                        v2_6 = v3_4;
                        v3_3 = v5_2;
                        v5_4 = v6_2;
                        v6_3 = v7_1;
                        v4_1 = v12_0;
                        v12_1 = v9_5;
                        v9_6 = v21_1;
                    } else {
                        if (v2_3 != 4) {
                            h.m("call to \'resume\' before \'invoke\' with coroutine");
                            return 0;
                        } else {
                            float v2_7 = v1_1.I$1;
                            v3_3 = v1_1.I$0;
                            float v5_5 = v1_1.F$2;
                            String v6_4 = v1_1.F$1;
                            int v7_2 = v1_1.Z$1;
                            com.lele.llmonitor.ui.widget.BatteryWidget v13_6 = v1_1.Z$0;
                            android.content.Context v14_7 = v1_1.F$0;
                            int v15_6 = ((java.util.Iterator) v1_1.L$8);
                            String v9 = ((java.util.List) v1_1.L$6);
                            String v9_11 = ((com.lele.llmonitor.ui.widget.BatteryWidget) v1_1.L$4);
                            boolean v10_8 = ((android.content.Context) v1_1.L$3);
                            java.util.Iterator v8_6 = ((String) v1_1.L$2);
                            v11 = ((com.lele.llmonitor.data.local.BatteryEntity) v1_1.L$0);
                            ib1.Q(v0_3);
                            v15_0 = v2_7;
                            v2_4 = v6_4;
                            v6_1 = v8_6;
                            v8_3 = v15_6;
                            v4_1 = v12_0;
                            v11_3 = v13_6;
                            v13_3 = v9_11;
                            v9_3 = v1_1;
                            v1_2 = v5_5;
                            v5_1 = v14_7;
                            v14_0 = v10_8;
                            v10_3 = v7_2;
                        }
                    }
                }
            }
        }
        return v4_1;
    }

    public android.os.IBinder onBind(android.content.Intent p1)
    {
        return 0;
    }

    public void onCreate()
    {
        super.onCreate();
        com.lele.llmonitor.service.BatteryMonitorService.isRunning = 1;
        this.startHealthWatchdog();
        return;
    }

    public void onDestroy()
    {
        com.lele.llmonitor.service.BatteryMonitorService.isRunning = 0;
        this.isMonitorLoopStarted = 0;
        this.isForegroundActive = 0;
        this.scheduleNextKeepAliveKick(5000);
        this.scheduleNextHealthCheckKick(5000);
        r7.y(this.serviceScope, 0);
        if (this.isForceUpdateReceiverRegistered) {
            try {
                this.unregisterReceiver(this.forceUpdateReceiver);
            } catch (Exception) {
            }
            this.isForceUpdateReceiverRegistered = 0;
        }
        super.onDestroy();
        return;
    }

    public int onStartCommand(android.content.Intent p10, int p11, int p12)
    {
        if (this.serviceStartElapsedMs == 0) {
            this.serviceStartElapsedMs = android.os.SystemClock.elapsedRealtime();
        }
        com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3 v12_1;
        if (p10 == null) {
            v12_1 = 0;
        } else {
            v12_1 = p10.getAction();
        }
        if (!this.isForegroundActive) {
            this.createNotificationChannel();
            this.startForeground(1, this.createBootstrapNotification());
            this.isForegroundActive = 1;
        }
        String v4_0 = this.getApplicationContext();
        v4_0.getClass();
        com.lele.llmonitor.data.SettingsManager.INSTANCE.init(v4_0);
        String v4_1 = this.getApplicationContext();
        v4_1.getClass();
        com.lele.llmonitor.data.BatteryRepository.INSTANCE.init(v4_1);
        bw3 v5 = bw3.a;
        if (v12_1 != null) {
            switch (v12_1.hashCode()) {
                case -1886648615:
                    if (v12_1.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    }
                    break;
                case -948936916:
                    if (v12_1.equals("com.lele.llmonitor.ACTION_KEEP_ALIVE_KICK")) {
                    }
                    break;
                case -872894621:
                    if (v12_1.equals("com.lele.llmonitor.ACTION_FORCE_UPDATE")) {
                    }
                    break;
                case 1019184907:
                    if (v12_1.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    }
                    break;
                case 1842467819:
                    if (v12_1.equals("com.lele.llmonitor.ACTION_HEALTH_CHECK")) {
                    }
                    break;
                default:
            }
            this.requestImmediateUpdate();
            if (!v12_1.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                if (v12_1.equals("com.lele.llmonitor.ACTION_HEALTH_CHECK")) {
                    xt3.I(this.serviceScope, 0, 0, new com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$2(this, 0), 3);
                }
            } else {
                xt3.I(this.serviceScope, 0, 0, new com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$1(this, 0), 3);
            }
            if (this.isMonitorLoopStarted) {
                com.lele.llmonitor.service.BatteryMonitorService.scheduleNextKeepAliveKick$default(this, 0, 1, 0);
                com.lele.llmonitor.service.BatteryMonitorService.scheduleNextHealthCheckKick$default(this, 0, 1, 0);
                this.updateTrigger.l(v5);
                return 1;
            }
        }
        d80 v10_9;
        if (p10 == null) {
            v10_9 = 0;
        } else {
            v10_9 = p10.getAction();
        }
        if (v10_9 != null) {
            com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3 v12_9 = v10_9.hashCode();
            if (v12_9 == -1438121637) {
                if (v10_9.equals("com.lele.llmonitor.ACTION_NOTIFICATION_DISMISSED")) {
                    this.handleNormalNotificationDismiss();
                    this.requestImmediateUpdate();
                    if (this.isMonitorLoopStarted) {
                        this.updateTrigger.l(v5);
                        return 1;
                    }
                }
            } else {
                if ((v12_9 == -1213012817) && (v10_9.equals("com.lele.llmonitor.ACTION_LIVE_NOTIFICATION_CLOSE_ONCE"))) {
                    this.isLiveSuppressedForCurrentSession = 1;
                    this.requestImmediateUpdate();
                    if (this.isMonitorLoopStarted) {
                        this.updateTrigger.l(v5);
                        return 1;
                    }
                }
            }
        }
        if (!this.isMonitorLoopStarted) {
            com.lele.llmonitor.service.BatteryMonitorService.scheduleNextKeepAliveKick$default(this, 0, 1, 0);
            com.lele.llmonitor.service.BatteryMonitorService.scheduleNextHealthCheckKick$default(this, 0, 1, 0);
            if (!this.isForceUpdateReceiverRegistered) {
                wb0.K(this, this.forceUpdateReceiver, new android.content.IntentFilter("com.lele.llmonitor.ACTION_FORCE_UPDATE"));
                this.isForceUpdateReceiverRegistered = 1;
            }
            if (this.isMonitorLoopStarted) {
                this.updateTrigger.l(v5);
                return 1;
            } else {
                this.isMonitorLoopStarted = 1;
                xt3.I(this.serviceScope, 0, 0, new com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3(this, 0), 3);
                return 1;
            }
        } else {
            com.lele.llmonitor.service.BatteryMonitorService.scheduleNextKeepAliveKick$default(this, 0, 1, 0);
            com.lele.llmonitor.service.BatteryMonitorService.scheduleNextHealthCheckKick$default(this, 0, 1, 0);
            this.updateTrigger.l(v5);
            return 1;
        }
    }

    public void onTaskRemoved(android.content.Intent p3)
    {
        this.scheduleNextKeepAliveKick(5000);
        this.scheduleNextHealthCheckKick(5000);
        super.onTaskRemoved(p3);
        return;
    }
}
