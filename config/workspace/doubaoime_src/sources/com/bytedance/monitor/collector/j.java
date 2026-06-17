package com.bytedance.monitor.collector;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm6.perf.base.model.ThreadStatInfo;
import com.bytedance.monitor.collector.e;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {
    static volatile boolean l = false;
    private static volatile j m;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5466g;
    private BinderMonitor h;
    private k i;
    private d j;
    private e k;
    private volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f5462c = false;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f5463d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f5464e = false;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f5465f = false;
    private final List<c> a = new CopyOnWriteArrayList();

    class a implements com.bytedance.services.apm.api.d {
        a() {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onActivityPause(Activity activity) {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onActivityResume(Activity activity) {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onActivityStarted(Activity activity) {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onBackground(Activity activity) {
            Objects.requireNonNull(j.this);
        }

        @Override // com.bytedance.services.apm.api.d
        public void onChange(Activity activity, Fragment fragment) {
        }

        @Override // com.bytedance.services.apm.api.d
        public void onFront(Activity activity) {
            Objects.requireNonNull(j.this);
        }
    }

    private j() {
        ActivityLifeObserver.getInstance().register(new a());
    }

    public static j h() {
        if (m == null) {
            synchronized (j.class) {
                if (m == null) {
                    m = new j();
                }
            }
        }
        return m;
    }

    public static boolean l() {
        return l;
    }

    public static synchronized boolean m(Context context) {
        boolean z;
        synchronized (j.class) {
            if (!l) {
                l = e.b.i.a.f.b.a(context, "monitorcollector-lib");
                ByteHook.init();
            }
            z = l;
        }
        return z;
    }

    public void a(c cVar) {
        if (this.a.contains(cVar)) {
            return;
        }
        this.a.add(cVar);
        if (this.f5462c) {
            cVar.c();
        }
    }

    public long b() {
        if (!this.f5466g) {
            return com.bytedance.apm.util.b.a();
        }
        if (!l) {
            return 0L;
        }
        try {
            return MonitorJni.doGetAppCpuTime();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < this.a.size(); i++) {
            try {
                Pair<String, ?> a2 = this.a.get(i).a();
                jSONObject.put((String) a2.first, a2.second);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public JSONObject d(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < this.a.size(); i++) {
            try {
                Pair<String, ?> b = this.a.get(i).b(j, j2);
                jSONObject.put((String) b.first, b.second);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public String e(int i) {
        return MonitorJni.doDumpNativeStack(i);
    }

    public ThreadStatInfo f(int i, int i2) {
        return MonitorJni.getThreadStatInfo(i, i2);
    }

    public long g(int i) {
        if (this.f5466g) {
            if (!l) {
                return 0L;
            }
            try {
                return MonitorJni.getTotalCPUTimeByTimeInStat(i);
            } catch (Throwable unused) {
                return 0L;
            }
        }
        int b = com.bytedance.apm.util.b.b();
        long j = -1;
        if (b > 0) {
            for (int i2 = 0; i2 < b; i2++) {
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/stats/time_in_state"), 50);
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine != null && !readLine.isEmpty()) {
                                String[] split = readLine.split("\\s+");
                                if (split.length == 2) {
                                    j += Long.parseLong(split[1]);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return j;
    }

    public e.g i() {
        e eVar = this.k;
        if (eVar == null) {
            return null;
        }
        return eVar.t();
    }

    public int j(int i) {
        return MonitorJni.getProcCGroup(i);
    }

    public synchronized void k(Context context, @NonNull i iVar) {
        if (!this.b) {
            if (m(context)) {
                try {
                    if (l) {
                        MonitorJni.doInit();
                    }
                } catch (Throwable unused) {
                }
                t(iVar);
                this.b = true;
            }
            return;
        }
        if (com.bytedance.apm.g.B()) {
            Log.w("PerfMonitorManager", "PerfMonitorManager init twice? " + iVar, new Throwable());
        }
        t(iVar);
    }

    public void n() {
        this.f5463d = true;
    }

    public void o(int i) {
        if (this.f5463d) {
            for (c cVar : this.a) {
                if (cVar != null) {
                    com.bytedance.monitor.util.thread.e d2 = com.bytedance.monitor.util.thread.c.d("refreshConfig", new b(cVar, i));
                    com.bytedance.monitor.util.thread.d dVar = cVar.f5424d;
                    if (dVar != null) {
                        ((com.bytedance.monitor.util.thread.a) dVar).j(d2);
                    }
                }
            }
        }
    }

    public void p(boolean z) {
        this.f5466g = z;
    }

    public void q(boolean z) {
        this.f5464e = z;
    }

    public void r() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).c();
        }
        this.f5462c = true;
    }

    public synchronized void s(long j, boolean z) {
        LockMonitorManager.setOpenFetchStack(true);
        if (l) {
            try {
                MonitorJni.enableLockAll(j, z);
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized boolean t(i iVar) {
        if (com.bytedance.apm.g.B()) {
            Log.i("PerfMonitorManager", "PerfMonitorManager update config:\n " + iVar);
            try {
                if (l) {
                    MonitorJni.doSetDebugMode(true);
                }
            } catch (Throwable unused) {
            }
        }
        if (!l) {
            return false;
        }
        this.f5465f = iVar.f();
        if (this.i == null) {
            this.i = new k(iVar.b());
        }
        if (iVar.d()) {
            if (this.h == null) {
                this.h = new BinderMonitor(iVar.b());
            }
            Objects.requireNonNull(this.h);
            MonitorJni.enableBinderHook();
        }
        if (iVar.c()) {
            if (this.j == null) {
                this.j = new d(iVar.b());
            }
            d dVar = this.j;
            long a2 = iVar.a();
            Objects.requireNonNull(dVar);
            try {
                if (l) {
                    MonitorJni.doEnableAtrace(dVar.f5423c, a2);
                }
            } catch (Throwable unused2) {
            }
        }
        if (iVar.e() && this.k == null) {
            this.k = new e(iVar.b(), false);
        }
        return true;
    }
}
