package com.bytedance.bdinstall.m0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.bytedance.bdinstall.m0.m;

/* loaded from: classes.dex */
final class e implements m {
    private static final com.bytedance.bdinstall.util.p<Boolean> a = new a();

    static class a extends com.bytedance.bdinstall.util.p<Boolean> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected Boolean a(Object[] objArr) {
            boolean z = false;
            try {
                if (((Context) objArr[0]).getPackageManager().getPackageInfo("com.huawei.hwid", 128) != null) {
                    z = true;
                }
            } catch (Throwable unused) {
            }
            return Boolean.valueOf(z);
        }
    }

    static class b extends m.a {

        /* renamed from: c, reason: collision with root package name */
        long f4063c = 0;

        b() {
        }
    }

    e() {
    }

    static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        return a.b(context).booleanValue();
    }

    @Override // com.bytedance.bdinstall.m0.m
    @WorkerThread
    public m.a a(Context context) {
        String string;
        String string2;
        b bVar = new b();
        try {
            string = Settings.Global.getString(context.getContentResolver(), "pps_oaid");
            string2 = Settings.Global.getString(context.getContentResolver(), "pps_track_limit");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!TextUtils.isEmpty(string)) {
            bVar.a = string;
            bVar.b = Boolean.parseBoolean(string2);
            bVar.f4063c = 202003021704L;
            return bVar;
        }
        Pair pair = (Pair) new u(context, new Intent("com.uodis.opendevice.OPENIDS_SERVICE").setPackage("com.huawei.hwid"), new f()).a();
        if (pair != null) {
            bVar.a = (String) pair.first;
            bVar.b = ((Boolean) pair.second).booleanValue();
            int i = 0;
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
                if (packageInfo != null) {
                    i = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
            bVar.f4063c = i;
        }
        return bVar;
    }

    @Override // com.bytedance.bdinstall.m0.m
    public boolean b(Context context) {
        return c(context);
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "Huawei";
    }
}
