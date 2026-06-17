package com.bytedance.feedbackerlib.service;

import androidx.annotation.NonNull;
import com.bytedance.feedbackerlib.manager.z;
import com.bytedance.feedbackerlib.model.b;
import com.bytedance.feedbackerlib.receiver.DynamicReceiver;

/* loaded from: classes.dex */
class a implements b.q {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f4972c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ FloatWindowService f4973d;

    a(FloatWindowService floatWindowService, String str, boolean z, boolean z2) {
        this.f4973d = floatWindowService;
        this.a = str;
        this.b = z;
        this.f4972c = z2;
    }

    @Override // com.bytedance.feedbackerlib.model.b.q
    public void a(@NonNull Boolean bool) {
        com.bytedance.feedbackerlib.a.j0(this.a, "onNetworkStateRequestFinish", "isInternalNetwork=" + bool);
        if (!bool.booleanValue()) {
            this.f4973d.k(this.b, this.f4972c, this.a);
            return;
        }
        com.bytedance.feedbackerlib.a.j0(this.a, "callback larkssobypassed", new String[0]);
        DynamicReceiver.a(this.f4973d.getApplicationContext(), this.a);
        z.a();
    }
}
