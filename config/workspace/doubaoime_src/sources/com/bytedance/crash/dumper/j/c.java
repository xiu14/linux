package com.bytedance.crash.dumper.j;

/* loaded from: classes.dex */
class c extends a {
    c(String str) {
        this.a = f(str, 0);
    }

    @Override // com.bytedance.crash.dumper.j.a
    void a(char c2) {
        this.a.b(String.valueOf(c2));
    }

    @Override // com.bytedance.crash.dumper.j.a
    void b(int i) {
        this.a.a(i);
    }

    @Override // com.bytedance.crash.dumper.j.a
    void c(long j) {
        this.a.d(j);
    }

    @Override // com.bytedance.crash.dumper.j.a
    void d(String str) {
        this.a.b(str);
    }

    @Override // com.bytedance.crash.dumper.j.a
    void e(char[] cArr) {
        this.a.c(cArr, cArr.length);
    }

    @Override // com.bytedance.crash.dumper.j.a
    void g() {
        this.a.release();
    }
}
