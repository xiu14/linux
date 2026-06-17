package com.bytedance.bdinstall.m0;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.bdinstall.m0.m;
import com.bytedance.bdinstall.m0.u;

/* loaded from: classes.dex */
abstract class b<SERVICE> implements m {
    private final String a;
    private final com.bytedance.bdinstall.util.p<Boolean> b = new a();

    class a extends com.bytedance.bdinstall.util.p<Boolean> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected Boolean a(Object[] objArr) {
            boolean z = false;
            Context context = (Context) objArr[0];
            try {
                if (context.getPackageManager().getPackageInfo(b.this.a, 128) != null) {
                    z = true;
                }
            } catch (Throwable unused) {
            }
            return Boolean.valueOf(z);
        }
    }

    b(String str) {
        this.a = str;
    }

    @Override // com.bytedance.bdinstall.m0.m
    public m.a a(Context context) {
        String str = (String) new u(context, d(context), e()).a();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        m.a aVar = new m.a();
        aVar.a = str;
        return aVar;
    }

    @Override // com.bytedance.bdinstall.m0.m
    public boolean b(Context context) {
        if (context == null) {
            return false;
        }
        return this.b.b(context).booleanValue();
    }

    protected abstract Intent d(Context context);

    protected abstract u.b<SERVICE, String> e();
}
