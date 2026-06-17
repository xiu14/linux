package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import com.xiaomi.push.service.aq;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class cy {
    private static volatile cy a;

    /* renamed from: a, reason: collision with other field name */
    private int f228a;

    /* renamed from: a, reason: collision with other field name */
    private PendingIntent f229a;

    /* renamed from: a, reason: collision with other field name */
    private final BroadcastReceiver f230a;

    /* renamed from: a, reason: collision with other field name */
    private Context f231a;

    /* renamed from: a, reason: collision with other field name */
    private ConnectivityManager.NetworkCallback f232a;

    /* renamed from: a, reason: collision with other field name */
    private da f233a;

    /* renamed from: a, reason: collision with other field name */
    private WeakReference<gp> f234a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicBoolean f235a = new AtomicBoolean(false);
    private final AtomicBoolean b;

    private cy(Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.b = atomicBoolean;
        this.f228a = -1;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.push.cy.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null || context2 == null) {
                    return;
                }
                try {
                    if ("com.xiaomi.push.PING_TIMER_TASK_trigger_cnt_stat".equals(intent.getAction()) && cy.this.b.get()) {
                        cx.m191a().c(context2);
                        cy.this.m199a(context2);
                    }
                } catch (Throwable th) {
                    StringBuilder M = e.a.a.a.a.M("Failed to trigger connect stat alarm: ");
                    M.append(th.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
                }
            }
        };
        this.f230a = broadcastReceiver;
        try {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatsHelper", "init failed, context is null");
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f231a = applicationContext;
            atomicBoolean.set(m201a(applicationContext));
            if (atomicBoolean.get()) {
                b();
                cx.m191a().c(this.f231a);
                n.a(this.f231a, broadcastReceiver, new IntentFilter("com.xiaomi.push.PING_TIMER_TASK_trigger_cnt_stat"));
                m199a(this.f231a);
            }
            com.xiaomi.push.service.aq.a(this.f231a).a(new aq.a(hz.ConnectStatSwitch.a(), "connect_stat_switch") { // from class: com.xiaomi.push.cy.1
                @Override // com.xiaomi.push.service.aq.a
                protected void onCallback() {
                    try {
                        cy cyVar = cy.this;
                        boolean m201a = cyVar.m201a(cyVar.f231a);
                        if (cy.this.b.compareAndSet(!m201a, m201a)) {
                            if (m201a) {
                                cy.this.b();
                                cx.m191a().m194a();
                                cy.this.a((gp) null);
                                n.a(cy.this.f231a, cy.this.f230a, new IntentFilter("com.xiaomi.push.PING_TIMER_TASK_trigger_cnt_stat"));
                                cy cyVar2 = cy.this;
                                cyVar2.m199a(cyVar2.f231a);
                            } else {
                                cy.this.c();
                                cy.this.b((gp) null);
                                cy.this.f231a.unregisterReceiver(cy.this.f230a);
                                cy cyVar3 = cy.this;
                                cyVar3.b(cyVar3.f231a);
                            }
                        }
                    } catch (Throwable th) {
                        StringBuilder M = e.a.a.a.a.M("Failed to update connect stat switch: ");
                        M.append(th.getMessage());
                        com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
                    }
                }
            });
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("Failed to init connect stats helper: ");
            M.append(th.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Context context = this.f231a;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                ConnectivityManager.NetworkCallback networkCallback = this.f232a;
                if (networkCallback != null) {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                    this.f232a = null;
                }
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("exception occurred in removing network callback :");
                M.append(th.getMessage());
                com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        PendingIntent pendingIntent;
        if (context == null || (pendingIntent = this.f229a) == null) {
            return;
        }
        try {
            fo.a(context, pendingIntent);
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("Failed to stop connect stat timer task: ");
            M.append(th.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: collision with other method in class */
    public void m199a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (this.f229a == null) {
                Intent intent = new Intent("com.xiaomi.push.PING_TIMER_TASK_trigger_cnt_stat");
                intent.setPackage("com.xiaomi.xmsf");
                if (Build.VERSION.SDK_INT >= 30) {
                    this.f229a = PendingIntent.getBroadcast(context, 0, intent, 167772160);
                } else {
                    this.f229a = PendingIntent.getBroadcast(context, 0, intent, 134217728);
                }
            }
            PendingIntent pendingIntent = this.f229a;
            if (pendingIntent == null) {
                return;
            }
            fo.a(context, pendingIntent);
            fo.a(context, 3, SystemClock.elapsedRealtime() + 2940000, this.f229a);
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("Failed to start connect stat timer task: ");
            M.append(th.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
        }
    }

    public void b(gp gpVar) {
        if (gpVar == null) {
            try {
                WeakReference<gp> weakReference = this.f234a;
                gpVar = weakReference == null ? null : weakReference.get();
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.b("ConnectStatsHelper", "stop connect stats error", th.getMessage());
                return;
            }
        }
        da daVar = this.f233a;
        if (daVar != null) {
            if (gpVar != null) {
                gpVar.b(daVar);
            }
            this.f233a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Context context = this.f231a;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                    this.f235a.set(true);
                }
                if (this.f232a == null) {
                    ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.xiaomi.push.cy.3
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities2) {
                            super.onCapabilitiesChanged(network, networkCapabilities2);
                            boolean b = ax.b(cy.this.f231a);
                            if (cy.this.f235a.compareAndSet(!b, b)) {
                                if (b) {
                                    cx.m191a().m196b(cy.this.f231a);
                                } else {
                                    cx.m191a().m195a(cy.this.f231a);
                                }
                            }
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onLost(Network network) {
                            super.onLost(network);
                            if (cy.this.f235a.getAndSet(false)) {
                                cx.m191a().m195a(cy.this.f231a);
                            }
                        }
                    };
                    this.f232a = networkCallback;
                    connectivityManager.registerDefaultNetworkCallback(networkCallback);
                }
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("exception occurred in adding network callback :");
                M.append(th.getMessage());
                com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
            }
        }
    }

    public static cy a(Context context) {
        if (a == null) {
            synchronized (cy.class) {
                if (a == null) {
                    a = new cy(context);
                }
            }
        }
        return a;
    }

    public void a(gp gpVar) {
        try {
            if (gpVar == null) {
                WeakReference<gp> weakReference = this.f234a;
                gpVar = weakReference == null ? null : weakReference.get();
            } else {
                this.f234a = new WeakReference<>(gpVar);
            }
            Context context = this.f231a;
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatsHelper", "start connect stats error, context is null");
                return;
            }
            if (m201a(context)) {
                if (this.f233a == null) {
                    this.f233a = new da(context);
                }
                if (gpVar != null) {
                    gpVar.a(this.f233a);
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.b("ConnectStatsHelper", "start connect stats error", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: collision with other method in class */
    public boolean m201a(Context context) {
        return context != null && k.m655a(context) && com.xiaomi.push.service.aq.a(context).a(hz.ConnectStatSwitch.a(), false);
    }

    public void a(int i) {
        try {
            if (m201a(this.f231a)) {
                cx.m191a().a(this.f231a, System.currentTimeMillis(), i, a(), this.f228a);
            }
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("onDisconnection occurred error: ");
            M.append(th.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m204a() {
        try {
            if (m201a(this.f231a)) {
                long currentTimeMillis = System.currentTimeMillis();
                int a2 = a();
                this.f228a = a2;
                cx.m191a().a(this.f231a, currentTimeMillis, a2);
            }
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("onReconnection occurred error: ");
            M.append(th.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
        }
    }

    private int a() {
        try {
            ay m110a = ax.m110a();
            if (m110a != null) {
                return m110a.a();
            }
            return -1;
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("getNetType occurred error: ");
            M.append(th.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("ConnectStatsHelper", M.toString());
            return -1;
        }
    }
}
