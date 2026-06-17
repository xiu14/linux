package com.bytedance.common.wschannel.channel.c.a.i;

import f.e;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d {
    static String a(int i) {
        if (i < 1000 || i >= 5000) {
            return e.a.a.a.a.j("Code must be in range [1000,5000): ", i);
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return e.a.a.a.a.k("Code ", i, " is reserved and may not be used.");
    }

    static void b(e.a aVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.f10042e;
            int i2 = aVar.f10043f;
            int i3 = aVar.f10044g;
            while (true) {
                if (i2 >= i3) {
                    break;
                }
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
            long j2 = aVar.f10041d;
            f.e eVar = aVar.a;
            if (eVar == null) {
                l.k();
                throw null;
            }
            if (!(j2 != eVar.I())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j = aVar.f10041d;
        } while (aVar.a(j == -1 ? 0L : j + (aVar.f10044g - aVar.f10043f)) != -1);
    }
}
