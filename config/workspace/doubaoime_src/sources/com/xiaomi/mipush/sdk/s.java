package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.g;
import com.xiaomi.push.bh;

/* loaded from: classes2.dex */
public class s {
    public static AbstractPushManager a(Context context, d dVar) {
        return b(context, dVar);
    }

    private static AbstractPushManager b(Context context, d dVar) {
        g.a a = g.a(dVar);
        if (a == null || TextUtils.isEmpty(a.a) || TextUtils.isEmpty(a.b)) {
            return null;
        }
        return (AbstractPushManager) bh.a(a.a, a.b, context);
    }
}
