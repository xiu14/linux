package com.bytedance.retrofit2;

import com.bytedance.retrofit2.InterfaceC0705i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0700d extends InterfaceC0705i.a {
    private boolean a = true;

    /* renamed from: com.bytedance.retrofit2.d$a */
    static final class a implements InterfaceC0705i<com.bytedance.retrofit2.mime.h, com.bytedance.retrofit2.mime.h> {
        static final a a = new a();

        a() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public com.bytedance.retrofit2.mime.h a(com.bytedance.retrofit2.mime.h hVar) throws IOException {
            com.bytedance.retrofit2.mime.h hVar2 = hVar;
            if (hVar2 == null || (hVar2 instanceof com.bytedance.retrofit2.mime.f)) {
                return hVar2;
            }
            String a2 = hVar2.a();
            InputStream d2 = hVar2.d();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (d2 != null) {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = d2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                com.bytedance.retrofit2.mime.f fVar = new com.bytedance.retrofit2.mime.f(a2, byteArrayOutputStream.toByteArray(), new String[0]);
                if (d2 != null) {
                    try {
                        d2.close();
                    } catch (IOException unused) {
                    }
                }
                return fVar;
            } catch (Throwable th) {
                if (d2 != null) {
                    try {
                        d2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.d$b */
    static final class b implements InterfaceC0705i<com.bytedance.retrofit2.client.b, com.bytedance.retrofit2.client.b> {
        static final b a = new b();

        b() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public com.bytedance.retrofit2.client.b a(com.bytedance.retrofit2.client.b bVar) throws IOException {
            return bVar;
        }
    }

    /* renamed from: com.bytedance.retrofit2.d$c */
    static final class c implements InterfaceC0705i<Object, Object> {
        static final c a = new c();

        c() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public Object a(Object obj) throws IOException {
            return obj;
        }
    }

    /* renamed from: com.bytedance.retrofit2.d$d, reason: collision with other inner class name */
    static final class C0310d implements InterfaceC0705i<com.bytedance.retrofit2.mime.i, com.bytedance.retrofit2.mime.i> {
        static final C0310d a = new C0310d();

        C0310d() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public com.bytedance.retrofit2.mime.i a(com.bytedance.retrofit2.mime.i iVar) throws IOException {
            return iVar;
        }
    }

    /* renamed from: com.bytedance.retrofit2.d$e */
    static final class e implements InterfaceC0705i<com.bytedance.retrofit2.mime.h, com.bytedance.retrofit2.mime.h> {
        static final e a = new e();

        e() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public com.bytedance.retrofit2.mime.h a(com.bytedance.retrofit2.mime.h hVar) throws IOException {
            return hVar;
        }
    }

    /* renamed from: com.bytedance.retrofit2.d$f */
    static final class f implements InterfaceC0705i<String, String> {
        static final f a = new f();

        f() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public String a(String str) throws IOException {
            return str;
        }
    }

    /* renamed from: com.bytedance.retrofit2.d$g */
    static final class g implements InterfaceC0705i<com.bytedance.retrofit2.mime.h, String> {
        static final g a = new g();

        g() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public String a(com.bytedance.retrofit2.mime.h hVar) throws IOException {
            com.bytedance.retrofit2.mime.h hVar2 = hVar;
            if (hVar2 instanceof com.bytedance.retrofit2.mime.f) {
                return new String(((com.bytedance.retrofit2.mime.f) hVar2).k(), hVar2.a() != null ? com.bytedance.retrofit2.mime.d.a(hVar2.a(), "UTF-8") : "UTF-8");
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.retrofit2.d$h */
    static final class h implements InterfaceC0705i<Object, String> {
        static final h a = new h();

        h() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public String a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* renamed from: com.bytedance.retrofit2.d$i */
    static final class i implements InterfaceC0705i<com.bytedance.retrofit2.mime.h, kotlin.o> {
        static final i a = new i();

        i() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public kotlin.o a(com.bytedance.retrofit2.mime.h hVar) throws IOException {
            try {
                hVar.d().close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return kotlin.o.a;
        }
    }

    /* renamed from: com.bytedance.retrofit2.d$j */
    static final class j implements InterfaceC0705i<com.bytedance.retrofit2.mime.h, Void> {
        static final j a = new j();

        j() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public Void a(com.bytedance.retrofit2.mime.h hVar) throws IOException {
            InputStream d2 = hVar.d();
            if (d2 == null) {
                return null;
            }
            d2.close();
            return null;
        }
    }

    C0700d() {
    }

    @Override // com.bytedance.retrofit2.InterfaceC0705i.a
    public InterfaceC0705i<?, com.bytedance.retrofit2.client.b> a(Type type, Annotation[] annotationArr, H h2) {
        if (type == com.bytedance.retrofit2.client.b.class) {
            return b.a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0705i.a
    public InterfaceC0705i<?, Object> b(Type type, Annotation[] annotationArr, H h2) {
        if (type == Object.class) {
            return c.a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0705i.a
    public InterfaceC0705i<?, com.bytedance.retrofit2.mime.i> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, H h2) {
        if (com.bytedance.retrofit2.mime.i.class.isAssignableFrom(P.g(type))) {
            return C0310d.a;
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0705i.a
    public InterfaceC0705i<com.bytedance.retrofit2.mime.h, ?> d(Type type, Annotation[] annotationArr, H h2) {
        if (type == com.bytedance.retrofit2.mime.h.class) {
            return P.j(annotationArr, com.bytedance.retrofit2.R.E.class) ? e.a : a.a;
        }
        if (type == String.class) {
            return g.a;
        }
        if (type == Void.class) {
            return j.a;
        }
        if (!this.a || type != kotlin.o.class) {
            return null;
        }
        try {
            return i.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }

    @Override // com.bytedance.retrofit2.InterfaceC0705i.a
    public InterfaceC0705i<?, String> e(Type type, Annotation[] annotationArr, H h2) {
        if (type == String.class) {
            return f.a;
        }
        return null;
    }
}
