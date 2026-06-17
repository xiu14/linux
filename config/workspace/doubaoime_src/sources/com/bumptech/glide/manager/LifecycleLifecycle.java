package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements j, LifecycleObserver {

    @NonNull
    private final Set<k> a = new HashSet();

    @NonNull
    private final Lifecycle b;

    LifecycleLifecycle(Lifecycle lifecycle) {
        this.b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.j
    public void a(@NonNull k kVar) {
        this.a.add(kVar);
        if (this.b.getCurrentState() == Lifecycle.State.DESTROYED) {
            kVar.onDestroy();
        } else if (this.b.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            kVar.onStart();
        } else {
            kVar.f();
        }
    }

    @Override // com.bumptech.glide.manager.j
    public void b(@NonNull k kVar) {
        this.a.remove(kVar);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).f();
        }
    }
}
