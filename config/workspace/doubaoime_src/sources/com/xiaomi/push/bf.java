package com.xiaomi.push;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
class bf extends ScheduledThreadPoolExecutor implements bg {
    private static final AtomicReference<bf> a = new AtomicReference<>();

    /* renamed from: a, reason: collision with other field name */
    private final bc f142a;

    private bf() {
        super(1);
        bc bcVar = new bc(MonitorConstants.SCHEDULE);
        this.f142a = bcVar;
        setThreadFactory(bcVar);
    }

    static bf a() {
        AtomicReference<bf> atomicReference = a;
        if (atomicReference.get() == null || atomicReference.get().isTerminated()) {
            synchronized (bf.class) {
                if (atomicReference.get() == null || atomicReference.get().isTerminated()) {
                    atomicReference.set(new bf());
                }
            }
        }
        return atomicReference.get();
    }

    @Override // com.xiaomi.push.bg
    /* renamed from: a, reason: collision with other method in class */
    public void mo126a() {
        a("");
    }

    @Override // com.xiaomi.push.bg
    public void a(String str) {
        Thread currentThread = Thread.currentThread();
        String str2 = this.f142a.a + currentThread.getId();
        if (TextUtils.isEmpty(str)) {
            currentThread.setName(str2);
            return;
        }
        currentThread.setName(str2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str);
    }
}
