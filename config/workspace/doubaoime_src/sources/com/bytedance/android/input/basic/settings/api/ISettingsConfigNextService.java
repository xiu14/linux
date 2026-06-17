package com.bytedance.android.input.basic.settings.api;

import com.ss.android.message.log.PushLog;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public interface ISettingsConfigNextService {
    public static final a a = a.b;

    public static final class a implements ISettingsConfigNextService {
        static final /* synthetic */ a b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final e<ISettingsConfigNextService> f2083c = kotlin.a.c(C0060a.a);

        /* renamed from: com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService$a$a, reason: collision with other inner class name */
        static final class C0060a extends m implements kotlin.s.b.a<ISettingsConfigNextService> {
            public static final C0060a a = new C0060a();

            C0060a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ISettingsConfigNextService invoke() {
                return (ISettingsConfigNextService) com.ss.android.i.a.a.a.e.a().b(ISettingsConfigNextService.class);
            }
        }

        private a() {
        }

        @Override // com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService
        public Object a(String str) {
            l.f(str, "key");
            ISettingsConfigNextService value = f2083c.getValue();
            if (value != null) {
                return value.a(str);
            }
            return null;
        }

        @Override // com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService
        public void b(String str, Object obj) {
            l.f(str, "key");
            l.f(obj, PushLog.KEY_VALUE);
            ISettingsConfigNextService value = f2083c.getValue();
            if (value != null) {
                value.b(str, obj);
            }
        }
    }

    Object a(String str);

    void b(String str, Object obj);
}
