package com.bytedance.memory.shrink;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {
    private final byte[] a;

    public c(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public byte[] a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return Arrays.equals(this.a, ((c) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("0x");
        for (byte b : this.a) {
            M.append(Integer.toHexString(b & 255));
        }
        return M.toString();
    }
}
