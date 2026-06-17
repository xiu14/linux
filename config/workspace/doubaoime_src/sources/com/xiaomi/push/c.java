package com.xiaomi.push;

import java.io.InputStream;
import java.util.Vector;

/* loaded from: classes2.dex */
public final class c {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private final InputStream f159a;

    /* renamed from: a, reason: collision with other field name */
    private final byte[] f160a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f9001c;

    /* renamed from: d, reason: collision with root package name */
    private int f9002d;

    /* renamed from: e, reason: collision with root package name */
    private int f9003e;

    /* renamed from: f, reason: collision with root package name */
    private int f9004f;

    /* renamed from: g, reason: collision with root package name */
    private int f9005g;
    private int h;
    private int i;

    private c(byte[] bArr, int i, int i2) {
        this.f9004f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = 67108864;
        this.f160a = bArr;
        this.a = i2 + i;
        this.f9001c = i;
        this.f159a = null;
    }

    public static c a(InputStream inputStream) {
        return new c(inputStream);
    }

    /* renamed from: b, reason: collision with other method in class */
    public long m155b() {
        return m157c();
    }

    public int c() {
        return d();
    }

    public int d() {
        int i;
        byte a = a();
        if (a >= 0) {
            return a;
        }
        int i2 = a & Byte.MAX_VALUE;
        byte a2 = a();
        if (a2 >= 0) {
            i = a2 << 7;
        } else {
            i2 |= (a2 & Byte.MAX_VALUE) << 7;
            byte a3 = a();
            if (a3 >= 0) {
                i = a3 << 14;
            } else {
                i2 |= (a3 & Byte.MAX_VALUE) << 14;
                byte a4 = a();
                if (a4 < 0) {
                    int i3 = i2 | ((a4 & Byte.MAX_VALUE) << 21);
                    byte a5 = a();
                    int i4 = i3 | (a5 << 28);
                    if (a5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (a() >= 0) {
                            return i4;
                        }
                    }
                    throw e.c();
                }
                i = a4 << 21;
            }
        }
        return i2 | i;
    }

