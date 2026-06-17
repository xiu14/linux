package com.bytedance.retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.w;

/* loaded from: classes2.dex */
abstract class D<T> {

    static final class a<T> extends D<T> {
        private final InterfaceC0705i<T, String> a;

        a(InterfaceC0705i<T, String> interfaceC0705i) {
            this.a = interfaceC0705i;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            if (t == null) {
                return;
            }
            try {
                f2.l(Boolean.parseBoolean(this.a.a(t)));
            } catch (IOException e2) {
                throw new RuntimeException("Unable to convert " + t + " to AddCommonParam", e2);
            }
        }
    }

    static final class b<T> extends D<T> {
        private final Method a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5916c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> f5917d;

        b(Method method, int i, boolean z, InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> interfaceC0705i) {
            this.a = method;
            this.b = i;
            this.f5916c = z;
            this.f5917d = interfaceC0705i;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) {
            if (t == null) {
                if (!this.f5916c) {
                    throw P.m(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
                }
                return;
            }
            try {
                f2.m(this.f5917d.b() ? this.f5917d.c(t, f2) : this.f5917d.a(t));
            } catch (IOException e2) {
                throw P.n(this.a, e2, this.b, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class c extends D<okhttp3.A> {
        static final c a = new c();

        c() {
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, okhttp3.A a2) throws IOException {
            okhttp3.A a3 = a2;
            if (a3 == null) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
            f2.n(a3);
            f2.t();
        }
    }

    static final class d extends D<okhttp3.A> {
        private final okhttp3.s a;

        d(okhttp3.s sVar) {
            this.a = sVar;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, okhttp3.A a) throws IOException {
            okhttp3.A a2 = a;
            if (a2 == null) {
                return;
            }
            f2.e(this.a, a2);
            f2.t();
        }
    }

    static final class e extends D<Map<String, okhttp3.A>> {
        private final String a;

        e(String str) {
            this.a = str;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, Map<String, okhttp3.A> map) throws IOException {
            Map<String, okhttp3.A> map2 = map;
            if (map2 == null) {
                throw new IllegalArgumentException("Part map was null.");
            }
            for (Map.Entry<String, okhttp3.A> entry : map2.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Part map contained null key.");
                }
                okhttp3.A value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException(e.a.a.a.a.t("Part map contained null value for key '", key, "'."));
                }
                f2.e(okhttp3.s.h("Content-Disposition", e.a.a.a.a.t("form-data; name=\"", key, "\""), "Content-Transfer-Encoding", this.a), value);
            }
            f2.t();
        }
    }

    static final class f extends D<w.b> {
        static final f a = new f();

        f() {
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, w.b bVar) throws IOException {
            w.b bVar2 = bVar;
            if (bVar2 != null) {
                f2.f(bVar2);
            }
            f2.t();
        }
    }

    static final class g<T> extends D<T> {
        private final InterfaceC0705i<T, Object> a;

        g(InterfaceC0705i<T, Object> interfaceC0705i) {
            this.a = interfaceC0705i;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            if (t == null) {
                return;
            }
            try {
                f2.o(this.a.a(t));
            } catch (IOException e2) {
                throw new RuntimeException("Unable to convert " + t + " to ExtraInfo", e2);
            }
        }
    }

    static final class h<T> extends D<T> {
        private final String a;
        private final InterfaceC0705i<T, String> b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5918c;

        h(String str, InterfaceC0705i<T, String> interfaceC0705i, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC0705i;
            this.f5918c = z;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            f2.a(this.a, a, this.f5918c);
        }
    }

    static final class i<T> extends D<Map<String, T>> {
        private final Method a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC0705i<T, String> f5919c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f5920d;

        i(Method method, int i, InterfaceC0705i<T, String> interfaceC0705i, boolean z) {
            this.a = method;
            this.b = i;
            this.f5919c = interfaceC0705i;
            this.f5920d = z;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw P.m(this.a, this.b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw P.m(this.a, this.b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw P.m(this.a, this.b, e.a.a.a.a.t("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String str2 = (String) this.f5919c.a(value);
                if (str2 == null) {
                    throw P.m(this.a, this.b, "Field map value '" + value + "' converted to null by " + this.f5919c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                f2.a(str, str2, this.f5920d);
            }
        }
    }

    static final class j<T> extends D<T> {
        private final String a;
        private final InterfaceC0705i<T, String> b;

        j(String str, InterfaceC0705i<T, String> interfaceC0705i) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC0705i;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            f2.b(this.a, a);
        }
    }

    static final class k<T> extends D<List<T>> {
        private final InterfaceC0705i<T, com.bytedance.retrofit2.client.b> a;

        k(InterfaceC0705i<T, com.bytedance.retrofit2.client.b> interfaceC0705i) {
            this.a = interfaceC0705i;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, Object obj) throws IOException {
            List list = (List) obj;
            if (list == null) {
                return;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.bytedance.retrofit2.client.b bVar = (com.bytedance.retrofit2.client.b) this.a.a(it2.next());
                f2.b(bVar.a(), bVar.b());
            }
        }
    }

    static final class l<T> extends D<Map<String, T>> {
        private final Method a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC0705i<T, String> f5921c;

        l(Method method, int i, InterfaceC0705i<T, String> interfaceC0705i) {
            this.a = method;
            this.b = i;
            this.f5921c = interfaceC0705i;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw P.m(this.a, this.b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw P.m(this.a, this.b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw P.m(this.a, this.b, e.a.a.a.a.t("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                f2.b(str, (String) this.f5921c.a(value));
            }
        }
    }

    static final class m<T> extends D<T> {
        private final InterfaceC0705i<T, String> a;

        m(InterfaceC0705i<T, String> interfaceC0705i) {
            this.a = interfaceC0705i;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            if (t == null) {
                return;
            }
            try {
                f2.p(Integer.parseInt(this.a.a(t)));
            } catch (IOException e2) {
                throw new RuntimeException("Unable to convert " + t + " to MaxLength", e2);
            }
        }
    }

    static final class n<T> extends D<T> {
        private final String a;
        private final InterfaceC0705i<T, String> b;

        n(String str, InterfaceC0705i<T, String> interfaceC0705i) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC0705i;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            if (t == null) {
                throw new IllegalArgumentException(e.a.a.a.a.J(e.a.a.a.a.M("Method parameter \""), this.a, "\" value must not be null."));
            }
            f2.q(this.a, this.b.a(t));
        }
    }

    static final class o<T> extends D<T> {
        private final Method a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5922c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> f5923d;

        o(Method method, int i, String str, InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> interfaceC0705i) {
            this.a = method;
            this.b = i;
            this.f5922c = str;
            this.f5923d = interfaceC0705i;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) {
            if (t == null) {
                return;
            }
            try {
                f2.c(this.f5922c, this.f5923d.a(t));
            } catch (IOException e2) {
                throw P.m(this.a, this.b, "Unable to convert " + t + " to RequestBody", e2);
            }
        }
    }

    static final class p<T> extends D<Map<String, T>> {
        private final Method a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> f5924c;

        /* renamed from: d, reason: collision with root package name */
        private final String f5925d;

        p(Method method, int i, InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> interfaceC0705i, String str) {
            this.a = method;
            this.b = i;
            this.f5924c = interfaceC0705i;
            this.f5925d = str;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw P.m(this.a, this.b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw P.m(this.a, this.b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw P.m(this.a, this.b, e.a.a.a.a.t("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                f2.d(str, this.f5925d, (com.bytedance.retrofit2.mime.i) this.f5924c.a(value));
            }
        }
    }

    static final class q<T> extends D<T> {
        private final Method a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5926c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC0705i<T, String> f5927d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f5928e;

        q(Method method, int i, String str, InterfaceC0705i<T, String> interfaceC0705i, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.f5926c = str;
            this.f5927d = interfaceC0705i;
            this.f5928e = z;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            if (t == null) {
                throw P.m(this.a, this.b, e.a.a.a.a.J(e.a.a.a.a.M("Path parameter \""), this.f5926c, "\" value must not be null."), new Object[0]);
            }
            f2.g(this.f5926c, this.f5927d.a(t), this.f5928e);
        }
    }

    static final class r<T> extends D<T> {
        private final String a;
        private final InterfaceC0705i<T, String> b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5929c;

        r(String str, InterfaceC0705i<T, String> interfaceC0705i, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = interfaceC0705i;
            this.f5929c = z;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            f2.h(this.a, a, this.f5929c);
        }
    }

    static final class s<T> extends D<Map<String, T>> {
        private final Method a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC0705i<T, String> f5930c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f5931d;

        s(Method method, int i, InterfaceC0705i<T, String> interfaceC0705i, boolean z) {
            this.a = method;
            this.b = i;
            this.f5930c = interfaceC0705i;
            this.f5931d = z;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw P.m(this.a, this.b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value != null) {
                    String str2 = (String) this.f5930c.a(value);
                    if (str2 == null) {
                        throw P.m(this.a, this.b, "Query map value '" + value + "' converted to null by " + this.f5930c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    f2.h(str, str2, this.f5931d);
                }
            }
        }
    }

    static final class t<T> extends D<T> {
        private final InterfaceC0705i<T, String> a;
        private final boolean b;

        t(InterfaceC0705i<T, String> interfaceC0705i, boolean z) {
            this.a = interfaceC0705i;
            this.b = z;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            if (t == null) {
                return;
            }
            f2.h(this.a.a(t), null, this.b);
        }
    }

    static final class u<T> extends D<T> {
        u() {
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) throws IOException {
            if (t == null) {
                return;
            }
            if (t instanceof com.bytedance.retrofit2.R.H.b) {
                f2.r(((com.bytedance.retrofit2.R.H.b) t).a());
                return;
            }
            StringBuilder M = e.a.a.a.a.M("wrong type:");
            M.append(t.getClass());
            M.append(",not implement QueryParamObject");
            throw new RuntimeException(M.toString());
        }
    }

    static final class v extends D<Object> {
        v(Method method, int i) {
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, Object obj) {
            f2.s(obj);
        }
    }

    static final class w<T> extends D<T> {
        final Class<T> a;

        w(Class<T> cls) {
            this.a = cls;
        }

        @Override // com.bytedance.retrofit2.D
        void a(F f2, T t) {
            f2.i(this.a, t);
        }
    }

    D() {
    }

    abstract void a(F f2, T t2) throws IOException;
}
