package com.huawei.e.a.a.b.g;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public class d {
    public static String a(String str) {
        Context f2 = b.f();
        if (f2 == null) {
            return "";
        }
        try {
            return f2.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder M = e.a.a.a.a.M("getVersion NameNotFoundException : ");
            M.append(e2.getMessage());
            b.c("f", M.toString());
            return "";
        } catch (Exception e3) {
            StringBuilder M2 = e.a.a.a.a.M("getVersion: ");
            M2.append(e3.getMessage());
            b.c("f", M2.toString());
            return "";
        } catch (Throwable unused) {
            b.c("f", "throwable");
            return "";
        }
    }
}
