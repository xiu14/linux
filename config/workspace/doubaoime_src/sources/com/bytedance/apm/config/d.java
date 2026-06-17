package com.bytedance.apm.config;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private String a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f3401c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f3402d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f3403e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3404f;

    public static final class b {
        private String a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private JSONObject f3405c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f3406d;

        /* renamed from: e, reason: collision with root package name */
        private JSONObject f3407e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3408f;

        b(a aVar) {
        }

        public b g(boolean z) {
            this.f3408f = z;
            return this;
        }

        public b h(JSONObject jSONObject) {
            this.f3405c = jSONObject;
            return this;
        }

        public b i(JSONObject jSONObject) {
            this.f3407e = null;
            return this;
        }

        public b j(JSONObject jSONObject) {
            this.f3406d = null;
            return this;
        }

        public b k(String str) {
            this.a = str;
            return this;
        }

        public b l(int i) {
            this.b = i;
            return this;
        }
    }

    public d(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f3401c = bVar.f3405c;
        this.f3402d = bVar.f3406d;
        this.f3403e = bVar.f3407e;
        this.f3404f = bVar.f3408f;
    }

    public static b a() {
        return new b(null);
    }

    public JSONObject b() {
        return this.f3401c;
    }

    public JSONObject c() {
        return this.f3403e;
    }

    public JSONObject d() {
        return this.f3402d;
    }

    public String e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public boolean g() {
        return this.f3404f;
    }
}
