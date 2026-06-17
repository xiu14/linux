package com.bytedance.monitor.collector;

import android.util.Pair;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;

/* loaded from: classes.dex */
public class k extends c {

    /* renamed from: e, reason: collision with root package name */
    private int f5467e;

    /* renamed from: f, reason: collision with root package name */
    private int f5468f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5469g;
    com.bytedance.monitor.util.thread.e h;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (k.this) {
                if (j.l) {
                    MonitorJni.doCollect();
                }
            }
        }
    }

    k(int i) {
        super(i, "proc_monitor");
        this.f5467e = 200;
        this.f5468f = 1000;
        this.f5469g = true;
        this.h = com.bytedance.monitor.util.thread.c.d("collect-proc", new a());
    }

    @Override // com.bytedance.monitor.collector.c
    public synchronized Pair<String, String> a() {
        try {
            if (!j.l) {
                return null;
            }
            return new Pair<>(this.a, MonitorJni.getProcInfos());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public synchronized Pair<String, String> b(long j, long j2) {
        try {
            if (!j.l) {
                return null;
            }
            return new Pair<>(this.a, MonitorJni.getProcInfoTimeRange(j, j2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public void c() {
        super.c();
        try {
            if (j.l && this.f5423c != 0) {
                boolean z = this.f5469g;
                if (z) {
                    this.f5468f = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
                } else {
                    this.f5468f = 1000;
                }
                MonitorJni.keepProcHyperOpen(z);
                MonitorJni.doStart();
                com.bytedance.monitor.util.thread.d dVar = this.f5424d;
                if (dVar != null) {
                    ((com.bytedance.monitor.util.thread.a) dVar).m(this.h, 0L, this.f5468f);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.monitor.collector.c
    protected void d(int i) {
        try {
            if (j.l) {
                this.b = 1;
                try {
                    if (j.l) {
                        com.bytedance.monitor.util.thread.d dVar = this.f5424d;
                        if (dVar != null) {
                            ((com.bytedance.monitor.util.thread.a) dVar).l(this.h);
                        }
                        MonitorJni.doStop();
                    }
                } catch (Throwable unused) {
                }
                if (i != 0) {
                    if (i == 1) {
                        this.f5467e = 200;
                        this.f5468f = 1000;
                        MonitorJni.setBufferSize(200);
                    } else if (i == 2 || i == 3) {
                        this.f5467e = 400;
                        this.f5468f = 1000;
                        MonitorJni.setBufferSize(400);
                    }
                    c();
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
