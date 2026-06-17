package com.vivo.push.sdk.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.push.g0.f;
import com.bytedance.push.settings.h;
import com.ss.android.message.e;
import com.ss.android.pushmanager.setting.c;
import com.vivo.push.util.t;
import com.vv.VvPushAdapter;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class CommandClientService extends CommandService {
    public static final String NEED_KILL_SMP = "need_kill_smp";
    public static final String SMP_PID = "smp_pid";
    private final String TAG = "CommandClientService";

    private void handleIntent(Intent intent) {
        if (intent != null) {
            StringBuilder M = a.M("CommandClientService.handleIntent: intent is ");
            M.append(intent.toString());
            f.c("CommandClientService", M.toString());
            ComponentName component = intent.getComponent();
            if (component != null) {
                StringBuilder M2 = a.M("CommandClientService.handleIntent: component is ");
                M2.append(component.toString());
                f.c("CommandClientService", M2.toString());
            }
            if (com.ss.android.message.f.a.z(this)) {
                int i = h.f5806d;
                boolean hasTryRegistered = VvPushAdapter.hasTryRegistered();
                f.c("CommandClientService", "[CommandClientService.onStartCommand]hasTryRegistered:" + hasTryRegistered);
                if (!hasTryRegistered) {
                    f.c("CommandClientService", "CommandClientService.handleIntent: redirect to main process ");
                    ComponentName componentName = new ComponentName(getPackageName(), MainCommandClientService.class.getName());
                    StringBuilder M3 = a.M("CommandClientService.onStartCommand: main process component is ");
                    M3.append(componentName.toString());
                    f.c("CommandClientService", M3.toString());
                    intent.setComponent(componentName);
                    f.c("CommandClientService", "hasWaked:" + PushServiceManager.get().getIAllianceService().hasWaked());
                    try {
                        ComponentName startService = startService(intent);
                        StringBuilder sb = new StringBuilder();
                        sb.append("startService result: ");
                        sb.append(startService != null);
                        f.c("CommandClientService", sb.toString());
                    } catch (Throwable th) {
                        StringBuilder M4 = a.M("startService failed , try bind : ");
                        M4.append(th.getMessage());
                        f.c("CommandClientService", M4.toString());
                        f.c("CommandClientService", "bindService result:" + bindService(intent, new ServiceConnection() { // from class: com.vivo.push.sdk.service.CommandClientService.1
                            @Override // android.content.ServiceConnection
                            public void onServiceConnected(ComponentName componentName2, IBinder iBinder) {
                                f.c("CommandClientService", "CommandClientService: onServiceConnected for MainCommandClientService ");
                            }

                            @Override // android.content.ServiceConnection
                            public void onServiceDisconnected(ComponentName componentName2) {
                                f.c("CommandClientService", "CommandClientService: onServiceDisconnected for MainCommandClientService ");
                            }
                        }, 1));
                    }
                    e.e().f(new Runnable() { // from class: com.vivo.push.sdk.service.CommandClientService.2
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean Y = c.c().g().Y();
                            f.c("CommandClientService", "killSmpAfterVvPush:" + Y);
                            if (Y) {
                                e.e().f(new Runnable() { // from class: com.vivo.push.sdk.service.CommandClientService.2.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        com.ss.android.message.f.a.B();
                                    }
                                }, com.heytap.mcssdk.constant.a.q);
                            }
                        }
                    }, 0L);
                    return;
                }
                f.c("CommandClientService", "CommandClientService.onStartCommand: execute callback on smp process ");
            }
            t.c("CommandService", getClass().getSimpleName() + " -- onStartCommand " + getPackageName());
            if (a(intent.getAction())) {
                try {
                    com.vivo.push.sdk.a.a().a(getClass().getName());
                    com.vivo.push.sdk.a.a().a(intent);
                    return;
                } catch (Exception e2) {
                    t.a("CommandService", "onStartCommand -- error", e2);
                    return;
                }
            }
            t.a("CommandService", getPackageName() + " receive invalid action " + intent.getAction());
        }
    }

    @Override // com.vivo.push.sdk.service.CommandService
    protected final boolean a(String str) {
        return "com.vivo.pushclient.action.RECEIVE".equals(str);
    }

    @Override // com.vivo.push.sdk.service.CommandService, android.app.Service
    public IBinder onBind(Intent intent) {
        StringBuilder M = a.M("CommandClientService.onBind: intent is ");
        M.append(intent.toString());
        f.c("CommandClientService", M.toString());
        if (com.ss.android.message.f.a.t(this)) {
            handleIntent(intent);
        }
        return super.onBind(intent);
    }

    @Override // com.vivo.push.sdk.service.CommandService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        f.c("CommandClientService", "CommandClientService.onStartCommand: intent is " + intent);
        handleIntent(intent);
        stopSelf();
        return 2;
    }
}
