package com.bytedance.android.input.basic.image;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.k;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* loaded from: classes.dex */
public class e<TranscodeType> extends com.bumptech.glide.j<TranscodeType> implements Cloneable {
    e(@NonNull com.bumptech.glide.c cVar, @NonNull k kVar, @NonNull Class<TranscodeType> cls, @NonNull Context context) {
        super(cVar, kVar, cls, context);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public com.bumptech.glide.request.a K() {
        super.K();
        return this;
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a L() {
        return (e) super.L();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a M() {
        return (e) super.M();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a N() {
        return (e) super.N();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a Q(int i, int i2) {
        return (e) super.Q(i, i2);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a R(@DrawableRes int i) {
        return (e) super.R(i);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a S(@NonNull Priority priority) {
        return (e) super.S(priority);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a U(@NonNull com.bumptech.glide.load.e eVar, @NonNull Object obj) {
        return (e) super.U(eVar, obj);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a V(@NonNull com.bumptech.glide.load.d dVar) {
        return (e) super.V(dVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a W(boolean z) {
        return (e) super.W(z);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a Y(@NonNull com.bumptech.glide.load.i iVar) {
        return (e) super.Y(iVar);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a a(@NonNull com.bumptech.glide.request.a aVar) {
        return (e) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a b0(boolean z) {
        return (e) super.b0(z);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public com.bumptech.glide.j c0(@Nullable com.bumptech.glide.request.g gVar) {
        return (e) super.c0(gVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a d(@NonNull Class cls) {
        return (e) super.d(cls);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    /* renamed from: d0 */
    public com.bumptech.glide.j a(@NonNull com.bumptech.glide.request.a aVar) {
        return (e) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a e(@NonNull com.bumptech.glide.load.engine.j jVar) {
        return (e) super.e(jVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a f(@NonNull DownsampleStrategy downsampleStrategy) {
        return (e) super.f(downsampleStrategy);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @CheckResult
    public com.bumptech.glide.request.a g(@DrawableRes int i) {
        return (e) super.g(i);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public com.bumptech.glide.j k0(@Nullable com.bumptech.glide.request.g gVar) {
        return (e) super.k0(gVar);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public com.bumptech.glide.j l0(@Nullable Object obj) {
        return (e) super.l0(obj);
    }

    @Override // com.bumptech.glide.j
    @NonNull
    @CheckResult
    public com.bumptech.glide.j m0(@Nullable String str) {
        return (e) super.m0(str);
    }

    @Override // com.bumptech.glide.j
    @CheckResult
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public e<TranscodeType> clone() {
        return (e) super.clone();
    }
}
