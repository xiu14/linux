package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public class gk {
    public static final byte[] a = {80, 85, 83, 72};

    /* renamed from: a, reason: collision with other field name */
    private byte f492a;

    /* renamed from: a, reason: collision with other field name */
    private int f493a;

    /* renamed from: a, reason: collision with other field name */
    private short f494a;
    private byte[] b;

    public static class a {
        public static final c a = new c();

        /* renamed from: a, reason: collision with other field name */
        public static final d f495a = new d();

        public static byte[] a(byte[] bArr) {
            return a(bArr, f495a);
        }

        public static byte[] a(byte[] bArr, b bVar) {
            if (!gk.m428a(bArr)) {
                return bArr;
            }
            gk a2 = gk.a(bArr);
            return (a2.f492a == 0 || a2.f492a != bVar.a()) ? a2.b : bVar.a(a2.b, a2.f493a);
        }
    }

    public interface b {
        byte a();

        byte[] a(byte[] bArr, int i);
    }

    public static final class c {
    }

    public static final class d implements b {
        @Override // com.xiaomi.push.gk.b
        public byte a() {
            return (byte) 2;
        }

        @Override // com.xiaomi.push.gk.b
        public byte[] a(byte[] bArr, int i) {
            GZIPInputStream gZIPInputStream = null;
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr), i);
                try {
                    byte[] bArr2 = new byte[i];
                    gZIPInputStream2.read(bArr2);
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bArr2;
                } catch (IOException unused2) {
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    protected gk(byte b2, int i, byte[] bArr) {
        this((short) 1, b2, i, bArr);
    }

    protected gk(short s, byte b2, int i, byte[] bArr) {
        this.f494a = (short) 1;
        this.f494a = s;
        this.f492a = b2;
        this.f493a = i;
        this.b = bArr;
    }

    public static gk a(byte b2, int i, byte[] bArr) {
        return new gk(b2, i, bArr);
    }

    public static gk a(short s, byte b2, int i, byte[] bArr) {
        return new gk(s, b2, i, bArr);
    }

    public static gk a(byte[] bArr) {
        if (m428a(bArr)) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            order.getInt();
            short s = order.getShort();
            byte b2 = order.get();
            int i = order.getInt();
            byte[] bArr2 = new byte[order.getInt()];
            order.get(bArr2);
            return a(s, b2, i, bArr2);
        }
        return a((byte) 0, bArr.length, bArr);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m428a(byte[] bArr) {
        byte[] bArr2 = a;
        return a(bArr2, bArr, bArr2.length);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
