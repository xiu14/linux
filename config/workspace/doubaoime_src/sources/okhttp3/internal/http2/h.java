package okhttp3.internal.http2;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import okhttp3.internal.http2.f;

/* loaded from: classes2.dex */
class h extends okhttp3.F.b {
    final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f10665c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ f.l f10666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(f.l lVar, String str, Object[] objArr, boolean z, o oVar) {
        super(str, objArr);
        this.f10666d = lVar;
        this.b = z;
        this.f10665c = oVar;
    }

    @Override // okhttp3.F.b
    public void a() {
        k[] kVarArr;
        long j;
        ExecutorService executorService;
        f.l lVar = this.f10666d;
        boolean z = this.b;
        o oVar = this.f10665c;
        synchronized (f.this.v) {
            synchronized (f.this) {
                int d2 = f.this.t.d();
                if (z) {
                    f.this.t.a();
                }
                f.this.t.h(oVar);
                int d3 = f.this.t.d();
                kVarArr = null;
                if (d3 == -1 || d3 == d2) {
                    j = 0;
                } else {
                    j = d3 - d2;
                    if (!f.this.f10636c.isEmpty()) {
                        kVarArr = (k[]) f.this.f10636c.values().toArray(new k[f.this.f10636c.size()]);
                    }
                }
            }
            try {
                f fVar = f.this;
                fVar.v.a(fVar.t);
            } catch (IOException unused) {
                f.a(f.this);
            }
        }
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                synchronized (kVar) {
                    kVar.b += j;
                    if (j > 0) {
                        kVar.notifyAll();
                    }
                }
            }
        }
        executorService = f.y;
        executorService.execute(new i(lVar, "OkHttp %s settings", f.this.f10637d));
    }
}
