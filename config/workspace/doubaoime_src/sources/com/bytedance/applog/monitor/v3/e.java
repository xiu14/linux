package com.bytedance.applog.monitor.v3;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.w.k;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.RomInfo;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e implements Handler.Callback {
    private static final List<String> j = Collections.singletonList("MonitorV3Helper");
    private static final String k = UUID.randomUUID().toString();
    private static int l = 3590;
    private final a a;
    private final com.bytedance.applog.monitor.v3.h.a b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.applog.monitor.v3.h.b f3830c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.applog.monitor.v3.h.c f3831d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f3832e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f3833f;

    /* renamed from: g, reason: collision with root package name */
    private c f3834g;
    private final AtomicBoolean h;
    private final JSONObject i;

    public e() {
        a aVar = new a();
        this.a = aVar;
        this.b = new com.bytedance.applog.monitor.v3.h.a(aVar);
        this.f3830c = new com.bytedance.applog.monitor.v3.h.b(aVar);
        this.f3831d = new com.bytedance.applog.monitor.v3.h.c(aVar);
        this.f3832e = new JSONObject();
        this.h = new AtomicBoolean(false);
        this.i = new JSONObject();
        u("cold_start_id", k);
    }

    public void g() {
        if (this.f3833f == null) {
            return;
        }
        k.z().j(8, j, "monitor flush...", new Object[0]);
        this.f3833f.removeMessages(1);
        this.f3833f.sendEmptyMessageDelayed(1, 500L);
    }

    @NonNull
    public a h() {
        return this.a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        c cVar;
        if (message.what == 1 && l() && (cVar = this.f3834g) != null && cVar.e() != null && this.f3834g.d() != null && !TextUtils.isEmpty(this.f3834g.f())) {
            k.z().j(8, j, "start doReport...", new Object[0]);
            this.f3834g.d().submit(new d(this, this.a.d(), this.a.c(), this.f3834g.e(), this.f3834g.f()));
            this.f3833f.removeMessages(1);
            this.f3833f.sendEmptyMessageDelayed(1, this.a.e());
        }
        return false;
    }

    public void i(StatsCountKeys statsCountKeys, int i) {
        if (l()) {
            k.z().j(8, j, "increaseStats {} +{}", statsCountKeys, Integer.valueOf(i));
            this.f3831d.c(statsCountKeys, i);
        }
    }

    public void j(c cVar) {
        k.z().j(8, j, "init monitor v3 helper with config: {}", cVar);
        if (this.h.compareAndSet(false, true)) {
            this.f3834g = cVar;
            b a = cVar.a();
            if (!this.a.j() || cVar.b() == null || a == null) {
                this.b.b();
                this.f3830c.e();
                this.f3831d.f();
                return;
            }
            u(WsConstants.KEY_APP_ID, String.valueOf(l));
            u("host_aid", a.a());
            u("channel", a.d());
            u("cdid", a.c());
            u("sdk_version", a.e());
            u(RomInfo.KEY_OS_TYPE, "Android");
            u(RomInfo.KEY_ROM_OS_VERSION, Build.VERSION.RELEASE);
            u("app_name", a.b());
            u("app_version", a.g());
            u("update_version_code", String.valueOf(a.f()));
            if (a.j()) {
                r("log_enable", 1L);
            }
            if (a.h()) {
                r("devtools_enable", 1L);
            }
            if (a.l()) {
                r("tourist_mode", 1L);
            }
            if (a.i()) {
                r("frequency_control_enable", 1L);
            }
            if (a.k()) {
                r("log_event_filter_enable", 1L);
            }
            if (k()) {
                r("debug_mode", 1L);
            }
            r("report_interval", cVar.c());
            String a2 = a.a();
            this.a.h(cVar.b(), a2);
            HandlerThread handlerThread = new HandlerThread(a.a() + "@applog_monitor_v3");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f3833f = handler;
            handler.sendEmptyMessageDelayed(1, this.a.a());
            Objects.requireNonNull(this.b);
            this.f3830c.d(cVar.b(), handlerThread, a2);
            this.f3831d.e(cVar.b(), handlerThread, a2);
        }
    }

    public boolean k() {
        return this.a.i();
    }

    public boolean l() {
        return this.a.j();
    }

    public boolean m(String str) {
        if (o()) {
            return this.f3830c.g(str);
        }
        return false;
    }

    public boolean n(String str) {
        if (o()) {
            return this.f3830c.h(str);
        }
        return false;
    }

    public boolean o() {
        return l() && this.a.l();
    }

    public boolean p() {
        return o() && this.f3830c.f();
    }

    public void q(String str, Throwable th) {
        if (l() && this.a.k()) {
            k.z().j(8, j, "sendError {} -> {}", str, th);
            this.b.c(str, th);
        }
    }

    public void r(String str, long j2) {
        if (l()) {
            k.z().j(8, j, "setFeature int {} = {}", str, Long.valueOf(j2));
            synchronized (this.i) {
                try {
                    this.i.put(str, j2);
                } finally {
                }
            }
        }
    }

    public void s(String str, boolean z) {
        if (l()) {
            k.z().j(8, j, "setFeature boolean {} = {}", str, Boolean.valueOf(z));
            synchronized (this.i) {
                try {
                    this.i.put(str, z ? 1 : 0);
                } finally {
                }
            }
        }
    }

    public void t(String str, String str2) {
        if (l()) {
            k.z().j(8, j, "setHeader {} = {}", str, str2);
            try {
                this.f3832e.put(str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    public void u(String str, String str2) {
        if (l()) {
            k.z().j(8, j, "setStringHeader {}: {}", str, str2);
            try {
                this.f3832e.put(str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    public void v(EventStage eventStage, @Nullable String str, String str2, long j2, @Nullable StageEventType stageEventType) {
        if (o()) {
            k.z().j(8, j, "stageEvent {} -> event: {}, monitor_id: {}, ts: {}, type: {}", eventStage, str, str2, Long.valueOf(j2), stageEventType);
            this.f3830c.j(eventStage, str, str2, j2, stageEventType);
        }
    }
}
