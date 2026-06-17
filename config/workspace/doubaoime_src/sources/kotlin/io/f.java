package kotlin.io;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class f implements kotlin.x.e<File> {
    private final File a;
    private final FileWalkDirection b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10106c;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            l.f(file, "rootDir");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends kotlin.collections.b<File> {

        /* renamed from: c, reason: collision with root package name */
        private final ArrayDeque<c> f10107c;

        private final class a extends a {
            private boolean b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f10109c;

            /* renamed from: d, reason: collision with root package name */
            private int f10110d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f10111e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f10112f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                l.f(file, "rootDir");
                this.f10112f = bVar;
            }

            @Override // kotlin.io.f.c
            public File b() {
                if (!this.f10111e && this.f10109c == null) {
                    kotlin.s.b.l c2 = f.c(f.this);
                    boolean z = false;
                    if (c2 != null && !((Boolean) c2.invoke(a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f10109c = listFiles;
                    if (listFiles == null) {
                        p d2 = f.d(f.this);
                        if (d2 != null) {
                            d2.invoke(a(), new kotlin.io.a(a(), null, "Cannot list files in a directory", 2));
                        }
                        this.f10111e = true;
                    }
                }
                File[] fileArr = this.f10109c;
                if (fileArr != null) {
                    int i = this.f10110d;
                    l.c(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f10109c;
                        l.c(fileArr2);
                        int i2 = this.f10110d;
                        this.f10110d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return a();
                }
                kotlin.s.b.l e2 = f.e(f.this);
                if (e2 != null) {
                    e2.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: kotlin.io.f$b$b, reason: collision with other inner class name */
        private final class C0471b extends c {
            private boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0471b(b bVar, File file) {
                super(file);
                l.f(file, "rootFile");
            }

            @Override // kotlin.io.f.c
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        private final class c extends a {
            private boolean b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f10113c;

            /* renamed from: d, reason: collision with root package name */
            private int f10114d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f10115e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                l.f(file, "rootDir");
                this.f10115e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // kotlin.io.f.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r7 = this;
                    boolean r0 = r7.b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    kotlin.io.f$b r0 = r7.f10115e
                    kotlin.io.f r0 = kotlin.io.f.this
                    kotlin.s.b.l r0 = kotlin.io.f.c(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r7.a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r7.b = r3
                    java.io.File r0 = r7.a()
                    return r0
                L2c:
                    java.io.File[] r0 = r7.f10113c
                    if (r0 == 0) goto L4b
                    int r2 = r7.f10114d
                    kotlin.s.c.l.c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    kotlin.io.f$b r0 = r7.f10115e
                    kotlin.io.f r0 = kotlin.io.f.this
                    kotlin.s.b.l r0 = kotlin.io.f.e(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r7.a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r7.f10113c
                    if (r0 != 0) goto L94
                    java.io.File r0 = r7.a()
                    java.io.File[] r0 = r0.listFiles()
                    r7.f10113c = r0
                    if (r0 != 0) goto L78
                    kotlin.io.f$b r0 = r7.f10115e
                    kotlin.io.f r0 = kotlin.io.f.this
                    kotlin.s.b.p r0 = kotlin.io.f.d(r0)
                    if (r0 == 0) goto L78
                    java.io.File r2 = r7.a()
                    kotlin.io.a r3 = new kotlin.io.a
                    java.io.File r4 = r7.a()
                    r5 = 2
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r1, r6, r5)
                    r0.invoke(r2, r3)
                L78:
                    java.io.File[] r0 = r7.f10113c
                    if (r0 == 0) goto L82
                    kotlin.s.c.l.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L94
                L82:
                    kotlin.io.f$b r0 = r7.f10115e
                    kotlin.io.f r0 = kotlin.io.f.this
                    kotlin.s.b.l r0 = kotlin.io.f.e(r0)
                    if (r0 == 0) goto L93
                    java.io.File r2 = r7.a()
                    r0.invoke(r2)
                L93:
                    return r1
                L94:
                    java.io.File[] r0 = r7.f10113c
                    kotlin.s.c.l.c(r0)
                    int r1 = r7.f10114d
                    int r2 = r1 + 1
                    r7.f10114d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.f.b.c.b():java.io.File");
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f10107c = arrayDeque;
            if (f.this.a.isDirectory()) {
                arrayDeque.push(d(f.this.a));
            } else if (f.this.a.isFile()) {
                arrayDeque.push(new C0471b(this, f.this.a));
            } else {
                b();
            }
        }

        private final a d(File file) {
            int ordinal = f.this.b.ordinal();
            if (ordinal == 0) {
                return new c(this, file);
            }
            if (ordinal == 1) {
                return new a(this, file);
            }
            throw new kotlin.f();
        }

        @Override // kotlin.collections.b
        protected void a() {
            File file;
            File b;
            while (true) {
                c peek = this.f10107c.peek();
                if (peek == null) {
                    file = null;
                    break;
                }
                b = peek.b();
                if (b == null) {
                    this.f10107c.pop();
                } else if (l.a(b, peek.a()) || !b.isDirectory() || this.f10107c.size() >= f.this.f10106c) {
                    break;
                } else {
                    this.f10107c.push(d(b));
                }
            }
            file = b;
            if (file != null) {
                c(file);
            } else {
                b();
            }
        }
    }

    private static abstract class c {
        private final File a;

        public c(File file) {
            l.f(file, "root");
            this.a = file;
        }

        public final File a() {
            return this.a;
        }

        public abstract File b();
    }

    public f(File file, FileWalkDirection fileWalkDirection) {
        l.f(file, "start");
        l.f(fileWalkDirection, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        this.a = file;
        this.b = fileWalkDirection;
        this.f10106c = Integer.MAX_VALUE;
    }

    public static final /* synthetic */ kotlin.s.b.l c(f fVar) {
        Objects.requireNonNull(fVar);
        return null;
    }

    public static final /* synthetic */ p d(f fVar) {
        Objects.requireNonNull(fVar);
        return null;
    }

    public static final /* synthetic */ kotlin.s.b.l e(f fVar) {
        Objects.requireNonNull(fVar);
        return null;
    }

    @Override // kotlin.x.e
    public Iterator<File> iterator() {
        return new b();
    }
}
