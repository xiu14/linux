package com.bytedance.crash.dumper.j;

import com.bytedance.crash.jni.NativeBridge;

/* loaded from: classes.dex */
class g implements d {
    final long a;

    g(long j) {
        this.a = j;
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void a(int i) {
        b(Integer.toString(i));
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void b(String str) {
        NativeBridge.b0(this.a, str, str.length());
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void c(char[] cArr, int i) {
        NativeBridge.a0(this.a, cArr, i);
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void d(long j) {
        b(Long.toString(j));
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void flush() {
        NativeBridge.c0(this.a);
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void release() {
        NativeBridge.d0(this.a);
    }
}
