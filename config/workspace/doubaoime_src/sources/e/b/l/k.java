package e.b.l;

import com.bytedance.rpc.serialize.SerializeType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class k {
    private Method a;
    private Class b;

    /* renamed from: c, reason: collision with root package name */
    private int f9626c;

    /* renamed from: d, reason: collision with root package name */
    private int f9627d;

    /* renamed from: e, reason: collision with root package name */
    private Annotation[][] f9628e;

    /* renamed from: f, reason: collision with root package name */
    private Annotation[] f9629f;

    /* renamed from: g, reason: collision with root package name */
    private String f9630g;
    private String h;
    private boolean i;
    private boolean j;
    private String[] k;
    private SerializeType l;
    private Type m;

    k(Class cls, Method method) {
        this.f9626c = -1;
        this.a = method;
        this.b = cls;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        int length = genericParameterTypes == null ? 0 : genericParameterTypes.length;
        this.f9627d = length;
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                Type type = genericParameterTypes[i];
                if (type instanceof Class) {
                    if (e.b.l.p.a.class.isAssignableFrom((Class) genericParameterTypes[i])) {
                        this.f9626c = i;
                        this.m = type;
                        return;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    if ((rawType instanceof Class) && e.b.l.p.a.class.isAssignableFrom((Class) rawType)) {
                        this.f9626c = i;
                        this.m = type;
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private void a(Method method) {
        com.bytedance.rpc.annotation.f fVar = (com.bytedance.rpc.annotation.f) method.getAnnotation(com.bytedance.rpc.annotation.f.class);
        com.bytedance.rpc.annotation.j jVar = (com.bytedance.rpc.annotation.j) method.getAnnotation(com.bytedance.rpc.annotation.j.class);
        com.bytedance.rpc.annotation.h hVar = (com.bytedance.rpc.annotation.h) method.getAnnotation(com.bytedance.rpc.annotation.h.class);
        com.bytedance.rpc.annotation.g gVar = (com.bytedance.rpc.annotation.g) method.getAnnotation(com.bytedance.rpc.annotation.g.class);
        com.bytedance.rpc.annotation.a aVar = (com.bytedance.rpc.annotation.a) method.getAnnotation(com.bytedance.rpc.annotation.a.class);
        boolean commonParams = gVar == null ? true : gVar.commonParams();
        SerializeType serialize = gVar == null ? SerializeType.JSON : gVar.serialize();
        String[] bizParams = gVar == null ? e.b.l.q.c.a : gVar.bizParams();
        if (aVar != null) {
            bizParams = aVar.value();
        }
        this.k = bizParams;
        if (hVar != null) {
            commonParams = hVar.value();
        }
        this.j = commonParams;
        if (jVar != null) {
            serialize = jVar.value();
        }
        this.l = serialize;
        String value = fVar == null ? "" : fVar.value();
        this.h = value;
        if (e.b.l.q.c.a(value)) {
            throw new RuntimeException(String.format("%s#%s should use annotation with RpcOperation", this.b.getSimpleName(), method.getName()));
        }
        int indexOf = value.indexOf(36) + 1;
        int indexOf2 = value.indexOf(32, indexOf);
        if (indexOf < 0 || indexOf2 <= indexOf) {
            return;
        }
        this.i = "POST".equalsIgnoreCase(value.substring(indexOf, indexOf2).trim());
        this.f9630g = value.substring(indexOf2 + 1).trim();
    }

    private void b(Object[] objArr, Object[] objArr2, int i) {
        int length = objArr2.length;
        if (length > 0) {
            if (i != 0 && i != length) {
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i + 1, objArr2, i, length - i);
            } else if (i > 0) {
                System.arraycopy(objArr, 0, objArr2, 0, length);
            } else {
                System.arraycopy(objArr, 1, objArr2, 0, length);
            }
        }
    }

    public String[] c() {
        return this.k;
    }

    public Method d() {
        return this.a;
    }

    public Annotation[] e() {
        if (this.f9629f == null) {
            synchronized (this) {
                if (this.f9629f == null) {
                    a(this.a);
                    Annotation[] annotations = this.a.getAnnotations();
                    if (annotations != null && annotations.length > 0) {
                        ArrayList arrayList = new ArrayList(annotations.length);
                        for (Annotation annotation : annotations) {
                            Class<? extends Annotation> annotationType = annotation.annotationType();
                            if (annotationType != com.bytedance.rpc.annotation.f.class && annotationType != com.bytedance.rpc.annotation.g.class && annotationType != com.bytedance.rpc.annotation.h.class && annotationType != com.bytedance.rpc.annotation.a.class) {
                                arrayList.add(annotation);
                            }
                        }
                        if (arrayList.size() > 0) {
                            this.f9629f = (Annotation[]) arrayList.toArray(new Annotation[arrayList.size()]);
                        }
                    }
                    if (this.f9629f == null) {
                        this.f9629f = new Annotation[0];
                    }
                }
            }
        }
        return this.f9629f;
    }

    public String f() {
        if (this.f9629f == null) {
            e();
        }
        String str = this.h;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r0 = new java.lang.annotation.Annotation[0][];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.annotation.Annotation[][] g() {
        /*
            r4 = this;
            java.lang.annotation.Annotation[][] r0 = r4.f9628e
            if (r0 != 0) goto L32
            monitor-enter(r4)
            java.lang.annotation.Annotation[][] r0 = r4.f9628e     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L2d
            java.lang.reflect.Method r0 = r4.a     // Catch: java.lang.Throwable -> L2f
            java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()     // Catch: java.lang.Throwable -> L2f
            int r1 = r4.f9626c     // Catch: java.lang.Throwable -> L2f
            if (r1 < 0) goto L26
            if (r0 == 0) goto L26
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2f
            int r3 = r4.f9627d     // Catch: java.lang.Throwable -> L2f
            if (r2 >= r3) goto L1b
            goto L26
        L1b:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2f
            int r2 = r2 + (-1)
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]     // Catch: java.lang.Throwable -> L2f
            r4.f9628e = r2     // Catch: java.lang.Throwable -> L2f
            r4.b(r0, r2, r1)     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L26:
            if (r0 != 0) goto L2b
            r0 = 0
            java.lang.annotation.Annotation[][] r0 = new java.lang.annotation.Annotation[r0][]     // Catch: java.lang.Throwable -> L2f
        L2b:
            r4.f9628e = r0     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L32:
            java.lang.annotation.Annotation[][] r0 = r4.f9628e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.l.k.g():java.lang.annotation.Annotation[][]");
    }

    public String h() {
        if (this.f9629f == null) {
            e();
        }
        String str = this.f9630g;
        return str == null ? "" : str;
    }

    public Type i() {
        Type genericReturnType = this.a.getGenericReturnType();
        try {
            if (genericReturnType instanceof Object) {
                Type[] genericParameterTypes = this.a.getGenericParameterTypes();
                if (genericParameterTypes.length == 2 && (genericParameterTypes[1] instanceof ParameterizedType)) {
                    for (Type type : ((ParameterizedType) genericParameterTypes[1]).getActualTypeArguments()) {
                        if (type instanceof WildcardType) {
                            genericReturnType = ((WildcardType) type).getLowerBounds()[0];
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return genericReturnType;
    }

    public SerializeType j() {
        if (this.f9629f == null) {
            e();
        }
        SerializeType serializeType = this.l;
        return serializeType == null ? SerializeType.JSON : serializeType;
    }

    public Class k() {
        return this.b;
    }

    public boolean l() {
        return this.f9626c >= 0;
    }

    public boolean m() {
        if (this.f9629f == null) {
            e();
        }
        return this.j;
    }

    public boolean n() {
        if (this.f9629f == null) {
            e();
        }
        return this.i;
    }

    public m o(h hVar, Object[] objArr) {
        e.b.l.p.a aVar;
        int i = this.f9626c;
        if (i < 0 || objArr == null || objArr.length < this.f9627d) {
            aVar = null;
        } else {
            e.b.l.p.a aVar2 = (e.b.l.p.a) objArr[i];
            Object[] objArr2 = new Object[objArr.length - 1];
            b(objArr, objArr2, i);
            aVar = aVar2;
            objArr = objArr2;
        }
        if (objArr == null) {
            objArr = e.b.l.q.c.b;
        }
        return new m(hVar, this, objArr, aVar, this.m);
    }
}
