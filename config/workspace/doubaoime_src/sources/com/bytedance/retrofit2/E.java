package com.bytedance.retrofit2;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.retrofit2.InterfaceC0702f;
import com.bytedance.retrofit2.InterfaceC0705i;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
class E {
    private static final E a;
    private static final boolean b;

    static class a extends E {

        /* renamed from: com.bytedance.retrofit2.E$a$a, reason: collision with other inner class name */
        static class ExecutorC0307a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            ExecutorC0307a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        a() {
        }

        @Override // com.bytedance.retrofit2.E
        List<? extends InterfaceC0702f.a> a(Executor executor) {
            if (executor != null) {
                return Collections.singletonList(new C0709m(executor));
            }
            throw new AssertionError();
        }

        @Override // com.bytedance.retrofit2.E
        public Executor b() {
            return new ExecutorC0307a();
        }

        @Override // com.bytedance.retrofit2.E
        List<? extends InterfaceC0705i.a> c() {
            return Collections.emptyList();
        }

        @Override // com.bytedance.retrofit2.E
        int d() {
            return 0;
        }

        @Override // com.bytedance.retrofit2.E
        boolean g(Method method) {
            return method.isDefault();
        }
    }

    static {
        E e2;
        try {
            Class.forName("android.os.Build");
            e2 = new a();
        } catch (ClassNotFoundException unused) {
            e2 = new E();
        }
        a = e2;
        b = e();
    }

    E() {
    }

    private static boolean e() {
        try {
            new Retrofit.Builder();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static E f() {
        return a;
    }

    static boolean h() {
        return b;
    }

    List<? extends InterfaceC0702f.a> a(Executor executor) {
        return executor != null ? Collections.singletonList(new C0709m(executor)) : Collections.singletonList(C0706j.a);
    }

    public Executor b() {
        return null;
    }

    List<? extends InterfaceC0705i.a> c() {
        return Collections.emptyList();
    }

    int d() {
        return 0;
    }

    boolean g(Method method) {
        return false;
    }
}
