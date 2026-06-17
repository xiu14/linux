package com.bytedance.services.apm.api;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    private String a;
    private JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6083c;

    /* renamed from: com.bytedance.services.apm.api.b$b, reason: collision with other inner class name */
    public static final class C0316b {
        private String a;
        private JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6084c;

        C0316b(a aVar) {
        }

        public C0316b d(boolean z) {
            this.f6084c = z;
            return this;
        }

        public C0316b e(JSONObject jSONObject) {
            this.b = jSONObject;
            return this;
        }

        public C0316b f(String str) {
            this.a = str;
            return this;
        }
    }

    public b(C0316b c0316b) {
        this.a = c0316b.a;
        this.b = c0316b.b;
        this.f6083c = c0316b.f6084c;
    }

    public static C0316b a() {
        return new C0316b(null);
    }

    public JSONObject b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.f6083c;
    }
}
