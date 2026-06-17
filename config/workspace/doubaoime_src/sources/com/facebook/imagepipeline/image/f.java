package com.facebook.imagepipeline.image;

import android.graphics.ColorSpace;
import android.graphics.Rect;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f implements Closeable {
    private final e.c.c.g.a<com.facebook.common.memory.g> a;
    private final e.c.c.d.j<FileInputStream> b;

    /* renamed from: c, reason: collision with root package name */
    private e.c.g.d f6475c;

    /* renamed from: d, reason: collision with root package name */
    private int f6476d;

    /* renamed from: e, reason: collision with root package name */
    private int f6477e;

    /* renamed from: f, reason: collision with root package name */
    private int f6478f;

    /* renamed from: g, reason: collision with root package name */
    private int f6479g;
    private int h;
    private int i;
    private com.facebook.imagepipeline.common.a j;
    private ColorSpace k;
    private boolean l;
    private int m;
    private Rect n;
    private Map<String, String> o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;

    public static class a implements com.facebook.common.memory.g, e.c.c.g.d<a>, j {
        public final e.c.c.g.a<com.facebook.common.memory.g> a;
        private Map<String, String> b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6480c;

        public a(e.c.c.g.a<com.facebook.common.memory.g> aVar) {
            this.a = aVar;
        }

        @Override // com.facebook.imagepipeline.image.j
        public void a() {
            this.f6480c = true;
        }

        @Override // com.facebook.common.memory.g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.r().close();
        }

        @Override // com.facebook.common.memory.g
        public byte e(int i) {
            return this.a.r().e(i);
        }

        @Override // com.facebook.common.memory.g
        public int f(int i, byte[] bArr, int i2, int i3) {
            return this.a.r().f(i, bArr, i2, i3);
        }

        @Override // com.facebook.common.memory.g
        public ByteBuffer g() {
            return this.a.r().g();
        }

        public Map<String, String> h() {
            return this.b;
        }

        @Override // com.facebook.common.memory.g
        public long i() {
            return this.a.r().i();
        }

        @Override // com.facebook.common.memory.g
        public boolean isClosed() {
            return this.a.r().isClosed();
        }

        public void l(Map<String, String> map) {
            this.b = map;
        }

        public void o(boolean z) {
            this.f6480c = z;
        }

        @Override // e.c.c.g.d
        public void release(a aVar) {
            aVar.a.close();
        }

        @Override // com.facebook.common.memory.g
        public int size() {
            return this.a.r().size();
        }
    }

    public f(e.c.c.g.a<com.facebook.common.memory.g> aVar) {
        this.f6475c = e.c.g.d.b;
        this.f6476d = -1;
        this.f6477e = 0;
        this.f6478f = -1;
        this.f6479g = -1;
        this.h = 1;
        this.i = -1;
        this.l = true;
        this.m = 0;
        this.p = false;
        this.q = false;
        this.r = false;
        e.c.c.d.h.a(e.c.c.g.a.x(aVar));
        com.facebook.common.memory.g r = aVar.r();
        if (r instanceof a) {
            this.a = aVar.clone();
            a aVar2 = (a) r;
            this.o = aVar2.h();
            if (aVar2.f6480c) {
                this.r = true;
                this.q = false;
                this.p = false;
                aVar2.o(false);
            }
        } else {
            this.a = e.c.c.g.a.z(new a(aVar.clone()));
        }
        this.b = null;
    }

    public static boolean Y(f fVar) {
        return fVar.f6476d >= 0 && fVar.f6478f >= 0 && fVar.f6479g >= 0;
    }

    public static f a(f fVar) {
        f fVar2 = null;
        if (fVar != null) {
            e.c.c.d.j<FileInputStream> jVar = fVar.b;
            if (jVar != null) {
                fVar2 = new f(jVar, fVar.i);
            } else {
                e.c.c.g.a h = e.c.c.g.a.h(fVar.a);
                if (h != null) {
                    try {
                        fVar2 = new f(h);
                    } finally {
                        e.c.c.g.a.o(h);
                    }
                }
            }
            if (fVar2 != null) {
                fVar2.h(fVar);
            }
        }
        return fVar2;
    }

    public static boolean c0(f fVar) {
        return fVar != null && fVar.a0();
    }

    public static void d(f fVar) {
        if (fVar != null) {
            e.c.c.g.a.o(fVar.a);
        }
    }

    private void f0() {
        if (this.f6478f < 0 || this.f6479g < 0) {
            e0();
        }
    }

    public InputStream A() {
        e.c.c.d.j<FileInputStream> jVar = this.b;
        if (jVar != null) {
            return jVar.get();
        }
        e.c.c.g.a h = e.c.c.g.a.h(this.a);
        if (h == null) {
            return null;
        }
        try {
            return new com.facebook.common.memory.i((com.facebook.common.memory.g) h.r());
        } finally {
            e.c.c.g.a.o(h);
        }
    }

    public Rect D() {
        return this.n;
    }

    public int G() {
        f0();
        return this.f6476d;
    }

    public int H() {
        return this.h;
    }

    public int I() {
        e.c.c.g.a<com.facebook.common.memory.g> aVar = this.a;
        return (aVar == null || aVar.r() == null) ? this.i : this.a.r().size();
    }

    public long M() {
        return -1L;
    }

    public int N() {
        f0();
        return this.f6478f;
    }

    public boolean P() {
        return this.l;
    }

    public void Q() {
        this.r = false;
        this.q = true;
        this.p = false;
    }

    public boolean S(int i) {
        int i2;
        e.c.g.d dVar = this.f6475c;
        e.c.g.d dVar2 = e.c.g.c.a;
        if ((dVar != dVar2 && dVar != e.c.g.c.j && dVar != e.c.g.c.m) || this.b != null) {
            return true;
        }
        Objects.requireNonNull(this.a);
        com.facebook.common.memory.g r = this.a.r();
        e.c.g.d dVar3 = this.f6475c;
        return dVar3 == dVar2 ? r.e(i + (-2)) == -1 && r.e(i - 1) == -39 : dVar3 != e.c.g.c.j || (i2 = this.m) == 0 || i2 == 3;
    }

    public boolean U() {
        return this.s;
    }

    public synchronized boolean a0() {
        boolean z;
        if (!e.c.c.g.a.x(this.a)) {
            z = this.b != null;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e.c.c.g.a.o(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x010c, code lost:
    
        if (r1 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x008e, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.image.f.e0():void");
    }

    public void h(f fVar) {
        fVar.f0();
        this.f6475c = fVar.f6475c;
        fVar.f0();
        this.f6478f = fVar.f6478f;
        fVar.f0();
        this.f6479g = fVar.f6479g;
        fVar.f0();
        this.f6476d = fVar.f6476d;
        fVar.f0();
        this.f6477e = fVar.f6477e;
        this.h = fVar.h;
        this.i = fVar.I();
        this.j = fVar.j;
        fVar.f0();
        this.k = fVar.k;
        this.l = fVar.l;
        this.m = fVar.m;
        this.n = fVar.n;
        this.o = fVar.o;
        this.p = fVar.p;
        this.q = fVar.q;
        this.r = fVar.r;
    }

    public void j0(com.facebook.imagepipeline.common.a aVar) {
        this.j = aVar;
    }

    public e.c.c.g.a<com.facebook.common.memory.g> l() {
        return e.c.c.g.a.h(this.a);
    }

    public void l0(int i) {
        this.m = i;
    }

    public void n0(int i) {
        this.f6477e = i;
    }

    public com.facebook.imagepipeline.common.a o() {
        return this.j;
    }

    public void o0(Map<String, String> map) {
        this.o = map;
        e.c.c.g.a<com.facebook.common.memory.g> aVar = this.a;
        if (aVar == null || !(aVar.r() instanceof a)) {
            return;
        }
        ((a) this.a.r()).l(map);
    }

    public int p() {
        return this.m;
    }

    public void p0(int i) {
        this.f6479g = i;
    }

    public void q0(e.c.g.d dVar) {
        this.f6475c = dVar;
    }

    public int r() {
        f0();
        return this.f6477e;
    }

    public void r0(boolean z) {
        this.s = z;
    }

    public Map<String, String> s() {
        return this.o;
    }

    public void s0() {
        this.r = false;
        this.q = false;
        this.p = true;
    }

    public void t0(int i) {
        this.f6476d = i;
    }

    public void u0(int i) {
        this.h = i;
    }

    public void v0(int i) {
        this.f6478f = i;
    }

    public String w(int i) {
        e.c.c.g.a<com.facebook.common.memory.g> l = l();
        if (l == null) {
            return "";
        }
        int min = Math.min(I(), i);
        byte[] bArr = new byte[min];
        try {
            com.facebook.common.memory.g r = l.r();
            if (r == null) {
                return "";
            }
            r.f(0, bArr, 0, min);
            l.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i2 = 0; i2 < min; i2++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            }
            return sb.toString();
        } finally {
            l.close();
        }
    }

    public int x() {
        f0();
        return this.f6479g;
    }

    public e.c.g.d z() {
        f0();
        return this.f6475c;
    }

    public f(e.c.c.d.j<FileInputStream> jVar, int i) {
        this.f6475c = e.c.g.d.b;
        this.f6476d = -1;
        this.f6477e = 0;
        this.f6478f = -1;
        this.f6479g = -1;
        this.h = 1;
        this.i = -1;
        this.l = true;
        this.m = 0;
        this.p = false;
        this.q = false;
        this.r = false;
        Objects.requireNonNull(jVar);
        this.a = null;
        this.b = jVar;
        this.i = i;
    }
}
