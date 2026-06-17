package com.bytedance.bdinstall.g0;

/* loaded from: classes.dex */
public abstract class d<Event, Listener> {
    private final Listener a;

    d(Listener listener) {
        this.a = listener;
    }

    Listener b() {
        return this.a;
    }
}
