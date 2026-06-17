package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import com.huawei.e.a.a.a.d.b;

/* loaded from: classes2.dex */
public class SecurityRandomHelper {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                if (instance == null) {
                    b.e(true);
                    instance = new SecurityRandomHelper();
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i) {
        return b.c(i);
    }

    public String generateSecureRandomStr(int i) {
        return b.d(i);
    }
}
