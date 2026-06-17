package com.facebook.cache.disk;

import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.disk.c;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class DefaultDiskStorage implements com.facebook.cache.disk.c {
    static final long i = TimeUnit.MINUTES.toMillis(30);
    public static final /* synthetic */ int j = 0;
    private final File a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final File f6278c;

    /* renamed from: d, reason: collision with root package name */
    private final File f6279d;

    /* renamed from: e, reason: collision with root package name */
    private final File f6280e;

    /* renamed from: f, reason: collision with root package name */
    private final File f6281f;

    /* renamed from: g, reason: collision with root package name */
    private final CacheErrorLogger f6282g;
    private final com.facebook.common.time.a h;

    enum FileCategory {
        IMAGE_CACHE_FILE,
        CONFIG_FILE
    }

    private class b implements e.c.c.c.a {
        private final List<c.a> a = new ArrayList();
        private FileCategory b;

        public b(FileCategory fileCategory) {
            this.b = fileCategory;
        }

        @Override // e.c.c.c.a
        public void a(File file) {
            if (this.b == FileCategory.CONFIG_FILE) {
                e o = DefaultDiskStorage.o(DefaultDiskStorage.this, file);
                if (o == null || o.a != ".cnt") {
                    return;
                }
                this.a.add(new d(o.b, file, null));
                return;
            }
            e m = DefaultDiskStorage.m(DefaultDiskStorage.this, file);
            if (m != null) {
                String str = m.a;
                if (str == ".cnt" || str == ".tmp") {
                    this.a.add(new d(m.b, file, null));
                }
            }
        }

        @Override // e.c.c.c.a
        public void b(File file) {
        }

        @Override // e.c.c.c.a
        public void c(File file) {
        }

        public List<c.a> d() {
            return Collections.unmodifiableList(this.a);
        }
    }

    private class c implements e.c.c.c.a {
        private final List<c.a> a = new ArrayList();

        c(a aVar) {
        }

        @Override // e.c.c.c.a
        public void a(File file) {
            e m = DefaultDiskStorage.m(DefaultDiskStorage.this, file);
            if (m == null || m.a != ".cnt") {
                return;
            }
            this.a.add(new d(m.b, file, null));
        }

        @Override // e.c.c.c.a
        public void b(File file) {
        }

        @Override // e.c.c.c.a
        public void c(File file) {
        }

        public List<c.a> d() {
            return Collections.unmodifiableList(this.a);
        }
    }

    static class d implements c.a {
        private final String a;
        private final e.c.a.a b;

        /* renamed from: c, reason: collision with root package name */
        private long f6284c;

        /* renamed from: d, reason: collision with root package name */
        private long f6285d;

        d(String str, File file, a aVar) {
            Objects.requireNonNull(file);
            Objects.requireNonNull(str);
            this.a = str;
            this.b = e.c.a.a.a(file);
            this.f6284c = -1L;
            this.f6285d = -1L;
        }

        @Override // com.facebook.cache.disk.c.a
        public long a() {
            if (this.f6284c < 0) {
                this.f6284c = this.b.d();
            }
            return this.f6284c;
        }

        @Override // com.facebook.cache.disk.c.a
        public long b() {
            if (this.f6285d < 0) {
                this.f6285d = this.b.b().lastModified();
            }
            return this.f6285d;
        }

        public e.c.a.a c() {
            return this.b;
        }

        @Override // com.facebook.cache.disk.c.a
        public String getId() {
            return this.a;
        }
    }

    private static class e {
        public final String a;
        public final String b;

        private e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public static e a(File file) {
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0) {
                return null;
            }
            String substring = name.substring(lastIndexOf);
            int i = DefaultDiskStorage.j;
            String str = ".cnt".equals(substring) ? ".cnt" : ".tmp".equals(substring) ? ".tmp" : null;
            if (str == null) {
                return null;
            }
            String substring2 = name.substring(0, lastIndexOf);
            if (str.equals(".tmp")) {
                int lastIndexOf2 = substring2.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring2 = substring2.substring(0, lastIndexOf2);
            }
            return new e(str, substring2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("(");
            return e.a.a.a.a.J(sb, this.b, ")");
        }
    }

    private static class f extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public f(long r3, long r5) {
            /*
                r2 = this;
                java.lang.String r0 = "File was not written completely. Expected: "
                java.lang.String r1 = ", found: "
                java.lang.StringBuilder r3 = e.a.a.a.a.Q(r0, r3, r1)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.DefaultDiskStorage.f.<init>(long, long):void");
        }
    }

    class g implements c.b {
        private final String a;
        final File b;

        public g(String str, File file) {
            this.a = str;
            this.b = file;
        }

        public boolean a() {
            return !this.b.exists() || this.b.delete();
        }

        public e.c.a.a b(Object obj) throws IOException {
            File w = DefaultDiskStorage.this.w(this.a);
            try {
                com.bytedance.feedbackerlib.a.z0(this.b, w);
                if (w.exists()) {
                    Objects.requireNonNull((com.facebook.common.time.c) DefaultDiskStorage.this.h);
                    w.setLastModified(System.currentTimeMillis());
                }
                return e.c.a.a.a(w);
            } catch (e.c.c.c.e e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof e.c.c.c.d) {
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory2 = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory3 = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory4 = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                CacheErrorLogger cacheErrorLogger = DefaultDiskStorage.this.f6282g;
                int i = DefaultDiskStorage.j;
                Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
                throw e2;
            }
        }

        public void c(com.facebook.cache.common.i iVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.b);
                try {
                    e.c.c.d.b bVar = new e.c.c.d.b(fileOutputStream);
                    iVar.a(bVar);
                    bVar.flush();
                    long a = bVar.a();
                    fileOutputStream.close();
                    if (this.b.length() != a) {
                        throw new f(a, this.b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                CacheErrorLogger cacheErrorLogger = DefaultDiskStorage.this.f6282g;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND;
                int i = DefaultDiskStorage.j;
                Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
                throw e2;
            }
        }
    }

    private class h implements e.c.c.c.a {
        private boolean a;

        h(a aVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (r3 > (java.lang.System.currentTimeMillis() - com.facebook.cache.disk.DefaultDiskStorage.i)) goto L16;
         */
        @Override // e.c.c.c.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.io.File r10) {
            /*
                r9 = this;
                boolean r0 = r9.a
                if (r0 == 0) goto L3b
                com.facebook.cache.disk.DefaultDiskStorage r0 = com.facebook.cache.disk.DefaultDiskStorage.this
                com.facebook.cache.disk.DefaultDiskStorage$e r0 = com.facebook.cache.disk.DefaultDiskStorage.m(r0, r10)
                r1 = 0
                if (r0 != 0) goto Le
                goto L39
            Le:
                java.lang.String r0 = r0.a
                r2 = 1
                java.lang.String r3 = ".tmp"
                if (r0 != r3) goto L30
                long r3 = r10.lastModified()
                com.facebook.cache.disk.DefaultDiskStorage r0 = com.facebook.cache.disk.DefaultDiskStorage.this
                com.facebook.common.time.a r0 = com.facebook.cache.disk.DefaultDiskStorage.r(r0)
                com.facebook.common.time.c r0 = (com.facebook.common.time.c) r0
                java.util.Objects.requireNonNull(r0)
                long r5 = java.lang.System.currentTimeMillis()
                long r7 = com.facebook.cache.disk.DefaultDiskStorage.i
                long r5 = r5 - r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 <= 0) goto L39
                goto L38
            L30:
                java.lang.String r3 = ".cnt"
                if (r0 != r3) goto L35
                r1 = r2
            L35:
                e.c.c.d.h.f(r1)
            L38:
                r1 = r2
            L39:
                if (r1 != 0) goto L3e
            L3b:
                r10.delete()
            L3e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.DefaultDiskStorage.h.a(java.io.File):void");
        }

        @Override // e.c.c.c.a
        public void b(File file) {
            if (this.a || !file.equals(DefaultDiskStorage.this.f6278c)) {
                return;
            }
            this.a = true;
        }

        @Override // e.c.c.c.a
        public void c(File file) {
            if (!DefaultDiskStorage.this.a.equals(file) && !this.a) {
                file.delete();
            }
            if (this.a && file.equals(DefaultDiskStorage.this.f6278c)) {
                this.a = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DefaultDiskStorage(java.io.File r6, java.io.File r7, int r8, com.facebook.cache.common.CacheErrorLogger r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.a = r6
            r5.f6281f = r7
            r7 = 0
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L2c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L24
            java.lang.String r6 = r6.getCanonicalPath()     // Catch: java.io.IOException -> L1b java.lang.Exception -> L24
            boolean r6 = r6.contains(r0)     // Catch: java.io.IOException -> L1b java.lang.Exception -> L24
            goto L2d
        L1b:
            com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory r6 = com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory.OTHER     // Catch: java.lang.Exception -> L24
            r6 = r9
            com.facebook.cache.common.f r6 = (com.facebook.cache.common.f) r6     // Catch: java.lang.Exception -> L24
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Exception -> L24
            goto L2c
        L24:
            com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory r6 = com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory.OTHER
            r6 = r9
            com.facebook.cache.common.f r6 = (com.facebook.cache.common.f) r6
            java.util.Objects.requireNonNull(r6)
        L2c:
            r6 = r7
        L2d:
            r5.b = r6
            java.io.File r6 = new java.io.File
            java.io.File r0 = r5.a
            java.lang.String r1 = y(r8)
            r6.<init>(r0, r1)
            r5.f6278c = r6
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = y(r8)
            java.lang.String r4 = "-config"
            java.lang.String r2 = e.a.a.a.a.J(r2, r3, r4)
            r0.<init>(r1, r2)
            r5.f6280e = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.f6281f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = y(r8)
            java.lang.String r8 = e.a.a.a.a.J(r2, r8, r4)
            r0.<init>(r1, r8)
            r5.f6279d = r0
            r5.f6282g = r9
            java.io.File r8 = r5.a
            boolean r8 = r8.exists()
            r9 = 1
            if (r8 != 0) goto L76
            goto L81
        L76:
            boolean r8 = r6.exists()
            if (r8 != 0) goto L83
            java.io.File r8 = r5.a
            com.bytedance.feedbackerlib.a.r(r8)
        L81:
            r8 = r9
            goto L84
        L83:
            r8 = r7
        L84:
            java.lang.String r0 = "version directory could not be created: "
            if (r8 == 0) goto La1
            com.bytedance.feedbackerlib.a.m0(r6)     // Catch: e.c.c.c.b -> L8c
            goto La1
        L8c:
            com.facebook.cache.common.CacheErrorLogger r6 = r5.f6282g
            com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory r8 = com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR
            java.lang.StringBuilder r8 = e.a.a.a.a.M(r0)
            java.io.File r1 = r5.f6278c
            r8.append(r1)
            r8.toString()
            com.facebook.cache.common.f r6 = (com.facebook.cache.common.f) r6
            java.util.Objects.requireNonNull(r6)
        La1:
            java.io.File r6 = r5.a
            boolean r6 = r6.exists()
            if (r6 != 0) goto Laa
            goto Lb7
        Laa:
            java.io.File r6 = r5.f6278c
            boolean r6 = r6.exists()
            if (r6 != 0) goto Lb8
            java.io.File r6 = r5.a
            com.bytedance.feedbackerlib.a.r(r6)
        Lb7:
            r7 = r9
        Lb8:
            if (r7 == 0) goto Ld5
            java.io.File r6 = r5.f6278c     // Catch: e.c.c.c.b -> Lc0
            com.bytedance.feedbackerlib.a.m0(r6)     // Catch: e.c.c.c.b -> Lc0
            goto Ld5
        Lc0:
            com.facebook.cache.common.CacheErrorLogger r6 = r5.f6282g
            com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory r7 = com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR
            java.lang.StringBuilder r7 = e.a.a.a.a.M(r0)
            java.io.File r8 = r5.f6278c
            r7.append(r8)
            r7.toString()
            com.facebook.cache.common.f r6 = (com.facebook.cache.common.f) r6
            java.util.Objects.requireNonNull(r6)
        Ld5:
            com.facebook.common.time.c r6 = com.facebook.common.time.c.a()
            r5.h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.DefaultDiskStorage.<init>(java.io.File, java.io.File, int, com.facebook.cache.common.CacheErrorLogger):void");
    }

    private boolean A(String str, boolean z) {
        File w = w(str);
        boolean exists = w.exists();
        if (z && exists) {
            Objects.requireNonNull((com.facebook.common.time.c) this.h);
            w.setLastModified(System.currentTimeMillis());
        }
        return exists;
    }

    static e m(DefaultDiskStorage defaultDiskStorage, File file) {
        Objects.requireNonNull(defaultDiskStorage);
        e a2 = e.a(file);
        if (a2 == null) {
            return null;
        }
        if (!new File(defaultDiskStorage.x(a2.b)).equals(file.getParentFile())) {
            a2 = null;
        }
        return a2;
    }

    static e o(DefaultDiskStorage defaultDiskStorage, File file) {
        Objects.requireNonNull(defaultDiskStorage);
        e a2 = e.a(file);
        if (a2 == null) {
            return null;
        }
        if (!new File(defaultDiskStorage.v(a2.b)).equals(file.getParentFile())) {
            a2 = null;
        }
        return a2;
    }

    private long s(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    private Map<String, String> t(File file) {
        BufferedReader bufferedReader;
        HashMap hashMap = new HashMap();
        if (!file.exists()) {
            return hashMap;
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            int lastIndexOf = readLine.lastIndexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                            hashMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
                        } catch (IOException unused) {
                            bufferedReader2 = bufferedReader;
                            e.c.c.e.a.t(DefaultDiskStorage.class, "fileToMap: file not found");
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                            }
                            return hashMap;
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (IOException unused4) {
        }
        return hashMap;
    }

    private File u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(v(str));
        return new File(e.a.a.a.a.K(sb, File.separator, str, ".cnt"));
    }

    private String v(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6279d);
        return e.a.a.a.a.J(sb, File.separator, valueOf);
    }

    private String x(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6278c);
        return e.a.a.a.a.J(sb, File.separator, valueOf);
    }

    static String y(int i2) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i2));
    }

    private void z(String str, Object obj) throws IOException {
        Map<String, String> c2;
        if (!(obj instanceof com.facebook.cache.disk.e) || (c2 = ((com.facebook.cache.disk.e) obj).c()) == null || c2.isEmpty()) {
            return;
        }
        File file = new File(v(str));
        if (!file.exists()) {
            try {
                com.bytedance.feedbackerlib.a.m0(file);
            } catch (e.c.c.c.b e2) {
                CacheErrorLogger cacheErrorLogger = this.f6282g;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
                Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
                throw e2;
            }
        }
        File u = u(str);
        if (!u.exists()) {
            u.createNewFile();
        }
        StringBuilder sb = new StringBuilder();
        FileWriter fileWriter = new FileWriter(u, false);
        for (Map.Entry<String, String> entry : c2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(value);
            sb.append(System.lineSeparator());
        }
        fileWriter.write(sb.toString());
        fileWriter.close();
    }

    @Override // com.facebook.cache.disk.c
    public void a() {
        com.bytedance.feedbackerlib.a.q(this.a);
        com.bytedance.feedbackerlib.a.q(this.f6281f);
    }

    @Override // com.facebook.cache.disk.c
    public long b(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6280e);
        String str2 = File.separator;
        s(new File(e.a.a.a.a.u(e.a.a.a.a.J(sb, str2, valueOf), str2, str, ".cnt")));
        return s(u(str));
    }

    @Override // com.facebook.cache.disk.c
    public void c() {
        com.bytedance.feedbackerlib.a.T0(this.a, new h(null));
    }

    @Override // com.facebook.cache.disk.c
    public c.b d(String str, Object obj) throws IOException {
        File file = new File(x(str));
        if (!file.exists()) {
            try {
                com.bytedance.feedbackerlib.a.m0(file);
            } catch (e.c.c.c.b e2) {
                CacheErrorLogger cacheErrorLogger = this.f6282g;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
                Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
                throw e2;
            }
        }
        try {
            File createTempFile = File.createTempFile(str + ".", ".tmp", file);
            z(str, obj);
            return new g(str, createTempFile);
        } catch (IOException e3) {
            CacheErrorLogger cacheErrorLogger2 = this.f6282g;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory2 = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE;
            Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger2);
            throw e3;
        }
    }

    @Override // com.facebook.cache.disk.c
    public boolean e(String str, Object obj) {
        return A(str, true);
    }

    @Override // com.facebook.cache.disk.c
    public Collection f() throws IOException {
        b bVar = new b(FileCategory.CONFIG_FILE);
        com.bytedance.feedbackerlib.a.T0(this.f6279d, bVar);
        return bVar.d();
    }

    @Override // com.facebook.cache.disk.c
    public boolean g(String str, Object obj) {
        return A(str, false);
    }

    @Override // com.facebook.cache.disk.c
    public Map<String, String> h(String str, Object obj) throws IOException {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6280e);
        String str2 = File.separator;
        Map<String, String> t = t(new File(e.a.a.a.a.u(e.a.a.a.a.J(sb, str2, valueOf), str2, str, ".cnt")));
        ((HashMap) t).putAll(t(u(str)));
        return t;
    }

    @Override // com.facebook.cache.disk.c
    public e.c.a.a i(String str, Object obj) {
        File w = w(str);
        if (!w.exists()) {
            return null;
        }
        Objects.requireNonNull((com.facebook.common.time.c) this.h);
        w.setLastModified(System.currentTimeMillis());
        return e.c.a.a.a(w);
    }

    @Override // com.facebook.cache.disk.c
    public boolean isExternal() {
        return this.b;
    }

    @Override // com.facebook.cache.disk.c
    public Collection j() throws IOException {
        c cVar = new c(null);
        com.bytedance.feedbackerlib.a.T0(this.f6278c, cVar);
        return cVar.d();
    }

    @Override // com.facebook.cache.disk.c
    public List<c.a> k() throws IOException {
        b bVar = new b(FileCategory.IMAGE_CACHE_FILE);
        com.bytedance.feedbackerlib.a.T0(this.f6278c, bVar);
        return bVar.d();
    }

    @Override // com.facebook.cache.disk.c
    public long l(c.a aVar) {
        return s(((d) aVar).c().b());
    }

    @Override // com.facebook.cache.disk.c
    public long remove(String str) {
        return s(w(str));
    }

    File w(String str) {
        return new File(e.a.a.a.a.K(e.a.a.a.a.M(x(str)), File.separator, str, ".cnt"));
    }
}
