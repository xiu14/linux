package com.bumptech.glide.n;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class d {
    private ByteBuffer b;

    /* renamed from: c, reason: collision with root package name */
    private c f1820c;
    private final byte[] a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f1821d = 0;

    private boolean b() {
        return this.f1820c.b != 0;
    }

    private int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.f1820c.b = 1;
            return 0;
        }
    }

    private void e() {
        int d2 = d();
        this.f1821d = d2;
        if (d2 <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.f1821d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.b.get(this.a, i, i2);
                i += i2;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder O = e.a.a.a.a.O("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                    O.append(this.f1821d);
                    Log.d("GifHeaderParser", O.toString(), e2);
                }
                this.f1820c.b = 1;
                return;
            }
        }
    }

    @Nullable
    private int[] f(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f1820c.b = 1;
        }
        return iArr;
    }

    private int g() {
        return this.b.getShort();
    }

    private void i() {
        int d2;
        do {
            d2 = d();
            this.b.position(Math.min(this.b.position() + d2, this.b.limit()));
        } while (d2 > 0);
    }

    public void a() {
        this.b = null;
        this.f1820c = null;
    }

    @NonNull
    public c c() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f1820c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f1820c.f1818f = g();
            this.f1820c.f1819g = g();
            int d2 = d();
            c cVar = this.f1820c;
            cVar.h = (d2 & 128) != 0;
            cVar.i = (int) Math.pow(2.0d, (d2 & 7) + 1);
            this.f1820c.j = d();
            c cVar2 = this.f1820c;
            d();
            Objects.requireNonNull(cVar2);
            if (this.f1820c.h && !b()) {
                c cVar3 = this.f1820c;
                cVar3.a = f(cVar3.i);
                c cVar4 = this.f1820c;
                cVar4.k = cVar4.a[cVar4.j];
            }
        } else {
            this.f1820c.b = 1;
        }
        if (!b()) {
            boolean z = false;
            while (!z && !b() && this.f1820c.f1815c <= Integer.MAX_VALUE) {
                int d3 = d();
                if (d3 == 33) {
                    int d4 = d();
                    if (d4 == 1) {
                        i();
                    } else if (d4 == 249) {
                        this.f1820c.f1816d = new b();
                        d();
                        int d5 = d();
                        b bVar = this.f1820c.f1816d;
                        int i2 = (d5 & 28) >> 2;
                        bVar.f1814g = i2;
                        if (i2 == 0) {
                            bVar.f1814g = 1;
                        }
                        bVar.f1813f = (d5 & 1) != 0;
                        int g2 = g();
                        if (g2 < 2) {
                            g2 = 10;
                        }
                        b bVar2 = this.f1820c.f1816d;
                        bVar2.i = g2 * 10;
                        bVar2.h = d();
                        d();
                    } else if (d4 == 254) {
                        i();
                    } else if (d4 != 255) {
                        i();
                    } else {
                        e();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i3 = 0; i3 < 11; i3++) {
                            sb2.append((char) this.a[i3]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                e();
                                byte[] bArr = this.a;
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    Objects.requireNonNull(this.f1820c);
                                }
                                if (this.f1821d > 0) {
                                }
                            } while (!b());
                        } else {
                            i();
                        }
                    }
                } else if (d3 == 44) {
                    c cVar5 = this.f1820c;
                    if (cVar5.f1816d == null) {
                        cVar5.f1816d = new b();
                    }
                    cVar5.f1816d.a = g();
                    this.f1820c.f1816d.b = g();
                    this.f1820c.f1816d.f1810c = g();
                    this.f1820c.f1816d.f1811d = g();
                    int d6 = d();
                    boolean z2 = (d6 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (d6 & 7) + 1);
                    b bVar3 = this.f1820c.f1816d;
                    bVar3.f1812e = (d6 & 64) != 0;
                    if (z2) {
                        bVar3.k = f(pow);
                    } else {
                        bVar3.k = null;
                    }
                    this.f1820c.f1816d.j = this.b.position();
                    d();
                    i();
                    if (!b()) {
                        c cVar6 = this.f1820c;
                        cVar6.f1815c++;
                        cVar6.f1817e.add(cVar6.f1816d);
                    }
                } else if (d3 != 59) {
                    this.f1820c.b = 1;
                } else {
                    z = true;
                }
            }
            c cVar7 = this.f1820c;
            if (cVar7.f1815c < 0) {
                cVar7.b = 1;
            }
        }
        return this.f1820c;
    }

    public d h(@NonNull ByteBuffer byteBuffer) {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.f1820c = new c();
        this.f1821d = 0;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
