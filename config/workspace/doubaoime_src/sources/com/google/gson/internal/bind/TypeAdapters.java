package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.internal.u;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes2.dex */
public final class TypeAdapters {
    public static final TypeAdapter<BigInteger> A;
    public static final TypeAdapter<u> B;
    public static final t C;
    public static final TypeAdapter<StringBuilder> D;
    public static final t E;
    public static final TypeAdapter<StringBuffer> F;
    public static final t G;
    public static final TypeAdapter<URL> H;
    public static final t I;

    /* renamed from: J, reason: collision with root package name */
    public static final TypeAdapter<URI> f6811J;
    public static final t K;
    public static final TypeAdapter<InetAddress> L;
    public static final t M;
    public static final TypeAdapter<UUID> N;
    public static final t O;
    public static final TypeAdapter<Currency> P;
    public static final t Q;
    public static final TypeAdapter<Calendar> R;
    public static final t S;
    public static final TypeAdapter<Locale> T;
    public static final t U;
    public static final TypeAdapter<i> V;
    public static final t W;
    public static final t X;
    public static final TypeAdapter<Class> a;
    public static final t b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAdapter<BitSet> f6812c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f6813d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f6814e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f6815f;

    /* renamed from: g, reason: collision with root package name */
    public static final t f6816g;
    public static final TypeAdapter<Number> h;
    public static final t i;
    public static final TypeAdapter<Number> j;
    public static final t k;
    public static final TypeAdapter<Number> l;
    public static final t m;
    public static final TypeAdapter<AtomicInteger> n;
    public static final t o;
    public static final TypeAdapter<AtomicBoolean> p;
    public static final t q;
    public static final TypeAdapter<AtomicIntegerArray> r;
    public static final t s;
    public static final TypeAdapter<Number> t;
    public static final TypeAdapter<Number> u;
    public static final TypeAdapter<Number> v;
    public static final TypeAdapter<Character> w;
    public static final t x;
    public static final TypeAdapter<String> y;
    public static final TypeAdapter<BigDecimal> z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    class AnonymousClass31 implements t {
        final /* synthetic */ Class a;
        final /* synthetic */ TypeAdapter b;

        AnonymousClass31(Class cls, TypeAdapter typeAdapter) {
            this.a = cls;
            this.b = typeAdapter;
        }

        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            if (aVar.d() == this.a) {
                return this.b;
            }
            return null;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Factory[type=");
            M.append(this.a.getName());
            M.append(",adapter=");
            M.append(this.b);
            M.append("]");
            return M.toString();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    class AnonymousClass32 implements t {
        final /* synthetic */ Class a;
        final /* synthetic */ Class b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f6817c;

        AnonymousClass32(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.a = cls;
            this.b = cls2;
            this.f6817c = typeAdapter;
        }

        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            Class<? super T> d2 = aVar.d();
            if (d2 == this.a || d2 == this.b) {
                return this.f6817c;
            }
            return null;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Factory[type=");
            M.append(this.b.getName());
            M.append("+");
            M.append(this.a.getName());
            M.append(",adapter=");
            M.append(this.f6817c);
            M.append("]");
            return M.toString();
        }
    }

    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<String, T> b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map<T, String> f6819c = new HashMap();

        class a implements PrivilegedAction<Field[]> {
            final /* synthetic */ Class a;

            a(EnumTypeAdapter enumTypeAdapter, Class cls) {
                this.a = cls;
            }

            @Override // java.security.PrivilegedAction
            public Field[] run() {
                Field[] declaredFields = this.a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(this, cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String name = r4.name();
                    String str = r4.toString();
                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (String str2 : serializedName.alternate()) {
                            this.a.put(str2, r4);
                        }
                    }
                    this.a.put(name, r4);
                    this.b.put(str, r4);
                    this.f6819c.put(r4, name);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public Object b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.c0() == JsonToken.NULL) {
                aVar.S();
                return null;
            }
            String Y = aVar.Y();
            T t = this.a.get(Y);
            return t == null ? this.b.get(Y) : t;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            bVar.e0(r3 == null ? null : this.f6819c.get(r3));
        }
    }

    static {
        TypeAdapter<Class> a2 = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Class b(com.google.gson.stream.a aVar) throws IOException {
                return d();
            }

            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void c(com.google.gson.stream.b bVar, Class cls) throws IOException {
                e(cls);
            }

            public Class d() throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            public void e(Class cls) throws IOException {
                StringBuilder M2 = e.a.a.a.a.M("Attempted to serialize java.lang.Class: ");
                M2.append(cls.getName());
                M2.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(M2.toString());
            }
        }.a();
        a = a2;
        b = new AnonymousClass31(Class.class, a2);
        TypeAdapter<BitSet> a3 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            public BitSet b(com.google.gson.stream.a aVar) throws IOException {
                BitSet bitSet = new BitSet();
                aVar.a();
                JsonToken c0 = aVar.c0();
                int i2 = 0;
                while (c0 != JsonToken.END_ARRAY) {
                    int ordinal = c0.ordinal();
                    boolean z2 = true;
                    if (ordinal == 5 || ordinal == 6) {
                        int M2 = aVar.M();
                        if (M2 == 0) {
                            z2 = false;
                        } else if (M2 != 1) {
                            throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.N("Invalid bitset value ", M2, ", expected 0 or 1; at path ")));
                        }
                    } else {
                        if (ordinal != 7) {
                            throw new r("Invalid bitset value type: " + c0 + "; at path " + aVar.s());
                        }
                        z2 = aVar.H();
                    }
                    if (z2) {
                        bitSet.set(i2);
                    }
                    i2++;
                    c0 = aVar.c0();
                }
                aVar.o();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, BitSet bitSet) throws IOException {
                BitSet bitSet2 = bitSet;
                bVar.d();
                int length = bitSet2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    bVar.Y(bitSet2.get(i2) ? 1L : 0L);
                }
                bVar.o();
            }
        }.a();
        f6812c = a3;
        f6813d = new AnonymousClass31(BitSet.class, a3);
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public Boolean b(com.google.gson.stream.a aVar) throws IOException {
                JsonToken c0 = aVar.c0();
                if (c0 != JsonToken.NULL) {
                    return c0 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.Y())) : Boolean.valueOf(aVar.H());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Boolean bool) throws IOException {
                bVar.a0(bool);
            }
        };
        f6814e = typeAdapter;
        f6815f = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public Boolean b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() != JsonToken.NULL) {
                    return Boolean.valueOf(aVar.Y());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                bVar.e0(bool2 == null ? "null" : bool2.toString());
            }
        };
        f6816g = new AnonymousClass32(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public Number b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    int M2 = aVar.M();
                    if (M2 > 255 || M2 < -128) {
                        throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.N("Lossy conversion from ", M2, " to byte; at path ")));
                    }
                    return Byte.valueOf((byte) M2);
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
                if (number == null) {
                    bVar.D();
                } else {
                    bVar.Y(r4.byteValue());
                }
            }
        };
        h = typeAdapter2;
        i = new AnonymousClass32(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public Number b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    int M2 = aVar.M();
                    if (M2 > 65535 || M2 < -32768) {
                        throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.N("Lossy conversion from ", M2, " to short; at path ")));
                    }
                    return Short.valueOf((short) M2);
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
                if (number == null) {
                    bVar.D();
                } else {
                    bVar.Y(r4.shortValue());
                }
            }
        };
        j = typeAdapter3;
        k = new AnonymousClass32(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public Number b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.M());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
                if (number == null) {
                    bVar.D();
                } else {
                    bVar.Y(r4.intValue());
                }
            }
        };
        l = typeAdapter4;
        m = new AnonymousClass32(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter<AtomicInteger> a4 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public AtomicInteger b(com.google.gson.stream.a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.M());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, AtomicInteger atomicInteger) throws IOException {
                bVar.Y(atomicInteger.get());
            }
        }.a();
        n = a4;
        o = new AnonymousClass31(AtomicInteger.class, a4);
        TypeAdapter<AtomicBoolean> a5 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public AtomicBoolean b(com.google.gson.stream.a aVar) throws IOException {
                return new AtomicBoolean(aVar.H());
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, AtomicBoolean atomicBoolean) throws IOException {
                bVar.f0(atomicBoolean.get());
            }
        }.a();
        p = a5;
        q = new AnonymousClass31(AtomicBoolean.class, a5);
        TypeAdapter<AtomicIntegerArray> a6 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public AtomicIntegerArray b(com.google.gson.stream.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.z()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.M()));
                    } catch (NumberFormatException e2) {
                        throw new r(e2);
                    }
                }
                aVar.o();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                bVar.d();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    bVar.Y(r6.get(i2));
                }
                bVar.o();
            }
        }.a();
        r = a6;
        s = new AnonymousClass31(AtomicIntegerArray.class, a6);
        t = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public Number b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.N());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    bVar.D();
                } else {
                    bVar.Y(number2.longValue());
                }
            }
        };
        u = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public Number b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() != JsonToken.NULL) {
                    return Float.valueOf((float) aVar.I());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    bVar.D();
                    return;
                }
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(number2.floatValue());
                }
                bVar.c0(number2);
            }
        };
        v = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public Number b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() != JsonToken.NULL) {
                    return Double.valueOf(aVar.I());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    bVar.D();
                } else {
                    bVar.U(number2.doubleValue());
                }
            }
        };
        TypeAdapter<Character> typeAdapter5 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public Character b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                String Y = aVar.Y();
                if (Y.length() == 1) {
                    return Character.valueOf(Y.charAt(0));
                }
                throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Expecting character, got: ", Y, "; at ")));
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Character ch) throws IOException {
                Character ch2 = ch;
                bVar.e0(ch2 == null ? null : String.valueOf(ch2));
            }
        };
        w = typeAdapter5;
        x = new AnonymousClass32(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter<String> typeAdapter6 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public String b(com.google.gson.stream.a aVar) throws IOException {
                JsonToken c0 = aVar.c0();
                if (c0 != JsonToken.NULL) {
                    return c0 == JsonToken.BOOLEAN ? Boolean.toString(aVar.H()) : aVar.Y();
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, String str) throws IOException {
                bVar.e0(str);
            }
        };
        y = typeAdapter6;
        z = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public BigDecimal b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                String Y = aVar.Y();
                try {
                    return new BigDecimal(Y);
                } catch (NumberFormatException e2) {
                    throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Failed parsing '", Y, "' as BigDecimal; at path ")), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, BigDecimal bigDecimal) throws IOException {
                bVar.c0(bigDecimal);
            }
        };
        A = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public BigInteger b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                String Y = aVar.Y();
                try {
                    return new BigInteger(Y);
                } catch (NumberFormatException e2) {
                    throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Failed parsing '", Y, "' as BigInteger; at path ")), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, BigInteger bigInteger) throws IOException {
                bVar.c0(bigInteger);
            }
        };
        B = new TypeAdapter<u>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public u b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() != JsonToken.NULL) {
                    return new u(aVar.Y());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, u uVar) throws IOException {
                bVar.c0(uVar);
            }
        };
        C = new AnonymousClass31(String.class, typeAdapter6);
        TypeAdapter<StringBuilder> typeAdapter7 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public StringBuilder b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() != JsonToken.NULL) {
                    return new StringBuilder(aVar.Y());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, StringBuilder sb) throws IOException {
                StringBuilder sb2 = sb;
                bVar.e0(sb2 == null ? null : sb2.toString());
            }
        };
        D = typeAdapter7;
        E = new AnonymousClass31(StringBuilder.class, typeAdapter7);
        TypeAdapter<StringBuffer> typeAdapter8 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public StringBuffer b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() != JsonToken.NULL) {
                    return new StringBuffer(aVar.Y());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                bVar.e0(stringBuffer2 == null ? null : stringBuffer2.toString());
            }
        };
        F = typeAdapter8;
        G = new AnonymousClass31(StringBuffer.class, typeAdapter8);
        TypeAdapter<URL> typeAdapter9 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public URL b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                String Y = aVar.Y();
                if ("null".equals(Y)) {
                    return null;
                }
                return new URL(Y);
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, URL url) throws IOException {
                URL url2 = url;
                bVar.e0(url2 == null ? null : url2.toExternalForm());
            }
        };
        H = typeAdapter9;
        I = new AnonymousClass31(URL.class, typeAdapter9);
        TypeAdapter<URI> typeAdapter10 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public URI b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    String Y = aVar.Y();
                    if ("null".equals(Y)) {
                        return null;
                    }
                    return new URI(Y);
                } catch (URISyntaxException e2) {
                    throw new j(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, URI uri) throws IOException {
                URI uri2 = uri;
                bVar.e0(uri2 == null ? null : uri2.toASCIIString());
            }
        };
        f6811J = typeAdapter10;
        K = new AnonymousClass31(URI.class, typeAdapter10);
        final TypeAdapter<InetAddress> typeAdapter11 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public InetAddress b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() != JsonToken.NULL) {
                    return InetAddress.getByName(aVar.Y());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                bVar.e0(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }
        };
        L = typeAdapter11;
        final Class<InetAddress> cls = InetAddress.class;
        M = new t() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.t
            public <T2> TypeAdapter<T2> a(Gson gson, com.google.gson.u.a<T2> aVar) {
                final Class<? super T2> d2 = aVar.d();
                if (cls.isAssignableFrom(d2)) {
                    return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public T1 b(com.google.gson.stream.a aVar2) throws IOException {
                            T1 t1 = (T1) typeAdapter11.b(aVar2);
                            if (t1 == null || d2.isInstance(t1)) {
                                return t1;
                            }
                            StringBuilder M2 = e.a.a.a.a.M("Expected a ");
                            M2.append(d2.getName());
                            M2.append(" but was ");
                            M2.append(t1.getClass().getName());
                            M2.append("; at path ");
                            throw new r(e.a.a.a.a.g(aVar2, M2));
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void c(com.google.gson.stream.b bVar, T1 t1) throws IOException {
                            typeAdapter11.c(bVar, t1);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                StringBuilder M2 = e.a.a.a.a.M("Factory[typeHierarchy=");
                M2.append(cls.getName());
                M2.append(",adapter=");
                M2.append(typeAdapter11);
                M2.append("]");
                return M2.toString();
            }
        };
        TypeAdapter<UUID> typeAdapter12 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public UUID b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                String Y = aVar.Y();
                try {
                    return UUID.fromString(Y);
                } catch (IllegalArgumentException e2) {
                    throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Failed parsing '", Y, "' as UUID; at path ")), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                bVar.e0(uuid2 == null ? null : uuid2.toString());
            }
        };
        N = typeAdapter12;
        O = new AnonymousClass31(UUID.class, typeAdapter12);
        TypeAdapter<Currency> a7 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public Currency b(com.google.gson.stream.a aVar) throws IOException {
                String Y = aVar.Y();
                try {
                    return Currency.getInstance(Y);
                } catch (IllegalArgumentException e2) {
                    throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Failed parsing '", Y, "' as Currency; at path ")), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Currency currency) throws IOException {
                bVar.e0(currency.getCurrencyCode());
            }
        }.a();
        P = a7;
        Q = new AnonymousClass31(Currency.class, a7);
        final TypeAdapter<Calendar> typeAdapter13 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            public Calendar b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                aVar.d();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (aVar.c0() != JsonToken.END_OBJECT) {
                    String P2 = aVar.P();
                    int M2 = aVar.M();
                    if ("year".equals(P2)) {
                        i2 = M2;
                    } else if ("month".equals(P2)) {
                        i3 = M2;
                    } else if ("dayOfMonth".equals(P2)) {
                        i4 = M2;
                    } else if ("hourOfDay".equals(P2)) {
                        i5 = M2;
                    } else if ("minute".equals(P2)) {
                        i6 = M2;
                    } else if ("second".equals(P2)) {
                        i7 = M2;
                    }
                }
                aVar.p();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    bVar.D();
                    return;
                }
                bVar.h();
                bVar.z("year");
                bVar.Y(r4.get(1));
                bVar.z("month");
                bVar.Y(r4.get(2));
                bVar.z("dayOfMonth");
                bVar.Y(r4.get(5));
                bVar.z("hourOfDay");
                bVar.Y(r4.get(11));
                bVar.z("minute");
                bVar.Y(r4.get(12));
                bVar.z("second");
                bVar.Y(r4.get(13));
                bVar.p();
            }
        };
        R = typeAdapter13;
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        S = new t() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.t
            public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
                Class<? super T> d2 = aVar.d();
                if (d2 == cls2 || d2 == cls3) {
                    return typeAdapter13;
                }
                return null;
            }

            public String toString() {
                StringBuilder M2 = e.a.a.a.a.M("Factory[type=");
                M2.append(cls2.getName());
                M2.append("+");
                M2.append(cls3.getName());
                M2.append(",adapter=");
                M2.append(typeAdapter13);
                M2.append("]");
                return M2.toString();
            }
        };
        TypeAdapter<Locale> typeAdapter14 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public Locale b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar.c0() == JsonToken.NULL) {
                    aVar.S();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.Y(), BundleUtil.UNDERLINE_TAG);
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public void c(com.google.gson.stream.b bVar, Locale locale) throws IOException {
                Locale locale2 = locale;
                bVar.e0(locale2 == null ? null : locale2.toString());
            }
        };
        T = typeAdapter14;
        U = new AnonymousClass31(Locale.class, typeAdapter14);
        final TypeAdapter<i> typeAdapter15 = new TypeAdapter<i>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            private i d(com.google.gson.stream.a aVar, JsonToken jsonToken) throws IOException {
                int ordinal = jsonToken.ordinal();
                if (ordinal == 5) {
                    return new o(aVar.Y());
                }
                if (ordinal == 6) {
                    return new o(new u(aVar.Y()));
                }
                if (ordinal == 7) {
                    return new o(Boolean.valueOf(aVar.H()));
                }
                if (ordinal == 8) {
                    aVar.S();
                    return k.a;
                }
                throw new IllegalStateException("Unexpected token: " + jsonToken);
            }

            private i e(com.google.gson.stream.a aVar, JsonToken jsonToken) throws IOException {
                int ordinal = jsonToken.ordinal();
                if (ordinal == 0) {
                    aVar.a();
                    return new f();
                }
                if (ordinal != 2) {
                    return null;
                }
                aVar.d();
                return new l();
            }

            @Override // com.google.gson.TypeAdapter
            public i b(com.google.gson.stream.a aVar) throws IOException {
                if (aVar instanceof a) {
                    return ((a) aVar).s0();
                }
                JsonToken c0 = aVar.c0();
                i e2 = e(aVar, c0);
                if (e2 == null) {
                    return d(aVar, c0);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.z()) {
                        String P2 = e2 instanceof l ? aVar.P() : null;
                        JsonToken c02 = aVar.c0();
                        i e3 = e(aVar, c02);
                        boolean z2 = e3 != null;
                        if (e3 == null) {
                            e3 = d(aVar, c02);
                        }
                        if (e2 instanceof f) {
                            ((f) e2).d(e3);
                        } else {
                            ((l) e2).d(P2, e3);
                        }
                        if (z2) {
                            arrayDeque.addLast(e2);
                            e2 = e3;
                        }
                    } else {
                        if (e2 instanceof f) {
                            aVar.o();
                        } else {
                            aVar.p();
                        }
                        if (arrayDeque.isEmpty()) {
                            return e2;
                        }
                        e2 = (i) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void c(com.google.gson.stream.b bVar, i iVar) throws IOException {
                if (iVar == null || (iVar instanceof k)) {
                    bVar.D();
                    return;
                }
                if (iVar instanceof o) {
                    o b2 = iVar.b();
                    if (b2.k()) {
                        bVar.c0(b2.h());
                        return;
                    } else if (b2.i()) {
                        bVar.f0(b2.d());
                        return;
                    } else {
                        bVar.e0(b2.c());
                        return;
                    }
                }
                if (iVar instanceof f) {
                    bVar.d();
                    Iterator<i> it2 = iVar.a().iterator();
                    while (it2.hasNext()) {
                        c(bVar, it2.next());
                    }
                    bVar.o();
                    return;
                }
                boolean z2 = iVar instanceof l;
                if (!z2) {
                    StringBuilder M2 = e.a.a.a.a.M("Couldn't write ");
                    M2.append(iVar.getClass());
                    throw new IllegalArgumentException(M2.toString());
                }
                bVar.h();
                if (!z2) {
                    throw new IllegalStateException("Not a JSON Object: " + iVar);
                }
                for (Map.Entry<String, i> entry : ((l) iVar).h()) {
                    bVar.z(entry.getKey());
                    c(bVar, entry.getValue());
                }
                bVar.p();
            }
        };
        V = typeAdapter15;
        final Class<i> cls4 = i.class;
        W = new t() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.t
            public <T2> TypeAdapter<T2> a(Gson gson, com.google.gson.u.a<T2> aVar) {
                final Class d2 = aVar.d();
                if (cls4.isAssignableFrom(d2)) {
                    return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public T1 b(com.google.gson.stream.a aVar2) throws IOException {
                            T1 t1 = (T1) typeAdapter15.b(aVar2);
                            if (t1 == null || d2.isInstance(t1)) {
                                return t1;
                            }
                            StringBuilder M2 = e.a.a.a.a.M("Expected a ");
                            M2.append(d2.getName());
                            M2.append(" but was ");
                            M2.append(t1.getClass().getName());
                            M2.append("; at path ");
                            throw new r(e.a.a.a.a.g(aVar2, M2));
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void c(com.google.gson.stream.b bVar, T1 t1) throws IOException {
                            typeAdapter15.c(bVar, t1);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                StringBuilder M2 = e.a.a.a.a.M("Factory[typeHierarchy=");
                M2.append(cls4.getName());
                M2.append(",adapter=");
                M2.append(typeAdapter15);
                M2.append("]");
                return M2.toString();
            }
        };
        X = new t() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.t
            public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
                Class<? super T> d2 = aVar.d();
                if (!Enum.class.isAssignableFrom(d2) || d2 == Enum.class) {
                    return null;
                }
                if (!d2.isEnum()) {
                    d2 = d2.getSuperclass();
                }
                return new EnumTypeAdapter(d2);
            }
        };
    }

    public static <TT> t a(final com.google.gson.u.a<TT> aVar, final TypeAdapter<TT> typeAdapter) {
        return new t() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.t
            public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar2) {
                if (aVar2.equals(com.google.gson.u.a.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> t b(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new AnonymousClass31(cls, typeAdapter);
    }

    public static <TT> t c(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new AnonymousClass32(cls, cls2, typeAdapter);
    }
}
