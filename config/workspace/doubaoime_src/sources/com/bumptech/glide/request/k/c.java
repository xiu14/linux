package com.bumptech.glide.request.k;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.j;

/* loaded from: classes.dex */
public abstract class c<T> implements h<T> {
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private com.bumptech.glide.request.e f1853c;

    public c() {
        if (!j.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException(e.a.a.a.a.l("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", Integer.MIN_VALUE, " and height: ", Integer.MIN_VALUE));
        }
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    @Override // com.bumptech.glide.request.k.h
    public final void a(@NonNull g gVar) {
    }

    @Override // com.bumptech.glide.request.k.h
    public final void c(@Nullable com.bumptech.glide.request.e eVar) {
        this.f1853c = eVar;
    }

    @Override // com.bumptech.glide.request.k.h
    public void e(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.k
    public void f() {
    }

    @Override // com.bumptech.glide.request.k.h
    public void h(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.k.h
    @Nullable
    public final com.bumptech.glide.request.e i() {
        return this.f1853c;
    }

    @Override // com.bumptech.glide.request.k.h
    public final void k(@NonNull g gVar) {
        ((SingleRequest) gVar).b(this.a, this.b);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }
}
