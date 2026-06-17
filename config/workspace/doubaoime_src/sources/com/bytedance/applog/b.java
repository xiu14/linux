package com.bytedance.applog;

import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b {
    public static c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (c cVar : c.h()) {
            if (str.equals(cVar.k())) {
                return cVar;
            }
        }
        return null;
    }

    public static String b(f fVar, String str) {
        if (d(fVar)) {
            return str;
        }
        StringBuilder S = e.a.a.a.a.S(str, BundleUtil.UNDERLINE_TAG);
        S.append(((c) fVar).k());
        return S.toString();
    }

    public static boolean c(String str) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            Iterator<c> it2 = c.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                if (str.equals(it2.next().k())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(f fVar) {
        return a.e() == fVar;
    }
}
