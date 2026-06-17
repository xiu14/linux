package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.fk;
import com.xiaomi.push.service.XMJobService;

@TargetApi(21)
/* loaded from: classes2.dex */
public class fp implements fk.a {
    JobScheduler a;

    /* renamed from: a, reason: collision with other field name */
    Context f433a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f434a = false;

    fp(Context context) {
        this.f433a = context;
        this.a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    void a(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f433a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        JobInfo build = builder.build();
        StringBuilder M = e.a.a.a.a.M("schedule Job = ");
        M.append(build.getId());
        M.append(" in ");
        M.append(j);
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        this.a.schedule(builder.build());
    }

    @Override // com.xiaomi.push.fk.a
    /* renamed from: b */
    public void mo396b() {
    }

    @Override // com.xiaomi.push.fk.a
    public long a() {
        return gv.b();
    }

    @Override // com.xiaomi.push.fk.a
    public void a(boolean z) {
        if (z || this.f434a) {
            long b = gv.b();
            if (z) {
                mo394a();
                b -= SystemClock.elapsedRealtime() % b;
            }
            this.f434a = true;
            a(b);
        }
    }

    @Override // com.xiaomi.push.fk.a
    /* renamed from: a */
    public void mo394a() {
        this.f434a = false;
        this.a.cancel(1);
    }

    @Override // com.xiaomi.push.fk.a
    /* renamed from: a */
    public boolean mo395a() {
        return this.f434a;
    }
}
