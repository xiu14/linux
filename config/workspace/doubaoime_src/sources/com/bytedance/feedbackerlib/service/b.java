package com.bytedance.feedbackerlib.service;

import androidx.annotation.NonNull;
import com.bytedance.feedbackerlib.manager.z;
import com.bytedance.feedbackerlib.model.b;
import com.bytedance.feedbackerlib.receiver.DynamicReceiver;

/* loaded from: classes.dex */
class b implements b.q {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f4974c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ FloatWindowService f4975d;

    b(FloatWindowService floatWindowService, String str, boolean z, boolean z2) {
        this.f4975d = floatWindowService;
        this.a = str;
        this.b = z;
        this.f4974c = z2;
    }

    @Override // com.bytedance.feedbackerlib.model.b.q
    public void a(@NonNull Boolean bool) {
        com.bytedance.feedbackerlib.a.j0(this.a, "onNetworkStateRequestFinish invoked", "isValid=" + bool);
        if (!bool.booleanValue()) {
            this.f4975d.k(this.b, this.f4974c, this.a);
            return;
        }
        com.bytedance.feedbackerlib.a.j0(this.a, "callback sso bypassed", new String[0]);
        DynamicReceiver.a(this.f4975d.getApplicationContext(), this.a);
        z.a();
    }
}
