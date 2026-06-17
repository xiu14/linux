package com.bytedance.android.input.environment.api;

import android.graphics.Movie;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.io.InputStream;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public interface IEnvironment {
    public static final a a = a.b;

    public static final class a implements IEnvironment {
        static final /* synthetic */ a b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final e<IEnvironment> f2292c = kotlin.a.c(C0067a.a);

        /* renamed from: com.bytedance.android.input.environment.api.IEnvironment$a$a, reason: collision with other inner class name */
        static final class C0067a extends m implements kotlin.s.b.a<IEnvironment> {
            public static final C0067a a = new C0067a();

            C0067a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public IEnvironment invoke() {
                IEnvironment iEnvironment = (IEnvironment) com.ss.android.i.a.a.a.e.a().b(IEnvironment.class);
                if (iEnvironment != null) {
                    return iEnvironment;
                }
                throw new IllegalStateException("app module must have an implementation of this service！".toString());
            }
        }

        private a() {
        }

        private final IEnvironment m() {
            return f2292c.getValue();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public String a() {
            return m().a();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public String b() {
            return m().b();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public boolean c() {
            return m().c();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public String d() {
            return m().d();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public String e() {
            return m().e();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public Movie f(String str) {
            l.f(str, DownloadConstants.PATH_KEY);
            return m().f(str);
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public InputStream g(String str) {
            l.f(str, DownloadConstants.PATH_KEY);
            return m().g(str);
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public String h() {
            return m().h();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public String i() {
            return m().i();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public String j() {
            return m().j();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public String k() {
            return m().k();
        }

        @Override // com.bytedance.android.input.environment.api.IEnvironment
        public String l() {
            return m().l();
        }

        public final IEnvironment n() {
            return this;
        }
    }

    String a();

    String b();

    boolean c();

    String d();

    String e();

    Movie f(String str);

    InputStream g(String str);

    String h();

    String i();

    String j();

    String k();

    String l();
}
