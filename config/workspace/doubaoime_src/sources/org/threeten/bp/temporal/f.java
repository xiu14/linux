package org.threeten.bp.temporal;

import org.threeten.bp.l;

/* loaded from: classes2.dex */
public final class f {
    static final org.threeten.bp.temporal.g<org.threeten.bp.k> a = new a();
    static final org.threeten.bp.temporal.g<org.threeten.bp.chrono.h> b = new b();

    /* renamed from: c, reason: collision with root package name */
    static final org.threeten.bp.temporal.g<h> f10859c = new c();

    /* renamed from: d, reason: collision with root package name */
    static final org.threeten.bp.temporal.g<org.threeten.bp.k> f10860d = new d();

    /* renamed from: e, reason: collision with root package name */
    static final org.threeten.bp.temporal.g<l> f10861e = new e();

    /* renamed from: f, reason: collision with root package name */
    static final org.threeten.bp.temporal.g<org.threeten.bp.e> f10862f = new C0490f();

    /* renamed from: g, reason: collision with root package name */
    static final org.threeten.bp.temporal.g<org.threeten.bp.g> f10863g = new g();

    static class a implements org.threeten.bp.temporal.g<org.threeten.bp.k> {
        a() {
        }

        @Override // org.threeten.bp.temporal.g
        public org.threeten.bp.k a(org.threeten.bp.temporal.b bVar) {
            return (org.threeten.bp.k) bVar.query(this);
        }
    }

    static class b implements org.threeten.bp.temporal.g<org.threeten.bp.chrono.h> {
        b() {
        }

        @Override // org.threeten.bp.temporal.g
        public org.threeten.bp.chrono.h a(org.threeten.bp.temporal.b bVar) {
            return (org.threeten.bp.chrono.h) bVar.query(this);
        }
    }

    static class c implements org.threeten.bp.temporal.g<h> {
        c() {
        }

        @Override // org.threeten.bp.temporal.g
        public h a(org.threeten.bp.temporal.b bVar) {
            return (h) bVar.query(this);
        }
    }

    static class d implements org.threeten.bp.temporal.g<org.threeten.bp.k> {
        d() {
        }

        @Override // org.threeten.bp.temporal.g
        public org.threeten.bp.k a(org.threeten.bp.temporal.b bVar) {
            org.threeten.bp.k kVar = (org.threeten.bp.k) bVar.query(f.a);
            return kVar != null ? kVar : (org.threeten.bp.k) bVar.query(f.f10861e);
        }
    }

    static class e implements org.threeten.bp.temporal.g<l> {
        e() {
        }

        @Override // org.threeten.bp.temporal.g
        public l a(org.threeten.bp.temporal.b bVar) {
            ChronoField chronoField = ChronoField.OFFSET_SECONDS;
            if (bVar.isSupported(chronoField)) {
                return l.n(bVar.get(chronoField));
            }
            return null;
        }
    }

    /* renamed from: org.threeten.bp.temporal.f$f, reason: collision with other inner class name */
    static class C0490f implements org.threeten.bp.temporal.g<org.threeten.bp.e> {
        C0490f() {
        }

        @Override // org.threeten.bp.temporal.g
        public org.threeten.bp.e a(org.threeten.bp.temporal.b bVar) {
            ChronoField chronoField = ChronoField.EPOCH_DAY;
            if (bVar.isSupported(chronoField)) {
                return org.threeten.bp.e.J(bVar.getLong(chronoField));
            }
            return null;
        }
    }

    static class g implements org.threeten.bp.temporal.g<org.threeten.bp.g> {
        g() {
        }

        @Override // org.threeten.bp.temporal.g
        public org.threeten.bp.g a(org.threeten.bp.temporal.b bVar) {
            ChronoField chronoField = ChronoField.NANO_OF_DAY;
            if (bVar.isSupported(chronoField)) {
                return org.threeten.bp.g.m(bVar.getLong(chronoField));
            }
            return null;
        }
    }

    public static final org.threeten.bp.temporal.g<org.threeten.bp.chrono.h> a() {
        return b;
    }

    public static final org.threeten.bp.temporal.g<org.threeten.bp.e> b() {
        return f10862f;
    }

    public static final org.threeten.bp.temporal.g<org.threeten.bp.g> c() {
        return f10863g;
    }

    public static final org.threeten.bp.temporal.g<l> d() {
        return f10861e;
    }

    public static final org.threeten.bp.temporal.g<h> e() {
        return f10859c;
    }

    public static final org.threeten.bp.temporal.g<org.threeten.bp.k> f() {
        return f10860d;
    }

    public static final org.threeten.bp.temporal.g<org.threeten.bp.k> g() {
        return a;
    }
}
