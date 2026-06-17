package com.bytedance.android.input.environment.impl;

import android.app.Application;
import android.content.res.AssetManager;
import android.graphics.Movie;
import android.util.Log;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.h;
import kotlin.o;
import kotlin.r.d;
import kotlin.r.h.a.e;
import kotlin.r.h.a.i;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlin.s.c.C;
import kotlin.s.c.m;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.G;
import kotlinx.coroutines.L;
import kotlinx.coroutines.S;
import kotlinx.coroutines.r0;

@ServiceImpl
/* loaded from: classes.dex */
public final class EnvironmentImpl implements IEnvironment {
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2293c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2294d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2295e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2296f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2297g;
    private final String h;
    private final String i;
    private final String j;
    private final File k;
    private volatile FileLock l;
    private final ConcurrentHashMap<String, Movie> m = new ConcurrentHashMap<>();

    @e(c = "com.bytedance.android.input.environment.impl.EnvironmentImpl$2$1", f = "EnvironmentImpl.kt", l = {98}, m = "invokeSuspend")
    static final class a extends i implements p<G, d<? super o>, Object> {
        int a;
        final /* synthetic */ RandomAccessFile b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnvironmentImpl f2298c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2299d;

        /* renamed from: com.bytedance.android.input.environment.impl.EnvironmentImpl$a$a, reason: collision with other inner class name */
        static final class C0068a extends m implements kotlin.s.b.a<Boolean> {
            final /* synthetic */ boolean a;
            final /* synthetic */ EnvironmentImpl b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0068a(boolean z, EnvironmentImpl environmentImpl) {
                super(0);
                this.a = z;
                this.b = environmentImpl;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
            
                if (r0 == false) goto L18;
             */
            @Override // kotlin.s.b.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Boolean invoke() {
                /*
                    r8 = this;
                    boolean r0 = r8.a
                    r1 = 0
                    r2 = 1
                    if (r0 != 0) goto L47
                    com.bytedance.android.input.environment.impl.EnvironmentImpl r0 = r8.b
                    com.bytedance.android.input.basic.IAppGlobals$a r3 = com.bytedance.android.input.basic.IAppGlobals.a
                    android.app.Application r3 = r3.getApplication()
                    android.content.res.AssetManager r3 = r3.getAssets()
                    java.lang.String r4 = "IAppGlobals.application.assets"
                    kotlin.s.c.l.e(r3, r4)
                    com.bytedance.android.input.environment.impl.EnvironmentImpl r4 = r8.b
                    java.lang.String r4 = r4.a()
                    java.util.Objects.requireNonNull(r0)
                    java.lang.String r0 = "dict/sys"
                    java.lang.String[] r0 = r3.list(r0)
                    if (r0 == 0) goto L44
                    int r3 = r0.length
                    r5 = r1
                L2a:
                    if (r5 >= r3) goto L3f
                    r6 = r0[r5]
                    java.io.File r7 = new java.io.File
                    r7.<init>(r4, r6)
                    boolean r6 = r7.exists()
                    r6 = r6 ^ r2
                    if (r6 == 0) goto L3c
                    r0 = r2
                    goto L40
                L3c:
                    int r5 = r5 + 1
                    goto L2a
                L3f:
                    r0 = r1
                L40:
                    if (r0 != r2) goto L44
                    r0 = r2
                    goto L45
                L44:
                    r0 = r1
                L45:
                    if (r0 == 0) goto L48
                L47:
                    r1 = r2
                L48:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.environment.impl.EnvironmentImpl.a.C0068a.invoke():java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(RandomAccessFile randomAccessFile, EnvironmentImpl environmentImpl, int i, d<? super a> dVar) {
            super(2, dVar);
            this.b = randomAccessFile;
            this.f2298c = environmentImpl;
            this.f2299d = i;
        }

        @Override // kotlin.r.h.a.a
        public final d<o> create(Object obj, d<?> dVar) {
            return new a(this.b, this.f2298c, this.f2299d, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, d<? super o> dVar) {
            return new a(this.b, this.f2298c, this.f2299d, dVar).invokeSuspend(o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            Object J2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                r.k0(obj);
                try {
                    J2 = Boolean.valueOf(this.b.readInt() != this.f2299d);
                } catch (Throwable th) {
                    J2 = r.J(th);
                }
                Object obj2 = Boolean.TRUE;
                if (J2 instanceof h.a) {
                    J2 = obj2;
                }
                boolean booleanValue = ((Boolean) J2).booleanValue();
                EnvironmentImpl environmentImpl = this.f2298c;
                String a = environmentImpl.a();
                C0068a c0068a = new C0068a(booleanValue, this.f2298c);
                Objects.requireNonNull(environmentImpl);
                L[] lArr = {C0795d.b(C0800f0.a, S.b(), null, new com.bytedance.android.input.environment.impl.a(c0068a, a, environmentImpl, "dict", null), 2, null)};
                this.a = 1;
                if (C0795d.c(lArr, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.k0(obj);
            }
            return o.a;
        }
    }

    static final class b extends m implements l<Throwable, o> {
        final /* synthetic */ RandomAccessFile a;
        final /* synthetic */ EnvironmentImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(RandomAccessFile randomAccessFile, int i, EnvironmentImpl environmentImpl) {
            super(1);
            this.a = randomAccessFile;
            this.b = environmentImpl;
        }

        @Override // kotlin.s.b.l
        public o invoke(Throwable th) {
            RandomAccessFile randomAccessFile = this.a;
            EnvironmentImpl environmentImpl = this.b;
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(100309006);
                FileLock fileLock = environmentImpl.l;
                if (fileLock != null) {
                    fileLock.release();
                }
                environmentImpl.l = null;
                randomAccessFile.close();
            } catch (Throwable th2) {
                r.J(th2);
            }
            return o.a;
        }
    }

