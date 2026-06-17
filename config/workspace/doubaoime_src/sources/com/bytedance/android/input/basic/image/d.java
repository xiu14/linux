package com.bytedance.android.input.basic.image;

import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* loaded from: classes.dex */
public final class d extends com.bumptech.glide.request.h implements Cloneable {
    @Override // com.bumptech.glide.request.a
    @NonNull
    public com.bumptech.glide.request.h K() {
        super.K();
        return this;
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h L() {
        return (d) super.L();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h M() {
        return (d) super.M();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h N() {
        return (d) super.N();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h P(@NonNull Class cls, @NonNull com.bumptech.glide.load.i iVar) {
        return (d) super.P(cls, iVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h Q(int i, int i2) {
        return (d) super.Q(i, i2);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h R(@DrawableRes int i) {
        return (d) super.R(i);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h S(@NonNull Priority priority) {
        return (d) super.S(priority);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h U(@NonNull com.bumptech.glide.load.e eVar, @NonNull Object obj) {
        return (d) super.U(eVar, obj);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h V(@NonNull com.bumptech.glide.load.d dVar) {
        return (d) super.V(dVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h W(boolean z) {
        return (d) super.W(z);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h X(@IntRange(from = 0) int i) {
        return (d) U(com.bumptech.glide.load.j.A.a.b, Integer.valueOf(i));
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h Y(@NonNull com.bumptech.glide.load.i iVar) {
        return (d) super.Y(iVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h a(@NonNull com.bumptech.glide.request.a aVar) {
        return (d) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public com.bumptech.glide.request.h b() {
        return (d) super.b();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h b0(boolean z) {
        return (d) super.b0(z);
    }

    @Override // com.bumptech.glide.request.a
    @CheckResult
    /* renamed from: c */
    public com.bumptech.glide.request.h clone() {
        return (d) super.clone();
    }

    @Override // com.bumptech.glide.request.a
    @CheckResult
    public Object clone() throws CloneNotSupportedException {
        return (d) super.clone();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h d(@NonNull Class cls) {
        return (d) super.d(cls);
    }

    @NonNull
    @CheckResult
    public d d0(@NonNull com.bumptech.glide.request.a<?> aVar) {
        return (d) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h e(@NonNull com.bumptech.glide.load.engine.j jVar) {
        return (d) super.e(jVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h f(@NonNull DownsampleStrategy downsampleStrategy) {
        return (d) super.f(downsampleStrategy);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.h g(@DrawableRes int i) {
        return (d) super.g(i);
    }
}
