package com.bytedance.android.input.common.s.a;

import android.app.ActivityOptions;
import android.content.Context;
import java.util.Map;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public interface a {
    public static final C0063a a = C0063a.b;

    /* renamed from: com.bytedance.android.input.common.s.a.a$a, reason: collision with other inner class name */
    public static final class C0063a implements a {
        static final /* synthetic */ C0063a b = new C0063a();

        /* renamed from: c, reason: collision with root package name */
        private static final e<a> f2212c = kotlin.a.c(C0064a.a);

        /* renamed from: com.bytedance.android.input.common.s.a.a$a$a, reason: collision with other inner class name */
        static final class C0064a extends m implements kotlin.s.b.a<a> {
            public static final C0064a a = new C0064a();

            C0064a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public a invoke() {
                return (a) com.ss.android.i.a.a.a.e.a().b(a.class);
            }
        }

        private C0063a() {
        }

        private final a d() {
            return f2212c.getValue();
        }

        @Override // com.bytedance.android.input.common.s.a.a
        public b a() {
            b a;
            a d2 = d();
            if (d2 != null && (a = d2.a()) != null) {
                return a;
            }
            a();
            return null;
        }

        @Override // com.bytedance.android.input.common.s.a.a
        public Map<String, String> b() {
            a d2 = d();
            if (d2 != null) {
                return d2.b();
            }
            return null;
        }

        @Override // com.bytedance.android.input.common.s.a.a
        public void c(Context context, ActivityOptions activityOptions) {
            l.f(context, "context");
            a d2 = d();
            if (d2 != null) {
                d2.c(context, activityOptions);
            }
        }
    }

    public static final class b {
    }

    b a();

    Map<String, String> b();

    void c(Context context, ActivityOptions activityOptions);
}
