package com.facebook.imagepipeline.memory;

/* loaded from: classes2.dex */
public class y implements C {
    private static y a;

    private y() {
    }

    public static synchronized y h() {
        y yVar;
        synchronized (y.class) {
            if (a == null) {
                a = new y();
            }
            yVar = a;
        }
        return yVar;
    }

    @Override // com.facebook.imagepipeline.memory.C
    public void a(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.C
    public void b(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.C
    public void c(AbstractC0719b abstractC0719b) {
    }

    @Override // com.facebook.imagepipeline.memory.C
    public void d() {
    }

    @Override // com.facebook.imagepipeline.memory.C
    public void e(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.C
    public void f() {
    }

    @Override // com.facebook.imagepipeline.memory.C
    public void g(int i) {
    }
}
