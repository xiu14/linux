package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.b;

/* loaded from: classes.dex */
final class d implements b {
    private final Context a;
    final b.a b;

    d(@NonNull Context context, @NonNull b.a aVar) {
        this.a = context.getApplicationContext();
        this.b = aVar;
    }

    @Override // com.bumptech.glide.manager.k
    public void f() {
        q.a(this.a).c(this.b);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
        q.a(this.a).b(this.b);
    }
}
