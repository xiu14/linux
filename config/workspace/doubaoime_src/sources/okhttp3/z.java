package okhttp3;

import java.io.IOException;

/* loaded from: classes2.dex */
final class z extends A {
    final /* synthetic */ v a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ byte[] f10746c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f10747d;

    z(v vVar, int i, byte[] bArr, int i2) {
        this.a = vVar;
        this.b = i;
        this.f10746c = bArr;
        this.f10747d = i2;
    }

    @Override // okhttp3.A
    public long a() {
        return this.b;
    }

    @Override // okhttp3.A
    public v b() {
        return this.a;
    }

    @Override // okhttp3.A
    public void e(f.f fVar) throws IOException {
        fVar.write(this.f10746c, this.f10747d, this.b);
    }
}
