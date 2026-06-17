package com.bytedance.common.g.b;

import android.app.ActivityManager;
import android.app.Application;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.push.g0.f;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import com.ss.android.message.log.PushLog;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends com.bytedance.common.push.c implements com.bytedance.common.g.c.b, IBinder.DeathRecipient {
    private List<String> a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String f4143c;

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        String str;
        f.c("SecurityService", "on  main process died");
        List<String> list = this.a;
        if (list == null || (str = this.f4143c) == null) {
            StringBuilder M = e.a.a.a.a.M(" mNotAllowAliveProcessList or mCurProcess is null, mCurProcess is ");
            M.append(this.f4143c);
            f.e("SecurityService", M.toString());
            return;
        }
        if (!list.contains(str)) {
            f.c("SecurityService", this.f4143c + " is not in notAllowAliveProcessList, do nothing");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "cur_process", this.f4143c);
        if (!this.b) {
            f.c("SecurityService", this.f4143c + " is in notAllowAliveProcessList, kill self");
            PushLog.onEventV3(com.bytedance.common.g.a.c().e().c().a, "bdpush_self_kill", jSONObject);
            com.ss.android.message.f.a.B();
            return;
        }
        f.c("SecurityService", "mNeedKillAllIfMainProcessDied is true, kill all");
        add(jSONObject, "kill_all", true);
        PushLog.onEventV3(com.bytedance.common.g.a.c().e().c().a, "bdpush_self_kill", jSONObject);
        Application application = com.bytedance.common.g.a.c().e().c().a;
        boolean z = com.ss.android.message.f.a.f8353g;
        f.c("", "kill all");
        List<ActivityManager.RunningAppProcessInfo> o = com.ss.android.message.f.a.o();
        if (o != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : o) {
                if (runningAppProcessInfo.pid != Process.myPid()) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        }
        Process.killProcess(Process.myPid());
    }

    public void n(IBinder iBinder) {
        f.c("SecurityService", "on hold main process binder");
        try {
            if (this.a == null) {
                PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) h.b(com.bytedance.common.g.a.c().e().c().a, PushOnlineSettings.class);
                String f2 = pushOnlineSettings.f();
                if (TextUtils.isEmpty(f2)) {
                    return;
                }
                this.a = Arrays.asList(f2.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
                this.b = pushOnlineSettings.K();
            }
            if (this.f4143c == null) {
                this.f4143c = com.ss.android.message.f.a.j(com.bytedance.common.g.a.c().e().c().a);
            }
            if (!this.a.contains(this.f4143c)) {
                f.c("SecurityService", this.f4143c + " is not in notAllowAliveProcessList, not monitor main process died");
                return;
            }
            f.c("SecurityService", this.f4143c + " is in notAllowAliveProcessList, monitor main process died");
            iBinder.linkToDeath(this, 0);
        } catch (RemoteException e2) {
            f.f("SecurityService", "linkToDeath RemoteException ", e2);
            binderDied();
        }
    }
}
