package com.bytedance.frameworks.baselib.network.i;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.retrofit2.A;
import com.bytedance.retrofit2.RetrofitMetrics;

/* loaded from: classes.dex */
public class a {
    private static volatile boolean a = false;

    /* renamed from: com.bytedance.frameworks.baselib.network.i.a$a, reason: collision with other inner class name */
    private static class C0259a implements b {
        private Reflect a;
        private final RetrofitMetrics b;

        C0259a(Reflect reflect, RetrofitMetrics retrofitMetrics) {
            this.a = reflect;
            this.b = retrofitMetrics;
        }

        @Override // com.bytedance.frameworks.baselib.network.i.a.b
        public b a(String str, Class<?>[] clsArr, Object... objArr) throws d {
            long nanoTime = System.nanoTime();
            try {
                try {
                    this.a = this.a.call(str, clsArr, objArr);
                    return this;
                } catch (Exception e2) {
                    throw new d(e2.getMessage(), e2.getCause());
                }
            } finally {
                RetrofitMetrics retrofitMetrics = this.b;
                if (retrofitMetrics != null) {
                    A.c cVar = retrofitMetrics.F0.f5887c;
                    if (cVar.f5903e == -1) {
                        cVar.f5903e = 0L;
                    }
                    cVar.f5903e = (System.nanoTime() - nanoTime) + cVar.f5903e;
                }
            }
        }

        @Override // com.bytedance.frameworks.baselib.network.i.a.b
        public b b(String str) throws d {
            long nanoTime = System.nanoTime();
            try {
                try {
                    this.a = this.a.call(str);
                    return this;
                } catch (Exception e2) {
                    throw new d(e2.getMessage(), e2.getCause());
                }
            } finally {
                RetrofitMetrics retrofitMetrics = this.b;
                if (retrofitMetrics != null) {
                    A.c cVar = retrofitMetrics.F0.f5887c;
                    if (cVar.f5903e == -1) {
                        cVar.f5903e = 0L;
                    }
                    cVar.f5903e = (System.nanoTime() - nanoTime) + cVar.f5903e;
                }
            }
        }

        @Override // com.bytedance.frameworks.baselib.network.i.a.b
        public <T> T get() {
            return (T) this.a.get();
        }
    }

    public interface b {
        b a(String str, Class<?>[] clsArr, Object... objArr) throws d;

        b b(String str) throws d;

        <T> T get();
    }

    private static class c implements b {
        private com.bytedance.frameworks.baselib.network.i.b a;
        private final RetrofitMetrics b;

        c(com.bytedance.frameworks.baselib.network.i.b bVar, RetrofitMetrics retrofitMetrics) {
            this.a = bVar;
            this.b = retrofitMetrics;
        }

        @Override // com.bytedance.frameworks.baselib.network.i.a.b
        public b a(String str, Class<?>[] clsArr, Object... objArr) throws d {
            long nanoTime = System.nanoTime();
            try {
                try {
                    this.a = this.a.c(str, clsArr, objArr);
                    return this;
                } catch (Exception e2) {
                    throw new d(e2.getMessage(), e2.getCause());
                }
            } finally {
                RetrofitMetrics retrofitMetrics = this.b;
                if (retrofitMetrics != null) {
                    A.c cVar = retrofitMetrics.F0.f5887c;
                    if (cVar.f5903e == -1) {
                        cVar.f5903e = 0L;
                    }
                    cVar.f5903e = (System.nanoTime() - nanoTime) + cVar.f5903e;
                }
            }
        }

        @Override // com.bytedance.frameworks.baselib.network.i.a.b
        public b b(String str) throws d {
            long nanoTime = System.nanoTime();
            try {
                try {
                    this.a = this.a.c(str, new Class[0], new Object[0]);
                    return this;
                } catch (Exception e2) {
                    throw new d(e2.getMessage(), e2.getCause());
                }
            } finally {
                RetrofitMetrics retrofitMetrics = this.b;
                if (retrofitMetrics != null) {
                    A.c cVar = retrofitMetrics.F0.f5887c;
                    if (cVar.f5903e == -1) {
                        cVar.f5903e = 0L;
                    }
                    cVar.f5903e = (System.nanoTime() - nanoTime) + cVar.f5903e;
                }
            }
        }

        @Override // com.bytedance.frameworks.baselib.network.i.a.b
        public <T> T get() {
            return (T) this.a.f();
        }
    }

    public static b a(Class<?> cls) throws d {
        try {
            return a ? new c(com.bytedance.frameworks.baselib.network.i.b.i(cls), null) : new C0259a(Reflect.on(cls), null);
        } catch (Exception e2) {
            try {
                throw new d(e2.getMessage(), e2.getCause());
            } catch (Exception e3) {
                throw new d(e3.getMessage(), e3.getCause());
            }
        }
    }

    public static b b(Object obj) throws d {
        try {
            return c(obj, null);
        } catch (Exception e2) {
            throw new d(e2.getMessage(), e2.getCause());
        }
    }

    public static b c(Object obj, RetrofitMetrics retrofitMetrics) throws d {
        try {
            return a ? new c(com.bytedance.frameworks.baselib.network.i.b.j(obj), retrofitMetrics) : new C0259a(Reflect.on(obj), retrofitMetrics);
        } catch (Exception e2) {
            throw new d(e2.getMessage(), e2.getCause());
        }
    }

    public static b d(String str) throws d {
        try {
            return e(str, null);
        } catch (Exception e2) {
            throw new d(e2.getMessage(), e2.getCause());
        }
    }

    public static b e(String str, RetrofitMetrics retrofitMetrics) throws d {
        try {
            return a ? new c(com.bytedance.frameworks.baselib.network.i.b.k(str), null) : new C0259a(Reflect.on(str), null);
        } catch (Exception e2) {
            throw new d(e2.getMessage(), e2.getCause());
        }
    }

    public static void f(boolean z) {
        a = z;
    }
}
