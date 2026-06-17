package com.huawei.hms.push;

import android.os.Bundle;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes2.dex */
public class c {
    public static byte[] a(Bundle bundle, String str) {
        try {
            byte[] byteArray = bundle.getByteArray(str);
            return byteArray == null ? new byte[0] : byteArray;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("getByteArray exception");
            M.append(e2.getMessage());
            HMSLog.i(BundleUtil.TAG, M.toString());
            return new byte[0];
        }
    }

    public static String b(Bundle bundle, String str) {
        try {
            return bundle.getString(str);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("getString exception");
            M.append(e2.getMessage());
            HMSLog.i(BundleUtil.TAG, M.toString());
            return null;
        }
    }

    public static String c(Bundle bundle, String str) {
        try {
            String string = bundle.getString(str);
            return string == null ? "" : string;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("getString exception");
            M.append(e2.getMessage());
            HMSLog.i(BundleUtil.TAG, M.toString());
            return "";
        }
    }
}
