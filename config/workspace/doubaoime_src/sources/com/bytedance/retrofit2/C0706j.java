package com.bytedance.retrofit2;

import com.bytedance.retrofit2.InterfaceC0702f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0706j extends InterfaceC0702f.a {
    static final InterfaceC0702f.a a = new C0706j();

    /* renamed from: com.bytedance.retrofit2.j$a */
    class a implements InterfaceC0702f<Object, InterfaceC0701e<?>> {
        final /* synthetic */ Type a;

        a(C0706j c0706j, Type type) {
            this.a = type;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0702f
        public Type a() {
            return this.a;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0702f
        public InterfaceC0701e<?> b(InterfaceC0701e<Object> interfaceC0701e) {
            return interfaceC0701e;
        }
    }

    C0706j() {
    }

    @Override // com.bytedance.retrofit2.InterfaceC0702f.a
    public InterfaceC0702f<?, ?> a(Type type, Annotation[] annotationArr, H h) {
        if (P.g(type) != InterfaceC0701e.class) {
            return null;
        }
        return new a(this, P.d(type));
    }
}
