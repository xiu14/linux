package com.bumptech.glide.load.resource.gif;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.r;

/* loaded from: classes.dex */
public class d extends com.bumptech.glide.load.k.e.c<GifDrawable> implements r {
    public d(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // com.bumptech.glide.load.engine.v
    public int a() {
        return ((GifDrawable) this.a).e();
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<GifDrawable> c() {
        return GifDrawable.class;
    }

    @Override // com.bumptech.glide.load.k.e.c, com.bumptech.glide.load.engine.r
    public void initialize() {
        ((GifDrawable) this.a).c().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
        ((GifDrawable) this.a).stop();
        ((GifDrawable) this.a).f();
    }
}
