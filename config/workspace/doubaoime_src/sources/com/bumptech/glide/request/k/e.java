package com.bumptech.glide.request.k;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes.dex */
public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private Animatable f1854c;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void g(@Nullable Z z) {
        d(z);
        if (!(z instanceof Animatable)) {
            this.f1854c = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f1854c = animatable;
        animatable.start();
    }

    @Override // com.bumptech.glide.request.k.h
    public void b(@NonNull Z z, @Nullable com.bumptech.glide.request.l.b<? super Z> bVar) {
        g(z);
    }

    protected abstract void d(@Nullable Z z);

    @Override // com.bumptech.glide.request.k.a, com.bumptech.glide.request.k.h
    public void e(@Nullable Drawable drawable) {
        g(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.k.a, com.bumptech.glide.manager.k
    public void f() {
        Animatable animatable = this.f1854c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.k.i, com.bumptech.glide.request.k.h
    public void h(@Nullable Drawable drawable) {
        g(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.k.i, com.bumptech.glide.request.k.h
    public void j(@Nullable Drawable drawable) {
        super.j(drawable);
        Animatable animatable = this.f1854c;
        if (animatable != null) {
            animatable.stop();
        }
        g(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.k.a, com.bumptech.glide.manager.k
    public void onStart() {
        Animatable animatable = this.f1854c;
        if (animatable != null) {
            animatable.start();
        }
    }
}
