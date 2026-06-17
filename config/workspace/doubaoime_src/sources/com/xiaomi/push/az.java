package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class az extends ThreadPoolExecutor implements bg {
    private final bc a;

    protected az(int i, long j, TimeUnit timeUnit, int i2, String str) {
        super(i, i, j, timeUnit, new ArrayBlockingQueue(i2), new bb());
        bc bcVar = new bc(str);
        this.a = bcVar;
        setThreadFactory(bcVar);
        allowCoreThreadTimeOut(true);
    }

    @Override // com.xiaomi.push.bg
    /* renamed from: a */
    public void mo126a() {
        a("");
    }

    @Override // com.xiaomi.push.bg
    public void a(String str) {
        Thread currentThread = Thread.currentThread();
        String str2 = this.a.a + currentThread.getId();
        if (TextUtils.isEmpty(str)) {
            currentThread.setName(str2);
            return;
        }
        currentThread.setName(str2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str);
    }
}
