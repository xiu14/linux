package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public class du implements Application.ActivityLifecycleCallbacks {
    private Context a;

    /* renamed from: a, reason: collision with other field name */
    private String f299a;
    private String b;

    public du(Context context, String str) {
        this.f299a = "";
        this.a = context;
        this.f299a = str;
    }

    private void a(String str) {
        ic icVar = new ic();
        icVar.a(str);
        icVar.a(System.currentTimeMillis());
        icVar.a(hw.ActivityActiveTimeStamp);
        eb.a(this.a, icVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (TextUtils.isEmpty(this.f299a) || TextUtils.isEmpty(localClassName)) {
            return;
        }
        this.b = "";
        if (!TextUtils.isEmpty("") && !TextUtils.equals(this.b, localClassName)) {
            this.f299a = "";
            return;
        }
        a(this.a.getPackageName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + localClassName + Constants.COLON_SEPARATOR + this.f299a + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(System.currentTimeMillis() / 1000));
        this.f299a = "";
        this.b = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.b)) {
            this.b = activity.getLocalClassName();
        }
        this.f299a = String.valueOf(System.currentTimeMillis() / 1000);
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
