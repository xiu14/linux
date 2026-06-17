package com.bytedance.bdinstall.m0;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.bdinstall.m0.u;
import com.bytedance.bdinstall.m0.w.b;

/* loaded from: classes.dex */
final class t extends b<com.bytedance.bdinstall.m0.w.b> {

    class a implements u.b<com.bytedance.bdinstall.m0.w.b, String> {
        a(t tVar) {
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public com.bytedance.bdinstall.m0.w.b a(IBinder iBinder) {
            return b.a.d(iBinder);
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public String b(com.bytedance.bdinstall.m0.w.b bVar) throws Exception {
            return bVar.e();
        }
    }

    t() {
        super("com.samsung.android.deviceidservice");
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected Intent d(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        return intent;
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected u.b<com.bytedance.bdinstall.m0.w.b, String> e() {
        return new a(this);
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "Samsung";
    }
}
