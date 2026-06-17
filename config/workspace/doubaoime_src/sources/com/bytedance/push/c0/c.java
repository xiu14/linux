package com.bytedance.push.c0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.ss.ttuploader.TTUploadResolver;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/* loaded from: classes2.dex */
public final class c implements Observer, Handler.Callback {
    private final Handler a = new Handler(Looper.getMainLooper(), this);
    private final b b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.push.Q.b f5634c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5635d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5636e;

    /* renamed from: f, reason: collision with root package name */
    private a f5637f;

    /* renamed from: g, reason: collision with root package name */
    private long f5638g;

    public c(b bVar, com.bytedance.push.Q.b bVar2) {
        this.b = bVar;
        this.f5634c = bVar2;
    }

    private void a(boolean z) {
        this.f5637f.f5629c = com.ss.android.message.f.a.f();
        this.f5637f.f5630d = SystemClock.elapsedRealtime();
        a aVar = this.f5637f;
        this.f5634c.d("push_proc_stat", "save: aliveTs = " + aVar + ", duration = " + aVar.a());
        b bVar = this.b;
        boolean z2 = z && this.f5636e;
        d dVar = (d) bVar;
        Objects.requireNonNull(dVar);
        com.bytedance.common.utility.h.c.b(new f(dVar, aVar, z2, true));
    }

    private void b() {
        a aVar = new a();
        aVar.a = SystemClock.elapsedRealtime();
        aVar.b = com.ss.android.message.f.a.f();
        boolean j = com.bytedance.common.push.b.e().j();
        aVar.f5631e = j;
        long f2 = j ? ((d) this.b).f() : ((d) this.b).g();
        if (this.f5636e || SystemClock.elapsedRealtime() - this.f5638g > com.heytap.mcssdk.constant.a.f6886d) {
            f2 = aVar.f5631e ? ((d) this.b).e() : ((d) this.b).h();
        }
        aVar.f5633g = f2;
        if (!((d) this.b).j()) {
            Objects.requireNonNull((d) this.b);
            aVar.h = com.ss.android.pushmanager.setting.a.a().c();
            aVar.i = ((d) this.b).k();
            aVar.j = ((d) this.b).l();
        }
        this.f5637f = aVar;
        this.f5634c.d("push_proc_stat", "pollSample: start_ts = " + aVar + ", mIsBg = " + aVar.f5631e + ", delay = " + f2);
        this.a.removeMessages(10087);
        this.a.sendEmptyMessageDelayed(10087, f2);
    }

    public void c() {
        if (this.f5635d) {
            return;
        }
        this.f5635d = true;
        this.a.sendEmptyMessage(10085);
    }

    public void d() {
        this.a.sendEmptyMessageDelayed(10089, new Random().nextInt(TTUploadResolver.HOST_MAX_CACHE_TIME));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d8, code lost:
    
        return false;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r10 = r10.what
            r1 = 1
            java.lang.String r2 = "push_proc_stat"
            switch(r10) {
                case 10085: goto L55;
                case 10086: goto L46;
                case 10087: goto L37;
                case 10088: goto L28;
                case 10089: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Ld8
        Le:
            com.bytedance.push.Q.b r10 = r9.f5634c
            java.lang.String r3 = "UPLOAD_LAST"
            r10.d(r2, r3)
            r9.f5636e = r1
            com.bytedance.push.c0.b r10 = r9.b
            com.bytedance.push.c0.d r10 = (com.bytedance.push.c0.d) r10
            java.util.Objects.requireNonNull(r10)
            com.bytedance.push.c0.e r1 = new com.bytedance.push.c0.e
            r1.<init>(r10, r0)
            com.bytedance.common.utility.h.c.b(r1)
            goto Ld8
        L28:
            com.bytedance.push.Q.b r10 = r9.f5634c
            java.lang.String r3 = "ZONE_TIME"
            r10.d(r2, r3)
            r9.a(r1)
            r9.b()
            goto Ld8
        L37:
            com.bytedance.push.Q.b r10 = r9.f5634c
            java.lang.String r1 = "POLL"
            r10.d(r2, r1)
            r9.a(r0)
            r9.b()
            goto Ld8
        L46:
            com.bytedance.push.Q.b r10 = r9.f5634c
            java.lang.String r1 = "APP_STATS_CHANGED"
            r10.d(r2, r1)
            r9.a(r0)
            r9.b()
            goto Ld8
        L55:
            com.bytedance.push.Q.b r10 = r9.f5634c
            java.lang.String r3 = "onStart"
            r10.d(r2, r3)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r9.f5638g = r3
            com.bytedance.common.push.b r10 = com.bytedance.common.push.b.e()
            r10.addObserver(r9)
            long r3 = com.ss.android.message.f.a.f()
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            r5 = 11
            r10.set(r5, r0)
            r5 = 12
            r10.set(r5, r0)
            r5 = 13
            r10.set(r5, r0)
            r5 = 5
            r10.add(r5, r1)
            long r5 = r10.getTimeInMillis()
            com.bytedance.push.Q.b r10 = r9.f5634c
            boolean r10 = r10.a()
            if (r10 == 0) goto Lb2
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r10.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r5)
            com.bytedance.push.Q.b r7 = r9.f5634c
            java.lang.String r8 = "next zone time = "
            java.lang.StringBuilder r8 = e.a.a.a.a.M(r8)
            java.lang.String r10 = r10.format(r1)
            r8.append(r10)
            java.lang.String r10 = r8.toString()
            r7.d(r2, r10)
        Lb2:
            long r5 = r5 - r3
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 15
            long r1 = r10.toMillis(r1)
            long r5 = r5 - r1
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 5
            long r2 = r10.toMillis(r2)
            int r10 = (int) r2
            int r10 = r1.nextInt(r10)
            long r1 = (long) r10
            long r5 = r5 + r1
            android.os.Handler r10 = r9.a
            r1 = 10088(0x2768, float:1.4136E-41)
            r10.sendEmptyMessageDelayed(r1, r5)
            r9.b()
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.c0.c.handleMessage(android.os.Message):boolean");
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (obj instanceof Boolean) {
            this.a.sendEmptyMessage(10086);
        }
    }
}
