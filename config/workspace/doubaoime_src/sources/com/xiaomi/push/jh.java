package com.xiaomi.push;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public class jh extends ByteArrayOutputStream {
    public jh(int i) {
        super(i);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m635a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public jh() {
    }

    public int a() {
        return ((ByteArrayOutputStream) this).count;
    }
}
