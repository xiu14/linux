package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public class n implements Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    private static final b f1802e = new a();
    private volatile com.bumptech.glide.k a;
    private final b b;

    /* renamed from: c, reason: collision with root package name */
    private final i f1803c;

    /* renamed from: d, reason: collision with root package name */
    private final l f1804d;

    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.n.b
        @NonNull
        public com.bumptech.glide.k a(@NonNull com.bumptech.glide.c cVar, @NonNull j jVar, @NonNull o oVar, @NonNull Context context) {
            return new com.bumptech.glide.k(cVar, jVar, oVar, context);
        }
    }

    public interface b {
        @NonNull
        com.bumptech.glide.k a(@NonNull com.bumptech.glide.c cVar, @NonNull j jVar, @NonNull o oVar, @NonNull Context context);
    }

    public n(@Nullable b bVar) {
        new ArrayMap();
        bVar = bVar == null ? f1802e : bVar;
        this.b = bVar;
        this.f1804d = new l(bVar);
        this.f1803c = (com.bumptech.glide.load.resource.bitmap.r.f1755f && com.bumptech.glide.load.resource.bitmap.r.f1754e) ? new h() : new f();
    }

    @Nullable
    private static Activity a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @NonNull
    public com.bumptech.glide.k b(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.util.j.i() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (com.bumptech.glide.util.j.h()) {
                    return b(fragmentActivity.getApplicationContext());
                }
                if (fragmentActivity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f1803c.a(fragmentActivity);
                Activity a2 = a(fragmentActivity);
                return this.f1804d.a(fragmentActivity, com.bumptech.glide.c.b(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), a2 == null || !a2.isFinishing());
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = this.b.a(com.bumptech.glide.c.b(context.getApplicationContext()), new com.bumptech.glide.manager.a(), new g(), context.getApplicationContext());
                }
            }
        }
        return this.a;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }
}