    public EnvironmentImpl() {
        Log.i("Environment", "Environment initialize start");
        IAppGlobals.a aVar = IAppGlobals.a;
        Application application = aVar.getApplication();
        File filesDir = application.getFilesDir();
        FileLock fileLock = null;
        File externalFilesDir = application.getExternalFilesDir(null);
        kotlin.s.c.l.e(filesDir, "internalFilesDir");
        File file = new File(filesDir, "lock");
        if (!file.exists()) {
            file.createNewFile();
        }
        this.k = file;
        String m = m(q(".dict/sys", filesDir));
        kotlin.s.c.l.e(m, ".dict/sys\".asFileDir(int…solutePathWithSeparator()");
        this.b = m;
        String m2 = m(q(".dict/user", filesDir));
        kotlin.s.c.l.e(m2, ".dict/user\".asFileDir(in…solutePathWithSeparator()");
        this.f2293c = m2;
        File file2 = externalFilesDir == null ? filesDir : externalFilesDir;
        kotlin.s.c.l.e(file2, "externalFilesDir ?: internalFilesDir");
        String m3 = m(q(".config", file2));
        kotlin.s.c.l.e(m3, ".config\".asFileDir(exter…solutePathWithSeparator()");
        this.f2294d = m3;
        if (externalFilesDir == null) {
            this.f2295e = "";
            this.j = "";
        } else {
            String m4 = m(q(".config", externalFilesDir));
            kotlin.s.c.l.e(m4, ".config\".asFileDir(exter…solutePathWithSeparator()");
            this.f2295e = m4;
            String m5 = m(q(".config/feedback", externalFilesDir));
            kotlin.s.c.l.e(m5, ".config/feedback\".asFile…solutePathWithSeparator()");
            this.j = m5;
        }
        String m6 = m(q(".config", filesDir));
        kotlin.s.c.l.e(m6, ".config\".asFileDir(inter…solutePathWithSeparator()");
        this.f2296f = m6;
        String m7 = m(q(".track", filesDir));
        kotlin.s.c.l.e(m7, ".track\".asFileDir(intern…solutePathWithSeparator()");
        this.f2297g = m7;
        File file3 = externalFilesDir == null ? filesDir : externalFilesDir;
        kotlin.s.c.l.e(file3, "externalFilesDir ?: internalFilesDir");
        String m8 = m(q(".dict", file3));
        kotlin.s.c.l.e(m8, ".dict\".asFileDir(externa…solutePathWithSeparator()");
        this.h = m8;
        externalFilesDir = externalFilesDir == null ? filesDir : externalFilesDir;
        kotlin.s.c.l.e(externalFilesDir, "externalFilesDir ?: internalFilesDir");
        kotlin.s.c.l.e(m(q(".config/log", externalFilesDir)), ".config/log\".asFileDir(e…solutePathWithSeparator()");
        String m9 = m(q(".config/feedback", filesDir));
        kotlin.s.c.l.e(m9, ".config/feedback\".asFile…solutePathWithSeparator()");
        this.i = m9;
        aVar.j("Environment", "dictSysRootPath: " + m);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileLock tryLock = randomAccessFile.getChannel().tryLock();
        if (tryLock != null) {
            ((r0) C0795d.l(C0800f0.a, S.b(), null, new a(randomAccessFile, this, 100309006, null), 2, null)).p(false, true, new b(randomAccessFile, 100309006, this));
            fileLock = tryLock;
        }
        this.l = fileLock;
        Log.i("Environment", "Environment initialize end");
    }

