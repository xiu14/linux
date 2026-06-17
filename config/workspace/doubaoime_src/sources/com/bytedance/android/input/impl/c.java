package com.bytedance.android.input.impl;

import android.content.Context;
import com.bytedance.android.input.api.ImePushService;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.push.PushBody;
import com.bytedance.push.interfaze.m;

/* loaded from: classes.dex */
public final class c implements m {
    public static final c a = new c();

    private c() {
    }

    @Override // com.bytedance.push.interfaze.m
    public boolean a(Context context, int i, PushBody pushBody) {
        IAppGlobals.a.j("ImePush-MessageShow", "onReceivePassThoughMsg: pushType = " + i + ", body = " + pushBody);
        ImePushService.a.b(context, i, new com.bytedance.android.input.api.a(pushBody.m, pushBody.p));
        return false;
    }

    @Override // com.bytedance.push.interfaze.m
    public boolean c(Context context, int i, PushBody pushBody) {
        IAppGlobals.a.j("ImePush-MessageShow", "onReceiveRevokeMsg: pushType = " + i + ", body = " + pushBody);
        return false;
    }
}
