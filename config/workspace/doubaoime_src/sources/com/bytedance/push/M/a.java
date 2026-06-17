package com.bytedance.push.M;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.push.g0.a;
import com.bytedance.push.g0.g;
import com.ss.android.message.NotifyService;
import com.ss.android.message.log.LogService;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class a {
    public static boolean a(Context context, String str) throws PackageManager.NameNotFoundException {
        a.C0301a c0301a = new a.C0301a(NotifyService.class.getName());
        c0301a.e(context.getPackageName() + ":push");
        c0301a.a(new a.b(Arrays.asList("com.ss.android.message.action.PUSH_SERVICE")));
        a.C0301a c0301a2 = new a.C0301a(LogService.class.getName());
        c0301a2.e(context.getPackageName() + ":push");
        boolean d2 = g.d(context, str, "Push", Arrays.asList(c0301a.b(), c0301a2.b()));
        a.C0301a c0301a3 = new a.C0301a(PushMultiProcessSharedProvider.class.getName());
        c0301a3.e(context.getPackageName());
        c0301a3.c(context.getPackageName() + ".push.SHARE_PROVIDER_AUTHORITY");
        return g.a(context, str, "Push", Arrays.asList(c0301a3.b())) & d2;
    }
}
