package com.bytedance.news.common.settings;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.bytedance.news.common.settings.api.request.RequestV3Service;
import com.bytedance.news.common.settings.e.e;
import com.bytedance.news.common.settings.e.f;
import com.bytedance.news.common.settings.e.h;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class a implements com.bytedance.news.common.settings.internal.b {
    private Context a;
    private com.bytedance.news.common.settings.e.b b;

    /* renamed from: c, reason: collision with root package name */
    private c f5489c;

    public static class b {
        private Context a;
        private h b;

        /* renamed from: c, reason: collision with root package name */
        private com.bytedance.news.common.settings.e.b f5490c;

        /* renamed from: d, reason: collision with root package name */
        private Executor f5491d;

        /* renamed from: e, reason: collision with root package name */
        private long f5492e = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f5493f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5494g = true;

        public a a() {
            if (this.a == null) {
                throw new IllegalArgumentException("context不能为空");
            }
            if (this.f5490c == null) {
                throw new IllegalArgumentException("requestService不能为空");
            }
            if (this.b == null) {
                this.b = new com.bytedance.news.common.settings.f.a();
            }
            if (this.f5491d == null) {
                this.f5491d = Executors.newCachedThreadPool();
            }
            if (this.f5492e < 0) {
                this.f5492e = 3600000L;
            }
            if (this.f5493f < 0) {
                this.f5493f = 120000L;
            }
            c cVar = new c(null);
            cVar.b = this.b;
            cVar.f5495c = this.f5491d;
            cVar.f5496d = this.f5492e;
            cVar.f5497e = this.f5493f;
            cVar.f5498f = this.f5494g;
            cVar.f5499g = true;
            Context context = this.a;
            return context instanceof Application ? new a(context, this.f5490c, cVar, null) : new a(context.getApplicationContext(), this.f5490c, cVar, null);
        }

        public b b(Context context) {
            this.a = context;
            return this;
        }

        public b c(boolean z) {
            this.f5494g = z;
            return this;
        }

        public b d(com.bytedance.news.common.settings.e.b bVar) {
            this.f5490c = bVar;
            return this;
        }
    }

    private static class c {
        public String a;
        public h b;

        /* renamed from: c, reason: collision with root package name */
        public Executor f5495c;

        /* renamed from: d, reason: collision with root package name */
        public long f5496d;

        /* renamed from: e, reason: collision with root package name */
        public long f5497e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5498f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f5499g = true;

        c(C0280a c0280a) {
        }
    }

    a(Context context, com.bytedance.news.common.settings.e.b bVar, c cVar, C0280a c0280a) {
        this.a = context;
        this.b = bVar;
        this.f5489c = cVar;
    }

    public Context a() {
        return this.a;
    }

    @Nullable
    public com.bytedance.news.common.settings.e.a b() {
        Objects.requireNonNull(this.f5489c);
        return null;
    }

    public Executor c() {
        return this.f5489c.f5495c;
    }

    public String d() {
        return this.f5489c.a;
    }

    public int e() {
        Objects.requireNonNull(this.f5489c);
        return 0;
    }

    @Nullable
    public void f() {
        Objects.requireNonNull(this.f5489c);
    }

    public com.bytedance.news.common.settings.e.b g() {
        return this.b;
    }

    @Nullable
    public RequestV3Service h() {
        Objects.requireNonNull(this.f5489c);
        return null;
    }

    public long i() {
        return this.f5489c.f5497e;
    }

    @Nullable
    public e j() {
        Objects.requireNonNull(this.f5489c);
        return null;
    }

    @Nullable
    public f k() {
        Objects.requireNonNull(this.f5489c);
        return null;
    }

    @Nullable
    public SharedPreferences l(Context context, String str, int i, boolean z) {
        Objects.requireNonNull(this.f5489c);
        return null;
    }

    public h m() {
        return this.f5489c.b;
    }

    public long n() {
        return this.f5489c.f5496d;
    }

    public boolean o() {
        Objects.requireNonNull(this.f5489c);
        return false;
    }

    public boolean p() {
        return this.f5489c.f5498f;
    }

    public boolean q() {
        Objects.requireNonNull(this.f5489c);
        return false;
    }

    public boolean r() {
        Objects.requireNonNull(this.f5489c);
        return false;
    }

    void s(String str) {
        this.f5489c.a = str;
    }

    public boolean t() {
        Objects.requireNonNull(this.f5489c);
        return false;
    }

    public boolean u() {
        return this.f5489c.f5499g;
    }
}
