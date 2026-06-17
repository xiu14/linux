package com.bytedance.ttnet.i;

import com.bytedance.frameworks.baselib.network.http.b;

/* loaded from: classes2.dex */
public class b extends com.bytedance.frameworks.baselib.network.http.b<d> {
    public int T = -1;

    class a implements b.InterfaceC0254b {
        a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.b.InterfaceC0254b
        public com.bytedance.frameworks.baselib.network.http.b a() {
            return new b();
        }
    }

    public static void q() {
        com.bytedance.frameworks.baselib.network.http.b.p(new a());
    }
}
