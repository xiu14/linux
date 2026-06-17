package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class jl extends jp {
    private static final ju a = new ju();

    /* renamed from: a, reason: collision with other field name */
    protected int f909a;

    /* renamed from: a, reason: collision with other field name */
    protected boolean f910a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f911a;
    protected boolean b;

    /* renamed from: b, reason: collision with other field name */
    private byte[] f912b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f9294c;

    /* renamed from: c, reason: collision with other field name */
    private byte[] f913c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f9295d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f9296e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f9297f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f9298g;
    private byte[] h;

    public static class a implements jr {
        protected int a;

        /* renamed from: a, reason: collision with other field name */
        protected boolean f914a;
        protected boolean b;

        public a() {
            this(false, true);
        }

        @Override // com.xiaomi.push.jr
        public jp a(jz jzVar) {
            jl jlVar = new jl(jzVar, this.f914a, this.b);
            int i = this.a;
            if (i != 0) {
                jlVar.b(i);
            }
            return jlVar;
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f914a = false;
            this.b = true;
            this.f914a = z;
            this.b = z2;
            this.a = i;
        }
    }

    public jl(jz jzVar, boolean z, boolean z2) {
        super(jzVar);
        this.f910a = false;
        this.b = true;
        this.f9294c = false;
        this.f911a = new byte[1];
        this.f912b = new byte[2];
        this.f913c = new byte[4];
        this.f9295d = new byte[8];
        this.f9296e = new byte[1];
        this.f9297f = new byte[2];
        this.f9298g = new byte[4];
        this.h = new byte[8];
        this.f910a = z;
        this.b = z2;
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public void mo647a() {
    }

    @Override // com.xiaomi.push.jp
    public void a(jm jmVar) {
        a(jmVar.a);
        a(jmVar.f916a);
    }

    @Override // com.xiaomi.push.jp
    public void a(ju juVar) {
    }

    @Override // com.xiaomi.push.jp
    public void b() {
    }

    public void b(int i) {
        this.f909a = i;
        this.f9294c = true;
    }

    @Override // com.xiaomi.push.jp
    public void c() {
        a((byte) 0);
    }

    @Override // com.xiaomi.push.jp
    public void d() {
    }

    @Override // com.xiaomi.push.jp
    public void e() {
    }

    @Override // com.xiaomi.push.jp
    public void f() {
    }

    @Override // com.xiaomi.push.jp
    public void g() {
    }

    @Override // com.xiaomi.push.jp
    public void h() {
    }

    @Override // com.xiaomi.push.jp
    public void i() {
    }

    @Override // com.xiaomi.push.jp
    public void j() {
    }

    protected void c(int i) {
        if (i < 0) {
            throw new jj(e.a.a.a.a.j("Negative length: ", i));
        }
        if (this.f9294c) {
            int i2 = this.f909a - i;
            this.f909a = i2;
            if (i2 < 0) {
                throw new jj(e.a.a.a.a.j("Message length exceeded: ", i));
            }
        }
    }

    @Override // com.xiaomi.push.jp
    public void a(jo joVar) {
        a(joVar.a);
        a(joVar.b);
        mo648a(joVar.f918a);
    }

    @Override // com.xiaomi.push.jp
    public void a(jn jnVar) {
        a(jnVar.a);
        mo648a(jnVar.f917a);
    }

    @Override // com.xiaomi.push.jp
    public void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.xiaomi.push.jp
    public void a(byte b) {
        byte[] bArr = this.f911a;
        bArr[0] = b;
        ((jp) this).a.mo650a(bArr, 0, 1);
    }

    @Override // com.xiaomi.push.jp
    public void a(short s) {
        byte[] bArr = this.f912b;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        ((jp) this).a.mo650a(bArr, 0, 2);
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public void mo648a(int i) {
        byte[] bArr = this.f913c;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        ((jp) this).a.mo650a(bArr, 0, 4);
    }

    @Override // com.xiaomi.push.jp
    public void a(long j) {
        byte[] bArr = this.f9295d;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        ((jp) this).a.mo650a(bArr, 0, 8);
    }

    @Override // com.xiaomi.push.jp
    public void a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo648a(bytes.length);
            ((jp) this).a.mo650a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new jj("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jp
    public void a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo648a(limit);
        ((jp) this).a.mo650a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), limit);
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public ju mo643a() {
        return a;
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public jm mo639a() {
        byte a2 = a();
        return new jm("", a2, a2 == 0 ? (short) 0 : mo646a());
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public jo mo641a() {
        return new jo(a(), a(), mo637a());
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public jn mo640a() {
        return new jn(a(), mo637a());
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public jt mo642a() {
        return new jt(a(), mo637a());
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo649a() {
        return a() == 1;
    }

    @Override // com.xiaomi.push.jp
    public byte a() {
        if (((jp) this).a.b() >= 1) {
            byte b = ((jp) this).a.a()[((jp) this).a.a_()];
            ((jp) this).a.a(1);
            return b;
        }
        a(this.f9296e, 0, 1);
        return this.f9296e[0];
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public short mo646a() {
        byte[] bArr = this.f9297f;
        int i = 0;
        if (((jp) this).a.b() >= 2) {
            bArr = ((jp) this).a.a();
            i = ((jp) this).a.a_();
            ((jp) this).a.a(2);
        } else {
            a(this.f9297f, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public int mo637a() {
        byte[] bArr = this.f9298g;
        int i = 0;
        if (((jp) this).a.b() >= 4) {
            bArr = ((jp) this).a.a();
            i = ((jp) this).a.a_();
            ((jp) this).a.a(4);
        } else {
            a(this.f9298g, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public long mo638a() {
        byte[] bArr = this.h;
        int i = 0;
        if (((jp) this).a.b() >= 8) {
            bArr = ((jp) this).a.a();
            i = ((jp) this).a.a_();
            ((jp) this).a.a(8);
        } else {
            a(this.h, 0, 8);
        }
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public double mo636a() {
        return Double.longBitsToDouble(mo638a());
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public String mo644a() {
        int mo637a = mo637a();
        if (((jp) this).a.b() >= mo637a) {
            try {
                String str = new String(((jp) this).a.a(), ((jp) this).a.a_(), mo637a, "UTF-8");
                ((jp) this).a.a(mo637a);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new jj("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return a(mo637a);
    }

    public String a(int i) {
        try {
            c(i);
            byte[] bArr = new byte[i];
            ((jp) this).a.b(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new jj("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jp
    /* renamed from: a, reason: collision with other method in class */
    public ByteBuffer mo645a() {
        int mo637a = mo637a();
        c(mo637a);
        if (((jp) this).a.b() >= mo637a) {
            ByteBuffer wrap = ByteBuffer.wrap(((jp) this).a.a(), ((jp) this).a.a_(), mo637a);
            ((jp) this).a.a(mo637a);
            return wrap;
        }
        byte[] bArr = new byte[mo637a];
        ((jp) this).a.b(bArr, 0, mo637a);
        return ByteBuffer.wrap(bArr);
    }

    private int a(byte[] bArr, int i, int i2) {
        c(i2);
        return ((jp) this).a.b(bArr, i, i2);
    }
}
