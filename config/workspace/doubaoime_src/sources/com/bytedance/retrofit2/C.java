package com.bytedance.retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
class C extends D<Object> {
    final /* synthetic */ D a;

    C(D d2) {
        this.a = d2;
    }

    @Override // com.bytedance.retrofit2.D
    void a(F f2, Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.a(f2, Array.get(obj, i));
        }
    }
}
