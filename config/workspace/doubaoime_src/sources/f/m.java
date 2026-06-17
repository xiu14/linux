package f;

import java.io.IOException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class m implements z {
    private int a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final g f10052c;

    /* renamed from: d, reason: collision with root package name */
    private final Inflater f10053d;

    public m(g gVar, Inflater inflater) {
        kotlin.s.c.l.g(gVar, "source");
        kotlin.s.c.l.g(inflater, "inflater");
        this.f10052c = gVar;
        this.f10053d = inflater;
    }

    private final void a() {
        int i = this.a;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f10053d.getRemaining();
        this.a -= remaining;
        this.f10052c.skip(remaining);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: DataFormatException -> 0x00b0, TryCatch #0 {DataFormatException -> 0x00b0, blocks: (B:20:0x0056, B:40:0x0070, B:22:0x007f, B:24:0x0087, B:29:0x0093, B:30:0x009a, B:33:0x009b, B:35:0x00a4), top: B:19:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070 A[SYNTHETIC] */
    @Override // f.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b0(f.e r9, long r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.b0(f.e, long):long");
    }

    @Override // f.z
    public A c() {
        return this.f10052c.c();
    }

    @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.b) {
            return;
        }
        this.f10053d.end();
        this.b = true;
        this.f10052c.close();
    }
}
