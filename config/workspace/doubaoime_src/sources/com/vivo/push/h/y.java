package com.vivo.push.h;

import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes2.dex */
public final class y extends ab {
    y(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        int e2 = ((com.vivo.push.b.r) vVar).e();
        PushMessageCallback pushMessageCallback = ((ab) this).b;
        if (pushMessageCallback != null) {
            pushMessageCallback.onNotifyGuideDialogResult(e2);
        }
    }
}
