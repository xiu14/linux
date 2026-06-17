package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import java.net.Socket;

/* loaded from: classes2.dex */
public class ex extends ew {

    /* renamed from: a, reason: collision with other field name */
    private PendingIntent f413a;

    /* renamed from: a, reason: collision with other field name */
    private long f412a = 0;
    private final int a = 540000;

    /* renamed from: a, reason: collision with other field name */
    private final BroadcastReceiver f414a = new BroadcastReceiver() { // from class: com.xiaomi.push.ex.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "com.xiaomi.push.PING_TIMER_TASK_trigger_md_ka".equals(intent.getAction())) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[IdleState] trigger task running.");
                if (ex.this.m372a().a(ex.class)) {
                    ex.this.a(new fb(), "intervalTrigger");
                }
            }
        }
    };

    private void i() {
        Context m841a = t.m841a();
        if (m841a == null) {
            return;
        }
        try {
            if (Math.abs(System.currentTimeMillis() - this.f412a) < com.heytap.mcssdk.constant.a.f6886d) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[IdleState] repeated trigger requests within 60 second.");
                return;
            }
            this.f412a = System.currentTimeMillis();
            if (this.f413a == null) {
                Intent intent = new Intent("com.xiaomi.push.PING_TIMER_TASK_trigger_md_ka");
                intent.setPackage("com.xiaomi.xmsf");
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f413a = PendingIntent.getBroadcast(m841a, 0, intent, 1241513984);
                } else {
                    this.f413a = PendingIntent.getBroadcast(m841a, 0, intent, 134217728);
                }
            }
            if (this.f413a == null) {
                return;
            }
            j();
            int c2 = ew.c();
            if (c2 > 540000) {
                c2 = 540000;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() + c2;
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[IdleState] reschedule delayed trigger task.delay time:" + (c2 / 1000) + "s");
            fo.a(m841a, 2, elapsedRealtime, this.f413a);
        } catch (Throwable th) {
            e.a.a.a.a.w0("[IdleState] exception occurred in executing trigger task, exception: ", th, "HwKaMgr");
        }
    }

    private void j() {
        PendingIntent pendingIntent;
        Context m841a = t.m841a();
        if (m841a == null || (pendingIntent = this.f413a) == null) {
            return;
        }
        try {
            fo.a(m841a, pendingIntent);
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[IdleState] cancel delayed trigger task.");
        } catch (Throwable th) {
            e.a.a.a.a.w0("[IdleState] exception occurred in canceling old trigger task, exception: ", th, "HwKaMgr");
        }
    }

    @Override // com.xiaomi.push.ew
    /* renamed from: a */
    public String mo373a() {
        return "IdleState";
    }

    @Override // com.xiaomi.push.ew
    public void a(Socket socket) {
        i();
    }

    @Override // com.xiaomi.push.ew
    /* renamed from: b */
    public void mo376b() {
        i();
    }

    @Override // com.xiaomi.push.ew
    /* renamed from: c */
    public void mo378c() {
        i();
    }

    @Override // com.xiaomi.push.ew
    public void d() {
        i();
    }

    @Override // com.xiaomi.push.ew
    public void e() {
        a(new fc(), "stopPing");
    }

    @Override // com.xiaomi.push.ew
    public void f() {
        a(new fc(), "failTooMuch");
    }

    @Override // com.xiaomi.push.ew
    public void a(int i, Exception exc, boolean z) {
        a(new fc(), z ? "socketClosedHasMobileNet" : "socketClosedNoMobileNet");
    }

    @Override // com.xiaomi.push.ew
    public void b(boolean z) {
        if (z) {
            return;
        }
        a(new fc(), "configChange");
    }

    @Override // com.xiaomi.push.ew
    public void c(boolean z) {
        if (z) {
            return;
        }
        a(new fc(), "mobileNetworkDisconnected");
    }

    @Override // com.xiaomi.push.ew
    public void d(boolean z) {
        if (z) {
            a(new fc(), "fallDownChange");
        }
    }

    @Override // com.xiaomi.push.ew
    public void a(boolean z) {
        if (z) {
            a(new fc(), "superPowerModeChange");
        }
    }

    @Override // com.xiaomi.push.ew
    public void b(ew ewVar) {
        try {
            Context m841a = t.m841a();
            if (m841a == null) {
                return;
            }
            n.a(m841a, this.f414a, new IntentFilter("com.xiaomi.push.PING_TIMER_TASK_trigger_md_ka"));
            i();
        } catch (Throwable th) {
            e.a.a.a.a.w0("[IdleState] exception occurred in state switch from, exception: ", th, "HwKaMgr");
        }
    }

    @Override // com.xiaomi.push.ew
    public void a(ew ewVar) {
        BroadcastReceiver broadcastReceiver;
        try {
            j();
            Context m841a = t.m841a();
            if (m841a != null && (broadcastReceiver = this.f414a) != null) {
                m841a.unregisterReceiver(broadcastReceiver);
            }
        } catch (Throwable th) {
            e.a.a.a.a.w0("[IdleState] exception occurred in state switch to, exception: ", th, "HwKaMgr");
        }
    }
}
