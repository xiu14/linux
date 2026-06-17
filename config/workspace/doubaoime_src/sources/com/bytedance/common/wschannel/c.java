package com.bytedance.common.wschannel;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes.dex */
class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    private static WeakHandler f4190d = new WeakHandler(Looper.getMainLooper(), new a());
    private InterfaceC0179c b;
    private boolean a = false;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f4191c = new b();

    static class a implements WeakHandler.IHandler {
        a() {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("sRunnable AppAlive = ");
                M.append(c.this.a);
                Logger.d("WsChannelSdk", M.toString());
            }
            if (c.this.a) {
                c.this.a = false;
                if (c.this.b != null) {
                    c.this.b.a();
                }
            }
        }
    }

    /* renamed from: com.bytedance.common.wschannel.c$c, reason: collision with other inner class name */
    public interface InterfaceC0179c {
        void a();

        void b();
    }

    c() {
    }

    public void d(InterfaceC0179c interfaceC0179c) {
        this.b = interfaceC0179c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.a) {
            f4190d.postDelayed(this.f4191c, WsConstants.EXIT_DELAY_TIME);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!this.a) {
            this.a = true;
            InterfaceC0179c interfaceC0179c = this.b;
            if (interfaceC0179c != null) {
                interfaceC0179c.b();
            }
        }
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("onResume sAppAlive = ");
            M.append(this.a);
            Logger.d("WsChannelSdk", M.toString());
        }
        f4190d.removeCallbacks(this.f4191c);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
