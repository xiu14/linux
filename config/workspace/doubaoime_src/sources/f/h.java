package f;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class h implements Serializable, Comparable<h> {

    /* renamed from: d, reason: collision with root package name */
    public static final h f10045d = f.B.a.d();

    /* renamed from: e, reason: collision with root package name */
    public static final a f10046e = null;
    private transient int a;
    private transient String b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f10047c;

    public static final class a {
        public static final h a(String str) {
            kotlin.s.c.l.g(str, "$receiver");
            int i = f.B.a.f10035c;
            kotlin.s.c.l.g(str, "$receiver");
            kotlin.s.c.l.g(str, "$receiver");
            byte[] bytes = str.getBytes(kotlin.text.c.a);
            kotlin.s.c.l.b(bytes, "(this as java.lang.String).getBytes(charset)");
            h hVar = new h(bytes);
            hVar.p(str);
            return hVar;
        }

        public static final h b(byte... bArr) {
            kotlin.s.c.l.g(bArr, RemoteMessageConst.DATA);
            int i = f.B.a.f10035c;
            kotlin.s.c.l.g(bArr, RemoteMessageConst.DATA);
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            kotlin.s.c.l.b(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new h(copyOf);
        }
    }

    public h(byte[] bArr) {
        kotlin.s.c.l.g(bArr, RemoteMessageConst.DATA);
        this.f10047c = bArr;
    }

    public static final h c(String str) {
        kotlin.s.c.l.g(str, "$receiver");
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(str, "$receiver");
        kotlin.s.c.l.g(str, "$receiver");
        byte[] bytes = str.getBytes(kotlin.text.c.a);
        kotlin.s.c.l.b(bytes, "(this as java.lang.String).getBytes(charset)");
        h hVar = new h(bytes);
        hVar.p(str);
        return hVar;
    }

    public static final h l(byte... bArr) {
        kotlin.s.c.l.g(bArr, RemoteMessageConst.DATA);
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(bArr, RemoteMessageConst.DATA);
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.s.c.l.b(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new h(copyOf);
    }

    public String a() {
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        return C0780a.a(d(), null, 1);
    }

    public h b(String str) {
        kotlin.s.c.l.g(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f10047c);
        kotlin.s.c.l.b(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new h(digest);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r6 < r7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        return 1;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(f.h r9) {
        /*
            r8 = this;
            f.h r9 = (f.h) r9
            java.lang.String r0 = "other"
            kotlin.s.c.l.g(r9, r0)
            int r1 = f.B.a.f10035c
            java.lang.String r1 = "$receiver"
            kotlin.s.c.l.g(r8, r1)
            kotlin.s.c.l.g(r9, r0)
            int r0 = r8.f()
            int r1 = r9.f()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L1f:
            r5 = -1
            if (r4 >= r2) goto L36
            byte r6 = r8.j(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.j(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L33
            int r4 = r4 + 1
            goto L1f
        L33:
            if (r6 >= r7) goto L3d
            goto L3b
        L36:
            if (r0 != r1) goto L39
            goto L3e
        L39:
            if (r0 >= r1) goto L3d
        L3b:
            r3 = r5
            goto L3e
        L3d:
            r3 = 1
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.compareTo(java.lang.Object):int");
    }

    public final byte[] d() {
        return this.f10047c;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f() == d().length && hVar.n(0, d(), 0, d().length)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        return d().length;
    }

    public final String g() {
        return this.b;
    }

    public String h() {
        return f.B.a.b(this);
    }

    public int hashCode() {
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        int e2 = e();
        if (e2 != 0) {
            return e2;
        }
        o(Arrays.hashCode(d()));
        return e();
    }

    public byte[] i() {
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        return d();
    }

    public byte j(int i) {
        int i2 = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        return d()[i];
    }

    public h k() {
        return b("MD5");
    }

    public boolean m(int i, h hVar, int i2, int i3) {
        kotlin.s.c.l.g(hVar, "other");
        int i4 = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        kotlin.s.c.l.g(hVar, "other");
        return hVar.n(i2, this.f10047c, i, i3);
    }

    public boolean n(int i, byte[] bArr, int i2, int i3) {
        kotlin.s.c.l.g(bArr, "other");
        int i4 = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        kotlin.s.c.l.g(bArr, "other");
        return i >= 0 && i <= d().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && com.prolificinteractive.materialcalendarview.r.v(d(), i, bArr, i2, i3);
    }

    public final void o(int i) {
        this.a = i;
    }

    public final void p(String str) {
        this.b = str;
    }

    public final boolean q(h hVar) {
        kotlin.s.c.l.g(hVar, "prefix");
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        kotlin.s.c.l.g(hVar, "prefix");
        return m(0, hVar, 0, hVar.f());
    }

    public h r() {
        byte b;
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        for (int i2 = 0; i2 < d().length; i2++) {
            byte b2 = d()[i2];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] d2 = d();
                byte[] copyOf = Arrays.copyOf(d2, d2.length);
                kotlin.s.c.l.b(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b4 = copyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i3] = (byte) (b4 + 32);
                    }
                }
                return new h(copyOf);
            }
        }
        return this;
    }

    public byte[] s() {
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        byte[] d2 = d();
        byte[] copyOf = Arrays.copyOf(d2, d2.length);
        kotlin.s.c.l.b(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public String t() {
        int i = f.B.a.f10035c;
        kotlin.s.c.l.g(this, "$receiver");
        String g2 = g();
        if (g2 != null) {
            return g2;
        }
        byte[] i2 = i();
        kotlin.s.c.l.g(i2, "$receiver");
        String str = new String(i2, kotlin.text.c.a);
        p(str);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bd, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a7, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0198, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0187, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0174, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0203, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0134, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x012b, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0119, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x010a, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00f7, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00b3, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00a8, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0097, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c5, code lost:
    
        if (r5 == 64) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0206, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cc, code lost:
    
        if (r5 == 64) goto L217;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.toString():java.lang.String");
    }

    public void u(e eVar) {
        kotlin.s.c.l.g(eVar, "buffer");
        byte[] bArr = this.f10047c;
        eVar.Q(bArr, 0, bArr.length);
    }
}
