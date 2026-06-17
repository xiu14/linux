package com.bytedance.ttnet.utils;

import com.bytedance.frameworks.baselib.network.http.g;
import com.bytedance.retrofit2.InterfaceC0701e;

/* loaded from: classes2.dex */
class c implements g {
    final /* synthetic */ String a;
    final /* synthetic */ InterfaceC0701e b;

    c(String str, InterfaceC0701e interfaceC0701e) {
        this.a = str;
        this.b = interfaceC0701e;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.g
    public void a() {
        try {
            InterfaceC0701e interfaceC0701e = this.b;
            if (interfaceC0701e != null) {
                interfaceC0701e.cancel();
            }
        } catch (Throwable unused) {
        }
    }
}
