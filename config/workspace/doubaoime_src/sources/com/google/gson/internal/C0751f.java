package com.google.gson.internal;

import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: com.google.gson.internal.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0751f<T> implements w<T> {
    C0751f() {
    }

    @Override // com.google.gson.internal.w
    public T a() {
        return (T) new ConcurrentSkipListMap();
    }
}
