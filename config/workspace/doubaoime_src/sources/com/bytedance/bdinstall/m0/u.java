package com.bytedance.bdinstall.m0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.bytedance.bdinstall.C0640u;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class u<SERVICE, RESULT> {
    private final CountDownLatch a = new CountDownLatch(1);
    private final Intent b;

    /* renamed from: c, reason: collision with root package name */
    private final b<SERVICE, RESULT> f4081c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f4082d;

    class a implements ServiceConnection {
        private final CountDownLatch a;
        private final b<SERVICE, RESULT> b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        SERVICE f4083c;

        a(u uVar, CountDownLatch countDownLatch, b<SERVICE, RESULT> bVar) {
            this.a = countDownLatch;
            this.b = bVar;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = "Oaid#ServiceBlockBinder#onServiceConnected " + componentName;
            int i = C0640u.a;
            try {
                try {
                    this.f4083c = this.b.a(iBinder);
                    this.a.countDown();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        String str2 = "Oaid#ServiceBlockBinder#onServiceConnected #Throwable " + th;
                        this.a.countDown();
                    } catch (Throwable th2) {
                        try {
                            this.a.countDown();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        throw th2;
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            String str = "Oaid#ServiceBlockBinder#onServiceDisconnected" + componentName;
            int i = C0640u.a;
            try {
                this.a.countDown();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    interface b<T, RESULT> {
        T a(IBinder iBinder);

        RESULT b(T t) throws Exception;
    }

    u(Context context, Intent intent, b<SERVICE, RESULT> bVar) {
        this.f4082d = context;
        this.b = intent;
        this.f4081c = bVar;
    }

    private void b(u<SERVICE, RESULT>.a aVar) {
        if (aVar != null) {
            try {
                this.f4082d.unbindService(aVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    RESULT a() {
        u<SERVICE, RESULT>.a aVar;
        try {
            aVar = new a(this, this.a, this.f4081c);
        } catch (Throwable th) {
            th = th;
            aVar = null;
        }
        if (!this.f4082d.bindService(this.b, aVar, 1)) {
            b(null);
            return null;
        }
        this.a.await();
        try {
            return this.f4081c.b(aVar.f4083c);
        } catch (Throwable th2) {
            th = th2;
            try {
                th.printStackTrace();
                return null;
            } finally {
                b(aVar);
            }
        }
    }
}
