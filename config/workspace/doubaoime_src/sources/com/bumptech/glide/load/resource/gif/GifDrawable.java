package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.load.resource.gif.f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class GifDrawable extends Drawable implements f.b, Animatable, Animatable2Compat {
    private final a a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1767c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1768d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1769e;

    /* renamed from: f, reason: collision with root package name */
    private int f1770f;

    /* renamed from: g, reason: collision with root package name */
    private int f1771g;
    private boolean h;
    private Paint i;
    private Rect j;
    private List<Animatable2Compat.AnimationCallback> k;

    static final class a extends Drawable.ConstantState {

        @VisibleForTesting
        final f a;

        a(f fVar) {
            this.a = fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new GifDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new GifDrawable(this);
        }
    }

    public GifDrawable(Context context, com.bumptech.glide.n.a aVar, com.bumptech.glide.load.i<Bitmap> iVar, int i, int i2, Bitmap bitmap) {
        a aVar2 = new a(new f(com.bumptech.glide.c.b(context), aVar, i, i2, iVar, bitmap));
        this.f1769e = true;
        this.f1771g = -1;
        this.a = aVar2;
    }

    private Paint d() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    private void h() {
        d.a.b.a.a(!this.f1768d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.a.m(this);
            invalidateSelf();
        }
    }

    @Override // com.bumptech.glide.load.resource.gif.f.b
    public void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (this.a.a.d() == this.a.a.f() - 1) {
            this.f1770f++;
        }
        int i = this.f1771g;
        if (i == -1 || this.f1770f < i) {
            return;
        }
        List<Animatable2Compat.AnimationCallback> list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.k.get(i2).onAnimationEnd(this);
            }
        }
        stop();
    }

    public ByteBuffer b() {
        return this.a.a.b();
    }

    public Bitmap c() {
        return this.a.a.e();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.k;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f1768d) {
            return;
        }
        if (this.h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.j == null) {
                this.j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.j);
            this.h = false;
        }
        Bitmap c2 = this.a.a.c();
        if (this.j == null) {
            this.j = new Rect();
        }
        canvas.drawBitmap(c2, (Rect) null, this.j, d());
    }

    public int e() {
        return this.a.a.h();
    }

    public void f() {
        this.f1768d = true;
        this.a.a.a();
    }

    public void g(com.bumptech.glide.load.i<Bitmap> iVar, Bitmap bitmap) {
        this.a.a.l(iVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.a.g();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        d().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        d.a.b.a.a(!this.f1768d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f1769e = z;
        if (!z) {
            this.b = false;
            this.a.a.n(this);
        } else if (this.f1767c) {
            h();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f1767c = true;
        this.f1770f = 0;
        if (this.f1769e) {
            h();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f1767c = false;
        this.b = false;
        this.a.a.n(this);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.k;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    GifDrawable(a aVar) {
        this.f1769e = true;
        this.f1771g = -1;
        this.a = aVar;
    }
}
