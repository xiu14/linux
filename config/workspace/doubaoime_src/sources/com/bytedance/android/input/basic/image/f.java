package com.bytedance.android.input.basic.image;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.k;
import com.bumptech.glide.manager.o;
import java.io.File;

/* loaded from: classes.dex */
public class f extends k {
    public f(@NonNull com.bumptech.glide.c cVar, @NonNull com.bumptech.glide.manager.j jVar, @NonNull o oVar, @NonNull Context context) {
        super(cVar, jVar, oVar, context);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public com.bumptech.glide.j g() {
        return (e) super.g();
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public com.bumptech.glide.j l() {
        return (e) super.l();
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public com.bumptech.glide.j m() {
        return (e) d(File.class).a(com.bumptech.glide.request.h.c0(true));
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    public com.bumptech.glide.j r(@Nullable String str) {
        return (e) l().m0(str);
    }

    @Override // com.bumptech.glide.k
    protected void u(@NonNull com.bumptech.glide.request.h hVar) {
        if (hVar instanceof d) {
            super.u(hVar);
        } else {
            super.u(new d().d0(hVar));
        }
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @CheckResult
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public <ResourceType> e<ResourceType> d(@NonNull Class<ResourceType> cls) {
        return new e<>(this.a, this, cls, this.b);
    }
}
