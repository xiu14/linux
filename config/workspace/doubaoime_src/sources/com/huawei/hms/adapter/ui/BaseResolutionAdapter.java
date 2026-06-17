package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.RegionUtils;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.xiaomi.mipush.sdk.Constants;
import e.a.a.a.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {
    private WeakReference<Activity> a;
    private String b = "";

    /* renamed from: c, reason: collision with root package name */
    private long f7204c = 0;

    private void a(long j) {
        if (!RegionUtils.isChinaROM(c())) {
            HMSLog.i("BaseResolutionAdapter", "not ChinaROM");
            return;
        }
        Activity c2 = c();
        if (c2 == null || c2.isFinishing()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("package", c2.getPackageName());
        hashMap.put(CommonCode.MapKey.RESOLUTION_FLAG, this.f7204c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j);
        HiAnalyticsUtils.getInstance().onEvent(c2, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, hashMap);
        HMSLog.e("BaseResolutionAdapter", "check resolution flag failed, transactionId: " + this.b + ", carriedTimeStamp: " + this.f7204c + ", savedTimeStamp: " + j);
    }

    private void b() {
        Activity c2 = c();
        if (c2 == null || c2.isFinishing()) {
            return;
        }
        c2.finish();
    }

    private Activity c() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void d() {
        SystemManager.getInstance().notifyResolutionResult(null, this.b);
        b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.e("BaseResolutionAdapter", "activity is null");
            d();
            return;
        }
        if (activity.isFinishing()) {
            HMSLog.e("BaseResolutionAdapter", "activity is finishing");
            return;
        }
        this.a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            d();
            return;
        }
        Bundle bundle = null;
        try {
            bundle = intent.getExtras();
            this.b = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
            this.f7204c = intent.getLongExtra(CommonCode.MapKey.RESOLUTION_FLAG, 0L);
        } catch (Throwable th) {
            StringBuilder M = a.M("get transaction_id or resolution_flag exception:");
            M.append(th.getClass().getSimpleName());
            HMSLog.e("BaseResolutionAdapter", M.toString());
        }
        if (!a()) {
            d();
            return;
        }
        if (this.b != null && Build.VERSION.SDK_INT >= 29) {
            HMSLog.i("BaseResolutionAdapter", "remove apk resolution failed task.");
            ApkResolutionFailedManager.getInstance().removeTask(this.b);
        }
        if (bundle == null) {
            d();
            return;
        }
        Parcelable parcelable = bundle.getParcelable("resolution");
        if (parcelable == null) {
            d();
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                activity.startActivityForResult(IntentUtil.modifyIntentBehaviorsSafe((Intent) parcelable), 1001);
                return;
            } catch (Throwable unused) {
                d();
                HMSLog.e("BaseResolutionAdapter", "ActivityNotFoundException:exception");
                return;
            }
        }
        if (parcelable instanceof PendingIntent) {
            try {
                activity.startIntentSenderForResult(((PendingIntent) parcelable).getIntentSender(), 1001, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused2) {
                d();
                HMSLog.e("BaseResolutionAdapter", "SendIntentException:exception");
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        a.l0("onBridgeActivityResult, resultCode: ", i2, "BaseResolutionAdapter");
        if (i2 == 1001 || i2 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i2);
        }
        if (i2 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) || intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.b);
        }
        b();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i("BaseResolutionAdapter", "On key up when resolve conn error");
    }

    private boolean a() {
        long resolutionFlag = ResolutionFlagUtil.getInstance().getResolutionFlag(this.b);
        ResolutionFlagUtil.getInstance().removeResolutionFlag(this.b);
        if (resolutionFlag != 0 && resolutionFlag == this.f7204c) {
            return true;
        }
        a(resolutionFlag);
        return false;
    }
}
