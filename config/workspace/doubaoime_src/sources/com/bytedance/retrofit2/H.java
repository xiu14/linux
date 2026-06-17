package com.bytedance.retrofit2;

import com.bytedance.retrofit2.C0700d;
import com.bytedance.retrofit2.C0708l;
import com.bytedance.retrofit2.InterfaceC0702f;
import com.bytedance.retrofit2.InterfaceC0705i;
import com.bytedance.retrofit2.client.a;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class H {
    private static volatile CopyOnWriteArrayList<com.bytedance.retrofit2.S.a> l;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0309a f5949c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0707k f5950d;

    /* renamed from: e, reason: collision with root package name */
    private final List<InterfaceC0705i.a> f5951e;

    /* renamed from: f, reason: collision with root package name */
    private final List<InterfaceC0702f.a> f5952f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f5953g;
    private final boolean h;
    private final Executor i;
    private final List<com.bytedance.retrofit2.S.a> j;
    private final Map<Method, K<?>> a = new ConcurrentHashMap();
    private final ConcurrentHashMap<Method, Object> b = new ConcurrentHashMap<>();
    private final com.bytedance.retrofit2.Q.a k = null;

    class a implements InvocationHandler {
        private final E a = E.f();
        private final Object[] b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f5954c;

        a(Class cls) {
            this.f5954c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.a.g(method)) {
                Objects.requireNonNull(this.a);
                throw new UnsupportedOperationException();
            }
            K<?> i = H.this.i(method);
            if (objArr == null) {
                objArr = this.b;
            }
            return i.a(objArr);
        }
    }

    public static final class b {
        private final E a;
        private a.InterfaceC0309a b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC0707k f5956c;

        /* renamed from: d, reason: collision with root package name */
        private final List<com.bytedance.retrofit2.S.a> f5957d;

        /* renamed from: e, reason: collision with root package name */
        private final List<InterfaceC0705i.a> f5958e;

        /* renamed from: f, reason: collision with root package name */
        private final List<InterfaceC0702f.a> f5959f;

        /* renamed from: g, reason: collision with root package name */
        private Executor f5960g;

        public b() {
            E f2 = E.f();
            this.f5957d = new CopyOnWriteArrayList();
            this.f5958e = new ArrayList();
            this.f5959f = new ArrayList();
            this.a = f2;
        }

        public b a(InterfaceC0702f.a aVar) {
            List<InterfaceC0702f.a> list = this.f5959f;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(InterfaceC0705i.a aVar) {
            List<InterfaceC0705i.a> list = this.f5958e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(com.bytedance.retrofit2.S.a aVar) {
            Objects.requireNonNull(aVar, "interceptor == null");
            this.f5957d.add(aVar);
            return this;
        }

        public H d() {
            if (this.f5956c == null) {
                throw new IllegalStateException("Endpoint may not be null.");
            }
            if (this.b == null) {
                throw new IllegalStateException("ClientProvider may not be null.");
            }
            if (this.f5960g == null) {
                throw new IllegalStateException("HttpExecutor may not be null.");
            }
            Executor b = this.a.b();
            ArrayList arrayList = new ArrayList(this.f5959f);
            arrayList.addAll(this.a.a(b));
            ArrayList arrayList2 = new ArrayList(this.f5958e.size() + 1 + this.a.d());
            arrayList2.add(new C0700d());
            arrayList2.addAll(this.f5958e);
            arrayList2.addAll(this.a.c());
            if (H.l != null) {
                Iterator it2 = H.l.iterator();
                while (it2.hasNext()) {
                    com.bytedance.retrofit2.S.a aVar = (com.bytedance.retrofit2.S.a) it2.next();
                    if (!this.f5957d.contains(aVar)) {
                        this.f5957d.add(aVar);
                    }
                }
            }
            return new H(this.f5956c, this.b, this.f5957d, arrayList2, arrayList, this.f5960g, b, false, null);
        }

        public b e(a.InterfaceC0309a interfaceC0309a) {
            this.b = interfaceC0309a;
            return this;
        }

        public b f(Executor executor) {
            this.f5960g = executor;
            return this;
        }

        public b g(String str) {
            if (str == null || str.trim().length() == 0) {
                throw new NullPointerException("Endpoint may not be blank.");
            }
            this.f5956c = new C0708l.a(str, DownloadSettingKeys.BugFix.DEFAULT);
            return this;
        }
    }

    H(InterfaceC0707k interfaceC0707k, a.InterfaceC0309a interfaceC0309a, List<com.bytedance.retrofit2.S.a> list, List<InterfaceC0705i.a> list2, List<InterfaceC0702f.a> list3, Executor executor, Executor executor2, boolean z, com.bytedance.retrofit2.Q.a aVar) {
        this.f5950d = interfaceC0707k;
        this.f5949c = interfaceC0309a;
        this.j = list;
        this.f5951e = Collections.unmodifiableList(list2);
        this.f5952f = Collections.unmodifiableList(list3);
        this.i = executor;
        this.f5953g = executor2;
        this.h = z;
    }

    public static void n(CopyOnWriteArrayList<com.bytedance.retrofit2.S.a> copyOnWriteArrayList) {
        l = copyOnWriteArrayList;
    }

    public com.bytedance.retrofit2.Q.a b() {
        return this.k;
    }

    public InterfaceC0702f<?, ?> c(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f5952f.indexOf(null) + 1;
        int size = this.f5952f.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC0702f<?, ?> a2 = this.f5952f.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f5952f.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f5952f.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public a.InterfaceC0309a d() {
        return this.f5949c;
    }

    public <T> T e(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
        if (this.h) {
            E f2 = E.f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!f2.g(method) && !Modifier.isStatic(method.getModifiers())) {
                    i(method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public <T> InterfaceC0705i<T, com.bytedance.retrofit2.client.b> f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f5951e.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0705i<T, com.bytedance.retrofit2.client.b> interfaceC0705i = (InterfaceC0705i<T, com.bytedance.retrofit2.client.b>) this.f5951e.get(i).a(type, annotationArr, this);
            if (interfaceC0705i != null) {
                return interfaceC0705i;
            }
        }
        throw new IllegalArgumentException("Could not locate header converter");
    }

    public Executor g() {
        return this.i;
    }

    public List<com.bytedance.retrofit2.S.a> h() {
        return this.j;
    }

    K<?> i(Method method) {
        K<?> k;
        K<?> k2 = this.a.get(method);
        if (k2 != null) {
            if (k2 instanceof AbstractC0712p) {
                RetrofitMetrics retrofitMetrics = new RetrofitMetrics();
                retrofitMetrics.h(true);
                ((AbstractC0712p) k2).a.b(retrofitMetrics);
            }
            return k2;
        }
        synchronized (this.a) {
            k = this.a.get(method);
            if (k == null) {
                RetrofitMetrics retrofitMetrics2 = new RetrofitMetrics();
                retrofitMetrics2.h(false);
                k = K.b(this, method, retrofitMetrics2);
                this.a.put(method, k);
            }
        }
        return k;
    }

    public <T> InterfaceC0705i<T, Object> j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f5951e.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0705i<T, Object> interfaceC0705i = (InterfaceC0705i<T, Object>) this.f5951e.get(i).b(type, annotationArr, this);
            if (interfaceC0705i != null) {
                return interfaceC0705i;
            }
        }
        throw new IllegalArgumentException("Could not locate object converter");
    }

    public <T> InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> k(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f5951e.indexOf(null) + 1;
        int size = this.f5951e.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC0705i<T, com.bytedance.retrofit2.mime.i> interfaceC0705i = (InterfaceC0705i<T, com.bytedance.retrofit2.mime.i>) this.f5951e.get(i).c(type, annotationArr, annotationArr2, this);
            if (interfaceC0705i != null) {
                return interfaceC0705i;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f5951e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f5951e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> InterfaceC0705i<com.bytedance.retrofit2.mime.h, T> l(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f5951e.indexOf(null) + 1;
        int size = this.f5951e.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC0705i<com.bytedance.retrofit2.mime.h, T> interfaceC0705i = (InterfaceC0705i<com.bytedance.retrofit2.mime.h, T>) this.f5951e.get(i).d(type, annotationArr, this);
            if (interfaceC0705i != null) {
                return interfaceC0705i;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate TypedInput converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f5951e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f5951e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public InterfaceC0707k m() {
        return this.f5950d;
    }

    public <T> InterfaceC0705i<T, String> o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f5951e.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0705i<T, String> interfaceC0705i = (InterfaceC0705i<T, String>) this.f5951e.get(i).e(type, annotationArr, this);
            if (interfaceC0705i != null) {
                return interfaceC0705i;
            }
        }
        return C0700d.h.a;
    }
}
