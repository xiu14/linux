package com.facebook.drawee.generic;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.D;
import com.facebook.drawee.drawable.E;
import com.facebook.drawee.drawable.g;

/* loaded from: classes2.dex */
public class d extends g implements D {

    /* renamed from: d, reason: collision with root package name */
    Drawable f6409d;

    /* renamed from: e, reason: collision with root package name */
    private E f6410e;

    public d(Drawable drawable) {
        super(drawable);
        this.f6409d = null;
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            E e2 = this.f6410e;
            if (e2 != null) {
                ((com.facebook.drawee.view.b) e2).j();
            }
            super.draw(canvas);
            Drawable drawable = this.f6409d;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f6409d.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.D
    public void k(E e2) {
        this.f6410e = e2;
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        E e2 = this.f6410e;
        if (e2 != null) {
            ((com.facebook.drawee.view.b) e2).l(z);
        }
        return super.setVisible(z, z2);
    }
}
