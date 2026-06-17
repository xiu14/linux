package com.google.gson.internal;

/* loaded from: classes2.dex */
class F extends G {
    F() {
    }

    @Override // com.google.gson.internal.G
    public <T> T b(Class<T> cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
