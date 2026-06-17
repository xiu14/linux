package com.huawei.c.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b {
    private HandlerThread a;
    private Handler b;

    /* renamed from: c, reason: collision with root package name */
    private long f6973c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f6974d;

    /* renamed from: e, reason: collision with root package name */
    private Context f6975e;

    public b(Context context) {
        this.f6975e = context;
    }

    static void a(b bVar) {
        Objects.requireNonNull(bVar);
        Log.i("HapticsKit", "onReportFunc");
        if (bVar.f6973c == 0) {
            bVar.f6973c = SystemClock.elapsedRealtime();
            com.huawei.devices.utils.a.a();
            Log.i("HapticsKit", "HIA onReportFunc");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = ((int) (elapsedRealtime - bVar.f6973c)) / 3600000;
        if (j >= 24) {
            bVar.f6973c = elapsedRealtime;
            Log.i("HapticsKit", "HIA REPORTER costTime" + j);
            com.huawei.devices.utils.a.a();
        }
    }

    public c b(int i) {
        if (this.f6975e == null) {
            Log.e("HapticsKit", "context values is NULL");
            throw new d("NullPointerException");
        }
        Log.d("HapticsKit", "HapticsKitAdapter initialize");
        String packageName = this.f6975e.getPackageName();
        this.f6974d = packageName;
        if (packageName == null) {
            Log.d("HapticsKit", "Context.getPackageName is null");
            throw new d("Context.getPackageName is null");
        }
        com.huawei.devices.utils.a.b(this.f6975e);
        com.huawei.devices.utils.a.d(new com.huawei.devices.utils.c(this.f6975e, this.f6974d, "HapticsKit", "1.0.1.500"));
        if (this.a != null) {
            Log.e("HapticsKit", "Thread had ready");
        } else {
            HandlerThread handlerThread = new HandlerThread("report_func");
            this.a = handlerThread;
            handlerThread.start();
            Looper looper = this.a.getLooper();
            if (looper != null) {
                this.b = new a(this, looper);
            }
        }
        if (i != 1) {
            return null;
        }
        return new e(this.b, this.f6975e);
    }
}
