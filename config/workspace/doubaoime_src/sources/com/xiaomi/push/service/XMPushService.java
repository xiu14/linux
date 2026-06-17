package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.bs;
import com.xiaomi.push.ct;
import com.xiaomi.push.cy;
import com.xiaomi.push.dd;
import com.xiaomi.push.dj;
import com.xiaomi.push.dn;
import com.xiaomi.push.dr;
import com.xiaomi.push.ef;
import com.xiaomi.push.eo;
import com.xiaomi.push.er;
import com.xiaomi.push.fk;
import com.xiaomi.push.gd;
import com.xiaomi.push.ge;
import com.xiaomi.push.gg;
import com.xiaomi.push.gn;
import com.xiaomi.push.gp;
import com.xiaomi.push.gq;
import com.xiaomi.push.gs;
import com.xiaomi.push.gu;
import com.xiaomi.push.gv;
import com.xiaomi.push.gx;
import com.xiaomi.push.gz;
import com.xiaomi.push.hc;
import com.xiaomi.push.hd;
import com.xiaomi.push.ho;
import com.xiaomi.push.hp;
import com.xiaomi.push.hs;
import com.xiaomi.push.hu;
import com.xiaomi.push.hz;
import com.xiaomi.push.ie;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.iu;
import com.xiaomi.push.je;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.ax;
import com.xiaomi.push.service.ay;
import com.xiaomi.push.service.be;
import com.xiaomi.push.service.bk;
import com.xiaomi.push.service.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class XMPushService extends Service implements gs {
    private static boolean b = false;

    /* renamed from: a, reason: collision with other field name */
    private ContentObserver f953a;

    /* renamed from: a, reason: collision with other field name */
    private gn f955a;

    /* renamed from: a, reason: collision with other field name */
    private gp f956a;

    /* renamed from: a, reason: collision with other field name */
    private gq f957a;

    /* renamed from: a, reason: collision with other field name */
    private a f959a;

    /* renamed from: a, reason: collision with other field name */
    private f f960a;

    /* renamed from: a, reason: collision with other field name */
    private k f961a;

    /* renamed from: a, reason: collision with other field name */
    private r f962a;

    /* renamed from: a, reason: collision with other field name */
    private t f963a;

    /* renamed from: a, reason: collision with other field name */
    private bd f965a;

    /* renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.i f966a;

    /* renamed from: a, reason: collision with other field name */
    private Object f969a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f972a = false;
    private int a = 0;

    /* renamed from: b, reason: collision with other field name */
    private int f973b = 0;

    /* renamed from: a, reason: collision with other field name */
    private long f952a = 0;

    /* renamed from: a, reason: collision with other field name */
    protected Class f968a = XMJobService.class;

    /* renamed from: a, reason: collision with other field name */
    private at f964a = null;

    /* renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.s f967a = null;

    /* renamed from: a, reason: collision with other field name */
    Messenger f954a = null;

    /* renamed from: a, reason: collision with other field name */
    private Collection<ag> f971a = Collections.synchronizedCollection(new ArrayList());

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<n> f970a = new ArrayList<>();

    /* renamed from: a, reason: collision with other field name */
    private gu f958a = new gu() { // from class: com.xiaomi.push.service.XMPushService.1
        @Override // com.xiaomi.push.gu
        public void a(hd hdVar) {
            XMPushService xMPushService = XMPushService.this;
            xMPushService.a(xMPushService.new m(hdVar));
        }

        @Override // com.xiaomi.push.gu
        public void a(gg ggVar) {
            if (com.xiaomi.push.service.f.a(ggVar)) {
                be.a().a(ggVar.e(), SystemClock.elapsedRealtime(), com.xiaomi.push.k.b(XMPushService.this), com.xiaomi.push.h.a((Context) XMPushService.this));
            }
            XMPushService xMPushService = XMPushService.this;
            xMPushService.a(xMPushService.new d(ggVar));
        }
    };

    private class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with other field name */
        private final Object f979a;

        private a() {
            this.f979a = new Object();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            com.xiaomi.channel.commonutils.logger.c.c("[Alarm] heartbeat alarm has been triggered.");
            if (!ay.t.equals(intent.getAction())) {
                com.xiaomi.channel.commonutils.logger.c.m15a("[Alarm] cancel the old ping timer");
                fk.m397a();
                return;
            }
            if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                com.xiaomi.channel.commonutils.logger.c.c("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                    a(WsConstants.EXIT_DELAY_TIME);
                    com.xiaomi.channel.commonutils.logger.c.m15a("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }

        private void a(long j) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.c.d("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f979a) {
                try {
                    this.f979a.wait(j);
                } catch (InterruptedException e2) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("[Alarm] interrupt from waiting state. " + e2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.c.d("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f979a) {
                try {
                    this.f979a.notifyAll();
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("[Alarm] notify lock. " + e2);
                }
            }
        }
    }

    static class c extends j {
        private final ax.b a;

        public c(ax.b bVar) {
            super(12);
            this.a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            this.a.a(ax.c.unbind, 1, 21, (String) null, (String) null);
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return TextUtils.equals(((c) obj).a.f9322g, this.a.f9322g);
            }
            return false;
        }

        public int hashCode() {
            return this.a.f9322g.hashCode();
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            StringBuilder M = e.a.a.a.a.M("bind time out. chid=");
            M.append(this.a.f9322g);
            return M.toString();
        }
    }

    class d extends j {
        private gg a;

        public d(gg ggVar) {
            super(8);
            this.a = null;
            this.a = ggVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            XMPushService.this.f964a.a(this.a);
            if (com.xiaomi.push.service.f.a(this.a)) {
                XMPushService.this.a(new be.a(), 15000L);
            }
        }
    }

    public class e extends j {
        e() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "do reconnect..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            if (XMPushService.this.m693a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.g();
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("should not connect. quit the job.");
        }
    }

    class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (XMPushService.this.m687h()) {
                com.xiaomi.push.ax.m115a();
                XMPushService.this.onStart(intent, 1);
            }
        }
    }

    public class g extends j {

        /* renamed from: a, reason: collision with other field name */
        public Exception f982a;
        public int b;

        g(int i, Exception exc) {
            super(2);
            this.b = i;
            this.f982a = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "disconnect the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            XMPushService.this.a(this.b, this.f982a);
        }
    }

    class h extends j {
        h() {
            super(65535);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "Init Job";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            XMPushService.this.c();
        }
    }

    class i extends j {
        private long a;

        /* renamed from: a, reason: collision with other field name */
        private Intent f983a;

        public i(Intent intent) {
            super(15);
            this.f983a = null;
            this.f983a = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            XMPushService.this.a(this.f983a, this.a);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            StringBuilder M = e.a.a.a.a.M("Handle intent action = ");
            M.append(this.f983a.getAction());
            return M.toString();
        }

        public void a(long j) {
            this.a = j;
        }
    }

    public static abstract class j extends s.b {
        public j(int i) {
            super(i);
        }

        public abstract String a();

        /* renamed from: a */
        public abstract void mo403a();

        @Override // java.lang.Runnable
        public void run() {
            int i = ((s.b) this).a;
            if (i != 4 && i != 8) {
                com.xiaomi.channel.commonutils.logger.c.m16a(com.xiaomi.channel.commonutils.logger.a.a, a());
            }
            mo403a();
        }
    }

    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StringBuilder M = e.a.a.a.a.M("[HB] hold short heartbeat, ");
            M.append(com.xiaomi.push.k.a(intent));
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    class l extends j {
        public l() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "ask the job queue to quit";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            XMPushService.this.f967a.m819a();
        }
    }

    class m extends j {
        private hd a;

        public m(hd hdVar) {
            super(8);
            this.a = null;
            this.a = hdVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            XMPushService.this.f964a.a(this.a);
        }
    }

    public interface n {
        /* renamed from: a */
        void mo487a();
    }

    class o extends j {

        /* renamed from: a, reason: collision with other field name */
        boolean f986a;

        public o(boolean z) {
            super(4);
            this.f986a = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "send ping..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            if (XMPushService.this.m698c()) {
                try {
                    if (!this.f986a) {
                        ge.a();
                    }
                    XMPushService.this.f956a.b(this.f986a);
                } catch (gx e2) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                    XMPushService.this.a(10, e2);
                }
            }
        }
    }

    class q extends j {
        q() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "reset the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            XMPushService.this.a(11, (Exception) null);
            if (XMPushService.this.m693a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.g();
                }
            }
        }
    }

    class r extends BroadcastReceiver {
        r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    class t extends BroadcastReceiver {
        t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f972a) {
                XMPushService.this.f972a = true;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    private void d() {
        if (com.xiaomi.push.k.m655a((Context) this)) {
            au.a(this);
        }
    }

    private void e() {
        com.xiaomi.push.ay m110a = com.xiaomi.push.ax.m110a();
        com.xiaomi.push.service.p.a(getApplicationContext()).a(m110a);
        er.a().a(m110a);
        if (m110a != null) {
            StringBuilder R = e.a.a.a.a.R("[", "type: ");
            R.append(m110a.m122a());
            R.append("[");
            R.append(m110a.m124b());
            R.append("], state: ");
            R.append(m110a.m121a());
            R.append("/");
            R.append(m110a.m120a());
            com.xiaomi.channel.commonutils.logger.c.m16a("XMPushService", "network changed," + R.toString());
            NetworkInfo.State m121a = m110a.m121a();
            if (m121a == NetworkInfo.State.SUSPENDED || m121a == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.c.m16a("XMPushService", "network changed, no active network");
        }
        if (gd.a() != null) {
            gd.a().m405a();
        }
        ho.m485a((Context) this);
        this.f955a.d();
        if (com.xiaomi.push.ax.m117a((Context) this)) {
            if (m698c()) {
                if (m685f()) {
                    b(false);
                }
                if (Build.VERSION.SDK_INT > 34 && aq.a(com.xiaomi.push.t.m841a()).a(hz.ResetConnectionSwitch.a(), true)) {
                    boolean d2 = com.xiaomi.push.ax.d(this);
                    boolean equals = TextUtils.equals(com.xiaomi.push.ax.m112a((Context) this), this.f955a.m440b());
                    if (!d2 || equals) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("no need to reset connection for network change");
                    } else {
                        com.xiaomi.channel.commonutils.logger.c.m15a("under WIFI network, there is a non WIFI connection that needs to be reset");
                        if (this.f955a.m442b()) {
                            com.xiaomi.channel.commonutils.logger.c.m15a("do resetting connection ");
                            a(new q());
                        } else {
                            com.xiaomi.channel.commonutils.logger.c.m15a("connection has been reset or the current connection cannot be reset");
                        }
                    }
                }
            }
            if (!m698c() && !m699d()) {
                this.f967a.a(1);
                a(new e());
            }
            dr.a(this).a();
        } else {
            a(new g(2, null));
        }
        f();
    }

    /* renamed from: f, reason: collision with other method in class */
    private boolean m685f() {
        if (SystemClock.elapsedRealtime() - this.f952a < 30000) {
            return false;
        }
        return com.xiaomi.push.ax.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: collision with other method in class */
    public boolean m686g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: collision with other method in class */
    public boolean m687h() {
        boolean z;
        String packageName = getPackageName();
        if ("com.xiaomi.xmsf".equals(packageName)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("current sdk expect region is cn");
            z = com.xiaomi.push.o.China.name().equals(com.xiaomi.push.service.c.a(getApplicationContext()).a());
        } else {
            z = !w.a(this).m837b(packageName);
        }
        if (!z) {
            com.xiaomi.channel.commonutils.logger.c.m17a("XMPushService", "-->isPushEnabled(): isEnabled=", Boolean.valueOf(z), ", package=", packageName, ", region=", com.xiaomi.push.service.c.a(getApplicationContext()).a());
        }
        return z;
    }

    private void i() {
    }

    /* renamed from: i, reason: collision with other method in class */
    private boolean m688i() {
        boolean z = getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && m689j() && !com.xiaomi.push.j.m619b((Context) this) && !com.xiaomi.push.j.m616a(getApplicationContext());
        er.a().b(z);
        return z;
    }

    /* renamed from: j, reason: collision with other method in class */
    private boolean m689j() {
        int intValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i2 = this.a;
        int i3 = this.f973b;
        if (i2 > i3) {
            if (intValue >= i2 || intValue < i3) {
                return true;
            }
        } else if (i2 < i3 && intValue >= i2 && intValue < i3) {
            return true;
        }
        return false;
    }

    private boolean k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return aq.a(this).a(hz.ForegroundServiceSwitch.a(), false);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f954a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] split;
        super.onCreate();
        com.xiaomi.channel.commonutils.logger.c.a(getApplicationContext());
        com.xiaomi.push.t.a((Context) this);
        u m832a = v.m832a((Context) this);
        if (m832a != null) {
            com.xiaomi.push.z.a(m832a.a);
        }
        if (com.xiaomi.push.k.m655a(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f959a = new a();
            com.xiaomi.push.n.a(this, this.f959a, new IntentFilter(ay.t), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler, 4);
            b = true;
            handler.post(new Runnable() { // from class: com.xiaomi.push.service.XMPushService.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PackageManager packageManager = XMPushService.this.getApplicationContext().getPackageManager();
                        ComponentName componentName = new ComponentName(XMPushService.this.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
                        if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                            packageManager.setComponentEnabledSetting(componentName, 2, 1);
                        }
                    } catch (Throwable th) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("[Alarm] disable ping receiver may be failure. " + th);
                    }
                }
            });
            ak.a(this);
        }
        this.f954a = new Messenger(new Handler() { // from class: com.xiaomi.push.service.XMPushService.8
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message != null) {
                    try {
                        int i2 = message.what;
                        if (i2 == 17) {
                            Object obj = message.obj;
                            if (obj != null) {
                                XMPushService.this.onStart((Intent) obj, 1);
                            }
                        } else if (i2 == 18) {
                            Message obtain = Message.obtain((Handler) null, 0);
                            obtain.what = 18;
                            Bundle bundle = new Bundle();
                            bundle.putString("xmsf_region", com.xiaomi.push.service.c.a(XMPushService.this.getApplicationContext()).a());
                            obtain.setData(bundle);
                            message.replyTo.send(obtain);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        az.a(this);
        gq gqVar = new gq(null, 5222, "xiaomi.com", null) { // from class: com.xiaomi.push.service.XMPushService.9
            @Override // com.xiaomi.push.gq
            /* renamed from: a */
            public byte[] mo447a() {
                try {
                    ef.b bVar = new ef.b();
                    bVar.a(bi.a().m783a());
                    return bVar.m380a();
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M("getOBBString err: ");
                    M.append(e2.toString());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                    return null;
                }
            }
        };
        this.f957a = gqVar;
        gqVar.a(true);
        this.f955a = new gn(this, this.f957a);
        this.f966a = m691a();
        fk.a(this);
        this.f955a.a(this);
        this.f964a = new at(this);
        this.f965a = new bd(this);
        new com.xiaomi.push.service.j().a();
        gd.m406a().a(this);
        this.f967a = new com.xiaomi.push.service.s("Connection Controller Thread");
        bk.m789a().a(new bk.b() { // from class: com.xiaomi.push.service.XMPushService.10
            @Override // com.xiaomi.push.service.bk.b
            public void a(final String str, final int i2) {
                if (XMPushService.this.f967a == null) {
                    return;
                }
                XMPushService.this.f967a.b(new j(4) { // from class: com.xiaomi.push.service.XMPushService.10.1
                    @Override // com.xiaomi.push.service.XMPushService.j
                    public String a() {
                        return "send task count exceed report message.";
                    }

                    @Override // com.xiaomi.push.service.XMPushService.j
                    /* renamed from: a */
                    public void mo403a() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put("limit_app_id", str);
                            hashMap.put("limit_app_id_msg_count", String.valueOf(i2));
                            it itVar = new it();
                            itVar.c(ie.AppMsgOverloadLimit.f611a);
                            itVar.a(as.a());
                            String str2 = v.f1157a;
                            itVar.b(str2);
                            itVar.d("com.xiaomi.xmsf");
                            itVar.a(hashMap);
                            ab.a(XMPushService.this, ab.a("com.xiaomi.xmsf", str2, itVar, hu.Notification));
                        } catch (gx e2) {
                            StringBuilder M = e.a.a.a.a.M("Fail to send task count exceed report message. ");
                            M.append(e2.getMessage());
                            com.xiaomi.channel.commonutils.logger.c.d(M.toString());
                            XMPushService.this.a(10, e2);
                        } catch (Throwable th) {
                            StringBuilder M2 = e.a.a.a.a.M("Fail to send task count exceed report message. ");
                            M2.append(th.getMessage());
                            com.xiaomi.channel.commonutils.logger.c.d(M2.toString());
                        }
                    }
                });
            }
        });
        ax a2 = ax.a();
        a2.b();
        a2.a(new ax.a() { // from class: com.xiaomi.push.service.XMPushService.11
            @Override // com.xiaomi.push.service.ax.a
            public void a() {
                XMPushService.this.f();
                if (ax.a().m764a() <= 0) {
                    XMPushService xMPushService = XMPushService.this;
                    xMPushService.a(xMPushService.new g(12, null));
                }
            }
        });
        if (k()) {
            i();
        }
        hs.a(this).a(new com.xiaomi.push.service.t(this), "UPLOADER_PUSH_CHANNEL");
        a(new hp(this));
        a(new bp(this));
        if (com.xiaomi.push.k.m655a((Context) this)) {
            a(new aw());
            if (com.xiaomi.push.j.m615a()) {
                a(new n() { // from class: com.xiaomi.push.service.XMPushService.12
                    @Override // com.xiaomi.push.service.XMPushService.n
                    /* renamed from: a */
                    public void mo487a() {
                        bs.a(XMPushService.this.getApplicationContext());
                    }
                });
            }
        }
        a(new h());
        this.f971a.add(bj.a(this));
        f fVar = new f();
        this.f960a = fVar;
        com.xiaomi.push.n.a(this, fVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), (String) null, (Handler) null);
        this.f969a = com.xiaomi.push.ax.m111a((Context) this);
        if (com.xiaomi.push.k.m655a(getApplicationContext())) {
            this.f963a = new t();
            com.xiaomi.push.n.a(this, this.f963a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null, 2);
            k kVar = new k();
            this.f961a = kVar;
            com.xiaomi.push.n.a(this, kVar, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null, 2);
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f953a = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.xiaomi.push.service.XMPushService.13
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z) {
                        super.onChange(z);
                        boolean m686g = XMPushService.this.m686g();
                        com.xiaomi.channel.commonutils.logger.c.m15a("SuperPowerMode:" + m686g);
                        er.a().a(m686g);
                        XMPushService.this.f();
                        if (!m686g) {
                            XMPushService.this.a(true);
                        } else {
                            XMPushService xMPushService = XMPushService.this;
                            xMPushService.a(xMPushService.new g(24, null));
                        }
                    }
                };
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f953a);
                } catch (Throwable th) {
                    StringBuilder M = e.a.a.a.a.M("register super-power-mode observer err:");
                    M.append(th.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.d(M.toString());
                }
            }
            int[] m681a = m681a();
            if (m681a != null) {
                this.f962a = new r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                com.xiaomi.push.n.a(this, this.f962a, intentFilter, (String) null, (Handler) null);
                this.a = m681a[0];
                this.f973b = m681a[1];
                StringBuilder M2 = e.a.a.a.a.M("falldown initialized: ");
                M2.append(this.a);
                M2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                M2.append(this.f973b);
                com.xiaomi.channel.commonutils.logger.c.m15a(M2.toString());
            }
        }
        dd.a(this, this.f955a);
        cy.a((Context) this).a(this.f955a);
        dj.a(this, this.f955a);
        String str = "";
        if (m832a != null) {
            try {
                if (!TextUtils.isEmpty(m832a.f1155a) && (split = m832a.f1155a.split("@")) != null && split.length > 0) {
                    str = split[0];
                }
            } catch (Exception unused) {
            }
        }
        dn.a(this);
        com.xiaomi.channel.commonutils.logger.c.e("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + com.xiaomi.push.h.a(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        f fVar = this.f960a;
        if (fVar != null) {
            a(fVar);
            this.f960a = null;
        }
        Object obj = this.f969a;
        if (obj != null) {
            com.xiaomi.push.ax.a(this, obj);
            this.f969a = null;
        }
        t tVar = this.f963a;
        if (tVar != null) {
            a(tVar);
            this.f963a = null;
        }
        k kVar = this.f961a;
        if (kVar != null) {
            a(kVar);
            this.f961a = null;
        }
        r rVar = this.f962a;
        if (rVar != null) {
            a(rVar);
            this.f962a = null;
        }
        a aVar = this.f959a;
        if (aVar != null) {
            a(aVar);
            this.f959a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f953a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f953a);
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("unregister super-power-mode err:");
                M.append(th.getMessage());
                com.xiaomi.channel.commonutils.logger.c.d(M.toString());
            }
        }
        this.f971a.clear();
        this.f967a.m822b();
        a(new j(2) { // from class: com.xiaomi.push.service.XMPushService.5
            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "disconnect for service destroy.";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo403a() {
                if (XMPushService.this.f956a != null) {
                    XMPushService.this.f956a.b(15, (Exception) null);
                    XMPushService.this.f956a = null;
                }
            }
        });
        a(new l());
        bk.m789a().a((bk.b) null);
        ax.a().b();
        ax.a().a(this, 15);
        ax.a().m768a();
        this.f955a.b(this);
        bi.a().m785a();
        fk.m397a();
        j();
        dd.b(this, this.f955a);
        cy.a((Context) this).b(this.f955a);
        dj.b(this, this.f955a);
        super.onDestroy();
        com.xiaomi.channel.commonutils.logger.c.m15a("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            com.xiaomi.channel.commonutils.logger.c.d("onStart() with intent NULL");
        } else {
            try {
                String stringExtra = intent.getStringExtra(ay.y);
                String stringExtra2 = intent.getStringExtra(ay.I);
                String stringExtra3 = intent.getStringExtra("mipush_app_package");
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && !"miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                    com.xiaomi.channel.commonutils.logger.c.m16a("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), stringExtra, stringExtra2, stringExtra3));
                }
                com.xiaomi.channel.commonutils.logger.c.m16a("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s, intent = %s", intent.getAction(), stringExtra, stringExtra2, stringExtra3, com.xiaomi.push.k.a(intent)));
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("onStart() cause error: ");
                M.append(th.getMessage());
                com.xiaomi.channel.commonutils.logger.c.d(M.toString());
                return;
            }
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f967a.m820a()) {
                    com.xiaomi.channel.commonutils.logger.c.d("ERROR, the job controller is blocked.");
                    ax.a().a(this, 14);
                    stopSelf();
                } else {
                    a(new i(intent));
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                i iVar = new i(intent);
                iVar.a(currentTimeMillis);
                a(iVar);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            com.xiaomi.channel.commonutils.logger.c.c("[Prefs] spend " + currentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return com.xiaomi.push.k.m655a((Context) this) ? 1 : 2;
    }

    private String b() {
        String str;
        com.xiaomi.push.aj.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        int i2 = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            ba a2 = ba.a(this);
            String str2 = null;
            while (true) {
                if (!TextUtils.isEmpty(str2) && a2.a() != 0) {
                    str = a();
                    break;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = a();
                }
                try {
                    synchronized (obj) {
                        if (i2 < 30) {
                            obj.wait(1000L);
                        } else {
                            obj.wait(30000L);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i2++;
            }
        } else {
            str = "CN";
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("wait coutrycode :" + str + " cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " , count = " + i2);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(1:5)|6|(1:8)(1:42)|9|(2:34|(3:36|(1:38)(1:40)|39)(12:41|15|(1:17)|18|(1:20)|21|22|(1:24)|26|(1:28)|29|30))(1:13)|14|15|(0)|18|(0)|21|22|(0)|26|(0)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0100, code lost:
    
        com.xiaomi.channel.commonutils.logger.c.m18a((java.lang.Throwable) r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9 A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ff, blocks: (B:22:0x00f3, B:24:0x00f9), top: B:21:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.c():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (m693a()) {
            if (fk.m398a()) {
                return;
            }
            fk.a(true);
            return;
        }
        fk.m397a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        gp gpVar = this.f956a;
        if (gpVar != null && gpVar.m443c()) {
            com.xiaomi.channel.commonutils.logger.c.d("try to connect while connecting.");
            return;
        }
        gp gpVar2 = this.f956a;
        if (gpVar2 != null && gpVar2.m444d()) {
            com.xiaomi.channel.commonutils.logger.c.d("try to connect while is connected.");
            return;
        }
        this.f957a.b(com.xiaomi.push.ax.m112a((Context) this));
        h();
        if (this.f956a == null) {
            ax.a().a(this);
            c(false);
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m699d() {
        gp gpVar = this.f956a;
        return gpVar != null && gpVar.m443c();
    }

    private void j() {
        synchronized (this.f970a) {
            this.f970a.clear();
        }
    }

    class p extends j {

        /* renamed from: a, reason: collision with other field name */
        ax.b f987a;

        public p(ax.b bVar) {
            super(4);
            this.f987a = null;
            this.f987a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            try {
                this.f987a.a(ax.c.unbind, 1, 16, (String) null, (String) null);
                gp gpVar = XMPushService.this.f956a;
                ax.b bVar = this.f987a;
                gpVar.a(bVar.f9322g, bVar.f1063b);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.a(xMPushService.new b(this.f987a), 300L);
            } catch (gx e2) {
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                XMPushService.this.a(10, e2);
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            StringBuilder M = e.a.a.a.a.M("rebind the client. ");
            M.append(this.f987a.f9322g);
            return M.toString();
        }
    }

    class s extends j {

        /* renamed from: a, reason: collision with other field name */
        ax.b f988a;
        int b;

        /* renamed from: b, reason: collision with other field name */
        String f989b;

        /* renamed from: c, reason: collision with root package name */
        String f9307c;

        public s(ax.b bVar, int i, String str, String str2) {
            super(9);
            this.f988a = null;
            this.f988a = bVar;
            this.b = i;
            this.f989b = str;
            this.f9307c = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            if (this.f988a.f1058a != ax.c.unbind && XMPushService.this.f956a != null) {
                try {
                    gp gpVar = XMPushService.this.f956a;
                    ax.b bVar = this.f988a;
                    gpVar.a(bVar.f9322g, bVar.f1063b);
                } catch (gx e2) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                    XMPushService.this.a(10, e2);
                }
            }
            this.f988a.a(ax.c.unbind, this.b, 0, this.f9307c, this.f989b);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            StringBuilder M = e.a.a.a.a.M("unbind the channel. ");
            M.append(this.f988a.f9322g);
            return M.toString();
        }
    }

    private void h() {
        try {
            this.f955a.a(this.f958a, new gz() { // from class: com.xiaomi.push.service.XMPushService.6
                @Override // com.xiaomi.push.gz
                /* renamed from: a */
                public boolean mo226a(hd hdVar) {
                    return true;
                }
            });
            this.f955a.e();
            this.f956a = this.f955a;
        } catch (gx e2) {
            com.xiaomi.channel.commonutils.logger.c.a("fail to create Slim connection", e2);
            this.f955a.b(3, e2);
        }
    }

    class b extends j {

        /* renamed from: a, reason: collision with other field name */
        ax.b f980a;

        public b(ax.b bVar) {
            super(9);
            this.f980a = null;
            this.f980a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            try {
                if (XMPushService.this.m698c()) {
                    ax a = ax.a();
                    ax.b bVar = this.f980a;
                    ax.b a2 = a.a(bVar.f9322g, bVar.f1063b);
                    if (a2 == null) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("ignore bind because the channel " + this.f980a.f9322g + " is removed ");
                    } else if (a2.f1058a == ax.c.unbind) {
                        a2.a(ax.c.binding, 0, 0, (String) null, (String) null);
                        XMPushService.this.f956a.a(a2);
                        ge.a(XMPushService.this, a2);
                    } else {
                        com.xiaomi.channel.commonutils.logger.c.m15a("trying duplicate bind, ingore! " + a2.f1058a);
                    }
                } else {
                    com.xiaomi.channel.commonutils.logger.c.d("trying bind while the connection is not created, quit!");
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.d("Meet error when trying to bind. " + e2);
                XMPushService.this.a(10, e2);
            } catch (Throwable unused) {
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            StringBuilder M = e.a.a.a.a.M("bind the client. ");
            M.append(this.f980a.f9322g);
            return M.toString();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private int[] m681a() {
        String[] split;
        String a2 = aq.a(getApplicationContext()).a(hz.FallDownTimeRange.a(), "");
        if (!TextUtils.isEmpty(a2) && (split = a2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null && split.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(split[0]).intValue();
                iArr[1] = Integer.valueOf(split[1]).intValue();
                if (iArr[0] >= 0 && iArr[0] <= 23 && iArr[1] >= 0 && iArr[1] <= 23) {
                    if (iArr[0] != iArr[1]) {
                        return iArr;
                    }
                }
            } catch (NumberFormatException e2) {
                com.xiaomi.channel.commonutils.logger.c.d("parse falldown time range failure: " + e2);
            }
        }
        return null;
    }

    private void b(boolean z) {
        this.f952a = SystemClock.elapsedRealtime();
        if (!m698c()) {
            a(true);
        } else if (com.xiaomi.push.ax.m117a((Context) this)) {
            c(new o(z));
        } else {
            c(new g(17, null));
            a(true);
        }
    }

    private String a() {
        String m652a = com.xiaomi.push.k.m652a("ro.miui.region");
        return TextUtils.isEmpty(m652a) ? com.xiaomi.push.k.m652a("ro.product.locale.region") : m652a;
    }

    private static void a(String str) {
        if (com.xiaomi.push.o.China.name().equals(str)) {
            ct.a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            try {
                ct.a("cn.app.chat.xiaomi.net", com.xiaomi.push.bj.b("MTExLjEzLjE0MS4yMTE6NDQz"));
                ct.a("cn.app.chat.xiaomi.net", com.xiaomi.push.bj.b("MzkuMTU2LjgxLjE3Mjo0NDM="));
                ct.a("cn.app.chat.xiaomi.net", com.xiaomi.push.bj.b("MTExLjIwMi4xLjI1MDo0NDM="));
                ct.a("cn.app.chat.xiaomi.net", com.xiaomi.push.bj.b("MTIzLjEyNS4xMDIuMjEzOjQ0Mw=="));
                ct.a("resolver.msg.xiaomi.net", com.xiaomi.push.bj.b("MTExLjEzLjE0Mi4xNTM6NDQz"));
                ct.a("resolver.msg.xiaomi.net", com.xiaomi.push.bj.b("MTExLjIwMi4xLjI1Mjo0NDM="));
            } catch (Exception e2) {
                StringBuilder M = e.a.a.a.a.M("add host fail, error message:");
                M.append(e2.getMessage());
                com.xiaomi.channel.commonutils.logger.c.d(M.toString());
            }
        }
    }

    private void b(Intent intent) {
        long j2;
        String stringExtra = intent.getStringExtra(ay.I);
        String stringExtra2 = intent.getStringExtra(ay.M);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        ax a2 = ax.a();
        gg ggVar = null;
        if (bundleExtra != null) {
            hc hcVar = (hc) a(new hc(bundleExtra), stringExtra, stringExtra2);
            if (hcVar == null) {
                return;
            } else {
                ggVar = gg.a(hcVar, a2.a(hcVar.k(), hcVar.m()).h);
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j2 = Long.parseLong(intent.getStringExtra(ay.v));
                } catch (NumberFormatException unused) {
                    j2 = 0;
                }
                String stringExtra3 = intent.getStringExtra(ay.w);
                String stringExtra4 = intent.getStringExtra(ay.x);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                ax.b a3 = a2.a(stringExtra5, String.valueOf(j2));
                if (a3 != null) {
                    gg ggVar2 = new gg();
                    try {
                        ggVar2.a(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    ggVar2.a("SECMSG", (String) null);
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "xiaomi.com";
                    }
                    ggVar2.a(j2, stringExtra3, stringExtra4);
                    ggVar2.a(intent.getStringExtra("ext_pkt_id"));
                    ggVar2.a(byteArrayExtra, a3.h);
                    com.xiaomi.channel.commonutils.logger.c.m15a("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    ggVar = ggVar2;
                }
            }
        }
        if (ggVar != null) {
            c(new bh(this, ggVar));
        }
    }

    private void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("digest");
        com.xiaomi.push.service.p.a(getApplicationContext()).a(string);
        dd.a(this, string);
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra(ay.I);
        String stringExtra2 = intent.getStringExtra(ay.M);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        hc[] hcVarArr = new hc[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i2 = 0; i2 < parcelableArrayExtra.length; i2++) {
            hcVarArr[i2] = new hc((Bundle) parcelableArrayExtra[i2]);
            hcVarArr[i2] = (hc) a(hcVarArr[i2], stringExtra, stringExtra2);
            if (hcVarArr[i2] == null) {
                return;
            }
        }
        ax a2 = ax.a();
        gg[] ggVarArr = new gg[length];
        for (int i3 = 0; i3 < length; i3++) {
            hc hcVar = hcVarArr[i3];
            ggVarArr[i3] = gg.a(hcVar, a2.a(hcVar.k(), hcVar.m()).h);
        }
        c(new com.xiaomi.push.service.d(this, ggVarArr));
    }

    /* renamed from: e, reason: collision with other method in class */
    public static boolean m684e() {
        return b;
    }

    /* renamed from: a, reason: collision with other method in class */
    void m692a() {
        if (SystemClock.elapsedRealtime() - this.f952a >= gv.a() && com.xiaomi.push.ax.c(this)) {
            b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Intent r16, long r17) {
        /*
            Method dump skipped, instructions count: 2443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.a(android.content.Intent, long):void");
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m697b() {
        try {
            Class<?> a2 = com.xiaomi.push.t.a(this, "miui.os.Build");
            Field field = a2.getField("IS_CM_CUSTOMIZATION_TEST");
            Field field2 = a2.getField("IS_CU_CUSTOMIZATION_TEST");
            Field field3 = a2.getField("IS_CT_CUSTOMIZATION_TEST");
            if (!field.getBoolean(null) && !field2.getBoolean(null)) {
                if (!field3.getBoolean(null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void c(j jVar) {
        this.f967a.a(jVar);
    }

    /* renamed from: b, reason: collision with other method in class */
    public com.xiaomi.push.service.i m695b() {
        return this.f966a;
    }

    private void c(boolean z) {
        try {
            if (com.xiaomi.push.t.m844a()) {
                if (z) {
                    if (com.xiaomi.push.k.m655a((Context) this)) {
                        Intent intent = new Intent("miui.intent.action.NETWORK_CONNECTED");
                        intent.addFlags(BasicMeasure.EXACTLY);
                        sendBroadcast(intent);
                    }
                    for (ag agVar : (ag[]) this.f971a.toArray(new ag[0])) {
                        agVar.mo787a();
                    }
                    return;
                }
                if (com.xiaomi.push.k.m655a((Context) this)) {
                    Intent intent2 = new Intent("miui.intent.action.NETWORK_BLOCKED");
                    intent2.addFlags(BasicMeasure.EXACTLY);
                    sendBroadcast(intent2);
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
        }
    }

    public void b(j jVar) {
        this.f967a.a(((s.b) jVar).a, jVar);
    }

    @Override // com.xiaomi.push.gs
    public void b(gp gpVar) {
        gd.a().b(gpVar);
        c(true);
        this.f965a.m778a();
        if (!fk.m398a() && !m688i()) {
            com.xiaomi.channel.commonutils.logger.c.m15a("reconnection successful, reactivate alarm.");
            fk.a(true);
        }
        Iterator<ax.b> it2 = ax.a().m765a().iterator();
        while (it2.hasNext()) {
            a(new b(it2.next()));
        }
        if (this.f972a || !com.xiaomi.push.k.m655a(getApplicationContext())) {
            return;
        }
        this.f972a = true;
        com.xiaomi.push.t.m843a();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m698c() {
        gp gpVar = this.f956a;
        return gpVar != null && gpVar.m444d();
    }

    /* renamed from: b, reason: collision with other method in class */
    void m696b() {
        com.xiaomi.channel.commonutils.logger.c.e("-->onPong()");
        com.xiaomi.push.service.p.a(getApplicationContext()).m818b();
        com.xiaomi.push.service.a.a().b(this);
        Iterator it2 = new ArrayList(this.f970a).iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).mo487a();
        }
    }

    public void b(n nVar) {
        synchronized (this.f970a) {
            this.f970a.remove(nVar);
        }
    }

    void a(String str, byte[] bArr, boolean z) {
        a(str, bArr, z, ay.a.DEFAULT_CACHE);
    }

    void a(final String str, final byte[] bArr, boolean z, ay.a aVar) {
        Collection<ax.b> m766a = ax.a().m766a("5");
        if (m766a.isEmpty()) {
            if (z) {
                y.a(str, bArr, aVar);
            }
        } else if (m766a.iterator().next().f1058a == ax.c.binded) {
            a(new j(4) { // from class: com.xiaomi.push.service.XMPushService.4
                @Override // com.xiaomi.push.service.XMPushService.j
                public String a() {
                    return "send mi push message";
                }

                @Override // com.xiaomi.push.service.XMPushService.j
                /* renamed from: a */
                public void mo403a() {
                    try {
                        ab.a(XMPushService.this, str, bArr);
                    } catch (gx e2) {
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                        XMPushService.this.a(10, e2);
                    }
                }
            });
        } else if (z) {
            y.a(str, bArr, aVar);
        }
    }

    public void a(byte[] bArr, String str) {
        if (bArr == null) {
            y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            com.xiaomi.channel.commonutils.logger.c.m15a("register request without payload");
            return;
        }
        iq iqVar = new iq();
        try {
            je.a(iqVar, bArr);
            if (iqVar.f731a == hu.Registration) {
                iu iuVar = new iu();
                try {
                    je.a(iuVar, iqVar.m564a());
                    a(new x(this, iqVar.b(), iuVar.b(), iuVar.c(), bArr));
                    eo.a(getApplicationContext()).a(iqVar.b(), "E100003", iuVar.a(), AuthCode.StatusCode.AUTH_INFO_NOT_EXIST, null);
                } catch (jj e2) {
                    com.xiaomi.channel.commonutils.logger.c.d("app register error. " + e2);
                    y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
                }
            } else {
                y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                com.xiaomi.channel.commonutils.logger.c.m15a("register request with invalid payload");
            }
        } catch (jj e3) {
            com.xiaomi.channel.commonutils.logger.c.d("app register fail. " + e3);
            y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    private hd a(hd hdVar, String str, String str2) {
        ax a2 = ax.a();
        List<String> m767a = a2.m767a(str);
        if (m767a.isEmpty()) {
            com.xiaomi.channel.commonutils.logger.c.m15a("open channel should be called first before sending a packet, pkg=" + str);
            return null;
        }
        hdVar.o(str);
        String k2 = hdVar.k();
        if (TextUtils.isEmpty(k2)) {
            k2 = m767a.get(0);
            hdVar.l(k2);
        }
        ax.b a3 = a2.a(k2, hdVar.m());
        if (!m698c()) {
            com.xiaomi.channel.commonutils.logger.c.m15a("drop a packet as the channel is not connected, chid=" + k2);
            return null;
        }
        if (a3 != null && a3.f1058a == ax.c.binded) {
            if (TextUtils.equals(str2, a3.i)) {
                return hdVar;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("invalid session. " + str2);
            return null;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("drop a packet as the channel is not opened, chid=" + k2);
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m680a(String str, Intent intent) {
        ax.b a2 = ax.a().a(str, intent.getStringExtra(ay.v));
        boolean z = false;
        if (a2 != null && str != null) {
            String stringExtra = intent.getStringExtra(ay.M);
            String stringExtra2 = intent.getStringExtra(ay.E);
            if (!TextUtils.isEmpty(a2.i) && !TextUtils.equals(stringExtra, a2.i)) {
                StringBuilder M = e.a.a.a.a.M("session changed. old session=");
                e.a.a.a.a.M0(M, a2.i, ", new session=", stringExtra, " chid = ");
                M.append(str);
                com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                z = true;
            }
            if (!stringExtra2.equals(a2.h)) {
                StringBuilder U = e.a.a.a.a.U("security changed. chid = ", str, " sechash = ");
                U.append(com.xiaomi.push.bl.a(stringExtra2));
                com.xiaomi.channel.commonutils.logger.c.m15a(U.toString());
                return true;
            }
        }
        return z;
    }

    private ax.b a(String str, Intent intent) {
        ax.b a2 = ax.a().a(str, intent.getStringExtra(ay.v));
        if (a2 == null) {
            a2 = new ax.b(this);
        }
        a2.f9322g = intent.getStringExtra(ay.y);
        a2.f1063b = intent.getStringExtra(ay.v);
        a2.f9318c = intent.getStringExtra(ay.C);
        a2.f1060a = intent.getStringExtra(ay.I);
        a2.f9320e = intent.getStringExtra(ay.G);
        a2.f9321f = intent.getStringExtra(ay.H);
        a2.f1062a = intent.getBooleanExtra(ay.F, false);
        a2.h = intent.getStringExtra(ay.E);
        a2.i = intent.getStringExtra(ay.M);
        a2.f9319d = intent.getStringExtra(ay.D);
        a2.f1059a = this.f966a;
        a2.a((Messenger) intent.getParcelableExtra(ay.Q));
        a2.f1052a = getApplicationContext();
        ax.a().a(a2);
        return a2;
    }

    public void a(String str, String str2, int i2, String str3, String str4) {
        ax.b a2 = ax.a().a(str, str2);
        if (a2 != null) {
            a(new s(a2, i2, str4, str3));
        }
        ax.a().m770a(str, str2);
    }

    private void a(String str, int i2) {
        Collection<ax.b> m766a = ax.a().m766a(str);
        if (m766a != null) {
            for (ax.b bVar : m766a) {
                if (bVar != null) {
                    a(new s(bVar, i2, null, null));
                }
            }
        }
        ax.a().m769a(str);
    }

    public void a(j jVar) {
        a(jVar, 0L);
    }

    public void a(j jVar, long j2) {
        try {
            this.f967a.a(jVar, j2);
        } catch (IllegalStateException e2) {
            StringBuilder M = e.a.a.a.a.M("can't execute job err = ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        }
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            }
        }
    }

    public void a(gg ggVar) {
        gp gpVar = this.f956a;
        if (gpVar != null) {
            gpVar.b(ggVar);
            return;
        }
        throw new gx("try send msg while connection is null.");
    }

    public void a(gg[] ggVarArr) {
        gp gpVar = this.f956a;
        if (gpVar != null) {
            gpVar.a(ggVarArr);
            return;
        }
        throw new gx("try send msg while connection is null.");
    }

    public void a(boolean z) {
        this.f965a.a(z);
    }

    public void a(ax.b bVar) {
        if (bVar != null) {
            long a2 = bVar.a();
            StringBuilder M = e.a.a.a.a.M("schedule rebind job in ");
            M.append(a2 / 1000);
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            a(new b(bVar), a2);
        }
    }

    public void a(int i2, Exception exc) {
        StringBuilder M = e.a.a.a.a.M("disconnect ");
        M.append(hashCode());
        M.append(", ");
        gp gpVar = this.f956a;
        M.append(gpVar == null ? null : Integer.valueOf(gpVar.hashCode()));
        com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        gp gpVar2 = this.f956a;
        if (gpVar2 != null) {
            gpVar2.b(i2, exc);
            this.f956a = null;
        }
        a(7);
        a(4);
        ax.a().a(this, i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m693a() {
        boolean m117a = com.xiaomi.push.ax.m117a((Context) this);
        boolean z = ax.a().m764a() > 0;
        boolean z2 = !m697b();
        boolean m687h = m687h();
        boolean z3 = !m686g();
        boolean z4 = m117a && z && z2 && m687h && z3;
        if (!z4) {
            com.xiaomi.channel.commonutils.logger.c.e(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", Boolean.valueOf(m117a), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(m687h), Boolean.valueOf(z3)));
        }
        return z4;
    }

    /* renamed from: a, reason: collision with other method in class */
    public com.xiaomi.push.service.i m691a() {
        return new com.xiaomi.push.service.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            com.xiaomi.push.aj.a();
            for (int i2 = 100; i2 > 0; i2--) {
                if (com.xiaomi.push.ax.b(context)) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("network connectivity ok. count=" + i2);
                    return true;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public gp m690a() {
        return this.f956a;
    }

    public void a(int i2) {
        this.f967a.a(i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m694a(int i2) {
        return this.f967a.m821a(i2);
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar) {
        com.xiaomi.channel.commonutils.logger.c.c("begin to connect...");
        gd.a().a(gpVar);
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar, int i2, Exception exc) {
        gd.a().a(gpVar, i2, exc);
        er.a().a(i2, exc);
        if (m688i()) {
            return;
        }
        a(false);
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar, Exception exc) {
        gd.a().a(gpVar, exc);
        c(false);
        if (m688i()) {
            return;
        }
        a(false);
    }

    public void a(n nVar) {
        synchronized (this.f970a) {
            this.f970a.add(nVar);
        }
    }
}
