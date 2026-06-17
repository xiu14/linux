package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Objects;

/* renamed from: com.facebook.drawee.drawable.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC0715c extends g implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    private int f6359d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6360e;

    /* renamed from: f, reason: collision with root package name */
    float f6361f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6362g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableC0715c(Drawable drawable, int i) {
        super(drawable);
        Objects.requireNonNull(drawable);
        this.f6361f = 0.0f;
        this.f6362g = false;
        this.f6359d = i;
        this.f6360e = true;
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f2 = this.f6361f;
        if (!this.f6360e) {
            f2 = 360.0f - f2;
        }
        canvas.rotate(f2, (i / 2) + r3, (i2 / 2) + r1);
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (this.f6362g) {
            return;
        }
        this.f6362g = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6362g = false;
        this.f6361f += (int) ((20.0f / this.f6359d) * 360.0f);
        invalidateSelf();
    }
}
