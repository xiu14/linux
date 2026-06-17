package com.bytedance.android.input.network.anydoor;

import android.content.Context;
import android.os.Build;
import androidx.annotation.Keep;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.ss.android.anywheredoor_api.constant.AppType;
import java.net.URLEncoder;
import java.util.Objects;
import kotlin.s.c.l;

@Keep
/* loaded from: classes.dex */
public final class AnyDoorDepend {
    public void cleanExtraMockCacheIfNeed() {
    }

    public com.ss.android.d.c.a getAppInfo() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        IAppLog.a aVar2 = IAppLog.a;
        String deviceId = aVar2.getDeviceId();
        String str = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
        String encode = URLEncoder.encode(Build.MODEL, "UTF-8");
        Objects.requireNonNull(aVar);
        String userID = aVar2.getUserID();
        String str2 = Build.VERSION.RELEASE;
        l.e(encode, "deviceName");
        return new com.ss.android.d.c.a("401734", userID, deviceId, str, encode, str2, "", false);
    }

    public AppType getAppType() {
        return AppType.CN;
    }

    public Context getContext() {
        Context applicationContext = IAppGlobals.a.getApplication().getApplicationContext();
        l.e(applicationContext, "IAppGlobals.application.applicationContext");
        return applicationContext;
    }

    public com.ss.android.d.b.a getRouter() {
        return new a();
    }
}
