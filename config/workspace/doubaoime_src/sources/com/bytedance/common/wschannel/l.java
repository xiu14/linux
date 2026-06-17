package com.bytedance.common.wschannel;

import android.app.Application;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class l {
    private Application a;

    @Nullable
    private com.bytedance.common.wschannel.app.c b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4263c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4264d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4265e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bytedance.common.wschannel.app.a f4266f;

    public static class a {
        private Application a;
        private com.bytedance.common.wschannel.app.c b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4267c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4268d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4269e = false;

        /* renamed from: f, reason: collision with root package name */
        private com.bytedance.common.wschannel.app.a f4270f;

        public a a(Application application) {
            this.a = application;
            return this;
        }

        public a b(com.bytedance.common.wschannel.app.a aVar) {
            this.f4270f = aVar;
            return this;
        }

        public l c() {
            return new l(this.a, this.b, this.f4267c, this.f4268d, this.f4269e, this.f4270f);
        }

        public a d(boolean z) {
            this.f4268d = z;
            return this;
        }

        public a e(boolean z) {
            this.f4267c = z;
            return this;
        }

        public a f(boolean z) {
            this.f4269e = z;
            return this;
        }

        public a g(com.bytedance.common.wschannel.app.c cVar) {
            this.b = cVar;
            return this;
        }
    }

    public l(Application application, @Nullable com.bytedance.common.wschannel.app.c cVar, boolean z, boolean z2, boolean z3, com.bytedance.common.wschannel.app.a aVar) {
        this.a = application;
        this.b = cVar;
        this.f4263c = z;
        this.f4264d = z2;
        this.f4265e = z3;
        this.f4266f = aVar;
    }

    public Application a() {
        return this.a;
    }

    @Nullable
    public com.bytedance.common.wschannel.app.c b() {
        return this.b;
    }

    public boolean c() {
        return this.f4264d;
    }

    public boolean d() {
        return this.f4263c;
    }

    public boolean e() {
        return this.f4265e;
    }
}
