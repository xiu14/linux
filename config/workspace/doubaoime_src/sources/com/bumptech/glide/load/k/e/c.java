package com.bumptech.glide.load.k.e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c<T extends Drawable> implements v<T>, r {
    protected final T a;

    public c(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.a = t;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Object get() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.r
    public void initialize() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof GifDrawable) {
            ((GifDrawable) t).c().prepareToDraw();
        }
    }
}
