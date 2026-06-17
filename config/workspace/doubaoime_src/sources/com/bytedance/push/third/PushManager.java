package com.bytedance.push.third;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import android.util.Pair;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.push.C;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushManager implements c {
    private static final String TAG = "PushManager";
    private static volatile PushManager sPushManager;

    private PushManager() {
    }

    public static PushManager inst() {
        if (sPushManager == null) {
            synchronized (PushManager.class) {
                if (sPushManager == null) {
                    sPushManager = new PushManager();
                }
            }
        }
        return sPushManager;
    }

    public static void registerPushNewUser(Context context) {
        Pair<Integer, c> r = g.o(context).r();
        if (r != null) {
            int intValue = ((Integer) r.first).intValue();
            ((c) r.second).registerPush(context, intValue);
            com.bytedance.push.g0.f.m(TAG, "registerPushNewUser success " + intValue);
        }
    }

    @Override // com.bytedance.push.third.c
    public boolean checkThirdPushConfig(String str, Context context) {
        Iterator it2 = g.o(context).k().iterator();
        boolean z = true;
        while (it2.hasNext()) {
            c a = g.o(context).a(((Integer) it2.next()).intValue());
            if (a != null) {
                try {
                    z &= a.checkThirdPushConfig(str, context);
                } catch (Throwable th) {
                    th.printStackTrace();
                    com.bytedance.push.g0.f.e(str, "check pushType error: " + Log.getStackTraceString(th));
                    z = false;
                }
            }
        }
        try {
            return com.bytedance.push.M.a.a(context, str) & z & com.bytedance.push.J.a.h(context).d(str);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            com.bytedance.push.g0.f.e(str, "check pushType error: " + Log.getStackTraceString(e2));
            return false;
        }
    }

    @Override // com.bytedance.push.third.c
    public boolean isPushAvailable(Context context, int i) {
        c a = g.o(context).a(i);
        if (a == null) {
            return false;
        }
        try {
            return a.isPushAvailable(context, i);
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean needDisableChannelInvoke(Context context, int i) {
        if (!g.o(context).i(i)) {
            boolean z = com.ss.android.message.f.a.z(context) && !PushServiceManager.get().getIAllianceService().allowStartOthersProcessFromSmp();
            if (z && i == 21) {
                boolean allowSyncInSmpWhenProcessIsolate = PushServiceManager.get().getIAllianceService().allowSyncInSmpWhenProcessIsolate();
                com.bytedance.push.g0.f.c(TAG, "try register sync,allowSyncInSmpWhenProcessIsolate is " + allowSyncInSmpWhenProcessIsolate);
                if (allowSyncInSmpWhenProcessIsolate) {
                    z = false;
                }
            }
            Objects.requireNonNull(g.o(context));
            boolean z2 = i == 6 || i == 1;
            boolean z3 = z2 && !((com.bytedance.push.U.a.a) ((C) C.a()).n()).o();
            r1 = z || z3;
            StringBuilder M = e.a.a.a.a.M("allowPushProcess is ");
            M.append(!r1);
            M.append(" because needDisablePushProcessOnSmpProcess is ");
            M.append(z);
            M.append(" and needDisableWhenStrictMode is ");
            M.append(z2);
            M.append(" and needDisableNonMainProcess is ");
            M.append(z3);
            com.bytedance.push.g0.f.m(TAG, M.toString());
        }
        return r1;
    }

    @Override // com.bytedance.push.third.c
    public void registerPush(Context context, int i) {
        c a = g.o(context).a(i);
        if (a != null) {
            try {
                if (needDisableChannelInvoke(context, i)) {
                    com.bytedance.push.g0.f.m(TAG, "allowPushProcess is false so not register " + i);
                } else {
                    com.bytedance.push.g0.f.m(TAG, "allowPushProcess is true so allow start register " + i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("channel", i);
                    ((com.ss.android.g.e.b) com.ss.android.ug.bus.b.a(com.ss.android.g.e.b.class)).onEventV3("push_registered", jSONObject);
                    C.y().d(i);
                    ((com.bytedance.push.e0.a) ((C) C.a()).v()).c(i);
                    a.registerPush(context, i);
                    ((C) C.a()).e().a(a);
                }
            } catch (Throwable th) {
                StringBuilder N = e.a.a.a.a.N("the exception is occurred when registerPush for ", i, " and message is ");
                N.append(th.getMessage());
                com.bytedance.push.g0.f.e(TAG, N.toString());
            }
        }
    }

    public boolean requestRemoveVoipNotification(Context context, int i) {
        return false;
    }

    @Override // com.bytedance.push.third.c
    public void setAlias(Context context, String str, int i) {
        c a = g.o(context).a(i);
        if (a != null) {
            try {
                a.setAlias(context, str, i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.push.third.c
    public void trackPush(Context context, int i, Object obj) {
        c a = g.o(context).a(i);
        if (a != null) {
            try {
                a.trackPush(context, i, obj);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.c
    public void unregisterPush(Context context, int i) {
        c a = g.o(context).a(i);
        if (a != null) {
            try {
                if (needDisableChannelInvoke(context, i)) {
                    com.bytedance.push.g0.f.m(TAG, "allowPushProcess is false so not unregister " + i);
                } else {
                    com.bytedance.push.g0.f.m(TAG, "allowPushProcess is true so allow start unregister " + i);
                    a.unregisterPush(context, i);
                    ((C) C.a()).e().b(a);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
