package com.bytedance.android.input.basic.data_storage.api;

import android.content.Context;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public interface ImeKv {
    public static final b a = b.b;

    public enum ProcessMode {
        SINGLE,
        MULTI
    }

    public interface a {
        void a(KvRepoStrategy kvRepoStrategy, String str);
    }

    public static final class b implements ImeKv {
        static final /* synthetic */ b b = new b();

        /* renamed from: c, reason: collision with root package name */
        private static final e<ImeKv> f2058c = kotlin.a.c(a.a);

        static final class a extends m implements kotlin.s.b.a<ImeKv> {
            public static final a a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ImeKv invoke() {
                return (ImeKv) com.ss.android.i.a.a.a.e.a().b(ImeKv.class);
            }
        }

        private b() {
        }

        private final ImeKv e() {
            return f2058c.getValue();
        }

        @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
        public <T> void a(KvRepoStrategy kvRepoStrategy, String str, T t) {
            l.f(kvRepoStrategy, "repoStrategy");
            l.f(str, "key");
            ImeKv e2 = e();
            if (e2 != null) {
                e2.a(kvRepoStrategy, str, t);
            }
        }

        @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
        public void b(KvRepoStrategy kvRepoStrategy, a aVar) {
            l.f(kvRepoStrategy, "repoStrategy");
            l.f(aVar, "listener");
            ImeKv e2 = e();
            if (e2 != null) {
                e2.b(kvRepoStrategy, aVar);
            }
        }

        @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
        public <T> T c(KvRepoStrategy kvRepoStrategy, String str, T t) {
            T t2;
            l.f(kvRepoStrategy, "repoStrategy");
            l.f(str, "key");
            ImeKv e2 = e();
            return (e2 == null || (t2 = (T) e2.c(kvRepoStrategy, str, t)) == null) ? t : t2;
        }

        @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
        public void d(KvRepoStrategy kvRepoStrategy, a aVar) {
            l.f(kvRepoStrategy, "repoStrategy");
            l.f(aVar, "listener");
            ImeKv e2 = e();
            if (e2 != null) {
                e2.d(kvRepoStrategy, aVar);
            }
        }

        @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
        public void init(Context context) {
            l.f(context, "context");
            ImeKv e2 = e();
            if (e2 != null) {
                e2.init(context);
            }
        }
    }

    <T> void a(KvRepoStrategy kvRepoStrategy, String str, T t);

    void b(KvRepoStrategy kvRepoStrategy, a aVar);

    <T> T c(KvRepoStrategy kvRepoStrategy, String str, T t);

    void d(KvRepoStrategy kvRepoStrategy, a aVar);

    void init(Context context);
}
