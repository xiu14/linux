package com.vivo.push.restructure.a.a;

import android.text.TextUtils;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
final class m {
    private String a;
    private String b;

    public m(com.vivo.push.restructure.a.a aVar, String str) {
        if (aVar != null) {
            this.a = aVar.a();
        }
        this.b = str;
    }

    public final com.vivo.push.b.h a() {
        if (!TextUtils.isEmpty(this.a) && !TextUtils.isEmpty(this.b)) {
            return new com.vivo.push.b.h(this.a, this.b);
        }
        t.a("convertOffLineMsg() error, mMessageID = " + this.a + ", mNodeArrayInfo = " + this.b);
        return null;
    }
}