    public int e() {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    public static c a(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    /* renamed from: b, reason: collision with other method in class */
    public int m154b() {
        return d();
    }

    /* renamed from: c, reason: collision with other method in class */
    public long m157c() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw e.c();
    }

    private void b() {
        int i = this.a + this.b;
        this.a = i;
        int i2 = this.f9003e + i;
        int i3 = this.f9004f;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.b = i4;
            this.a = i - i4;
            return;
        }
        this.b = 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public int m145a() {
        if (m156b()) {
            this.f9002d = 0;
            return 0;
        }
        int d2 = d();
        this.f9002d = d2;
        if (d2 != 0) {
            return d2;
        }
        throw e.d();
    }

    public void c(int i) {
        if (i >= 0) {
            int i2 = this.f9003e;
            int i3 = this.f9001c;
            int i4 = i2 + i3 + i;
            int i5 = this.f9004f;
            if (i4 <= i5) {
                int i6 = this.a;
                if (i <= i6 - i3) {
                    this.f9001c = i3 + i;
                    return;
                }
                int i7 = i6 - i3;
                this.f9003e = i2 + i6;
                this.f9001c = 0;
                this.a = 0;
                while (i7 < i) {
                    InputStream inputStream = this.f159a;
                    int skip = inputStream == null ? -1 : (int) inputStream.skip(i - i7);
                    if (skip > 0) {
                        i7 += skip;
                        this.f9003e += skip;
                    } else {
                        throw e.a();
                    }
                }
                return;
            }
            c((i5 - i2) - i3);
            throw e.a();
        }
        throw e.b();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m150a(int i) {
        if (this.f9002d != i) {
            throw e.e();
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public long m158d() {
        return ((a() & 255) << 8) | (a() & 255) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48) | ((a() & 255) << 56);
    }

    private c(InputStream inputStream) {
        this.f9004f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = 67108864;
        this.f160a = new byte[4096];
        this.a = 0;
        this.f9001c = 0;
        this.f159a = inputStream;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m152a(int i) {
        int a = g.a(i);
        if (a == 0) {
            m154b();
            return true;
        }
        if (a == 1) {
            m158d();
            return true;
        }
        if (a == 2) {
            c(d());
            return true;
        }
        if (a == 3) {
            m149a();
            m150a(g.a(g.b(i), 4));
            return true;
        }
        if (a == 4) {
            return false;
        }
        if (a == 5) {
            e();
            return true;
        }
        throw e.f();
    }

    public void b(int i) {
        this.f9004f = i;
        b();
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m156b() {
        return this.f9001c == this.a && !a(false);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m149a() {
        int m145a;
        do {
            m145a = m145a();
            if (m145a == 0) {
                return;
            }
        } while (m152a(m145a));
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m146a() {
        return m157c();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m151a() {
        return d() != 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m148a() {
        int d2 = d();
        if (d2 <= this.a - this.f9001c && d2 > 0) {
            String str = new String(this.f160a, this.f9001c, d2, "UTF-8");
            this.f9001c += d2;
            return str;
        }
        return new String(m153a(d2), "UTF-8");
    }

    public void a(f fVar) {
        int d2 = d();
        if (this.f9005g < this.h) {
            int a = a(d2);
            this.f9005g++;
            fVar.a(this);
            m150a(0);
            this.f9005g--;
            b(a);
            return;
        }
        throw e.g();
    }

    /* renamed from: a, reason: collision with other method in class */
    public b m147a() {
        int d2 = d();
        int i = this.a;
        int i2 = this.f9001c;
        if (d2 <= i - i2 && d2 > 0) {
            b a = b.a(this.f160a, i2, d2);
            this.f9001c += d2;
            return a;
        }
        return b.a(m153a(d2));
    }

    public int a(int i) {
        if (i >= 0) {
            int i2 = this.f9003e + this.f9001c + i;
            int i3 = this.f9004f;
            if (i2 <= i3) {
                this.f9004f = i2;
                b();
                return i3;
            }
            throw e.a();
        }
        throw e.b();
    }

    private boolean a(boolean z) {
        int i = this.f9001c;
        int i2 = this.a;
        if (i >= i2) {
            int i3 = this.f9003e;
            if (i3 + i2 == this.f9004f) {
                if (z) {
                    throw e.a();
                }
                return false;
            }
            this.f9003e = i3 + i2;
            this.f9001c = 0;
            InputStream inputStream = this.f159a;
            int read = inputStream == null ? -1 : inputStream.read(this.f160a);
            this.a = read;
            if (read == 0 || read < -1) {
                throw new IllegalStateException(e.a.a.a.a.D(e.a.a.a.a.M("InputStream#read(byte[]) returned invalid result: "), this.a, "\nThe InputStream implementation is buggy."));
            }
            if (read == -1) {
                this.a = 0;
                if (z) {
                    throw e.a();
                }
                return false;
            }
            b();
            int i4 = this.f9003e + this.a + this.b;
            if (i4 > this.i || i4 < 0) {
                throw e.h();
            }
            return true;
        }
        throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
    }

    public byte a() {
        if (this.f9001c == this.a) {
            a(true);
        }
        byte[] bArr = this.f160a;
        int i = this.f9001c;
        this.f9001c = i + 1;
        return bArr[i];
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m153a(int i) {
        if (i >= 0) {
            int i2 = this.f9003e;
            int i3 = this.f9001c;
            int i4 = i2 + i3 + i;
            int i5 = this.f9004f;
            if (i4 <= i5) {
                int i6 = this.a;
                if (i <= i6 - i3) {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f160a, i3, bArr, 0, i);
                    this.f9001c += i;
                    return bArr;
                }
                if (i < 4096) {
                    byte[] bArr2 = new byte[i];
                    int i7 = i6 - i3;
                    System.arraycopy(this.f160a, i3, bArr2, 0, i7);
                    this.f9001c = this.a;
                    a(true);
                    while (true) {
                        int i8 = i - i7;
                        int i9 = this.a;
                        if (i8 > i9) {
                            System.arraycopy(this.f160a, 0, bArr2, i7, i9);
                            int i10 = this.a;
                            i7 += i10;
                            this.f9001c = i10;
                            a(true);
                        } else {
                            System.arraycopy(this.f160a, 0, bArr2, i7, i8);
                            this.f9001c = i8;
                            return bArr2;
                        }
                    }
                } else {
                    this.f9003e = i2 + i6;
                    this.f9001c = 0;
                    this.a = 0;
                    int i11 = i6 - i3;
                    int i12 = i - i11;
                    Vector vector = new Vector();
                    while (i12 > 0) {
                        int min = Math.min(i12, 4096);
                        byte[] bArr3 = new byte[min];
                        int i13 = 0;
                        while (i13 < min) {
                            InputStream inputStream = this.f159a;
                            int read = inputStream == null ? -1 : inputStream.read(bArr3, i13, min - i13);
                            if (read == -1) {
                                throw e.a();
                            }
                            this.f9003e += read;
                            i13 += read;
                        }
                        i12 -= min;
                        vector.addElement(bArr3);
                    }
                    byte[] bArr4 = new byte[i];
                    System.arraycopy(this.f160a, i3, bArr4, 0, i11);
                    for (int i14 = 0; i14 < vector.size(); i14++) {
                        byte[] bArr5 = (byte[]) vector.elementAt(i14);
                        System.arraycopy(bArr5, 0, bArr4, i11, bArr5.length);
                        i11 += bArr5.length;
                    }
                    return bArr4;
                }
            } else {
                c((i5 - i2) - i3);
                throw e.a();
            }
        } else {
            throw e.b();
        }
    }
}
