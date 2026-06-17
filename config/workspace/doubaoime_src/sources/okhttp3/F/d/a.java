package okhttp3.F.d;

import f.A;
import f.f;
import f.g;
import f.z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class a implements z {
    boolean a;
    final /* synthetic */ g b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f10503c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ f f10504d;

    a(b bVar, g gVar, c cVar, f fVar) {
        this.b = gVar;
        this.f10503c = cVar;
        this.f10504d = fVar;
    }

    @Override // f.z
    public long b0(f.e eVar, long j) throws IOException {
        try {
            long b0 = this.b.b0(eVar, j);
            if (b0 != -1) {
                eVar.h(this.f10504d.b(), eVar.I() - b0, b0);
                this.f10504d.C();
                return b0;
            }
            if (!this.a) {
                this.a = true;
                this.f10504d.close();
            }
            return -1L;
        } catch (IOException e2) {
            if (!this.a) {
                this.a = true;
                this.f10503c.a();
            }
            throw e2;
        }
    }

    @Override // f.z
    public A c() {
        return this.b.c();
    }

    @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.a && !okhttp3.F.c.m(this, 100, TimeUnit.MILLISECONDS)) {
            this.a = true;
            this.f10503c.a();
        }
        this.b.close();
    }
}
