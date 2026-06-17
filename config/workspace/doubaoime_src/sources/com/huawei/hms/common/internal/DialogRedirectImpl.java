package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
public class DialogRedirectImpl extends DialogRedirect {
    private final Activity a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f7253c;

    DialogRedirectImpl(Intent intent, Activity activity, int i) {
        this.f7253c = intent;
        this.a = activity;
        this.b = i;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Activity activity;
        Intent intent = this.f7253c;
        if (intent == null || (activity = this.a) == null) {
            return;
        }
        activity.startActivityForResult(intent, this.b);
    }
}
