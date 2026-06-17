package com.bytedance.retrofit2;

import android.text.TextUtils;
import com.bytedance.retrofit2.D;
import com.bytedance.retrofit2.R.InterfaceC0690a;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.InterfaceC0692c;
import com.bytedance.retrofit2.R.InterfaceC0693d;
import com.bytedance.retrofit2.R.InterfaceC0694e;
import com.bytedance.retrofit2.R.InterfaceC0695f;
import com.bytedance.retrofit2.R.InterfaceC0696g;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.a;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.w;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Streaming;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* loaded from: classes2.dex */
final class G<T> {
    final boolean a;
    final a.InterfaceC0309a b;

    /* renamed from: c, reason: collision with root package name */
    final List<com.bytedance.retrofit2.S.a> f5939c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f5940d;

    /* renamed from: e, reason: collision with root package name */
    final int f5941e;

    /* renamed from: f, reason: collision with root package name */
    final int f5942f;

    /* renamed from: g, reason: collision with root package name */
    final String f5943g;
    final boolean h;
    final int i;
    final boolean j;
    final int k;
    final Method l;
    final com.bytedance.retrofit2.Q.a m;
    private final InterfaceC0707k n;
    public InterfaceC0705i<com.bytedance.retrofit2.mime.h, T> o = null;
    final String p;
    private final String q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final D<?>[] u;
    private final List<com.bytedance.retrofit2.client.b> v;
    private final String w;
    private RetrofitMetrics x;
    private final boolean y;

    static final class a<T> {
        private static final Pattern H = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern I = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        List<com.bytedance.retrofit2.client.b> A;
        String B;
        Set<String> C;
        String D;
        D<?>[] E;
        boolean F;
        boolean G;
        final H a;
        final Method b;

        /* renamed from: c, reason: collision with root package name */
        final Annotation[] f5944c;

        /* renamed from: d, reason: collision with root package name */
        final Annotation[][] f5945d;

        /* renamed from: e, reason: collision with root package name */
        final Type[] f5946e;

        /* renamed from: f, reason: collision with root package name */
        final RetrofitMetrics f5947f;

        /* renamed from: g, reason: collision with root package name */
        int f5948g = 1;
        String h = "";
        boolean i = false;
        int j = 0;
        boolean k = false;
        int l = 3;
        boolean m;
        boolean n;
        boolean o;
        boolean p;
        boolean q;
        boolean r;
        boolean s;
        boolean t;
        boolean u;
        String v;
        boolean w;
        boolean x;
        boolean y;
        String z;

