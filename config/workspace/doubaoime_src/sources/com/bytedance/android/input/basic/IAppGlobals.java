package com.bytedance.android.input.basic;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public interface IAppGlobals {
    public static final a a = a.b;

    public static final class a implements IAppGlobals {
        static final /* synthetic */ a b;

        /* renamed from: c, reason: collision with root package name */
        private static final e<IAppGlobals> f2043c;

        /* renamed from: d, reason: collision with root package name */
        private static final Application f2044d;

        /* renamed from: e, reason: collision with root package name */
        private static final String f2045e;

        /* renamed from: f, reason: collision with root package name */
        private static final String f2046f;

        /* renamed from: g, reason: collision with root package name */
        private static final int f2047g;
        private static final String h;

        /* renamed from: com.bytedance.android.input.basic.IAppGlobals$a$a, reason: collision with other inner class name */
        static final class C0051a extends m implements kotlin.s.b.a<IAppGlobals> {
            public static final C0051a a = new C0051a();

            C0051a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public IAppGlobals invoke() {
                IAppGlobals iAppGlobals = (IAppGlobals) com.ss.android.i.a.a.a.e.a().b(IAppGlobals.class);
                if (iAppGlobals != null) {
                    return iAppGlobals;
                }
                throw new IllegalStateException("app module must have an implementation of this service".toString());
            }
        }

        static {
            a aVar = new a();
            b = aVar;
            f2043c = kotlin.a.c(C0051a.a);
            f2044d = aVar.M().getApplication();
            f2045e = aVar.M().f();
            f2046f = aVar.M().r();
            f2047g = aVar.M().A();
            h = aVar.M().s();
        }

        private a() {
        }

        private final IAppGlobals M() {
            return f2043c.getValue();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public int A() {
            return f2047g;
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean B() {
            return M().B();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean C() {
            return M().C();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public Drawable D(Context context, int i) {
            l.f(context, "context");
            return M().D(context, i);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public View E(Context context, int i) {
            l.f(context, "context");
            return M().E(context, i);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean F() {
            return M().F();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public void G(String str) {
            l.f(str, "name");
            M().G(str);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public String H() {
            return M().H();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean I() {
            return M().I();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public void J(String str, Throwable th) {
            l.f(str, "tag");
            l.f(th, "throwable");
            M().J(str, th);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean K() {
            return M().K();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public void L(String str, String str2) {
            l.f(str, "tag");
            l.f(str2, "msg");
            M().L(str, str2);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public int a() {
            return M().a();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean b() {
            return M().b();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public int c() {
            return M().c();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public String d() {
            return M().d();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public void e(String str, String str2) {
            l.f(str, "tag");
            l.f(str2, "msg");
            M().e(str, str2);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public String f() {
            return f2045e;
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public Context g(int i) {
            return M().g(i);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public Application getApplication() {
            return f2044d;
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public Context getContext() {
            return M().getContext();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean h() {
            return M().h();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public void i() {
            M().i();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public void j(String str, String str2) {
            l.f(str, "tag");
            l.f(str2, "msg");
            M().j(str, str2);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean k(boolean z) {
            return M().k(z);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public int l(Context context, int i) {
            l.f(context, "context");
            return M().l(context, i);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean m(boolean z) {
            return M().m(z);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public boolean n() {
            return M().n();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public SharedPreferences o() {
            return M().o();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public void p() {
            M().p();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public int q() {
            return M().q();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public String r() {
            return f2046f;
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public String s() {
            return h;
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public String t() {
            return M().t();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public SharedPreferences u() {
            return M().u();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public int v() {
            return M().v();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public int w() {
            return M().w();
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public void x(String str, String str2) {
            l.f(str, "tag");
            l.f(str2, "msg");
            M().x(str, str2);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public void y(Configuration configuration) {
            l.f(configuration, "configuration");
            M().y(configuration);
        }

        @Override // com.bytedance.android.input.basic.IAppGlobals
        public View z(Context context, int i, ViewGroup viewGroup, boolean z) {
            l.f(context, "context");
            l.f(viewGroup, "root");
            return M().z(context, i, viewGroup, z);
        }
    }

    int A();

    boolean B();

    boolean C();

    Drawable D(Context context, int i);

    View E(Context context, int i);

    boolean F();

    void G(String str);

    String H();

    boolean I();

    void J(String str, Throwable th);

    boolean K();

    void L(String str, String str2);

    int a();

    boolean b();

    int c();

    String d();

    void e(String str, String str2);

    String f();

    Context g(int i);

    Application getApplication();

    Context getContext();

    boolean h();

    void i();

    void j(String str, String str2);

    boolean k(boolean z);

    int l(Context context, int i);

    boolean m(boolean z);

    boolean n();

    SharedPreferences o();

    void p();

    int q();

    String r();

    String s();

    String t();

    SharedPreferences u();

    int v();

    int w();

    void x(String str, String str2);

    void y(Configuration configuration);

    View z(Context context, int i, ViewGroup viewGroup, boolean z);
}
