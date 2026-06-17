package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.c;
import com.bumptech.glide.util.e;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class e extends ContextWrapper {

    @VisibleForTesting
    static final l<?, ?> k = new b();
    private final com.bumptech.glide.load.engine.B.b a;
    private final e.b<g> b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.request.k.f f1543c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f1544d;

    /* renamed from: e, reason: collision with root package name */
    private final List<com.bumptech.glide.request.g<Object>> f1545e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f1546f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.k f1547g;
    private final f h;
    private final int i;

    @Nullable
    @GuardedBy("this")
    private com.bumptech.glide.request.h j;

    public e(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.B.b bVar, @NonNull e.b<g> bVar2, @NonNull com.bumptech.glide.request.k.f fVar, @NonNull c.a aVar, @NonNull Map<Class<?>, l<?, ?>> map, @NonNull List<com.bumptech.glide.request.g<Object>> list, @NonNull com.bumptech.glide.load.engine.k kVar, @NonNull f fVar2, int i) {
        super(context.getApplicationContext());
        this.a = bVar;
        this.f1543c = fVar;
        this.f1544d = aVar;
        this.f1545e = list;
        this.f1546f = map;
        this.f1547g = kVar;
        this.h = fVar2;
        this.i = i;
        this.b = com.bumptech.glide.util.e.a(bVar2);
    }

    @NonNull
    public <X> com.bumptech.glide.request.k.i<ImageView, X> a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        Objects.requireNonNull(this.f1543c);
        if (Bitmap.class.equals(cls)) {
            return new com.bumptech.glide.request.k.b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new com.bumptech.glide.request.k.d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }

    @NonNull
    public com.bumptech.glide.load.engine.B.b b() {
        return this.a;
    }

    public List<com.bumptech.glide.request.g<Object>> c() {
        return this.f1545e;
    }

    public synchronized com.bumptech.glide.request.h d() {
        if (this.j == null) {
            this.j = this.f1544d.build().K();
        }
        return this.j;
    }

    @NonNull
    public <T> l<?, T> e(@NonNull Class<T> cls) {
        l<?, T> lVar = (l) this.f1546f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f1546f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) k : lVar;
    }

    @NonNull
    public com.bumptech.glide.load.engine.k f() {
        return this.f1547g;
    }

    public f g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    @NonNull
    public g i() {
        return this.b.get();
    }
}
