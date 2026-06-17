package e.b.b.j;

import java.util.Objects;

/* loaded from: classes.dex */
class b extends com.bytedance.apm6.util.timetask.a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f9463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, long j, long j2) {
        super(j, j2);
        this.f9463d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f9463d);
        c.a(this.f9463d);
    }
}
