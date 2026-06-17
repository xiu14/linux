package com.vivo.push.restructure.b;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.util.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class f implements b {
    @Override // com.vivo.push.util.n
    public final List<String> a(Context context) {
        if (t.b() && Looper.myLooper() == Looper.getMainLooper()) {
            Log.w("DebugUtil", "Operation: findAllCoreClientPush in main thread!", new Throwable());
        }
        List<ResolveInfo> list = null;
        if (!com.vivo.push.restructure.a.a().e().m().isAgreePrivacyStatement()) {
            t.d("PushSystemRelyImpl", " findAllCorePush  isAgreePrivacyStatement() is false ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            list = context.getPackageManager().queryIntentServices(new Intent("com.vivo.pushservice.action.PUSH_SERVICE"), 576);
        } catch (Exception unused) {
        }
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ResolveInfo resolveInfo = list.get(i);
                if (resolveInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            t.d("PushSystemRelyImpl", "get all push packages is null");
        }
        return arrayList;
    }

    @Override // com.vivo.push.util.n
    public final boolean b(Context context) {
        if (context == null) {
            return true;
        }
        try {
            return ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled();
        } catch (Exception e2) {
            t.a("PushSystemRelyImpl", "isNotifySwitchOpen error", e2);
            return true;
        }
    }
}
