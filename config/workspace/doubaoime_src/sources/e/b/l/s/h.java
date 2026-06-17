package e.b.l.s;

import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface h<T> {
    public static final h<Boolean> a = new b();
    public static final h<Byte> b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final h<Short> f9659c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final h<Integer> f9660d = new e();

    /* renamed from: e, reason: collision with root package name */
    public static final h<Long> f9661e = new f();

    /* renamed from: f, reason: collision with root package name */
    public static final h<Double> f9662f = new g();

    /* renamed from: g, reason: collision with root package name */
    public static final h<Float> f9663g = new C0443h();
    public static final h<String> h = new i();
    public static final h<ByteBuffer> i = new j();
    public static final h<byte[]> j = new a();

    static class a implements h<byte[]> {
        a() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 11;
        }

        @Override // e.b.l.s.h
        public void b(byte[] bArr, g.a.c.c.e eVar) throws g.a.c.b {
            eVar.m(ByteBuffer.wrap(bArr));
        }

        @Override // e.b.l.s.h
        public byte[] c(g.a.c.c.e eVar) throws g.a.c.b {
            return eVar.a().array();
        }
    }

    static class b implements h<Boolean> {
        b() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 2;
        }

        @Override // e.b.l.s.h
        public void b(Boolean bool, g.a.c.c.e eVar) throws g.a.c.b {
            ((g.a.c.c.a) eVar).n(bool.booleanValue() ? (byte) 1 : (byte) 0);
        }

        @Override // e.b.l.s.h
        public Boolean c(g.a.c.c.e eVar) throws g.a.c.b {
            return Boolean.valueOf(((g.a.c.c.a) eVar).b() == 1);
        }
    }

    static class c implements h<Byte> {
        c() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 3;
        }

        @Override // e.b.l.s.h
        public void b(Byte b, g.a.c.c.e eVar) throws g.a.c.b {
            eVar.n(b.byteValue());
        }

        @Override // e.b.l.s.h
        public Byte c(g.a.c.c.e eVar) throws g.a.c.b {
            return Byte.valueOf(eVar.b());
        }
    }

    static class d implements h<Short> {
        d() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 6;
        }

        @Override // e.b.l.s.h
        public void b(Short sh, g.a.c.c.e eVar) throws g.a.c.b {
            eVar.o(sh.shortValue());
        }

        @Override // e.b.l.s.h
        public Short c(g.a.c.c.e eVar) throws g.a.c.b {
            return Short.valueOf(eVar.e());
        }
    }

    static class e implements h<Integer> {
        e() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 8;
        }

        @Override // e.b.l.s.h
        public void b(Integer num, g.a.c.c.e eVar) throws g.a.c.b {
            eVar.p(num.intValue());
        }

        @Override // e.b.l.s.h
        public Integer c(g.a.c.c.e eVar) throws g.a.c.b {
            return Integer.valueOf(eVar.f());
        }
    }

    static class f implements h<Long> {
        f() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 10;
        }

        @Override // e.b.l.s.h
        public void b(Long l, g.a.c.c.e eVar) throws g.a.c.b {
            eVar.q(l.longValue());
        }

        @Override // e.b.l.s.h
        public Long c(g.a.c.c.e eVar) throws g.a.c.b {
            return Long.valueOf(eVar.g());
        }
    }

    static class g implements h<Double> {
        g() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 4;
        }

        @Override // e.b.l.s.h
        public void b(Double d2, g.a.c.c.e eVar) throws g.a.c.b {
            double doubleValue = d2.doubleValue();
            g.a.c.c.a aVar = (g.a.c.c.a) eVar;
            Objects.requireNonNull(aVar);
            aVar.q(Double.doubleToLongBits(doubleValue));
        }

        @Override // e.b.l.s.h
        public Double c(g.a.c.c.e eVar) throws g.a.c.b {
            return Double.valueOf(eVar.c());
        }
    }

    /* renamed from: e.b.l.s.h$h, reason: collision with other inner class name */
    static class C0443h implements h<Float> {
        C0443h() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 4;
        }

        @Override // e.b.l.s.h
        public void b(Float f2, g.a.c.c.e eVar) throws g.a.c.b {
            double floatValue = f2.floatValue();
            g.a.c.c.a aVar = (g.a.c.c.a) eVar;
            Objects.requireNonNull(aVar);
            aVar.q(Double.doubleToLongBits(floatValue));
        }

        @Override // e.b.l.s.h
        public Float c(g.a.c.c.e eVar) throws g.a.c.b {
            return Float.valueOf((float) eVar.c());
        }
    }

    static class i implements h<String> {
        i() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 11;
        }

        @Override // e.b.l.s.h
        public void b(String str, g.a.c.c.e eVar) throws g.a.c.b {
            eVar.r(str);
        }

        @Override // e.b.l.s.h
        public String c(g.a.c.c.e eVar) throws g.a.c.b {
            return eVar.k();
        }
    }

    static class j implements h<ByteBuffer> {
        j() {
        }

        @Override // e.b.l.s.h
        public byte a() {
            return (byte) 11;
        }

        @Override // e.b.l.s.h
        public void b(ByteBuffer byteBuffer, g.a.c.c.e eVar) throws g.a.c.b {
            eVar.m(byteBuffer);
        }

        @Override // e.b.l.s.h
        public ByteBuffer c(g.a.c.c.e eVar) throws g.a.c.b {
            return eVar.a();
        }
    }

    byte a();

    void b(T t, g.a.c.c.e eVar) throws g.a.c.b;

    T c(g.a.c.c.e eVar) throws g.a.c.b;
}
