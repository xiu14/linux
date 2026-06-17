package com.bytedance.android.input.impl;

import android.content.Context;
import com.bytedance.android.input.api.ImePushService;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.push.PushBody;
import com.bytedance.push.interfaze.z;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements z {
    public static final a a = new a();

    private a() {
    }

    @Override // com.bytedance.push.interfaze.z
    public JSONObject a(Context context, int i, PushBody pushBody, String str) {
        l.f(context, "context");
        IAppGlobals.a.j("ImePush-Click", "from = " + i + ", onClickPush: " + pushBody + "--openUrl = " + str);
        ImePushService.a.a(context, i, new com.bytedance.android.input.api.a(pushBody.m, pushBody.p), str);
        return null;
    }
}
