package com.bytedance.push;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.trace.Constants;
import com.bytedance.android.service.manager.push.trace.PushTraceExternalService;
import com.bytedance.android.service.manager.push.trace.PushTraceSceneType;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.third.PushManager;
import com.ss.android.message.NotifyService;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class E implements com.bytedance.push.interfaze.s {
    private Map<Integer, Boolean> a = new ConcurrentHashMap();
    private com.bytedance.push.d0.e b = new com.bytedance.push.d0.e(this);

    class a implements Runnable {
        final /* synthetic */ boolean a;

        a(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.push.d0.e eVar = E.this.b;
            boolean z = this.a;
            synchronized (eVar) {
                eVar.c(null, z, false);
            }
        }
    }

    class b implements ServiceConnection {
        final /* synthetic */ Context a;

        b(E e2, Context context) {
            this.a = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.a.unbindService(this);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    E() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context) {
        int a2 = com.ss.android.pushmanager.setting.c.c().e().a();
        if (a2 > -1) {
            com.bytedance.push.g0.f.g("", "registerAliPush: aliPushType = " + a2);
            if (PushManager.inst().needDisableChannelInvoke(context, a2)) {
                return;
            }
            e(context, a2);
        }
    }

    private boolean e(Context context, int i) {
        if (!com.bytedance.push.third.g.p(i) || context == null) {
            return false;
        }
        PushManager.inst().registerPush(context, i);
        return true;
    }

    private boolean h(Context context, int i) {
        if (context == null) {
            return false;
        }
        com.ss.android.pushmanager.setting.c c2 = com.ss.android.pushmanager.setting.c.c();
        if (!c2.i() && c2.g().j()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (com.bytedance.push.third.g.p(i)) {
            if (!(applicationContext == null ? false : PushManager.inst().isPushAvailable(applicationContext, i)) || PushManager.inst().needDisableChannelInvoke(applicationContext, i)) {
                return false;
            }
            synchronized (this) {
                Boolean bool = this.a.get(Integer.valueOf(i));
                if (bool != null && bool.booleanValue()) {
                    return true;
                }
                this.a.put(Integer.valueOf(i), Boolean.TRUE);
                return e(applicationContext, i);
            }
        }
        return false;
    }

    public boolean d(Context context) {
        boolean z = false;
        try {
            Objects.requireNonNull(com.bytedance.push.third.g.o(context));
            int i = 6;
            if (com.bytedance.push.third.g.p(6)) {
                if (com.bytedance.push.g0.f.d()) {
                    com.bytedance.push.g0.f.c("PushStart", "registerUmPush process = " + com.ss.android.message.f.a.h(context));
                }
                Objects.requireNonNull(com.bytedance.push.third.g.o(context));
                Objects.requireNonNull(com.bytedance.push.third.g.o(context));
                z = h(context, 6);
            } else {
                i = -1;
            }
            com.ss.android.pushmanager.setting.c.c().e().k(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (com.ss.android.pushmanager.setting.c.c().i()) {
            Iterator it2 = com.bytedance.push.third.g.o(context).k().iterator();
            while (it2.hasNext()) {
                z |= h(context, ((Integer) it2.next()).intValue());
            }
            i(context.getApplicationContext());
        } else {
            Iterator it3 = com.bytedance.push.third.g.o(context).k().iterator();
            while (it3.hasNext()) {
                int intValue = ((Integer) it3.next()).intValue();
                if (context != null) {
                    PushManager.inst().unregisterPush(context.getApplicationContext(), intValue);
                }
            }
            this.a.clear();
        }
        return z;
    }

    public void f() {
        Application a2 = com.ss.android.message.a.a();
        c(a2);
        try {
            ((LocalSettings) com.bytedance.push.settings.h.b(a2, LocalSettings.class)).registerValChanged(a2, "ali_push_type", TypedValues.Custom.S_INT, new F(this, a2));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void g(Context context) {
        h(context, 6);
        h(context, 1);
        ((E) ((C) C.a()).s()).i(context);
    }

    public void i(Context context) {
        PushTraceExternalService pushTraceExternalService = PushServiceManager.get().getPushTraceExternalService();
        PushTraceSceneType pushTraceSceneType = PushTraceSceneType.ALLIANCE_WAKEUP;
        pushTraceExternalService.getTraceScene(pushTraceSceneType).enterNode(Constants.NODE_TRY_START_PUSH_PROCESS, "try to start the push process");
        boolean z = false;
        boolean z2 = !com.ss.android.message.f.a.z(context) || PushServiceManager.get().getIAllianceService().allowStartOthersProcessFromSmp();
        boolean o = ((com.bytedance.push.U.a.a) ((C) C.a()).n()).o();
        if (z2 && o) {
            z = true;
        }
        if (z) {
            PushServiceManager.get().getPushTraceExternalService().getTraceScene(pushTraceSceneType).enterNode(Constants.NODE_START_PUSH_PROCESS, "Start the push process");
            Intent intent = new Intent(context, (Class<?>) NotifyService.class);
            try {
                if (((com.ss.android.g.e.b) com.ss.android.ug.bus.b.a(com.ss.android.g.e.b.class)).b()) {
                    try {
                        context.startService(intent);
                    } catch (Throwable unused) {
                    }
                }
                context.bindService(intent, new b(this, context), 1);
            } catch (Throwable unused2) {
                com.bytedance.push.g0.f.e("SenderService", "start NotifyService failure");
            }
        }
    }

    public void j(boolean z) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com.bytedance.common.push.d.b(new a(z));
            return;
        }
        com.bytedance.push.d0.e eVar = this.b;
        synchronized (eVar) {
            eVar.c(null, z, false);
        }
    }
}
