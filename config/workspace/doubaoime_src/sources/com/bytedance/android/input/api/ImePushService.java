package com.bytedance.android.input.api;

import android.content.Context;
import java.util.Set;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public interface ImePushService {
    public static final a a = a.b;

    public static final class a implements ImePushService {
        static final /* synthetic */ a b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final e<Set<ImePushService>> f2030c = kotlin.a.c(C0049a.a);

        /* renamed from: com.bytedance.android.input.api.ImePushService$a$a, reason: collision with other inner class name */
        static final class C0049a extends m implements kotlin.s.b.a<Set<? extends ImePushService>> {
            public static final C0049a a = new C0049a();

            C0049a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public Set<? extends ImePushService> invoke() {
                Set<? extends ImePushService> c2 = com.ss.android.i.a.a.a.e.a().c(ImePushService.class);
                l.e(c2, "get().getServices(T::class.java)");
                return c2;
            }
        }

        private a() {
        }

        @Override // com.bytedance.android.input.api.ImePushService
        public void a(Context context, int i, com.bytedance.android.input.api.a aVar, String str) {
            l.f(context, "context");
            l.f(aVar, "body");
            Set<ImePushService> value = f2030c.getValue();
            if (value != null) {
                for (ImePushService imePushService : value) {
                    if (imePushService != null) {
                        imePushService.a(context, i, aVar, str);
                    }
                }
            }
        }

        @Override // com.bytedance.android.input.api.ImePushService
        public void b(Context context, int i, com.bytedance.android.input.api.a aVar) {
            l.f(aVar, "body");
            Set<ImePushService> value = f2030c.getValue();
            if (value != null) {
                for (ImePushService imePushService : value) {
                    if (imePushService != null) {
                        imePushService.b(context, i, aVar);
                    }
                }
            }
        }
    }

    void a(Context context, int i, com.bytedance.android.input.api.a aVar, String str);

    void b(Context context, int i, com.bytedance.android.input.api.a aVar);
}
