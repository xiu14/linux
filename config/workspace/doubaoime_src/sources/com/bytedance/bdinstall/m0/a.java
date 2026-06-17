package com.bytedance.bdinstall.m0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.bdinstall.m0.u;
import com.bytedance.bdinstall.m0.w.d;

/* loaded from: classes.dex */
final class a extends b<com.bytedance.bdinstall.m0.w.d> {

    /* renamed from: com.bytedance.bdinstall.m0.a$a, reason: collision with other inner class name */
    class C0156a implements u.b<com.bytedance.bdinstall.m0.w.d, String> {
        C0156a(a aVar) {
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public com.bytedance.bdinstall.m0.w.d a(IBinder iBinder) {
            return d.a.d(iBinder);
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public String b(com.bytedance.bdinstall.m0.w.d dVar) throws Exception {
            com.bytedance.bdinstall.m0.w.d dVar2 = dVar;
            if (dVar2 == null) {
                return null;
            }
            return dVar2.e();
        }
    }

    a() {
        super("com.asus.msa.SupplementaryDID");
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected Intent d(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        return intent;
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected u.b<com.bytedance.bdinstall.m0.w.d, String> e() {
        return new C0156a(this);
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "ASUS";
    }
}
