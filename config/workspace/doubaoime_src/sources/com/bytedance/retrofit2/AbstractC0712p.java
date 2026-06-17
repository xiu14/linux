package com.bytedance.retrofit2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.retrofit2.P;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0814l;

/* renamed from: com.bytedance.retrofit2.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0712p<ResponseT, ReturnT> extends K<ReturnT> {
    final G<ReturnT> a;

    /* renamed from: com.bytedance.retrofit2.p$a */
    static final class a<ResponseT, ReturnT> extends AbstractC0712p<ResponseT, ReturnT> {
        private final InterfaceC0702f<ResponseT, ReturnT> b;

        a(G g2, InterfaceC0702f<ResponseT, ReturnT> interfaceC0702f) {
            super(g2);
            this.b = interfaceC0702f;
        }

        @Override // com.bytedance.retrofit2.AbstractC0712p
        protected ReturnT c(InterfaceC0701e<ResponseT> interfaceC0701e, Object[] objArr) {
            return this.b.b(interfaceC0701e);
        }
    }

    /* renamed from: com.bytedance.retrofit2.p$b */
    static final class b<ResponseT> extends AbstractC0712p<ResponseT, Object> {
        private final InterfaceC0702f<ResponseT, InterfaceC0701e<ResponseT>> b;

        b(G g2, InterfaceC0702f<ResponseT, InterfaceC0701e<ResponseT>> interfaceC0702f, boolean z) {
            super(g2);
            this.b = interfaceC0702f;
        }

        @Override // com.bytedance.retrofit2.AbstractC0712p
        protected Object c(InterfaceC0701e<ResponseT> interfaceC0701e, Object[] objArr) {
            InterfaceC0701e<ResponseT> b = this.b.b(interfaceC0701e);
            kotlin.r.d dVar = (kotlin.r.d) objArr[objArr.length - 1];
            try {
                C0814l c0814l = new C0814l(kotlin.coroutines.intrinsics.a.d(dVar), 1);
                c0814l.v();
                c0814l.f(new u(b));
                b.enqueue(new v(c0814l));
                Object u = c0814l.u();
                if (u == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
                }
                return u;
            } catch (Exception e2) {
                return C0708l.a(e2, dVar);
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.p$c */
    static final class c<ResponseT> extends AbstractC0712p<ResponseT, Object> {
        private final InterfaceC0702f<ResponseT, InterfaceC0701e<ResponseT>> b;

        c(G g2, InterfaceC0702f<ResponseT, InterfaceC0701e<ResponseT>> interfaceC0702f) {
            super(g2);
            this.b = interfaceC0702f;
        }

        @Override // com.bytedance.retrofit2.AbstractC0712p
        protected Object c(InterfaceC0701e<ResponseT> interfaceC0701e, Object[] objArr) {
            InterfaceC0701e<ResponseT> b = this.b.b(interfaceC0701e);
            kotlin.r.d dVar = (kotlin.r.d) objArr[objArr.length - 1];
            try {
                C0814l c0814l = new C0814l(kotlin.coroutines.intrinsics.a.d(dVar), 1);
                c0814l.v();
                c0814l.f(new w(b));
                b.enqueue(new x(c0814l));
                Object u = c0814l.u();
                if (u == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
                }
                return u;
            } catch (Exception e2) {
                return C0708l.a(e2, dVar);
            }
        }
    }

    AbstractC0712p(G<ReturnT> g2) {
        this.a = g2;
    }

    static <ResponseT, ReturnT> AbstractC0712p<ResponseT, ReturnT> d(H h, Method method, G g2) {
        Type genericReturnType;
        boolean z;
        boolean z2 = g2.a;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type type = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getLowerBounds()[0];
            }
            if (P.g(type) == N.class && (type instanceof ParameterizedType)) {
                type = P.f(0, (ParameterizedType) type);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new P.c(null, InterfaceC0701e.class, type);
            annotations = M.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        try {
            InterfaceC0702f<?, ?> c2 = h.c(genericReturnType, annotations);
            Type a2 = c2.a();
            if (a2 == okhttp3.B.class) {
                StringBuilder M = e.a.a.a.a.M("'");
                M.append(P.g(a2).getName());
                M.append("' is not a valid response body type. Did you mean ResponseBody?");
                throw P.k(method, M.toString(), new Object[0]);
            }
            if (a2 == N.class) {
                throw P.k(method, "Response must include generic type (e.g., SsResponse<String>)", new Object[0]);
            }
            if (a2 == com.bytedance.retrofit2.client.c.class) {
                StringBuilder M2 = e.a.a.a.a.M("'");
                M2.append(P.g(a2).getName());
                M2.append("' is not a valid response body type.");
                throw P.k(method, M2.toString(), new Object[0]);
            }
            if (g2.p.equals("HEAD") && !Void.class.equals(a2)) {
                throw P.k(method, "HEAD method must use Void as response type.", new Object[0]);
            }
            try {
                g2.o = h.l(a2, method.getAnnotations());
                return !z2 ? new a(g2, c2) : z ? new c(g2, c2) : new b(g2, c2, false);
            } catch (RuntimeException e2) {
                throw P.l(method, e2, "Unable to create converter for %s", a2);
            }
        } catch (RuntimeException e3) {
            throw P.l(method, e3, "Unable to create call adapter for %s", genericReturnType);
        }
    }

    @Override // com.bytedance.retrofit2.K
    final ReturnT a(Object[] objArr) {
        return c(new SsHttpCall(this.a, objArr), objArr);
    }

    protected abstract ReturnT c(InterfaceC0701e<ResponseT> interfaceC0701e, Object[] objArr);
}
