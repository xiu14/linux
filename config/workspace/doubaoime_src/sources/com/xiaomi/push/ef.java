package com.xiaomi.push;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ef {

    public static final class a extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f313a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f316b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f319c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f321d;

        /* renamed from: e, reason: collision with other field name */
        private boolean f323e;

        /* renamed from: f, reason: collision with other field name */
        private boolean f324f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9054g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private int a = 0;

        /* renamed from: a, reason: collision with other field name */
        private long f311a = 0;

        /* renamed from: a, reason: collision with other field name */
        private String f312a = "";

        /* renamed from: b, reason: collision with other field name */
        private String f315b = "";

        /* renamed from: c, reason: collision with other field name */
        private String f318c = "";

        /* renamed from: d, reason: collision with other field name */
        private String f320d = "";

        /* renamed from: e, reason: collision with other field name */
        private String f322e = "";
        private int b = 1;

        /* renamed from: c, reason: collision with root package name */
        private int f9050c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f9051d = 0;

        /* renamed from: f, reason: collision with root package name */
        private String f9053f = "";

        /* renamed from: b, reason: collision with other field name */
        private long f314b = 0;

        /* renamed from: c, reason: collision with other field name */
        private long f317c = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f9052e = -1;

        /* renamed from: b, reason: collision with other method in class */
        public boolean m278b() {
            return this.f316b;
        }

        public int c() {
            return this.a;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m283d() {
            return this.f321d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m285e() {
            return this.f323e;
        }

        /* renamed from: f, reason: collision with other method in class */
        public boolean m287f() {
            return this.f324f;
        }

        public boolean g() {
            return this.f9054g;
        }

        public boolean h() {
            return this.h;
        }

        public boolean i() {
            return this.i;
        }

        public boolean j() {
            return this.j;
        }

        public boolean k() {
            return this.k;
        }

        public boolean l() {
            return this.l;
        }

        public boolean m() {
            return this.m;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m275a() {
            return this.f313a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m277b() {
            return this.f315b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m281c() {
            return this.f319c;
        }

        /* renamed from: d, reason: collision with other method in class */
        public String m282d() {
            return this.f320d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public String m284e() {
            return this.f322e;
        }

        public int f() {
            return this.f9051d;
        }

        public a a(int i) {
            this.f313a = true;
            this.a = i;
            return this;
        }

        public a b(String str) {
            this.f321d = true;
            this.f315b = str;
            return this;
        }

        /* renamed from: c, reason: collision with other method in class */
        public String m280c() {
            return this.f318c;
        }

        public a d(String str) {
            this.f324f = true;
            this.f320d = str;
            return this;
        }

        public a e(String str) {
            this.f9054g = true;
            this.f322e = str;
            return this;
        }

        /* renamed from: f, reason: collision with other method in class */
        public String m286f() {
            return this.f9053f;
        }

        public a c(String str) {
            this.f323e = true;
            this.f318c = str;
            return this;
        }

        public a f(String str) {
            this.k = true;
            this.f9053f = str;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public long m272a() {
            return this.f311a;
        }

        public a b(int i) {
            this.h = true;
            this.b = i;
            return this;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.f9050c;
        }

        public a a(long j) {
            this.f316b = true;
            this.f311a = j;
            return this;
        }

        public a c(int i) {
            this.i = true;
            this.f9050c = i;
            return this;
        }

        public a d(int i) {
            this.j = true;
            this.f9051d = i;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public long m276b() {
            return this.f314b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m274a() {
            return this.f312a;
        }

        public a b(long j) {
            this.l = true;
            this.f314b = j;
            return this;
        }

        /* renamed from: c, reason: collision with other method in class */
        public long m279c() {
            return this.f317c;
        }

        public a a(String str) {
            this.f319c = true;
            this.f312a = str;
            return this;
        }

        public a c(long j) {
            this.m = true;
            this.f317c = j;
            return this;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m275a() ? 0 + com.xiaomi.push.d.a(1, c()) : 0;
            if (m278b()) {
                a += com.xiaomi.push.d.b(2, m272a());
            }
            if (m281c()) {
                a += com.xiaomi.push.d.a(3, m274a());
            }
            if (m283d()) {
                a += com.xiaomi.push.d.a(4, m277b());
            }
            if (m285e()) {
                a += com.xiaomi.push.d.a(5, m280c());
            }
            if (m287f()) {
                a += com.xiaomi.push.d.a(6, m282d());
            }
            if (g()) {
                a += com.xiaomi.push.d.a(7, m284e());
            }
            if (h()) {
                a += com.xiaomi.push.d.a(8, d());
            }
            if (i()) {
                a += com.xiaomi.push.d.a(9, e());
            }
            if (j()) {
                a += com.xiaomi.push.d.a(10, f());
            }
            if (k()) {
                a += com.xiaomi.push.d.a(11, m286f());
            }
            if (l()) {
                a += com.xiaomi.push.d.b(12, m276b());
            }
            if (m()) {
                a += com.xiaomi.push.d.b(13, m279c());
            }
            this.f9052e = a;
            return a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public a m273a() {
            this.f324f = false;
            this.f320d = "";
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m275a()) {
                dVar.m207a(1, c());
            }
            if (m278b()) {
                dVar.m221b(2, m272a());
            }
            if (m281c()) {
                dVar.m211a(3, m274a());
            }
            if (m283d()) {
                dVar.m211a(4, m277b());
            }
            if (m285e()) {
                dVar.m211a(5, m280c());
            }
            if (m287f()) {
                dVar.m211a(6, m282d());
            }
            if (g()) {
                dVar.m211a(7, m284e());
            }
            if (h()) {
                dVar.m207a(8, d());
            }
            if (i()) {
                dVar.m207a(9, e());
            }
            if (j()) {
                dVar.m207a(10, f());
            }
            if (k()) {
                dVar.m211a(11, m286f());
            }
            if (l()) {
                dVar.m221b(12, m276b());
            }
            if (m()) {
                dVar.m221b(13, m279c());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.f9052e < 0) {
                b();
            }
            return this.f9052e;
        }

        @Override // com.xiaomi.push.f
        public a a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                switch (m145a) {
                    case 0:
                        return this;
                    case 8:
                        a(cVar.m154b());
                        break;
                    case 16:
                        a(cVar.m155b());
                        break;
                    case 26:
                        a(cVar.m148a());
                        break;
                    case 34:
                        b(cVar.m148a());
                        break;
                    case 42:
                        c(cVar.m148a());
                        break;
                    case 50:
                        d(cVar.m148a());
                        break;
                    case 58:
                        e(cVar.m148a());
                        break;
                    case 64:
                        b(cVar.m154b());
                        break;
                    case 72:
                        c(cVar.m154b());
                        break;
                    case 80:
                        d(cVar.m154b());
                        break;
                    case 90:
                        f(cVar.m148a());
                        break;
                    case 96:
                        b(cVar.m155b());
                        break;
                    case 104:
                        c(cVar.m155b());
                        break;
                    default:
                        if (!a(cVar, m145a)) {
                            return this;
                        }
                        break;
                }
            }
        }
    }

    public static final class b extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f325a;

        /* renamed from: c, reason: collision with other field name */
        private boolean f327c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f328d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9057e;

        /* renamed from: b, reason: collision with other field name */
        private boolean f326b = false;
        private int a = 0;
        private int b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f9055c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f9056d = -1;

        /* renamed from: b, reason: collision with other method in class */
        public boolean m289b() {
            return this.f325a;
        }

        public int c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.f9055c;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m288a() {
            return this.f326b;
        }

        public b b(int i) {
            this.f328d = true;
            this.b = i;
            return this;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m290c() {
            return this.f327c;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m291d() {
            return this.f328d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m292e() {
            return this.f9057e;
        }

        public b a(boolean z) {
            this.f325a = true;
            this.f326b = z;
            return this;
        }

        public b c(int i) {
            this.f9057e = true;
            this.f9055c = i;
            return this;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m289b() ? 0 + com.xiaomi.push.d.a(1, m288a()) : 0;
            if (m290c()) {
                a += com.xiaomi.push.d.a(3, c());
            }
            if (m291d()) {
                a += com.xiaomi.push.d.a(4, d());
            }
            if (m292e()) {
                a += com.xiaomi.push.d.a(5, e());
            }
            this.f9056d = a;
            return a;
        }

        public b a(int i) {
            this.f327c = true;
            this.a = i;
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m289b()) {
                dVar.m212a(1, m288a());
            }
            if (m290c()) {
                dVar.m207a(3, c());
            }
            if (m291d()) {
                dVar.m207a(4, d());
            }
            if (m292e()) {
                dVar.m207a(5, e());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.f9056d < 0) {
                b();
            }
            return this.f9056d;
        }

        @Override // com.xiaomi.push.f
        public b a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a == 8) {
                    a(cVar.m151a());
                } else if (m145a == 24) {
                    a(cVar.m154b());
                } else if (m145a == 32) {
                    b(cVar.m154b());
                } else if (m145a != 40) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    c(cVar.m154b());
                }
            }
        }

        public static b a(byte[] bArr) {
            return (b) new b().a(bArr);
        }
    }

    public static final class c extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f330a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f331b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f332c;

        /* renamed from: d, reason: collision with other field name */
        private boolean f333d;

        /* renamed from: e, reason: collision with other field name */
        private boolean f334e;

        /* renamed from: f, reason: collision with other field name */
        private boolean f335f;

        /* renamed from: a, reason: collision with other field name */
        private String f329a = "";
        private String b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f9058c = "";

        /* renamed from: d, reason: collision with root package name */
        private String f9059d = "";

        /* renamed from: e, reason: collision with root package name */
        private String f9060e = "";

        /* renamed from: f, reason: collision with root package name */
        private String f9061f = "";
        private int a = -1;

        /* renamed from: b, reason: collision with other method in class */
        public String m295b() {
            return this.b;
        }

        public String c() {
            return this.f9058c;
        }

        public String d() {
            return this.f9059d;
        }

        public String e() {
            return this.f9060e;
        }

        public String f() {
            return this.f9061f;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m293a() {
            return this.f329a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m296b() {
            return this.f331b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m297c() {
            return this.f332c;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m298d() {
            return this.f333d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m299e() {
            return this.f334e;
        }

        /* renamed from: f, reason: collision with other method in class */
        public boolean m300f() {
            return this.f335f;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m294a() {
            return this.f330a;
        }

        public c b(String str) {
            this.f331b = true;
            this.b = str;
            return this;
        }

        public c c(String str) {
            this.f332c = true;
            this.f9058c = str;
            return this;
        }

        public c d(String str) {
            this.f333d = true;
            this.f9059d = str;
            return this;
        }

        public c e(String str) {
            this.f334e = true;
            this.f9060e = str;
            return this;
        }

        public c f(String str) {
            this.f335f = true;
            this.f9061f = str;
            return this;
        }

        public c a(String str) {
            this.f330a = true;
            this.f329a = str;
            return this;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m294a() ? 0 + com.xiaomi.push.d.a(1, m293a()) : 0;
            if (m296b()) {
                a += com.xiaomi.push.d.a(2, m295b());
            }
            if (m297c()) {
                a += com.xiaomi.push.d.a(3, c());
            }
            if (m298d()) {
                a += com.xiaomi.push.d.a(4, d());
            }
            if (m299e()) {
                a += com.xiaomi.push.d.a(5, e());
            }
            if (m300f()) {
                a += com.xiaomi.push.d.a(6, f());
            }
            this.a = a;
            return a;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m294a()) {
                dVar.m211a(1, m293a());
            }
            if (m296b()) {
                dVar.m211a(2, m295b());
            }
            if (m297c()) {
                dVar.m211a(3, c());
            }
            if (m298d()) {
                dVar.m211a(4, d());
            }
            if (m299e()) {
                dVar.m211a(5, e());
            }
            if (m300f()) {
                dVar.m211a(6, f());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.a < 0) {
                b();
            }
            return this.a;
        }

        @Override // com.xiaomi.push.f
        public c a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a == 10) {
                    a(cVar.m148a());
                } else if (m145a == 18) {
                    b(cVar.m148a());
                } else if (m145a == 26) {
                    c(cVar.m148a());
                } else if (m145a == 34) {
                    d(cVar.m148a());
                } else if (m145a == 42) {
                    e(cVar.m148a());
                } else if (m145a != 50) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    f(cVar.m148a());
                }
            }
        }
    }

    public static final class d extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f337a;

        /* renamed from: c, reason: collision with other field name */
        private boolean f339c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9063d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9064e;

        /* renamed from: b, reason: collision with other field name */
        private boolean f338b = false;

        /* renamed from: a, reason: collision with other field name */
        private String f336a = "";
        private String b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f9062c = "";
        private int a = -1;

        /* renamed from: b, reason: collision with other method in class */
        public boolean m304b() {
            return this.f337a;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m305c() {
            return this.f339c;
        }

        public boolean d() {
            return this.f9063d;
        }

        public boolean e() {
            return this.f9064e;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m302a() {
            return this.f338b;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m303b() {
            return this.b;
        }

        public String c() {
            return this.f9062c;
        }

        public d a(boolean z) {
            this.f337a = true;
            this.f338b = z;
            return this;
        }

        public d b(String str) {
            this.f9063d = true;
            this.b = str;
            return this;
        }

        public d c(String str) {
            this.f9064e = true;
            this.f9062c = str;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m301a() {
            return this.f336a;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m304b() ? 0 + com.xiaomi.push.d.a(1, m302a()) : 0;
            if (m305c()) {
                a += com.xiaomi.push.d.a(2, m301a());
            }
            if (d()) {
                a += com.xiaomi.push.d.a(3, m303b());
            }
            if (e()) {
                a += com.xiaomi.push.d.a(4, c());
            }
            this.a = a;
            return a;
        }

        public d a(String str) {
            this.f339c = true;
            this.f336a = str;
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m304b()) {
                dVar.m212a(1, m302a());
            }
            if (m305c()) {
                dVar.m211a(2, m301a());
            }
            if (d()) {
                dVar.m211a(3, m303b());
            }
            if (e()) {
                dVar.m211a(4, c());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.a < 0) {
                b();
            }
            return this.a;
        }

        @Override // com.xiaomi.push.f
        public d a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a == 8) {
                    a(cVar.m151a());
                } else if (m145a == 18) {
                    a(cVar.m148a());
                } else if (m145a == 26) {
                    b(cVar.m148a());
                } else if (m145a != 34) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    c(cVar.m148a());
                }
            }
        }

        public static d a(byte[] bArr) {
            return (d) new d().a(bArr);
        }
    }

    public static final class e extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.b f340a;

        /* renamed from: a, reason: collision with other field name */
        private boolean f343a;

        /* renamed from: b, reason: collision with other field name */
        private com.xiaomi.push.b f344b;

        /* renamed from: b, reason: collision with other field name */
        private boolean f346b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f348c;

        /* renamed from: d, reason: collision with root package name */
        private int f9066d;

        /* renamed from: d, reason: collision with other field name */
        private boolean f350d;

        /* renamed from: e, reason: collision with root package name */
        private int f9067e;

        /* renamed from: e, reason: collision with other field name */
        private boolean f352e;

        /* renamed from: f, reason: collision with root package name */
        private int f9068f;

        /* renamed from: f, reason: collision with other field name */
        private boolean f354f;

        /* renamed from: g, reason: collision with root package name */
        private int f9069g;

        /* renamed from: g, reason: collision with other field name */
        private boolean f355g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private boolean n;
        private boolean o;
        private int a = 0;

        /* renamed from: a, reason: collision with other field name */
        private String f342a = "";

        /* renamed from: b, reason: collision with other field name */
        private String f345b = "";

        /* renamed from: c, reason: collision with other field name */
        private String f347c = "";
        private int b = 0;

        /* renamed from: d, reason: collision with other field name */
        private String f349d = "";

        /* renamed from: e, reason: collision with other field name */
        private String f351e = "";

        /* renamed from: f, reason: collision with other field name */
        private String f353f = "";

        /* renamed from: a, reason: collision with other field name */
        private b f341a = null;

        /* renamed from: c, reason: collision with root package name */
        private int f9065c = 0;

        public e() {
            com.xiaomi.push.b bVar = com.xiaomi.push.b.a;
            this.f340a = bVar;
            this.f344b = bVar;
            this.f9066d = 0;
            this.f9067e = 0;
            this.f9068f = 0;
            this.f9069g = -1;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m312b() {
            return this.f346b;
        }

        public int c() {
            return this.a;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m316d() {
            return this.f350d;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m318e() {
            return this.f352e;
        }

        /* renamed from: f, reason: collision with other method in class */
        public boolean m320f() {
            return this.f354f;
        }

        /* renamed from: g, reason: collision with other method in class */
        public boolean m321g() {
            return this.f355g;
        }

        /* renamed from: h, reason: collision with other method in class */
        public boolean m322h() {
            return this.h;
        }

        public boolean i() {
            return this.i;
        }

        public boolean j() {
            return this.j;
        }

        public boolean k() {
            return this.k;
        }

        public boolean l() {
            return this.l;
        }

        public boolean m() {
            return this.m;
        }

        public boolean n() {
            return this.n;
        }

        public boolean o() {
            return this.o;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m309a() {
            return this.f343a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public String m311b() {
            return this.f345b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m314c() {
            return this.f348c;
        }

        public int d() {
            return this.b;
        }

        /* renamed from: e, reason: collision with other method in class */
        public String m317e() {
            return this.f351e;
        }

        /* renamed from: f, reason: collision with other method in class */
        public String m319f() {
            return this.f353f;
        }

        public int g() {
            return this.f9067e;
        }

        public int h() {
            return this.f9068f;
        }

        public e a(int i) {
            this.f343a = true;
            this.a = i;
            return this;
        }

        public e b(String str) {
            this.f348c = true;
            this.f345b = str;
            return this;
        }

        /* renamed from: c, reason: collision with other method in class */
        public String m313c() {
            return this.f347c;
        }

        /* renamed from: d, reason: collision with other method in class */
        public String m315d() {
            return this.f349d;
        }

        public e e(String str) {
            this.f355g = true;
            this.f351e = str;
            return this;
        }

        public e f(String str) {
            this.h = true;
            this.f353f = str;
            return this;
        }

        public e c(String str) {
            this.f350d = true;
            this.f347c = str;
            return this;
        }

        public e d(String str) {
            this.f354f = true;
            this.f349d = str;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m308a() {
            return this.f342a;
        }

        public e b(int i) {
            this.f352e = true;
            this.b = i;
            return this;
        }

        public int e() {
            return this.f9065c;
        }

        public int f() {
            return this.f9066d;
        }

        public e a(String str) {
            this.f346b = true;
            this.f342a = str;
            return this;
        }

        public e c(int i) {
            this.j = true;
            this.f9065c = i;
            return this;
        }

        public e d(int i) {
            this.m = true;
            this.f9066d = i;
            return this;
        }

        public e e(int i) {
            this.n = true;
            this.f9067e = i;
            return this;
        }

        public e f(int i) {
            this.o = true;
            this.f9068f = i;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public com.xiaomi.push.b m310b() {
            return this.f344b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public b m307a() {
            return this.f341a;
        }

        public e b(com.xiaomi.push.b bVar) {
            this.l = true;
            this.f344b = bVar;
            return this;
        }

        public e a(b bVar) {
            Objects.requireNonNull(bVar);
            this.i = true;
            this.f341a = bVar;
            return this;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int b = m309a() ? 0 + com.xiaomi.push.d.b(1, c()) : 0;
            if (m312b()) {
                b += com.xiaomi.push.d.a(2, m308a());
            }
            if (m314c()) {
                b += com.xiaomi.push.d.a(3, m311b());
            }
            if (m316d()) {
                b += com.xiaomi.push.d.a(4, m313c());
            }
            if (m318e()) {
                b += com.xiaomi.push.d.a(5, d());
            }
            if (m320f()) {
                b += com.xiaomi.push.d.a(6, m315d());
            }
            if (m321g()) {
                b += com.xiaomi.push.d.a(7, m317e());
            }
            if (m322h()) {
                b += com.xiaomi.push.d.a(8, m319f());
            }
            if (i()) {
                b += com.xiaomi.push.d.a(9, (com.xiaomi.push.f) m307a());
            }
            if (j()) {
                b += com.xiaomi.push.d.a(10, e());
            }
            if (k()) {
                b += com.xiaomi.push.d.a(11, m306a());
            }
            if (l()) {
                b += com.xiaomi.push.d.a(12, m310b());
            }
            if (m()) {
                b += com.xiaomi.push.d.a(13, f());
            }
            if (n()) {
                b += com.xiaomi.push.d.a(14, g());
            }
            if (o()) {
                b += com.xiaomi.push.d.a(15, h());
            }
            this.f9069g = b;
            return b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.b m306a() {
            return this.f340a;
        }

        public e a(com.xiaomi.push.b bVar) {
            this.k = true;
            this.f340a = bVar;
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m309a()) {
                dVar.m220b(1, c());
            }
            if (m312b()) {
                dVar.m211a(2, m308a());
            }
            if (m314c()) {
                dVar.m211a(3, m311b());
            }
            if (m316d()) {
                dVar.m211a(4, m313c());
            }
            if (m318e()) {
                dVar.m207a(5, d());
            }
            if (m320f()) {
                dVar.m211a(6, m315d());
            }
            if (m321g()) {
                dVar.m211a(7, m317e());
            }
            if (m322h()) {
                dVar.m211a(8, m319f());
            }
            if (i()) {
                dVar.m210a(9, (com.xiaomi.push.f) m307a());
            }
            if (j()) {
                dVar.m207a(10, e());
            }
            if (k()) {
                dVar.m209a(11, m306a());
            }
            if (l()) {
                dVar.m209a(12, m310b());
            }
            if (m()) {
                dVar.m207a(13, f());
            }
            if (n()) {
                dVar.m207a(14, g());
            }
            if (o()) {
                dVar.m207a(15, h());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.f9069g < 0) {
                b();
            }
            return this.f9069g;
        }

        @Override // com.xiaomi.push.f
        public e a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                switch (m145a) {
                    case 0:
                        return this;
                    case 8:
                        a(cVar.c());
                        break;
                    case 18:
                        a(cVar.m148a());
                        break;
                    case 26:
                        b(cVar.m148a());
                        break;
                    case 34:
                        c(cVar.m148a());
                        break;
                    case 40:
                        b(cVar.m154b());
                        break;
                    case 50:
                        d(cVar.m148a());
                        break;
                    case 58:
                        e(cVar.m148a());
                        break;
                    case 66:
                        f(cVar.m148a());
                        break;
                    case 74:
                        b bVar = new b();
                        cVar.a(bVar);
                        a(bVar);
                        break;
                    case 80:
                        c(cVar.m154b());
                        break;
                    case 90:
                        a(cVar.m147a());
                        break;
                    case 98:
                        b(cVar.m147a());
                        break;
                    case 104:
                        d(cVar.m154b());
                        break;
                    case 112:
                        e(cVar.m154b());
                        break;
                    case 120:
                        f(cVar.m154b());
                        break;
                    default:
                        if (!a(cVar, m145a)) {
                            return this;
                        }
                        break;
                }
            }
        }
    }

    public static final class f extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f358a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f359b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9070c;

        /* renamed from: a, reason: collision with other field name */
        private String f357a = "";
        private String b = "";

        /* renamed from: a, reason: collision with other field name */
        private b f356a = null;
        private int a = -1;

        /* renamed from: b, reason: collision with other method in class */
        public String m326b() {
            return this.b;
        }

        public boolean c() {
            return this.f9070c;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m324a() {
            return this.f357a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m327b() {
            return this.f359b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m325a() {
            return this.f358a;
        }

        public f b(String str) {
            this.f359b = true;
            this.b = str;
            return this;
        }

        public f a(String str) {
            this.f358a = true;
            this.f357a = str;
            return this;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m325a() ? 0 + com.xiaomi.push.d.a(1, m324a()) : 0;
            if (m327b()) {
                a += com.xiaomi.push.d.a(2, m326b());
            }
            if (c()) {
                a += com.xiaomi.push.d.a(3, (com.xiaomi.push.f) m323a());
            }
            this.a = a;
            return a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public b m323a() {
            return this.f356a;
        }

        public f a(b bVar) {
            Objects.requireNonNull(bVar);
            this.f9070c = true;
            this.f356a = bVar;
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m325a()) {
                dVar.m211a(1, m324a());
            }
            if (m327b()) {
                dVar.m211a(2, m326b());
            }
            if (c()) {
                dVar.m210a(3, (com.xiaomi.push.f) m323a());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.a < 0) {
                b();
            }
            return this.a;
        }

        @Override // com.xiaomi.push.f
        public f a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a == 10) {
                    a(cVar.m148a());
                } else if (m145a == 18) {
                    b(cVar.m148a());
                } else if (m145a != 26) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    b bVar = new b();
                    cVar.a(bVar);
                    a(bVar);
                }
            }
        }

        public static f a(byte[] bArr) {
            return (f) new f().a(bArr);
        }
    }

    public static final class g extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f361a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f362b;

        /* renamed from: c, reason: collision with other field name */
        private boolean f363c;

        /* renamed from: a, reason: collision with other field name */
        private String f360a = "";
        private String b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f9071c = "";
        private int a = -1;

        /* renamed from: b, reason: collision with other method in class */
        public String m330b() {
            return this.b;
        }

        public String c() {
            return this.f9071c;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m328a() {
            return this.f360a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m331b() {
            return this.f362b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m332c() {
            return this.f363c;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m329a() {
            return this.f361a;
        }

        public g b(String str) {
            this.f362b = true;
            this.b = str;
            return this;
        }

        public g c(String str) {
            this.f363c = true;
            this.f9071c = str;
            return this;
        }

        public g a(String str) {
            this.f361a = true;
            this.f360a = str;
            return this;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m329a() ? 0 + com.xiaomi.push.d.a(1, m328a()) : 0;
            if (m331b()) {
                a += com.xiaomi.push.d.a(2, m330b());
            }
            if (m332c()) {
                a += com.xiaomi.push.d.a(3, c());
            }
            this.a = a;
            return a;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m329a()) {
                dVar.m211a(1, m328a());
            }
            if (m331b()) {
                dVar.m211a(2, m330b());
            }
            if (m332c()) {
                dVar.m211a(3, c());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.a < 0) {
                b();
            }
            return this.a;
        }

        @Override // com.xiaomi.push.f
        public g a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a == 10) {
                    a(cVar.m148a());
                } else if (m145a == 18) {
                    b(cVar.m148a());
                } else if (m145a != 26) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    c(cVar.m148a());
                }
            }
        }

        public static g a(byte[] bArr) {
            return (g) new g().a(bArr);
        }
    }

    public static final class h extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f365a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f366b;
        private int a = 0;

        /* renamed from: a, reason: collision with other field name */
        private String f364a = "";
        private int b = -1;

        /* renamed from: b, reason: collision with other method in class */
        public boolean m335b() {
            return this.f366b;
        }

        public int c() {
            return this.a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m334a() {
            return this.f365a;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m334a() ? 0 + com.xiaomi.push.d.a(1, c()) : 0;
            if (m335b()) {
                a += com.xiaomi.push.d.a(2, m333a());
            }
            this.b = a;
            return a;
        }

        public h a(int i) {
            this.f365a = true;
            this.a = i;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m333a() {
            return this.f364a;
        }

        public h a(String str) {
            this.f366b = true;
            this.f364a = str;
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m334a()) {
                dVar.m207a(1, c());
            }
            if (m335b()) {
                dVar.m211a(2, m333a());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.b < 0) {
                b();
            }
            return this.b;
        }

        @Override // com.xiaomi.push.f
        public h a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a == 8) {
                    a(cVar.m154b());
                } else if (m145a != 18) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    a(cVar.m148a());
                }
            }
        }

        public static h a(byte[] bArr) {
            return (h) new h().a(bArr);
        }
    }

    public static final class i extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f368a;

        /* renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.b f367a = com.xiaomi.push.b.a;
        private int a = -1;

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m337a() ? 0 + com.xiaomi.push.d.a(1, m336a()) : 0;
            this.a = a;
            return a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.b m336a() {
            return this.f367a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m337a() {
            return this.f368a;
        }

        public i a(com.xiaomi.push.b bVar) {
            this.f368a = true;
            this.f367a = bVar;
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m337a()) {
                dVar.m209a(1, m336a());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.a < 0) {
                b();
            }
            return this.a;
        }

        @Override // com.xiaomi.push.f
        public i a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a != 10) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    a(cVar.m147a());
                }
            }
        }

        public static i a(byte[] bArr) {
            return (i) new i().a(bArr);
        }
    }

    public static final class j extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f371a;
        private boolean b;

        /* renamed from: a, reason: collision with other field name */
        private com.xiaomi.push.b f369a = com.xiaomi.push.b.a;

        /* renamed from: a, reason: collision with other field name */
        private b f370a = null;
        private int a = -1;

        /* renamed from: b, reason: collision with other method in class */
        public boolean m341b() {
            return this.b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public com.xiaomi.push.b m338a() {
            return this.f369a;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m340a() ? 0 + com.xiaomi.push.d.a(1, m338a()) : 0;
            if (m341b()) {
                a += com.xiaomi.push.d.a(2, (com.xiaomi.push.f) m339a());
            }
            this.a = a;
            return a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m340a() {
            return this.f371a;
        }

        public j a(com.xiaomi.push.b bVar) {
            this.f371a = true;
            this.f369a = bVar;
            return this;
        }

        /* renamed from: a, reason: collision with other method in class */
        public b m339a() {
            return this.f370a;
        }

        public j a(b bVar) {
            Objects.requireNonNull(bVar);
            this.b = true;
            this.f370a = bVar;
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m340a()) {
                dVar.m209a(1, m338a());
            }
            if (m341b()) {
                dVar.m210a(2, (com.xiaomi.push.f) m339a());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.a < 0) {
                b();
            }
            return this.a;
        }

        @Override // com.xiaomi.push.f
        public j a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a == 10) {
                    a(cVar.m147a());
                } else if (m145a != 18) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    b bVar = new b();
                    cVar.a(bVar);
                    a(bVar);
                }
            }
        }

        public static j a(byte[] bArr) {
            return (j) new j().a(bArr);
        }
    }

    public static final class k extends com.xiaomi.push.f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f374a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f377b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9072c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9073d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9074e;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9076g;

        /* renamed from: a, reason: collision with other field name */
        private String f373a = "";

        /* renamed from: b, reason: collision with other field name */
        private String f376b = "";

        /* renamed from: a, reason: collision with other field name */
        private long f372a = 0;

        /* renamed from: b, reason: collision with other field name */
        private long f375b = 0;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9075f = false;
        private int a = 0;
        private int b = -1;

        /* renamed from: b, reason: collision with other method in class */
        public String m346b() {
            return this.f376b;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m348c() {
            return this.f9072c;
        }

        public boolean d() {
            return this.f9073d;
        }

        public boolean e() {
            return this.f9075f;
        }

        public boolean f() {
            return this.f9074e;
        }

        public boolean g() {
            return this.f9076g;
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m343a() {
            return this.f373a;
        }

        /* renamed from: b, reason: collision with other method in class */
        public boolean m347b() {
            return this.f377b;
        }

        public int c() {
            return this.a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m344a() {
            return this.f374a;
        }

        public k b(String str) {
            this.f377b = true;
            this.f376b = str;
            return this;
        }

        public k a(String str) {
            this.f374a = true;
            this.f373a = str;
            return this;
        }

        /* renamed from: b, reason: collision with other method in class */
        public long m345b() {
            return this.f375b;
        }

        /* renamed from: a, reason: collision with other method in class */
        public long m342a() {
            return this.f372a;
        }

        public k b(long j) {
            this.f9073d = true;
            this.f375b = j;
            return this;
        }

        public k a(long j) {
            this.f9072c = true;
            this.f372a = j;
            return this;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int a = m344a() ? 0 + com.xiaomi.push.d.a(1, m343a()) : 0;
            if (m347b()) {
                a += com.xiaomi.push.d.a(2, m346b());
            }
            if (m348c()) {
                a += com.xiaomi.push.d.a(3, m342a());
            }
            if (d()) {
                a += com.xiaomi.push.d.a(4, m345b());
            }
            if (f()) {
                a += com.xiaomi.push.d.a(5, e());
            }
            if (g()) {
                a += com.xiaomi.push.d.a(6, c());
            }
            this.b = a;
            return a;
        }

        public k a(boolean z) {
            this.f9074e = true;
            this.f9075f = z;
            return this;
        }

        public k a(int i) {
            this.f9076g = true;
            this.a = i;
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(com.xiaomi.push.d dVar) {
            if (m344a()) {
                dVar.m211a(1, m343a());
            }
            if (m347b()) {
                dVar.m211a(2, m346b());
            }
            if (m348c()) {
                dVar.m208a(3, m342a());
            }
            if (d()) {
                dVar.m208a(4, m345b());
            }
            if (f()) {
                dVar.m212a(5, e());
            }
            if (g()) {
                dVar.m207a(6, c());
            }
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.b < 0) {
                b();
            }
            return this.b;
        }

        @Override // com.xiaomi.push.f
        public k a(com.xiaomi.push.c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a == 10) {
                    a(cVar.m148a());
                } else if (m145a == 18) {
                    b(cVar.m148a());
                } else if (m145a == 24) {
                    a(cVar.m146a());
                } else if (m145a == 32) {
                    b(cVar.m146a());
                } else if (m145a == 40) {
                    a(cVar.m151a());
                } else if (m145a != 48) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    a(cVar.m154b());
                }
            }
        }

        public static k a(byte[] bArr) {
            return (k) new k().a(bArr);
        }
    }
}
