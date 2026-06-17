package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.http2.f;

/* loaded from: classes2.dex */
class g extends okhttp3.F.b {
    final /* synthetic */ k b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f.l f10664c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(f.l lVar, String str, Object[] objArr, k kVar) {
        super(str, objArr);
        this.f10664c = lVar;
        this.b = kVar;
    }

    @Override // okhttp3.F.b
    public void a() {
        try {
            f.this.b.b(this.b);
        } catch (IOException e2) {
            okhttp3.F.h.g h = okhttp3.F.h.g.h();
            StringBuilder M = e.a.a.a.a.M("Http2Connection.Listener failure for ");
            M.append(f.this.f10637d);
            h.n(4, M.toString(), e2);
            try {
                this.b.d(ErrorCode.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
