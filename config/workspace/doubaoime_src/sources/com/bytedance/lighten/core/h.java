package com.bytedance.lighten.core;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class h {
    private Context a;
    private Bitmap.Config b;

    /* renamed from: c, reason: collision with root package name */
    private int f5340c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5342e;

    /* renamed from: d, reason: collision with root package name */
    private int f5341d = 5;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5343f = true;

    public static final class b {
        private Context a;
        private Bitmap.Config b;

        /* renamed from: c, reason: collision with root package name */
        private int f5344c = -1;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5345d;

        b(Context context) {
            this.a = context;
        }

        public b e(Bitmap.Config config) {
            this.b = config;
            return this;
        }

        public h f() {
            return new h(this, null);
        }

        public b g(boolean z) {
            this.f5345d = z;
            return this;
        }

        public b h(int i) {
            this.f5344c = i;
            return this;
        }
    }

    h(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f5340c = bVar.f5344c;
        this.f5342e = bVar.f5345d;
    }

    public static b g(Context context) {
        return new b(context);
    }

    public Bitmap.Config a() {
        return this.b;
    }

    public Context b() {
        return this.a;
    }

    public int c() {
        return this.f5341d;
    }

    public int d() {
        return this.f5340c;
    }

    public boolean e() {
        return this.f5342e;
    }

    public boolean f() {
        return this.f5343f;
    }
}
