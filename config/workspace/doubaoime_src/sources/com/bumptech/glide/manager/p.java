package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class p {
    private final Set<com.bumptech.glide.request.e> a = Collections.newSetFromMap(new WeakHashMap());
    private final Set<com.bumptech.glide.request.e> b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f1805c;

    public boolean a(@Nullable com.bumptech.glide.request.e eVar) {
        boolean z = true;
        if (eVar == null) {
            return true;
        }
        boolean remove = this.a.remove(eVar);
        if (!this.b.remove(eVar) && !remove) {
            z = false;
        }
        if (z) {
            eVar.clear();
        }
        return z;
    }

    public void b() {
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            a((com.bumptech.glide.request.e) it2.next());
        }
        this.b.clear();
    }

    public void c() {
        this.f1805c = true;
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            com.bumptech.glide.request.e eVar = (com.bumptech.glide.request.e) it2.next();
            if (eVar.isRunning()) {
                eVar.pause();
                this.b.add(eVar);
            }
        }
    }

    public void d() {
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            com.bumptech.glide.request.e eVar = (com.bumptech.glide.request.e) it2.next();
            if (!eVar.isComplete() && !eVar.d()) {
                eVar.clear();
                if (this.f1805c) {
                    this.b.add(eVar);
                } else {
                    eVar.g();
                }
            }
        }
    }

    public void e() {
        this.f1805c = false;
        Iterator it2 = ((ArrayList) com.bumptech.glide.util.j.e(this.a)).iterator();
        while (it2.hasNext()) {
            com.bumptech.glide.request.e eVar = (com.bumptech.glide.request.e) it2.next();
            if (!eVar.isComplete() && !eVar.isRunning()) {
                eVar.g();
            }
        }
        this.b.clear();
    }

    public void f(@NonNull com.bumptech.glide.request.e eVar) {
        this.a.add(eVar);
        if (!this.f1805c) {
            eVar.g();
            return;
        }
        eVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.b.add(eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.f1805c + "}";
    }
}
