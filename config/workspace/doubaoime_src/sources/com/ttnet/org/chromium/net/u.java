package com.ttnet.org.chromium.net;

import androidx.annotation.Nullable;
import java.util.Date;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class u {

    public static abstract class a {
        private final Executor a;

        public a(Executor executor) {
            if (executor == null) {
                throw new IllegalStateException("Executor must not be null");
            }
            this.a = executor;
        }

        public Executor a() {
            return this.a;
        }

        public abstract void b(u uVar);
    }

    public static abstract class b {
        @Nullable
        public abstract Date A();

        @Nullable
        public abstract Date B();

        @Nullable
        public abstract Long C();

        public abstract boolean D();

        @Nullable
        public abstract Date E();

        @Nullable
        public abstract Date F();

        @Nullable
        public abstract Long G();

        @Nullable
        public abstract Long H();

        @Nullable
        public abstract Long a();

        public abstract long b();

        public abstract boolean c();

        @Nullable
        public abstract Date d();

        @Nullable
        public abstract Date e();

        @Nullable
        public abstract Date f();

        @Nullable
        public abstract Date g();

        public abstract long h();

        public abstract long i();

        @Nullable
        public abstract String j();

        @Nullable
        public abstract Long k();

        public abstract boolean l();

        @Nullable
        public abstract Date m();

        @Nullable
        public abstract Date n();

        public abstract long o();

        @Nullable
        public abstract Long p();

        @Nullable
        public abstract Integer q();

        @Nullable
        public abstract Date r();

        @Nullable
        public abstract String s();

        public abstract String t();

        @Nullable
        public abstract Date u();

        public abstract long v();

        @Nullable
        public abstract String w();

        @Nullable
        public abstract Date x();

        @Nullable
        public abstract Long y();

        @Nullable
        public abstract Long z();
    }

    public abstract b a();
}
