package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.push.fk;

/* loaded from: classes2.dex */
public class XMJobService extends Service {
    static Service a;

    /* renamed from: a, reason: collision with other field name */
    private IBinder f950a = null;

    @TargetApi(21)
    static class a extends JobService {
        Binder a;

        /* renamed from: a, reason: collision with other field name */
        private Handler f951a;

        /* renamed from: com.xiaomi.push.service.XMJobService$a$a, reason: collision with other inner class name */
        private static class HandlerC0412a extends Handler {
            JobService a;

            HandlerC0412a(JobService jobService) {
                super(jobService.getMainLooper());
                this.a = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                JobParameters jobParameters = (JobParameters) message.obj;
                StringBuilder M = e.a.a.a.a.M("Job finished ");
                M.append(jobParameters.getJobId());
                com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                this.a.jobFinished(jobParameters, false);
                if (jobParameters.getJobId() == 1) {
                    fk.a(false);
                }
            }
        }

        a(Service service) {
            this.a = null;
            this.a = (Binder) com.xiaomi.push.bh.a((Object) this, "onBind", new Intent());
            com.xiaomi.push.bh.a((Object) this, "attachBaseContext", service);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            StringBuilder M = e.a.a.a.a.M("Job started ");
            M.append(jobParameters.getJobId());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            Intent intent = new Intent(this, (Class<?>) XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f951a == null) {
                this.f951a = new HandlerC0412a(this);
            }
            Handler handler = this.f951a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            StringBuilder M = e.a.a.a.a.M("Job stop ");
            M.append(jobParameters.getJobId());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f950a;
        return iBinder != null ? iBinder : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f950a = new a(this).a;
        a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        a = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (com.xiaomi.push.k.m655a((Context) this)) {
            return onStartCommand;
        }
        return 2;
    }
}
