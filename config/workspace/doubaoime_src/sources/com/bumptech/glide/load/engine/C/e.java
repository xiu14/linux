package com.bumptech.glide.load.engine.C;

import android.util.Log;
import com.bumptech.glide.load.engine.C.a;
import com.bumptech.glide.m.a;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class e implements a {
    private final File b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1605c;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.m.a f1607e;

    /* renamed from: d, reason: collision with root package name */
    private final c f1606d = new c();
    private final k a = new k();

    @Deprecated
    protected e(File file, long j) {
        this.b = file;
        this.f1605c = j;
    }

    private synchronized com.bumptech.glide.m.a c() throws IOException {
        if (this.f1607e == null) {
            this.f1607e = com.bumptech.glide.m.a.I(this.b, 1, 1, this.f1605c);
        }
        return this.f1607e;
    }

    @Override // com.bumptech.glide.load.engine.C.a
    public void a(com.bumptech.glide.load.d dVar, a.b bVar) {
        String a = this.a.a(dVar);
        this.f1606d.a(a);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a + " for for Key: " + dVar);
            }
            try {
                com.bumptech.glide.m.a c2 = c();
                if (c2.G(a) == null) {
                    a.c A = c2.A(a);
                    if (A == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + a);
                    }
                    try {
                        if (bVar.a(A.f(0))) {
                            A.e();
                        }
                        A.b();
                    } catch (Throwable th) {
                        A.b();
                        throw th;
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } finally {
            this.f1606d.b(a);
        }
    }

    @Override // com.bumptech.glide.load.engine.C.a
    public File b(com.bumptech.glide.load.d dVar) {
        String a = this.a.a(dVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a + " for for Key: " + dVar);
        }
        try {
            a.e G = c().G(a);
            if (G != null) {
                return G.a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }
}
