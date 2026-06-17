package com.bytedance.frameworks.baselib.network.http.impl;

import java.net.URI;

/* loaded from: classes.dex */
public interface d {
    public static final d a = new a();
    public static final d b = new b();

    class a implements d {
        a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.impl.d
        public boolean a(URI uri, f fVar) {
            return true;
        }
    }

    class b implements d {
        b() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.impl.d
        public boolean a(URI uri, f fVar) {
            return f.p(fVar.q(), uri.getHost());
        }
    }

    boolean a(URI uri, f fVar);
}
