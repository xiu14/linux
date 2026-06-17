package com.bytedance.feedbackerlib.service;

import com.bytedance.feedbackerlib.model.b;

/* loaded from: classes.dex */
class c implements b.r {
    final /* synthetic */ String a;
    final /* synthetic */ FloatWindowService b;

    c(FloatWindowService floatWindowService, String str) {
        this.b = floatWindowService;
        this.a = str;
    }

    @Override // com.bytedance.feedbackerlib.model.b.r
    public void a(int i, String str) {
        this.b.v(this.a);
    }
}
