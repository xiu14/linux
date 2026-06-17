package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0713a implements InterfaceC0716d {
    final /* synthetic */ int a;
    final /* synthetic */ C0714b b;

    C0713a(C0714b c0714b, int i) {
        this.b = c0714b;
        this.a = i;
    }

    @Override // com.facebook.drawee.drawable.InterfaceC0716d
    public Drawable g(Drawable drawable) {
        return this.b.f(this.a, drawable);
    }

    @Override // com.facebook.drawee.drawable.InterfaceC0716d
    public Drawable l() {
        return this.b.a(this.a);
    }
}
