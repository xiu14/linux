package com.bytedance.bdinstall.m0;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.bdinstall.m0.m;
import com.bytedance.bdinstall.m0.u;
import com.bytedance.bdinstall.m0.w.h;

/* loaded from: classes.dex */
final class c extends b<com.bytedance.bdinstall.m0.w.h> {

    class a implements u.b<com.bytedance.bdinstall.m0.w.h, String> {
        a(c cVar) {
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public com.bytedance.bdinstall.m0.w.h a(IBinder iBinder) {
            return h.a.d(iBinder);
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public String b(com.bytedance.bdinstall.m0.w.h hVar) throws Exception {
            com.bytedance.bdinstall.m0.w.h hVar2 = hVar;
            if (hVar2 == null) {
                return null;
            }
            return hVar2.e();
        }
    }

    c() {
        super("com.mdid.msa");
    }

    @Override // com.bytedance.bdinstall.m0.b, com.bytedance.bdinstall.m0.m
    public m.a a(Context context) {
        String packageName = context.getPackageName();
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", packageName);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return super.a(context);
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected Intent d(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", context.getPackageName());
        return intent;
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected u.b<com.bytedance.bdinstall.m0.w.h, String> e() {
        return new a(this);
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "Common";
    }
}
