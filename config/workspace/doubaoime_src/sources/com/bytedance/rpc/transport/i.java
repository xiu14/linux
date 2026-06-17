package com.bytedance.rpc.transport;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public class i {
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f6070c;

    /* renamed from: d, reason: collision with root package name */
    private e f6071d;

    public static class b {
        private int a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, String> f6072c;

        /* renamed from: d, reason: collision with root package name */
        private e f6073d;

        b(int i, a aVar) {
            this.a = i;
        }

        public i e() {
            return new i(this, null);
        }

        public b f(e eVar) {
            this.f6073d = eVar;
            return this;
        }

        public b g(Map<String, String> map) {
            this.f6072c = map;
            return this;
        }

        public b h(String str) {
            this.b = str;
            return this;
        }
    }

    i(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f6070c = bVar.f6072c;
        this.f6071d = bVar.f6073d;
    }

    public static b h(int i) {
        return new b(i, null);
    }

    public e a() {
        return this.f6071d;
    }

    public long b() {
        e eVar = this.f6071d;
        if (eVar == null) {
            return 0L;
        }
        try {
            return ((com.bytedance.rpc.transport.ttnet.b) eVar).b();
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public String c() {
        e eVar = this.f6071d;
        return eVar == null ? "" : ((com.bytedance.rpc.transport.ttnet.b) eVar).c();
    }

    public Map<String, String> d() {
        return this.f6070c;
    }

    public int e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public boolean g() {
        int i = this.a;
        return i >= 200 && i < 300;
    }
}
