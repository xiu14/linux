package com.bytedance.push.monitor;

import android.text.TextUtils;
import com.bytedance.push.C;

/* loaded from: classes2.dex */
final class e implements Runnable {
    e() {
    }

    @Override // java.lang.Runnable
    public void run() {
        long j;
        if (((C) C.a()).d().u && TextUtils.isEmpty(com.ss.android.pushmanager.setting.c.c().b())) {
            return;
        }
        long f2 = com.ss.android.message.f.a.f();
        j = d.f5735d;
        d.e(201, f2 - j);
    }
}
