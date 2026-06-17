package f;

import com.bytedance.crash.dumper.Scraps;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class k extends A {

    /* renamed from: e, reason: collision with root package name */
    private A f10048e;

    public k(A a) {
        kotlin.s.c.l.g(a, "delegate");
        this.f10048e = a;
    }

    @Override // f.A
    public A a() {
        return this.f10048e.a();
    }

    @Override // f.A
    public A b() {
        return this.f10048e.b();
    }

    @Override // f.A
    public long c() {
        return this.f10048e.c();
    }

    @Override // f.A
    public A d(long j) {
        return this.f10048e.d(j);
    }

    @Override // f.A
    public boolean e() {
        return this.f10048e.e();
    }

    @Override // f.A
    public void f() throws IOException {
        this.f10048e.f();
    }

    @Override // f.A
    public A g(long j, TimeUnit timeUnit) {
        kotlin.s.c.l.g(timeUnit, Scraps.INNER_UNIT);
        return this.f10048e.g(j, timeUnit);
    }

    @Override // f.A
    public long h() {
        return this.f10048e.h();
    }

    public final A i() {
        return this.f10048e;
    }

    public final k j(A a) {
        kotlin.s.c.l.g(a, "delegate");
        this.f10048e = a;
        return this;
    }
}
