package bytekn.foundation.io.file;

/* loaded from: classes.dex */
public final class k extends e {
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private final e f1237c;

    public k(e eVar) {
        kotlin.s.c.l.g(eVar, "fileOutputStream");
        this.f1237c = eVar;
    }

    @Override // bytekn.foundation.io.file.e
    public void a() {
        this.f1237c.a();
    }

    @Override // bytekn.foundation.io.file.e
    public void b(byte[] bArr, int i, int i2) {
        kotlin.s.c.l.g(bArr, "buffer");
        this.f1237c.b(bArr, i, i2);
        this.b += i2;
    }

    @Override // bytekn.foundation.io.file.e, bytekn.foundation.io.file.h
    public void close() {
        this.f1237c.close();
    }
}
