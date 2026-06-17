package com.huawei.hms.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AgHmsUpdateState;

/* loaded from: classes2.dex */
public class AvailableUtil {
    private static final Object a = new Object();
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f7191c = false;

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AvailableUtil", "enter asyncCheckHmsV3UpdateInfo");
            if (AvailableUtil.isInstallerLibExist(this.a)) {
                UpdateAdapter.invokeMethod("com.huawei.hms.adapter.ui.InstallerAdapter", "checkHmsUpdateInfo", new Object[]{this.a});
                HMSLog.i("AvailableUtil", "quit asyncCheckHmsV3UpdateInfo");
            } else {
                AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                HMSLog.e("AvailableUtil", "asyncCheckHmsV3UpdateInfo installer is not exist");
            }
        }
    }

    public static void asyncCheckHmsUpdateInfo(Context context) {
        if (HmsCheckedState.UNCHECKED != AgHmsUpdateState.getInstance().getCheckedState()) {
            HMSLog.i("AvailableUtil", "asyncCheckHmsUpdateInfo, not need to check");
        } else {
            new Thread(new a(context), "Thread-asyncCheckHmsV3UpdateInfo").start();
        }
    }

    public static boolean isInstallerLibExist(Context context) {
        Bundle bundle;
        Object obj;
        if (b) {
            StringBuilder M = e.a.a.a.a.M("installerInit exist: ");
            M.append(f7191c);
            HMSLog.i("AvailableUtil", M.toString());
            return f7191c;
        }
        synchronized (a) {
            if (!b) {
                boolean z = false;
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    HMSLog.e("AvailableUtil", "In isAvailableLibExist, Failed to get 'PackageManager' instance.");
                    try {
                        Class.forName("com.huawei.hms.update.manager.UpdateManager");
                        z = true;
                    } catch (ClassNotFoundException unused) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to find class UpdateManager.");
                    }
                    f7191c = z;
                    b = true;
                } else {
                    try {
                        ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("availableHMSCoreInstaller")) != null && String.valueOf(obj).equalsIgnoreCase("yes")) {
                            HMSLog.i("AvailableUtil", "available exist: true");
                            z = true;
                        }
                    } catch (AndroidException unused2) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.");
                    } catch (RuntimeException e2) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.", e2);
                    }
                    f7191c = z;
                    b = true;
                }
            }
        }
        StringBuilder M2 = e.a.a.a.a.M("available exist: ");
        M2.append(f7191c);
        HMSLog.i("AvailableUtil", M2.toString());
        return f7191c;
    }
}
