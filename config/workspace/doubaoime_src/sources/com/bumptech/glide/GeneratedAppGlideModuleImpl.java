package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.n;
import com.bytedance.android.input.basic.image.ImeGlideConfig;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final ImeGlideConfig a = new ImeGlideConfig();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.bytedance.android.input.basic.image.ImeGlideConfig");
        }
    }

    @Override // com.bumptech.glide.o.c
    public void a(@NonNull Context context, @NonNull c cVar, @NonNull g gVar) {
        Objects.requireNonNull(this.a);
    }

    @Override // com.bumptech.glide.o.a
    public void b(@NonNull Context context, @NonNull d dVar) {
        this.a.b(context, dVar);
    }

    @Override // com.bumptech.glide.o.a
    public boolean c() {
        Objects.requireNonNull(this.a);
        return false;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public Set<Class<?>> d() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    n.b e() {
        return new a();
    }
}