        a(H h, Method method, RetrofitMetrics retrofitMetrics) {
            this.a = h;
            this.b = method;
            this.f5944c = method.getAnnotations();
            this.f5946e = method.getGenericParameterTypes();
            this.f5945d = method.getParameterAnnotations();
            this.f5947f = retrofitMetrics;
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private okhttp3.s c(String str, String str2) {
            return okhttp3.s.h("Content-Disposition", e.a.a.a.a.t("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", str2);
        }

        private List<com.bytedance.retrofit2.client.b> d(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw P.k(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (DownloadHelper.CONTENT_TYPE.equalsIgnoreCase(substring)) {
                    this.B = trim;
                } else {
                    arrayList.add(new com.bytedance.retrofit2.client.b(substring, trim));
                }
            }
            return arrayList;
        }

        private void e(String str, String str2, boolean z) {
            String str3;
            Matcher matcher;
            String str4 = this.v;
            if (str4 != null) {
                throw P.k(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str4, str);
            }
            this.v = str;
            if (str != null) {
                try {
                    matcher = H.matcher(str);
                } catch (IllegalArgumentException unused) {
                }
                if (matcher.find()) {
                    str3 = matcher.group(1);
                    this.D = str3;
                }
                str3 = null;
                this.D = str3;
            }
            if (this.D != null) {
                this.k = true;
            }
            this.w = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                try {
                    String substring = str2.substring(indexOf + 1);
                    if (H.matcher(substring).find()) {
                        throw P.k(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                } catch (IllegalArgumentException e2) {
                    if (e2.getMessage().contains("URL query string")) {
                        throw e2;
                    }
                }
            }
            this.z = str2;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                Matcher matcher2 = H.matcher(str2);
                while (matcher2.find()) {
                    linkedHashSet.add(matcher2.group(1));
                }
            } catch (IllegalArgumentException unused2) {
            }
            this.C = linkedHashSet;
        }

        private void f(Annotation annotation) {
            if (annotation instanceof DELETE) {
                e("DELETE", ((DELETE) annotation).value(), false);
                return;
            }
            if (annotation instanceof GET) {
                e("GET", ((GET) annotation).value(), false);
                return;
            }
            if (annotation instanceof HEAD) {
                e("HEAD", ((HEAD) annotation).value(), false);
                return;
            }
            if (annotation instanceof PATCH) {
                e("PATCH", ((PATCH) annotation).value(), true);
                return;
            }
            if (annotation instanceof POST) {
                e("POST", ((POST) annotation).value(), true);
                return;
            }
            if (annotation instanceof PUT) {
                e("PUT", ((PUT) annotation).value(), true);
                return;
            }
            if (annotation instanceof OPTIONS) {
                e("OPTIONS", ((OPTIONS) annotation).value(), false);
                return;
            }
            if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                e(http.method(), http.path(), http.hasBody());
                return;
            }
            if (annotation instanceof Headers) {
                String[] value = ((Headers) annotation).value();
                if (value.length == 0) {
                    throw P.k(this.b, "@Headers annotation is empty.", new Object[0]);
                }
                this.A = d(value);
                return;
            }
            if (annotation instanceof Multipart) {
                if (this.x) {
                    throw P.k(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.y = true;
            } else if (annotation instanceof FormUrlEncoded) {
                if (this.y) {
                    throw P.k(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.x = true;
            } else if (annotation instanceof Streaming) {
                this.i = true;
            }
        }

        private D<?> g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                j(i, type);
                if (this.t) {
                    throw P.m(this.b, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.p) {
                    throw P.m(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.q) {
                    throw P.m(this.b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.r) {
                    throw P.m(this.b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.s) {
                    throw P.m(this.b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.z != null) {
                    throw P.m(this.b, i, "@Url cannot be used with @%s URL", this.v);
                }
                this.t = true;
                if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new D.v(this.b, i);
                }
                throw P.m(this.b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof Path) {
                j(i, type);
                if (this.q) {
                    throw P.m(this.b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.r) {
                    throw P.m(this.b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.s) {
                    throw P.m(this.b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.t) {
                    throw P.m(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.z == null) {
                    throw P.m(this.b, i, "@Path can only be used with relative url on @%s", this.v);
                }
                this.p = true;
                String value = ((Path) annotation).value();
                i(i, value);
                return new D.q(this.b, i, value, this.a.o(type, annotationArr), !r11.encoded());
            }
            if (annotation instanceof Query) {
                j(i, type);
                Query query = (Query) annotation;
                String value2 = query.value();
                boolean encoded = query.encoded();
                Class<?> g2 = P.g(type);
                this.q = true;
                if (!Iterable.class.isAssignableFrom(g2)) {
                    return g2.isArray() ? new C(new D.r(value2, this.a.o(a(g2.getComponentType()), annotationArr), !encoded)) : new D.r(value2, this.a.o(type, annotationArr), !encoded);
                }
                if (type instanceof ParameterizedType) {
                    return new B(new D.r(value2, this.a.o(P.f(0, (ParameterizedType) type), annotationArr), !encoded));
                }
                throw P.m(this.b, i, g2.getSimpleName() + " must include generic type (e.g., " + g2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof QueryName) {
                j(i, type);
                boolean encoded2 = ((QueryName) annotation).encoded();
                Class<?> g3 = P.g(type);
                this.r = true;
                if (!Iterable.class.isAssignableFrom(g3)) {
                    return g3.isArray() ? new C(new D.t(this.a.o(a(g3.getComponentType()), annotationArr), encoded2)) : new D.t(this.a.o(type, annotationArr), encoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new B(new D.t(this.a.o(P.f(0, (ParameterizedType) type), annotationArr), encoded2));
                }
                throw P.m(this.b, i, g3.getSimpleName() + " must include generic type (e.g., " + g3.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof QueryMap) {
                j(i, type);
                Class<?> g4 = P.g(type);
                this.s = true;
                if (!Map.class.isAssignableFrom(g4)) {
                    throw P.m(this.b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type h = P.h(type, g4, Map.class);
                if (!(h instanceof ParameterizedType)) {
                    throw P.m(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) h;
                Type f2 = P.f(0, parameterizedType);
                if (String.class == f2) {
                    return new D.s(this.b, i, this.a.o(P.f(1, parameterizedType), annotationArr), !((QueryMap) annotation).encoded());
                }
                throw P.m(this.b, i, e.a.a.a.a.y("@QueryMap keys must be of type String: ", f2), new Object[0]);
            }
            if (annotation instanceof Header) {
                j(i, type);
                String value3 = ((Header) annotation).value();
                Class<?> g5 = P.g(type);
                if (!Iterable.class.isAssignableFrom(g5)) {
                    return g5.isArray() ? new C(new D.j(value3, this.a.o(a(g5.getComponentType()), annotationArr))) : new D.j(value3, this.a.o(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new B(new D.j(value3, this.a.o(P.f(0, (ParameterizedType) type), annotationArr)));
                }
                throw P.m(this.b, i, g5.getSimpleName() + " must include generic type (e.g., " + g5.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof HeaderMap) {
                j(i, type);
                Class<?> g6 = P.g(type);
                if (!Map.class.isAssignableFrom(g6)) {
                    throw P.m(this.b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type h2 = P.h(type, g6, Map.class);
                if (!(h2 instanceof ParameterizedType)) {
                    throw P.m(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) h2;
                Type f3 = P.f(0, parameterizedType2);
                if (String.class == f3) {
                    return new D.l(this.b, i, this.a.o(P.f(1, parameterizedType2), annotationArr));
                }
                throw P.m(this.b, i, e.a.a.a.a.y("@HeaderMap keys must be of type String: ", f3), new Object[0]);
            }
            if (annotation instanceof Field) {
                j(i, type);
                if (!this.x) {
                    throw P.m(this.b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Field field = (Field) annotation;
                String value4 = field.value();
                boolean encoded3 = field.encoded();
                this.m = true;
                Class<?> g7 = P.g(type);
                if (!Iterable.class.isAssignableFrom(g7)) {
                    return g7.isArray() ? new C(new D.h(value4, this.a.o(a(g7.getComponentType()), annotationArr), !encoded3)) : new D.h(value4, this.a.o(type, annotationArr), !encoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new B(new D.h(value4, this.a.o(P.f(0, (ParameterizedType) type), annotationArr), !encoded3));
                }
                throw P.m(this.b, i, g7.getSimpleName() + " must include generic type (e.g., " + g7.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof FieldMap) {
                j(i, type);
                if (!this.x) {
                    throw P.m(this.b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> g8 = P.g(type);
                if (!Map.class.isAssignableFrom(g8)) {
                    throw P.m(this.b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type h3 = P.h(type, g8, Map.class);
                if (!(h3 instanceof ParameterizedType)) {
                    throw P.m(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) h3;
                Type f4 = P.f(0, parameterizedType3);
                if (String.class != f4) {
                    throw P.m(this.b, i, e.a.a.a.a.y("@FieldMap keys must be of type String: ", f4), new Object[0]);
                }
                InterfaceC0705i<T, String> o = this.a.o(P.f(1, parameterizedType3), annotationArr);
                this.m = true;
                return new D.i(this.b, i, o, !((FieldMap) annotation).encoded());
            }
            if (annotation instanceof Part) {
                if (!this.y) {
                    throw P.m(this.b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                Part part = (Part) annotation;
                this.n = true;
                D<?> h4 = h(type, part.value(), part.encoding());
                return h4 != null ? h4 : new D.o(this.b, i, part.value(), this.a.k(type, annotationArr, this.f5944c));
            }
            if (annotation instanceof PartMap) {
                j(i, type);
                if (!this.y) {
                    throw P.m(this.b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.n = true;
                Class<?> g9 = P.g(type);
                if (!Map.class.isAssignableFrom(g9)) {
                    throw P.m(this.b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type h5 = P.h(type, g9, Map.class);
                if (!(h5 instanceof ParameterizedType)) {
                    throw P.m(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) h5;
                Type f5 = P.f(0, parameterizedType4);
                if (String.class != f5) {
                    throw P.m(this.b, i, e.a.a.a.a.y("@PartMap keys must be of type String: ", f5), new Object[0]);
                }
                Type f6 = P.f(1, parameterizedType4);
                if (w.b.class.isAssignableFrom(P.g(f6))) {
                    throw P.m(this.b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                }
                return new D.p(this.b, i, this.a.k(f6, annotationArr, this.f5944c), ((PartMap) annotation).encoding());
            }
            if (annotation instanceof Body) {
                j(i, type);
                if (this.x || this.y) {
                    throw P.m(this.b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.o) {
                    throw P.m(this.b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                D.c cVar = okhttp3.A.class.isAssignableFrom(P.g(type)) ? D.c.a : null;
                if (cVar != null) {
                    this.o = true;
                    return cVar;
                }
                try {
                    InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> k = this.a.k(type, annotationArr, this.f5944c);
                    this.o = true;
                    return new D.b(this.b, i, this.k, k);
                } catch (RuntimeException e2) {
                    throw P.n(this.b, e2, i, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof Tag)) {
                return null;
            }
            j(i, type);
            Class<?> g10 = P.g(type);
            for (int i2 = i - 1; i2 >= 0; i2--) {
                D<?> d2 = this.E[i2];
                if ((d2 instanceof D.w) && ((D.w) d2).a.equals(g10)) {
                    Method method = this.b;
                    StringBuilder M = e.a.a.a.a.M("@Tag type ");
                    M.append(g10.getName());
                    M.append(" is duplicate of parameter #");
                    M.append(i2 + 1);
                    M.append(" and would always overwrite its value.");
                    throw P.m(method, i, M.toString(), new Object[0]);
                }
            }
            return new D.w(g10);
        }

        private D<?> h(Type type, String str, String str2) {
            Class<?> g2 = P.g(type);
            if (TextUtils.isEmpty(str)) {
                if (Iterable.class.isAssignableFrom(g2)) {
                    if ((type instanceof ParameterizedType) && w.b.class.isAssignableFrom(P.g(P.f(0, (ParameterizedType) type)))) {
                        return new B(D.f.a);
                    }
                } else if (g2.isArray()) {
                    if (w.b.class.isAssignableFrom(g2.getComponentType())) {
                        return new C(D.f.a);
                    }
                } else if (w.b.class.isAssignableFrom(g2)) {
                    return D.f.a;
                }
            } else if (Iterable.class.isAssignableFrom(g2)) {
                if ((type instanceof ParameterizedType) && okhttp3.A.class.isAssignableFrom(P.g(P.f(0, (ParameterizedType) type)))) {
                    return new B(new D.d(c(str, str2)));
                }
            } else if (g2.isArray()) {
                if (okhttp3.A.class.isAssignableFrom(a(g2.getComponentType()))) {
                    return new C(new D.d(c(str, str2)));
                }
            } else if (okhttp3.A.class.isAssignableFrom(g2)) {
                return new D.d(c(str, str2));
            }
            return null;
        }

        private void i(int i, String str) {
            try {
            } catch (IllegalArgumentException e2) {
                if (e2.getMessage().contains("@Path parameter name must match")) {
                    throw e2;
                }
            }
            if (!I.matcher(str).matches()) {
                throw P.m(this.b, i, "@Path parameter name must match %s. Found: %s", H.pattern(), str);
            }
            if (!this.C.contains(str)) {
                throw P.m(this.b, i, "URL \"%s\" does not contain \"{%s}\".", this.z, str);
            }
        }

        private void j(int i, Type type) {
            if (P.i(type)) {
                throw P.m(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        G b() {
            D<?> d2;
            Annotation annotation;
            int i;
            int i2;
            D<?> mVar;
            D<?> d3;
            D<?> nVar;
            D<?> hVar;
            for (Annotation annotation2 : this.f5944c) {
                if (annotation2 instanceof InterfaceC0692c) {
                    e("DELETE", ((InterfaceC0692c) annotation2).value(), false);
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.h) {
                    e("GET", ((com.bytedance.retrofit2.R.h) annotation2).value(), false);
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.i) {
                    e("HEAD", ((com.bytedance.retrofit2.R.i) annotation2).value(), false);
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.s) {
                    e("PATCH", ((com.bytedance.retrofit2.R.s) annotation2).value(), true);
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.t) {
                    e("POST", ((com.bytedance.retrofit2.R.t) annotation2).value(), true);
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.u) {
                    e("PUT", ((com.bytedance.retrofit2.R.u) annotation2).value(), true);
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.r) {
                    e("OPTIONS", ((com.bytedance.retrofit2.R.r) annotation2).value(), false);
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.j) {
                    com.bytedance.retrofit2.R.j jVar = (com.bytedance.retrofit2.R.j) annotation2;
                    e(jVar.method(), jVar.path(), jVar.hasBody());
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.n) {
                    String[] value = ((com.bytedance.retrofit2.R.n) annotation2).value();
                    if (value.length == 0) {
                        throw P.k(this.b, "@Headers annotation is empty.", new Object[0]);
                    }
                    this.A = d(value);
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.q) {
                    if (this.x) {
                        throw P.k(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                    this.y = true;
                } else if (annotation2 instanceof InterfaceC0696g) {
                    if (this.y) {
                        throw P.k(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                    this.x = true;
                    this.G = ((InterfaceC0696g) annotation2).enableRecord();
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.E) {
                    this.i = true;
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.y) {
                    this.f5948g = ((com.bytedance.retrofit2.R.y) annotation2).value();
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.D) {
                    this.h = ((com.bytedance.retrofit2.R.D) annotation2).value();
                } else if (annotation2 instanceof com.bytedance.retrofit2.R.C) {
                    this.l = ((com.bytedance.retrofit2.R.C) annotation2).value();
                }
                if (E.h()) {
                    f(annotation2);
                }
            }
            if (this.v == null) {
                throw P.k(this.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.w && !this.k) {
                if (this.y) {
                    throw P.k(this.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.x) {
                    throw P.k(this.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f5945d.length;
            this.E = new D[length];
            int i3 = length - 1;
            int i4 = 0;
            while (i4 < length) {
                D<?>[] dArr = this.E;
                Type type = this.f5946e[i4];
                Annotation[] annotationArr = this.f5945d[i4];
                boolean z = i4 == i3;
                D<?> d4 = null;
                if (annotationArr != null) {
                    int length2 = annotationArr.length;
                    int i5 = 0;
                    d2 = null;
                    while (i5 < length2) {
                        Annotation annotation3 = annotationArr[i5];
                        if (annotation3 instanceof com.bytedance.retrofit2.R.G) {
                            j(i4, type);
                            if (this.t) {
                                throw P.m(this.b, i4, "Multiple @Url method annotations found.", new Object[0]);
                            }
                            if (this.p) {
                                throw P.m(this.b, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                            }
                            if (this.q) {
                                throw P.m(this.b, i4, "A @Url parameter must not come after a @Query.", new Object[0]);
                            }
                            if (this.z != null) {
                                throw P.m(this.b, i4, "@Url cannot be used with @%s URL", this.v);
                            }
                            if (this.r) {
                                throw P.m(this.b, i4, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                            }
                            if (this.s) {
                                throw P.m(this.b, i4, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            this.t = true;
                            if (type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                throw P.m(this.b, i4, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                            }
                            d3 = new D.v(this.b, i4);
                            annotation = annotation3;
                            i = i5;
                            i2 = length2;
                        } else if (annotation3 instanceof com.bytedance.retrofit2.R.x) {
                            j(i4, type);
                            if (this.q) {
                                throw P.m(this.b, i4, "A @Path parameter must not come after a @Query.", new Object[0]);
                            }
                            if (this.t) {
                                throw P.m(this.b, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                            }
                            if (this.z == null) {
                                throw P.m(this.b, i4, "@Path can only be used with relative url on @%s", this.v);
                            }
                            if (this.r) {
                                throw P.m(this.b, i4, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                            }
                            if (this.s) {
                                throw P.m(this.b, i4, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            this.p = true;
                            com.bytedance.retrofit2.R.x xVar = (com.bytedance.retrofit2.R.x) annotation3;
                            String value2 = xVar.value();
                            i(i4, value2);
                            i = i5;
                            i2 = length2;
                            d3 = new D.q(this.b, i4, value2, this.a.o(type, annotationArr), xVar.encode());
                            annotation = annotation3;
                        } else {
                            annotation = annotation3;
                            i = i5;
                            i2 = length2;
                            if (annotation instanceof com.bytedance.retrofit2.R.z) {
                                j(i4, type);
                                com.bytedance.retrofit2.R.z zVar = (com.bytedance.retrofit2.R.z) annotation;
                                String value3 = zVar.value();
                                boolean encode = zVar.encode();
                                Class<?> g2 = P.g(type);
                                this.q = true;
                                if (Iterable.class.isAssignableFrom(g2)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw P.m(this.b, i4, g2.getSimpleName() + " must include generic type (e.g., " + g2.getSimpleName() + "<String>)", new Object[0]);
                                    }
                                    d3 = new B<>(new D.r(value3, this.a.o(P.f(0, (ParameterizedType) type), annotationArr), encode));
                                } else if (g2.isArray()) {
                                    d3 = new C(new D.r(value3, this.a.o(a(g2.getComponentType()), annotationArr), encode));
                                } else {
                                    hVar = new D.r<>(value3, this.a.o(type, annotationArr), encode);
                                    d3 = hVar;
                                }
                            } else if (annotation instanceof com.bytedance.retrofit2.R.B) {
                                j(i4, type);
                                boolean encoded = ((com.bytedance.retrofit2.R.B) annotation).encoded();
                                Class<?> g3 = P.g(type);
                                this.r = true;
                                if (Iterable.class.isAssignableFrom(g3)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw P.m(this.b, i4, g3.getSimpleName() + " must include generic type (e.g., " + g3.getSimpleName() + "<String>)", new Object[0]);
                                    }
                                    d3 = new B<>(new D.t(this.a.o(P.f(0, (ParameterizedType) type), annotationArr), encoded));
                                } else if (g3.isArray()) {
                                    d3 = new C(new D.t(this.a.o(a(g3.getComponentType()), annotationArr), encoded));
                                } else {
                                    nVar = new D.t<>(this.a.o(type, annotationArr), encoded);
                                    d3 = nVar;
                                }
                            } else {
                                if (annotation instanceof com.bytedance.retrofit2.R.A) {
                                    j(i4, type);
                                    Class<?> g4 = P.g(type);
                                    this.s = true;
                                    if (!Map.class.isAssignableFrom(g4)) {
                                        throw P.m(this.b, i4, "@QueryMap parameter type must be Map.", new Object[0]);
                                    }
                                    Type h = P.h(type, g4, Map.class);
                                    if (!(h instanceof ParameterizedType)) {
                                        throw P.m(this.b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    ParameterizedType parameterizedType = (ParameterizedType) h;
                                    Type f2 = P.f(0, parameterizedType);
                                    if (String.class != f2) {
                                        throw P.m(this.b, i4, e.a.a.a.a.y("@QueryMap keys must be of type String: ", f2), new Object[0]);
                                    }
                                    mVar = new D.s<>(this.b, i4, this.a.o(P.f(1, parameterizedType), annotationArr), ((com.bytedance.retrofit2.R.A) annotation).encode());
                                } else if (annotation instanceof com.bytedance.retrofit2.R.k) {
                                    j(i4, type);
                                    String value4 = ((com.bytedance.retrofit2.R.k) annotation).value();
                                    Class<?> g5 = P.g(type);
                                    if (Iterable.class.isAssignableFrom(g5)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw P.m(this.b, i4, g5.getSimpleName() + " must include generic type (e.g., " + g5.getSimpleName() + "<String>)", new Object[0]);
                                        }
                                        d3 = new B<>(new D.j(value4, this.a.o(P.f(0, (ParameterizedType) type), annotationArr)));
                                    } else if (g5.isArray()) {
                                        d3 = new C(new D.j(value4, this.a.o(a(g5.getComponentType()), annotationArr)));
                                    } else {
                                        nVar = new D.j<>(value4, this.a.o(type, annotationArr));
                                        d3 = nVar;
                                    }
                                } else if (annotation instanceof com.bytedance.retrofit2.R.l) {
                                    Class<?> g6 = P.g(type);
                                    if (!List.class.isAssignableFrom(g6)) {
                                        throw P.m(this.b, i4, "@HeaderList parameter type must be List.", new Object[0]);
                                    }
                                    Type h2 = P.h(type, g6, List.class);
                                    if (!(h2 instanceof ParameterizedType)) {
                                        throw P.m(this.b, i4, "List must include generic types (e.g., List<Header>)", new Object[0]);
                                    }
                                    Type f3 = P.f(0, (ParameterizedType) h2);
                                    if (com.bytedance.retrofit2.client.b.class != f3) {
                                        throw P.m(this.b, i4, e.a.a.a.a.y("@HeaderList keys must be of type retrofit.client.Header: ", f3), new Object[0]);
                                    }
                                    mVar = new D.k<>(this.a.f(f3, annotationArr));
                                } else if (annotation instanceof com.bytedance.retrofit2.R.m) {
                                    j(i4, type);
                                    Class<?> g7 = P.g(type);
                                    if (!Map.class.isAssignableFrom(g7)) {
                                        throw P.m(this.b, i4, "@HeaderMap parameter type must be Map.", new Object[0]);
                                    }
                                    Type h3 = P.h(type, g7, Map.class);
                                    if (!(h3 instanceof ParameterizedType)) {
                                        throw P.m(this.b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    ParameterizedType parameterizedType2 = (ParameterizedType) h3;
                                    Type f4 = P.f(0, parameterizedType2);
                                    if (String.class != f4) {
                                        throw P.m(this.b, i4, e.a.a.a.a.y("@HeaderMap keys must be of type String: ", f4), new Object[0]);
                                    }
                                    mVar = new D.l<>(this.b, i4, this.a.o(P.f(1, parameterizedType2), annotationArr));
                                } else if (annotation instanceof InterfaceC0694e) {
                                    j(i4, type);
                                    if (!this.x) {
                                        throw P.m(this.b, i4, "@Field parameters can only be used with form encoding.", new Object[0]);
                                    }
                                    InterfaceC0694e interfaceC0694e = (InterfaceC0694e) annotation;
                                    String value5 = interfaceC0694e.value();
                                    boolean encode2 = interfaceC0694e.encode();
                                    this.m = true;
                                    Class<?> g8 = P.g(type);
                                    if (Iterable.class.isAssignableFrom(g8)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw P.m(this.b, i4, g8.getSimpleName() + " must include generic type (e.g., " + g8.getSimpleName() + "<String>)", new Object[0]);
                                        }
                                        d3 = new B<>(new D.h(value5, this.a.o(P.f(0, (ParameterizedType) type), annotationArr), encode2));
                                    } else if (g8.isArray()) {
                                        d3 = new C(new D.h(value5, this.a.o(a(g8.getComponentType()), annotationArr), encode2));
                                    } else {
                                        hVar = new D.h<>(value5, this.a.o(type, annotationArr), encode2);
                                        d3 = hVar;
                                    }
                                } else if (annotation instanceof InterfaceC0695f) {
                                    j(i4, type);
                                    if (!this.x) {
                                        throw P.m(this.b, i4, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                    }
                                    Class<?> g9 = P.g(type);
                                    if (!Map.class.isAssignableFrom(g9)) {
                                        throw P.m(this.b, i4, "@FieldMap parameter type must be Map.", new Object[0]);
                                    }
                                    Type h4 = P.h(type, g9, Map.class);
                                    if (!(h4 instanceof ParameterizedType)) {
                                        throw P.m(this.b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    ParameterizedType parameterizedType3 = (ParameterizedType) h4;
                                    Type f5 = P.f(0, parameterizedType3);
                                    if (String.class != f5) {
                                        throw P.m(this.b, i4, e.a.a.a.a.y("@FieldMap keys must be of type String: ", f5), new Object[0]);
                                    }
                                    InterfaceC0705i<T, String> o = this.a.o(P.f(1, parameterizedType3), annotationArr);
                                    this.m = true;
                                    mVar = new D.i<>(this.b, i4, o, ((InterfaceC0695f) annotation).encode());
                                } else if (annotation instanceof com.bytedance.retrofit2.R.v) {
                                    if (!this.y) {
                                        throw P.m(this.b, i4, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                    }
                                    com.bytedance.retrofit2.R.v vVar = (com.bytedance.retrofit2.R.v) annotation;
                                    this.n = true;
                                    d3 = h(type, vVar.value(), vVar.encoding());
                                    if (d3 == null) {
                                        nVar = new D.o<>(this.b, i4, vVar.value(), this.a.k(type, annotationArr, this.f5944c));
                                        d3 = nVar;
                                    }
                                } else if (annotation instanceof com.bytedance.retrofit2.R.w) {
                                    j(i4, type);
                                    if (!this.y) {
                                        throw P.m(this.b, i4, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                    }
                                    this.n = true;
                                    Class<?> g10 = P.g(type);
                                    if (!Map.class.isAssignableFrom(g10)) {
                                        throw P.m(this.b, i4, "@PartMap parameter type must be Map.", new Object[0]);
                                    }
                                    Type h5 = P.h(type, g10, Map.class);
                                    if (!(h5 instanceof ParameterizedType)) {
                                        throw P.m(this.b, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    ParameterizedType parameterizedType4 = (ParameterizedType) h5;
                                    Type f6 = P.f(0, parameterizedType4);
                                    if (String.class != f6) {
                                        throw P.m(this.b, i4, e.a.a.a.a.y("@PartMap keys must be of type String: ", f6), new Object[0]);
                                    }
                                    d3 = okhttp3.A.class.isAssignableFrom(P.g(P.f(1, parameterizedType4))) ? new D.e(((com.bytedance.retrofit2.R.w) annotation).encoding()) : null;
                                    if (d3 == null) {
                                        mVar = new D.p<>(this.b, i4, this.a.k(P.f(1, parameterizedType4), annotationArr, this.f5944c), ((com.bytedance.retrofit2.R.w) annotation).encoding());
                                    }
                                } else if (annotation instanceof InterfaceC0691b) {
                                    j(i4, type);
                                    if (this.x || this.y) {
                                        throw P.m(this.b, i4, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                    }
                                    if (this.o) {
                                        throw P.m(this.b, i4, "Multiple @Body method annotations found.", new Object[0]);
                                    }
                                    d3 = okhttp3.A.class.isAssignableFrom(P.g(type)) ? D.c.a : null;
                                    if (d3 != null) {
                                        this.o = true;
                                    } else {
                                        try {
                                            InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> k = this.a.k(type, annotationArr, this.f5944c);
                                            this.o = true;
                                            mVar = new D.b<>(this.b, i4, this.k, k);
                                        } catch (RuntimeException e2) {
                                            throw P.n(this.b, e2, i4, "Unable to create @Body converter for %s", type);
                                        }
                                    }
                                } else if (annotation instanceof com.bytedance.retrofit2.R.p) {
                                    if (this.u) {
                                        throw P.m(this.b, i4, "Multiple @Method method annotations found.", new Object[0]);
                                    }
                                    this.u = true;
                                    String value6 = ((com.bytedance.retrofit2.R.p) annotation).value();
                                    try {
                                    } catch (IllegalArgumentException e3) {
                                        if (e3.getMessage().contains("@Method parameter name must match")) {
                                            throw e3;
                                        }
                                    }
                                    if (!I.matcher(value6).matches()) {
                                        throw P.m(this.b, i4, "@Method parameter name must match %s. Found: %s", H.pattern(), value6);
                                    }
                                    String str = this.D;
                                    if (str != null && !str.equals(value6)) {
                                        throw P.m(this.b, i4, "Method \"%s\" does not contain \"{%s}\".", this.v, value6);
                                    }
                                    nVar = new D.n<>(value6, this.a.o(type, annotationArr));
                                    d3 = nVar;
                                } else if (annotation instanceof com.bytedance.retrofit2.R.o) {
                                    try {
                                        mVar = new D.m<>(this.a.o(type, annotationArr));
                                    } catch (RuntimeException e4) {
                                        throw P.n(this.b, e4, i4, "Unable to create @MaxLength converter for %s", type);
                                    }
                                } else if (annotation instanceof InterfaceC0690a) {
                                    this.j = ((InterfaceC0690a) annotation).level();
                                    try {
                                        mVar = new D.a<>(this.a.o(type, annotationArr));
                                    } catch (RuntimeException e5) {
                                        throw P.n(this.b, e5, i4, "Unable to create @AddCommonParam converter for %s", type);
                                    }
                                } else if (annotation instanceof InterfaceC0693d) {
                                    try {
                                        mVar = new D.g<>(this.a.j(type, annotationArr));
                                    } catch (RuntimeException e6) {
                                        throw P.n(this.b, e6, i4, "Unable to create @ExtraInfo converter for %s", type);
                                    }
                                } else if (annotation instanceof com.bytedance.retrofit2.R.H.a) {
                                    if (!com.bytedance.retrofit2.R.H.b.class.isAssignableFrom(P.g(type))) {
                                        throw P.m(this.b, i4, "Unable to create @QueryObject for %s not QueryParamObject type", type);
                                    }
                                    d3 = new D.u<>();
                                } else if (annotation instanceof com.bytedance.retrofit2.R.F) {
                                    j(i4, type);
                                    Class<?> g11 = P.g(type);
                                    for (int i6 = i4 - 1; i6 >= 0; i6--) {
                                        D<?> d5 = this.E[i6];
                                        if ((d5 instanceof D.w) && ((D.w) d5).a.equals(g11)) {
                                            Method method = this.b;
                                            StringBuilder M = e.a.a.a.a.M("@Tag type ");
                                            M.append(g11.getName());
                                            M.append(" is duplicate of parameter #");
                                            M.append(i6 + 1);
                                            M.append(" and would always overwrite its value.");
                                            throw P.m(method, i4, M.toString(), new Object[0]);
                                        }
                                    }
                                    mVar = new D.w<>(g11);
                                } else {
                                    d3 = null;
                                }
                                d3 = mVar;
                            }
                        }
                        if (d3 == null && E.h()) {
                            d3 = g(i4, type, annotationArr, annotation);
                        }
                        if (d3 != null) {
                            if (d2 != null) {
                                throw P.m(this.b, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                            }
                            d2 = d3;
                        }
                        i5 = i + 1;
                        length2 = i2;
                    }
                } else {
                    d2 = null;
                }
                if (d2 == null) {
                    if (z) {
                        try {
                            if (P.g(type) == kotlin.r.d.class) {
                                this.F = true;
                            }
                        } catch (NoClassDefFoundError unused) {
                        }
                    }
                    throw P.m(this.b, i4, "No Retrofit annotation found.", new Object[0]);
                }
                d4 = d2;
                dArr[i4] = d4;
                i4++;
            }
            if (this.z == null && !this.t) {
                throw P.k(this.b, "Missing either @%s URL or @Url parameter.", this.v);
            }
            boolean z2 = this.x;
            if (!z2 && !this.y && !this.w && !this.k && this.o) {
                throw P.k(this.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z2 && !this.m) {
                throw P.k(this.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.y || this.n) {
                return new G(this);
            }
            throw P.k(this.b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    G(a aVar) {
        this.b = aVar.a.d();
        this.f5939c = aVar.a.h();
        this.f5940d = aVar.a.g();
        this.n = aVar.a.m();
        this.p = aVar.v;
        this.q = aVar.z;
        this.r = aVar.w;
        this.s = aVar.x;
        this.t = aVar.y;
        this.u = aVar.E;
        this.v = aVar.A;
        this.w = aVar.B;
        this.f5941e = aVar.f5948g;
        this.f5942f = aVar.l;
        this.f5943g = aVar.h;
        boolean z = aVar.i;
        this.h = z;
        this.i = -1;
        this.j = true;
        this.k = aVar.j;
        this.l = aVar.b;
        this.m = aVar.a.b();
        this.a = aVar.F;
        RetrofitMetrics retrofitMetrics = aVar.f5947f;
        this.x = retrofitMetrics;
        retrofitMetrics.b = z;
        this.y = aVar.G;
    }

    public RetrofitMetrics a() {
        return this.x;
    }

    public void b(RetrofitMetrics retrofitMetrics) {
        this.x = retrofitMetrics;
    }

    Request c(InterfaceC0710n interfaceC0710n, Object... objArr) throws IOException {
        F f2 = new F(this.p, this.n, this.q, this.v, this.w, this.f5941e, this.f5942f, this.h, this.i, this.j, this.k, null, this.r, this.s, this.t, this.f5943g, this.y);
        D<?>[] dArr = this.u;
        int length = objArr != null ? objArr.length : 0;
        if (length != dArr.length) {
            throw new IllegalArgumentException(e.a.a.a.a.D(e.a.a.a.a.N("Argument count (", length, ") doesn't match expected count ("), dArr.length, ")"));
        }
        if (this.a) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            dArr[i].a(f2, objArr[i]);
        }
        f2.i(t.class, new t(this.l, arrayList));
        return f2.j(null);
    }
}
