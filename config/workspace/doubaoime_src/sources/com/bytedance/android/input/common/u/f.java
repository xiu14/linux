package com.bytedance.android.input.common.u;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class f {
    public static final f a = null;
    private static final byte[] b;

    static {
        byte[] bytes = "B@t3D4nc3!m3K3y_2o24#wave".getBytes(kotlin.text.c.a);
        l.e(bytes, "this as java.lang.String).getBytes(charset)");
        b = bytes;
    }

    public static final byte[] a(byte[] bArr) {
        l.f(bArr, RemoteMessageConst.DATA);
        if (!(bArr.length == 0)) {
            if (!(b.length == 0)) {
                byte[] bArr2 = new byte[bArr.length];
                int length = bArr.length;
                for (int i = 0; i < length; i++) {
                    byte b2 = bArr[i];
                    byte[] bArr3 = b;
                    bArr2[i] = (byte) (b2 ^ bArr3[i % bArr3.length]);
                }
                return bArr2;
            }
        }
        return bArr;
    }
}
