package com.huawei.hianalytics.d;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.e.d;

/* loaded from: classes2.dex */
public abstract class b {
    private String c(Context context) {
        d f2 = com.huawei.hianalytics.e.a.a().f();
        if (TextUtils.isEmpty(f2.c())) {
            f2.a(com.huawei.hianalytics.c.c.e(context));
        }
        return f2.c();
    }

    private String d(Context context) {
        d f2 = com.huawei.hianalytics.e.a.a().f();
        if (TextUtils.isEmpty(f2.f())) {
            f2.d(com.huawei.hianalytics.c.c.c(context));
        }
        return f2.f();
    }

    public com.huawei.hianalytics.c.a a(Context context) {
        String a = a();
        if (!TextUtils.isEmpty(a)) {
            return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.UDID, a);
        }
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.IMEI, b);
        }
        d f2 = com.huawei.hianalytics.e.a.a().f();
        if (TextUtils.isEmpty(f2.e())) {
            f2.c(com.huawei.hianalytics.c.c.b());
        }
        boolean z = !TextUtils.isEmpty(f2.e());
        String c2 = c();
        if (!TextUtils.isEmpty(c2)) {
            return z ? new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.SN, c2) : new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.UDID, a(c2));
        }
        String str = "";
        if (!z) {
            int d2 = d();
            if ((d2 & 4) != 0 && (d2 & 1) != 0) {
                return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.UDID, a(c(context)));
            }
            if ((d2 & 1) != 0) {
                str = c(context);
                if (!TextUtils.isEmpty(str)) {
                    return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.SN, str);
                }
            }
            if ((d2 & 2) != 0) {
                return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.IMEI, d(context));
            }
            return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.EMPTY, str);
        }
        int d3 = d();
        if (d3 != 0) {
            d f3 = com.huawei.hianalytics.e.a.a().f();
            if (TextUtils.isEmpty(f3.g())) {
                f3.e(com.huawei.hianalytics.c.c.a());
            }
            str = f3.g();
            if (!TextUtils.isEmpty(str)) {
                return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.UDID, str);
            }
        }
        if ((d3 & 2) != 0) {
            str = d(context);
            if (!TextUtils.isEmpty(str)) {
                return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.IMEI, str);
            }
        }
        if ((d3 & 1) != 0) {
            return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.SN, c(context));
        }
        return new com.huawei.hianalytics.c.a(com.huawei.hianalytics.c.b.EMPTY, str);
    }

    public abstract String a();

    public abstract String a(String str);

    public abstract String b();

    public abstract String c();

    public abstract int d();
}
