package com.bytedance.push;

import android.content.Context;

/* loaded from: classes2.dex */
class G implements com.bytedance.push.third.e {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    G(H h, String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.bytedance.push.third.e
    public int a() {
        return this.b;
    }

    @Override // com.bytedance.push.third.e
    public String b(Context context) {
        return this.a;
    }
}
