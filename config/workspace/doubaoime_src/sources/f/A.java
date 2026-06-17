package f;

import com.bytedance.crash.dumper.Scraps;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class A {

    /* renamed from: d, reason: collision with root package name */
    public static final A f10033d = new a();
    private boolean a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f10034c;

    public static final class a extends A {
        a() {
        }

        @Override // f.A
        public A d(long j) {
            return this;
        }

        @Override // f.A
        public void f() {
        }

        @Override // f.A
        public A g(long j, TimeUnit timeUnit) {
            kotlin.s.c.l.g(timeUnit, Scraps.INNER_UNIT);
            return this;
        }
    }

    public A a() {
        this.a = false;
        return this;
    }

    public A b() {
        this.f10034c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public A d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public A g(long j, TimeUnit timeUnit) {
        kotlin.s.c.l.g(timeUnit, Scraps.INNER_UNIT);
        if (!(j >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.n("timeout < 0: ", j).toString());
        }
        this.f10034c = timeUnit.toNanos(j);
        return this;
    }

    public long h() {
        return this.f10034c;
    }
}
