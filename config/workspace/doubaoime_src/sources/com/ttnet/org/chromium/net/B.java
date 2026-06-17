package com.ttnet.org.chromium.net;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class B {

    public static abstract class a {
        public abstract B a();

        public abstract a b(int i);

        public abstract a c(String str);

        public abstract a d(int i);

        public abstract a e(Map<String, String> map);

        public abstract a f(Map<String, String> map);

        public abstract a g(long j);

        public abstract a h(int i);

        public abstract a i(long j);

        public abstract a j(String str);

        public abstract a k(boolean z);

        public abstract a l(List<String> list);

        public abstract a m(boolean z);
    }

    public static abstract class b {
        public abstract void a(B b, int i, String str, String str2);

        public abstract void b(B b, int i, String str);

        public void c(B b, String str) {
        }

        public abstract void d(B b, ByteBuffer byteBuffer, int i) throws Exception;

        public abstract void e(B b, String str, long j, long j2, boolean z);
    }

    public abstract void a(ByteBuffer byteBuffer);

    public abstract void b(String str);

    public abstract void c();

    public abstract boolean d();

    public abstract void e();

    public abstract void f();
}
