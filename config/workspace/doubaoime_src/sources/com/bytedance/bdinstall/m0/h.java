package com.bytedance.bdinstall.m0;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.bdinstall.m0.u;
import com.bytedance.bdinstall.m0.w.c;

/* loaded from: classes.dex */
final class h extends b<com.bytedance.bdinstall.m0.w.c> {

    class a implements u.b<com.bytedance.bdinstall.m0.w.c, String> {
        a(h hVar) {
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public com.bytedance.bdinstall.m0.w.c a(IBinder iBinder) {
            return c.a.d(iBinder);
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public String b(com.bytedance.bdinstall.m0.w.c cVar) throws Exception {
            com.bytedance.bdinstall.m0.w.c cVar2 = cVar;
            if (cVar2 == null) {
                return null;
            }
            return cVar2.e();
        }
    }

    h() {
        super("com.zui.deviceidservice");
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected Intent d(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        return intent;
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected u.b<com.bytedance.bdinstall.m0.w.c, String> e() {
        return new a(this);
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "Lenovo";
    }
}
