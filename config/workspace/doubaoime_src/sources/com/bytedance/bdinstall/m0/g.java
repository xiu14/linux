package com.bytedance.bdinstall.m0;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.m0.m;
import com.bytedance.bdinstall.m0.u;
import com.bytedance.bdinstall.m0.w.f;
import com.huawei.hms.android.SystemUtils;

/* loaded from: classes.dex */
public class g extends b<com.bytedance.bdinstall.m0.w.f> {

    /* renamed from: c, reason: collision with root package name */
    final com.bytedance.bdinstall.i0.a f4064c;

    /* renamed from: d, reason: collision with root package name */
    final com.bytedance.bdinstall.i0.b f4065d;

    class a implements u.b<com.bytedance.bdinstall.m0.w.f, String> {
        a() {
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public com.bytedance.bdinstall.m0.w.f a(IBinder iBinder) {
            return f.a.d(iBinder);
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public String b(com.bytedance.bdinstall.m0.w.f fVar) throws Exception {
            com.bytedance.bdinstall.m0.w.f fVar2 = fVar;
            if (fVar2 == null) {
                int i = C0640u.a;
                return null;
            }
            fVar2.k(g.this.f4064c);
            fVar2.k0(g.this.f4065d);
            return "";
        }
    }

    g() {
        super("com.hihonor.id");
        this.f4064c = new com.bytedance.bdinstall.i0.a();
        this.f4065d = new com.bytedance.bdinstall.i0.b();
    }

    @Override // com.bytedance.bdinstall.m0.b, com.bytedance.bdinstall.m0.m
    public m.a a(Context context) {
        m.a aVar = new m.a();
        try {
            Intent intent = new Intent();
            intent.setAction("com.hihonor.id.HnOaIdService");
            intent.setPackage("com.hihonor.id");
            new u(context, intent, new a()).a();
            aVar.a = this.f4064c.b0();
            aVar.b = this.f4065d.d();
            int i = C0640u.a;
            return aVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return aVar;
        }
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected Intent d(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.hihonor.id.HnOaIdService");
        intent.setPackage("com.hihonor.id");
        return intent;
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected u.b<com.bytedance.bdinstall.m0.w.f, String> e() {
        return new a();
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return SystemUtils.PRODUCT_HONOR;
    }
}
