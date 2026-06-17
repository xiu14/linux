package com.bytedance.retrofit2;

import com.bytedance.retrofit2.InterfaceC0702f;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.retrofit2.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0709m extends InterfaceC0702f.a {
    final Executor a;

    /* renamed from: com.bytedance.retrofit2.m$a */
    class a implements InterfaceC0702f<Object, InterfaceC0701e<?>> {
        final /* synthetic */ Type a;
        final /* synthetic */ Executor b;

        a(C0709m c0709m, Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0702f
        public Type a() {
            return this.a;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0702f
        public InterfaceC0701e<?> b(InterfaceC0701e<Object> interfaceC0701e) {
            Executor executor = this.b;
            return executor == null ? interfaceC0701e : new b(executor, interfaceC0701e);
        }
    }

    /* renamed from: com.bytedance.retrofit2.m$b */
    static final class b<T> implements InterfaceC0701e<T>, q {
        final Executor a;
        final InterfaceC0701e<T> b;

        /* renamed from: com.bytedance.retrofit2.m$b$a */
        class a implements InterfaceC0710n<T> {
            final /* synthetic */ InterfaceC0704h a;

            /* renamed from: com.bytedance.retrofit2.m$b$a$a, reason: collision with other inner class name */
            class RunnableC0311a implements Runnable {
                final /* synthetic */ N a;

                RunnableC0311a(N n) {
                    this.a = n;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.b.isCanceled()) {
                        a aVar = a.this;
                        aVar.a.b(b.this, new IOException("Canceled"));
                    } else {
                        a aVar2 = a.this;
                        aVar2.a.a(b.this, this.a);
                    }
                }
            }

            /* renamed from: com.bytedance.retrofit2.m$b$a$b, reason: collision with other inner class name */
            class RunnableC0312b implements Runnable {
                final /* synthetic */ Throwable a;

                RunnableC0312b(Throwable th) {
                    this.a = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.a.b(b.this, this.a);
                }
            }

            a(InterfaceC0704h interfaceC0704h) {
                this.a = interfaceC0704h;
            }

            @Override // com.bytedance.retrofit2.InterfaceC0704h
            public void a(InterfaceC0701e<T> interfaceC0701e, N<T> n) {
                b.this.a.execute(new RunnableC0311a(n));
            }

            @Override // com.bytedance.retrofit2.InterfaceC0704h
            public void b(InterfaceC0701e<T> interfaceC0701e, Throwable th) {
                b.this.a.execute(new RunnableC0312b(th));
            }

            @Override // com.bytedance.retrofit2.InterfaceC0710n
            public void c(F f2) {
                InterfaceC0704h interfaceC0704h = this.a;
                if (interfaceC0704h instanceof InterfaceC0710n) {
                    ((InterfaceC0710n) interfaceC0704h).c(f2);
                }
            }

            @Override // com.bytedance.retrofit2.InterfaceC0710n
            public void d(InterfaceC0701e<T> interfaceC0701e, N<T> n) {
                InterfaceC0704h interfaceC0704h = this.a;
                if (interfaceC0704h instanceof InterfaceC0710n) {
                    ((InterfaceC0710n) interfaceC0704h).d(interfaceC0701e, n);
                }
            }
        }

        b(Executor executor, InterfaceC0701e<T> interfaceC0701e) {
            this.a = executor;
            this.b = interfaceC0701e;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0701e
        public void cancel() {
            this.b.cancel();
        }

        @Override // com.bytedance.retrofit2.InterfaceC0701e
        public InterfaceC0701e<T> clone() {
            return new b(this.a, this.b.clone());
        }

        @Override // com.bytedance.retrofit2.q
        public void doCollect() {
            InterfaceC0701e<T> interfaceC0701e = this.b;
            if (interfaceC0701e instanceof q) {
                ((q) interfaceC0701e).doCollect();
            }
        }

        @Override // com.bytedance.retrofit2.InterfaceC0701e
        public void enqueue(InterfaceC0704h<T> interfaceC0704h) {
            Objects.requireNonNull(interfaceC0704h, "callback == null");
            this.b.enqueue(new a(interfaceC0704h));
        }

        @Override // com.bytedance.retrofit2.InterfaceC0701e
        @Deprecated
        public N execute() throws Exception {
            return this.b.execute();
        }

        @Override // com.bytedance.retrofit2.InterfaceC0701e
        public boolean isCanceled() {
            return this.b.isCanceled();
        }

        @Override // com.bytedance.retrofit2.InterfaceC0701e
        public Request request() {
            return this.b.request();
        }

        /* renamed from: clone, reason: collision with other method in class */
        public Object m11clone() throws CloneNotSupportedException {
            return new b(this.a, this.b.clone());
        }
    }

    C0709m(Executor executor) {
        this.a = executor;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0702f.a
    public InterfaceC0702f<?, ?> a(Type type, Annotation[] annotationArr, H h) {
        if (P.g(type) != InterfaceC0701e.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(this, P.d(type), P.j(annotationArr, L.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
