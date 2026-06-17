package com.ss.android.c;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes2.dex */
public class d {
    private Context a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f8288c;

    /* renamed from: d, reason: collision with root package name */
    private int f8289d;

    /* renamed from: e, reason: collision with root package name */
    private String f8290e;

    /* renamed from: f, reason: collision with root package name */
    private String f8291f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8292g;
    private boolean h;
    private int i;
    private String j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private float q;

    public static class b {
        private Context a;

        /* renamed from: c, reason: collision with root package name */
        private String f8293c;
        private int b = 20971520;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8294d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8295e = false;

        public b(Context context) {
            if (context == null) {
                throw new RuntimeException("context must not be null");
            }
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext != null ? applicationContext : context;
        }

        public d a() {
            String str;
            File filesDir;
            String str2 = null;
            d dVar = new d(null);
            dVar.u(this.a);
            dVar.A(14);
            dVar.C(this.b);
            dVar.H(0.1f);
            dVar.F(2097152);
            if (TextUtils.isEmpty(null) && (filesDir = this.a.getFilesDir()) != null) {
                File file = new File(filesDir.getAbsolutePath(), "ALOG");
                if (!file.exists()) {
                    file.mkdir();
                }
                str2 = file.getAbsolutePath();
            }
            dVar.r(str2);
            if (TextUtils.isEmpty(this.f8293c)) {
                File file2 = new File(this.a.getFilesDir(), "logs");
                if (!file2.exists()) {
                    file2.mkdir();
                }
                str = file2.getAbsolutePath();
            } else {
                str = this.f8293c;
            }
            dVar.z(str);
            dVar.t(true);
            dVar.x(true);
            dVar.y(3);
            dVar.G("fecbb32b759120b672045f74edc41d159b6a426ffc863b9e0be9ad4be12824546f549959b838993a430344f15197221e87bd362298814c75f5068148b980306f");
            dVar.B(true);
            dVar.E(this.f8294d);
            dVar.v(false);
            dVar.w(false);
            dVar.D(this.f8295e);
            dVar.s(64);
            return dVar;
        }

        public b b(String str) {
            this.f8293c = str;
            return this;
        }

        public b c(int i) {
            this.b = i;
            return this;
        }

        public b d(boolean z) {
            this.f8295e = z;
            return this;
        }

        public b e(boolean z) {
            this.f8294d = z;
            return this;
        }
    }

    d(a aVar) {
    }

    public void A(int i) {
        this.b = i;
    }

    public void B(boolean z) {
        this.k = z;
    }

    public void C(int i) {
        this.f8288c = i;
    }

    public void D(boolean z) {
        this.n = z;
    }

    public void E(boolean z) {
        this.l = z;
    }

    public void F(int i) {
        this.f8289d = i;
    }

    public void G(String str) {
        this.j = str;
    }

    public void H(float f2) {
        this.q = f2;
    }

    public boolean a() {
        return this.m;
    }

    public boolean b() {
        return this.o;
    }

    public String c() {
        return this.f8290e;
    }

    public int d() {
        return this.p;
    }

    public Context e() {
        return this.a;
    }

    public int f() {
        return this.i;
    }

    public String g() {
        return this.f8291f;
    }

    public int h() {
        return this.b;
    }

    public int i() {
        return this.f8288c;
    }

    public int j() {
        return this.f8289d;
    }

    public String k() {
        return this.j;
    }

    public float l() {
        return this.q;
    }

    public boolean m() {
        return this.f8292g;
    }

    public boolean n() {
        return this.h;
    }

    public boolean o() {
        return this.k;
    }

    public boolean p() {
        return this.n;
    }

    public boolean q() {
        return this.l;
    }

    public void r(String str) {
        this.f8290e = str;
    }

    public void s(int i) {
        this.p = i;
    }

    public void t(boolean z) {
        this.f8292g = z;
    }

    public void u(Context context) {
        this.a = context;
    }

    public void v(boolean z) {
        this.m = z;
    }

    public void w(boolean z) {
        this.o = z;
    }

    public void x(boolean z) {
        this.h = z;
    }

    public void y(int i) {
        this.i = i;
    }

    public void z(String str) {
        this.f8291f = str;
    }
}
