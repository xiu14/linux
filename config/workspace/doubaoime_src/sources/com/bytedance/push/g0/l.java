package com.bytedance.push.g0;

import android.os.SystemProperties;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;

/* loaded from: classes2.dex */
class l {
    private Object a;

    l() {
    }

    private Object b() {
        if (this.a == null) {
            synchronized (j.class) {
                if (this.a == null) {
                    try {
                        this.a = Class.forName("android.os.SystemProperties").newInstance();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return this.a;
    }

    public String a(String str) throws IllegalArgumentException {
        try {
            return SystemProperties.get(str);
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                Object b = b();
                return (String) b.getClass().getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(b, str);
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (Throwable unused) {
                return "";
            }
        }
    }
}
