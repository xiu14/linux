package com.facebook.cache.disk;

import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.disk.c;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f implements c {
    private final int a;
    private final e.c.c.d.j<File> b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6304c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.c.d.j<File> f6305d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6306e;

    /* renamed from: f, reason: collision with root package name */
    private final CacheErrorLogger f6307f;

    /* renamed from: g, reason: collision with root package name */
    volatile a f6308g = new a(null, null);

    static class a {
        public final c a;
        public final File b;

        a(File file, c cVar) {
            this.a = cVar;
            this.b = file;
        }
    }

    public f(int i, e.c.c.d.j<File> jVar, String str, e.c.c.d.j<File> jVar2, String str2, CacheErrorLogger cacheErrorLogger) {
        this.a = i;
        this.f6307f = cacheErrorLogger;
        this.b = jVar;
        this.f6304c = str;
        this.f6305d = jVar2;
        this.f6306e = str2;
    }

    private void m() throws IOException {
        File file = new File(this.b.get(), this.f6304c);
        File file2 = new File(this.f6305d.get(), this.f6306e);
        try {
            com.bytedance.feedbackerlib.a.m0(file);
            e.c.c.e.a.a(f.class, "Created cache directory %s", file.getAbsolutePath());
            try {
                com.bytedance.feedbackerlib.a.m0(file2);
            } catch (e.c.c.c.b unused) {
                e.c.c.e.a.g(f.class, "create config directory %s failed", file2.getAbsoluteFile());
            }
            e.c.c.e.a.a(f.class, "Created config directory %s", file2.getAbsolutePath());
            this.f6308g = new a(file, new DefaultDiskStorage(file, file2, this.a, this.f6307f));
        } catch (e.c.c.c.b e2) {
            CacheErrorLogger cacheErrorLogger = this.f6307f;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
            Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
            throw e2;
        }
    }

    @Override // com.facebook.cache.disk.c
    public void a() throws IOException {
        n().a();
    }

    @Override // com.facebook.cache.disk.c
    public long b(String str) throws IOException {
        return n().b(str);
    }

    @Override // com.facebook.cache.disk.c
    public void c() {
        try {
            n().c();
        } catch (IOException e2) {
            e.c.c.e.a.f(f.class, "purgeUnexpectedResources", e2);
        }
    }

    @Override // com.facebook.cache.disk.c
    public c.b d(String str, Object obj) throws IOException {
        return n().d(str, obj);
    }

    @Override // com.facebook.cache.disk.c
    public boolean e(String str, Object obj) throws IOException {
        return n().e(str, obj);
    }

    @Override // com.facebook.cache.disk.c
    public Collection<c.a> f() throws IOException {
        return n().f();
    }

    @Override // com.facebook.cache.disk.c
    public boolean g(String str, Object obj) throws IOException {
        return n().g(str, obj);
    }

    @Override // com.facebook.cache.disk.c
    public Map<String, String> h(String str, Object obj) throws IOException {
        return n().h(str, obj);
    }

    @Override // com.facebook.cache.disk.c
    public e.c.a.a i(String str, Object obj) throws IOException {
        return n().i(str, obj);
    }

    @Override // com.facebook.cache.disk.c
    public boolean isExternal() {
        try {
            return n().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.cache.disk.c
    public Collection<c.a> j() throws IOException {
        return n().j();
    }

    @Override // com.facebook.cache.disk.c
    public List<c.a> k() throws IOException {
        return n().k();
    }

    @Override // com.facebook.cache.disk.c
    public long l(c.a aVar) throws IOException {
        return n().l(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017 A[Catch: all -> 0x0036, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:12:0x0017, B:14:0x001d, B:16:0x0023, B:17:0x002a, B:18:0x002d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized com.facebook.cache.disk.c n() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            com.facebook.cache.disk.f$a r0 = r2.f6308g     // Catch: java.lang.Throwable -> L36
            com.facebook.cache.disk.c r1 = r0.a     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L14
            java.io.File r0 = r0.b     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L14
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L2d
            com.facebook.cache.disk.f$a r0 = r2.f6308g     // Catch: java.lang.Throwable -> L36
            com.facebook.cache.disk.c r0 = r0.a     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L2a
            com.facebook.cache.disk.f$a r0 = r2.f6308g     // Catch: java.lang.Throwable -> L36
            java.io.File r0 = r0.b     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L2a
            com.facebook.cache.disk.f$a r0 = r2.f6308g     // Catch: java.lang.Throwable -> L36
            java.io.File r0 = r0.b     // Catch: java.lang.Throwable -> L36
            com.bytedance.feedbackerlib.a.r(r0)     // Catch: java.lang.Throwable -> L36
        L2a:
            r2.m()     // Catch: java.lang.Throwable -> L36
        L2d:
            com.facebook.cache.disk.f$a r0 = r2.f6308g     // Catch: java.lang.Throwable -> L36
            com.facebook.cache.disk.c r0 = r0.a     // Catch: java.lang.Throwable -> L36
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)
            return r0
        L36:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.f.n():com.facebook.cache.disk.c");
    }

    @Override // com.facebook.cache.disk.c
    public long remove(String str) throws IOException {
        return n().remove(str);
    }
}
