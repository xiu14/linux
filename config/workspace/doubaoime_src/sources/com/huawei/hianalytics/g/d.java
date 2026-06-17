package com.huawei.hianalytics.g;

import android.content.Context;
import android.util.Log;

/* loaded from: classes2.dex */
public final class d extends a {
    private d() {
    }

    public static f a() {
        return new d();
    }

    @Override // com.huawei.hianalytics.g.f
    public final f a(Context context, String str) {
        return this;
    }

    @Override // com.huawei.hianalytics.g.f
    public final void a(String str, int i, String str2, String str3) {
        if (str == null) {
            return;
        }
        if (i == 3) {
            Log.d(str2, str);
            return;
        }
        if (i != 4) {
            if (i == 5) {
                Log.w(str2, str);
                return;
            } else if (i == 6) {
                Log.e(str2, str);
                return;
            }
        }
        Log.i(str2, str);
    }
}