    private final String m(File file) {
        if (!file.isDirectory()) {
            return file.getAbsolutePath();
        }
        return file.getAbsolutePath() + File.separator;
    }

    private final File q(String str, File file) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(android.content.res.AssetManager r9, java.lang.String r10, java.io.File r11) {
        /*
            r8 = this;
            java.lang.String[] r0 = r9.list(r10)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            int r3 = r0.length
            if (r3 != 0) goto Ld
            r3 = r1
            goto Le
        Ld:
            r3 = r2
        Le:
            if (r3 == 0) goto L11
            goto L13
        L11:
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            if (r3 == 0) goto L17
            return
        L17:
            boolean r3 = r11.exists()
            if (r3 != 0) goto L20
            r11.mkdirs()
        L20:
            java.util.Iterator r0 = kotlin.s.c.C0782b.a(r0)
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r10.length()
            if (r4 <= 0) goto L38
            r4 = r1
            goto L39
        L38:
            r4 = r2
        L39:
            if (r4 == 0) goto L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r5 = 47
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            goto L51
        L50:
            r4 = r3
        L51:
            java.io.File r5 = new java.io.File
            r5.<init>(r11, r3)
            java.lang.String r3 = "assetPath"
            kotlin.s.c.l.e(r4, r3)
            java.lang.String[] r3 = r9.list(r4)     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L71
            java.lang.String r6 = "list(assetPath)"
            kotlin.s.c.l.e(r3, r6)     // Catch: java.lang.Throwable -> L77
            int r3 = r3.length     // Catch: java.lang.Throwable -> L77
            if (r3 != 0) goto L6b
            r3 = r1
            goto L6c
        L6b:
            r3 = r2
        L6c:
            r3 = r3 ^ r1
            if (r3 != r1) goto L71
            r3 = r1
            goto L72
        L71:
            r3 = r2
        L72:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L77
            goto L7c
        L77:
            r3 = move-exception
            java.lang.Object r3 = com.prolificinteractive.materialcalendarview.r.J(r3)
        L7c:
            kotlin.h.b(r3)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r3 instanceof kotlin.h.a
            if (r7 == 0) goto L86
            r3 = r6
        L86:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L92
            r8.r(r9, r4, r5)
            goto L24
        L92:
            java.io.InputStream r3 = r9.open(r4)     // Catch: java.io.IOException -> L24
            java.lang.String r4 = "open(src)"
            kotlin.s.c.l.e(r3, r4)     // Catch: java.io.IOException -> L24
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L24
            r4.<init>(r5)     // Catch: java.io.IOException -> L24
            r5 = 2
            com.prolificinteractive.materialcalendarview.r.H(r3, r4, r2, r5)     // Catch: java.io.IOException -> L24
            r3.close()     // Catch: java.io.IOException -> L24
            r4.close()     // Catch: java.io.IOException -> L24
            goto L24
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.environment.impl.EnvironmentImpl.r(android.content.res.AssetManager, java.lang.String, java.io.File):void");
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public String a() {
        return this.b;
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public String b() {
        return this.h;
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public synchronized boolean c() {
        RandomAccessFile randomAccessFile;
        Throwable th;
        if (this.k == null) {
            return false;
        }
        FileLock fileLock = this.l;
        if (fileLock != null && fileLock.isValid()) {
            return false;
        }
        try {
            randomAccessFile = new RandomAccessFile(this.k, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                FileLock tryLock = channel != null ? channel.tryLock() : null;
                if (tryLock == null) {
                    randomAccessFile.close();
                    return false;
                }
                tryLock.release();
                randomAccessFile.close();
                return true;
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public String d() {
        return this.f2295e;
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public String e() {
        return this.f2294d;
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public Movie f(String str) {
        kotlin.s.c.l.f(str, DownloadConstants.PATH_KEY);
        if (!this.m.contains(str)) {
            InputStream g2 = g(str);
            if (g2 == null) {
                Log.i("Environment", "return null " + str);
                return null;
            }
            ConcurrentHashMap<String, Movie> concurrentHashMap = this.m;
            Movie decodeStream = Movie.decodeStream(g2);
            kotlin.s.c.l.e(decodeStream, "decodeStream(istr)");
            concurrentHashMap.put(str, decodeStream);
        }
        return this.m.get(str);
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public InputStream g(String str) {
        InputStream inputStream;
        kotlin.s.c.l.f(str, DownloadConstants.PATH_KEY);
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            AssetManager assets = aVar.getApplication().getAssets();
            String str2 = kotlin.text.a.K(str, "skin/default/", false, 2, null) ? "" : "skin/default/";
            String[] strArr = {aVar.s(), aVar.t(), aVar.d()};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 3; i++) {
                String str3 = strArr[i];
                if (str3.length() > 0) {
                    arrayList.add(str3);
                }
            }
            f fVar = new f();
            fVar.addLast(null);
            while (!fVar.isEmpty()) {
                String str4 = (String) fVar.removeLast();
                if (fVar.a() >= arrayList.size()) {
                    C c2 = new C(2);
                    Object[] array = fVar.toArray(new String[0]);
                    kotlin.s.c.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    c2.b(array);
                    c2.a(str);
                    Path path = Paths.get(str2, (String[]) c2.d(new String[c2.c()]));
                    kotlin.s.c.l.e(assets, "assetManager");
                    try {
                        inputStream = assets.open(path.toString());
                    } catch (Exception unused) {
                        inputStream = null;
                    }
                    if (inputStream != null) {
                        return inputStream;
                    }
                } else if (!kotlin.s.c.l.a(str4, "")) {
                    fVar.addLast(str4 == null ? (String) arrayList.get(fVar.a()) : "");
                    fVar.addLast(null);
                }
            }
        } catch (Throwable th) {
            r.J(th);
        }
        return null;
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public String h() {
        return this.j;
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public String i() {
        return this.f2297g;
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public String j() {
        return this.i;
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public String k() {
        return this.f2296f;
    }

    @Override // com.bytedance.android.input.environment.api.IEnvironment
    public String l() {
        return this.f2293c;
    }
}
