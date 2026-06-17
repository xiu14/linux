package com.xiaomi.push.service;

import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public class bc {
    private static int a = 8;

    /* renamed from: d, reason: collision with root package name */
    private int f9332d = -666;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f1074a = new byte[256];

    /* renamed from: c, reason: collision with root package name */
    private int f9331c = 0;
    private int b = 0;

    public static int a(byte b) {
        return b >= 0 ? b : b + 256;
    }

    private void a(int i, byte[] bArr, boolean z) {
        int length = bArr.length;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f1074a[i2] = (byte) i2;
        }
        this.f9331c = 0;
        this.b = 0;
        while (true) {
            int i3 = this.b;
            if (i3 >= i) {
                break;
            }
            int a2 = (a(bArr[this.b % length]) + (a(this.f1074a[i3]) + this.f9331c)) % 256;
            this.f9331c = a2;
            a(this.f1074a, this.b, a2);
            this.b++;
        }
        if (i != 256) {
            this.f9332d = (a(bArr[i % length]) + (a(this.f1074a[i]) + this.f9331c)) % 256;
        }
        if (z) {
            StringBuilder M = e.a.a.a.a.M("S_");
            int i4 = i - 1;
            M.append(i4);
            M.append(Constants.COLON_SEPARATOR);
            for (int i5 = 0; i5 <= i; i5++) {
                M.append(" ");
                M.append(a(this.f1074a[i5]));
            }
            M.append("   j_");
            M.append(i4);
            M.append(ContainerUtils.KEY_VALUE_DELIMITER);
            e.a.a.a.a.F0(M, this.f9331c, "   j_", i, ContainerUtils.KEY_VALUE_DELIMITER);
            e.a.a.a.a.F0(M, this.f9332d, "   S_", i4, "[j_");
            M.append(i4);
            M.append("]=");
            M.append(a(this.f1074a[this.f9331c]));
            M.append("   S_");
            M.append(i4);
            M.append("[j_");
            M.append(i);
            M.append("]=");
            M.append(a(this.f1074a[this.f9332d]));
            if (this.f1074a[1] != 0) {
                M.append("   S[1]!=0");
            }
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        }
    }

    private void a(byte[] bArr) {
        a(256, bArr, false);
    }

    private void a() {
        this.f9331c = 0;
        this.b = 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    byte m777a() {
        int i = (this.b + 1) % 256;
        this.b = i;
        int a2 = (a(this.f1074a[i]) + this.f9331c) % 256;
        this.f9331c = a2;
        a(this.f1074a, this.b, a2);
        byte[] bArr = this.f1074a;
        return bArr[(a(this.f1074a[this.f9331c]) + a(bArr[this.b])) % 256];
    }

    private static void a(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        bc bcVar = new bc();
        bcVar.a(bArr);
        bcVar.a();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ bcVar.m777a());
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
        byte[] bArr3;
        int i3;
        if (i >= 0 && i <= bArr2.length && i + i2 <= bArr2.length) {
            if (z) {
                bArr3 = bArr2;
                i3 = i;
            } else {
                bArr3 = new byte[i2];
                i3 = 0;
            }
            bc bcVar = new bc();
            bcVar.a(bArr);
            bcVar.a();
            for (int i4 = 0; i4 < i2; i4++) {
                bArr3[i3 + i4] = (byte) (bArr2[i + i4] ^ bcVar.m777a());
            }
            return bArr3;
        }
        throw new IllegalArgumentException(e.a.a.a.a.l("start = ", i, " len = ", i2));
    }

    public static byte[] a(byte[] bArr, String str) {
        return a(bArr, com.xiaomi.push.bj.m131a(str));
    }

    public static byte[] a(String str, String str2) {
        byte[] m131a = com.xiaomi.push.bj.m131a(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[m131a.length + 1 + bytes.length];
        for (int i = 0; i < m131a.length; i++) {
            bArr[i] = m131a[i];
        }
        bArr[m131a.length] = 95;
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[m131a.length + 1 + i2] = bytes[i2];
        }
        return bArr;
    }
}
