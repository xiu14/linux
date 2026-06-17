package com.bytedance.android.input.common_biz.permission.spi;

import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public interface IPermissionConfig {
    public static final a a = a.b;

    public static final class a implements IPermissionConfig {
        static final /* synthetic */ a b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final e<IPermissionConfig> f2269c = kotlin.a.c(C0066a.a);

        /* renamed from: com.bytedance.android.input.common_biz.permission.spi.IPermissionConfig$a$a, reason: collision with other inner class name */
        static final class C0066a extends m implements kotlin.s.b.a<IPermissionConfig> {
            public static final C0066a a = new C0066a();

            C0066a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public IPermissionConfig invoke() {
                return (IPermissionConfig) com.ss.android.i.a.a.a.e.a().b(IPermissionConfig.class);
            }
        }

        private a() {
        }

        @Override // com.bytedance.android.input.common_biz.permission.spi.IPermissionConfig
        public void a(String str, boolean z) {
            l.f(str, "key");
            IPermissionConfig value = f2269c.getValue();
            if (value != null) {
                value.a(str, z);
            }
        }
    }

    void a(String str, boolean z);
}
