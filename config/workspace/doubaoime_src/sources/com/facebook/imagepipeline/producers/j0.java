package com.facebook.imagepipeline.producers;

import java.util.Objects;

/* loaded from: classes2.dex */
public class j0 implements U<com.facebook.imagepipeline.image.f> {
    private final k0<com.facebook.imagepipeline.image.f>[] a;

    private class a extends AbstractC0735o<com.facebook.imagepipeline.image.f, com.facebook.imagepipeline.image.f> {

        /* renamed from: c, reason: collision with root package name */
        private final V f6621c;

        /* renamed from: d, reason: collision with root package name */
        private final int f6622d;

        /* renamed from: e, reason: collision with root package name */
        private final com.facebook.imagepipeline.common.e f6623e;

        public a(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v, int i) {
            super(interfaceC0732l);
            this.f6621c = v;
            this.f6622d = i;
            this.f6623e = v.d().s();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        protected void h(Throwable th) {
            if (j0.this.d(this.f6622d + 1, n(), this.f6621c)) {
                return;
            }
            n().a(th);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(Object obj, int i) {
            com.facebook.imagepipeline.image.f fVar = (com.facebook.imagepipeline.image.f) obj;
            if (fVar != null && (AbstractC0722b.f(i) || com.bytedance.feedbackerlib.a.Y(fVar, this.f6623e))) {
                n().c(fVar, i);
            } else if (AbstractC0722b.e(i)) {
                com.facebook.imagepipeline.image.f.d(fVar);
                if (j0.this.d(this.f6622d + 1, n(), this.f6621c)) {
                    return;
                }
                n().c(null, 1);
            }
        }
    }

    public j0(k0<com.facebook.imagepipeline.image.f>... k0VarArr) {
        Objects.requireNonNull(k0VarArr);
        this.a = k0VarArr;
        e.c.c.d.h.d(0, k0VarArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i, InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        com.facebook.imagepipeline.common.e s = v.d().s();
        while (true) {
            k0<com.facebook.imagepipeline.image.f>[] k0VarArr = this.a;
            if (i >= k0VarArr.length) {
                i = -1;
                break;
            }
            if (k0VarArr[i].a(s)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        this.a[i].b(new a(interfaceC0732l, v, i), v);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        if (v.d().s() == null) {
            interfaceC0732l.c(null, 1);
        } else {
            if (d(0, interfaceC0732l, v)) {
                return;
            }
            interfaceC0732l.c(null, 1);
        }
    }
}
