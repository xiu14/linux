package com.bytedance.bdinstall.m0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.bdinstall.m0.m;
import com.bytedance.bdinstall.m0.u;
import com.bytedance.bdinstall.m0.w.a;

/* loaded from: classes.dex */
final class d extends b<com.bytedance.bdinstall.m0.w.a> {

    /* renamed from: c, reason: collision with root package name */
    private final Context f4062c;

    class a implements u.b<com.bytedance.bdinstall.m0.w.a, String> {
        a() {
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public com.bytedance.bdinstall.m0.w.a a(IBinder iBinder) {
            return a.AbstractBinderC0157a.d(iBinder);
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public String b(com.bytedance.bdinstall.m0.w.a aVar) throws Exception {
            com.bytedance.bdinstall.m0.w.a aVar2 = aVar;
            if (aVar2 == null) {
                return null;
            }
            return aVar2.v(d.this.f4062c.getPackageName());
        }
    }

    d(Context context) {
        super("com.coolpad.deviceidsupport");
        this.f4062c = context;
    }

    @Override // com.bytedance.bdinstall.m0.b, com.bytedance.bdinstall.m0.m
    public m.a a(Context context) {
        try {
            String string = Settings.Global.getString(context.getContentResolver(), "coolos.oaid");
            if (!TextUtils.isEmpty(string)) {
                m.a aVar = new m.a();
                aVar.a = string;
                return aVar;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.a(context);
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected Intent d(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
        return intent;
    }

    @Override // com.bytedance.bdinstall.m0.b
    protected u.b<com.bytedance.bdinstall.m0.w.a, String> e() {
        return new a();
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "coolpad";
    }
}
