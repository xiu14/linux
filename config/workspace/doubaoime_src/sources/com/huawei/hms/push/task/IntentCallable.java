package com.huawei.hms.push.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class IntentCallable implements Callable<Void> {
    private Context a;
    private Intent b;

    /* renamed from: c, reason: collision with root package name */
    private String f7436c;

    public IntentCallable(Context context, Intent intent, String str) {
        this.a = context;
        this.b = intent;
        this.f7436c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.a.sendBroadcast(this.b);
        PushBiUtil.reportExit(this.a, PushNaming.SET_NOTIFY_FLAG, this.f7436c, ErrorEnum.SUCCESS);
        return null;
    }
}
